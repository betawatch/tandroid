// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rda implements kba {
    public final /* synthetic */ nfa a;

    public rda(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override // kba
    public final void a(TLRPC.WebPage webPage, k27 k27Var) {
        nfa nfaVar = this.a;
        ou3.I0(nfaVar.y1, k27Var, nfaVar.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // kba
    public final boolean b() {
        return !this.a.F1;
    }

    @Override // kba
    public final void c(String str, boolean z) {
        nfa nfaVar = this.a;
        d dVar = nfaVar.y1;
        if (!z) {
            nfaVar.Y0(str);
            return;
        }
        fx0 i = ug8.i(dVar.getParentActivity(), false, 1, null);
        i.P = str;
        i.Q = false;
        CharSequence[] charSequenceArr = {k96.M0(2131747624, "Open"), k96.M0(2131751755, "Copy")};
        fe feVar = new fe((Object) this, (Object) str, (byte) 13);
        i.M = charSequenceArr;
        i.L = feVar;
        dVar.showDialog(i);
    }
}
