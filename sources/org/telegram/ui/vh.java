package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class vh implements org.telegram.ui.Components.jf0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.xi0 b;

    public vh(org.telegram.ui.Components.xi0 xi0Var) {
        this.b = xi0Var;
    }

    @Override // org.telegram.ui.Components.jf0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.xi0 xi0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            xi0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            xi0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
