package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wz implements org.telegram.ui.Cells.j7 {
    public final /* synthetic */ xz a;

    public wz(xz xzVar) {
        this.a = xzVar;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a(String str, boolean z9) {
        a00 a00Var = this.a.w;
        if (!z9) {
            SpannableStringBuilder[] spannableStringBuilderArr = a00.s0;
            a00Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(a00Var.K, false, 1, null);
        h.O = str;
        h.P = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131747817, null), org.telegram.messenger.id.M0(2131751767, null)};
        og.j jVar = new og.j(7, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        a00Var.L.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.j7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        a00 a00Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = a00.s0;
        org.telegram.ui.Components.wt.N0(a00Var.L, ijVar, a00Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d() {
        return !this.a.w.o0.i();
    }
}
