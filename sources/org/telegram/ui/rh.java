package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ xn c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rh(int i10, xn xnVar, boolean z4) {
        this.b = i10;
        this.c = xnVar;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z4 = this.d;
                this.c.yc(this.b, z4);
                break;
            default:
                int i10 = this.b;
                xn xnVar = this.c;
                if (i10 != 2) {
                    xnVar.U9();
                    xnVar.Yb();
                }
                sh.p0.f(org.telegram.ui.Components.qc.a0(xnVar), i10, this.d);
                break;
        }
    }

    public /* synthetic */ rh(xn xnVar, boolean z4, int i10) {
        this.c = xnVar;
        this.d = z4;
        this.b = i10;
    }
}
