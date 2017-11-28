package httpwrapper.user.http_wrapper.HttpRequests.ResponseMapper;

import httpwrapper.user.http_wrapper.HttpRequests.MappedObjects.MappedObject;

/**
 * Created by user on 28.11.2017.
 */

public interface ResponseMapper {


    <T extends MappedObject> T map(String json, Class<T> type);

}
