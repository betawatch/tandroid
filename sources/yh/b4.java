package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                    ((kj0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
