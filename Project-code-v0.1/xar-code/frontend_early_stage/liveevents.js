document.addEventListener('DOMContentLoaded', () => {
    const eventList = document.getElementById('eventList');
    const keywordsInput = document.getElementById('keywords');
    const categoryFilter = document.getElementById('categoryFilter');
    const dateFilter = document.getElementById('dateFilter');
    const applyFiltersButton = document.getElementById('applyFilters');

    async function fetchEvents(filters = {}) {
        eventList.innerHTML = '<p>Loading events...</p>'; 

        const queryParams = new URLSearchParams(filters).toString();
        
        const apiUrl = `/api/events?${queryParams}`; 

        try {
            const response = await fetch(apiUrl);
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            const events = await response.json();
            displayEvents(events);
        } catch (error) {
            console.error("Error fetching events:", error);
            eventList.innerHTML = '<p>Failed to load events. Please try again later.</p>';
        }
    }

    function displayEvents(events) {
        eventList.innerHTML = ''; // katharise proigoumena events

        if (events.length === 0) {
            eventList.innerHTML = '<p>No events found matching your criteria.</p>';
            return;
        }

        events.forEach(event => {
            const eventItem = document.createElement('div');
            eventItem.classList.add('event-item');
            eventItem.innerHTML = `
                <h3>${event.title}</h3>
                <div class="event-meta">
                    ${event.time} - ${event.date}
                </div>
                <p>${event.description}</p>
                <div class="event-actions">
                    <a href="#">Σχολιάστε το άρθρο</a>
                    <a href="#">Διαβάστε περισσότερα»</a>
                </div>
            `;
            eventList.appendChild(eventItem);
        });
    }

    // gia an mpoun filters filters
    applyFiltersButton.addEventListener('click', () => {
        const filters = {
            keywords: keywordsInput.value,
            category: categoryFilter.value,
            date: dateFilter.value 
        };
        // katharizei kena filterafilters
        for (const key in filters) {
            if (!filters[key]) {
                delete filters[key];
            }
        }
        fetchEvents(filters);
    });

    // gia na kani load ta evewnts otan fortoni
    fetchEvents();

    // tab leitourgia
    document.querySelectorAll('.tab-button').forEach(button => {
        button.addEventListener('click', (e) => {
            document.querySelectorAll('.tab-button').forEach(btn => btn.classList.remove('active'));
            e.target.classList.add('active');
            //allazi se events
            if (e.target.dataset.category === 'EVENTS') {
                document.querySelector('.content h2').textContent = 'UNISTUDENT EVENTS';
                document.querySelector('.filter-section').style.display = 'flex'; // dikse filtra gia events
                fetchEvents(); //  ganafortoseta events gia to event tab
            } else {
                document.querySelector('.content h2').textContent = 'UNISTUDENT ' + e.target.dataset.category;
                document.querySelector('.filter-section').style.display = 'none'; // kripse ta filtra gia ta ipolipa tabs
                eventList.innerHTML = `<p>Content for ${e.target.dataset.category} will be loaded here.</p>`;
            }
        });
    });

    // event tab na fenettai em to pou fortoni 
    const eventsTab = document.querySelector('.tab-button[data-category="EVENTS"]');
    if (eventsTab) {
        eventsTab.classList.add('active');
        document.querySelector('.content h2').textContent = 'UNISTUDENT EVENTS';
        document.querySelector('.filter-section').style.display = 'flex';
    }
});