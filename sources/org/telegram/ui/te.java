package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
