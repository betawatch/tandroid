// default package

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ypc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ FutureTask c;

    public /* synthetic */ ypc(AtomicBoolean atomicBoolean, FutureTask futureTask, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = futureTask;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        FutureTask futureTask = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                WalletEngine2.lambda$emulateSend$21(atomicBoolean, futureTask);
                break;
            default:
                WalletEngine2.lambda$emulateSendNFT$26(atomicBoolean, futureTask);
                break;
        }
    }
}
