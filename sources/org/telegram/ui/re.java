package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.hm0 b;

    public /* synthetic */ re(org.telegram.ui.Components.hm0 hm0Var, int i10) {
        this.a = i10;
        this.b = hm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.hm0 hm0Var = this.b;
                if (!hm0Var.J) {
                    hm0Var.J = true;
                    hm0Var.c(new org.telegram.ui.Components.fm0(hm0Var, 0), false);
                    hm0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
