package org.telegram.utils.twidget;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class f1 {
    public final c0 a;
    public final g1[] b;
    public final double c;
    public final int d;
    public final int e;
    public final m1 f;
    public final boolean g;
    public final boolean h;

    public f1(c0 c0Var, g1[] g1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m1 m1Var, boolean z9, boolean z10) {
        this.f = m1Var;
        this.g = z9;
        this.h = z10;
        this.a = c0Var;
        this.b = g1VarArr;
        this.c = d;
        this.d = i7;
        this.e = i10;
    }

    public final boolean a() {
        if (!this.a.e()) {
            return false;
        }
        for (g1 g1Var : this.b) {
            if (!g1Var.a.e()) {
                return false;
            }
        }
        return true;
    }
}
