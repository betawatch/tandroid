package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ vr(is isVar, int i3) {
        this.a = i3;
        this.b = isVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                is isVar = this.b;
                isVar.A.w0(null);
                org.telegram.ui.Components.nb0 nb0Var = isVar.C;
                if (nb0Var != null) {
                    nb0Var.a();
                    isVar.z.removeView(isVar.C);
                    isVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                break;
        }
    }
}
