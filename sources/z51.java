// default package

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z51 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r61 b;
    public final /* synthetic */ p c;
    public final /* synthetic */ h61 d;

    public /* synthetic */ z51(r61 r61Var, p pVar, h61 h61Var, byte b) {
        this.a = b;
        this.b = r61Var;
        this.c = pVar;
        this.d = h61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.e.c(new z51(this.b, this.c, this.d, (byte) 1));
                break;
            default:
                this.b.f0(this.c, this.d);
                break;
        }
    }
}
