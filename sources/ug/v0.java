package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ v0(x0 x0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = x0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                x0 x0Var = this.b;
                ArrayList arrayList = x0Var.g0;
                if (this.c) {
                    x0Var.h0.addAll(list);
                }
                if (x0Var.r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    x0Var.c0(true, true);
                    x0Var.Y(true);
                    break;
                }
                break;
            default:
                x0.Q(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
