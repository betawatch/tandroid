// default package

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vnc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ i8c c;

    public /* synthetic */ vnc(AtomicBoolean atomicBoolean, i8c i8cVar, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = i8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i8c i8cVar = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(atomicBoolean, i8cVar);
                break;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(atomicBoolean, i8cVar);
                break;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(atomicBoolean, i8cVar);
                break;
        }
    }
}
