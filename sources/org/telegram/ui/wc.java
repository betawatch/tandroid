package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wc implements org.telegram.ui.ActionBar.b6 {
    public final /* synthetic */ xc a;

    public wc(xc xcVar) {
        this.a = xcVar;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.v3;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final int N0(int i9) {
        xc xcVar = this.a;
        int indexOfKey = xcVar.n0.indexOfKey(i9);
        if (indexOfKey >= 0) {
            return xcVar.n0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.b6 b6Var = xcVar.m0;
        return b6Var != null ? b6Var.N0(i9) : org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final Paint O(String str) {
        return str.equals("paintDivider") ? this.a.u0 : org.telegram.ui.ActionBar.f6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final boolean a() {
        return this.a.F;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final Drawable getDrawable(String str) {
        xc xcVar = this.a;
        Drawable drawable = xcVar.t0;
        Drawable drawable2 = xcVar.s0;
        if (str.equals("drawableMsgIn")) {
            return xcVar.o0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return xcVar.p0;
        }
        if (str.equals("drawableMsgOut")) {
            return xcVar.q0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return xcVar.r0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(N0(org.telegram.ui.ActionBar.f6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(N0(org.telegram.ui.ActionBar.f6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.b6 b6Var = xcVar.m0;
        return b6Var != null ? b6Var.getDrawable(str) : org.telegram.ui.ActionBar.f6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void o(float f10, float f11, int i9, int i10) {
        org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final int p0(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final int q1(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void c1(int i9, int i10) {
    }
}
