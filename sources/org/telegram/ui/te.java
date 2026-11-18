package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ te(bn bnVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bn.p0(this.b, this.c, this.d);
                break;
            default:
                bn.G1(this.b, this.c, this.d);
                break;
        }
    }
}
