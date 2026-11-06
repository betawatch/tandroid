package yb;

import a8.r7;
import pb.g;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements u9.d {
    public static final /* synthetic */ f b = new f(0);
    public static final /* synthetic */ f c = new f(1);
    public static final /* synthetic */ f d = new f(2);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i7) {
        this.a = i7;
    }

    @Override // u9.d
    public final Object e(r7 r7Var) {
        switch (this.a) {
            case 0:
                return new d((g) r7Var.a(g.class));
            case 1:
                return new c((d) r7Var.a(d.class), (pb.d) r7Var.a(pb.d.class));
            default:
                return new vb.b(r7Var.c(c.class));
        }
    }
}
