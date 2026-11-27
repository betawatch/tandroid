// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class rs2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ xw6 c;

    public /* synthetic */ rs2(yx6 yx6Var, xw6 xw6Var, byte b) {
        this.a = b;
        this.b = yx6Var;
        this.c = xw6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 27;
        xw6 xw6Var = this.c;
        yx6 yx6Var = this.b;
        switch (b) {
            case 0:
                if (!yx6Var.i()) {
                    if (yx6Var.x) {
                        if (!yx6.j(xw6Var)) {
                            if (yx6Var.h(xw6Var)) {
                                yx6Var.x = false;
                            }
                        }
                    }
                    yx6Var.e.getClass();
                    break;
                }
                break;
            case 1:
                yx6Var.g.S(xw6Var, TLObject.FLAG_31, 1, sz6.X(new tq6(b2)));
                break;
            case 2:
                yx6Var.g.S(xw6Var, TLObject.FLAG_31, 9, sz6.X(new hz6((byte) 2)));
                break;
            case 3:
                yx6Var.g.S(xw6Var, TLObject.FLAG_31, 7, sz6.X(new tq6((byte) 29)));
                break;
            case 4:
                yx6Var.g.S(xw6Var, TLObject.FLAG_31, 12, sz6.X(new hz6((byte) 1)));
                break;
            case 5:
                yx6Var.g.S(xw6Var, TLObject.FLAG_31, 11, sz6.X(new tq6((byte) 28)));
                break;
            case 6:
                yx6Var.g.S(xw6Var, TLObject.FLAG_31, 3, sz6.X(new hz6((byte) 3)));
                break;
            case 7:
                yx6Var.g.S(xw6Var, TLObject.FLAG_31, 1, sz6.X(new tq6(b2)));
                break;
            case 8:
                yx6Var.g.Q(xw6Var, TLObject.FLAG_31);
                break;
            default:
                yx6Var.g.Q(xw6Var, TLObject.FLAG_31);
                break;
        }
    }
}
