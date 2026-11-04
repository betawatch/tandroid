package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i3) {
        this.a = i3;
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
