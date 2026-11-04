package xg;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.li;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.hg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ x0(e1 e1Var, int i3) {
        this.a = i3;
        this.b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        e1 e1Var = this.b;
        switch (i3) {
            case 0:
                e1Var.j1(true);
                break;
            case 1:
                e1Var.W1.setVisibility(8);
                break;
            case 2:
                e1Var.e1();
                e1Var.p1(true, false);
                break;
            case 3:
                hg0 hg0Var = e1Var.S1;
                hg0Var.b.r(bd.M0(2131745846, null), true);
                break;
            case 4:
                hg0 hg0Var2 = e1Var.S1;
                hg0Var2.b.r(bd.M0(2131749658, null), true);
                break;
            case 5:
                e1Var.e1();
                e1Var.p1(true, false);
                break;
            case 6:
                ArrayList arrayList = e1Var.c2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(li.b0(e1Var.a).j1);
                    e1Var.o1(true, true);
                    break;
                }
                break;
            case 7:
                e1Var.W1.setVisibility(8);
                break;
            case 8:
                e1Var.e1();
                e1Var.p1(true, false);
                break;
            case 9:
                d2 d2Var = e1Var.p1;
                if (d2Var != null) {
                    b2 b2Var = new b2();
                    b2Var.a = true;
                    d2Var.showAsSheet(new PrivacyControlActivity(11, false), b2Var);
                    break;
                }
                break;
            case 10:
                e1Var.o1(true, true);
                break;
            case 11:
                e1Var.dismiss();
                break;
            default:
                e1Var.e1();
                e1Var.p1(true, false);
                break;
        }
    }
}
