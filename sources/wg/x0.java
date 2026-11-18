package wg;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.ui.sg0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ x0(d1 d1Var, int i7) {
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
                sg0 sg0Var = d1Var.V1;
                sg0Var.b.r(gd.M0(2131745641, null), true);
                break;
            case 4:
                sg0 sg0Var2 = d1Var.V1;
                sg0Var2.b.r(gd.M0(2131749478, null), true);
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
