// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ti1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.TL_error b;

    public /* synthetic */ ti1(TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.b;
        switch (b) {
            case 0:
                d31.e0(tL_error);
                break;
            default:
                if (tL_error != null) {
                    d31.e0(tL_error);
                    break;
                }
                break;
        }
    }
}
