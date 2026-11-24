// default package

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class st4 extends q59 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final /* synthetic */ tt4 x;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final qn4 w = new qn4(this, (byte) 3);

    public st4(tt4 tt4Var) {
        this.x = tt4Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final void E() {
        int i = this.x.a;
        if (this.d) {
            return;
        }
        this.d = true;
        F(true);
        oc7 r1 = oc7.r1(i);
        String str = r1.p3;
        if (this.n == null) {
            TLObject b2 = r1.b2(str);
            if (b2 instanceof TLRPC.User) {
                this.n = (TLRPC.User) b2;
            }
        }
        if (this.n == null) {
            if (this.r) {
                return;
            }
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = str;
            this.e = ConnectionsManager.getInstance(i).sendRequest(tL_contacts_resolveUsername, new cx3(this, r1, (byte) 7));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = r1.p1(this.n);
        String str2 = this.f;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_getInlineBotResults.query = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        String str3 = this.h;
        String str4 = str3 != null ? str3 : "";
        tL_messages_getInlineBotResults.offset = str4;
        this.e = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, new r91((byte) 4, this, TextUtils.isEmpty(str4)));
    }

    public abstract void F(boolean z);

    @Override // y59
    public final int b() {
        return this.c.size();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        bf0 bf0Var = (bf0) u69Var.a;
        TLObject tLObject = (TLObject) this.c.get(i);
        boolean z = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z) {
            bf0Var.m(gn5.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
            return;
        }
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            bf0Var.m(gn5.i(bc4.w(photo.sizes, nm7.q5, false, null, false), photo), "200_200", colorDrawable, null);
        } else {
            if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                bf0Var.b();
                return;
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                bf0Var.m(gn5.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                bf0Var.b();
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        return new b59(new rt4(this.x.getContext(), (byte) 0));
    }
}
