// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.a;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class u25 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a b;

    public /* synthetic */ u25(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.tgnet.TLRPC$TL_error] */
    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        a aVar = this.b;
        switch (b) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                c cVar = aVar.d;
                if (importedWalletProof != null) {
                    TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                    disablebackup.new_public_key = aVar.c;
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    disablebackup.proof = walletownershipproof;
                    walletownershipproof.signature = importedWalletProof.signature;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    ConnectionsManager.getInstance(cVar.a).sendRequestTyped(disablebackup, new kc((byte) 0), new u25(aVar, (byte) 1));
                    break;
                } else {
                    c.m("disable backup: failed to prove challenge: ".concat(str != null ? str : "NULL_ERROR"));
                    break;
                }
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                ?? r5 = (TLRPC.TL_error) obj2;
                c cVar2 = aVar.d;
                if (walletState != null) {
                    cVar2.w0(walletState);
                    cVar2.Y();
                    gm.d3(new bn3((byte) 8), 1000L);
                    break;
                } else {
                    StringBuilder sb = new StringBuilder("disable backup: failed to disable backup on server: ");
                    sb.append((Object) (r5 != 0 ? r5 : "NULL_ERROR"));
                    c.m(sb.toString());
                    break;
                }
        }
    }
}
