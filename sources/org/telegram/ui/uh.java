package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
