package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ x0(z0 z0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = z0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.b;
                ArrayList arrayList = z0Var.g0;
                if (this.c) {
                    z0Var.h0.addAll(list);
                }
                if (z0Var.r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.W(true);
                    break;
                }
                break;
            default:
                z0.N(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
