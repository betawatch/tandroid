// default package

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class sq7 implements Runnable {
    public final /* synthetic */ vnb E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;
    public final /* synthetic */ rv0 H;
    public final /* synthetic */ c51 a;
    public final /* synthetic */ c51 b;
    public final /* synthetic */ TLRPC.TL_urlAuthResultRequest c;
    public final /* synthetic */ TL_wallet.inputTonConnectOauthSession[] d;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth e;
    public final /* synthetic */ String[] f;
    public final /* synthetic */ wkb h;
    public final /* synthetic */ boolean[] n;
    public final /* synthetic */ boolean[] r;
    public final /* synthetic */ int[] s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ nx0 x;
    public final /* synthetic */ String y;

    public /* synthetic */ sq7(c51 c51Var, c51 c51Var2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, wkb wkbVar, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, nx0 nx0Var, String str, vnb vnbVar, boolean z, String str2, rv0 rv0Var) {
        this.a = c51Var;
        this.b = c51Var2;
        this.c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f = strArr;
        this.h = wkbVar;
        this.n = zArr;
        this.r = zArr2;
        this.s = iArr;
        this.w = zArr3;
        this.x = nx0Var;
        this.y = str;
        this.E = vnbVar;
        this.F = z;
        this.G = str2;
        this.H = rv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c51 c51Var = this.a;
        if (c51Var.R || this.b.R) {
            return;
        }
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.c;
        boolean z = tL_urlAuthResultRequest.request_wallet;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
        byte b = 0;
        if (z && inputtonconnectoauthsessionArr[0] == null) {
            return;
        }
        c51Var.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.e;
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 2)) {
            tL_messages_acceptUrlAuth.flags |= 2;
            tL_messages_acceptUrlAuth.peer = tL_messages_requestUrlAuth.peer;
            tL_messages_acceptUrlAuth.msg_id = tL_messages_requestUrlAuth.msg_id;
            tL_messages_acceptUrlAuth.button_id = tL_messages_requestUrlAuth.button_id;
        }
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 4)) {
            tL_messages_acceptUrlAuth.flags |= 4;
            tL_messages_acceptUrlAuth.url = tL_messages_requestUrlAuth.url;
        }
        String str = this.f[0];
        if (str != null) {
            tL_messages_acceptUrlAuth.match_code = str;
        }
        wkb wkbVar = this.h;
        tL_messages_acceptUrlAuth.write_allowed = wkbVar != null && wkbVar.e.h;
        tL_messages_acceptUrlAuth.share_phone_number = this.n[0];
        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
        tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
        inputtonconnectoauthsessionArr[0] = null;
        if (this.r[0]) {
            if (inputtonconnectoauthsession != null) {
                Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                return;
            }
            return;
        }
        final int[] iArr = this.s;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ic icVar = new ic(b);
        final boolean[] zArr = this.w;
        final nx0 nx0Var = this.x;
        final String str2 = this.y;
        final vnb vnbVar = this.E;
        final boolean z2 = this.F;
        final String str3 = this.G;
        final rv0 rv0Var = this.H;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, icVar, new icc() { // from class: oq7
            @Override // icc
            public final void a(Object obj, Object obj2) {
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c51.this.setLoading(false);
                TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                if (inputtonconnectoauthsession2 != null) {
                    Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                }
                zArr[0] = true;
                nx0Var.dismiss();
                if (tL_error == null) {
                    uq7.b(z2, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, rv0Var);
                    return;
                }
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    uq7.a().g0(tL_error, false);
                    return;
                }
                d31 a = uq7.a();
                String M0 = ob6.M0(2131753121, null);
                String str4 = str2;
                a.I(R.raw.error, M0, TextUtils.isEmpty(str4) ? ob6.M0(2131753122, null) : hl.L2(aob.v0(aob.xj, vnbVar), ob6.a0(null, null, 2131753123, str4))).j();
            }
        });
    }
}
