// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vh1 implements vnb {
    public final /* synthetic */ wh1 a;

    public vh1(wh1 wh1Var) {
        this.a = wh1Var;
    }

    @Override // vnb
    public final boolean a() {
        return this.a.K;
    }

    @Override // vnb
    public final void b(float f, float f2, int i, int i2) {
        aob.q(f, f2, i, i2);
    }

    @Override // vnb
    public final ColorFilter c() {
        return aob.v3;
    }

    @Override // vnb
    public final Paint d(String str) {
        return str.equals("paintDivider") ? this.a.z0 : aob.T0(str);
    }

    @Override // vnb
    public final boolean e() {
        return xea.D0;
    }

    @Override // vnb
    public final int f(int i) {
        return h(i);
    }

    @Override // vnb
    public final boolean g() {
        return false;
    }

    @Override // vnb
    public final Drawable getDrawable(String str) {
        wh1 wh1Var = this.a;
        Drawable drawable = wh1Var.y0;
        Drawable drawable2 = wh1Var.x0;
        if (str.equals("drawableMsgIn")) {
            return wh1Var.t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return wh1Var.u0;
        }
        if (str.equals("drawableMsgOut")) {
            return wh1Var.v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return wh1Var.w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(aob.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(aob.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        vnb vnbVar = wh1Var.r0;
        return vnbVar != null ? vnbVar.getDrawable(str) : aob.P0(str);
    }

    @Override // vnb
    public final int h(int i) {
        wh1 wh1Var = this.a;
        SparseIntArray sparseIntArray = wh1Var.s0;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        vnb vnbVar = wh1Var.r0;
        return vnbVar != null ? vnbVar.h(i) : aob.w0(null, i, false);
    }

    @Override // vnb
    public final int j(int i) {
        return h(i);
    }

    @Override // vnb
    public final void i(int i, int i2) {
    }
}
