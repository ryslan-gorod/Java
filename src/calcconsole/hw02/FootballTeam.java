package calcconsole.hw02;

import java.util.Arrays;
import java.util.Date;

public class FootballTeam {
    private String name;
    private String coach;
    private Player[] player;
    private String placeOfGame;

    public void play(String city, String stadium) {

        class Place {
            public Place(String city, String stadium) {
                this.city = city;
                this.stadium = stadium;
            }

            private String city;
            private String stadium;

            public String getCity() {
                return city;
            }

            public String getStadium() {
                return stadium;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public void setStadium(String stadium) {
                this.stadium = stadium;
            }
            public String getLocalAndDate(){
                return city + " " + stadium + " " + new Date().toString();
            }
        }
        Place place = new Place(city,stadium);
        placeOfGame = place.getLocalAndDate();
    }

    public String getName() {
        return name;
    }

    public String getCoach() {
        return coach;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

    public String getPlaceOfGame() {
        return placeOfGame;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", coach='" + coach + '\'' +
                ", player=" + Arrays.toString(player) +
                '}';
    }

    public class Player {
        private String fistName;
        private String lastName;
        private int number;

        public String getFistName() {
            return fistName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getNumber() {
            return number;
        }

        public void setFistName(String fistName) {
            this.fistName = fistName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "fistName='" + fistName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", number=" + number +
                    '}';
        }

    }

    public static class Federation {
        private String name;
        private String country;

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "Federation{" +
                    "name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }
}
