// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sia extends y69 {
    public final Context r;
    public final /* synthetic */ eja s;

    public sia(eja ejaVar, Context context) {
        this.s = ejaVar;
        this.r = context;
    }

    @Override // l69
    public final String F(int i) {
        return null;
    }

    @Override // l69
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // y69
    public final int M(int i) {
        tia[] tiaVarArr = this.s.w1;
        if ((tiaVarArr[3].c.size() == 0 && !tiaVarArr[3].g) || i >= tiaVarArr[3].c.size()) {
            return 1;
        }
        tia tiaVar = tiaVarArr[3];
        return ((ArrayList) tiaVar.d.get(tiaVar.c.get(i))).size() + (i == 0 ? 0 : 1);
    }

    @Override // y69
    public final Object O(int i, int i2) {
        return null;
    }

    @Override // y69
    public final int P(int i, int i2) {
        tia[] tiaVarArr = this.s.w1;
        if (tiaVarArr[3].c.size() == 0 && !tiaVarArr[3].g) {
            return 5;
        }
        if (i < tiaVarArr[3].c.size()) {
            return (i == 0 || i2 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r5[1] != false) goto L13;
     */
    @Override // y69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        tia[] tiaVarArr = this.s.w1;
        int i = 1;
        if (tiaVarArr[3].c.size() == 0 && !tiaVarArr[3].g) {
            return 1;
        }
        int size = tiaVarArr[3].c.size();
        if (!tiaVarArr[3].c.isEmpty()) {
            boolean[] zArr = tiaVarArr[3].i;
            if (zArr[0]) {
            }
            return size + i;
        }
        i = 0;
        return size + i;
    }

    @Override // y69
    public final View T(int i, View view) {
        eja ejaVar = this.s;
        tia[] tiaVarArr = ejaVar.w1;
        if (view == null) {
            view = new p55(28, ejaVar.I1, this.r);
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < tiaVarArr[3].c.size()) {
            view.setAlpha(1.0f);
            ((p55) view).setText(ob6.e0(((r47) ((ArrayList) tiaVarArr[3].d.get((String) tiaVarArr[3].c.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // y69
    public final boolean V(int i, int i2, f89 f89Var) {
        tia[] tiaVarArr = this.s.w1;
        if (tiaVarArr[3].c.size() != 0 || tiaVarArr[3].g) {
            return i == 0 || i2 != 0;
        }
        return false;
    }

    @Override // y69
    public final void W(int i, int i2, f89 f89Var) {
        eja ejaVar = this.s;
        tia[] tiaVarArr = ejaVar.w1;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 == 6 || i3 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) tiaVarArr[3].d.get((String) tiaVarArr[3].c.get(i));
        int i4 = f89Var.f;
        if (i4 == 3) {
            r47 r47Var = (r47) arrayList.get(0);
            if (view instanceof p55) {
                ((p55) view).setText(ob6.e0(r47Var.k.date, false));
                return;
            }
            return;
        }
        if (i4 == 4) {
            if (i != 0) {
                i2--;
            }
            if (!(view instanceof cfa) || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            cfa cfaVar = (cfa) view;
            r47 r47Var2 = (r47) arrayList.get(i2);
            cfaVar.E = i2 != arrayList.size() - 1 || (i == tiaVarArr[3].c.size() - 1 && tiaVarArr[3].g);
            cfaVar.e();
            cfaVar.c0 = r47Var2;
            cfaVar.requestLayout();
            if (ejaVar.F1) {
                cfaVar.f(ejaVar.c1[(r47.B0(r47Var2.k) > ejaVar.m1 ? 1 : (r47.B0(r47Var2.k) == ejaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(r47Var2.e1()) >= 0, !ejaVar.e1);
            } else {
                cfaVar.f(false, !ejaVar.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        p55 p55Var;
        eja ejaVar = this.s;
        vnb vnbVar = ejaVar.I1;
        Context context = this.r;
        if (i == 3) {
            p55Var = new p55(28, vnbVar, context);
        } else if (i == 4) {
            cfa cfaVar = new cfa(0, vnbVar, context);
            cfaVar.setDelegate(ejaVar.W1);
            p55Var = cfaVar;
        } else {
            if (i == 5) {
                ci G = eja.G(3, ejaVar.m1, vnbVar, context);
                G.setLayoutParams(new r79(-1, -1));
                return new n69(G);
            }
            tk4 tk4Var = new tk4(context, vnbVar);
            tk4Var.setIsSingleCell(true);
            tk4Var.x = false;
            tk4Var.setViewType(5);
            p55Var = tk4Var;
        }
        return qu6.h(p55Var, p55Var, -1, -2);
    }
}
