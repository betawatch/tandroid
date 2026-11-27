// default package

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class q74 extends u55 {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public q74(int i, boolean z) {
        super(i);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z;
    }

    public static qma A1(qma qmaVar) {
        if (qmaVar == null) {
            return null;
        }
        float f = qmaVar.a;
        float f2 = 100.0f;
        if (f == 0.0f) {
            qmaVar.a = 100.0f;
            f = 100.0f;
        }
        float f3 = qmaVar.b;
        if (f3 == 0.0f) {
            qmaVar.b = 100.0f;
        } else {
            f2 = f3;
        }
        float f4 = f / f2;
        if (f4 <= 4.0f && f4 >= 0.2f) {
            return qmaVar;
        }
        float max = Math.max(f, f2);
        qmaVar.a = max;
        qmaVar.b = max;
        return qmaVar;
    }

    public qma B1(int i) {
        return new qma(100.0f, 100.0f);
    }

    public final boolean C1(int i) {
        z1();
        return this.S.get(i, ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE;
    }

    @Override // u55, q79
    public final int H(oh2 oh2Var, c89 c89Var) {
        return c89Var.b();
    }

    @Override // u55, q79
    public final int u(oh2 oh2Var, c89 c89Var) {
        return 1;
    }

    @Override // u55, x46, q79
    public final boolean x0() {
        return false;
    }

    public final void z1() {
        int i;
        int min;
        boolean z;
        float f;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() == z() && this.W == this.m && this.T == this.J) {
            return;
        }
        int i2 = this.m;
        this.W = i2;
        float f2 = i2;
        if (f2 == 0.0f) {
            f2 = 100.0f;
        }
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.S;
        sparseIntArray2.clear();
        boolean z2 = false;
        this.V = 0;
        this.U = 0;
        int z3 = z();
        this.T = z3;
        if (z3 == 0) {
            return;
        }
        int L = hl.L(100.0f);
        int i3 = this.J;
        boolean z4 = this.Q;
        int i4 = z3 + (z4 ? 1 : 0);
        int i5 = 0;
        int i6 = 0;
        int i7 = i3;
        while (i5 < i4) {
            qma A1 = i5 < z3 ? A1(B1(i5)) : null;
            if (A1 == null) {
                z = i6 != 0 ? true : z2;
                i = L;
                min = i3;
            } else {
                i = L;
                min = Math.min(i3, (int) Math.floor((((A1.a / A1.b) * L) / f2) * i3));
                boolean z5 = i7 < min || (min > 33 && i7 < min + (-15));
                if (A1.c) {
                    sparseIntArray.put(i5, i7);
                    this.V++;
                    f = f2;
                    i7 = i3;
                    i6 = 0;
                    i5++;
                    L = i;
                    f2 = f;
                    z2 = false;
                } else {
                    z = z5;
                }
            }
            if (z) {
                if (i7 == 0 || i6 == 0) {
                    f = f2;
                } else {
                    int i8 = i7 / i6;
                    int i9 = i5 - i6;
                    f = f2;
                    int i10 = i9;
                    while (true) {
                        int i11 = i9 + i6;
                        if (i10 >= i11) {
                            break;
                        }
                        if (i10 == i11 - 1) {
                            sparseIntArray.put(i10, sparseIntArray.get(i10) + i7);
                        } else {
                            sparseIntArray.put(i10, sparseIntArray.get(i10) + i8);
                        }
                        i7 -= i8;
                        i10++;
                    }
                    sparseIntArray2.put(i5 - 1, this.V);
                }
                if (i5 == z3) {
                    break;
                }
                this.V++;
                i7 = i3;
                i6 = 0;
            } else {
                f = f2;
                if (i7 < min) {
                    min = i7;
                }
            }
            if (this.V == 0) {
                this.U = Math.max(this.U, i5);
            }
            if (i5 == z3 - 1 && !z4) {
                sparseIntArray2.put(i5, this.V);
            }
            i6++;
            i7 -= min;
            sparseIntArray.put(i5, min);
            i5++;
            L = i;
            f2 = f;
            z2 = false;
        }
        this.V++;
    }
}
