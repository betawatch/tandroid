package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import g7.e6;
import gh.x9;
import kh.b8;
import kh.d;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;
import pf.v;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b extends sa {
    public final x9 T;
    public z41 U;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, null, false, true, false, false, false, 2, null);
        this.G = AndroidUtilities.dp(30.0f);
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.d();
        dVar.e();
        dVar.setOnClickListener(new x8(this, 19));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        d dVar2 = new d(context, this.resourcesProvider, true);
        dVar2.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelMessageOwner : R.string.CommunityInviteOnlyGroupMessageOwner));
        dVar2.e();
        dVar2.setOnClickListener(new v(2, this, runnable));
        x9 x9Var = new x9(context, 4);
        TextView textView = (TextView) x9Var.d;
        TextView textView2 = (TextView) x9Var.c;
        this.T = x9Var;
        x9Var.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((o9) x9Var.b).e(chat, new z8(chat));
        textView2.setText(DialogObject.getName(chat));
        int i10 = f6.G6;
        textView2.setTextColor(getThemedColor(i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new eq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(isChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelInfo : R.string.CommunityInviteOnlyGroupInfo));
        textView.setTextColor(getThemedColor(i10));
        textView.setText(spannableStringBuilder);
        this.containerView.addView(dVar2, e6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(dVar, e6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.U.N(false);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new b8(this, 25), this.resourcesProvider);
        this.U = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return null;
    }
}
