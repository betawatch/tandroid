package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.ij0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;

    public /* synthetic */ b4(c4 c4Var, int i10) {
        this.a = i10;
        this.b = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c4 c4Var = this.b;
                c4Var.r = false;
                c4Var.invalidate();
                c4Var.a();
                c4Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                c4 c4Var2 = this.b;
                c4Var2.setMessageCell(null);
                ArrayList arrayList = c4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ij0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
