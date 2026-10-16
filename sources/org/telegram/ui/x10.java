package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class x10 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ y10 a;

    public x10(y10 y10Var) {
        this.a = y10Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        b20 b20Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = b20.s0;
            b20Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) b20Var.K, (org.telegram.ui.ActionBar.c6) null, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        mg.j jVar = new mg.j(7, this, str);
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = jVar;
        b20Var.L.showDialog(e3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        b20 b20Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = b20.s0;
        org.telegram.ui.Components.hv.J(b20Var.L, messageObject, b20Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean c() {
        return !this.a.v.o0.g();
    }
}
