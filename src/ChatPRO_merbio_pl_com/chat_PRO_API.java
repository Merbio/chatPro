package ChatPRO_merbio_pl_com;

public final class chat_PRO_API {
    /*
    *   If you wanna to blockade chate you must only use 
    *   magic function zbloczChata(),
    *   and all yourse SPAM with players gonna away...
    *
    *   @param - brak, tak magic, ze wszystko robi sie jedna funkcja
    */
    public static void zbloczChata() {
        chat_PRO.Chat__WLACZONY = false;
    } 
    
    /*
    *   If you wanna to see what yours favourite worms writed on chatPro chat 
    *   just use madzik function odblokujChata(),
    *   and you can see wypociny twoich favourite 'players'
    *
    *   @param - brak, to co wyzej... @up11linijek
    */
    public static void odblokujChata() {
        chat_PRO.Chat__WLACZONY = true;
    } 
}
