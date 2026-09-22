package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ c4(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                d4Var.r = false;
                d4Var.invalidate();
                d4Var.a();
                d4Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                d4 d4Var2 = this.b;
                d4Var2.setMessageCell(null);
                ArrayList arrayList = d4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
