package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class si implements org.telegram.ui.Components.uh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.gl0 b;

    public si(org.telegram.ui.Components.gl0 gl0Var) {
        this.b = gl0Var;
    }

    @Override // org.telegram.ui.Components.uh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.gl0 gl0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            gl0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            gl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
