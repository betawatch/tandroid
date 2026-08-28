package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s81 extends org.telegram.ui.Components.e71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ s91 e;

    public s81(s91 s91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = s91Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        s91 s91Var = this.e;
        if (s91Var.h0) {
            return s91Var.f0;
        }
        boolean z10 = this.a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i9 == 0) {
                return frameLayout;
            }
            i9--;
        }
        if (this.b) {
            if (i9 == 0) {
                return s91Var.f0;
            }
            i9--;
        }
        return (this.c && i9 == 0) ? s91Var.g0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        if (this.e.h0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        return i9;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
    }
}
