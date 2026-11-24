// default package

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class t15 implements i8c {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ w25 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ t15(w25 w25Var, ae2 ae2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = w25Var;
        this.f = ae2Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        w25 w25Var = this.b;
        switch (b) {
            case 0:
                x15 x15Var = (x15) this.f;
                y05 y05Var = (y05) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                r25 r25Var = (r25) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w25Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new ln0((Object) w25Var, (Object) y05Var, (Object) tonconnectsession, (Object) str, (Object) bArr, (Object) r25Var, (Object) tonconnectchallenge, (Object) x15Var, (byte) 4));
                    break;
                } else {
                    x15Var.a(w25.z(tL_error, "registerKey"));
                    break;
                }
            default:
                ae2 ae2Var = (ae2) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                y05 y05Var2 = (y05) obj;
                String str3 = (String) obj2;
                w25Var.getClass();
                if (str3 == null && y05Var2 != null) {
                    y05 b2 = y05Var2.b();
                    Utilities.e.c(new ln0((Object) w25Var, (Object) b2, (Object) tonconnectsession2, (Object) str2, (Object) bArr2, (Object) jSONArray, (Object) tL_urlAuthResultRequest, (Object) new ae2(b2, ae2Var, (byte) 24), (byte) 5));
                    break;
                } else {
                    if (str3 == null) {
                        str3 = "Recovery phrase is unavailable";
                    }
                    ae2Var.a(null, str3);
                    break;
                }
        }
    }

    public /* synthetic */ t15(w25 w25Var, x15 x15Var, y05 y05Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, r25 r25Var) {
        this.b = w25Var;
        this.f = x15Var;
        this.g = y05Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = r25Var;
    }
}
