package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ri implements org.telegram.ui.Components.xf0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.mj0 b;

    public ri(org.telegram.ui.Components.mj0 mj0Var) {
        this.b = mj0Var;
    }

    @Override // org.telegram.ui.Components.xf0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.mj0 mj0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            mj0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            mj0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
