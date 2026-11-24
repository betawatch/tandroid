// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class z15 implements Runnable {
    public final /* synthetic */ qac E;
    public final /* synthetic */ v45 F;
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qac d;
    public final /* synthetic */ TL_wallet.nftItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;
    public final /* synthetic */ byte[] n;
    public final /* synthetic */ long r;
    public final /* synthetic */ w25 s;
    public final /* synthetic */ v45 w;
    public final /* synthetic */ TLRPC.User x;
    public final /* synthetic */ String y;

    public /* synthetic */ z15(c cVar, String str, qac qacVar, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j, w25 w25Var, v45 v45Var, TLRPC.User user, String str4, qac qacVar2, v45 v45Var2, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = str;
        this.d = qacVar;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j;
        this.s = w25Var;
        this.w = v45Var;
        this.x = user;
        this.y = str4;
        this.E = qacVar2;
        this.F = v45Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                String str = this.c;
                qac qacVar = this.d;
                z15 z15Var = new z15(cVar, str, qacVar, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, this.E, this.F, (byte) 1);
                if (cVar.R() && !cVar.Q()) {
                    c.O("send " + str + ": asking passcode");
                    d S = LaunchActivity.S();
                    if (S != null) {
                        bh0 bh0Var = new bh0();
                        bh0Var.a = true;
                        boolean[] zArr = {false};
                        n25 n25Var = new n25(zArr, qacVar);
                        n25Var.W = new ve4(zArr, z15Var, (byte) 21);
                        S.showAsSheet(n25Var, bh0Var);
                        break;
                    } else {
                        qacVar.a("PASSCODE_FAILED");
                        break;
                    }
                } else {
                    z15Var.run();
                    break;
                }
                break;
            default:
                StringBuilder sb = new StringBuilder("send ");
                final String str2 = this.c;
                sb.append(str2);
                sb.append(": ready, get secret phrase");
                c.O(sb.toString());
                final c cVar2 = this.b;
                final qac qacVar2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j = this.r;
                final w25 w25Var = this.s;
                final v45 v45Var = this.w;
                final TLRPC.User user = this.x;
                final String str5 = this.y;
                final qac qacVar3 = this.E;
                final v45 v45Var2 = this.F;
                cVar2.E(false, true, true, new jac() { // from class: b25
                    /* JADX WARN: Removed duplicated region for block: B:49:0x0273  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x027f  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x029a  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x02b7  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x02e6  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0275  */
                    @Override // jac
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void a(Object obj, Object obj2) {
                        c cVar3;
                        TL_wallet.nftItem nftitem2;
                        b bVar;
                        c cVar4;
                        long j2;
                        byte[] bArr2;
                        v45 v45Var3;
                        String str6;
                        k47 k47Var;
                        qac qacVar4;
                        c cVar5;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo;
                        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2;
                        TL_wallet.nftItem nftitem3;
                        y25 y25Var = (y25) obj;
                        String str7 = (String) obj2;
                        c cVar6 = c.this;
                        int i = cVar6.a;
                        qac qacVar5 = qacVar2;
                        if (str7 != null) {
                            qacVar5.a(str7);
                            return;
                        }
                        if (y25Var == null) {
                            qacVar5.a("NULL_ERROR");
                            return;
                        }
                        if (cVar6.b == null) {
                            qacVar5.a("NULL_ENGINE");
                            return;
                        }
                        TL_wallet.nftItem nftitem4 = nftitem;
                        if (nftitem4 != null) {
                            if (!c.b(str3, cVar6.x())) {
                                qacVar5.a("WALLET_CHANGED");
                                return;
                            }
                        }
                        b G = cVar6.G();
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.incoming = false;
                        wallettransaction.pending = true;
                        String str8 = str4;
                        wallettransaction.comment = str8;
                        wallettransaction.comment_encrypted = false;
                        byte[] bArr3 = bArr;
                        wallettransaction.comment_encrypted_preparing = (nftitem4 != null || bArr3 == null || TextUtils.isEmpty(str8)) ? false : true;
                        wallettransaction.date = ConnectionsManager.getInstance(i).getCurrentTime();
                        long j3 = j;
                        wallettransaction.amount = j3;
                        wallettransaction.nft = nftitem4;
                        w25 w25Var2 = w25Var;
                        v45 v45Var4 = v45Var;
                        TLRPC.User user2 = user;
                        String str9 = str2;
                        if (w25Var2 == null || w25Var2.h == null) {
                            cVar3 = cVar6;
                            nftitem2 = nftitem4;
                            bVar = G;
                            if (v45Var4 == null || nftitem2 == null) {
                                wallettransaction.peer = c.h(user2, str9, str5);
                            } else {
                                TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                                wallettransactionpeertelegramgift.own_profile = user2 != null && user2.id == z8c.h(i).e();
                                wallettransaction.peer = wallettransactionpeertelegramgift;
                            }
                        } else {
                            TL_wallet.walletTransactionPeerOnchainGift wallettransactionpeeronchaingift = new TL_wallet.walletTransactionPeerOnchainGift();
                            cVar3 = cVar6;
                            TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction = w25Var2.h;
                            wallettransactionpeeronchaingift.action = walletOnchainGiftAction;
                            wallettransactionpeeronchaingift.address = gs7.a(walletOnchainGiftAction);
                            wallettransaction.peer = wallettransactionpeeronchaingift;
                            TL_stars.StarGift starGift = w25Var2.i;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                ArrayList arrayList = cVar3.A().b;
                                nftitem2 = nftitem4;
                                int size = arrayList.size();
                                bVar = G;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < size) {
                                        Object obj3 = arrayList.get(i2);
                                        int i3 = i2 + 1;
                                        int i4 = size;
                                        TL_wallet.nftItem nftitem5 = (TL_wallet.nftItem) obj3;
                                        if ((nftitem5.gift instanceof TL_stars.TL_starGiftUnique) && c.b(nftitem5.address, tL_starGiftUnique.gift_address)) {
                                            nftitem3 = nftitem5;
                                            break;
                                        } else {
                                            i2 = i3;
                                            size = i4;
                                        }
                                    } else {
                                        nftitem3 = new TL_wallet.nftItem();
                                        String str10 = tL_starGiftUnique.gift_address;
                                        if (str10 == null) {
                                            str10 = "";
                                        }
                                        nftitem3.address = str10;
                                        nftitem3.owner_address = "";
                                        nftitem3.index = "";
                                        nftitem3.name = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
                                        nftitem3.gift = tL_starGiftUnique;
                                    }
                                }
                            } else {
                                nftitem2 = nftitem4;
                                bVar = G;
                                nftitem3 = null;
                            }
                            wallettransaction.nft = nftitem3;
                            TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction2 = wallettransactionpeeronchaingift.action;
                            wallettransaction.amount = ((walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferAccept) || (walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferCancel)) ? 0L : -Math.abs(j3);
                        }
                        c cVar7 = cVar3;
                        xo1 xo1Var = new xo1(cVar7, wallettransaction, nftitem2, bVar, (byte) 24);
                        long nextLong = Utilities.b.nextLong();
                        wallettransaction.random_id = nextLong;
                        cVar7.p.add(0, wallettransaction);
                        if (nftitem2 != null) {
                            t25 A = cVar7.A();
                            A.c.add(wallettransaction);
                            A.j();
                            A.g();
                        }
                        bVar.k();
                        bVar.i();
                        cVar7.Z();
                        a6a B = a6a.B(i);
                        if (user2 != null) {
                            v45Var3 = v45Var4;
                            str6 = str8;
                            if (user2.id != z8c.h(i).e() && nftitem2 == null) {
                                String str11 = wallettransaction.comment;
                                boolean z = wallettransaction.comment_encrypted;
                                boolean z2 = wallettransaction.comment_encrypted_preparing;
                                bArr2 = bArr3;
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                cVar4 = cVar7;
                                int i5 = B.getUserConfig().i();
                                tL_messageService.id = i5;
                                tL_messageService.local_id = i5;
                                tL_messageService.random_id = nextLong;
                                j2 = nextLong;
                                tL_messageService.dialog_id = user2.id;
                                tL_messageService.out = true;
                                tL_messageService.unread = true;
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_messageService.from_id = tL_peerUser;
                                tL_peerUser.user_id = B.getUserConfig().e();
                                tL_messageService.flags |= 256;
                                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                tL_messageService.peer_id = tL_peerUser2;
                                tL_peerUser2.user_id = user2.id;
                                tL_messageService.date = B.getConnectionsManager().getCurrentTime();
                                tL_messageService.send_state = 1;
                                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = new TLRPC.TL_messageActionGramTransfer();
                                tL_messageActionGramTransfer.amount = j3;
                                tL_messageActionGramTransfer.peer_address = str9;
                                tL_messageActionGramTransfer.transaction_id = "";
                                tL_messageActionGramTransfer.comment = str11;
                                tL_messageActionGramTransfer.comment_encrypted = z;
                                tL_messageActionGramTransfer.comment_encrypted_preparing = z2;
                                tL_messageService.action = tL_messageActionGramTransfer;
                                B.getUserConfig().u(false);
                                k47 k47Var2 = new k47(B.currentAccount, tL_messageService, false, true);
                                k47Var2.X1 = true;
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(tL_messageService);
                                B.getMessagesStorage().g1(arrayList2, false, true, false, 0, false, 0, 0L);
                                B.getMessagesController().t5(0, user2.id, td4.u(k47Var2));
                                B.getNotificationCenter().k(3, new Object[0]);
                                B.e0(tL_messageService, false);
                                k47Var = k47Var2;
                                wallettransaction.localMessageId = k47Var != null ? 0 : k47Var.e1();
                                qacVar4 = qacVar3;
                                if (qacVar4 != null) {
                                    qacVar4.a(wallettransaction);
                                }
                                String str12 = null;
                                qacVar5.a(null);
                                cVar5 = cVar4;
                                tL_updateWalletGaslessInfo = cVar5.f;
                                if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                                    tL_updateWalletGaslessInfo2 = cVar5.f;
                                    if (tL_updateWalletGaslessInfo2.available) {
                                        str12 = tL_updateWalletGaslessInfo2.relayer_address;
                                    }
                                }
                                c.O("prepare sending");
                                long j4 = j2;
                                TL_wallet.nftItem nftitem6 = nftitem2;
                                final i25 i25Var = new i25(cVar5, xo1Var, B, k47Var, wallettransaction, str9, bVar, j4, user2);
                                WalletEngine2 walletEngine2 = cVar5.b;
                                if (v45Var3 == null) {
                                    v45 v45Var5 = v45Var2;
                                    if (v45Var5 != null) {
                                        final byte b = 0;
                                        walletEngine2.prepareTonConnectTransferPair(y25Var, v45Var3, v45Var5, kt6.n(j4, "prepared:"), new jac() { // from class: j25
                                            @Override // jac
                                            public final void a(Object obj4, Object obj5) {
                                                byte b2 = b;
                                                i25 i25Var2 = i25Var;
                                                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                                String str13 = (String) obj5;
                                                switch (b2) {
                                                    case 0:
                                                        i25Var2.a(sendtransfer, null, str13);
                                                        break;
                                                    case 1:
                                                        i25Var2.a(sendtransfer, null, str13);
                                                        break;
                                                    default:
                                                        i25Var2.a(sendtransfer, null, str13);
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    } else {
                                        final byte b2 = 1;
                                        walletEngine2.prepareTonConnectTransfer(y25Var, v45Var3, kt6.n(j4, "deposit:"), new jac() { // from class: j25
                                            @Override // jac
                                            public final void a(Object obj4, Object obj5) {
                                                byte b22 = b2;
                                                i25 i25Var2 = i25Var;
                                                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                                String str13 = (String) obj5;
                                                switch (b22) {
                                                    case 0:
                                                        i25Var2.a(sendtransfer, null, str13);
                                                        break;
                                                    case 1:
                                                        i25Var2.a(sendtransfer, null, str13);
                                                        break;
                                                    default:
                                                        i25Var2.a(sendtransfer, null, str13);
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                                if (nftitem6 == null) {
                                    walletEngine2.prepareSend(y25Var, str9, j3, str6, bArr2, str12, i25Var);
                                    return;
                                } else {
                                    String str13 = nftitem6.address;
                                    final byte b3 = 2;
                                    walletEngine2.prepareSendNFT(y25Var, str9, str13, str6, new jac() { // from class: j25
                                        @Override // jac
                                        public final void a(Object obj4, Object obj5) {
                                            byte b22 = b3;
                                            i25 i25Var2 = i25Var;
                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                                            String str132 = (String) obj5;
                                            switch (b22) {
                                                case 0:
                                                    i25Var2.a(sendtransfer, null, str132);
                                                    break;
                                                case 1:
                                                    i25Var2.a(sendtransfer, null, str132);
                                                    break;
                                                default:
                                                    i25Var2.a(sendtransfer, null, str132);
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            cVar4 = cVar7;
                            j2 = nextLong;
                            bArr2 = bArr3;
                        } else {
                            cVar4 = cVar7;
                            j2 = nextLong;
                            bArr2 = bArr3;
                            v45Var3 = v45Var4;
                            str6 = str8;
                        }
                        k47Var = null;
                        wallettransaction.localMessageId = k47Var != null ? 0 : k47Var.e1();
                        qacVar4 = qacVar3;
                        if (qacVar4 != null) {
                        }
                        String str122 = null;
                        qacVar5.a(null);
                        cVar5 = cVar4;
                        tL_updateWalletGaslessInfo = cVar5.f;
                        if (tL_updateWalletGaslessInfo != null) {
                            tL_updateWalletGaslessInfo2 = cVar5.f;
                            if (tL_updateWalletGaslessInfo2.available) {
                            }
                        }
                        c.O("prepare sending");
                        long j42 = j2;
                        TL_wallet.nftItem nftitem62 = nftitem2;
                        final i25 i25Var2 = new i25(cVar5, xo1Var, B, k47Var, wallettransaction, str9, bVar, j42, user2);
                        WalletEngine2 walletEngine22 = cVar5.b;
                        if (v45Var3 == null) {
                        }
                    }
                });
                break;
        }
    }
}
