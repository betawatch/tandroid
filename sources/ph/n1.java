package ph;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.t9;
import org.telegram.ui.qe1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        frameLayout2.setBackground(g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), g6.w0(null, g6.ci, false)));
        t9 t9Var = new t9(activity);
        t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        e9 e9Var = new e9((c6) null);
        e9Var.p(chat);
        t9Var.e(chat, e9Var);
        frameLayout2.addView(t9Var, f6.e(28, 28, 51));
        t9 t9Var2 = new t9(activity);
        t9Var2.setEmojiColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.z9, false), PorterDuff.Mode.SRC_IN));
        t9Var2.setAnimatedEmojiDrawable(p5.n(i10, botverifiersettings.icon, null, 3));
        frameLayout2.addView(t9Var2, f6.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        h5 h5Var = new h5(activity);
        h5Var.setTextColor(g6.w0(null, g6.j5, false));
        h5Var.setTextSize(13);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(str, false);
        h5Var.setWidthWrapContent(true);
        frameLayout2.addView(h5Var, f6.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, f6.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        alertDialog$Builder.a.P = LocaleController.getString(j11 >= 0 ? R.string.BotRemoveVerificationText : R.string.BotRemoveVerificationChatText);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: ph.l1
            @Override // org.telegram.ui.ActionBar.b2
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
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
                ConnectionsManager.getInstance(i12).sendRequest(setcustomverification, new qe1(4, zArr2, j1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }
}
