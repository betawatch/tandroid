// default package

import android.util.Pair;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class yx6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ by6 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ fr6 d;

    public /* synthetic */ yx6(by6 by6Var, Pair pair, fr6 fr6Var, byte b) {
        this.a = b;
        this.b = by6Var;
        this.c = pair;
        this.d = fr6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fr6 fr6Var = this.d;
        Pair pair = this.c;
        by6 by6Var = this.b;
        switch (b) {
            case 0:
                l93 l93Var = by6Var.b.i;
                int intValue = ((Integer) pair.first).intValue();
                rx6 rx6Var = (rx6) pair.second;
                rx6Var.getClass();
                l93Var.k(intValue, rx6Var, fr6Var);
                break;
            default:
                by6Var.b.i.j(((Integer) pair.first).intValue(), (rx6) pair.second, fr6Var);
                break;
        }
    }
}
