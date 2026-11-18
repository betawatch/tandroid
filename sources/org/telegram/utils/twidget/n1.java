package org.telegram.utils.twidget;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class n1 {
    public final d0 a;
    public final o1[] b;
    public final double c;
    public final int d;
    public final int e;
    public final int f;
    public final v1 g;
    public final boolean h;
    public final boolean i;

    public n1(d0 d0Var, o1[] o1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, v1 v1Var, boolean z10, boolean z11) {
        this.g = v1Var;
        this.h = z10;
        this.i = z11;
        this.a = d0Var;
        this.b = o1VarArr;
        this.c = d;
        this.d = i7;
        this.e = i10;
        this.f = i13;
    }

    public final boolean a() {
        if (!this.a.e()) {
            return false;
        }
        for (o1 o1Var : this.b) {
            if (!o1Var.a.e()) {
                return false;
            }
        }
        return true;
    }
}
