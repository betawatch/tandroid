// default package

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ria extends l69 {
    public final Context c;
    public final byte d;
    public boolean e;
    public final /* synthetic */ eja f;

    /* JADX WARN: Multi-variable type inference failed */
    public ria(eja ejaVar, Context context, int i) {
        this.f = ejaVar;
        this.c = context;
        this.d = i;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // l69
    public final String F(int i) {
        ArrayList arrayList = this.f.w1[this.d].e;
        if (arrayList.isEmpty()) {
            return "";
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i <= ((eia) arrayList.get(i2)).b) {
                return ((eia) arrayList.get(i2)).a;
            }
        }
        return ((eia) c00.g(1, arrayList)).a;
    }

    @Override // l69
    public final void G(d79 d79Var, float f, int[] iArr) {
        int measuredHeight = d79Var.getChildAt(0).getMeasuredHeight();
        float e = f * ((e() * measuredHeight) - (d79Var.getMeasuredHeight() - d79Var.getPaddingTop()));
        iArr[0] = (int) (e / measuredHeight);
        iArr[1] = ((int) e) % measuredHeight;
    }

    @Override // l69
    public final void J(d79 d79Var) {
        if (this.e) {
            this.e = false;
            int i = 0;
            for (int i2 = 0; i2 < d79Var.getChildCount() && (i = eja.Q(d79Var.getChildAt(i2))) == 0; i2++) {
            }
            if (i == 0) {
                this.f.L(this.d, d79Var, true);
            }
        }
    }

    @Override // l69
    public final void K() {
        this.e = true;
        zha P = this.f.P(this.d);
        if (P != null) {
            eja.m1(P, null, false);
        }
    }

    @Override // j79
    public final int b() {
        tia[] tiaVarArr = this.f.w1;
        byte b = this.d;
        tia tiaVar = tiaVarArr[b];
        if (tiaVar.o) {
            return tiaVar.e();
        }
        if (tiaVar.a.size() == 0 && !tiaVarArr[b].g) {
            return 1;
        }
        if (tiaVarArr[b].a.size() == 0) {
            tia tiaVar2 = tiaVarArr[b];
            boolean[] zArr = tiaVar2.i;
            if ((!zArr[0] || !zArr[1]) && tiaVar2.l) {
                return 0;
            }
        }
        if (tiaVarArr[b].e() != 0) {
            return Math.max(tiaVarArr[b].e(), tiaVarArr[b].c().size() + tiaVarArr[b].d());
        }
        int size = tiaVarArr[b].c().size() + tiaVarArr[b].d();
        if (size == 0) {
            return size;
        }
        tia tiaVar3 = tiaVarArr[b];
        boolean[] zArr2 = tiaVar3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z = tiaVar3.r;
        if ((z ? tiaVar3.u : tiaVar3.n) != 0) {
            return (z ? tiaVar3.u : tiaVar3.n) + size;
        }
        return size + 1;
    }

    @Override // j79
    public final int d(int i) {
        tia[] tiaVarArr = this.f.w1;
        byte b = this.d;
        if (tiaVarArr[b].c.size() == 0 && !tiaVarArr[b].g) {
            return 9;
        }
        tia tiaVar = tiaVarArr[b];
        int i2 = tiaVar.m;
        if (i < i2 || i >= tiaVar.a.size() + i2) {
            return 8;
        }
        return (b == 2 || b == 4) ? 10 : 7;
    }

    @Override // j79
    public final int e() {
        return this.f.w1[this.d].e();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        eja ejaVar = this.f;
        long j = ejaVar.m1;
        SparseArray[] sparseArrayArr = ejaVar.c1;
        tia tiaVar = ejaVar.w1[this.d];
        ArrayList arrayList = tiaVar.a;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 7) {
            if (view instanceof zea) {
                zea zeaVar = (zea) view;
                r47 r47Var = (r47) arrayList.get(i - tiaVar.m);
                zeaVar.c(r47Var, i != arrayList.size() - 1);
                if (ejaVar.F1) {
                    zeaVar.b(sparseArrayArr[(r47.B0(r47Var.k) > j ? 1 : (r47.B0(r47Var.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(r47Var.e1()) >= 0, !ejaVar.e1);
                    return;
                } else {
                    zeaVar.b(false, !ejaVar.e1);
                    return;
                }
            }
            return;
        }
        if (i2 == 10 && (view instanceof vea)) {
            vea veaVar = (vea) view;
            r47 r47Var2 = (r47) arrayList.get(i - tiaVar.m);
            veaVar.f(r47Var2, i != arrayList.size() - 1);
            if (ejaVar.F1) {
                veaVar.e(sparseArrayArr[(r47.B0(r47Var2.k) > j ? 1 : (r47.B0(r47Var2.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(r47Var2.e1()) >= 0, !ejaVar.e1);
            } else {
                veaVar.e(false, !ejaVar.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View sg4Var;
        eja ejaVar = this.f;
        tk4 tk4Var = ejaVar.E;
        ArrayList arrayList = ejaVar.J0;
        vnb vnbVar = ejaVar.I1;
        Context context = this.c;
        if (i != 7) {
            byte b = 2;
            byte b2 = this.d;
            if (i == 8) {
                tk4 tk4Var2 = new tk4(context, vnbVar);
                if (b2 == 2) {
                    tk4Var2.setViewType(4);
                } else {
                    tk4Var2.setViewType(3);
                }
                tk4Var2.x = false;
                tk4Var2.setIsSingleCell(true);
                tk4Var2.setGlobalGradientView(tk4Var);
                view = tk4Var2;
            } else {
                if (i == 9) {
                    ci G = eja.G(b2, ejaVar.m1, vnbVar, context);
                    G.setLayoutParams(new r79(-1, -1));
                    return new n69(G);
                }
                if (b2 != 4 || arrayList.isEmpty()) {
                    sg4Var = new sg4(this, context, vnbVar, b);
                } else {
                    View view2 = (View) arrayList.get(0);
                    arrayList.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                    sg4Var = view2;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view2);
                        sg4Var = view2;
                    }
                }
                vea veaVar = (vea) sg4Var;
                veaVar.setGlobalGradientView(tk4Var);
                view = sg4Var;
                if (b2 == 4) {
                    ejaVar.K0.add(veaVar);
                    view = sg4Var;
                }
            }
        } else {
            zea zeaVar = new zea(0, vnbVar, context);
            zeaVar.setGlobalGradientView(tk4Var);
            view = zeaVar;
        }
        return qu6.h(view, view, -1, -2);
    }
}
