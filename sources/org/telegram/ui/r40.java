package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r40 extends org.telegram.ui.Components.j10 {
    public final /* synthetic */ z40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(z40 z40Var, Context context, int i7) {
        super(context, i7);
        this.r = z40Var;
    }

    @Override // org.telegram.ui.Components.j10
    public final void a(org.telegram.ui.Components.p20 p20Var) {
        super.a(p20Var);
        z40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.j10
    public final void b() {
        super.b();
        z40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.j10
    public final void c(org.telegram.ui.Components.p20 p20Var) {
        z40 z40Var = this.r;
        if (p20Var == z40Var.Y) {
            z40Var.Y = null;
        }
        if (p20Var == z40Var.Z) {
            z40Var.Z = null;
        }
        super.c(p20Var);
        z40.e0(z40Var);
    }
}
