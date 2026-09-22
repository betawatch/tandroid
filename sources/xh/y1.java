package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class y1 extends hq0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b1;
    public final /* synthetic */ nr0 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(nr0 nr0Var, Context context, String str, String str2, e6 e6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.c1 = nr0Var;
        this.b1 = n2Var;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        vc a02;
        if (z10 && (a02 = vc.a0(this.b1)) != null) {
            if (iVar.m() == 1) {
                long j3 = iVar.j(0);
                if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    oc G = a02.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    oc G2 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    oc G3 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                oc Q = a02.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                this.c1.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
