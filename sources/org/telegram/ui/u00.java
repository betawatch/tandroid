package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u00 implements org.telegram.ui.Cells.n7 {
    public final /* synthetic */ v00 a;

    public u00(v00 v00Var) {
        this.a = v00Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final void a(String str, boolean z10) {
        y00 y00Var = this.a.w;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = y00.s0;
            y00Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(y00Var.K, false, 1, null);
        h.O = str;
        h.P = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.dd.L0(2131747833, null), org.telegram.messenger.dd.L0(2131751767, null)};
        eg.j jVar = new eg.j(8, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        y00Var.L.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.n7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.kj kjVar) {
        y00 y00Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = y00.s0;
        org.telegram.ui.Components.hu.K0(y00Var.L, kjVar, y00Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean c() {
        return !this.a.w.o0.f();
    }
}
