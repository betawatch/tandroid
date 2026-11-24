// default package

import android.util.Pair;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
