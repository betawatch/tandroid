package ph;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.zd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class z2 extends rl0 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final /* synthetic */ a3 w;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final org.telegram.ui.web.o0 v = new org.telegram.ui.web.o0(this, 19);

    public z2(a3 a3Var) {
        this.w = a3Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.w.a;
        if (this.d) {
            return;
        }
        this.d = true;
        F(true);
        MessagesController messagesController = MessagesController.getInstance(i10);
        String str = messagesController.imageSearchBot;
        if (this.n == null) {
            TLObject userOrChat = messagesController.getUserOrChat(str);
            if (userOrChat instanceof TLRPC.User) {
                this.n = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.n;
        if (user == null && !this.r) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = str;
            this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new ii1(2, this, messagesController));
        } else {
            if (user == null) {
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.n);
            String str2 = this.f;
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            String str3 = this.h;
            String str4 = str3 != null ? str3 : "";
            tL_messages_getInlineBotResults.offset = str4;
            this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new zd(13, this, TextUtils.isEmpty(str4)));
        }
    }

    public abstract void F(boolean z4);

    @Override // f2.o0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) l1Var.a;
        TLObject tLObject = (TLObject) this.c.get(i10);
        boolean z4 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z4) {
            p9Var.h(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
            return;
        }
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            p9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, null);
        } else {
            if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                p9Var.b();
                return;
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                p9Var.h(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                p9Var.b();
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new el0(new lh.z4(this.w.getContext(), 1));
    }
}
