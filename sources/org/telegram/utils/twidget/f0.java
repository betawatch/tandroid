package org.telegram.utils.twidget;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public f0(g gVar, g0[] g0VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var, boolean z9, boolean z10) {
        this.f = m0Var;
        this.g = z9;
        this.h = z10;
        this.a = gVar;
        this.b = g0VarArr;
        this.c = d;
        this.d = i7;
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
