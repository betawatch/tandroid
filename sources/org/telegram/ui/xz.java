package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xz implements org.telegram.ui.Cells.j7 {
    public final /* synthetic */ yz a;

    public xz(yz yzVar) {
        this.a = yzVar;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a(String str, boolean z9) {
        b00 b00Var = this.a.w;
        if (!z9) {
            SpannableStringBuilder[] spannableStringBuilderArr = b00.s0;
            b00Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(b00Var.K, false, 1, null);
        h.O = str;
        h.P = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131747817, null), org.telegram.messenger.id.M0(2131751767, null)};
        og.j jVar = new og.j(7, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        b00Var.L.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.j7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        b00 b00Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = b00.s0;
        org.telegram.ui.Components.vt.N0(b00Var.L, ijVar, b00Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d() {
        return !this.a.w.o0.i();
    }
}
