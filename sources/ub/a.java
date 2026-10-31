package ub;

import jb.g;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements r9.d {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // r9.d
    public final Object K(bh.d dVar) {
        switch (this.a) {
            case 0:
                return new c((g) dVar.b(g.class));
            default:
                return new b((c) dVar.b(c.class), (jb.d) dVar.b(jb.d.class));
        }
    }
}
