package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xg0 extends ph1 implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public FrameLayout B;
    public zg0 C;
    public pg.b D;
    public View E;
    public Integer F;
    public qy G;
    public bh.b[] H;
    public int I;
    public int J;
    public int K;
    public NotificationCenter.ObserversGroup L;
    public NotificationCenter.ObserversGroup M;
    public ph.f3 N;
    public boolean O;
    public final sg.c P;
    public final sg.d Q;
    public IUpdateLayout w;
    public boolean x;
    public yg1 y;
    public final xd.a v = new xd.a(0, this, org.telegram.ui.Components.mr.h, 380, true);
    public final RectF R = new RectF();

    public xg0() {
        if (Build.VERSION.SDK_INT >= 31) {
            sg.d dVar = new sg.d(null);
            this.Q = dVar;
            dVar.j(new ug0(this));
        } else {
            this.Q = null;
        }
        this.P = new sg.c();
        c9 c9Var = new c9(this, 5);
        setBulletinDelegate(c9Var);
        org.telegram.ui.Components.ic.a(this.b, c9Var);
    }

    public static /* synthetic */ void Y(xg0 xg0Var, int i10, org.telegram.ui.Components.p70 p70Var) {
        if (xg0Var.currentAccount == i10) {
            return;
        }
        p70Var.u();
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.K0(i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        if (r6.includesDialog(r19.getAccountInstance(), r7, r4) == false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Z(xg0 xg0Var, View view) {
        ArrayList<MessagesController.DialogFilter> dialogFilters;
        ArrayList<MessagesController.DialogFilter> arrayList;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        boolean z4;
        TLRPC.EncryptedChat n10;
        ?? r22 = 0;
        if (xg0Var.getParentActivity() == null || xg0Var.getParentActivity() == null || (dialogFilters = xg0Var.getMessagesController().getDialogFilters()) == null || dialogFilters.size() <= 1) {
            return false;
        }
        org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(xg0Var, view);
        int i10 = 0;
        while (i10 < dialogFilters.size()) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, xg0Var.getParentActivity(), xg0Var.getResourceProvider(), false, false);
            g1Var3.setPadding(AndroidUtilities.dp(18.0f), r22, AndroidUtilities.dp(18.0f), r22);
            CharSequence replaceEmoji = Emoji.replaceEmoji(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, g1Var3.getTextView().getPaint().getFontMetricsInt(), r22);
            if (!dialogFilter.isDefault()) {
                replaceEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, dialogFilter.entities, g1Var3.getTextView().getPaint().getFontMetricsInt());
            }
            int mainUnreadCount = dialogFilter.isDefault() ? MessagesStorage.getInstance(xg0Var.currentAccount).getMainUnreadCount() : dialogFilter.unreadCount;
            if (mainUnreadCount > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) String.valueOf(mainUnreadCount));
                MessagesController messagesController = xg0Var.getMessagesController();
                ArrayList<TLRPC.Dialog> dialogs = dialogFilter.isDefault() ? messagesController.getDialogs(r22) : messagesController.getAllDialogs();
                int i11 = 0;
                org.telegram.ui.ActionBar.g1 g1Var4 = g1Var3;
                while (true) {
                    if (i11 >= dialogs.size()) {
                        arrayList = dialogFilters;
                        g1Var2 = g1Var4;
                        z4 = false;
                        break;
                    }
                    TLRPC.Dialog dialog = dialogs.get(i11);
                    if (dialogFilter.isDefault()) {
                        g1Var2 = g1Var4;
                    } else {
                        g1Var2 = g1Var4;
                        long j10 = dialog.id;
                        if (DialogObject.isEncryptedDialog(j10) && (n10 = org.telegram.messenger.y3.n(messagesController, j10)) != null) {
                            j10 = n10.user_id;
                        }
                    }
                    if (messagesController.getDialogUnreadCount(dialog) > 0 || dialog.unread_mark) {
                        long j11 = dialog.id;
                        arrayList = dialogFilters;
                        if (!messagesController.isDialogMuted(j11, 0L)) {
                            z4 = true;
                            break;
                        }
                        i11++;
                        dialogFilters = arrayList;
                        g1Var4 = g1Var2;
                    }
                    arrayList = dialogFilters;
                    i11++;
                    dialogFilters = arrayList;
                    g1Var4 = g1Var2;
                }
                spannableStringBuilder.setSpan(new vg0(xg0Var, mainUnreadCount, z4), length, spannableStringBuilder.length(), 33);
                org.telegram.ui.ActionBar.g1 g1Var5 = g1Var2;
                g1Var5.setContentDescription(TextUtils.concat(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, "\n", LocaleController.formatPluralString("AccDescrUnreadCount", mainUnreadCount, new Object[0])));
                replaceEmoji = spannableStringBuilder;
                g1Var = g1Var5;
            } else {
                arrayList = dialogFilters;
                g1Var = g1Var3;
            }
            g1Var.setEmojiCacheType(dialogFilter.title_noanimate ? 26 : 0);
            g1Var.g(replaceEmoji, 0, new org.telegram.ui.Components.e10(xg0Var.getParentActivity(), R.drawable.msg_folders, xg0Var.getMessagesController().folderTags ? dialogFilter.color : -1));
            g1Var.getTextView().setEmojiColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new c0(xg0Var, H, dialogFilter, 11));
            H.r(g1Var, k7.b6.n(-1, -2));
            i10++;
            dialogFilters = arrayList;
            r22 = 0;
        }
        H.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
        H.X = AndroidUtilities.dp(400.0f);
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.W(b02);
        H.i = 3;
        H.Z();
        return true;
    }

    public static /* synthetic */ void a0(xg0 xg0Var) {
        xg0Var.getUserConfig().setShowCallsTab(true);
        xg0Var.g0(true, true);
        NotificationCenter.getInstance(xg0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(xg0 xg0Var) {
        xg0Var.getClass();
        int i10 = 0;
        Integer num = null;
        for (int i11 = 3; i11 >= 0; i11--) {
            if (!UserConfig.getInstance(i11).isClientActivated()) {
                i10++;
                if (num == null) {
                    num = Integer.valueOf(i11);
                }
            }
        }
        if (!UserConfig.hasPremiumOnAccounts()) {
            i10--;
        }
        if (i10 > 0 && num != null) {
            xg0Var.presentFragment(new pg0(num.intValue()));
        } else {
            if (UserConfig.hasPremiumOnAccounts()) {
                return;
            }
            xg0Var.showDialog(new eg.v0(7, xg0Var.currentAccount, xg0Var.getParentActivity(), xg0Var, null));
        }
    }

    public static /* synthetic */ void c0(xg0 xg0Var) {
        xg0Var.getUserConfig().setShowCallsTab(false);
        xg0Var.g0(false, true);
        NotificationCenter.getInstance(xg0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    @Override // org.telegram.ui.ph1
    public final org.telegram.ui.ActionBar.p2 V(int i10) {
        if (i10 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i10 == 2) {
            if (!getUserConfig().showCallsTab) {
                return new w81(android.support.v4.media.a.i("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new n9(bundle2);
        }
        if (i10 == 0) {
            qy qyVar = new qy(android.support.v4.media.a.i("hasMainTabs", true));
            this.G = qyVar;
            qyVar.F3 = new ug0(this);
            return qyVar;
        }
        if (i10 != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.p2 X = X();
        return X != null && X.canBeginSlide();
    }

    @Override // org.telegram.ui.ph1, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        super.createView(context);
        zg0 zg0Var = new zg0(context, this.resourceProvider);
        this.C = zg0Var;
        zg0Var.setClipChildren(false);
        this.C.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.C.setMaxWidth(AndroidUtilities.dp(344.0f));
        bh.b[] bVarArr = new bh.b[5];
        this.H = bVarArr;
        bVarArr[0] = bh.b.b(context, this.resourceProvider, bh.a.n, R.string.MainTabsChats);
        this.H[1] = bh.b.b(context, this.resourceProvider, bh.a.f, R.string.MainTabsContacts);
        this.H[2] = bh.b.b(context, this.resourceProvider, bh.a.r, R.string.Settings);
        this.H[3] = bh.b.b(context, this.resourceProvider, bh.a.h, R.string.MainTabsCalls);
        bh.b[] bVarArr2 = this.H;
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        int i11 = R.string.MainTabsProfile;
        bh.b bVar = new bh.b(context);
        bVar.a.setText(LocaleController.getString(i11));
        bVar.b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(0, user);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.e(user, z8Var);
        p9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.c = p9Var;
        bVar.addView(p9Var, k7.b6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        final int i12 = 0;
        this.H[0].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.sg0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i12) {
                    case 0:
                        break;
                    case 1:
                        xg0 xg0Var = this.b;
                        if (xg0Var.getParentActivity() != null && xg0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(xg0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new tg0(xg0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new tg0(xg0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        xg0 xg0Var2 = this.b;
                        if (xg0Var2.getParentActivity() != null && xg0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.p70 H2 = org.telegram.ui.Components.p70.H(xg0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new tg0(xg0Var2, 1), false);
                            if (xg0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new tg0(xg0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new tg0(xg0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), xg0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H2.W(b03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        this.b.k0(view);
                        break;
                }
                return true;
            }
        });
        final int i13 = 1;
        this.H[1].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.sg0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i13) {
                    case 0:
                        break;
                    case 1:
                        xg0 xg0Var = this.b;
                        if (xg0Var.getParentActivity() != null && xg0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(xg0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new tg0(xg0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new tg0(xg0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        xg0 xg0Var2 = this.b;
                        if (xg0Var2.getParentActivity() != null && xg0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.p70 H2 = org.telegram.ui.Components.p70.H(xg0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new tg0(xg0Var2, 1), false);
                            if (xg0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new tg0(xg0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new tg0(xg0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), xg0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H2.W(b03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        this.b.k0(view);
                        break;
                }
                return true;
            }
        });
        final int i14 = 2;
        this.H[3].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.sg0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        xg0 xg0Var = this.b;
                        if (xg0Var.getParentActivity() != null && xg0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(xg0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new tg0(xg0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new tg0(xg0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        xg0 xg0Var2 = this.b;
                        if (xg0Var2.getParentActivity() != null && xg0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.p70 H2 = org.telegram.ui.Components.p70.H(xg0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new tg0(xg0Var2, 1), false);
                            if (xg0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new tg0(xg0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new tg0(xg0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), xg0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H2.W(b03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        this.b.k0(view);
                        break;
                }
                return true;
            }
        });
        final int i15 = 3;
        this.H[4].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.sg0
            public final /* synthetic */ xg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i15) {
                    case 0:
                        break;
                    case 1:
                        xg0 xg0Var = this.b;
                        if (xg0Var.getParentActivity() != null && xg0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(xg0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new tg0(xg0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new tg0(xg0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        xg0 xg0Var2 = this.b;
                        if (xg0Var2.getParentActivity() != null && xg0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.p70 H2 = org.telegram.ui.Components.p70.H(xg0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new tg0(xg0Var2, 1), false);
                            if (xg0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new tg0(xg0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new tg0(xg0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), xg0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H2.W(b03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        this.b.k0(view);
                        break;
                }
                return true;
            }
        });
        this.C.M.add(this.H[0]);
        this.C.M.add(this.H[1]);
        this.C.M.add(this.H[4]);
        this.C.M.add(this.H[3]);
        int i16 = 0;
        while (true) {
            bh.b[] bVarArr3 = this.H;
            if (i16 >= bVarArr3.length) {
                break;
            }
            bh.b bVar2 = bVarArr3[i16];
            bVar2.setOnClickListener(new lh.y0(this, i16 > 2 ? i16 - 1 : i16, 16));
            this.C.addView(this.H[i16]);
            this.C.i(bVar2, true, false);
            i16++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        sg.c cVar = this.P;
        cVar.a(themedColor);
        ug.i iVar = new ug.i(this.b);
        sg.a aVar = this.Q;
        if (aVar == null) {
            aVar = cVar;
        }
        n0 n0Var = this.b;
        boolean isEnabled = LiteMode.isEnabled(262144);
        zg0 zg0Var2 = this.C;
        qg.d f10 = rg.b.f(this.resourceProvider);
        pg.b k10 = aVar.k();
        if (isEnabled && Build.VERSION.SDK_INT >= 33 && (k10 instanceof pg.c)) {
            pg.c cVar2 = (pg.c) k10;
            cVar2.N = new ng.f(cVar2.I);
        }
        k10.n(f10);
        if (n0Var != null && zg0Var2 != null) {
            iVar.d(zg0Var2, n0Var, new mg.w(1, k10, zg0Var2), false);
        }
        this.D = k10;
        k10.p(AndroidUtilities.dp(28.0f));
        this.D.o(AndroidUtilities.dp(7.666f));
        this.C.setBackground(this.D);
        n0 n0Var2 = this.b;
        this.E = new View(context);
        View view = this.E;
        pg.d dVar = new pg.d(cVar);
        dVar.n(null);
        if (n0Var2 != null && view != null) {
            iVar.d(view, n0Var2, new mg.w(1, dVar, view), false);
        }
        ng.b bVar3 = new ng.b(dVar);
        bVar3.b(AndroidUtilities.dp(60.0f), true);
        this.E.setBackground(bVar3);
        this.b.addView(this.E, k7.b6.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.B = frameLayout;
        frameLayout.setOnClickListener(new dg.m(22));
        this.B.addView(this.C, k7.b6.e(-1, 72, 81));
        this.B.setClipToPadding(false);
        this.b.addView(this.B, k7.b6.e(-1, -2, 80));
        yg1 yg1Var = new yg1(context);
        this.y = yg1Var;
        this.b.addView(yg1Var, k7.b6.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.y);
        this.w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.b;
    }

    public final void d0() {
        sg.d dVar;
        View view;
        if (Build.VERSION.SDK_INT < 31 || (dVar = this.Q) == null || (view = this.fragmentView) == null) {
            return;
        }
        dVar.i(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar.l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        bh.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z4 = false;
        z4 = false;
        if (i10 == NotificationCenter.notificationsCountUpdated || i10 == NotificationCenter.updateInterfaces) {
            View view = this.fragmentView;
            if (view != null && view.isAttachedToWindow()) {
                z4 = true;
            }
            j0(z4);
            return;
        }
        if (i10 == NotificationCenter.appUpdateLoading) {
            IUpdateLayout iUpdateLayout3 = this.w;
            if (iUpdateLayout3 != null) {
                iUpdateLayout3.updateFileProgress(null);
                this.w.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.w) != null) {
                iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoadFailed) {
            String str2 = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.w) != null) {
                iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoadProgressChanged) {
            IUpdateLayout iUpdateLayout4 = this.w;
            if (iUpdateLayout4 != null) {
                iUpdateLayout4.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.appUpdateAvailable) {
            IUpdateLayout iUpdateLayout5 = this.w;
            if (iUpdateLayout5 == null || (launchActivity = LaunchActivity.D1) == null) {
                return;
            }
            iUpdateLayout5.updateAppUpdateViews(this.currentAccount, launchActivity.a0.size() == 1);
            return;
        }
        if (i10 == NotificationCenter.needSetDayNightTheme) {
            int currentPosition = this.c.getCurrentPosition();
            SparseArray sparseArray = this.a;
            int size = sparseArray.size();
            for (int i12 = 0; i12 < size; i12++) {
                nh1 nh1Var = (nh1) sparseArray.valueAt(i12);
                if (sparseArray.keyAt(i12) != currentPosition && nh1Var != null) {
                    nh1Var.a.clearViews();
                }
            }
            return;
        }
        if (i10 == NotificationCenter.callTabsVisibleToggled) {
            g0(getUserConfig().showCallsTab, true);
            oh1 oh1Var = this.c;
            if (oh1Var == null || oh1Var.getCurrentPosition() != 2) {
                W(2);
                return;
            }
            this.c.D(0);
            m0(0, true);
            this.x = true;
            return;
        }
        if (i10 != NotificationCenter.mainUserInfoChanged) {
            if (i10 == NotificationCenter.contactsPermissionBadgeCheck) {
                f0();
                return;
            }
            return;
        }
        bh.b[] bVarArr = this.H;
        if (bVarArr == null || (bVar = bVarArr[4]) == null) {
            return;
        }
        int i13 = this.currentAccount;
        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(UserConfig.getInstance(i13).getClientUserId()));
        bVar.c.e(user, new org.telegram.ui.Components.z8(0, user));
    }

    public final void e0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        oh1 oh1Var = this.c;
        this.P.a(i0.a.d(oh1Var != null ? oh1Var.r(0) : 1.0f, themedColor, themedColor2));
        View view = this.E;
        if (view != null) {
            view.invalidate();
        }
        pg.b bVar = this.D;
        if (bVar != null) {
            bVar.u();
        }
        d0();
        View view2 = this.E;
        if (view2 != null) {
            view2.invalidate();
        }
        zg0 zg0Var = this.C;
        if (zg0Var != null) {
            zg0Var.invalidate();
        }
        bh.b[] bVarArr = this.H;
        if (bVarArr != null) {
            for (bh.b bVar2 : bVarArr) {
                bVar2.getClass();
                bVar2.w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, bVar2.d);
                bVar2.s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, bVar2.d);
                bVar2.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, bVar2.d);
                bVar2.f();
                bVar2.invalidate();
            }
        }
    }

    public final void f0() {
        if (this.C == null || this.H[1] == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z4 = i10 >= 23 && ContactsController.hasContactsPermission();
        if (z4) {
            MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (i10 < 23 || !UserConfig.getInstance(this.currentAccount).syncContacts || z4 || !MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
            this.H[1].d(null, true, true);
        } else {
            this.H[1].d("!", true, true);
        }
    }

    public final void g0(boolean z4, boolean z10) {
        zg0 zg0Var = this.C;
        if (zg0Var != null) {
            zg0Var.i(this.H[2], !z4, z10);
            this.C.i(this.H[3], z4, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final Animator getCustomSlideTransition(boolean z4, boolean z10, float f10) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z4, z10, f10);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.c;
    }

    @Override // org.telegram.ui.ph1, org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        f fVar = new f(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.h5));
        return themeDescriptions;
    }

    public final void h0() {
        oh1 oh1Var = this.c;
        if (oh1Var == null || this.E == null) {
            return;
        }
        float a2 = 1.0f - k7.n.a(Math.abs(3.0f - oh1Var.getPositionAnimated()), 0.0f, 1.0f);
        float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.I)) * a2)) * this.v.e;
        this.E.setAlpha(navigationBarThirdButtonsFactor);
        this.E.setTranslationY(a2 * AndroidUtilities.dp(48.0f));
        this.E.setVisibility(navigationBarThirdButtonsFactor > 0.0f ? 0 : 8);
    }

    public final void i0() {
        View view = this.y.b;
        int dp = AndroidUtilities.dp(40.0f) + (-((view == null || view.getVisibility() != 0) ? 0 : AndroidUtilities.dp(44.0f)));
        float f10 = this.v.e;
        AndroidUtilities.lerp(0.85f, 1.0f, f10);
        this.B.setTranslationY(AndroidUtilities.lerp(dp, r0, f10));
        this.C.setClickable(f10 > 1.0f);
        this.C.setEnabled(f10 > 1.0f);
        this.C.setAlpha(f10);
        this.C.setVisibility(f10 <= 0.0f ? 8 : 0);
    }

    public final void j0(boolean z4) {
        if (this.C == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount <= 0) {
            this.H[0].d(null, false, z4);
        } else {
            this.H[0].d(LocaleController.formatNumber(mainUnreadCount, ','), false, z4);
        }
    }

    public final void k0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new eu(4));
        org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new tg0(this, 0), false);
        }
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                boolean z4 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                z8Var.r(currentUser);
                eg.y yVar = new eg.y(this, getParentActivity(), z4);
                linearLayout.addView(yVar, k7.b6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
                if (z4) {
                    p9Var.setScaleX(0.833f);
                    p9Var.setScaleY(0.833f);
                }
                p9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                p9Var.getImageReceiver().setCurrentAccount(intValue);
                p9Var.e(currentUser, z8Var);
                yVar.addView(p9Var, k7.b6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, k7.b6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new dg.m2(this, intValue, H, 16));
                H.r(linearLayout, k7.b6.n(230, 48));
            }
        }
        H.u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.m40.r.a();
    }

    public final qy l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        qy qyVar = new qy(bundle);
        this.G = qyVar;
        qyVar.F3 = new ug0(this);
        this.a.put(0, new nh1(qyVar));
        return this.G;
    }

    public final void m0(int i10, boolean z4) {
        int i11 = 0;
        while (true) {
            bh.b[] bVarArr = this.H;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e((i11 > 2 ? i11 + (-1) : i11) == i10, z4);
            i11++;
        }
    }

    public final void n0(float f10, boolean z4) {
        int i10 = 0;
        while (i10 < this.H.length) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f10));
            bh.b bVar = this.H[i10];
            bVar.G = max;
            bVar.F = z4;
            bVar.invalidate();
            i10++;
        }
        this.C.invalidate();
    }

    @Override // org.telegram.ui.ph1, org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        boolean onBackPressed = super.onBackPressed(z4);
        if (onBackPressed && this.c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z4) {
                this.c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onBeginSlide();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.L = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.M = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ph1, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.ic.h(this.b);
        NotificationCenter.ObserversGroup observersGroup = this.L;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.L = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.M;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.M = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ph1, org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        ph.f3 f3Var = this.N;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ph1, org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.O) {
            return;
        }
        if (this.N == null && org.telegram.ui.Components.m40.r.c()) {
            AndroidUtilities.runOnUIThread(new tg0(this, 7), 1500L);
        }
        this.O = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onSlideProgress(boolean z4, float f10) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onSlideProgress(z4, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void prepareFragmentToSlide(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z4, z10);
        }
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
