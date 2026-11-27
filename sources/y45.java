// default package

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class y45 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final boolean f;

    public y45(JSONObject jSONObject) {
        String string = jSONObject.getString("address");
        this.a = string;
        if (string.contains(":") || !WalletEngine2.isValidAddress(string)) {
            lq5.j("Expected a friendly destination address");
            throw null;
        }
        this.f = (Base64.decode(string.replace('-', '+').replace('_', '/'), 2)[0] & Byte.MAX_VALUE) == 17;
        Object obj = jSONObject.get("amount");
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.matches("[0-9]+")) {
                long parseLong = Long.parseLong(str);
                this.e = parseLong;
                if (jSONObject.has("extra_currency") && jSONObject.getJSONObject("extra_currency").length() != 0) {
                    lq5.j("Extra currencies are not supported");
                    throw null;
                }
                if (parseLong < 0) {
                    lq5.j("Transfer amount must not be negative");
                    throw null;
                }
                String string2 = jSONObject.has("payload") ? jSONObject.getString("payload") : null;
                this.b = string2;
                String string3 = jSONObject.has("stateInit") ? jSONObject.getString("stateInit") : null;
                this.c = string3;
                if ((string2 == null || WalletEngine2.isValidCellBoc(string2)) && (string3 == null || WalletEngine2.isValidCellBoc(string3))) {
                    this.d = WalletEngine2.textCommentFromBody(string2);
                    return;
                } else {
                    lq5.j("Invalid transaction cell");
                    throw null;
                }
            }
        }
        lq5.j("Invalid transfer amount");
        throw null;
    }
}
