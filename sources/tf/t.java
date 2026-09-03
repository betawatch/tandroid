package tf;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ql0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class t extends ql0 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final f6 h;

    public t(int i10, Context context, f6 f6Var, boolean z4, boolean z10) {
        this.e = z4;
        this.c = context;
        this.d = i10;
        this.f = z10;
        this.h = f6Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override // f2.o0
    public void v(f2.l1 l1Var, int i10) {
        TLRPC.Chat chat;
        m4 m4Var = (m4) l1Var.a;
        int i11 = this.d;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        TLRPC.User user = null;
        if (j10 != 0) {
            user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        m4Var.setTag(Long.valueOf(j10));
        m4Var.a(j10, user != null ? UserObject.getFirstName(user) : chat != null ? chat.monoforum ? ag.f.i(chat, i11, false) : chat.title : "");
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4 = this.e;
        m4 m4Var = new m4(this.c, this.h, z4);
        if (this.f && !m4Var.x) {
            m4Var.x = true;
            NotificationCenter.getInstance(m4Var.h).listen(m4Var, NotificationCenter.userIsPremiumBlockedUpadted, new h2(m4Var, 1));
        }
        m4Var.setLayoutParams(new f2.w0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new dl0(m4Var);
    }
}
