package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.zm0 b;

    public /* synthetic */ qe(org.telegram.ui.Components.zm0 zm0Var, int i10) {
        this.a = i10;
        this.b = zm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.zm0 zm0Var = this.b;
                if (!zm0Var.M) {
                    zm0Var.M = true;
                    zm0Var.c(new org.telegram.ui.Components.xm0(zm0Var, 0), false);
                    zm0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
