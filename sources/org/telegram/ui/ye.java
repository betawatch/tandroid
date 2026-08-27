package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ye(rn rnVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = rnVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rn.o0(this.b, this.c, this.d);
                break;
            default:
                rn.k1(this.b, this.c, this.d);
                break;
        }
    }
}
