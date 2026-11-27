package org.webrtc;

import org.webrtc.Camera2Session;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements VideoSink {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Camera1Session) obj).lambda$listenForTextureFrames$0(videoFrame);
                break;
            default:
                ((Camera2Session.CaptureSessionCallback) obj).lambda$onConfigured$0(videoFrame);
                break;
        }
    }
}
