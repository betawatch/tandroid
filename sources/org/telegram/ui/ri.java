package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ri implements org.telegram.ui.Components.xf0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.nj0 b;

    public ri(org.telegram.ui.Components.nj0 nj0Var) {
        this.b = nj0Var;
    }

    @Override // org.telegram.ui.Components.xf0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.nj0 nj0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            nj0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            nj0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
