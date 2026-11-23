package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ t0(v0 v0Var, boolean z10, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                v0 v0Var = this.b;
                ArrayList arrayList = v0Var.c2;
                if (this.c) {
                    v0Var.d2.addAll(list);
                }
                if (v0Var.n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    v0Var.o1(true, true);
                    v0Var.k1(true);
                    break;
                }
                break;
            default:
                v0.e1(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
