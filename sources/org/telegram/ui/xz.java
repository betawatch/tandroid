package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xz implements org.telegram.ui.Cells.j7 {
    public final /* synthetic */ yz a;

    public xz(yz yzVar) {
        this.a = yzVar;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a(String str, boolean z10) {
        b00 b00Var = this.a.w;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = b00.t0;
            b00Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(b00Var.L, false, 1, null);
        j3.P = str;
        j3.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131747623, null), org.telegram.messenger.gd.N0(2131751755, null)};
        og.j jVar = new og.j(7, this, str);
        j3.M = charSequenceArr;
        j3.L = jVar;
        b00Var.M.showDialog(j3);
    }

    @Override // org.telegram.ui.Cells.j7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar) {
        b00 b00Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = b00.t0;
        org.telegram.ui.Components.gu.O0(b00Var.M, fjVar, b00Var.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d() {
        return !this.a.w.p0.i0();
    }
}
