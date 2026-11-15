package wg;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.si;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ v0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        c1 c1Var = this.b;
        switch (i7) {
            case 0:
                c1Var.j1(true);
                break;
            case 1:
                c1Var.Z1.setVisibility(8);
                break;
            case 2:
                c1Var.e1();
                c1Var.p1(true, false);
                break;
            case 3:
                ng0 ng0Var = c1Var.V1;
                ng0Var.b.r(hd.M0(2131745836, null), true);
                break;
            case 4:
                ng0 ng0Var2 = c1Var.V1;
                ng0Var2.b.r(hd.M0(2131749650, null), true);
                break;
            case 5:
                c1Var.e1();
                c1Var.p1(true, false);
                break;
            case 6:
                ArrayList arrayList = c1Var.f2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(si.b0(c1Var.a).j1);
                    c1Var.o1(true, true);
                    break;
                }
                break;
            case 7:
                c1Var.Z1.setVisibility(8);
                break;
            case 8:
                c1Var.e1();
                c1Var.p1(true, false);
                break;
            case 9:
                e2 e2Var = c1Var.s1;
                if (e2Var != null) {
                    c2 c2Var = new c2();
                    c2Var.a = true;
                    e2Var.showAsSheet(new PrivacyControlActivity(11, false), c2Var);
                    break;
                }
                break;
            case 10:
                c1Var.o1(true, true);
                break;
            case 11:
                c1Var.dismiss();
                break;
            default:
                c1Var.e1();
                c1Var.p1(true, false);
                break;
        }
    }
}
