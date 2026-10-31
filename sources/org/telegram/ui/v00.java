package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v00 implements org.telegram.ui.Cells.n7 {
    public final /* synthetic */ w00 a;

    public v00(w00 w00Var) {
        this.a = w00Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final void a(String str, boolean z10) {
        z00 z00Var = this.a.w;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = z00.s0;
            z00Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(z00Var.K, false, 1, null);
        h.O = str;
        h.P = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131747833, null), org.telegram.messenger.cd.L0(2131751767, null)};
        eg.j jVar = new eg.j(8, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        z00Var.L.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.n7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.jj jjVar) {
        z00 z00Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = z00.s0;
        org.telegram.ui.Components.hu.K0(z00Var.L, jjVar, z00Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean c() {
        return !this.a.w.o0.f();
    }
}
