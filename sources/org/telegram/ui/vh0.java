package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ gi.d b;
    public final /* synthetic */ gi.d c;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth d;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ TLRPC.UrlAuthResult h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ org.telegram.ui.web.w0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 m;

    public /* synthetic */ vh0(int[] iArr, gi.d dVar, gi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.t2 t2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.w0 w0Var, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = iArr;
        this.b = dVar;
        this.c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = t2Var;
        this.f = z10;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z11;
        this.k = w0Var;
        this.l = str2;
        this.m = e6Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int[] iArr = this.a;
        gi.d dVar = this.b;
        gi.d dVar2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.t2 t2Var = this.e;
        final boolean z10 = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z11 = this.j;
        final org.telegram.ui.web.w0 w0Var = this.k;
        final String str2 = this.l;
        final org.telegram.ui.ActionBar.e6 e6Var = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] == num.intValue() || dVar.R || dVar2.R) {
            return;
        }
        final org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, org.telegram.messenger.t0.b, null);
        s1Var.r(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new c3.b(1), new org.telegram.messenger.n10() { // from class: org.telegram.ui.sh0
            @Override // org.telegram.messenger.n10
            public final void a(Object obj2, Object obj3) {
                TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.s1.this.dismiss();
                org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                if (urlAuthResult2 != null) {
                    t2Var2.dismiss();
                    yh0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, w0Var);
                } else if (tL_error != null) {
                    if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Cells.f1.v(t2Var2.F, t2Var2.J0, tL_error, false);
                        return;
                    }
                    t2Var2.dismiss();
                    org.telegram.ui.Components.fc a10 = yh0.a();
                    String M0 = org.telegram.messenger.bd.M0(2131753128, null);
                    String str3 = str2;
                    a10.I(R.raw.error, M0, TextUtils.isEmpty(str3) ? org.telegram.messenger.bd.M0(2131753129, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var), org.telegram.messenger.bd.a0(null, null, 2131753130, str3))).j();
                }
            }
        });
    }
}
