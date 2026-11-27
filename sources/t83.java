// default package

import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t83 implements o69, fd {
    public final /* synthetic */ x83 a;

    public /* synthetic */ t83(x83 x83Var) {
        this.a = x83Var;
    }

    @Override // o69
    public final int run() {
        x83 x83Var = this.a;
        ArrayList arrayList = x83Var.k3;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            if (((s83) arrayList.get(i)).a == 5) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return -1;
        }
        x83Var.h3.g1(i, hl.L(60.0f));
        return i;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        int i2;
        int i3;
        int i4;
        x83 x83Var = this.a;
        a93 a93Var = x83Var.w3;
        ArrayList arrayList = x83Var.n3;
        arrayList.clear();
        int i5 = 0;
        while (true) {
            w83[] w83VarArr = x83Var.o3;
            if (i5 >= w83VarArr.length) {
                i2 = ((e) a93Var).currentAccount;
                a2b.c(i2).l(0);
                i3 = ((e) a93Var).currentAccount;
                a2b.c(i3).l(1);
                i4 = ((e) a93Var).currentAccount;
                a2b.c(i4).l(2);
                x83Var.f3 = true;
                x83Var.D1();
                x83Var.E1(true);
                return;
            }
            w83 w83Var = w83VarArr[i5];
            if (w83Var.c > 0) {
                arrayList.add(Integer.valueOf(w83Var.d));
            }
            i5++;
        }
    }
}
