package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class t91 extends org.telegram.ui.Components.x81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ va1 e;

    public t91(va1 va1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = va1Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.x81
    public final View d(int i10) {
        va1 va1Var = this.e;
        if (va1Var.n0) {
            return va1Var.i0;
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
                return va1Var.i0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? va1Var.j0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.x81
    public final int e() {
        if (this.e.n0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.x81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.x81
    public final void b(View view, int i10, int i11) {
    }
}
