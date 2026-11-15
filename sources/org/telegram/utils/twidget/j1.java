package org.telegram.utils.twidget;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class j1 {
    public final c0 a;
    public final k1[] b;
    public final double c;
    public final int d;
    public final int e;
    public final q1 f;
    public final boolean g;
    public final boolean h;

    public j1(c0 c0Var, k1[] k1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, q1 q1Var, boolean z10, boolean z11) {
        this.f = q1Var;
        this.g = z10;
        this.h = z11;
        this.a = c0Var;
        this.b = k1VarArr;
        this.c = d;
        this.d = i7;
        this.e = i10;
    }

    public final boolean a() {
        if (!this.a.e()) {
            return false;
        }
        for (k1 k1Var : this.b) {
            if (!k1Var.a.e()) {
                return false;
            }
        }
        return true;
    }
}
