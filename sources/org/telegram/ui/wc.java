package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wc implements org.telegram.ui.ActionBar.c6 {
    public final /* synthetic */ xc a;

    public wc(xc xcVar) {
        this.a = xcVar;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Paint N(String str) {
        return str.equals("paintDivider") ? this.a.u0 : org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int N0(int i10) {
        xc xcVar = this.a;
        int indexOfKey = xcVar.n0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return xcVar.n0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = xcVar.m0;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final boolean a() {
        return this.a.F;
    }

    @Override // org.telegram.ui.ActionBar.c6
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
            drawable2.setColorFilter(N0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(N0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.c6 c6Var = xcVar.m0;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void m(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int o1(int i10) {
        return N0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int q0(int i10) {
        return N0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ boolean u0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void c1(int i10, int i11) {
    }
}
