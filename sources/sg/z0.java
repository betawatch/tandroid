package sg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z0(c1 c1Var, boolean z10, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                c1 c1Var = this.b;
                ArrayList arrayList = c1Var.g0;
                if (this.c) {
                    c1Var.h0.addAll(list);
                }
                if (c1Var.r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    c1Var.b0(true, true);
                    c1Var.X(true);
                    break;
                }
                break;
            default:
                c1.P(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
