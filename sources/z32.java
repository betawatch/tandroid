// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z32 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h42 b;

    public /* synthetic */ z32(h42 h42Var, byte b) {
        this.a = b;
        this.b = h42Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        h42 h42Var = this.b;
        switch (b) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                TLRPC.User user = h42Var.r;
                if (!h42Var.L) {
                    h42Var.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        h42Var.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        h42Var.H = walletuseraddress.address;
                        h42Var.I = walletuseraddress.public_key;
                    }
                    h42Var.w.a(h42Var.H, user);
                    h42Var.h0();
                    h42Var.X();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!h42Var.L && wallettransaction != null) {
                    h42Var.h0 = wallettransaction.fee;
                    h42Var.i0();
                    break;
                }
                break;
        }
    }
}
