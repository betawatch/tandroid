package vh;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class j2 extends sk0 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final /* synthetic */ k2 x;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final d0 w = new d0(this, 9);

    public j2(k2 k2Var) {
        this.x = k2Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.x.a;
        if (this.d) {
            return;
        }
        this.d = true;
        F(true);
        vp r12 = vp.r1(i10);
        String str = r12.N3;
        if (this.n == null) {
            TLObject e22 = r12.e2(str);
            if (e22 instanceof TLRPC.User) {
                this.n = (TLRPC.User) e22;
            }
        }
        TLRPC.User user = this.n;
        if (user == null && !this.r) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = str;
            this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new rh.h5(7, this, r12));
        } else {
            if (user == null) {
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = r12.p1(this.n);
            String str2 = this.f;
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            String str3 = this.h;
            String str4 = str3 != null ? str3 : "";
            tL_messages_getInlineBotResults.offset = str4;
            this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.voip.u0(12, this, TextUtils.isEmpty(str4)));
        }
    }

    public abstract void F(boolean z10);

    @Override // s4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) c1Var.a;
        TLObject tLObject = (TLObject) this.c.get(i10);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z10) {
            g9Var.j(ic.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
            return;
        }
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            g9Var.j(ic.i(org.telegram.messenger.b8.w(photo.sizes, zs.r5, false, null, false), photo), "200_200", colorDrawable, null);
        } else {
            if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                g9Var.b();
                return;
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                g9Var.j(ic.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                g9Var.b();
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new ck0(new rh.v3(this.x.getContext(), 1));
    }
}
