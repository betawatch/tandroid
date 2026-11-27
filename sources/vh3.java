// default package

import android.graphics.Point;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vh3 implements wc5, u69 {
    public final /* synthetic */ uj3 a;

    public /* synthetic */ vh3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    @Override // wc5
    public final void a(xc5 xc5Var, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(if7.a(-j, 0L));
        uj3 uj3Var = this.a;
        oj3 oj3Var = uj3Var.E2;
        if (uj3Var.D2) {
            uj3Var.removeSelfFromStack();
        }
        oj3Var.q(uj3Var, arrayList, null, true, uj3Var.L2, uj3Var.M2, uj3Var.N2, null);
    }

    @Override // u69
    public final boolean d(float f, float f2, int i, View view) {
        boolean z = view instanceof bv8;
        uj3 uj3Var = this.a;
        if (z) {
            bv8 bv8Var = (bv8) view;
            if (bv8Var.p0) {
                uj3Var.i5(bv8Var.getDialogId(), view);
                return true;
            }
        }
        bj3 bj3Var = uj3Var.D0;
        gw9 gw9Var = bj3Var.b0;
        return uj3Var.D4(view, i, f, bj3Var.e0);
    }

    @Override // u69
    public final void f() {
        Point point = hl.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // u69
    public final void h(float f) {
        Point point = hl.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f);
        }
    }
}
