package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yc implements org.telegram.ui.ActionBar.p6 {
    public final /* synthetic */ zc a;

    public yc(zc zcVar) {
        this.a = zcVar;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.t6.v3;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Paint d(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.t6.V0(str);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean e() {
        return org.telegram.messenger.tz.H0;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int f(int i10) {
        return h(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Drawable getDrawable(String str) {
        zc zcVar = this.a;
        Drawable drawable = zcVar.x0;
        Drawable drawable2 = zcVar.w0;
        if (str.equals("drawableMsgIn")) {
            return zcVar.s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return zcVar.t0;
        }
        if (str.equals("drawableMsgOut")) {
            return zcVar.u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return zcVar.v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(org.telegram.ui.ActionBar.t6.zb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(org.telegram.ui.ActionBar.t6.zb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.p6 p6Var = zcVar.q0;
        return p6Var != null ? p6Var.getDrawable(str) : org.telegram.ui.ActionBar.t6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int h(int i10) {
        zc zcVar = this.a;
        int indexOfKey = zcVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return zcVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.p6 p6Var = zcVar.q0;
        return p6Var != null ? p6Var.h(i10) : org.telegram.ui.ActionBar.t6.v0(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int j(int i10) {
        return h(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void i(int i10, int i11) {
    }
}
