// default package

import android.util.Pair;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class zx6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ by6 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ f86 d;
    public final /* synthetic */ fr6 e;

    public /* synthetic */ zx6(by6 by6Var, Pair pair, f86 f86Var, fr6 fr6Var, byte b) {
        this.a = b;
        this.b = by6Var;
        this.c = pair;
        this.d = f86Var;
        this.e = fr6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fr6 fr6Var = this.e;
        f86 f86Var = this.d;
        Pair pair = this.c;
        by6 by6Var = this.b;
        switch (b) {
            case 0:
                by6Var.b.i.s(((Integer) pair.first).intValue(), (rx6) pair.second, f86Var, fr6Var);
                break;
            default:
                by6Var.b.i.u(((Integer) pair.first).intValue(), (rx6) pair.second, f86Var, fr6Var);
                break;
        }
    }
}
