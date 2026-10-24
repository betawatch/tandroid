package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((EglRenderer) this.b).renderFrameOnRenderThread();
                break;
            case 1:
                ((VideoFrame.I420Buffer) this.b).release();
                break;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.b).lambda$onFirstFrameRendered$0();
                break;
            default:
                ((VideoFileRenderer) this.b).lambda$release$3();
                break;
        }
    }
}
