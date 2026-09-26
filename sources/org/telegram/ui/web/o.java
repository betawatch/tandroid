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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.v51;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class o extends m61 {
    public i e;
    public final Runnable f;
    public final org.telegram.ui.s h;
    public org.telegram.ui.ActionBar.u0 n;
    public org.telegram.ui.ActionBar.u0 r;
    public String s;
    public NumberTextView v;
    public final i d = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet w = new HashSet();
    public final HashSet x = new HashSet();

    public o(org.telegram.ui.b0 b0Var, org.telegram.ui.s sVar) {
        this.f = b0Var;
        this.h = sVar;
    }

    public static /* synthetic */ void Y(o oVar, HashSet hashSet) {
        MessagesController.getInstance(oVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(oVar.currentAccount).getClientUserId(), 0, true, 0);
        oVar.d.b(new ArrayList(hashSet));
        i iVar = oVar.e;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        oVar.w.clear();
        oVar.actionBar.r();
        oVar.a.Y2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.f0.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.f0.w(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !org.telegram.messenger.f0.w(" ", translitSafe2, translitSafe) && !org.telegram.messenger.f0.w(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.m61
    public final void U(ArrayList arrayList, j61 j61Var) {
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
                    v51 J = v51.J(g.class);
                    J.z = 3;
                    J.q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f) {
                arrayList.add(v51.o(arrayList.size(), 32));
                arrayList.add(v51.o(arrayList.size(), 32));
                arrayList.add(v51.o(arrayList.size(), 32));
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
                    m2 a11 = n2.b().a(hostAuthority);
                    TLRPC.Message message = messageObject2.messageOwner;
                    TLRPC.WebPage webPage = (message == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    String str = (webPage == null || TextUtils.isEmpty(webPage.site_name)) ? (a11 == null || TextUtils.isEmpty(a11.d)) ? null : a11.d : webPage.site_name;
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (f0(hostAuthority, this.s) || f0(str, this.s) || f0(str2, this.s)) {
                        String str3 = this.s;
                        int i13 = g.a;
                        v51 J2 = v51.J(g.class);
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
                    v51 J3 = v51.J(g.class);
                    J3.z = 3;
                    J3.q = false;
                    J3.H = messageObject3;
                    J3.m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.e.f) {
                arrayList.add(v51.o(arrayList.size(), 32));
                arrayList.add(v51.o(arrayList.size(), 32));
                arrayList.add(v51.o(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(v51.B(charSequence));
    }

    @Override // org.telegram.ui.Components.m61
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override // org.telegram.ui.Components.m61
    public final void W(v51 v51Var, View view) {
        if (v51Var.G(g.class)) {
            if (this.actionBar.s()) {
                c0(v51Var, view);
                return;
            }
            finishFragment();
            this.h.run(k.a((MessageObject) v51Var.H));
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final boolean X(v51 v51Var, View view) {
        if (!v51Var.G(g.class)) {
            return false;
        }
        c0(v51Var, view);
        return true;
    }

    public final void c0(v51 v51Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) v51Var.H;
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

    @Override // org.telegram.ui.Components.m61, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = h6.d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(h6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.A(getThemedColor(h6.z8), false);
        this.actionBar.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new m(this));
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(h6.y8));
        this.v.setOnTouchListener(new bi.d(2));
        j3.addView(this.v, y5.m(1.0f, 0, -1, 65, 0, 0));
        this.r = j3.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j3.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new n(this);
        this.n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(h6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.a.j(new ug0(this, 9));
        ix0 ix0Var = new ix0(context, null, 1, null);
        ix0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        ix0Var.e.setVisibility(8);
        ix0Var.e(false, false);
        ix0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(ix0Var, y5.c(-1.0f, -1));
        this.a.setEmptyView(ix0Var);
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
        AndroidUtilities.runOnUIThread(new ei.b2(clientUserId, intValue, 1), 80L);
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
        this.a.Y2.N(true);
        if (i11 >= 0) {
            this.a.X2.h1(i11, i10);
        } else {
            this.a.X2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        this.d.a();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.d.c();
    }
}
