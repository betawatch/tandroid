package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class vh implements org.telegram.ui.Components.ue0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.ii0 b;

    public vh(org.telegram.ui.Components.ii0 ii0Var) {
        this.b = ii0Var;
    }

    @Override // org.telegram.ui.Components.ue0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.ii0 ii0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            ii0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            ii0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
