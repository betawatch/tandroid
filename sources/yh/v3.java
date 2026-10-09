package yh;

import java.util.ArrayList;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ v3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                w3Var.r = false;
                w3Var.invalidate();
                w3Var.a();
                w3Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                w3 w3Var2 = this.b;
                w3Var2.setMessageCell(null);
                ArrayList arrayList = w3Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ck0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
