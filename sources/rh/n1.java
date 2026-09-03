package rh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.qi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class n1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, final int i10, final long j10, final long j11, TL_bots.botVerifierSettings botverifiersettings, final j1 j1Var) {
        String str;
        TLRPC.Chat chat;
        if (j11 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j11));
            if (chat2 == null) {
                str = "";
                chat = chat2;
            } else {
                str = chat2.title;
                chat = chat2;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), j6.w0(null, j6.ci, false)));
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        z8 z8Var = new z8((f6) null);
        z8Var.p(chat);
        p9Var.e(chat, z8Var);
        frameLayout2.addView(p9Var, b6.e(28, 28, 51));
        p9 p9Var2 = new p9(activity);
        p9Var2.setEmojiColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.z9, false), PorterDuff.Mode.SRC_IN));
        p9Var2.setAnimatedEmojiDrawable(l5.n(i10, botverifiersettings.icon, null, 3));
        frameLayout2.addView(p9Var2, b6.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        k5 k5Var = new k5(activity);
        k5Var.setTextColor(j6.w0(null, j6.j5, false));
        k5Var.setTextSize(13);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(str, false);
        k5Var.setWidthWrapContent(true);
        frameLayout2.addView(k5Var, b6.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, b6.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(j11 >= 0 ? R.string.BotRemoveVerificationText : R.string.BotRemoveVerificationChatText);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.c2() { // from class: rh.l1
            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i12 = i10;
                setcustomverification.bot = MessagesController.getInstance(i12).getInputUser(j10);
                setcustomverification.peer = MessagesController.getInstance(i12).getInputPeer(j11);
                ConnectionsManager.getInstance(i12).sendRequest(setcustomverification, new qi1(4, zArr2, j1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }
}
