package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sz implements org.telegram.ui.Cells.i7 {
    public final /* synthetic */ tz a;

    public sz(tz tzVar) {
        this.a = tzVar;
    }

    @Override // org.telegram.ui.Cells.i7
    public final void a(String str, boolean z10) {
        wz wzVar = this.a.w;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = wz.t0;
            wzVar.g(str);
            return;
        }
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(wzVar.L, false, 1, null);
        h.P = str;
        h.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131747825, null), org.telegram.messenger.bd.M0(2131751767, null)};
        u uVar = new u(6, this, str);
        h.M = charSequenceArr;
        h.L = uVar;
        wzVar.M.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.i7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.zi ziVar) {
        wz wzVar = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = wz.t0;
        org.telegram.ui.Components.ut.K0(wzVar.M, ziVar, wzVar.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean c() {
        return !this.a.w.p0.I();
    }
}
