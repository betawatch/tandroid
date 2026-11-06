package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class uz implements org.telegram.ui.Cells.j7 {
    public final /* synthetic */ vz a;

    public uz(vz vzVar) {
        this.a = vzVar;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a(String str, boolean z9) {
        yz yzVar = this.a.w;
        if (!z9) {
            SpannableStringBuilder[] spannableStringBuilderArr = yz.s0;
            yzVar.g(str);
            return;
        }
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(yzVar.K, false, 1, null);
        h.O = str;
        h.P = false;
        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131747816, null), org.telegram.messenger.hd.M0(2131751767, null)};
        og.j jVar = new og.j(7, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        yzVar.L.showDialog(h);
    }

    @Override // org.telegram.ui.Cells.j7
    public final void b(TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar) {
        yz yzVar = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = yz.s0;
        org.telegram.ui.Components.vt.N0(yzVar.L, ijVar, yzVar.g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d() {
        return !this.a.w.o0.i();
    }
}
