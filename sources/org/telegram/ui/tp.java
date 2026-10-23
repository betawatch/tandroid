package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                dqVar.r = j10;
                dqVar.s = true;
                dqVar.n0();
                break;
            default:
                dq.Z(this.b, this.c);
                break;
        }
    }
}
