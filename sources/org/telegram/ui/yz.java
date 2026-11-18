package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(c00Var.L, false, 1, null);
        j3.P = str;
        j3.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.M0(2131747624, null), org.telegram.messenger.gd.M0(2131751756, null)};
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
    public final void c(TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar) {
        c00 c00Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = c00.t0;
        org.telegram.ui.Components.gu.O0(c00Var.M, fjVar, c00Var.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }
}
