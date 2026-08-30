package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import k7.b6;
import lh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p extends b61 {
    public i e;
    public final Runnable f;
    public final org.telegram.ui.t h;
    public org.telegram.ui.ActionBar.w0 n;
    public org.telegram.ui.ActionBar.w0 r;
    public String s;
    public NumberTextView v;
    public final i d = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet w = new HashSet();
    public final HashSet x = new HashSet();

    public p(org.telegram.ui.c0 c0Var, org.telegram.ui.t tVar) {
        this.f = c0Var;
        this.h = tVar;
    }

    public static /* synthetic */ void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.d.b(new ArrayList(hashSet));
        i iVar = pVar.e;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        pVar.w.clear();
        pVar.actionBar.r();
        pVar.a.V2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !y3.w(" ", lowerCase2, lowerCase) && !y3.w(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !y3.w(" ", translitSafe2, translitSafe) && !y3.w(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.b61
    public final void U(ArrayList arrayList, w51 w51Var) {
        CharSequence charSequence;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.s);
        i iVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = k.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = g.a;
                    i51 J = i51.J(g.class);
                    J.z = 3;
                    J.q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f) {
                arrayList.add(i51.o(arrayList.size(), 32));
                arrayList.add(i51.o(arrayList.size(), 32));
                arrayList.add(i51.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.a;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                MessageObject messageObject2 = (MessageObject) obj2;
                String a10 = k.a(messageObject2);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    String hostAuthority = AndroidUtilities.getHostAuthority(a10, true);
                    k2 a11 = l2.b().a(hostAuthority);
                    TLRPC.Message message = messageObject2.messageOwner;
                    TLRPC.WebPage webPage = (message == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    String str = (webPage == null || TextUtils.isEmpty(webPage.site_name)) ? (a11 == null || TextUtils.isEmpty(a11.d)) ? null : a11.d : webPage.site_name;
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (f0(hostAuthority, this.s) || f0(str, this.s) || f0(str2, this.s)) {
                        String str3 = this.s;
                        int i13 = g.a;
                        i51 J2 = i51.J(g.class);
                        J2.z = 3;
                        J2.q = false;
                        J2.H = messageObject2;
                        J2.m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.e.a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = k.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.s;
                    int i15 = g.a;
                    i51 J3 = i51.J(g.class);
                    J3.z = 3;
                    J3.q = false;
                    J3.H = messageObject3;
                    J3.m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.e.f) {
                arrayList.add(i51.o(arrayList.size(), 32));
                arrayList.add(i51.o(arrayList.size(), 32));
                arrayList.add(i51.o(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(i51.B(charSequence));
    }

    @Override // org.telegram.ui.Components.b61
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override // org.telegram.ui.Components.b61
    public final void W(i51 i51Var, View view) {
        if (i51Var.G(g.class)) {
            if (this.actionBar.s()) {
                c0(i51Var, view);
                return;
            }
            finishFragment();
            this.h.run(k.a((MessageObject) i51Var.H));
        }
    }

    @Override // org.telegram.ui.Components.b61
    public final boolean X(i51 i51Var, View view) {
        if (!i51Var.G(g.class)) {
            return false;
        }
        c0(i51Var, view);
        return true;
    }

    public final void c0(i51 i51Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) i51Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.w;
        if (e02) {
            if (messageObject != null) {
                hashSet.remove(Integer.valueOf(messageObject.getId()));
            }
            hVar.setChecked(false);
        } else {
            if (messageObject != null) {
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
            hVar.setChecked(true);
        }
        this.v.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.r();
        } else {
            this.actionBar.O(null, null);
        }
        AndroidUtilities.updateViewShow(this.r, hashSet.size() == 1, true, true);
    }

    @Override // org.telegram.ui.Components.b61, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = j6.d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(j6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = j6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.B(getThemedColor(j6.z8), false);
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(j6.y8));
        this.v.setOnTouchListener(new oh.d(2));
        j10.addView(this.v, b6.m(1.0f, 0, -1, 65, 0, 0));
        this.r = j10.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j10.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new o(this);
        this.n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.a.j(new lb0(this, 10));
        zw0 zw0Var = new zw0(context, null, 1, null);
        zw0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        zw0Var.e.setVisibility(8);
        zw0Var.e(false, false);
        zw0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(zw0Var, b6.c(-1.0f, -1));
        this.a.setEmptyView(zw0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new b8(clientUserId, intValue, 1), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            return this.w.contains(Integer.valueOf(messageObject.getId()));
        }
        return false;
    }

    public final void g0() {
        int i10;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= this.a.getChildCount()) {
                i10 = 0;
                break;
            }
            View childAt = this.a.getChildAt(i12);
            this.a.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                i10 = childAt.getTop();
                i11 = R;
                break;
            } else {
                i12++;
                i11 = R;
            }
        }
        this.a.V2.N(true);
        if (i11 >= 0) {
            this.a.U2.h1(i11, i10);
        } else {
            this.a.U2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.d.a();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.d.c();
    }
}
