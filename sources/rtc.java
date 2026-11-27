// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rtc implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ euc b;

    public /* synthetic */ rtc(euc eucVar, byte b) {
        this.a = b;
        this.b = eucVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        euc eucVar = this.b;
        switch (b) {
            case 0:
                eucVar.p0((TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (wallettransaction != null) {
                    eucVar.f0 = wallettransaction.fee;
                    eucVar.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                eucVar.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    eucVar.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        eucVar.h = walletuseraddress.address;
                    }
                    wa waVar = eucVar.a;
                    if (waVar != null) {
                        waVar.g3.O(true);
                    }
                    eucVar.C0();
                    eucVar.r0();
                    ktc ktcVar = eucVar.w;
                    if (ktcVar != null) {
                        ktcVar.a(eucVar.h, eucVar.f);
                        break;
                    }
                } else {
                    eucVar.finishFragment();
                    break;
                }
                break;
            case 3:
                eucVar.h0 = (String) obj;
                eucVar.i0 = ((Boolean) obj2).booleanValue();
                eucVar.Q.setText(eucVar.h0);
                eucVar.Q.setVisibility(TextUtils.isEmpty(eucVar.h0) ? 8 : 0);
                eucVar.E0();
                break;
            default:
                eucVar.h0 = (String) obj;
                eucVar.i0 = ((Boolean) obj2).booleanValue();
                eucVar.Q.setText(eucVar.h0);
                eucVar.Q.setVisibility(TextUtils.isEmpty(eucVar.h0) ? 8 : 0);
                eucVar.E0();
                break;
        }
    }
}
