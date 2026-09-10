package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v10 implements org.telegram.ui.Cells.n7 {
    public final /* synthetic */ w10 a;

    public v10(w10 w10Var) {
        this.a = w10Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final void a(String str, boolean z10) {
        z10 z10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = z10.s0;
            z10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) z10Var.K, (org.telegram.ui.ActionBar.f6) null, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        kg.j jVar = new kg.j(8, this, str);
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = jVar;
        z10Var.L.showDialog(h3Var);
    }

    @Override // org.telegram.ui.Cells.n7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        z10 z10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = z10.s0;
        org.telegram.ui.Components.zu.J(z10Var.L, messageObject, z10Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean e() {
        return !this.a.v.o0.f();
    }
}
