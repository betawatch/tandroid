// default package

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r2a implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t2a b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r2a(t2a t2aVar, boolean z, byte b) {
        this.a = b;
        this.b = t2aVar;
        this.c = z;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        t2a t2aVar = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = t2aVar.b2;
                if (z) {
                    t2aVar.c2.addAll(list);
                }
                if (t2aVar.m2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    t2aVar.j1(true, true);
                    t2aVar.f1(true);
                    break;
                }
                break;
            default:
                t2aVar.a1(z, (Pair) obj);
                break;
        }
    }
}
