// default package

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class xpc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ jac c;

    public /* synthetic */ xpc(AtomicBoolean atomicBoolean, jac jacVar, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = jacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jac jacVar = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(atomicBoolean, jacVar);
                break;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(atomicBoolean, jacVar);
                break;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(atomicBoolean, jacVar);
                break;
        }
    }
}
