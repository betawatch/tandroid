package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh0 implements Runnable {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ String F;
    public final /* synthetic */ org.telegram.ui.web.x0 G;
    public final /* synthetic */ fi.d a;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ TLRPC.TL_urlAuthResultRequest c;
    public final /* synthetic */ TL_wallet.inputTonConnectOauthSession[] d;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth e;
    public final /* synthetic */ String[] f;
    public final /* synthetic */ org.telegram.ui.Cells.r8 h;
    public final /* synthetic */ boolean[] n;
    public final /* synthetic */ boolean[] r;
    public final /* synthetic */ int[] s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 x;
    public final /* synthetic */ String y;

    public /* synthetic */ zh0(fi.d dVar, fi.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.r8 r8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.v2 v2Var, String str, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, String str2, org.telegram.ui.web.x0 x0Var) {
        this.a = dVar;
        this.b = dVar2;
        this.c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f = strArr;
        this.h = r8Var;
        this.n = zArr;
        this.r = zArr2;
        this.s = iArr;
        this.w = zArr3;
        this.x = v2Var;
        this.y = str;
        this.D = f6Var;
        this.E = z9;
        this.F = str2;
        this.G = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final fi.d dVar = this.a;
        if (dVar.Q || this.b.Q) {
            return;
        }
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.c;
        boolean z9 = tL_urlAuthResultRequest.request_wallet;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
        if (z9 && inputtonconnectoauthsessionArr[0] == null) {
            return;
        }
        dVar.setLoading(true);
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
        org.telegram.ui.Cells.r8 r8Var = this.h;
        tL_messages_acceptUrlAuth.write_allowed = r8Var != null && r8Var.e.h;
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
        d3.b bVar = new d3.b(1);
        final boolean[] zArr = this.w;
        final org.telegram.ui.ActionBar.v2 v2Var = this.x;
        final String str2 = this.y;
        final org.telegram.ui.ActionBar.f6 f6Var = this.D;
        final boolean z10 = this.E;
        final String str3 = this.F;
        final org.telegram.ui.web.x0 x0Var = this.G;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, bVar, new org.telegram.messenger.v10() { // from class: org.telegram.ui.wh0
            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                fi.d.this.setLoading(false);
                TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                if (inputtonconnectoauthsession2 != null) {
                    Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                }
                zArr[0] = true;
                v2Var.dismiss();
                if (tL_error == null) {
                    bi0.b(z10, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, x0Var);
                    return;
                }
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    bi0.a().f0(tL_error, false);
                    return;
                }
                org.telegram.ui.Components.hc a10 = bi0.a();
                String M0 = org.telegram.messenger.hd.M0(2131753128, null);
                String str4 = str2;
                a10.I(R.raw.error, M0, TextUtils.isEmpty(str4) ? org.telegram.messenger.hd.M0(2131753129, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, f6Var), org.telegram.messenger.hd.a0(null, null, 2131753130, str4))).j();
            }
        });
    }
}
