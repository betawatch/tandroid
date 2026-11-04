package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip b;
    public final /* synthetic */ long c;

    public /* synthetic */ zo(ip ipVar, long j10, int i3) {
        this.a = i3;
        this.b = ipVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                ip ipVar = this.b;
                ipVar.n = j10;
                ipVar.r = true;
                ipVar.s0();
                break;
            default:
                ip.e0(this.b, this.c);
                break;
        }
    }
}
