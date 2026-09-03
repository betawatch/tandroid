package vh;

import ag.h;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import f2.x0;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.cr0;
import qh.c4;
import qh.d;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a extends sa {
    public w51 U;
    public boolean V;
    public final FrameLayout W;
    public final boolean X;
    public final boolean Y;
    public int Z;

    public a(Context context, TLRPC.Chat chat, long j10, Utilities.Callback callback) {
        super(context, null, false, true, false, false, false, 2, null);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.Y = UserObject.isBot(user);
        this.X = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        this.e.setTitle(y());
        setBackgroundColor(k6.v0(k6.a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new x0(-1, -2));
        h6 h6Var = new h6(context, null);
        if (chat2 != null) {
            h6Var.t(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else if (user != null) {
            h6Var.t(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
        }
        frameLayout.addView(h6Var, c6.c(-2.0f, -1));
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.o1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new h(this, 24));
        d dVar = new d(context, this.resourcesProvider, true);
        if (chat != null) {
            dVar.setText(LocaleController.getString(ChatObject.canAddChatToCommunity(chat) ? R.string.CommunityAddToCommunityButton : R.string.CommunityAddToCommunityRequestButton));
        } else {
            dVar.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
        }
        dVar.e();
        dVar.setOnClickListener(new q31(this, callback, chat, 7));
        this.containerView.addView(dVar, c6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.U.N(false);
    }

    public final void P(Utilities.Callback callback, boolean z4, boolean z10) {
        if (z10 && !z4 && !this.Y) {
            z4.P(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityAddToCommunityTitle), LocaleController.getString(this.X ? R.string.CommunityAddToCommunityChannelMessage : R.string.CommunityAddToCommunityGroupMessage), LocaleController.getString(R.string.Add), new cr0(this, callback, z4, 11)).show();
        } else {
            callback.run(Boolean.valueOf(z4));
            dismiss();
        }
    }

    public final void Q(boolean z4) {
        boolean z10;
        if (this.V == z4) {
            return;
        }
        this.V = z4;
        int i10 = this.Z + 1;
        sl0 sl0Var = this.d;
        View T0 = sl0Var.T0(i10);
        if (T0 instanceof i6) {
            ((i6) T0).a(!z4);
            z10 = false;
        } else {
            z10 = true;
        }
        View T02 = sl0Var.T0(this.Z + 2);
        if (T02 instanceof i6) {
            ((i6) T02).a(z4);
        } else {
            z10 = true;
        }
        if (z10) {
            this.U.N(true);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, false, new c4(this, 25), this.resourcesProvider);
        this.U = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(this.Y ? R.string.CommunityAddBotTitle : R.string.CommunityAddChatTitle);
    }
}
