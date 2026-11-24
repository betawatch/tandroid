// default package

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yg4 implements kda {
    public final /* synthetic */ zg4 a;

    public yg4(zg4 zg4Var) {
        this.a = zg4Var;
    }

    @Override // kda
    public final void a(TLRPC.WebPage webPage, k47 k47Var) {
        ch4 ch4Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = ch4.t0;
        zv3.I0(ch4Var.M, k47Var, ch4Var.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // kda
    public final boolean b() {
        return !this.a.w.p0.u();
    }

    @Override // kda
    public final void c(String str, boolean z) {
        ch4 ch4Var = this.a.w;
        if (!z) {
            SpannableStringBuilder[] spannableStringBuilderArr = ch4.t0;
            ch4Var.g(str);
            return;
        }
        my0 i = wi8.i(ch4Var.L, false, 1, null);
        i.P = str;
        i.Q = false;
        CharSequence[] charSequenceArr = {jb6.M0(2131747550, null), jb6.M0(2131751704, null)};
        ff ffVar = new ff((Object) this, (Object) str, (byte) 5);
        i.M = charSequenceArr;
        i.L = ffVar;
        ch4Var.M.showDialog(i);
    }
}
