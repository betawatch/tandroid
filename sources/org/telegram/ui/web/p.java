package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.y51;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class p extends p61 {
    public i f;
    public final Runnable h;
    public final org.telegram.ui.r n;
    public org.telegram.ui.ActionBar.v0 r;
    public org.telegram.ui.ActionBar.v0 s;
    public String v;
    public NumberTextView w;
    public final i e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet x = new HashSet();
    public final HashSet y = new HashSet();

    public p(org.telegram.ui.a0 a0Var, org.telegram.ui.r rVar) {
        this.h = a0Var;
        this.n = rVar;
    }

    public static /* synthetic */ void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.e.b(new ArrayList(hashSet));
        i iVar = pVar.f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        pVar.x.clear();
        pVar.actionBar.r();
        pVar.a.Y2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.l0.v(" ", lowerCase2, lowerCase) && !org.telegram.messenger.l0.v(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !org.telegram.messenger.l0.v(" ", translitSafe2, translitSafe) && !org.telegram.messenger.l0.v(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.p61
    public final void U(ArrayList arrayList, m61 m61Var) {
        CharSequence charSequence;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.y;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.v);
        i iVar = this.e;
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
                    y51 J = y51.J(g.class);
                    J.z = 3;
                    J.q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f) {
                arrayList.add(y51.o(arrayList.size(), 32));
                arrayList.add(y51.o(arrayList.size(), 32));
                arrayList.add(y51.o(arrayList.size(), 32));
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
                    n2 a11 = o2.b().a(hostAuthority);
                    TLRPC.Message message = messageObject2.messageOwner;
                    TLRPC.WebPage webPage = (message == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    String str = (webPage == null || TextUtils.isEmpty(webPage.site_name)) ? (a11 == null || TextUtils.isEmpty(a11.d)) ? null : a11.d : webPage.site_name;
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (f0(hostAuthority, this.v) || f0(str, this.v) || f0(str2, this.v)) {
                        String str3 = this.v;
                        int i13 = g.a;
                        y51 J2 = y51.J(g.class);
                        J2.z = 3;
                        J2.q = false;
                        J2.H = messageObject2;
                        J2.m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f.a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = k.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.v;
                    int i15 = g.a;
                    y51 J3 = y51.J(g.class);
                    J3.z = 3;
                    J3.q = false;
                    J3.H = messageObject3;
                    J3.m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f.f) {
                arrayList.add(y51.o(arrayList.size(), 32));
                arrayList.add(y51.o(arrayList.size(), 32));
                arrayList.add(y51.o(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(y51.B(charSequence));
    }

    @Override // org.telegram.ui.Components.p61
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override // org.telegram.ui.Components.p61
    public final void W(y51 y51Var, View view) {
        if (y51Var.G(g.class)) {
            if (this.actionBar.s()) {
                c0(y51Var, view);
                return;
            }
            finishFragment();
            this.n.run(k.a((MessageObject) y51Var.H));
        }
    }

    @Override // org.telegram.ui.Components.p61
    public final boolean X(y51 y51Var, View view) {
        if (!y51Var.G(g.class)) {
            return false;
        }
        c0(y51Var, view);
        return true;
    }

    public final void c0(y51 y51Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) y51Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.x;
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
        this.w.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.r();
        } else {
            this.actionBar.O(null, null);
        }
        AndroidUtilities.updateViewShow(this.s, hashSet.size() == 1, true, true);
    }

    @Override // org.telegram.ui.Components.p61, org.telegram.ui.ActionBar.n2
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
        this.actionBar.A(getThemedColor(j6.z8), false);
        this.actionBar.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.w = numberTextView;
        numberTextView.setTextSize(18);
        this.w.setTypeface(AndroidUtilities.bold());
        this.w.setTextColor(getThemedColor(j6.y8));
        this.w.setOnTouchListener(new bi.d(2));
        j3.addView(this.w, y5.m(1.0f, 0, -1, 65, 0, 0));
        this.s = j3.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j3.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new o(this);
        this.r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.r.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.r.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.a.j(new vb0(this, 11));
        lx0 lx0Var = new lx0(context, null, 1, null);
        lx0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        lx0Var.e.setVisibility(8);
        lx0Var.e(false, false);
        lx0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(lx0Var, y5.c(-1.0f, -1));
        this.a.setEmptyView(lx0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.x;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new ei.b2(clientUserId, intValue, 1), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            return this.x.contains(Integer.valueOf(messageObject.getId()));
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
            int S = RecyclerView.S(childAt);
            if (S >= 0) {
                i10 = childAt.getTop();
                i11 = S;
                break;
            } else {
                i12++;
                i11 = S;
            }
        }
        this.a.Y2.N(true);
        if (i11 >= 0) {
            this.a.X2.h1(i11, i10);
        } else {
            this.a.X2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.e.a();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.e.c();
    }
}
