package qh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p4 implements org.telegram.ui.ActionBar.g6 {
    public PorterDuffColorFilter a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 b;

    public p4(org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = g6Var;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int B0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.k6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Ne || i10 == org.telegram.ui.ActionBar.k6.Re || i10 == org.telegram.ui.ActionBar.k6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.k6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Fh || i10 == org.telegram.ui.ActionBar.k6.Eh || i10 == org.telegram.ui.ActionBar.k6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Hh) {
            return 352321535;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Ie) {
            return 780633991;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.a7) {
            return -15921907;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        return g6Var != null ? g6Var.B0(i10) : org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Paint F(String str) {
        return this.b.F(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int Z0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int e0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final ColorFilter w() {
        if (this.a == null) {
            this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void J0(int i10, int i11) {
    }
}
