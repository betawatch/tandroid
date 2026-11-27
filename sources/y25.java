// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.a;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y25 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a b;

    public /* synthetic */ y25(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.tgnet.TLRPC$TL_error] */
    @Override // icc
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
                    ConnectionsManager.getInstance(cVar.a).sendRequestTyped(disablebackup, new ic((byte) 0), new y25(aVar, (byte) 1));
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
                    cVar2.z0(walletState);
                    cVar2.Z();
                    hl.d3(new jm3((byte) 10), 1000L);
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
