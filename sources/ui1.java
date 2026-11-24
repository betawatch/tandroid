// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ui1 implements ylb {
    public final /* synthetic */ vi1 a;

    public ui1(vi1 vi1Var) {
        this.a = vi1Var;
    }

    @Override // ylb
    public final boolean a() {
        return this.a.K;
    }

    @Override // ylb
    public final void b(float f, float f2, int i, int i2) {
        cmb.q(f, f2, i, i2);
    }

    @Override // ylb
    public final ColorFilter c() {
        return cmb.u3;
    }

    @Override // ylb
    public final Paint d(String str) {
        return str.equals("paintDivider") ? this.a.z0 : cmb.T0(str);
    }

    @Override // ylb
    public final boolean e() {
        return gda.D0;
    }

    @Override // ylb
    public final int f(int i) {
        return h(i);
    }

    @Override // ylb
    public final boolean g() {
        return false;
    }

    @Override // ylb
    public final Drawable getDrawable(String str) {
        vi1 vi1Var = this.a;
        Drawable drawable = vi1Var.y0;
        Drawable drawable2 = vi1Var.x0;
        if (str.equals("drawableMsgIn")) {
            return vi1Var.t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return vi1Var.u0;
        }
        if (str.equals("drawableMsgOut")) {
            return vi1Var.v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return vi1Var.w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(cmb.Bb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(cmb.Bb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        ylb ylbVar = vi1Var.r0;
        return ylbVar != null ? ylbVar.getDrawable(str) : cmb.P0(str);
    }

    @Override // ylb
    public final int h(int i) {
        vi1 vi1Var = this.a;
        SparseIntArray sparseIntArray = vi1Var.s0;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        ylb ylbVar = vi1Var.r0;
        return ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false);
    }

    @Override // ylb
    public final int j(int i) {
        return h(i);
    }

    @Override // ylb
    public final void i(int i, int i2) {
    }
}
