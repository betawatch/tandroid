package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ j(int i10, ByteBuffer byteBuffer) {
        this.a = i10;
        this.b = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                JniCommon.nativeFreeByteBuffer(this.b);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(this.b);
                break;
        }
    }
}
