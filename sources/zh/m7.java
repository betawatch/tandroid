package zh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import org.telegram.ui.x70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m7 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new m7());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        String userName;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.j5 j5Var;
        n7 n7Var = (n7) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) h51Var.G;
        org.telegram.ui.ActionBar.j5 j5Var2 = n7Var.d;
        x9 x9Var = n7Var.c;
        org.telegram.ui.ActionBar.f6 f6Var = n7Var.b;
        TextView textView = n7Var.h;
        TextView textView2 = n7Var.f;
        TextView textView3 = n7Var.e;
        int i10 = n7Var.a;
        TextView textView4 = n7Var.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        n7Var.r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
            i9Var.q(chat);
            x9Var.e(chat, i9Var);
            userName = chat != null ? chat.title : null;
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            i9 i9Var2 = new i9((org.telegram.ui.ActionBar.f6) null);
            i9Var2.r(user);
            x9Var.e(user, i9Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        j5Var2.l(Emoji.replaceEmoji(userName, j5Var2.getPaint().getFontMetricsInt(), false), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            z12 = z11;
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                x70 x70Var = new x70(textView3, 14.0f, i10);
                x70Var.a(4.0f);
                x70Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                j5Var = j5Var2;
                z12 = z11;
                spannableString.setSpan(x70Var, 0, 1, 33);
                x70Var.b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                j5Var = j5Var2;
                z12 = z11;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, j5Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, n7Var.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            textView2.setText(LocaleController.formatString(j3 < currentTime ? R.string.StarsSubscriptionExpired : R.string.StarsSubscriptionExpires, LocaleController.formatDateChat(j3)));
            textView.setVisibility(8);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var));
            textView4.setText(LocaleController.getString(starsSubscription.bot_canceled ? z12 ? R.string.StarsSubscriptionStatusBizCancelled : R.string.StarsSubscriptionStatusBotCancelled : R.string.StarsSubscriptionStatusCancelled));
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j10)));
                textView.setVisibility(8);
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j10)));
                textView.setVisibility(0);
                textView.setText(v7.X0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
                int i11 = starsSubscription.pricing.period;
                if (i11 == 2592000) {
                    textView4.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                } else if (i11 == 60) {
                    textView4.setText("per minute");
                } else if (i11 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        }
        n7Var.s = z10;
        n7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        n7 n7Var = (n7) getCached();
        return n7Var != null ? n7Var : new n7(context, i10, f6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var2 == null) {
            return false;
        }
        Object obj = h51Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = h51Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
