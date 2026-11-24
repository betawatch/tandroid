// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class y77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ y77(oc7 oc7Var, TLRPC.Updates updates, boolean z, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = updates;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.T3(this.c, this.d);
                break;
            default:
                Utilities.d.c(new y77(this.b, this.c, this.d, (byte) 0));
                break;
        }
    }
}
