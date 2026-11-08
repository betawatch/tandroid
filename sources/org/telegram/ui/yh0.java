package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yh0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ fi.d c;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth d;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ TLRPC.UrlAuthResult h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ org.telegram.ui.web.x0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 m;

    public /* synthetic */ yh0(int[] iArr, fi.d dVar, fi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.v2 v2Var, boolean z9, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z10, org.telegram.ui.web.x0 x0Var, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = iArr;
        this.b = dVar;
        this.c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = v2Var;
        this.f = z9;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z10;
        this.k = x0Var;
        this.l = str2;
        this.m = f6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int[] iArr = this.a;
        fi.d dVar = this.b;
        fi.d dVar2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.v2 v2Var = this.e;
        final boolean z9 = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z10 = this.j;
        final org.telegram.ui.web.x0 x0Var = this.k;
        final String str2 = this.l;
        final org.telegram.ui.ActionBar.f6 f6Var = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] == num.intValue() || dVar.Q || dVar2.Q) {
            return;
        }
        final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.b, null);
        u1Var.r(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.v10() { // from class: org.telegram.ui.vh0
            @Override // org.telegram.messenger.v10
            public final void a(Object obj2, Object obj3) {
                TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.u1.this.dismiss();
                org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                if (urlAuthResult2 != null) {
                    v2Var2.dismiss();
                    bi0.b(z9, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z10, x0Var);
                } else if (tL_error != null) {
                    if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Cells.f1.r(v2Var2.E, v2Var2.I0, tL_error, false);
                        return;
                    }
                    v2Var2.dismiss();
                    org.telegram.ui.Components.hc a10 = bi0.a();
                    String M0 = org.telegram.messenger.id.M0(2131753128, null);
                    String str3 = str2;
                    a10.I(R.raw.error, M0, TextUtils.isEmpty(str3) ? org.telegram.messenger.id.M0(2131753129, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, f6Var), org.telegram.messenger.id.a0(null, null, 2131753130, str3))).j();
                }
            }
        });
    }
}
