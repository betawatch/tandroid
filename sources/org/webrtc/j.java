package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
