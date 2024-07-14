package com.example.spotifywebview;

import android.webkit.PermissionRequest;

public class WebChromeClient extends android.webkit.WebChromeClient{
    @Override
    public void onPermissionRequest(PermissionRequest request) {

        //implementation for handling permission requests
        if (request != null){
            String[] resources = request.getResources();
            if(resources != null ){
                for (String resource : resources){
                    if (PermissionRequest.RESOURCE_PROTECTED_MEDIA_ID.equals(resource)){
                        request.grant(resources);
                        return;
                    }
                }
            }
        }
    }
}
