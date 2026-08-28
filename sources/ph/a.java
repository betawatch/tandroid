package ph;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import eh.j;
import f2.a1;
import g7.e6;
import kh.b8;
import kh.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z41;
import org.telegram.ui.np0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a extends sa {
    public z41 T;
    public boolean U;
    public final FrameLayout V;
    public final boolean W;
    public final boolean X;
    public int Y;

    public a(Context context, TLRPC.Chat chat, long j10, Utilities.Callback callback) {
        super(context, null, false, true, false, false, false, 2, null);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.X = UserObject.isBot(user);
        this.W = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.e.setTitle(y());
        setBackgroundColor(f6.v0(f6.a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new a1(-1, -2));
        h6 h6Var = new h6(context, null);
        if (chat2 != null) {
            h6Var.t(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else if (user != null) {
            h6Var.t(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
        }
        frameLayout.addView(h6Var, e6.c(-2.0f, -1));
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.p1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new j(this, 19));
        d dVar = new d(context, this.resourcesProvider, true);
        if (chat != null) {
            dVar.setText(LocaleController.getString(ChatObject.canAddChatToCommunity(chat) ? R.string.CommunityAddToCommunityButton : R.string.CommunityAddToCommunityRequestButton));
        } else {
            dVar.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
        }
        dVar.e();
        dVar.setOnClickListener(new gd0(this, callback, chat, 6));
        this.containerView.addView(dVar, e6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.T.N(false);
    }

    public final void O(Utilities.Callback callback, boolean z10, boolean z11) {
        if (z11 && !z10 && !this.X) {
            y4.P(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityAddToCommunityTitle), LocaleController.getString(this.W ? R.string.CommunityAddToCommunityChannelMessage : R.string.CommunityAddToCommunityGroupMessage), LocaleController.getString(R.string.Add), new np0(this, callback, z10, 11)).show();
        } else {
            callback.run(Boolean.valueOf(z10));
            dismiss();
        }
    }

    public final void P(boolean z10) {
        boolean z11;
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        int i9 = this.Y + 1;
        wk0 wk0Var = this.d;
        View U0 = wk0Var.U0(i9);
        if (U0 instanceof i6) {
            ((i6) U0).a(!z10);
            z11 = false;
        } else {
            z11 = true;
        }
        View U02 = wk0Var.U0(this.Y + 2);
        if (U02 instanceof i6) {
            ((i6) U02).a(z10);
        } else {
            z11 = true;
        }
        if (z11) {
            this.T.N(true);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, false, new b8(this, 24), this.resourcesProvider);
        this.T = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(this.X ? R.string.CommunityAddBotTitle : R.string.CommunityAddChatTitle);
    }
}
