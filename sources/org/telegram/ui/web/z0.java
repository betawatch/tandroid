package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import c8.xa;
import fi.u2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.x31;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class z0 extends n41 {
    public final c20 e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public org.telegram.ui.ActionBar.r0 x;
    public av0 y;
    public ArrayList f = xa.a(new ii.c(this, 17));
    public final ArrayList h = new ArrayList();
    public final HashSet w = new HashSet();

    public z0(org.telegram.ui.a0 a0Var, c20 c20Var) {
        this.e = c20Var;
    }

    @Override // org.telegram.ui.Components.n41
    public final void Z(ArrayList arrayList, l41 l41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i7 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    y0 y0Var = (y0) this.f.get(size);
                    calendar.setTimeInMillis(y0Var.b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(x31.r(hd.u(y0Var.b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.r;
                    int i13 = f.b;
                    x31 K = x31.K(f.class);
                    K.z = 3;
                    K.q = false;
                    K.H = y0Var;
                    K.m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                y0 y0Var2 = (y0) arrayList3.get(size2);
                calendar.setTimeInMillis(y0Var2.b);
                int i15 = calendar.get(i7) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(x31.r(hd.u(y0Var2.b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.r;
                int i16 = f.b;
                x31 K2 = x31.K(f.class);
                K2.z = 3;
                K2.q = false;
                K2.H = y0Var2;
                K2.m = str2;
                arrayList.add(K2);
                size2--;
                i7 = 5;
                i10 = 2;
            }
            if (this.n) {
                arrayList.add(x31.p(32));
                arrayList.add(x31.p(32));
                arrayList.add(x31.p(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(x31.C(null));
    }

    @Override // org.telegram.ui.Components.n41
    public final CharSequence a0() {
        return hd.M0(2131742921, null);
    }

    @Override // org.telegram.ui.Components.n41
    public final void b0(x31 x31Var, View view) {
        if (!x31Var.H(f.class) || this.actionBar.v()) {
            return;
        }
        finishFragment();
        this.e.a((y0) x31Var.H);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = k6.d6;
        r6.i(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        r6.m(kVar2, 5, i10, getResourceProvider());
        r6.m(this.actionBar, 3, k6.z8, getResourceProvider());
        r6.m(this.actionBar, 1, i10, getResourceProvider());
        r6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 22));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n(null);
        NumberTextView numberTextView = new NumberTextView(n10.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(org.telegram.messenger.g0.o());
        this.s.setTextColor(getThemedColor(k6.y8));
        this.s.setOnTouchListener(new ei.b(2));
        n10.addView(this.s, ha.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.q().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.N();
        c10.H = new u2(this);
        this.x = c10;
        c10.setSearchFieldHint(hd.M0(2131745837, null));
        this.x.setContentDescription(hd.M0(2131745837, null));
        EditTextBoldCursor searchField = this.x.getSearchField();
        r6.V(searchField, i10, getResourceProvider());
        r6.E(searchField, k6.Gj, getResourceProvider());
        r6.w(searchField, i10, getResourceProvider());
        av0 av0Var = new av0(context, null, 1, null);
        this.y = av0Var;
        av0Var.d.setText(hd.M0(TextUtils.isEmpty(this.r) ? 2131742919 : 2131742918, null));
        this.y.e.setVisibility(8);
        this.y.e(false, false);
        this.y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.y, ha.c(-1.0f, -1));
        this.a.setEmptyView(this.y);
        this.a.j(new ui(this, 25));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(getThemedColor(k6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(k6.x0(null, k6.d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.x;
            if (r0Var == null || r0Var.getSearchField() == null) {
                return;
            }
            this.x.getSearchField().setCursorColor(getThemedColor(k6.G6));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
