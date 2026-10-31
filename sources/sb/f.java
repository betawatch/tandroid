package sb;

import jb.g;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements r9.d {
    public static final /* synthetic */ f b = new f(0);
    public static final /* synthetic */ f c = new f(1);
    public static final /* synthetic */ f d = new f(2);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // r9.d
    public final Object K(bh.d dVar) {
        switch (this.a) {
            case 0:
                return new d((g) dVar.b(g.class));
            case 1:
                return new c((d) dVar.b(d.class), (jb.d) dVar.b(jb.d.class));
            default:
                return new pb.b(dVar.c(c.class));
        }
    }
}
