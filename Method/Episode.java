package Method;

public class Episode
{
    int episodeId;
    String episodeTitle;
    int episodeDuration;

    void addEpisode(int episodeId,String episodeTitle,int episodeDuration){
        System.out.println( episodeId +"\t"+ episodeTitle+"\t"+episodeDuration);
    }
}
