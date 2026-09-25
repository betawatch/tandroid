package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zh0 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final org.telegram.ui.Components.k9 d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final int f;
    public final boolean h;
    public final org.telegram.ui.Components.u00 n;
    public boolean r;
    public wb1 s;

    public zh0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i10;
        boolean z10 = messageObject.isRoundVideo() || messageObject.isVoice();
        this.h = z10;
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.n = u00Var;
        u00Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.i6, -1);
        u00Var.setViewType(13);
        u00Var.setIsSingleCell(false);
        addView(u00Var, w7.y5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(h5Var, w7.y5.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.d = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.y5.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.y5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z10 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        k9Var.setAlpha(0.0f);
        h5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new ai.k8(this, peer != null ? peer.user_id : 0L, i10, chat));
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.wl0 a() {
        wb1 wb1Var = this.s;
        if (wb1Var != null) {
            return wb1Var;
        }
        wb1 wb1Var2 = new wb1(getContext(), 10, null);
        this.s = wb1Var2;
        getContext();
        wb1Var2.setLayoutManager(new s4.c0());
        this.s.i(new ci.r1(this, 5));
        this.s.setAdapter(new gg.n0(this, 3));
        return this.s;
    }

    public final void b() {
        org.telegram.ui.Components.k9 k9Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i10 = 0;
        while (true) {
            k9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f;
            if (i10 < size) {
                k9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                k9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            k9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            k9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            k9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        h5Var.setRightPadding(dp);
        k9Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            h5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            h5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            h5Var.l(LocaleController.formatPluralString(this.h ? "MessagePlayed" : "MessageSeen", arrayList2.size(), new Object[0]), false);
        }
        h5Var.animate().alpha(1.0f).setDuration(220L).start();
        k9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.u00 u00Var = this.n;
        u00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.ca(u00Var)).start();
        wb1 wb1Var = this.s;
        if (wb1Var != null) {
            wb1Var.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        org.telegram.ui.Components.u00 u00Var = this.n;
        boolean z10 = u00Var.getVisibility() == 0;
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        h5Var.setVisibility(8);
        if (z10) {
            u00Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            u00Var.getLayoutParams().width = getMeasuredWidth();
            u00Var.setVisibility(0);
        }
        h5Var.setVisibility(0);
        h5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.r = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }
}
