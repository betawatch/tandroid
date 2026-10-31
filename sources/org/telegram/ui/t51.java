package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t51 extends org.telegram.ui.Components.o71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ u61 e;

    public t51(u61 u61Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = u61Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        u61 u61Var = this.e;
        if (u61Var.n0) {
            return u61Var.i0;
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
                return u61Var.i0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? u61Var.j0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        if (this.e.n0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.o71
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
    }
}
