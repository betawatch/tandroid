package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
