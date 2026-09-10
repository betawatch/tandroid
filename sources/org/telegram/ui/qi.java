package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qi implements org.telegram.ui.Components.dh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.pk0 b;

    public qi(org.telegram.ui.Components.pk0 pk0Var) {
        this.b = pk0Var;
    }

    @Override // org.telegram.ui.Components.dh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.pk0 pk0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            pk0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            pk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
