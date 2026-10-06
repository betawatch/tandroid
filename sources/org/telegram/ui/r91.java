package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class r91 extends org.telegram.ui.Components.y81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ta1 e;

    public r91(ta1 ta1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = ta1Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        ta1 ta1Var = this.e;
        if (ta1Var.n0) {
            return ta1Var.i0;
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
                return ta1Var.i0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? ta1Var.j0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        if (this.e.n0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.y81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
    }
}
