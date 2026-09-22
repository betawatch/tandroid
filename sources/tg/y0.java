package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ y0(a1 a1Var, boolean z10, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.b;
                ArrayList arrayList = a1Var.g0;
                if (this.c) {
                    a1Var.h0.addAll(list);
                }
                if (a1Var.r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    break;
                }
                break;
            default:
                a1.P(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
