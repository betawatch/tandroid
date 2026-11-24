// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qc9 extends d implements jm7 {
    public static boolean s;
    public static HashSet w;
    public iz5 a;
    public r59 b;
    public iz5 c;
    public r34 d;
    public int e;
    public ArrayList f;
    public ArrayList h;
    public HashSet n;
    public HashSet r;

    public qc9() {
        super(null);
        this.e = -1;
    }

    public static void Z(boolean z) {
        final byte b = 0;
        boolean z2 = oc7.d1().getBoolean("translate_button_restricted_languages_changed", false);
        final byte b2 = 2;
        if (oc7.d1().getInt("translate_button_restricted_languages_version", 0) != 2 || (z && !z2)) {
            bn0 bn0Var = new bn0((byte) 24);
            final HashSet hashSet = new HashSet();
            final byte b3 = 1;
            Utilities.u(0, new qac() { // from class: pc9
                @Override // qac
                public final void a(Object obj) {
                    byte b4 = b;
                    HashSet hashSet2 = hashSet;
                    Runnable runnable = (Runnable) obj;
                    switch (b4) {
                        case 0:
                            try {
                                String str = jb6.D0().B.f;
                                if (s1c.J0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (s1c.J0(language, null, null) != null) {
                                    hashSet2.add(language);
                                }
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                            runnable.run();
                            break;
                        default:
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (s1c.J0(locale, null, null) != null) {
                                                hashSet2.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                            runnable.run();
                            break;
                    }
                }
            }, new qac() { // from class: pc9
                @Override // qac
                public final void a(Object obj) {
                    byte b4 = b3;
                    HashSet hashSet2 = hashSet;
                    Runnable runnable = (Runnable) obj;
                    switch (b4) {
                        case 0:
                            try {
                                String str = jb6.D0().B.f;
                                if (s1c.J0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (s1c.J0(language, null, null) != null) {
                                    hashSet2.add(language);
                                }
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                            runnable.run();
                            break;
                        default:
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (s1c.J0(locale, null, null) != null) {
                                                hashSet2.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                            runnable.run();
                            break;
                    }
                }
            }, new qac() { // from class: pc9
                @Override // qac
                public final void a(Object obj) {
                    byte b4 = b2;
                    HashSet hashSet2 = hashSet;
                    Runnable runnable = (Runnable) obj;
                    switch (b4) {
                        case 0:
                            try {
                                String str = jb6.D0().B.f;
                                if (s1c.J0(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            runnable.run();
                            break;
                        case 1:
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (s1c.J0(language, null, null) != null) {
                                    hashSet2.add(language);
                                }
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                            runnable.run();
                            break;
                        default:
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (s1c.J0(locale, null, null) != null) {
                                                hashSet2.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                            runnable.run();
                            break;
                    }
                }
            }, new u35(bn0Var, hashSet, (byte) 25));
        }
    }

    public static void a0() {
        s = false;
        oc7.d1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        Z(false);
    }

    public static HashSet c0() {
        if (!s) {
            Set<String> stringSet = oc7.d1().getStringSet("translate_button_restricted_languages", null);
            w = stringSet != null ? new HashSet(stringSet) : null;
            s = true;
        }
        HashSet hashSet = w;
        if (hashSet != null) {
            return hashSet;
        }
        String[] strArr = {jb6.D0().B.f};
        HashSet hashSet2 = new HashSet(fqe.a(1));
        Collections.addAll(hashSet2, strArr);
        w = hashSet2;
        return hashSet2;
    }

    public static void f0(HashSet hashSet, Boolean bool) {
        w = hashSet;
        s = true;
        SharedPreferences.Editor edit = oc7.d1().edit();
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

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final void b0() {
        this.h = b3c.m();
        String str = jb6.D0().B.f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n);
        u2c u2cVar = null;
        int i = 0;
        while (i < this.h.size()) {
            u2c u2cVar2 = (u2c) this.h.get(i);
            if (TextUtils.equals(u2cVar2.a, str)) {
                arrayList2.remove(u2cVar2.a);
                this.h.remove(i);
                i--;
                u2cVar = u2cVar2;
            } else if (this.n.contains(u2cVar2.a)) {
                arrayList.add(u2cVar2);
                arrayList2.remove(u2cVar2.a);
                this.h.remove(i);
                i--;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            u2c u2cVar3 = new u2c();
            String str2 = (String) arrayList2.get(i2);
            u2cVar3.a = str2;
            String upperCase = str2.toUpperCase();
            u2cVar3.b = upperCase;
            u2cVar3.c = upperCase;
            u2cVar3.d = u2cVar3.a.toLowerCase();
            arrayList.add(u2cVar3);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        int size = arrayList.size() + this.e;
        this.e = size;
        if (u2cVar != null) {
            this.h.add(0, u2cVar);
            size = this.e + 1;
            this.e = size;
        }
        if (size <= 0) {
            this.e = -1;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131751295, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 9));
        zja a = this.simpleActionBar.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.C0 = new q20(this, (byte) 20);
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        this.a = new iz5(this, context, false, (byte) 1);
        this.c = new iz5(this, context, 1 == true ? 1 : 0, 1 == true ? 1 : 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.d = r34Var;
        r34Var.setText(jb6.M0(2131747901, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new u46(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        frameLayout.addView(this.d, qoe.c(-1.0f, -1));
        this.b.setOnItemClickListener(new s19(this, (byte) 3));
        this.b.setOnScrollListener(new so7(this, (byte) 14));
        return this.fragmentView;
    }

    public final void d0(int i, View view) {
        u2c u2cVar;
        ArrayList arrayList;
        if (getParentActivity() == null || this.parentLayout == null || !(view instanceof cjb)) {
            return;
        }
        int i2 = 0;
        boolean z = this.b.getAdapter() == this.c;
        if (!z || (arrayList = this.f) == null) {
            int i3 = this.e;
            if (i3 >= 0 && i > i3) {
                i--;
            }
            u2cVar = (i < 0 || i >= this.h.size()) ? null : (u2c) this.h.get(i);
        } else {
            u2cVar = (u2c) arrayList.get(i);
        }
        if (u2cVar == null || u2cVar.a == null) {
            return;
        }
        hb6 hb6Var = jb6.D0().B;
        String str = u2cVar.a;
        boolean contains = this.r.contains(str);
        HashSet hashSet = this.r;
        if (contains) {
            Collection.-EL.removeIf(hashSet, new gz5(str, (byte) 2));
        } else {
            hashSet.add(str);
        }
        if (this.r.size() == 1 && this.r.contains(hb6Var.f)) {
            f0(null, null);
        } else {
            f0(this.r, Boolean.TRUE);
        }
        if (z) {
            int i4 = 0;
            while (i2 < this.f.size()) {
                if (TextUtils.equals(str, ((u2c) this.f.get(i2)).a)) {
                    e0(i4);
                }
                i2++;
                i4++;
            }
        } else {
            int i5 = 0;
            while (i2 < this.h.size()) {
                if (i5 == this.e) {
                    i5++;
                }
                if (TextUtils.equals(str, ((u2c) this.h.get(i2)).a)) {
                    e0(i5);
                }
                i2++;
                i5++;
            }
        }
        oc7.r1(this.currentAccount).i4.f();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.C4 || this.a == null) {
            return;
        }
        b0();
        this.a.f();
    }

    public final void e0(int i) {
        int b;
        y59 adapter = this.b.getAdapter();
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            u69 T = this.b.T(this.b.getChildAt(i2));
            if (T != null && (b = T.b()) != -1 && b == i) {
                adapter.t(T, i);
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.b, 0, new Class[]{xy5.class}, new String[]{"checkImage"}, (Drawable[]) null, (bnb) null, cmb.Ci));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        this.n = c0();
        this.r = c0();
        b0();
        jb6.D0().V0(this.currentAccount, true);
        nm7.e().b(this, nm7.C4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.e().n(this, nm7.C4);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        iz5 iz5Var = this.a;
        if (iz5Var != null) {
            iz5Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
