// default package

import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rg4 extends c79 {
    public final /* synthetic */ yg4 c;

    public rg4(yg4 yg4Var) {
        this.c = yg4Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        yg4 yg4Var = this.c;
        ArrayList arrayList = yg4Var.f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + (!yg4Var.O ? 1 : 0);
    }

    @Override // j79
    public final int d(int i) {
        return i >= this.c.f.size() ? 3 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        if (f89Var.f == 0) {
            of3 of3Var = (of3) f89Var.a;
            yg4 yg4Var = this.c;
            r47 r47Var = (r47) yg4Var.f.get(i);
            of3Var.P = yg4Var.q0;
            of3Var.e0(r47.B0(r47Var.k), r47Var, r47Var.k.date, false, false);
            of3Var.t2 = i != b() - 1;
            of3Var.getViewTreeObserver().addOnPreDrawListener(new s32(this, of3Var, r47Var, of3Var.getMessage() != null && of3Var.getMessage().e1() == r47Var.e1(), (byte) 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [p55] */
    /* JADX WARN: Type inference failed for: r4v4, types: [tk4] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        nl3 nl3Var;
        ?? r2;
        if (i == 0) {
            nl3Var = new nl3((byte) 1, viewGroup.getContext(), true);
        } else {
            if (i != 3) {
                r2 = new p55(viewGroup.getContext(), null);
                r2.setText(ob6.M0(2131745484, null));
                return qu6.h(r2, r2, -1, -2);
            }
            ?? tk4Var = new tk4(viewGroup.getContext(), null);
            tk4Var.setIsSingleCell(true);
            tk4Var.setViewType(1);
            nl3Var = tk4Var;
        }
        r2 = nl3Var;
        return qu6.h(r2, r2, -1, -2);
    }
}
