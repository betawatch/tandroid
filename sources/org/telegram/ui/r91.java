package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class r91 extends org.telegram.ui.Components.z71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ ra1 e;

    public r91(ra1 ra1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = ra1Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.z71
    public final View d(int i10) {
        ra1 ra1Var = this.e;
        if (ra1Var.l0) {
            return ra1Var.j0;
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
                return ra1Var.j0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? ra1Var.k0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.z71
    public final int e() {
        if (this.e.l0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.z71
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.z71
    public final void b(View view, int i10, int i11) {
    }
}
