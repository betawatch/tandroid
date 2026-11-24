// default package

import android.util.Pair;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yz6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b07 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ ft6 d;

    public /* synthetic */ yz6(b07 b07Var, Pair pair, ft6 ft6Var, byte b) {
        this.a = b;
        this.b = b07Var;
        this.c = pair;
        this.d = ft6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ft6 ft6Var = this.d;
        Pair pair = this.c;
        b07 b07Var = this.b;
        switch (b) {
            case 0:
                xa3 xa3Var = b07Var.b.i;
                int intValue = ((Integer) pair.first).intValue();
                rz6 rz6Var = (rz6) pair.second;
                rz6Var.getClass();
                xa3Var.k(intValue, rz6Var, ft6Var);
                break;
            default:
                b07Var.b.i.j(((Integer) pair.first).intValue(), (rz6) pair.second, ft6Var);
                break;
        }
    }
}
