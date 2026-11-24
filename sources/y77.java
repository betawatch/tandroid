// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ y77(na7 na7Var, TLRPC.Updates updates, boolean z, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = updates;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.d.c(new y77(this.b, this.c, this.d, (byte) 1));
                break;
            default:
                this.b.Q3(this.c, this.d);
                break;
        }
    }
}
