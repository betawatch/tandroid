package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v10 implements org.telegram.ui.Cells.m7 {
    public final /* synthetic */ w10 a;

    public v10(w10 w10Var) {
        this.a = w10Var;
    }

    @Override // org.telegram.ui.Cells.m7
    public final void a(String str, boolean z10) {
        z10 z10Var = this.a.v;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = z10.s0;
            z10Var.g(str);
            return;
        }
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) z10Var.K, (org.telegram.ui.ActionBar.f6) null, false);
        g3Var.fixNavigationBar();
        g3Var.title = str;
        g3Var.bigTitle = false;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        lg.j jVar = new lg.j(7, this, str);
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = jVar;
        z10Var.L.showDialog(g3Var);
    }

    @Override // org.telegram.ui.Cells.m7
    public final void b(TLRPC.WebPage webPage, MessageObject messageObject) {
        z10 z10Var = this.a.v;
        SpannableStringBuilder[] spannableStringBuilderArr = z10.s0;
        org.telegram.ui.Components.vu.J(z10Var.L, messageObject, z10Var.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.m7
    public final boolean e() {
        return !this.a.v.o0.g();
    }
}
