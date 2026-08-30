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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yz extends org.telegram.ui.ActionBar.p2 {
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.Components.z00 M;
    public oz N;
    public final zi O;
    public ValueAnimator P;
    public float Q;
    public jb1 a;
    public xz b;
    public final MessagesController.DialogFilter c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.Components.mr n;
    public org.telegram.ui.ActionBar.w0 r;
    public int s;
    public long v;
    public long w;
    public Utilities.Callback x;
    public Utilities.Callback y;

    public yz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = -5;
        this.B = false;
        this.E = 0;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.O = new zi(this, 28);
        this.Q = 1.0f;
        this.c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(yz yzVar, TLRPC.TL_error tL_error) {
        yzVar.e0(false);
        yzVar.B = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            yzVar.showDialog(new eg.v0(12, yzVar.currentAccount, yzVar.getParentActivity(), yzVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            yzVar.showDialog(new eg.v0(4, yzVar.currentAccount, yzVar.getParentActivity(), yzVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            yzVar.finishFragment();
        } else {
            yzVar.showDialog(new eg.v0(13, yzVar.currentAccount, yzVar.getParentActivity(), yzVar, null));
        }
    }

    public static void V(yz yzVar, View view, int i10) {
        String str;
        yz yzVar2;
        ArrayList arrayList = yzVar.e;
        if (yzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Long l10 = (Long) yzVar.h.get(i10 - yzVar.J);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                yzVar.D = true;
                yzVar.X();
                ((org.telegram.ui.Cells.g4) view).c(false, true);
                yzVar2 = yzVar;
            } else {
                if (!yzVar.f.contains(l10)) {
                    int i11 = -yzVar.s;
                    yzVar.s = i11;
                    AndroidUtilities.shakeViewSpring(view, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(yzVar.getMessagesController().getUser(l10));
                        TLRPC.User user = yzVar.getMessagesController().getUser(l10);
                        str = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUserToast) : LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        TLRPC.Chat chat = yzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        String string = ChatObject.isChannelAndNotMegaGroup(chat) ? ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteChannelToast) : LocaleController.getString(R.string.FilterInvitePrivateChannelToast) : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteGroupToast) : LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                        arrayList2.add(chat);
                        str = string;
                    }
                    if (yzVar.v != longValue || System.currentTimeMillis() - yzVar.w > 1500) {
                        yzVar.v = longValue;
                        yzVar.w = System.currentTimeMillis();
                        org.telegram.ui.Components.qc.a0(yzVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > yzVar.a0()) {
                    yzVar.showDialog(new eg.v0(4, yzVar.currentAccount, yzVar.getParentActivity(), yzVar, null));
                    return;
                }
                yzVar2 = yzVar;
                arrayList.add(l10);
                yzVar2.D = true;
                yzVar2.X();
                ((org.telegram.ui.Cells.g4) view).c(true, true);
            }
            yzVar2.Y();
            yzVar2.f0(true);
            yzVar2.g0();
        }
    }

    public final boolean W(boolean z4) {
        if (this.e.isEmpty() || !this.D) {
            return true;
        }
        if (!z4) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.UnsavedChangesMessage);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.nz
            public final /* synthetic */ yz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.nz
            public final /* synthetic */ yz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
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
        float f10 = this.D ? !this.e.isEmpty() ? 1.0f : 0.5f : 0.0f;
        if (Math.abs(this.Q - f10) > 0.1f) {
            this.r.clearAnimation();
            ViewPropertyAnimator animate = this.r.animate();
            this.Q = f10;
            animate.alpha(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.nr.h).start();
        }
    }

    public final void Y() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.D) {
            return;
        }
        ArrayList arrayList = this.e;
        boolean z4 = true;
        boolean z10 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z10) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10))))) {
                    break;
                }
            }
        }
        z4 = z10;
        if (z4) {
            return;
        }
        this.D = false;
        X();
    }

    public final void Z(org.telegram.ui.Components.z00 z00Var, boolean z4) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z4) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        z00Var.a(LocaleController.getString(arrayList.size() >= Math.min(a0(), arrayList2.size()) ? R.string.DeselectAll : R.string.SelectAll), new lh.r5(this, z00Var, z4, 22));
        this.D = true;
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
        if (tL_exportedChatlistInvite == null || this.B || !this.D) {
            return;
        }
        e0(true);
        this.B = true;
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
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new mz(this, 1));
        Utilities.Callback callback = this.y;
        if (callback != null) {
            callback.run(tL_exportedChatlistInvite);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        return W(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        d0(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 9));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.mr mrVar = new org.telegram.ui.Components.mr(mutate, new org.telegram.ui.Components.rp(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.n = mrVar;
        this.r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), mrVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        jb1 jb1Var = new jb1(context, 8, null);
        this.a = jb1Var;
        jb1Var.setLayoutManager(new f2.i0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, k7.b6.c(-1.0f, -1));
        jb1 jb1Var2 = this.a;
        xz xzVar = new xz(this);
        this.b = xzVar;
        jb1Var2.setAdapter(xzVar);
        this.a.setOnItemClickListener(new j(this, 8));
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
                long j10 = dialog.id;
                boolean z4 = j10 < 0;
                if (j10 < 0) {
                    z4 = b10.g0(getMessagesController().getChat(Long.valueOf(-dialog.id)));
                }
                if (z4) {
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
        this.E = 1;
        if (tL_exportedChatlistInvite != null) {
            this.G = 1;
            this.F = 2;
            this.E = 4;
            this.H = 3;
        } else {
            this.G = -1;
            this.F = -1;
            this.H = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
        } else {
            int i14 = this.E;
            int i15 = i14 + 1;
            this.I = i14;
            int i16 = i14 + 2;
            this.E = i16;
            this.J = i15;
            int size = (arrayList.size() - 1) + i16;
            this.K = size;
            this.E = size + 1;
            this.L = size;
        }
        xz xzVar2 = this.b;
        if (xzVar2 != null) {
            xzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z4) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String string = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? LocaleController.getString(R.string.FilterShare) : tL_exportedChatlistInvite.title;
        if (z4) {
            this.actionBar.I(string, false, 220L, null);
        } else {
            this.actionBar.setTitle(string);
        }
    }

    public final void e0(boolean z4) {
        if (!z4) {
            AndroidUtilities.cancelRunOnUIThread(this.O);
        }
        if (this.n != null) {
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n.c, z4 ? 1.0f : 0.0f);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 12));
            this.P.setDuration((long) (Math.abs(this.n.c - (z4 ? 1.0f : 0.0f)) * 200.0f));
            this.P.setInterpolator(org.telegram.ui.Components.nr.f);
            this.P.start();
        }
    }

    public final void f0(boolean z4) {
        org.telegram.ui.Components.z00 z00Var = this.M;
        if (z00Var == null) {
            return;
        }
        ArrayList arrayList = this.e;
        z00Var.b(arrayList.size() <= 0 ? LocaleController.getString("FilterInviteHeaderChatsEmpty") : LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]), z4);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z10 = arrayList.size() >= Math.min(a0(), arrayList2.size());
            this.M.a(LocaleController.getString(!z10 ? R.string.SelectAll : R.string.DeselectAll), new org.telegram.ui.Components.kv0(4, this, z10));
        } else {
            this.M.a("", null);
        }
        if (z4) {
            AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.M.a.getText()) + ", " + ((Object) this.M.b.getText()));
        }
    }

    public final void g0() {
        oz ozVar = this.N;
        if (ozVar == null) {
            return;
        }
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            ih.s sVar = ozVar.a;
            sVar.setText(string);
            sVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = ozVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        oz ozVar2 = this.N;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z4 = dialogFilter.title_noanimate;
        ih.s sVar2 = ozVar2.a;
        sVar2.setText(replaceTags);
        sVar2.h = z4 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        return W(z4);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.C != 0) {
            getConnectionsManager().cancelRequest(this.C, true);
            this.C = 0;
        }
    }
}
