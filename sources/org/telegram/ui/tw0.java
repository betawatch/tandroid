package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tw0 extends org.telegram.ui.ActionBar.n2 {
    public final long a;
    public org.telegram.ui.Cells.z7 b;
    public org.telegram.ui.Components.v80 c;
    public org.telegram.ui.Components.e61 d;
    public org.telegram.ui.Components.pr e;
    public org.telegram.ui.ActionBar.v0 f;
    public final boolean h;
    public final long n;
    public boolean r;
    public long s;
    public no v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j3;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z10 = chat2 != null && chat2.broadcast_messages_allowed;
        this.h = z10;
        long clamp = Utilities.clamp(z10 ? j10 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.n = clamp;
        this.r = z10;
        this.s = clamp;
    }

    public static /* synthetic */ void U(tw0 tw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            tw0Var.e.a(0.0f);
            org.telegram.ui.Components.vc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        tw0Var.getMessagesController().putChats(updates.chats, false);
        tw0Var.getMessagesController().processUpdates(updates, false);
        if (tw0Var.isFinished || tw0Var.finishing) {
            return;
        }
        no noVar = tw0Var.v;
        if (noVar != null) {
            noVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        tw0Var.finishFragment();
    }

    public final void V(boolean z10) {
        boolean X;
        if (this.f == null || this.w == (X = X())) {
            return;
        }
        this.w = X;
        this.f.setEnabled(X);
        if (z10) {
            this.f.animate().alpha(X ? 1.0f : 0.0f).scaleX(X ? 1.0f : 0.0f).scaleY(X ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.f.setAlpha(X ? 1.0f : 0.0f);
        this.f.setScaleX(X ? 1.0f : 0.0f);
        this.f.setScaleY(X ? 1.0f : 0.0f);
    }

    public final String W() {
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, ei.l.G0(getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((this.s * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        return (this.s == this.n && this.r == this.h) ? false : true;
    }

    public final void Y() {
        if (this.e.c > 0.0f) {
            return;
        }
        if (!X()) {
            finishFragment();
            return;
        }
        this.e.a(1.0f);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        MessagesController messagesController = getMessagesController();
        long j3 = this.a;
        updatepaidmessagesprice.channel = messagesController.getInputChannel(j3);
        boolean z10 = this.r;
        updatepaidmessagesprice.send_paid_messages_stars = z10 ? this.s : 0L;
        updatepaidmessagesprice.suggestions_allowed = z10;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new bc0(12, this, updatepaidmessagesprice));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (chat != null) {
            if (this.r) {
                chat.flags2 |= 65536;
                chat.broadcast_messages_allowed = true;
            } else {
                chat.flags2 &= -65537;
                chat.broadcast_messages_allowed = false;
            }
            getMessagesController().putChat(chat, true);
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                if (this.r) {
                    chat2.flags2 |= 16384;
                    chat2.send_paid_messages_stars = this.s;
                } else {
                    chat2.flags2 &= -16385;
                    chat2.send_paid_messages_stars = 0L;
                }
                getMessagesController().putChat(chat2, true);
            }
        }
        no noVar = this.v;
        if (noVar != null) {
            noVar.run(this.r ? this.s : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 18));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.i6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.e = new org.telegram.ui.Components.pr(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7(context, this.resourceProvider);
        this.b = z7Var;
        int i11 = org.telegram.ui.ActionBar.i6.d6;
        z7Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(context, this, null, true, true);
        this.c = v80Var;
        v80Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.c.setBackgroundColor(getThemedColor(i11));
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.e61 e61Var = new org.telegram.ui.Components.e61(context, this.currentAccount, this.classGuid, false, new b5(this, 16), new sw0(this, 2), null, this.resourceProvider);
        this.d = e61Var;
        e61Var.p1();
        frameLayout2.addView(this.d, w7.x5.e(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.d);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!X()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new sw0(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new sw0(this, 1));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.w51 w51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.e61 e61Var = this.d;
        if (e61Var == null || (w51Var = e61Var.Y2) == null) {
            return true;
        }
        w51Var.N(false);
        return true;
    }
}
