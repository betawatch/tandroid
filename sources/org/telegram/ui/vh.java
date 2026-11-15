package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vh implements org.telegram.ui.Components.xe0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.mi0 b;

    public vh(org.telegram.ui.Components.mi0 mi0Var) {
        this.b = mi0Var;
    }

    @Override // org.telegram.ui.Components.xe0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.mi0 mi0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            mi0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            mi0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
