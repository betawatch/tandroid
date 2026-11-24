// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3b implements rac {
    public final /* synthetic */ z3b a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ y3b(z3b z3bVar, boolean z, int i, List list) {
        this.a = z3bVar;
        this.b = z;
        this.c = i;
        this.d = list;
    }

    @Override // rac
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
