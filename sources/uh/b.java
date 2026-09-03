package uh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import cg.u;
import k7.b6;
import oh.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import ph.d;
import ph.d4;
import ph.s8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class b extends sa {
    public final u U;
    public w51 V;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, null, false, true, false, false, false, 2, null);
        this.H = AndroidUtilities.dp(30.0f);
        rl0 rl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.d();
        dVar.e();
        dVar.setOnClickListener(new n(this, 25));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        d dVar2 = new d(context, this.resourcesProvider, true);
        dVar2.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelMessageOwner : R.string.CommunityInviteOnlyGroupMessageOwner));
        dVar2.e();
        dVar2.setOnClickListener(new s8(6, this, runnable));
        u uVar = new u(context, 5);
        TextView textView = (TextView) uVar.d;
        TextView textView2 = (TextView) uVar.c;
        this.U = uVar;
        uVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((p9) uVar.b).e(chat, new z8(chat));
        textView2.setText(DialogObject.getName(chat));
        int i11 = j6.G6;
        textView2.setTextColor(getThemedColor(i11));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new lq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(isChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelInfo : R.string.CommunityInviteOnlyGroupInfo));
        textView.setTextColor(getThemedColor(i11));
        textView.setText(spannableStringBuilder);
        this.containerView.addView(dVar2, b6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(dVar, b6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.V.N(false);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new d4(this, 26), this.resourcesProvider);
        this.V = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return null;
    }
}
