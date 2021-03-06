package Entity;


public class Author {
    private String authNumber
            , authFirstName
            , authLastName;

    private Author (Builder builder) {
        this.authNumber = builder.authNumber;
        this.authFirstName = builder.authFirstName;
        this.authLastName = builder.authLastName;
    }

    public String getAuthNumber() {
        return authNumber;
    }

    public String getAuthFirstName() {
        return authFirstName;
    }

    public String getAuthLastName() {
        return authLastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authNumber='" + authNumber + '\'' +
                ", authfirstName='" + authFirstName + '\'' +
                ", authlastName='" + authLastName + '\'' +
                '}';
    }

    public static class Builder {
        private String authNumber
                , authFirstName
                , authLastName;

        public Builder setAuthNumber(String authNumber) {
            this.authNumber = authNumber;
            return this;
        }

        public Builder setAuthFirstName(String authFirstName) {
            this.authFirstName = authFirstName;
            return this;
        }

        public Builder setAuthLastName(String authLastName) {
            this.authLastName = authLastName;
            return this;
        }

        public Author Build(){
            return new Author(this);
        }
    }
}
