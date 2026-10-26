package vg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
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
                    z0Var.X(true);
                    break;
                }
                break;
            default:
                z0.P(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
