package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class y10 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ z10 a;

    public y10(z10 z10Var) {
        this.a = z10Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        c20 c20Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = c20.s0;
            c20Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) c20Var.K, (org.telegram.ui.ActionBar.c6) null, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        mg.j jVar = new mg.j(7, this, str);
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = jVar;
        c20Var.L.showDialog(e3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        c20 c20Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = c20.s0;
        org.telegram.ui.Components.hv.J(c20Var.L, messageObject, c20Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean c() {
        return !this.a.v.o0.g();
    }
}
