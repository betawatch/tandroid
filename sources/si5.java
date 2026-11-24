// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class si5 implements wjb {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public si5(wjb wjbVar) {
        this.a = (byte) 2;
        this.b = new SparseIntArray();
        this.c = wjbVar;
        k();
    }

    @Override // wjb
    public final boolean a() {
        switch (this.a) {
            case 0:
            default:
                return bkb.I.o();
            case 1:
                return true;
        }
    }

    @Override // wjb
    public final void b(float f, float f2, int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                bkb.q(f, f2, i, i2);
                break;
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar != null) {
                    wjbVar.b(f, f2, i, i2);
                    break;
                } else {
                    bkb.q(f, f2, i, i2);
                    break;
                }
        }
    }

    @Override // wjb
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                return bkb.u3;
            case 1:
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) this.b;
                if (porterDuffColorFilter != null) {
                    return porterDuffColorFilter;
                }
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.b = porterDuffColorFilter2;
                return porterDuffColorFilter2;
            default:
                wjb wjbVar = (wjb) this.c;
                return wjbVar == null ? bkb.u3 : wjbVar.c();
        }
    }

    @Override // wjb
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return bkb.T0(str);
            case 1:
                return ((f53) this.c).d(str);
            default:
                wjb wjbVar = (wjb) this.c;
                return wjbVar == null ? bkb.T0(str) : wjbVar.d(str);
        }
    }

    @Override // wjb
    public final boolean e() {
        byte b = this.a;
        return gba.D0;
    }

    @Override // wjb
    public final int f(int i) {
        switch (this.a) {
            case 0:
            case 1:
                return h(i);
            default:
                wjb wjbVar = (wjb) this.c;
                return wjbVar == null ? bkb.w0(null, i, false) : wjbVar.f(i);
        }
    }

    @Override // wjb
    public final boolean g() {
        switch (this.a) {
            case 0:
            case 1:
                return false;
            default:
                wjb wjbVar = (wjb) this.c;
                return wjbVar == null ? bkb.b1() : wjbVar.g();
        }
    }

    @Override // wjb
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
            case 1:
                return null;
            default:
                wjb wjbVar = (wjb) this.c;
                return wjbVar == null ? bkb.P0(str) : wjbVar.getDrawable(str);
        }
    }

    @Override // wjb
    public final int h(int i) {
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : bkb.u0(i);
            case 1:
                if (i == bkb.F8) {
                    return -14145495;
                }
                if (i != bkb.D8) {
                    if (i == bkb.g5) {
                        return -14737633;
                    }
                    if (i == bkb.i5) {
                        return -592138;
                    }
                    if (i == bkb.q5) {
                        return -8553091;
                    }
                    if (i == bkb.yf) {
                        return -16777216;
                    }
                    if (i == bkb.Bf) {
                        return -1610612736;
                    }
                    if (i == bkb.Ef || i == bkb.If || i == bkb.Df) {
                        return -9539985;
                    }
                    if (i != bkb.F6) {
                        int i2 = bkb.Ci;
                        if (i == i2) {
                            return -11754001;
                        }
                        if (i == bkb.h6) {
                            return 536870911;
                        }
                        if (i != bkb.vi && i != bkb.ui && i != bkb.wi) {
                            if (i == bkb.xi) {
                                return 352321535;
                            }
                            if (i == bkb.Af || i == i2) {
                                return -7895161;
                            }
                            if (i == bkb.zf) {
                                return 780633991;
                            }
                            if (i == bkb.Z6) {
                                return -15921907;
                            }
                            f53 f53Var = (f53) this.c;
                            return f53Var != null ? f53Var.h(i) : bkb.w0(null, i, false);
                        }
                    }
                }
                return -1;
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                wjb wjbVar = (wjb) this.c;
                return wjbVar == null ? bkb.w0(null, i, false) : wjbVar.h(i);
        }
    }

    @Override // wjb
    public final void i(int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar != null) {
                    wjbVar.i(i, i2);
                    break;
                }
                break;
        }
    }

    @Override // wjb
    public final int j(int i) {
        switch (this.a) {
            case 0:
                return ((SparseIntArray) this.b).get(i);
            case 1:
                return h(i);
            default:
                wjb wjbVar = (wjb) this.c;
                return wjbVar == null ? bkb.w0(null, i, false) : wjbVar.j(i);
        }
    }

    public /* synthetic */ si5() {
        this.a = (byte) 0;
    }

    public si5(f53 f53Var) {
        this.a = (byte) 1;
        this.c = f53Var;
    }

    public void k() {
    }

    private final void l(int i, int i2) {
    }

    private final void m(int i, int i2) {
    }
}
