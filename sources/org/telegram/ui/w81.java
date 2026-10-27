package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w81 extends org.telegram.ui.Components.n91 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ y91 e;

    public w81(y91 y91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = y91Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        y91 y91Var = this.e;
        if (y91Var.n0) {
            return y91Var.i0;
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
                return y91Var.i0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? y91Var.j0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        if (this.e.n0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
    }
}
