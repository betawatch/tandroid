package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xh implements org.telegram.ui.Components.ve0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.ji0 b;

    public xh(org.telegram.ui.Components.ji0 ji0Var) {
        this.b = ji0Var;
    }

    @Override // org.telegram.ui.Components.ve0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.ji0 ji0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            ji0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            ji0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
