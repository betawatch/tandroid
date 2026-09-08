package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t10 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ u10 a;

    public t10(u10 u10Var) {
        this.a = u10Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        x10 x10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = x10.s0;
            x10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) x10Var.K, (org.telegram.ui.ActionBar.f6) null, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        mg.j jVar = new mg.j(7, this, str);
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = jVar;
        x10Var.L.showDialog(f3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        x10 x10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = x10.s0;
        org.telegram.ui.Components.tu.J(x10Var.L, messageObject, x10Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean c() {
        return !this.a.v.o0.g();
    }
}
