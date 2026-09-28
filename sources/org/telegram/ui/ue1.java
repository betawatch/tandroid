package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf1 b;

    public /* synthetic */ ue1(wf1 wf1Var, int i10) {
        this.a = i10;
        this.b = wf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wf1 wf1Var = this.b;
                wf1Var.x0();
                wf1Var.B0();
                break;
            case 1:
                this.b.x0();
                break;
            case 2:
                this.b.O0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                wf1 wf1Var2 = this.b;
                wf1Var2.A0 = null;
                wf1Var2.U0(true, false);
                break;
            default:
                wf1 wf1Var3 = this.b;
                wf1Var3.N.postOnAnimation(new ue1(wf1Var3, 1));
                break;
        }
    }
}
