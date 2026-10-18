package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class r81 extends org.telegram.ui.Components.u81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ r91 e;

    public r81(r91 r91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = r91Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        r91 r91Var = this.e;
        if (r91Var.l0) {
            return r91Var.j0;
        }
        boolean z10 = this.a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.b) {
            if (i10 == 0) {
                return r91Var.j0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? r91Var.k0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        if (this.e.l0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.u81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
    }
}
