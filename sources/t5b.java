// default package

import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t5b implements qcc {
    public final /* synthetic */ u5b a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ t5b(u5b u5bVar, boolean z, int i, List list) {
        this.a = u5bVar;
        this.b = z;
        this.c = i;
        this.d = list;
    }

    @Override // qcc
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
