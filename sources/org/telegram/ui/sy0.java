package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class sy0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public static boolean s;
    public static HashSet w;
    public l60 a;
    public org.telegram.ui.Components.ek0 b;
    public l60 c;
    public org.telegram.ui.Components.vy d;
    public int e;
    public ArrayList f;
    public ArrayList h;
    public HashSet n;
    public HashSet r;

    public sy0() {
        super(null);
        this.e = -1;
    }

    public static void Z(sy0 sy0Var, View view, int i7) {
        org.telegram.messenger.t00 t00Var;
        ArrayList arrayList;
        if (sy0Var.getParentActivity() == null || sy0Var.parentLayout == null || !(view instanceof org.telegram.ui.Cells.t8)) {
            return;
        }
        int i10 = 0;
        boolean z10 = sy0Var.b.getAdapter() == sy0Var.c;
        if (!z10 || (arrayList = sy0Var.f) == null) {
            int i11 = sy0Var.e;
            if (i11 >= 0 && i7 > i11) {
                i7--;
            }
            t00Var = (i7 < 0 || i7 >= sy0Var.h.size()) ? null : (org.telegram.messenger.t00) sy0Var.h.get(i7);
        } else {
            t00Var = (org.telegram.messenger.t00) arrayList.get(i7);
        }
        if (t00Var == null || t00Var.a == null) {
            return;
        }
        org.telegram.messenger.dd ddVar = org.telegram.messenger.hd.E0().B;
        String str = t00Var.a;
        if (sy0Var.r.contains(str)) {
            Collection.-EL.removeIf(sy0Var.r, new j60(str, 2));
        } else {
            sy0Var.r.add(str);
        }
        if (sy0Var.r.size() == 1 && sy0Var.r.contains(ddVar.f)) {
            f0(null, null);
        } else {
            f0(sy0Var.r, Boolean.TRUE);
        }
        if (z10) {
            int i12 = 0;
            while (i10 < sy0Var.f.size()) {
                if (TextUtils.equals(str, ((org.telegram.messenger.t00) sy0Var.f.get(i10)).a)) {
                    sy0Var.e0(i12);
                }
                i10++;
                i12++;
            }
        } else {
            int i13 = 0;
            while (i10 < sy0Var.h.size()) {
                if (i13 == sy0Var.e) {
                    i13++;
                }
                if (TextUtils.equals(str, ((org.telegram.messenger.t00) sy0Var.h.get(i10)).a)) {
                    sy0Var.e0(i13);
                }
                i10++;
                i13++;
            }
        }
        org.telegram.messenger.np.u1(sy0Var.currentAccount).v7.g();
    }

    public static void a0(boolean z10) {
        final int i7 = 0;
        boolean z11 = org.telegram.messenger.np.g1().getBoolean("translate_button_restricted_languages_changed", false);
        final int i10 = 2;
        if (org.telegram.messenger.np.g1().getInt("translate_button_restricted_languages_version", 0) != 2 || (z10 && !z11)) {
            fi.e eVar = new fi.e(24);
            final HashSet hashSet = new HashSet();
            final int i11 = 1;
            Utilities.u(0, new org.telegram.messenger.y10() { // from class: org.telegram.ui.ry0
                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    switch (i7) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = org.telegram.messenger.hd.E0().B.f;
                                if (org.telegram.ui.Components.b31.P0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.b31.P0(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.b31.P0(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.messenger.y10() { // from class: org.telegram.ui.ry0
                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = org.telegram.messenger.hd.E0().B.f;
                                if (org.telegram.ui.Components.b31.P0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.b31.P0(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.b31.P0(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.messenger.y10() { // from class: org.telegram.ui.ry0
                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = org.telegram.messenger.hd.E0().B.f;
                                if (org.telegram.ui.Components.b31.P0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.b31.P0(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.b31.P0(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new org.telegram.ui.Components.rh(27, eVar, hashSet));
        }
    }

    public static void b0() {
        s = false;
        org.telegram.messenger.np.g1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        a0(false);
    }

    public static HashSet d0() {
        if (!s) {
            Set<String> stringSet = org.telegram.messenger.np.g1().getStringSet("translate_button_restricted_languages", null);
            w = stringSet != null ? new HashSet(stringSet) : null;
            s = true;
        }
        if (w == null) {
            String[] strArr = {org.telegram.messenger.hd.E0().B.f};
            HashSet hashSet = new HashSet(h9.o.d(1));
            Collections.addAll(hashSet, strArr);
            w = hashSet;
        }
        return w;
    }

    public static void f0(HashSet hashSet, Boolean bool) {
        w = hashSet;
        s = true;
        SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
        if (hashSet == null) {
            edit.remove("translate_button_restricted_languages");
        } else {
            edit.putStringSet("translate_button_restricted_languages", hashSet);
        }
        if (bool == null) {
            edit.remove("translate_button_restricted_languages_changed");
        } else if (bool.booleanValue()) {
            edit.putBoolean("translate_button_restricted_languages_changed", true);
        }
        edit.apply();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    public final void c0() {
        this.h = org.telegram.messenger.a10.n();
        String str = org.telegram.messenger.hd.E0().B.f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n);
        org.telegram.messenger.t00 t00Var = null;
        int i7 = 0;
        while (i7 < this.h.size()) {
            org.telegram.messenger.t00 t00Var2 = (org.telegram.messenger.t00) this.h.get(i7);
            if (TextUtils.equals(t00Var2.a, str)) {
                arrayList2.remove(t00Var2.a);
                this.h.remove(i7);
                i7--;
                t00Var = t00Var2;
            } else if (this.n.contains(t00Var2.a)) {
                arrayList.add(t00Var2);
                arrayList2.remove(t00Var2.a);
                this.h.remove(i7);
                i7--;
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            org.telegram.messenger.t00 t00Var3 = new org.telegram.messenger.t00();
            String str2 = (String) arrayList2.get(i10);
            t00Var3.a = str2;
            String upperCase = str2.toUpperCase();
            t00Var3.b = upperCase;
            t00Var3.c = upperCase;
            t00Var3.d = t00Var3.a.toLowerCase();
            arrayList.add(t00Var3);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        this.e = arrayList.size() + this.e;
        if (t00Var != null) {
            this.h.add(0, t00Var);
            this.e++;
        }
        if (this.e <= 0) {
            this.e = -1;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131751346, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 9));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, R.drawable.outline_header_search);
        b10.O();
        b10.C0 = new bi.w1(this, 21);
        b10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        this.a = new l60(this, context, false, 1);
        this.c = new l60(this, context, 1 == true ? 1 : 0, 1 == true ? 1 : 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.d = vyVar;
        vyVar.setText(org.telegram.messenger.hd.N0(2131747974, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new v4.c0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        frameLayout.addView(this.b, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        this.b.setOnItemClickListener(new zx0(this, 1 == true ? 1 : 0));
        this.b.setOnScrollListener(new g3(this, 29));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ls.B4 || this.a == null) {
            return;
        }
        c0();
        this.a.f();
    }

    public final void e0(int i7) {
        int b10;
        v4.i0 adapter = this.b.getAdapter();
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            v4.f1 T = this.b.T(this.b.getChildAt(i10));
            if (T != null && (b10 = T.b()) != -1 && b10 == i7) {
                adapter.t(T, i7);
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Di));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        this.n = d0();
        this.r = d0();
        c0();
        org.telegram.messenger.hd.E0().W0(this.currentAccount, true);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.B4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.B4);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        l60 l60Var = this.a;
        if (l60Var != null) {
            l60Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
