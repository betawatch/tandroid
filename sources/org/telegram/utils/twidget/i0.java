package org.telegram.utils.twidget;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class i0 {
    public final g a;
    public final j0[] b;
    public final double c;
    public final int d;
    public final int e;
    public final int f;
    public final q0 g;
    public final boolean h;
    public final boolean i;

    public i0(g gVar, j0[] j0VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, q0 q0Var, boolean z10, boolean z11) {
        this.g = q0Var;
        this.h = z10;
        this.i = z11;
        this.a = gVar;
        this.b = j0VarArr;
        this.c = d;
        this.d = i10;
        this.e = i11;
        this.f = i14;
    }

    public final boolean a() {
        if (!this.a.f()) {
            return false;
        }
        for (j0 j0Var : this.b) {
            if (!j0Var.a.f()) {
                return false;
            }
        }
        return true;
    }
}
