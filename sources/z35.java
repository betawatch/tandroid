// default package

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z35 implements icc {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ a55 b;
    public final /* synthetic */ TL_wallet.tonConnectSession c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ z35(a55 a55Var, qe2 qe2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = a55Var;
        this.f = qe2Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        a55 a55Var = this.b;
        switch (b) {
            case 0:
                v35 v35Var = (v35) this.f;
                c35 c35Var = (c35) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                v45 v45Var = (v45) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a55Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new nn0((Object) a55Var, (Object) c35Var, (Object) tonconnectsession, (Object) str, (Object) bArr, (Object) v45Var, (Object) tonconnectchallenge, (Object) v35Var, (byte) 4));
                    break;
                } else {
                    v35Var.a(a55.z(tL_error, "registerKey"));
                    break;
                }
            default:
                qe2 qe2Var = (qe2) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                c35 c35Var2 = (c35) obj;
                String str3 = (String) obj2;
                a55Var.getClass();
                if (str3 == null && c35Var2 != null) {
                    c35 b2 = c35Var2.b();
                    Utilities.e.c(new nn0((Object) a55Var, (Object) b2, (Object) tonconnectsession2, (Object) str2, (Object) bArr2, (Object) jSONArray, (Object) tL_urlAuthResultRequest, (Object) new qe2(b2, qe2Var, (byte) 23), (byte) 5));
                    break;
                } else {
                    if (str3 == null) {
                        str3 = "Recovery phrase is unavailable";
                    }
                    qe2Var.a(null, str3);
                    break;
                }
        }
    }

    public /* synthetic */ z35(a55 a55Var, v35 v35Var, c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, v45 v45Var) {
        this.b = a55Var;
        this.f = v35Var;
        this.g = c35Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = v45Var;
    }
}
