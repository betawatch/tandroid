package org.webrtc;

import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((TextureBufferImpl) obj2).lambda$new$0((TextureBufferImpl.RefCountMonitor) obj);
                break;
            default:
                ((VideoSource.1) obj2).lambda$onFrameCaptured$2((VideoFrame) obj);
                break;
        }
    }
}
