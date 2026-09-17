package zh;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
