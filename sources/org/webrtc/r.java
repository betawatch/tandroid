package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((TextureBufferImpl) this.b).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.c);
                break;
            case 1:
                ((EglRenderer) this.b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.c);
                break;
            case 2:
                ((EglRenderer) this.b).lambda$release$1((CountDownLatch) this.c);
                break;
            case 3:
                ((EglRenderer) this.b).lambda$release$2((Looper) this.c);
                break;
            case 4:
                ((VideoFileRenderer) this.b).lambda$onFrame$0((VideoFrame) this.c);
                break;
            case 5:
                ((VideoFileRenderer) this.b).lambda$release$2((CountDownLatch) this.c);
                break;
            default:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                break;
        }
    }
}
