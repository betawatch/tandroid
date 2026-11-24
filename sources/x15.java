// default package

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class x15 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;

    public /* synthetic */ x15(c cVar, byte b) {
        this.a = b;
        this.b = cVar;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        c cVar = this.b;
        switch (b) {
            case 0:
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                cVar.E = -1;
                if (existingbalance != null) {
                    cVar.i = Boolean.valueOf(existingbalance.has_balance);
                    cVar.j = existingbalance.url;
                }
                Boolean bool = cVar.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(cVar.j)) {
                    cVar.S();
                    break;
                }
                break;
            case 1:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                cVar.C = -1;
                if (walletState == null) {
                    StringBuilder sb = new StringBuilder("requesting gasless info: ");
                    sb.append(tL_error != null ? tL_error.text : "NULL_ERROR");
                    c.m(sb.toString());
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (walletState instanceof TL_wallet.TL_walletState) {
                        TL_wallet.WalletState walletState2 = cVar.e;
                        if ((walletState2 instanceof TL_wallet.TL_walletState) && cVar.l) {
                            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                            TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                            if (currentTimeMillis - cVar.k < 30000) {
                                tL_walletState2.balance = tL_walletState.balance;
                            } else {
                                cVar.l = false;
                            }
                            cVar.e = walletState;
                            cVar.U();
                            cVar.S();
                            break;
                        }
                    }
                    cVar.l = false;
                    cVar.e = walletState;
                    cVar.U();
                    cVar.S();
                }
                break;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                cVar.D = -1;
                if (updates != null) {
                    Utilities.d.c(new ve4(cVar, updates, (byte) 19));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    sb2.append(tL_error2 != null ? tL_error2.text : "NULL_ERROR");
                    c.m(sb2.toString());
                    break;
                }
        }
    }
}
