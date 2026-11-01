package rh;

import java.util.ArrayList;
import org.telegram.ui.Components.ci0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ h4(i4 i4Var, int i10) {
        this.a = i10;
        this.b = i4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                i4Var.r = false;
                i4Var.invalidate();
                i4Var.a();
                i4Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                i4 i4Var2 = this.b;
                i4Var2.setMessageCell(null);
                ArrayList arrayList = i4Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ci0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
