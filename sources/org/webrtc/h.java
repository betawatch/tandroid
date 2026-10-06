package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
