// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ur9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wr9 b;

    public /* synthetic */ ur9(wr9 wr9Var, byte b) {
        this.a = b;
        this.b = wr9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wr9 wr9Var = this.b;
        switch (b) {
            case 0:
                wr9Var.g(false);
                break;
            case 1:
                wr9Var.o = false;
                break;
            case 2:
                wr9Var.o = false;
                wr9Var.l = false;
                break;
            case 3:
                wr9Var.k();
                break;
            default:
                if (!wr9Var.o) {
                    wr9Var.o = true;
                    ArrayList arrayList = new ArrayList(wr9Var.j);
                    cf7 Y = cf7.Y(wr9Var.a);
                    Y.a.c(new ak8((Object) wr9Var, (Object) Y, (Object) arrayList, (byte) 25));
                    break;
                }
                break;
        }
    }
}
