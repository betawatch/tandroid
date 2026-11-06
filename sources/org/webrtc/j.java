package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ j(int i7, ByteBuffer byteBuffer) {
        this.a = i7;
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
