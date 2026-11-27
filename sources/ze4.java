// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ze4 extends la {
    public final /* synthetic */ af4 d;

    public ze4(af4 af4Var) {
        this.d = af4Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 8 || i == 7;
    }

    public final j79 F() {
        return this.d.n1.getAdapter();
    }

    @Override // j79
    public final int b() {
        return this.d.Z1.size();
    }

    @Override // j79
    public final int d(int i) {
        return ((ef4) this.d.Z1.get(i)).a;
    }

    @Override // j79
    public final void f() {
        F().f();
    }

    @Override // j79
    public final void g(int i) {
        F().g(i + 1);
    }

    @Override // j79
    public final void j(int i, int i2) {
        F().j(i + 1, i2);
    }

    @Override // j79
    public final void l(int i, int i2) {
        F().l(i + 1, i2);
    }

    @Override // j79
    public final void n(int i, int i2, Object obj) {
        F().n(i + 1, i2, obj);
    }

    @Override // j79
    public final void p(int i, int i2) {
        F().p(i + 1, i2);
    }

    @Override // j79
    public final void q(int i, int i2) {
        F().q(i + 1, i2);
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3 = f89Var.f;
        View view = f89Var.a;
        ArrayList arrayList = this.d.Z1;
        ef4 ef4Var = (ef4) arrayList.get(i);
        int i4 = i + 1;
        boolean z = (i4 >= arrayList.size() || (i2 = ((ef4) arrayList.get(i4)).a) == 3 || i2 == 6) ? false : true;
        if (i3 == 7) {
            ((hf4) view).e(ef4Var.m, z);
            return;
        }
        if (i3 == 6 || i3 == 3) {
            ilb ilbVar = (ilb) view;
            if (i3 == 6) {
                ilbVar.setFixedSize(0);
                ilbVar.setText(ef4Var.d);
                return;
            } else {
                ilbVar.setFixedSize(12);
                ilbVar.setText("");
                return;
            }
        }
        if (i3 == 0 || i3 != 8) {
            return;
        }
        we4 we4Var = (we4) view;
        we4Var.a.setText(ob6.M0(2131751679, null));
        if (we4Var.c != z) {
            we4Var.c = z;
            we4Var.setWillNotDraw(!z);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View ilbVar;
        af4 af4Var = this.d;
        if (i == 8) {
            ilbVar = new we4(af4Var.getContext());
            yob.h(aob.h5, null, ilbVar);
        } else if (i == 7) {
            ye4 ye4Var = new ye4(this, af4Var.getContext(), af4Var.a, af4Var.T1.a);
            yob.h(aob.h5, null, ye4Var);
            ilbVar = ye4Var;
        } else if (i == 6 || i == 3) {
            ilbVar = new ilb(af4Var.getContext());
            yob.h(aob.a7, null, ilbVar);
        } else {
            ilbVar = new zc(af4Var, af4Var.getContext());
        }
        return new n69(ilbVar);
    }
}
