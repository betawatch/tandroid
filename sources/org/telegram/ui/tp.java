package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq b;
    public final /* synthetic */ long c;

    public /* synthetic */ tp(dq dqVar, long j10, int i10) {
        this.a = i10;
        this.b = dqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                dq dqVar = this.b;
                dqVar.n = j10;
                dqVar.r = true;
                dqVar.n0();
                break;
            default:
                dq.Z(this.b, this.c);
                break;
        }
    }
}
