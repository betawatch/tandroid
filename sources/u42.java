// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u42 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c52 b;

    public /* synthetic */ u42(c52 c52Var, byte b) {
        this.a = b;
        this.b = c52Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        c52 c52Var = this.b;
        switch (b) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                TLRPC.User user = c52Var.r;
                if (!c52Var.L) {
                    c52Var.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        c52Var.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        c52Var.H = walletuseraddress.address;
                        c52Var.I = walletuseraddress.public_key;
                    }
                    c52Var.w.a(c52Var.H, user);
                    c52Var.i0();
                    c52Var.Y();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!c52Var.L && wallettransaction != null) {
                    c52Var.h0 = wallettransaction.fee;
                    c52Var.j0();
                    break;
                }
                break;
        }
    }
}
