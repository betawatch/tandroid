package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y31 extends org.telegram.ui.Components.n61 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ z41 e;

    public y31(z41 z41Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = z41Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        z41 z41Var = this.e;
        if (z41Var.o0) {
            return z41Var.j0;
        }
        boolean z10 = this.a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.b) {
            if (i7 == 0) {
                return z41Var.j0;
            }
            i7--;
        }
        return (this.c && i7 == 0) ? z41Var.k0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        if (this.e.o0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
    }
}
