package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r51 extends org.telegram.ui.Components.p71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ s61 e;

    public r51(s61 s61Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = s61Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.p71
    public final View d(int i10) {
        s61 s61Var = this.e;
        if (s61Var.n0) {
            return s61Var.i0;
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
                return s61Var.i0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? s61Var.j0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.p71
    public final int e() {
        if (this.e.n0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.p71
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.p71
    public final void b(View view, int i10, int i11) {
    }
}
