// default package

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class s25 {
    public final TL_wallet.tonConnectSession a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final v25 f;
    public final byte[] g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public Runnable r;

    public s25(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        this.a = tonconnectpending.session;
        this.b = tonconnectrequest.msg_id;
        this.c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.l = optInt;
        String str2 = null;
        this.j = jSONObject.optString("errorMessage", null);
        this.f = (optInt >= 0 || !jSONObject.has("transaction")) ? null : new v25(jSONObject.getJSONObject("transaction"));
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.k = str2;
        this.h = str;
        this.g = (byte[]) bArr.clone();
    }
}
