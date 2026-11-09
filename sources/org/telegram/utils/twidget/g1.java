package org.telegram.utils.twidget;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class g1 {
    public final c0 a;
    public final h1[] b;
    public final double c;
    public final int d;
    public final int e;
    public final n1 f;
    public final boolean g;
    public final boolean h;

    public g1(c0 c0Var, h1[] h1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, n1 n1Var, boolean z9, boolean z10) {
        this.f = n1Var;
        this.g = z9;
        this.h = z10;
        this.a = c0Var;
        this.b = h1VarArr;
        this.c = d;
        this.d = i7;
        this.e = i10;
    }

    public final boolean a() {
        if (!this.a.e()) {
            return false;
        }
        for (h1 h1Var : this.b) {
            if (!h1Var.a.e()) {
                return false;
            }
        }
        return true;
    }
}
