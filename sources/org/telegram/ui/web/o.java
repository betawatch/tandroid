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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.z61;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class o extends z61 {
    public i f;
    public final Runnable h;
    public final org.telegram.ui.s n;
    public org.telegram.ui.ActionBar.v0 r;
    public org.telegram.ui.ActionBar.v0 s;
    public String v;
    public NumberTextView w;
    public final i e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet x = new HashSet();
    public final HashSet y = new HashSet();

    public o(org.telegram.ui.b0 b0Var, org.telegram.ui.s sVar) {
        this.h = b0Var;
        this.n = sVar;
    }

    public static /* synthetic */ void X(o oVar, HashSet hashSet) {
        MessagesController.getInstance(oVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(oVar.currentAccount).getClientUserId(), 0, true, 0);
        oVar.e.b(new ArrayList(hashSet));
        i iVar = oVar.f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        oVar.x.clear();
        oVar.actionBar.r();
        oVar.a.f3.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !bi.u(" ", lowerCase2, lowerCase) && !bi.u(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !bi.u(" ", translitSafe2, translitSafe) && !bi.u(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.z61
    public final void S(ArrayList arrayList, w61 w61Var) {
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
                    h61 K = h61.K(g.class);
                    K.z = 3;
                    K.q = false;
                    K.H = messageObject;
                    K.L(e0(messageObject));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!iVar.f) {
                arrayList.add(h61.q(arrayList.size(), 32));
                arrayList.add(h61.q(arrayList.size(), 32));
                arrayList.add(h61.q(arrayList.size(), 32));
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
                        h61 K2 = h61.K(g.class);
                        K2.z = 3;
                        K2.q = false;
                        K2.H = messageObject2;
                        K2.m = str3;
                        K2.L(e0(messageObject2));
                        arrayList.add(K2);
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
                    h61 K3 = h61.K(g.class);
                    K3.z = 3;
                    K3.q = false;
                    K3.H = messageObject3;
                    K3.m = str4;
                    K3.L(e0(messageObject3));
                    arrayList.add(K3);
                }
            }
            if (!this.f.f) {
                arrayList.add(h61.q(arrayList.size(), 32));
                arrayList.add(h61.q(arrayList.size(), 32));
                arrayList.add(h61.q(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(h61.C(charSequence));
    }

    @Override // org.telegram.ui.Components.z61
    public final CharSequence T() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override // org.telegram.ui.Components.z61
    public final void U(h61 h61Var, View view) {
        if (h61Var.H(g.class)) {
            if (this.actionBar.s()) {
                c0(h61Var, view);
                return;
            }
            finishFragment();
            this.n.run(k.a((MessageObject) h61Var.H));
        }
    }

    @Override // org.telegram.ui.Components.z61
    public final boolean W(h61 h61Var, View view) {
        if (!h61Var.H(g.class)) {
            return false;
        }
        c0(h61Var, view);
        return true;
    }

    public final void c0(h61 h61Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) h61Var.H;
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
            this.actionBar.L(null, null);
        }
        AndroidUtilities.updateViewShow(this.s, hashSet.size() == 1, true, true);
    }

    @Override // org.telegram.ui.Components.z61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = i6.d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(i6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = i6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.z(getThemedColor(i6.z8), false);
        this.actionBar.A(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new m(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.w = numberTextView;
        numberTextView.setTextSize(18);
        this.w.setTypeface(AndroidUtilities.bold());
        this.w.setTextColor(getThemedColor(i6.y8));
        this.w.setOnTouchListener(new bi.d(2));
        j3.addView(this.w, z5.m(1.0f, 0, -1, 65, 0, 0));
        this.s = j3.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j3.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new n(this);
        this.r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.r.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.r.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.a.j(new xb0(this, 11));
        ux0 ux0Var = new ux0(context, null, 1, null);
        ux0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        ux0Var.e.setVisibility(8);
        ux0Var.e(false, false);
        ux0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(ux0Var, z5.c(-1.0f, -1));
        this.a.setEmptyView(ux0Var);
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
        AndroidUtilities.runOnUIThread(new ei.c2(clientUserId, intValue, 1), 80L);
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
        this.a.f3.N(true);
        if (i11 >= 0) {
            this.a.e3.h1(i11, i10);
        } else {
            this.a.e3.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.d6)) > 0.721f;
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
