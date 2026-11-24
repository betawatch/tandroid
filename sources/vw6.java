// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class vw6 implements ix6, jx6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ox6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vw6(ox6 ox6Var, int i, byte b) {
        this.a = b;
        this.b = ox6Var;
        this.c = i;
    }

    @Override // jx6
    public final void b(ad8 ad8Var, su6 su6Var, List list) {
        byte b = this.a;
        int i = this.c;
        ox6 ox6Var = this.b;
        switch (b) {
            case 1:
                ad8Var.Z(ox6Var.f(su6Var, ad8Var, i), list);
                break;
            case 2:
                if (list.size() != 1) {
                    ad8Var.r0(list, ox6Var.f(su6Var, ad8Var, i), ox6Var.f(su6Var, ad8Var, i + 1));
                    break;
                } else {
                    ad8Var.A0(ox6Var.f(su6Var, ad8Var, i), (br6) list.get(0));
                    break;
                }
            default:
                ad8Var.Z(ox6Var.f(su6Var, ad8Var, i), list);
                break;
        }
    }

    @Override // ix6
    public final void g(ad8 ad8Var, su6 su6Var) {
        byte b = this.a;
        int i = this.c;
        ox6 ox6Var = this.b;
        switch (b) {
            case 0:
                ad8Var.W(ox6Var.f(su6Var, ad8Var, i));
                break;
            default:
                ad8Var.O(ox6Var.f(su6Var, ad8Var, i));
                break;
        }
    }
}
