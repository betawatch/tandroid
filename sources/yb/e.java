package yb;

import a8.r7;
import pb.g;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements u9.d {
    public static final /* synthetic */ e b = new e(0);
    public static final /* synthetic */ e c = new e(1);
    public static final /* synthetic */ e d = new e(2);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    @Override // u9.d
    public final Object e(r7 r7Var) {
        switch (this.a) {
            case 0:
                return new c((g) r7Var.a(g.class));
            case 1:
                return new b((c) r7Var.a(c.class), (pb.d) r7Var.a(pb.d.class));
            default:
                return new vb.b(r7Var.c(b.class));
        }
    }
}
