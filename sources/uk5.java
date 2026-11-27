// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class uk5 implements vnb {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public uk5(vnb vnbVar) {
        this.a = (byte) 2;
        this.b = new SparseIntArray();
        this.c = vnbVar;
        k();
    }

    @Override // vnb
    public final boolean a() {
        switch (this.a) {
            case 0:
            default:
                return aob.I.o();
            case 1:
                return true;
        }
    }

    @Override // vnb
    public final void b(float f, float f2, int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                aob.q(f, f2, i, i2);
                break;
            default:
                vnb vnbVar = (vnb) this.c;
                if (vnbVar != null) {
                    vnbVar.b(f, f2, i, i2);
                    break;
                } else {
                    aob.q(f, f2, i, i2);
                    break;
                }
        }
    }

    @Override // vnb
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                return aob.v3;
            case 1:
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) this.b;
                if (porterDuffColorFilter != null) {
                    return porterDuffColorFilter;
                }
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.b = porterDuffColorFilter2;
                return porterDuffColorFilter2;
            default:
                vnb vnbVar = (vnb) this.c;
                return vnbVar == null ? aob.v3 : vnbVar.c();
        }
    }

    @Override // vnb
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return aob.T0(str);
            case 1:
                return ((x53) this.c).d(str);
            default:
                vnb vnbVar = (vnb) this.c;
                return vnbVar == null ? aob.T0(str) : vnbVar.d(str);
        }
    }

    @Override // vnb
    public final boolean e() {
        byte b = this.a;
        return xea.D0;
    }

    @Override // vnb
    public final int f(int i) {
        switch (this.a) {
            case 0:
            case 1:
                return h(i);
            default:
                vnb vnbVar = (vnb) this.c;
                return vnbVar == null ? aob.w0(null, i, false) : vnbVar.f(i);
        }
    }

    @Override // vnb
    public final boolean g() {
        switch (this.a) {
            case 0:
            case 1:
                return false;
            default:
                vnb vnbVar = (vnb) this.c;
                return vnbVar == null ? aob.b1() : vnbVar.g();
        }
    }

    @Override // vnb
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
            case 1:
                return null;
            default:
                vnb vnbVar = (vnb) this.c;
                return vnbVar == null ? aob.P0(str) : vnbVar.getDrawable(str);
        }
    }

    @Override // vnb
    public final int h(int i) {
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : aob.u0(i);
            case 1:
                if (i == aob.G8) {
                    return -14145495;
                }
                if (i != aob.E8) {
                    if (i == aob.h5) {
                        return -14737633;
                    }
                    if (i == aob.j5) {
                        return -592138;
                    }
                    if (i == aob.r5) {
                        return -8553091;
                    }
                    if (i == aob.zf) {
                        return -16777216;
                    }
                    if (i == aob.Cf) {
                        return -1610612736;
                    }
                    if (i == aob.Ff || i == aob.Jf || i == aob.Ef) {
                        return -9539985;
                    }
                    if (i != aob.G6) {
                        int i2 = aob.Di;
                        if (i == i2) {
                            return -11754001;
                        }
                        if (i == aob.i6) {
                            return 536870911;
                        }
                        if (i != aob.wi && i != aob.vi && i != aob.xi) {
                            if (i == aob.yi) {
                                return 352321535;
                            }
                            if (i == aob.Bf || i == i2) {
                                return -7895161;
                            }
                            if (i == aob.Af) {
                                return 780633991;
                            }
                            if (i == aob.a7) {
                                return -15921907;
                            }
                            x53 x53Var = (x53) this.c;
                            return x53Var != null ? x53Var.h(i) : aob.w0(null, i, false);
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
                vnb vnbVar = (vnb) this.c;
                return vnbVar == null ? aob.w0(null, i, false) : vnbVar.h(i);
        }
    }

    @Override // vnb
    public final void i(int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                vnb vnbVar = (vnb) this.c;
                if (vnbVar != null) {
                    vnbVar.i(i, i2);
                    break;
                }
                break;
        }
    }

    @Override // vnb
    public final int j(int i) {
        switch (this.a) {
            case 0:
                return ((SparseIntArray) this.b).get(i);
            case 1:
                return h(i);
            default:
                vnb vnbVar = (vnb) this.c;
                return vnbVar == null ? aob.w0(null, i, false) : vnbVar.j(i);
        }
    }

    public /* synthetic */ uk5() {
        this.a = (byte) 0;
    }

    public uk5(x53 x53Var) {
        this.a = (byte) 1;
        this.c = x53Var;
    }

    public void k() {
    }

    private final void l(int i, int i2) {
    }

    private final void m(int i, int i2) {
    }
}
