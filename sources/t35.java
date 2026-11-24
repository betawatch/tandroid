// default package

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class t35 implements jac {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ w45 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ t35(w45 w45Var, lf2 lf2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = w45Var;
        this.f = lf2Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        w45 w45Var = this.b;
        switch (b) {
            case 0:
                u35 u35Var = (u35) this.f;
                y25 y25Var = (y25) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                r45 r45Var = (r45) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w45Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new lo0((Object) w45Var, (Object) y25Var, (Object) tonconnectsession, (Object) str, (Object) bArr, (Object) r45Var, (Object) tonconnectchallenge, (Object) u35Var, (byte) 4));
                    break;
                } else {
                    u35Var.a(w45.z(tL_error, "registerKey"));
                    break;
                }
            default:
                lf2 lf2Var = (lf2) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                y25 y25Var2 = (y25) obj;
                String str3 = (String) obj2;
                w45Var.getClass();
                if (str3 == null && y25Var2 != null) {
                    y25 b2 = y25Var2.b();
                    Utilities.e.c(new lo0((Object) w45Var, (Object) b2, (Object) tonconnectsession2, (Object) str2, (Object) bArr2, (Object) jSONArray, (Object) tL_urlAuthResultRequest, (Object) new lf2(b2, lf2Var, (byte) 26), (byte) 5));
                    break;
                } else {
                    if (str3 == null) {
                        str3 = "Recovery phrase is unavailable";
                    }
                    lf2Var.a(null, str3);
                    break;
                }
        }
    }

    public /* synthetic */ t35(w45 w45Var, u35 u35Var, y25 y25Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, r45 r45Var) {
        this.b = w45Var;
        this.f = u35Var;
        this.g = y25Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = r45Var;
    }
}
