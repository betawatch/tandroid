// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ya4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hb4 b;
    public final /* synthetic */ ib4 c;

    public /* synthetic */ ya4(hb4 hb4Var, ib4 ib4Var, byte b) {
        this.a = b;
        this.b = hb4Var;
        this.c = ib4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hb4 hb4Var = this.b;
                ib4 ib4Var = this.c;
                ArrayList arrayList = hb4Var.m;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hb4Var.m = arrayList;
                }
                if (ib4Var != null && !arrayList.contains(ib4Var)) {
                    hb4Var.m.add(ib4Var);
                }
                if (!hb4Var.m.isEmpty()) {
                    Utilities.d.a(hb4Var.f1);
                }
                if (ib4Var != null && hb4Var.Y != 1 && hb4Var.Y != 0) {
                    ib4Var.a();
                    break;
                }
                break;
            default:
                hb4 hb4Var2 = this.b;
                ib4 ib4Var2 = this.c;
                if (hb4Var2.m != null) {
                    cc4.d("FileLoadOperation " + hb4Var2.r + " removing stream listener " + ib4Var2);
                    hb4Var2.m.remove(ib4Var2);
                    break;
                }
                break;
        }
    }
}
