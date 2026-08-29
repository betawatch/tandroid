package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uc implements org.telegram.ui.ActionBar.c6 {
    public final /* synthetic */ vc a;

    public uc(vc vcVar) {
        this.a = vcVar;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int C0(int i10) {
        vc vcVar = this.a;
        int indexOfKey = vcVar.n0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return vcVar.n0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = vcVar.m0;
        return c6Var != null ? c6Var.C0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Paint G(String str) {
        return str.equals("paintDivider") ? this.a.u0 : org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final boolean a() {
        return this.a.F;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int g1(int i10) {
        return C0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final Drawable getDrawable(String str) {
        vc vcVar = this.a;
        Drawable drawable = vcVar.t0;
        Drawable drawable2 = vcVar.s0;
        if (str.equals("drawableMsgIn")) {
            return vcVar.o0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return vcVar.p0;
        }
        if (str.equals("drawableMsgOut")) {
            return vcVar.q0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return vcVar.r0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(C0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(C0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.c6 c6Var = vcVar.m0;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final int h0(int i10) {
        return C0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void l(float f9, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void L0(int i10, int i11) {
    }
}
