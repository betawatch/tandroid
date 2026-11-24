// default package

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class we4 implements kba {
    public final /* synthetic */ xe4 a;

    public we4(xe4 xe4Var) {
        this.a = xe4Var;
    }

    @Override // kba
    public final void a(TLRPC.WebPage webPage, k27 k27Var) {
        af4 af4Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = af4.t0;
        ou3.I0(af4Var.M, k27Var, af4Var.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // kba
    public final boolean b() {
        return !this.a.w.p0.t();
    }

    @Override // kba
    public final void c(String str, boolean z) {
        af4 af4Var = this.a.w;
        if (!z) {
            SpannableStringBuilder[] spannableStringBuilderArr = af4.t0;
            af4Var.g(str);
            return;
        }
        fx0 i = ug8.i(af4Var.L, false, 1, null);
        i.P = str;
        i.Q = false;
        CharSequence[] charSequenceArr = {k96.M0(2131747624, null), k96.M0(2131751755, null)};
        fe feVar = new fe((Object) this, (Object) str, (byte) 5);
        i.M = charSequenceArr;
        i.L = feVar;
        af4Var.M.showDialog(i);
    }
}
