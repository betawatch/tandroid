// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class yr2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tv6 b;
    public final /* synthetic */ su6 c;

    public /* synthetic */ yr2(tv6 tv6Var, su6 su6Var, byte b) {
        this.a = b;
        this.b = tv6Var;
        this.c = su6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 15;
        su6 su6Var = this.c;
        tv6 tv6Var = this.b;
        switch (b) {
            case 0:
                if (!tv6Var.i()) {
                    if (tv6Var.x) {
                        if (!tv6.j(su6Var)) {
                            if (tv6Var.h(su6Var)) {
                                tv6Var.x = false;
                            }
                        }
                    }
                    tv6Var.e.getClass();
                    break;
                }
                break;
            case 1:
                tv6Var.g.S(su6Var, TLObject.FLAG_31, 1, ox6.X(new yw6(b2)));
                break;
            case 2:
                tv6Var.g.S(su6Var, TLObject.FLAG_31, 9, ox6.X(new yw6((byte) 20)));
                break;
            case 3:
                tv6Var.g.S(su6Var, TLObject.FLAG_31, 7, ox6.X(new yw6((byte) 17)));
                break;
            case 4:
                tv6Var.g.S(su6Var, TLObject.FLAG_31, 12, ox6.X(new yw6((byte) 19)));
                break;
            case 5:
                tv6Var.g.S(su6Var, TLObject.FLAG_31, 11, ox6.X(new yw6((byte) 16)));
                break;
            case 6:
                tv6Var.g.S(su6Var, TLObject.FLAG_31, 3, ox6.X(new yw6((byte) 21)));
                break;
            case 7:
                tv6Var.g.S(su6Var, TLObject.FLAG_31, 1, ox6.X(new yw6(b2)));
                break;
            case 8:
                tv6Var.g.Q(su6Var, TLObject.FLAG_31);
                break;
            default:
                tv6Var.g.Q(su6Var, TLObject.FLAG_31);
                break;
        }
    }
}
