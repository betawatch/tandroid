package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zz extends org.telegram.ui.ActionBar.n2 {
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public org.telegram.ui.Components.a10 P;
    public qz Q;
    public final aj R;
    public ValueAnimator S;
    public float T;
    public wb1 a;
    public yz b;
    public final MessagesController.DialogFilter c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.Components.qr n;
    public org.telegram.ui.ActionBar.v0 r;
    public int s;
    public long v;
    public long w;
    public Utilities.Callback x;
    public Utilities.Callback y;

    public zz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new aj(this, 28);
        this.T = 1.0f;
        this.c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(zz zzVar, TLRPC.TL_error tL_error) {
        zzVar.e0(false);
        zzVar.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            zzVar.showDialog(new rg.j0(12, zzVar.currentAccount, zzVar.getParentActivity(), zzVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            zzVar.showDialog(new rg.j0(4, zzVar.currentAccount, zzVar.getParentActivity(), zzVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            zzVar.finishFragment();
        } else {
            zzVar.showDialog(new rg.j0(13, zzVar.currentAccount, zzVar.getParentActivity(), zzVar, null));
        }
    }

    public static void V(zz zzVar, View view, int i10) {
        String str;
        zz zzVar2;
        ArrayList arrayList = zzVar.e;
        if (zzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Long l4 = (Long) zzVar.h.get(i10 - zzVar.M);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                zzVar.G = true;
                zzVar.X();
                ((org.telegram.ui.Cells.g4) view).c(false, true);
                zzVar2 = zzVar;
            } else {
                if (!zzVar.f.contains(l4)) {
                    int i11 = -zzVar.s;
                    zzVar.s = i11;
                    AndroidUtilities.shakeViewSpring(view, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(zzVar.getMessagesController().getUser(l4));
                        TLRPC.User user = zzVar.getMessagesController().getUser(l4);
                        str = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUserToast) : LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        TLRPC.Chat chat = zzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        String string = ChatObject.isChannelAndNotMegaGroup(chat) ? ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteChannelToast) : LocaleController.getString(R.string.FilterInvitePrivateChannelToast) : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteGroupToast) : LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                        arrayList2.add(chat);
                        str = string;
                    }
                    if (zzVar.v != longValue || System.currentTimeMillis() - zzVar.w > 1500) {
                        zzVar.v = longValue;
                        zzVar.w = System.currentTimeMillis();
                        org.telegram.ui.Components.xc.a0(zzVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > zzVar.a0()) {
                    zzVar.showDialog(new rg.j0(4, zzVar.currentAccount, zzVar.getParentActivity(), zzVar, null));
                    return;
                }
                zzVar2 = zzVar;
                arrayList.add(l4);
                zzVar2.G = true;
                zzVar2.X();
                ((org.telegram.ui.Cells.g4) view).c(true, true);
            }
            zzVar2.Y();
            zzVar2.f0(true);
            zzVar2.g0();
        }
    }

    public final boolean W(boolean z10) {
        if (this.e.isEmpty() || !this.G) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.pz
            public final /* synthetic */ zz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.c0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.pz
            public final /* synthetic */ zz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.c0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        showDialog(alertDialog$Builder.a);
        return false;
    }

    public final void X() {
        float f7 = this.G ? !this.e.isEmpty() ? 1.0f : 0.5f : 0.0f;
        if (Math.abs(this.T - f7) > 0.1f) {
            this.r.clearAnimation();
            ViewPropertyAnimator animate = this.r.animate();
            this.T = f7;
            animate.alpha(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.rr.h).start();
        }
    }

    public final void Y() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.G) {
            return;
        }
        ArrayList arrayList = this.e;
        boolean z10 = true;
        boolean z11 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z11) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10))))) {
                    break;
                }
            }
        }
        z10 = z11;
        if (z10) {
            return;
        }
        this.G = false;
        X();
    }

    public final void Z(org.telegram.ui.Components.a10 a10Var, boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        a10Var.a(LocaleController.getString(arrayList.size() >= Math.min(a0(), arrayList2.size()) ? R.string.DeselectAll : R.string.SelectAll), new ci.y0(this, a10Var, z10, 26));
        this.G = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i10 = 0; i10 < this.a.getChildCount(); i10++) {
            View childAt = this.a.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.g4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int a0() {
        return getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public final String b0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    public final void c0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || this.E || !this.G) {
            return;
        }
        e0(true);
        this.E = true;
        tL_exportedChatlistInvite.peers.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.e;
            if (i10 >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i10)).longValue()));
            i10++;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c.id;
        tL_chatlists_editExportedInvite.slug = b0();
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new oz(this, 1));
        Utilities.Callback callback = this.y;
        if (callback != null) {
            callback.run(tL_exportedChatlistInvite);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        return W(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        d0(false);
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 22));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.h6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.qr qrVar = new org.telegram.ui.Components.qr(mutate, new org.telegram.ui.Components.up(org.telegram.ui.ActionBar.h6.w0(null, i10, false)));
        this.n = qrVar;
        this.r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), qrVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
        wb1 wb1Var = new wb1(context, 9, null);
        this.a = wb1Var;
        wb1Var.setLayoutManager(new s4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, w7.x5.c(-1.0f, -1));
        wb1 wb1Var2 = this.a;
        yz yzVar = new yz(this);
        this.b = yzVar;
        wb1Var2.setAdapter(yzVar);
        this.a.setOnItemClickListener(new i(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i11 = 0; i11 < tL_exportedChatlistInvite.peers.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i11));
                arrayList.add(Long.valueOf(peerDialogId));
                this.e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i12);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.id) && !arrayList.contains(Long.valueOf(dialog.id))) {
                long j3 = dialog.id;
                boolean z10 = j3 < 0;
                if (j3 < 0) {
                    z10 = c10.g0(getMessagesController().getChat(Long.valueOf(-dialog.id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.id));
                    arrayList2.add(Long.valueOf(dialog.id));
                }
            }
        }
        for (int i13 = 0; i13 < dialogFilter.dialogs.size(); i13++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i13);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.id) && !arrayList.contains(Long.valueOf(dialog2.id)) && !arrayList2.contains(Long.valueOf(dialog2.id))) {
                arrayList.add(Long.valueOf(dialog2.id));
            }
        }
        this.H = 1;
        if (tL_exportedChatlistInvite != null) {
            this.J = 1;
            this.I = 2;
            this.H = 4;
            this.K = 3;
        } else {
            this.J = -1;
            this.I = -1;
            this.K = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
        } else {
            int i14 = this.H;
            int i15 = i14 + 1;
            this.L = i14;
            int i16 = i14 + 2;
            this.H = i16;
            this.M = i15;
            int size = (arrayList.size() - 1) + i16;
            this.N = size;
            this.H = size + 1;
            this.O = size;
        }
        yz yzVar2 = this.b;
        if (yzVar2 != null) {
            yzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String string = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? LocaleController.getString(R.string.FilterShare) : tL_exportedChatlistInvite.title;
        if (z10) {
            this.actionBar.J(string, false, 220L, null);
        } else {
            this.actionBar.setTitle(string);
        }
    }

    public final void e0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
        }
        if (this.n != null) {
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n.c, z10 ? 1.0f : 0.0f);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 12));
            this.S.setDuration((long) (Math.abs(this.n.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.S.setInterpolator(org.telegram.ui.Components.rr.f);
            this.S.start();
        }
    }

    public final void f0(boolean z10) {
        org.telegram.ui.Components.a10 a10Var = this.P;
        if (a10Var == null) {
            return;
        }
        ArrayList arrayList = this.e;
        a10Var.b(arrayList.size() <= 0 ? LocaleController.getString("FilterInviteHeaderChatsEmpty") : LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]), z10);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z11 = arrayList.size() >= Math.min(a0(), arrayList2.size());
            this.P.a(LocaleController.getString(!z11 ? R.string.SelectAll : R.string.DeselectAll), new org.telegram.ui.Components.sr0(5, this, z11));
        } else {
            this.P.a("", null);
        }
        if (z10) {
            AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.P.a.getText()) + ", " + ((Object) this.P.b.getText()));
        }
    }

    public final void g0() {
        qz qzVar = this.Q;
        if (qzVar == null) {
            return;
        }
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            vh.o oVar = qzVar.a;
            oVar.setText(string);
            oVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = qzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        qz qzVar2 = this.Q;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        vh.o oVar2 = qzVar2.a;
        oVar2.setText(replaceTags);
        oVar2.h = z10 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        return W(z10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
            this.F = 0;
        }
    }
}
