package yh;

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
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import org.telegram.ui.x70;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class o7 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new o7());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        String userName;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.j5 j5Var;
        p7 p7Var = (p7) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) i51Var.G;
        org.telegram.ui.ActionBar.j5 j5Var2 = p7Var.d;
        u9 u9Var = p7Var.c;
        org.telegram.ui.ActionBar.e6 e6Var = p7Var.b;
        TextView textView = p7Var.h;
        TextView textView2 = p7Var.f;
        TextView textView3 = p7Var.e;
        int i10 = p7Var.a;
        TextView textView4 = p7Var.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        p7Var.r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            f9 f9Var = new f9((org.telegram.ui.ActionBar.e6) null);
            f9Var.q(chat);
            u9Var.e(chat, f9Var);
            userName = chat != null ? chat.title : null;
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            f9 f9Var2 = new f9((org.telegram.ui.ActionBar.e6) null);
            f9Var2.r(user);
            u9Var.e(user, f9Var2);
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
        textView2.setTextSize(1, p7Var.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            textView2.setText(LocaleController.formatString(j3 < currentTime ? R.string.StarsSubscriptionExpired : R.string.StarsSubscriptionExpires, LocaleController.formatDateChat(j3)));
            textView.setVisibility(8);
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.wj, e6Var));
            textView4.setText(LocaleController.getString(starsSubscription.bot_canceled ? z12 ? R.string.StarsSubscriptionStatusBizCancelled : R.string.StarsSubscriptionStatusBotCancelled : R.string.StarsSubscriptionStatusCancelled));
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j10)));
                textView.setVisibility(8);
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.wj, e6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j10)));
                textView.setVisibility(0);
                textView.setText(x7.X0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.z6, e6Var));
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
        p7Var.s = z10;
        p7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        p7 p7Var = (p7) getCached();
        return p7Var != null ? p7Var : new p7(context, i10, e6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var2 == null) {
            return false;
        }
        Object obj = i51Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = i51Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
