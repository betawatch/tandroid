// default package

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t92 extends c79 {
    public final /* synthetic */ u92 c;

    public t92(u92 u92Var) {
        this.c = u92Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 1;
    }

    @Override // j79
    public final int b() {
        return this.c.i3.O.size() + 2;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return i <= this.c.i3.O.size() ? 1 : 2;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        u92 u92Var = this.c;
        v92 v92Var = u92Var.i3;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            mf5 mf5Var = (mf5) view;
            yob.h(aob.d6, u92Var.o2, mf5Var);
            mf5Var.setText(ob6.M0(2131743299, null));
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ((ilb) view).setText(ob6.M0(2131743298, null));
                return;
            }
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) v92Var.O.get(i - 1);
        re1 re1Var = (re1) view;
        if (re1Var.I) {
            v92Var.P = null;
        }
        re1Var.a(tL_username, i < v92Var.O.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        v92Var.P = re1Var;
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        u92 u92Var = this.c;
        vnb vnbVar = u92Var.o2;
        if (i == 0) {
            return new n69(new mf5(u92Var.getContext(), vnbVar));
        }
        if (i == 1) {
            return new n69(new ne1(this, u92Var.getContext(), vnbVar));
        }
        if (i != 2) {
            return null;
        }
        return new n69(new ilb(12, vnbVar, u92Var.getContext()));
    }
}
