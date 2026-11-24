// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class xa6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb6 b;
    public final /* synthetic */ db6 c;

    public /* synthetic */ xa6(eb6 eb6Var, db6 db6Var, byte b) {
        this.a = b;
        this.b = eb6Var;
        this.c = db6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        db6 db6Var = this.c;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = eb6Var.J;
                arrayList.remove(db6Var);
                eb6Var.K.l(db6Var.a);
                if (arrayList.isEmpty()) {
                    eb6.s();
                }
                kk7.e().k(kk7.F4, new Object[0]);
                break;
            case 1:
                ArrayList arrayList2 = eb6Var.J;
                arrayList2.remove(db6Var);
                eb6Var.K.l(db6Var.a);
                if (arrayList2.isEmpty()) {
                    eb6.s();
                }
                kk7.e().k(kk7.F4, new Object[0]);
                break;
            default:
                ArrayList arrayList3 = eb6Var.J;
                arrayList3.remove(db6Var);
                eb6Var.K.l(db6Var.a);
                if (arrayList3.isEmpty()) {
                    eb6.s();
                }
                kk7.e().k(kk7.F4, new Object[0]);
                break;
        }
    }
}
