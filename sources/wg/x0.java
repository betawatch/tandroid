package wg;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.si;
import org.telegram.ui.sg0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ x0(e1 e1Var, int i7) {
        this.a = i7;
        this.b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        e1 e1Var = this.b;
        switch (i7) {
            case 0:
                e1Var.i1(true);
                break;
            case 1:
                e1Var.Z1.setVisibility(8);
                break;
            case 2:
                e1Var.e1();
                e1Var.m1(true, false);
                break;
            case 3:
                sg0 sg0Var = e1Var.V1;
                sg0Var.b.r(hd.N0(2131745640, null), true);
                break;
            case 4:
                sg0 sg0Var2 = e1Var.V1;
                sg0Var2.b.r(hd.N0(2131749477, null), true);
                break;
            case 5:
                e1Var.e1();
                e1Var.m1(true, false);
                break;
            case 6:
                ArrayList arrayList = e1Var.e2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(si.d0(e1Var.a).j1);
                    e1Var.l1(true, true);
                    break;
                }
                break;
            case 7:
                e1Var.Z1.setVisibility(8);
                break;
            case 8:
                e1Var.e1();
                e1Var.m1(true, false);
                break;
            case 9:
                e1Var.l1(true, true);
                break;
            case 10:
                e1Var.dismiss();
                break;
            default:
                e1Var.e1();
                e1Var.m1(true, false);
                break;
        }
    }
}
