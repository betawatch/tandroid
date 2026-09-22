package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class zc implements org.telegram.ui.ActionBar.e6 {
    public final /* synthetic */ ad a;

    public zc(ad adVar) {
        this.a = adVar;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint G(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int G0(int i10) {
        ad adVar = this.a;
        int indexOfKey = adVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return adVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = adVar.q0;
        return e6Var != null ? e6Var.G0(i10) : org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Drawable getDrawable(String str) {
        ad adVar = this.a;
        Drawable drawable = adVar.x0;
        Drawable drawable2 = adVar.w0;
        if (str.equals("drawableMsgIn")) {
            return adVar.s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return adVar.t0;
        }
        if (str.equals("drawableMsgOut")) {
            return adVar.u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return adVar.v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(G0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(G0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.e6 e6Var = adVar.q0;
        return e6Var != null ? e6Var.getDrawable(str) : org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void L0(int i10, int i11) {
    }
}
