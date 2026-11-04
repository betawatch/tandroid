package xg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u0(w0 w0Var, boolean z10, int i3) {
        this.a = i3;
        this.b = w0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.Z1;
                if (this.c) {
                    w0Var.a2.addAll(list);
                }
                if (w0Var.k2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.n1(true, true);
                    w0Var.j1(true);
                    break;
                }
                break;
            default:
                w0.d1(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
