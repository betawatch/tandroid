package wg;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.ui.qg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ w0(d1 d1Var, int i7) {
        this.a = i7;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        d1 d1Var = this.b;
        switch (i7) {
            case 0:
                d1Var.i1(true);
                break;
            case 1:
                d1Var.Z1.setVisibility(8);
                break;
            case 2:
                d1Var.e1();
                d1Var.m1(true, false);
                break;
            case 3:
                qg0 qg0Var = d1Var.V1;
                qg0Var.b.r(gd.N0(2131745640, null), true);
                break;
            case 4:
                qg0 qg0Var2 = d1Var.V1;
                qg0Var2.b.r(gd.N0(2131749477, null), true);
                break;
            case 5:
                d1Var.e1();
                d1Var.m1(true, false);
                break;
            case 6:
                ArrayList arrayList = d1Var.e2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ri.d0(d1Var.a).j1);
                    d1Var.l1(true, true);
                    break;
                }
                break;
            case 7:
                d1Var.Z1.setVisibility(8);
                break;
            case 8:
                d1Var.e1();
                d1Var.m1(true, false);
                break;
            case 9:
                d1Var.l1(true, true);
                break;
            case 10:
                d1Var.dismiss();
                break;
            default:
                d1Var.e1();
                d1Var.m1(true, false);
                break;
        }
    }
}
