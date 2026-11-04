package org.telegram.utils.twidget;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class f0 {
    public final g a;
    public final g0[] b;
    public final double c;
    public final int d;
    public final int e;
    public final m0 f;
    public final boolean g;
    public final boolean h;

    public f0(g gVar, g0[] g0VarArr, double d, int i3, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var, boolean z10, boolean z11) {
        this.f = m0Var;
        this.g = z10;
        this.h = z11;
        this.a = gVar;
        this.b = g0VarArr;
        this.c = d;
        this.d = i3;
        this.e = i10;
    }

    public final boolean a() {
        if (!this.a.f()) {
            return false;
        }
        for (g0 g0Var : this.b) {
            if (!g0Var.a.f()) {
                return false;
            }
        }
        return true;
    }
}
