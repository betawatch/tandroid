package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
