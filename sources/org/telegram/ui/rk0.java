package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk0 implements Runnable {
    public final /* synthetic */ org.telegram.ui.web.y0 A;
    public final /* synthetic */ kh.d a;
    public final /* synthetic */ kh.d b;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ org.telegram.ui.Cells.t8 e;
    public final /* synthetic */ boolean[] f;
    public final /* synthetic */ int[] h;
    public final /* synthetic */ boolean[] n;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 r;
    public final /* synthetic */ String s;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ String x;
    public final /* synthetic */ TLRPC.TL_urlAuthResultRequest y;

    public /* synthetic */ rk0(kh.d dVar, kh.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.t8 t8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.f3 f3Var, String str, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.y0 y0Var) {
        this.a = dVar;
        this.b = dVar2;
        this.c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.e = t8Var;
        this.f = zArr;
        this.h = iArr;
        this.n = zArr2;
        this.r = f3Var;
        this.s = str;
        this.v = b6Var;
        this.w = z10;
        this.x = str2;
        this.y = tL_urlAuthResultRequest;
        this.A = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kh.d dVar = this.a;
        if (dVar.J || this.b.J) {
            return;
        }
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.c;
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
        String str = this.d[0];
        if (str != null) {
            tL_messages_acceptUrlAuth.match_code = str;
        }
        org.telegram.ui.Cells.t8 t8Var = this.e;
        tL_messages_acceptUrlAuth.write_allowed = t8Var != null && t8Var.e.h;
        tL_messages_acceptUrlAuth.share_phone_number = this.f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
        final boolean[] zArr = this.n;
        final org.telegram.ui.ActionBar.f3 f3Var = this.r;
        final String str2 = this.s;
        final org.telegram.ui.ActionBar.b6 b6Var = this.v;
        final boolean z10 = this.w;
        final String str3 = this.x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.y;
        final org.telegram.ui.web.y0 y0Var = this.A;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.mk0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                zArr[0] = true;
                f3Var.dismiss();
                if (tL_error == null) {
                    tk0.b(z10, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, y0Var);
                    return;
                }
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    tk0.a().d0(tL_error, false);
                    return;
                }
                org.telegram.ui.Components.oc a2 = tk0.a();
                int i9 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                String str4 = str2;
                a2.M(string, TextUtils.isEmpty(str4) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var)), i9).j();
            }
        });
    }
}
