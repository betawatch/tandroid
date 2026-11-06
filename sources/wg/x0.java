package wg;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ x0(f1 f1Var, int i7) {
        this.a = i7;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        f1 f1Var = this.b;
        switch (i7) {
            case 0:
                f1Var.j1(true);
                break;
            case 1:
                f1Var.V1.setVisibility(8);
                break;
            case 2:
                f1Var.e1();
                f1Var.p1(true, false);
                break;
            case 3:
                ng0 ng0Var = f1Var.R1;
                ng0Var.b.r(hd.M0(2131745837, null), true);
                break;
            case 4:
                ng0 ng0Var2 = f1Var.R1;
                ng0Var2.b.r(hd.M0(2131749649, null), true);
                break;
            case 5:
                f1Var.e1();
                f1Var.p1(true, false);
                break;
            case 6:
                ArrayList arrayList = f1Var.b2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ui.b0(f1Var.a).i1);
                    f1Var.o1(true, true);
                    break;
                }
                break;
            case 7:
                f1Var.V1.setVisibility(8);
                break;
            case 8:
                f1Var.e1();
                f1Var.p1(true, false);
                break;
            case 9:
                f2 f2Var = f1Var.o1;
                if (f2Var != null) {
                    d2 d2Var = new d2();
                    d2Var.a = true;
                    f2Var.showAsSheet(new PrivacyControlActivity(11, false), d2Var);
                    break;
                }
                break;
            case 10:
                f1Var.o1(true, true);
                break;
            case 11:
                f1Var.dismiss();
                break;
            default:
                f1Var.e1();
                f1Var.p1(true, false);
                break;
        }
    }
}
