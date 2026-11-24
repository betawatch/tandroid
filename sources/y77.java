// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                this.b.R3(this.c, this.d);
                break;
        }
    }
}
