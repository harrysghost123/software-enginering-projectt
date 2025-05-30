document.addEventListener('DOMContentLoaded', () => {
    const eventList = document.getElementById('eventList');
    const keywordsInput = document.getElementById('keywords');
    const categoryFilter = document.getElementById('categoryFilter');
    const dateFilter = document.getElementById('dateFilter');
    const applyFiltersButton = document.getElementById('applyFilters');

    // Hamburger  elements
    const menuIcon = document.getElementById('menuIcon');
    const sideMenu = document.getElementById('sideMenu');
    const overlay = document.getElementById('overlay');
    const body = document.body;

    //  to open the side menu
    function openSideMenu() {
        sideMenu.style.width = '250px'; 
        overlay.style.width = '100%';
        body.classList.add('menu-open');
    }

    //  to close the side menu
    function closeSideMenu() {
        sideMenu.style.width = '0';
        overlay.style.width = '0';
        body.classList.remove('menu-open');
    }

    //  for menu icon click
    menuIcon.addEventListener('click', openSideMenu);

    //  to close menu
    overlay.addEventListener('click', closeSideMenu);

    // Close menu if a  item is clicked 
    document.querySelectorAll('.side-menu .menu-item').forEach(item => {
        item.addEventListener('click', closeSideMenu);
    });

      // for loading the livents to our app with api
    async function fetchEvents(filters = {}) {
        eventList.innerHTML = '<p>Loading events...</p>'; 

        const queryParams = new URLSearchParams(filters).toString();
        
        const apiUrl = `?${queryParams}`; 

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
     

    // gia an mpoun filters filters
    applyFiltersButton.addEventListener('click', () => {
        const filters = {
            keywords: keywordsInput.value,
            category: categoryFilter.value,
            date: dateFilter.value 
        };
        // καθαρίζει κενά φίλτρα
        for (const key in filters) {
            if (!filters[key]) {
                delete filters[key];
            }
        }
        fetchEvents(filters);
    });

    // gia na kani load ta events otan φορτώνει
    fetchEvents();

    // tab λειτουργία
    document.querySelectorAll('.tab-button').forEach(button => {
        button.addEventListener('click', (e) => {
            document.querySelectorAll('.tab-button').forEach(btn => btn.classList.remove('active'));
            e.target.classList.add('active');
            // αλλάζει σε events
            if (e.target.dataset.category === 'EVENTS') {
                document.querySelector('.content h2').textContent = 'UNISTUDENT EVENTS';
                document.querySelector('.filter-section').style.display = 'flex'; // δείξε φίλτρα για events
                fetchEvents(); // ξαναφόρτωσε τα events για το event tab
            } else {
                document.querySelector('.content h2').textContent = 'UNISTUDENT ' + e.target.dataset.category;
                document.querySelector('.filter-section').style.display = 'none'; // κρύψε τα φίλτρα για τα υπόλοιπα tabs
                eventList.innerHTML = `<p>Content for ${e.target.dataset.category} will be loaded here.</p>`;
            }
        });
    });

    // event tab να φαίνεται όταν φορτώνει 
    const eventsTab = document.querySelector('.tab-button[data-category="EVENTS"]');
    if (eventsTab) {
        eventsTab.classList.add('active');
        document.querySelector('.content h2').textContent = 'UNISTUDENT EVENTS';
        document.querySelector('.filter-section').style.display = 'flex';
    }
});