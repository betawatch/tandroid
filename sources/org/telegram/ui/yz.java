package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class yz implements org.telegram.ui.Cells.k7 {
    public final /* synthetic */ zz a;

    public yz(zz zzVar) {
        this.a = zzVar;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void a(String str, boolean z10) {
        c00 c00Var = this.a.w;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = c00.t0;
            c00Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.o10.j(c00Var.L, false, 1, null);
        j3.P = str;
        j3.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.N0(2131747623, null), org.telegram.messenger.hd.N0(2131751755, null)};
        og.j jVar = new og.j(7, this, str);
        j3.M = charSequenceArr;
        j3.L = jVar;
        c00Var.M.showDialog(j3);
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean b() {
        return !this.a.w.p0.V1();
    }

    @Override // org.telegram.ui.Cells.k7
    public final void c(TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar) {
        c00 c00Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = c00.t0;
        org.telegram.ui.Components.iu.O0(c00Var.M, gjVar, c00Var.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }
}
