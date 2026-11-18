package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class uh implements org.telegram.ui.Components.hf0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.vi0 b;

    public uh(org.telegram.ui.Components.vi0 vi0Var) {
        this.b = vi0Var;
    }

    @Override // org.telegram.ui.Components.hf0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.vi0 vi0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            vi0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            vi0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
