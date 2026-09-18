package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.nm0 b;

    public /* synthetic */ re(org.telegram.ui.Components.nm0 nm0Var, int i10) {
        this.a = i10;
        this.b = nm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.nm0 nm0Var = this.b;
                if (!nm0Var.M) {
                    nm0Var.M = true;
                    nm0Var.c(new org.telegram.ui.Components.lm0(nm0Var, 0), false);
                    nm0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
