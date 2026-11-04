package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rh implements org.telegram.ui.Components.we0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.li0 b;

    public rh(org.telegram.ui.Components.li0 li0Var) {
        this.b = li0Var;
    }

    @Override // org.telegram.ui.Components.we0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.li0 li0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            li0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            li0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
