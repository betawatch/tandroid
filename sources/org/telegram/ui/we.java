package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ we(tn tnVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = tnVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tn.o0(this.b, this.c, this.d);
                break;
            default:
                tn.k1(this.b, this.c, this.d);
                break;
        }
    }
}
