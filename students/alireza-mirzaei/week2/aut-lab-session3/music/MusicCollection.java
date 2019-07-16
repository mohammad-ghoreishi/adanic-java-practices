import java.util.ArrayList;
    /**
     * A class to hold details of audio files.
     *
     * @author David J. Barnes and Michael Kölling
     * @version 2011.07.31
     */
    public class MusicCollection {
        // An ArrayList for storing the file names of music files.
        private ArrayList<String> files;
        // A player for the music files.
        private MusicPlayer player;

        /**
         * Create a MusicCollectionA
         */
        public MusicCollection() {
            files = new ArrayList<>();
            player = new MusicPlayer();
        }


        /**
         * Provide basic playing of MP3 files via the javazoom library.
         * See http://www.javazoom.net/
         *
         * @author David J. Barnes and Michael Kölling.
         * @version 2011.07.31
         */
        public class MusicPlayer {
            // The current player. It might be null.
            private boolean isPlaying;

            /**
             * Constructor for objects of class MusicFilePlayer
             */
            public MusicPlayer() {
                isPlaying = false;
            }


            /**
             * Start playing the given audio file.
             * The method returns once the playing has been started.
             *
             * @param filename The file to be played.
             */
            public void startPlaying(String filename) {
                System.out.println(filename + " is playing...");
                isPlaying = true;
            }

            public void stop() {
                System.out.println("player is stopped!");
                isPlaying = false;
            }


        }

        /**
         * Add a file to the collection.
         *
         * @param filename The file to be added.
         */
        public void addFile(String filename) {
            files.add(filename);
        }

        /**
         * Return the number of files in the collection.
         *
         * @return The number of files in the collection.
         */
        public int getNumberOfFiles()
        {
            return files.size();
        }

        /**
         * List a file from the collection.
         *
         * @param index The index of the file to be listed.
         */
        public void listFile(int index)
        {
            if (index >= 0 && index < files.size()) {
                String filename = files.get(index);
                System.out.println(filename);
            }
        }

        /**
         * Show a list of all the files in the collection.
         */
        public void listAllFiles()
        {
            for(String filename : files) {
                System.out.println(filename);
            }
        }


        /**
         * Remove a file from the collection.
         *
         * @param index The index of the file to be removed.
         */
        public void removeFile(int index)
        {
            if(index >= 0 && index < files.size()) {
                files.remove(index);
            }
        }

        /**
         * Start playing a file in the collection.
         * Use stopPlaying() to stop it playing.
         *
         * @param index The index of the file to be played.
         */
        public void startPlaying(int index)
        {
            if(validIndex(index)) {
                String filename = files.get(index);
                player.startPlaying(filename);
            }
        }


        /**
         * Stop the player.
         */
        public void stopPlaying()
        {
            player.stop();
        }


        /**
         * Determine whether the given index is valid for the collection.
         * Print an error message if it is not.
         *
         * @param index The index to be checked.
         * @return true if the index is valid, false otherwise.
         */
        private boolean validIndex(int index) {
            // The return value.
            // Set according to whether the index is valid or not.
            boolean valid;

            if(index < 0) {
                System.out.println("Index cannot be negative: " + index);
                valid = false;
            }
            else if(index >= files.size()) {
                System.out.println("Index is too large: " + index);
                valid = false;
            }
            else {
                valid = true;
            }
            return valid;
        }
    }