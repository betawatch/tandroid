package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r40 extends org.telegram.ui.Components.v00 {
    public final /* synthetic */ z40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(z40 z40Var, Context context, int i7) {
        super(context, i7);
        this.r = z40Var;
    }

    @Override // org.telegram.ui.Components.v00
    public final void a(org.telegram.ui.Components.c20 c20Var) {
        super.a(c20Var);
        z40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.v00
    public final void b() {
        super.b();
        z40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.v00
    public final void c(org.telegram.ui.Components.c20 c20Var) {
        z40 z40Var = this.r;
        if (c20Var == z40Var.X) {
            z40Var.X = null;
        }
        if (c20Var == z40Var.Y) {
            z40Var.Y = null;
        }
        super.c(c20Var);
        z40.e0(z40Var);
    }
}
