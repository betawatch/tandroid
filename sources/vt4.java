// default package

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class vt4 extends c79 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final /* synthetic */ wt4 x;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final rj4 w = new rj4(this, (byte) 10);

    public vt4(wt4 wt4Var) {
        this.x = wt4Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final void E() {
        int i = this.x.a;
        if (this.d) {
            return;
        }
        this.d = true;
        F(true);
        uc7 s1 = uc7.s1(i);
        String str = s1.p3;
        if (this.n == null) {
            TLObject c2 = s1.c2(str);
            if (c2 instanceof TLRPC.User) {
                this.n = (TLRPC.User) c2;
            }
        }
        if (this.n == null) {
            if (this.r) {
                return;
            }
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = str;
            this.e = ConnectionsManager.getInstance(i).sendRequest(tL_contacts_resolveUsername, new mw3(this, s1, (byte) 7));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = s1.q1(this.n);
        String str2 = this.f;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_getInlineBotResults.query = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        String str3 = this.h;
        String str4 = str3 != null ? str3 : "";
        tL_messages_getInlineBotResults.offset = str4;
        this.e = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, new q81((byte) 4, this, TextUtils.isEmpty(str4)));
    }

    public abstract void F(boolean z);

    @Override // j79
    public final int b() {
        return this.c.size();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        de0 de0Var = (de0) f89Var.a;
        TLObject tLObject = (TLObject) this.c.get(i);
        boolean z = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z) {
            de0Var.m(jn5.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
            return;
        }
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            de0Var.m(jn5.i(xb4.w(photo.sizes, jn7.q5, false, null, false), photo), "200_200", colorDrawable, null);
        } else {
            if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                de0Var.b();
                return;
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                de0Var.m(jn5.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                de0Var.b();
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        return new n69(new ut4(this.x.getContext(), (byte) 0));
    }
}
