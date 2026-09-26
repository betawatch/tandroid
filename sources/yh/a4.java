package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.ij0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ a4(b4 b4Var, int i10) {
        this.a = i10;
        this.b = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                b4Var.r = false;
                b4Var.invalidate();
                b4Var.a();
                b4Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                b4 b4Var2 = this.b;
                b4Var2.setMessageCell(null);
                ArrayList arrayList = b4Var2.J;
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
