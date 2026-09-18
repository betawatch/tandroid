package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a10 b;

    public /* synthetic */ z00(a10 a10Var, int i10) {
        this.a = i10;
        this.b = a10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                a10 a10Var = this.b;
                a10Var.b(a10Var.y);
                break;
        }
    }
}
