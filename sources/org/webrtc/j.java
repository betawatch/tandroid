package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
