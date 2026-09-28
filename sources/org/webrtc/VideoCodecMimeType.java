package org.webrtc;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
enum VideoCodecMimeType {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264(MediaController.VIDEO_MIME_TYPE),
    AV1("video/av01"),
    H265("video/hevc");

    private final String mimeType;

    VideoCodecMimeType(String str) {
        this.mimeType = str;
    }

    public String mimeType() {
        return this.mimeType;
    }
}
