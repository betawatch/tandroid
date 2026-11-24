// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sg1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nh1 b;

    public /* synthetic */ sg1(nh1 nh1Var, byte b) {
        this.a = b;
        this.b = nh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nh1 nh1Var = this.b;
        switch (b) {
            case 0:
                nh1Var.X0();
                break;
            default:
                nh1Var.getClass();
                ir2.v(null, 2131752248, u21.b0(nh1Var), R.raw.done, 36);
                break;
        }
    }
}
