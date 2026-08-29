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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zi0 extends org.telegram.ui.Components.xa {
    public static zi0 q0;
    public final xi0 T;
    public final wi0 U;
    public final cg.h0 V;
    public final vi0 W;
    public final ArrayList X;
    public final ArrayList Y;
    public final HashSet Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public final HashMap c0;
    public final ArrayList d0;
    public final LinkedHashMap e0;
    public String f0;
    public fg.h g0;
    public int h0;
    public int i0;
    public float j0;
    public eg.p2 k0;
    public final int l0;
    public final yi0 m0;
    public final Boolean n0;
    public final Boolean o0;
    public final w5 p0;

    public zi0(org.telegram.ui.ActionBar.o2 o2Var, int i10, Boolean bool, Boolean bool2, yi0 yi0Var) {
        super(o2Var.getParentActivity(), o2Var, true, false, false, 1, o2Var.getResourceProvider());
        this.X = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y = arrayList;
        HashSet hashSet = new HashSet();
        this.Z = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.a0 = arrayList3;
        this.b0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.c0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.d0 = arrayList4;
        this.e0 = new LinkedHashMap();
        this.h0 = AndroidUtilities.dp(120.0f);
        this.i0 = -1;
        this.p0 = new w5(this, 11);
        this.l0 = i10;
        this.n0 = bool;
        this.o0 = bool2;
        this.m0 = yi0Var;
        this.e.setTitle(y());
        vi0 vi0Var = new vi0(getContext(), this.resourcesProvider);
        this.W = vi0Var;
        vi0Var.setOnCloseClickListener(new ti0(this, 0));
        vi0Var.setText(y());
        vi0Var.setCloseImageVisible(false);
        vi0Var.e.c(0.0f, false);
        this.k0 = new eg.p2(this, 2);
        wi0 wi0Var = new wi0(this, getContext(), this.resourcesProvider);
        this.U = wi0Var;
        int i11 = org.telegram.ui.ActionBar.g6.h5;
        wi0Var.setBackgroundColor(getThemedColor(i11));
        wi0Var.setOnSearchTextChange(new x3(this, 10));
        wi0Var.b.setHintText(LocaleController.getString(R.string.Search), false);
        cg.h0 h0Var = new cg.h0(this, getContext(), 28);
        this.V = h0Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView(vi0Var, 0, i7.f6.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(wi0Var, i7.f6.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(h0Var, i7.f6.f(1.0f, 55, i14, 0, i14, 0));
        ig.a aVar = new ig.a(getContext(), this.resourcesProvider, (org.telegram.ui.Components.jl0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        xi0 xi0Var = new xi0(this, getContext(), this.resourcesProvider);
        this.T = xi0Var;
        xi0Var.setOnClickListener(new ui0(this, 0));
        aVar.addView(xi0Var, i7.f6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, i7.f6.f(-2.0f, 87, i15, 0, i15, 0));
        fg.h hVar = this.g0;
        org.telegram.ui.Components.jl0 jl0Var = this.d;
        hVar.h = arrayList;
        hVar.f = jl0Var;
        int i16 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new m3(this, 21));
        this.d.setOnItemClickListener(new eg.n2(this, i10, 13));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new eg.f2(this, 7));
        wi0Var.setText("");
        wi0Var.d.b(false);
        wi0Var.b(false, hashSet, new ti0(this, 1), null);
        vi0Var.setText(y());
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

    public static void P(zi0 zi0Var, int i10, View view) {
        wi0 wi0Var = zi0Var.U;
        HashSet hashSet = zi0Var.Z;
        if (view instanceof ig.n) {
            TLRPC.User user = ((ig.n) view).getUser();
            long j10 = user.id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                zi0Var.e0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.tc(zi0Var.container, zi0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", zi0Var.l0, new Object[0])).k(true);
                try {
                    zi0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            wi0Var.b(true, hashSet, new ti0(zi0Var, 2), null);
            zi0Var.U(true, false);
            if (TextUtils.isEmpty(zi0Var.f0)) {
                return;
            }
            zi0Var.f0 = null;
            wi0Var.setText("");
            AndroidUtilities.cancelRunOnUIThread(zi0Var.p0);
            zi0Var.T(true, true);
        }
    }

    public static void Q(zi0 zi0Var, String str) {
        TLRPC.User user;
        if (zi0Var.i0 >= 0) {
            ConnectionsManager.getInstance(zi0Var.currentAccount).cancelRequest(zi0Var.i0, true);
            zi0Var.i0 = -1;
        }
        Boolean bool = zi0Var.n0;
        boolean z10 = bool != null && bool.booleanValue();
        tm tmVar = new tm(24, zi0Var, str);
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
                    if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.x3.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(user);
                    } else if (user.usernames != null) {
                        for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                            TLRPC.TL_username tL_username = user.usernames.get(i12);
                            if (tL_username != null && tL_username.active) {
                                String lowerCase3 = tL_username.username.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.x3.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, lowerCase3)) {
                                    arrayList.add(user);
                                    break;
                                }
                            }
                        }
                    } else {
                        String str2 = user.username;
                        if (str2 != null) {
                            String lowerCase4 = str2.toLowerCase();
                            if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.x3.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, lowerCase4)) {
                                arrayList.add(user);
                            }
                        }
                    }
                }
            }
        }
        tmVar.run(arrayList);
    }

    @Override // org.telegram.ui.Components.xa
    public final void C(Canvas canvas, int i10) {
        float f9 = AndroidUtilities.statusBarHeight;
        vi0 vi0Var = this.W;
        vi0Var.setTranslationY(Math.max(i10, (((vi0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f9) + AndroidUtilities.dp(8.0f));
        float translationY = vi0Var.getTranslationY() + vi0Var.getMeasuredHeight();
        wi0 wi0Var = this.U;
        wi0Var.setTranslationY(translationY);
        float translationY2 = wi0Var.getTranslationY() + wi0Var.getMeasuredHeight();
        this.V.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (wi0Var.getMeasuredHeight() + vi0Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.n0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.o0;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    public final void S(boolean z10) {
        xi0 xi0Var = this.T;
        xi0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Z;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.k0, 0, 1, 33);
            Boolean bool = this.n0;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChooseUsers));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(this.l0 > 1 ? R.string.ChooseBots : R.string.ChooseBot));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftPremiumProceedBtn));
        }
        xi0Var.c(hashSet.size(), true);
        xi0Var.g(spannableStringBuilder, z10, false);
        xi0Var.setEnabled(true);
    }

    public final void T(boolean z10, boolean z11) {
        int i10;
        float f9;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        fg.h hVar;
        ArrayList arrayList3 = this.X;
        arrayList3.clear();
        ArrayList arrayList4 = this.Y;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f0);
        HashSet hashSet = this.Z;
        if (isEmpty) {
            ArrayList arrayList5 = this.a0;
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
                        arrayList6.add(fg.g.c(user, hashSet.contains(Long.valueOf(user.id))));
                    }
                }
                if (!arrayList6.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(fg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList6);
                }
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.n0;
            if (bool == null || !bool.booleanValue()) {
                f9 = 32.0f;
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
                            arrayList7.add(fg.g.c(user2, hashSet.contains(Long.valueOf(user2.id))));
                        }
                    }
                    size2 = i14;
                    allDialogs = arrayList2;
                }
                f9 = 32.0f;
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(fg.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList7);
                }
            }
            ArrayList arrayList8 = this.d0;
            int size3 = arrayList8.size();
            i11 = i10;
            int i15 = 0;
            while (i15 < size3) {
                Object obj2 = arrayList8.get(i15);
                i15++;
                String str = (String) obj2;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.c0.get(str);
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
                                arrayList9.add(fg.g.c(user3, hashSet.contains(Long.valueOf(user3.id))));
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
                        int dp = AndroidUtilities.dp(f9) + i11;
                        String upperCase = str3.toUpperCase();
                        fg.g gVar = new fg.g(7, false);
                        gVar.g = upperCase;
                        arrayList4.add(gVar);
                        arrayList4.addAll(arrayList9);
                        i11 = dp;
                    }
                    size3 = i16;
                    arrayList8 = arrayList10;
                    i15 = i17;
                }
            }
        } else {
            ArrayList arrayList11 = this.b0;
            int size4 = arrayList11.size();
            i11 = 0;
            int i18 = 0;
            while (i18 < size4) {
                Object obj3 = arrayList11.get(i18);
                i18++;
                TLRPC.User user4 = (TLRPC.User) obj3;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(fg.g.c(user4, hashSet.contains(Long.valueOf(user4.id))));
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new fg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        fg.g gVar2 = new fg.g(-1, false);
        gVar2.l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                fg.h hVar2 = this.g0;
                ui0 ui0Var = new ui0(this, 1);
                org.telegram.ui.Cells.s3 s3Var = hVar2.s;
                if (s3Var != null) {
                    s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), ui0Var);
                }
            } else {
                org.telegram.ui.Cells.s3 s3Var2 = this.g0.s;
                if (s3Var2 != null) {
                    s3Var2.setRightText(null);
                }
            }
        }
        if (!z11 || (hVar = this.g0) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList3, arrayList4);
        } else {
            hVar.l();
        }
    }

    public final void U(boolean z10, boolean z11) {
        int R;
        T(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.jl0 jl0Var = this.d;
            if (i10 >= jl0Var.getChildCount()) {
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if ((childAt instanceof ig.n) && (R = RecyclerView.R(childAt)) > 0) {
                if (i11 == -1) {
                    i11 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.Y;
                    if (i13 < arrayList.size()) {
                        fg.g gVar = (fg.g) arrayList.get(i13);
                        ig.n nVar = (ig.n) childAt;
                        nVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            nVar.i(this.g0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            nVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = R;
            }
            i10++;
        }
        if (z10) {
            this.g0.q(0, i11);
            fg.h hVar = this.g0;
            hVar.q(i12, hVar.h() - i12);
        }
        S(z10);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.U.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        q0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.p0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override // org.telegram.ui.Components.xa
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        fg.h hVar = new fg.h(getContext(), this.resourcesProvider, true);
        this.g0 = hVar;
        hVar.r = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        Boolean bool = this.n0;
        if (bool == null || !bool.booleanValue()) {
            return LocaleController.getString(R.string.ChooseUsers);
        }
        return LocaleController.getString(this.l0 > 1 ? R.string.ChooseBots : R.string.ChooseBot);
    }
}
