package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vz implements org.telegram.ui.Cells.i7 {
    public final /* synthetic */ wz a;

    public vz(wz wzVar) {
        this.a = wzVar;
    }

    @Override // org.telegram.ui.Cells.i7
    public final void a(String str, boolean z10) {
        zz zzVar = this.a.w;
        if (!z10) {
            SpannableStringBuilder[] spannableStringBuilderArr = zz.t0;
            zzVar.g(str);
            return;
        }
        org.telegram.ui.ActionBar.u2 i7 = org.telegram.messenger.i20.i(zzVar.L, false, 1, null);
        i7.P = str;
        i7.Q = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131747817, null), org.telegram.messenger.hd.M0(2131751767, null)};
        og.j jVar = new og.j(7, this, str);
        i7.M = charSequenceArr;
        i7.L = jVar;
        zzVar.M.showDialog(i7);
    }

    @Override // org.telegram.ui.Cells.i7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar) {
        zz zzVar = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = zz.t0;
        org.telegram.ui.Components.bu.N0(zzVar.M, gjVar, zzVar.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean c() {
        return !this.a.w.p0.g0();
    }
}
