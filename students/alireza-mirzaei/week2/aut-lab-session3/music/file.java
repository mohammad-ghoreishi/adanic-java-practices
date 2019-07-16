public class file {

    public static void main(String[] args) {

        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        pop.addFile("Lost on you");
        pop.addFile("Dream catcher");
        pop.addFile("On night in the sun");
        pop.addFile("Recovery");

        jazz.addFile("Girls go wild");
        jazz.addFile("Dreamer");
        jazz.addFile("The Power");


        rock.addFile("When im over you");
        rock.addFile("Die For Your Love");

        country.addFile("Forever for now");


        System.out.println(pop.getNumberOfFiles());
        System.out.println(jazz.getNumberOfFiles());
        System.out.println(rock.getNumberOfFiles());
        System.out.println(country.getNumberOfFiles());

       pop.startPlaying(2);
       rock.startPlaying(1);


       pop.removeFile(1);

       pop.stopPlaying();

       pop.listAllFiles();

       pop.listFile(1);



    }


}