package zh;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ z3(a4 a4Var, int i10) {
        this.a = i10;
        this.b = a4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a4 a4Var = this.b;
                a4Var.r = false;
                a4Var.invalidate();
                a4Var.a();
                a4Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                a4 a4Var2 = this.b;
                a4Var2.setMessageCell(null);
                ArrayList arrayList = a4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
