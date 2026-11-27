package org.webrtc;

import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
