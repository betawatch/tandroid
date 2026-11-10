package wg;

import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.qg0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                f1Var.Y1.setVisibility(8);
                break;
            case 2:
                f1Var.e1();
                f1Var.p1(true, false);
                break;
            case 3:
                qg0 qg0Var = f1Var.U1;
                qg0Var.b.r(id.M0(2131745836, null), true);
                break;
            case 4:
                qg0 qg0Var2 = f1Var.U1;
                qg0Var2.b.r(id.M0(2131749650, null), true);
                break;
            case 5:
                f1Var.e1();
                f1Var.p1(true, false);
                break;
            case 6:
                ArrayList arrayList = f1Var.e2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ui.b0(f1Var.a).i1);
                    f1Var.o1(true, true);
                    break;
                }
                break;
            case 7:
                f1Var.Y1.setVisibility(8);
                break;
            case 8:
                f1Var.e1();
                f1Var.p1(true, false);
                break;
            case 9:
                f2 f2Var = f1Var.r1;
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
