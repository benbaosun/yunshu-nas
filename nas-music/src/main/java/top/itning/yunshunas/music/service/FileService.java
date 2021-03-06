package top.itning.yunshunas.music.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author itning
 * @date 2020/9/5 12:29
 */
public interface FileService {
    /**
     * 获取音乐
     *
     * @param id       音乐ID
     * @param range    请求头Range
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws Exception 失败
     */
    void getOneMusic(String id, String range, HttpServletRequest request, HttpServletResponse response) throws Exception;

    /**
     * 获取歌词
     *
     * @param id 歌词ID
     * @return 歌词
     * @throws IOException 失败
     */
    String getLyric(String id) throws IOException;
}
