package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.wd;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class g1 extends sl0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ i1 s;
    public final org.telegram.ui.web.s0 c = new org.telegram.ui.web.s0(this, 14);
    public int d = -1;
    public boolean r = false;

    public g1(i1 i1Var) {
        this.s = i1Var;
    }

    public static void E(g1 g1Var, boolean z4) {
        int i10;
        i1 i1Var = g1Var.s;
        ArrayList arrayList = i1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.h3) i1Var.r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z4) {
            g1Var.l();
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 2;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        i1 i1Var = this.s;
        if (!i1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < i1Var.h.size()) {
                return i1Var.h.get(i11);
            }
            i11 -= i1Var.h.size();
        }
        if (i1Var.n.isEmpty()) {
            return null;
        }
        if (!i1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11--;
        }
        if (i11 < 0 || i11 >= i1Var.n.size()) {
            return null;
        }
        return i1Var.n.get(i11);
    }

    public final void G() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        i1 i1Var = this.s;
        y1 y1Var = i1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        i1Var.d.c(true);
        if (this.d >= 0) {
            i16 = ((org.telegram.ui.ActionBar.h3) y1Var).currentAccount;
            ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            i14 = ((org.telegram.ui.ActionBar.h3) y1Var).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i14);
            i15 = ((org.telegram.ui.ActionBar.h3) y1Var).currentAccount;
            TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                this.f = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i12 = ((org.telegram.ui.ActionBar.h3) y1Var).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
            i13 = ((org.telegram.ui.ActionBar.h3) y1Var).currentAccount;
            this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new gf.a(this, 15));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        i10 = ((org.telegram.ui.ActionBar.h3) y1Var).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f);
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
        i11 = ((org.telegram.ui.ActionBar.h3) y1Var).currentAccount;
        MessagesStorage.getInstance(i11).getBotCache(str3, new wd(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        int i10;
        i1 i1Var = this.s;
        s1 s1Var = i1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.h3) i1Var.r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        org.telegram.ui.web.s0 s0Var = this.c;
        AndroidUtilities.cancelRunOnUIThread(s0Var);
        if (TextUtils.isEmpty(str)) {
            i1Var.n.clear();
            s1Var.c(false);
            l();
        } else {
            if (isEmpty) {
                l();
            }
            s1Var.c(true);
            AndroidUtilities.runOnUIThread(s0Var, 1500L);
        }
    }

    @Override // f2.p0
    public final int h() {
        i1 i1Var = this.s;
        int i10 = 0;
        int size = ((i1Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : i1Var.h.size()) + 1;
        if (!i1Var.n.isEmpty()) {
            if (!i1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i10 = 1;
            }
            i10 += i1Var.n.size();
        }
        return size + i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        i1 i1Var = this.s;
        if (!i1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= i1Var.h.size();
        }
        return (i1Var.n.isEmpty() || i1Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i11 != 0) ? 2 : 1;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.x0(-1, (int) this.s.r.n));
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Object F = F(i10);
            if (!(F instanceof TLRPC.Document)) {
                if (F instanceof TLRPC.BotInlineResult) {
                    e2Var.e((TLRPC.BotInlineResult) F, this.f, true, false, false, true);
                }
            } else {
                TLRPC.Document document = (TLRPC.Document) F;
                e2Var.getClass();
                e2Var.d(0, document, "gif" + document);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.m8] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View] */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Cells.e2 e2Var;
        i1 i1Var = this.s;
        if (i10 == 0) {
            e2Var = new View(i1Var.getContext());
        } else if (i10 == 1) {
            Context context = i1Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) i1Var.r).resourcesProvider;
            ?? m8Var = new org.telegram.ui.Cells.m8(context, false, false, g6Var, false);
            m8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            f2.x0 x0Var = new f2.x0(-1, -2);
            ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            m8Var.setLayoutParams(x0Var);
            e2Var = m8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(i1Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.W == null) {
                rc rcVar = new rc(e2Var2, 1.0f, 3.0f);
                rcVar.e = 120L;
                e2Var2.W = rcVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new fl0(e2Var);
    }
}
