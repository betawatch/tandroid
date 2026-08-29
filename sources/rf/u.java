package rf;

import android.content.Context;
import android.view.ViewGroup;
import f2.n1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class u extends il0 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final c6 h;

    public u(int i10, Context context, c6 c6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.c = context;
        this.d = i10;
        this.f = z11;
        this.h = c6Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override // f2.p0
    public void v(n1 n1Var, int i10) {
        TLRPC.Chat chat;
        l4 l4Var = (l4) n1Var.a;
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
        l4Var.setTag(Long.valueOf(j10));
        l4Var.a(j10, user != null ? UserObject.getFirstName(user) : chat != null ? chat.monoforum ? yf.d.i(chat, i11, false) : chat.title : "");
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.e;
        l4 l4Var = new l4(this.c, this.h, z10);
        if (this.f && !l4Var.x) {
            l4Var.x = true;
            NotificationCenter.getInstance(l4Var.h).listen(l4Var, NotificationCenter.userIsPremiumBlockedUpadted, new h2(l4Var, 1));
        }
        l4Var.setLayoutParams(new f2.x0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new vk0(l4Var);
    }
}
