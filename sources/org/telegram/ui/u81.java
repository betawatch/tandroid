package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class u81 extends org.telegram.ui.Components.d91 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ u91 e;

    public u81(u91 u91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = u91Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        u91 u91Var = this.e;
        if (u91Var.l0) {
            return u91Var.j0;
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
                return u91Var.j0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? u91Var.k0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        if (this.e.l0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
    }
}
