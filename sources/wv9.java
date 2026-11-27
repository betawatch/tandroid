// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wv9 extends qie {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ aw9 j;

    public wv9(aw9 aw9Var, int i, int i2, int i3, int i4, int i5, ArrayList arrayList, int i6, int i7, ArrayList arrayList2) {
        this.j = aw9Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = arrayList;
        this.g = i6;
        this.h = i7;
        this.i = arrayList2;
    }

    @Override // qie
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override // qie
    public final boolean b(int i, int i2) {
        r47 r47Var;
        aw9 aw9Var = this.j;
        if (i >= 0 && i2 >= 0) {
            if (i == this.b && i2 == aw9Var.s) {
                return true;
            }
            if (i == this.c && i2 == aw9Var.y) {
                return true;
            }
        }
        r47 r47Var2 = null;
        int i3 = this.d;
        if (i < i3 || i >= this.e) {
            int i4 = this.g;
            r47Var = (i < i4 || i >= this.h) ? null : (r47) this.i.get(i - i4);
        } else {
            r47Var = (r47) this.f.get(i - i3);
        }
        int i5 = aw9Var.w;
        if (i2 < i5 || i2 >= aw9Var.x) {
            int i6 = aw9Var.E;
            if (i2 >= i6 && i2 < aw9Var.F) {
                r47Var2 = (r47) aw9Var.f.get(i2 - i6);
            }
        } else {
            r47Var2 = (r47) aw9Var.e.get(i2 - i5);
        }
        return (r47Var2 == null || r47Var == null || r47Var2.F0() == null || r47Var.F0() == null || r47Var2.F0().id != r47Var.F0().id) ? false : true;
    }

    @Override // qie
    public final int c() {
        return this.j.r;
    }

    @Override // qie
    public final int d() {
        return this.a;
    }
}
