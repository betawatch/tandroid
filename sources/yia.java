// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class yia extends l69 {
    public final Context c;
    public boolean d;
    public gd4 e;
    public final /* synthetic */ eja f;

    public yia(eja ejaVar, Context context) {
        this.f = ejaVar;
        this.c = context;
    }

    @Override // c79
    public boolean D(f89 f89Var) {
        return false;
    }

    @Override // l69
    public final boolean E(d79 d79Var) {
        eja ejaVar = this.f;
        if (!ejaVar.q0()) {
            int ceil = (int) Math.ceil(e() / ((this == ejaVar.K || ejaVar.x1(this) != -1) ? ejaVar.p1[0] : ejaVar.t1));
            if (d79Var.getChildCount() != 0 && d79Var.getChildAt(0).getMeasuredHeight() * ceil > d79Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // l69
    public String F(int i) {
        ArrayList arrayList = this.f.w1[0].e;
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
        int i;
        int measuredHeight = d79Var.getChildAt(0).getMeasuredHeight();
        eja ejaVar = this.f;
        if (ejaVar.y1(this) != -1 || this == ejaVar.L) {
            i = ejaVar.t1;
        } else {
            int x1 = ejaVar.x1(this);
            int[] iArr2 = ejaVar.p1;
            i = x1 != -1 ? iArr2[1] : iArr2[0];
        }
        int ceil = (int) (Math.ceil(e() / i) * measuredHeight);
        int measuredHeight2 = d79Var.getMeasuredHeight() - d79Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f2 = f * (ceil - measuredHeight2);
            iArr[0] = ((int) (f2 / measuredHeight)) * i;
            iArr[1] = ((int) f2) % measuredHeight;
        }
    }

    @Override // l69
    public final float H(d79 d79Var) {
        int i;
        eja ejaVar = this.f;
        if (this == ejaVar.L || ejaVar.y1(this) != -1) {
            i = ejaVar.t1;
        } else {
            int x1 = ejaVar.x1(this);
            int[] iArr = ejaVar.p1;
            i = x1 != -1 ? iArr[1] : iArr[0];
        }
        int ceil = (int) Math.ceil(e() / i);
        if (d79Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = d79Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.S(d79Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r3 / i) * measuredHeight) - (r2.getTop() - d79Var.getPaddingTop())) / ((ceil * measuredHeight) - (d79Var.getMeasuredHeight() - d79Var.getPaddingTop()));
    }

    @Override // l69
    public void I() {
        this.f.n1(0, true);
    }

    @Override // l69
    public final void J(d79 d79Var) {
        if (this.d) {
            this.d = false;
            int i = 0;
            for (int i2 = 0; i2 < d79Var.getChildCount(); i2++) {
                View childAt = d79Var.getChildAt(i2);
                if (childAt instanceof jja) {
                    i = ((jja) childAt).getMessageId();
                }
                if (i != 0) {
                    break;
                }
            }
            if (i == 0) {
                this.f.L(0, d79Var, true);
            }
        }
    }

    @Override // l69
    public final void K() {
        this.d = true;
        zha P = this.f.P(0);
        if (P != null) {
            eja.m1(P, null, false);
        }
    }

    public int L(int i) {
        return this.f.w1[0].m + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r0[1] != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r5[1] != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r3[1] != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (r0.l == false) goto L39;
     */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b() {
        int size;
        eja ejaVar = this.f;
        boolean B = wf3.B(ejaVar.m1);
        tia[] tiaVarArr = ejaVar.w1;
        if (B) {
            if (tiaVarArr[0].a.size() != 0 || tiaVarArr[0].g) {
                if (tiaVarArr[0].a.size() == 0) {
                    boolean[] zArr = tiaVarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                size = tiaVarArr[0].c().size() + tiaVarArr[0].d();
                if (size != 0) {
                    boolean[] zArr2 = tiaVarArr[0].i;
                    if (zArr2[0]) {
                    }
                    return size + 1;
                }
                return size;
            }
            return 1;
        }
        tia tiaVar = tiaVarArr[0];
        if (tiaVar.o) {
            return tiaVar.e();
        }
        if (tiaVar.a.size() != 0 || tiaVarArr[0].g) {
            if (tiaVarArr[0].a.size() == 0) {
                tia tiaVar2 = tiaVarArr[0];
                boolean[] zArr3 = tiaVar2.i;
                if (zArr3[0]) {
                }
            }
            if (tiaVarArr[0].e() != 0) {
                return Math.max(tiaVarArr[0].e(), tiaVarArr[0].c().size() + tiaVarArr[0].d());
            }
            size = tiaVarArr[0].c().size() + tiaVarArr[0].d();
            if (size == 0) {
                return size;
            }
            tia tiaVar3 = tiaVarArr[0];
            boolean[] zArr4 = tiaVar3.i;
            if (zArr4[0] && zArr4[1]) {
                return size;
            }
            boolean z = tiaVar3.r;
            if ((z ? tiaVar3.u : tiaVar3.n) != 0) {
                return (z ? tiaVar3.u : tiaVar3.n) + size;
            }
            return size + 1;
        }
        return 1;
    }

    @Override // j79
    public int d(int i) {
        tia[] tiaVarArr = this.f.w1;
        if (!this.d && tiaVarArr[0].c().size() == 0) {
            tia tiaVar = tiaVarArr[0];
            if (!tiaVar.g && tiaVar.l) {
                return 2;
            }
        }
        tiaVarArr[0].getClass();
        tiaVarArr[0].c().size();
        tiaVarArr[0].getClass();
        return 0;
    }

    @Override // j79
    public int e() {
        return this.f.w1[0].e();
    }

    @Override // j79
    public void t(f89 f89Var, int i) {
        eja ejaVar = this.f;
        int[] iArr = ejaVar.p1;
        tia[] tiaVarArr = ejaVar.w1;
        if (f89Var.f == 0) {
            ArrayList c = tiaVarArr[0].c();
            int d = i - tiaVarArr[0].d();
            View view = f89Var.a;
            if (view instanceof jja) {
                jja jjaVar = (jja) view;
                int messageId = jjaVar.getMessageId();
                int i2 = this == ejaVar.K ? iArr[0] : ejaVar.x1(this) != -1 ? iArr[1] : ejaVar.t1;
                if (d < 0 || d >= c.size()) {
                    jjaVar.k(i2, null, false);
                    jjaVar.i(false, false);
                    return;
                }
                r47 r47Var = (r47) c.get(d);
                boolean z = r47Var.e1() == messageId;
                if (ejaVar.F1) {
                    jjaVar.i(ejaVar.c1[(r47.B0(r47Var.k) > ejaVar.m1 ? 1 : (r47.B0(r47Var.k) == ejaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(r47Var.e1()) >= 0, z);
                } else {
                    jjaVar.i(false, z);
                }
                jjaVar.k(i2, r47Var, false);
            }
        }
    }

    @Override // j79
    public f89 x(ViewGroup viewGroup, int i) {
        eja ejaVar = this.f;
        vnb vnbVar = ejaVar.I1;
        Context context = this.c;
        if (i != 0 && i != 19) {
            ci G = eja.G(0, ejaVar.m1, vnbVar, context);
            G.setLayoutParams(new r79(-1, -1));
            return new n69(G);
        }
        if (this.e == null) {
            this.e = new gd4(viewGroup.getContext(), vnbVar);
        }
        jja jjaVar = new jja(context, this.e, ejaVar.y1.getCurrentAccount());
        if (i == 19) {
            jjaVar.x0 = true;
        }
        jjaVar.setGradientView(ejaVar.E);
        if (ejaVar.x1(this) != -1) {
            jjaVar.e0 = true;
        }
        jjaVar.setLayoutParams(new r79(-1, -2));
        return new n69(jjaVar);
    }
}
