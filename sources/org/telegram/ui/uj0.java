package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class uj0 extends org.telegram.ui.Components.ab {
    public static uj0 u0;
    public final sj0 X;
    public final rj0 Y;
    public final s50 Z;
    public final qj0 a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final HashSet d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public final HashMap g0;
    public final ArrayList h0;
    public final LinkedHashMap i0;
    public String j0;
    public ug.g k0;
    public int l0;
    public int m0;
    public float n0;
    public org.telegram.ui.Components.za0 o0;
    public final int p0;
    public final tj0 q0;
    public final Boolean r0;
    public final Boolean s0;
    public final w5 t0;

    public uj0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Boolean bool, Boolean bool2, tj0 tj0Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        this.b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.d0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.e0 = arrayList3;
        this.f0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.g0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.h0 = arrayList4;
        this.i0 = new LinkedHashMap();
        this.l0 = AndroidUtilities.dp(120.0f);
        this.m0 = -1;
        this.t0 = new w5(this, 11);
        this.p0 = i10;
        this.r0 = bool;
        this.s0 = bool2;
        this.q0 = tj0Var;
        this.e.setTitle(y());
        qj0 qj0Var = new qj0(getContext(), this.resourcesProvider);
        this.a0 = qj0Var;
        qj0Var.setOnCloseClickListener(new nj0(this, 0));
        qj0Var.setText(y());
        qj0Var.setCloseImageVisible(false);
        qj0Var.e.c(0.0f, false);
        this.o0 = new org.telegram.ui.Components.za0(this, 1);
        rj0 rj0Var = new rj0(this, getContext(), this.resourcesProvider);
        this.Y = rj0Var;
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        rj0Var.setBackgroundColor(getThemedColor(i11));
        rj0Var.setOnSearchTextChange(new s3(this, 10));
        rj0Var.b.setHintText(LocaleController.getString(R.string.Search), false);
        s50 s50Var = new s50(this, getContext(), 1);
        this.Z = s50Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView(qj0Var, 0, w7.y5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(rj0Var, w7.y5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(s50Var, w7.y5.f(1.0f, 55, i14, 0, i14, 0));
        o20 o20Var = new o20(getContext(), this.resourcesProvider, (org.telegram.ui.Components.vl0) null);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        sj0 sj0Var = new sj0(this, getContext(), this.resourcesProvider);
        this.X = sj0Var;
        sj0Var.setOnClickListener(new oj0(this, 0));
        o20Var.addView(sj0Var, w7.y5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(o20Var, w7.y5.f(-2.0f, 87, i15, 0, i15, 0));
        ug.g gVar = this.k0;
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        gVar.n = arrayList;
        gVar.f = vl0Var;
        int i16 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new h3(this, 21));
        this.d.setOnItemClickListener(new i2.s(this, i10, 14));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.C = false;
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new ci.r1(this, 6));
        rj0Var.setText("");
        rj0Var.d.b(false);
        rj0Var.b(false, hashSet, new nj0(this, 1), null);
        qj0Var.setText(y());
        S(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        hashMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        U(false, true);
        fixNavigationBar();
    }

    public static void P(uj0 uj0Var, int i10, View view) {
        rj0 rj0Var = uj0Var.Y;
        HashSet hashSet = uj0Var.d0;
        if (view instanceof xg.l) {
            TLRPC.User user = ((xg.l) view).getUser();
            long j3 = user.id;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                uj0Var.i0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j3));
                new org.telegram.ui.Components.xc(uj0Var.container, uj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", uj0Var.p0, new Object[0])).k(true);
                try {
                    uj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            rj0Var.b(true, hashSet, new nj0(uj0Var, 2), null);
            uj0Var.U(true, false);
            if (TextUtils.isEmpty(uj0Var.j0)) {
                return;
            }
            uj0Var.j0 = null;
            rj0Var.setText("");
            AndroidUtilities.cancelRunOnUIThread(uj0Var.t0);
            uj0Var.T(true, true);
        }
    }

    public static void Q(uj0 uj0Var, String str) {
        TLRPC.User user;
        if (uj0Var.m0 >= 0) {
            ConnectionsManager.getInstance(uj0Var.currentAccount).cancelRequest(uj0Var.m0, true);
            uj0Var.m0 = -1;
        }
        Boolean bool = uj0Var.r0;
        boolean z10 = bool != null && bool.booleanValue();
        of ofVar = new of(29, uj0Var, str);
        int i10 = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(i10).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(i10).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        String lowerCase = str.toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i11);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.l0.v(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
                        arrayList.add(user);
                    } else if (user.usernames != null) {
                        for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                            TLRPC.TL_username tL_username = user.usernames.get(i12);
                            if (tL_username != null && tL_username.active) {
                                String lowerCase3 = tL_username.username.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.l0.v("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, lowerCase3)) {
                                    arrayList.add(user);
                                    break;
                                }
                            }
                        }
                    } else {
                        String str2 = user.username;
                        if (str2 != null) {
                            String lowerCase4 = str2.toLowerCase();
                            if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.l0.v("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, lowerCase4)) {
                                arrayList.add(user);
                            }
                        }
                    }
                }
            }
        }
        ofVar.run(arrayList);
    }

    @Override // org.telegram.ui.Components.ab
    public final void B(Canvas canvas, int i10) {
        float f7 = AndroidUtilities.statusBarHeight;
        qj0 qj0Var = this.a0;
        qj0Var.setTranslationY(Math.max(i10, (((qj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f7) + AndroidUtilities.dp(8.0f));
        float translationY = qj0Var.getTranslationY() + qj0Var.getMeasuredHeight();
        rj0 rj0Var = this.Y;
        rj0Var.setTranslationY(translationY);
        float translationY2 = rj0Var.getTranslationY() + rj0Var.getMeasuredHeight();
        this.Z.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (rj0Var.getMeasuredHeight() + qj0Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.r0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.s0;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    public final void S(boolean z10) {
        sj0 sj0Var = this.X;
        sj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.d0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.o0, 0, 1, 33);
            Boolean bool = this.r0;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChooseUsers));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(this.p0 > 1 ? R.string.ChooseBots : R.string.ChooseBot));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftPremiumProceedBtn));
        }
        sj0Var.b(hashSet.size(), true);
        sj0Var.g(spannableStringBuilder, z10, false);
        sj0Var.setEnabled(true);
    }

    public final void T(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        ug.g gVar;
        ArrayList arrayList3 = this.b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.j0);
        HashSet hashSet = this.d0;
        if (isEmpty) {
            ArrayList arrayList5 = this.e0;
            if (arrayList5.isEmpty()) {
                i10 = 0;
            } else {
                ArrayList arrayList6 = new ArrayList();
                int size = arrayList5.size();
                i10 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (!user.self && !user.bot && !UserObject.isService(user.id) && !UserObject.isDeleted(user) && R(user)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList6.add(ug.f.c(user, hashSet.contains(Long.valueOf(user.id))));
                    }
                }
                if (!arrayList6.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(ug.f.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList6);
                }
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.r0;
            if (bool == null || !bool.booleanValue()) {
                f7 = 32.0f;
            } else {
                ArrayList arrayList7 = new ArrayList();
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                int size2 = allDialogs.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.Dialog dialog = allDialogs.get(i13);
                    i13++;
                    TLRPC.Dialog dialog2 = dialog;
                    int i14 = size2;
                    if (dialog2.id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.id));
                        if (R(user2)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList7.add(ug.f.c(user2, hashSet.contains(Long.valueOf(user2.id))));
                        }
                    }
                    size2 = i14;
                    allDialogs = arrayList2;
                }
                f7 = 32.0f;
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(ug.f.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList7);
                }
            }
            ArrayList arrayList8 = this.h0;
            int size3 = arrayList8.size();
            i11 = i10;
            int i15 = 0;
            while (i15 < size3) {
                Object obj2 = arrayList8.get(i15);
                i15++;
                String str = (String) obj2;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.g0.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        String str2 = str;
                        if (tL_contact.user_id == clientUserId) {
                            arrayList = arrayList8;
                        } else {
                            arrayList = arrayList8;
                            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (R(user3)) {
                                i11 += AndroidUtilities.dp(56.0f);
                                arrayList9.add(ug.f.c(user3, hashSet.contains(Long.valueOf(user3.id))));
                                size3 = size3;
                                arrayList8 = arrayList;
                                str = str2;
                                i15 = i15;
                            }
                        }
                        arrayList8 = arrayList;
                        str = str2;
                    }
                    int i16 = size3;
                    int i17 = i15;
                    String str3 = str;
                    ArrayList arrayList10 = arrayList8;
                    if (!arrayList9.isEmpty()) {
                        int dp = AndroidUtilities.dp(f7) + i11;
                        String upperCase = str3.toUpperCase();
                        ug.f fVar = new ug.f(7, false);
                        fVar.g = upperCase;
                        arrayList4.add(fVar);
                        arrayList4.addAll(arrayList9);
                        i11 = dp;
                    }
                    size3 = i16;
                    arrayList8 = arrayList10;
                    i15 = i17;
                }
            }
        } else {
            ArrayList arrayList11 = this.f0;
            int size4 = arrayList11.size();
            i11 = 0;
            int i18 = 0;
            while (i18 < size4) {
                Object obj3 = arrayList11.get(i18);
                i18++;
                TLRPC.User user4 = (TLRPC.User) obj3;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(ug.f.c(user4, hashSet.contains(Long.valueOf(user4.id))));
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new ug.f(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        ug.f fVar2 = new ug.f(-1, false);
        fVar2.l = max;
        arrayList4.add(fVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                ug.g gVar2 = this.k0;
                oj0 oj0Var = new oj0(this, 1);
                org.telegram.ui.Cells.w3 w3Var = gVar2.v;
                if (w3Var != null) {
                    w3Var.b(LocaleController.getString(R.string.UsersDeselectAll), oj0Var);
                }
            } else {
                org.telegram.ui.Cells.w3 w3Var2 = this.k0.v;
                if (w3Var2 != null) {
                    w3Var2.setRightText(null);
                }
            }
        }
        if (!z11 || (gVar = this.k0) == null) {
            return;
        }
        if (z10) {
            gVar.E(arrayList3, arrayList4);
        } else {
            gVar.l();
        }
    }

    public final void U(boolean z10, boolean z11) {
        int S;
        T(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (i10 >= vl0Var.getChildCount()) {
                break;
            }
            View childAt = vl0Var.getChildAt(i10);
            if ((childAt instanceof xg.l) && (S = RecyclerView.S(childAt)) > 0) {
                if (i11 == -1) {
                    i11 = S;
                }
                int i13 = S - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.c0;
                    if (i13 < arrayList.size()) {
                        ug.f fVar = (ug.f) arrayList.get(i13);
                        xg.l lVar = (xg.l) childAt;
                        lVar.c(fVar.k, z10);
                        TLRPC.Chat chat = fVar.e;
                        if (chat != null) {
                            lVar.i(this.k0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            lVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = S;
            }
            i10++;
        }
        if (z10) {
            this.k0.q(0, i11);
            ug.g gVar = this.k0;
            gVar.q(i12, gVar.h() - i12);
        }
        S(z10);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.t0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override // org.telegram.ui.Components.ab
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        ug.g gVar = new ug.g(getContext(), this.resourcesProvider, true);
        this.k0 = gVar;
        gVar.s = true;
        return gVar;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        Boolean bool = this.r0;
        if (bool == null || !bool.booleanValue()) {
            return LocaleController.getString(R.string.ChooseUsers);
        }
        return LocaleController.getString(this.p0 > 1 ? R.string.ChooseBots : R.string.ChooseBot);
    }
}
