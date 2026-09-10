package wh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class x1 extends sq0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b1;
    public final /* synthetic */ wr0 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(wr0 wr0Var, Context context, String str, String str2, f6 f6Var, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.c1 = wr0Var;
        this.b1 = p2Var;
    }

    @Override // org.telegram.ui.Components.sq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        wc a02;
        if (z10 && (a02 = wc.a0(this.b1)) != null) {
            if (iVar.m() == 1) {
                long j3 = iVar.j(0);
                if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    pc G = a02.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    pc G2 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    pc G3 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                pc Q = a02.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
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
