package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e1 extends sk0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ g1 s;
    public final d0 c = new d0(this, 3);
    public int d = -1;
    public boolean r = false;

    public e1(g1 g1Var) {
        this.s = g1Var;
    }

    public static void E(e1 e1Var, boolean z10) {
        g1 g1Var = e1Var.s;
        ArrayList arrayList = g1Var.h;
        arrayList.clear();
        u1 u1Var = g1Var.r;
        int i10 = u1.y1;
        arrayList.addAll(new ArrayList(ui.b0(u1Var.a).i0));
        if (z10) {
            e1Var.f();
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        g1 g1Var = this.s;
        if (!g1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < g1Var.h.size()) {
                return g1Var.h.get(i11);
            }
            i11 -= g1Var.h.size();
        }
        if (g1Var.n.isEmpty()) {
            return null;
        }
        if (!g1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11--;
        }
        if (i11 < 0 || i11 >= g1Var.n.size()) {
            return null;
        }
        return g1Var.n.get(i11);
    }

    public final void G() {
        g1 g1Var = this.s;
        u1 u1Var = g1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        g1Var.d.c(true);
        if (this.d >= 0) {
            int i10 = u1.y1;
            ConnectionsManager.getInstance(u1Var.a).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            int i11 = u1.y1;
            TLObject e22 = vp.r1(u1Var.a).e2(vp.r1(u1Var.a).M3);
            if (e22 instanceof TLRPC.User) {
                this.f = (TLRPC.User) e22;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            int i12 = u1.y1;
            tL_contacts_resolveUsername.username = vp.r1(u1Var.a).M3;
            this.d = ConnectionsManager.getInstance(u1Var.a).sendRequest(tL_contacts_resolveUsername, new ag.c(this, 22));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        int i13 = u1.y1;
        tL_messages_getInlineBotResults.bot = vp.r1(u1Var.a).p1(this.f);
        String str = this.e;
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        boolean isEmpty = TextUtils.isEmpty(this.h);
        String str2 = this.h;
        tL_messages_getInlineBotResults.offset = str2 != null ? str2 : "";
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        String str3 = "gif_search_" + tL_messages_getInlineBotResults.query + "_" + tL_messages_getInlineBotResults.offset;
        hs.a0(u1Var.a).M(str3, new org.telegram.messenger.s6(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        g1 g1Var = this.s;
        p1 p1Var = g1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                u1 u1Var = g1Var.r;
                int i10 = u1.y1;
                ConnectionsManager.getInstance(u1Var.a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        d0 d0Var = this.c;
        org.telegram.messenger.i0.r(d0Var);
        if (TextUtils.isEmpty(str)) {
            g1Var.n.clear();
            p1Var.c(false);
            f();
        } else {
            if (isEmpty) {
                f();
            }
            p1Var.c(true);
            org.telegram.messenger.i0.h3(d0Var, 1500L);
        }
    }

    @Override // s4.g0
    public final int b() {
        g1 g1Var = this.s;
        int i10 = 0;
        int size = ((g1Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : g1Var.h.size()) + 1;
        if (!g1Var.n.isEmpty()) {
            if (!g1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i10 = 1;
            }
            i10 += g1Var.n.size();
        }
        return size + i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        g1 g1Var = this.s;
        if (!g1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= g1Var.h.size();
        }
        return (g1Var.n.isEmpty() || g1Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i11 != 0) ? 2 : 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) this.s.r.o1));
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
            Object F = F(i10);
            if (!(F instanceof TLRPC.Document)) {
                if (F instanceof TLRPC.BotInlineResult) {
                    h2Var.e((TLRPC.BotInlineResult) F, this.f, true, false, false, true);
                }
            } else {
                TLRPC.Document document = (TLRPC.Document) F;
                h2Var.getClass();
                h2Var.d(0, "gif" + document, document);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.n8] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.view.View] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h2 h2Var;
        g1 g1Var = this.s;
        if (i10 == 0) {
            h2Var = new View(g1Var.getContext());
        } else if (i10 == 1) {
            Context context = g1Var.getContext();
            u1 u1Var = g1Var.r;
            int i11 = u1.y1;
            ?? n8Var = new org.telegram.ui.Cells.n8(context, false, false, u1Var.I0, false);
            n8Var.a(0, cd.L0(2131750835, null));
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.i0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = org.telegram.messenger.i0.L(5.5f);
            n8Var.setLayoutParams(o0Var);
            h2Var = n8Var;
        } else {
            org.telegram.ui.Cells.h2 h2Var2 = new org.telegram.ui.Cells.h2(g1Var.getContext());
            h2Var2.getPhotoImage().E0(7);
            if (h2Var2.d0 == null) {
                dc dcVar = new dc(h2Var2, 1.0f, 3.0f);
                dcVar.e = 120L;
                h2Var2.d0 = dcVar;
            }
            h2Var2.setIsKeyboard(true);
            h2Var2.setCanPreviewGif(true);
            h2Var = h2Var2;
        }
        return new ck0(h2Var);
    }
}
