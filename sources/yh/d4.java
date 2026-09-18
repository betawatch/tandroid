package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ d4(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e4 e4Var = this.b;
                e4Var.r = false;
                e4Var.invalidate();
                e4Var.a();
                e4Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                e4 e4Var2 = this.b;
                e4Var2.setMessageCell(null);
                ArrayList arrayList = e4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yi0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
