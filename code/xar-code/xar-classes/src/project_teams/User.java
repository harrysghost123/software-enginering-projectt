package project_teams;

    class User {
        private String userId;
        private String username;
        private String password;

        public User(String userId, String username, String password) {
            this.userId = userId;
            this.username = username;
            this.password = password;
        }

        // Getters and Setters
        public String getUserId() { return userId; }
        public String getUsername() { return username; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
}
