package org.webrtc;

import org.webrtc.Camera2Session;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements VideoSink {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.a) {
            case 0:
                ((Camera1Session) this.b).lambda$listenForTextureFrames$0(videoFrame);
                break;
            case 1:
                ((Camera2Session.CaptureSessionCallback) this.b).lambda$onConfigured$0(videoFrame);
                break;
            default:
                ((VideoSource) this.b).lambda$setVideoProcessor$1(videoFrame);
                break;
        }
    }

    @Override // org.webrtc.VideoSink
    public final /* synthetic */ void setParentSink(VideoSink videoSink) {
        int i10 = this.a;
        e0.a(this, videoSink);
    }
}
