package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import b8.xf;
import gi.j8;
import gi.s2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.vs0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class y0 extends h41 {
    public final u10 e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public org.telegram.ui.ActionBar.q0 x;
    public zu0 y;
    public ArrayList f = xf.a(new j8(this, 20));
    public final ArrayList h = new ArrayList();
    public final HashSet w = new HashSet();

    public y0(org.telegram.ui.b0 b0Var, u10 u10Var) {
        this.e = u10Var;
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, f41 f41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i3 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    x0 x0Var = (x0) this.f.get(size);
                    calendar.setTimeInMillis(x0Var.b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(r31.r(bd.u(x0Var.b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.r;
                    int i13 = h.b;
                    r31 K = r31.K(h.class);
                    K.z = 3;
                    K.q = false;
                    K.H = x0Var;
                    K.m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                x0 x0Var2 = (x0) arrayList3.get(size2);
                calendar.setTimeInMillis(x0Var2.b);
                int i15 = calendar.get(i3) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(r31.r(bd.u(x0Var2.b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.r;
                int i16 = h.b;
                r31 K2 = r31.K(h.class);
                K2.z = 3;
                K2.q = false;
                K2.H = x0Var2;
                K2.m = str2;
                arrayList.add(K2);
                size2--;
                i3 = 5;
                i10 = 2;
            }
            if (this.n) {
                arrayList.add(r31.p(32));
                arrayList.add(r31.p(32));
                arrayList.add(r31.p(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(r31.C(null));
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return bd.M0(2131742930, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(r31 r31Var, View view) {
        if (!r31Var.H(h.class) || this.actionBar.v()) {
            return;
        }
        finishFragment();
        this.e.a((x0) r31Var.H);
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = k6.d6;
        r6.i(i3, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i3, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        r6.m(kVar2, 5, i10, getResourceProvider());
        r6.m(this.actionBar, 3, k6.z8, getResourceProvider());
        r6.m(this.actionBar, 1, i10, getResourceProvider());
        r6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 23));
        org.telegram.ui.ActionBar.x n4 = this.actionBar.n(null);
        NumberTextView numberTextView = new NumberTextView(n4.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(org.telegram.messenger.g0.o());
        this.s.setTextColor(getThemedColor(k6.y8));
        this.s.setOnTouchListener(new fi.a(2));
        n4.addView(this.s, mf.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.q0 c2 = this.actionBar.q().c(0, R.drawable.outline_header_search, getResourceProvider());
        c2.N();
        c2.I = new s2(this);
        this.x = c2;
        c2.setSearchFieldHint(bd.M0(2131745846, null));
        this.x.setContentDescription(bd.M0(2131745846, null));
        EditTextBoldCursor searchField = this.x.getSearchField();
        r6.V(searchField, i10, getResourceProvider());
        r6.E(searchField, k6.Gj, getResourceProvider());
        r6.w(searchField, i10, getResourceProvider());
        zu0 zu0Var = new zu0(context, null, 1, null);
        this.y = zu0Var;
        zu0Var.d.setText(bd.M0(TextUtils.isEmpty(this.r) ? 2131742928 : 2131742927, null));
        this.y.e.setVisibility(8);
        this.y.e(false, false);
        this.y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.y, mf.c(-1.0f, -1));
        this.a.setEmptyView(this.y);
        this.a.j(new ji(this, 27));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(getThemedColor(k6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d2
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
            org.telegram.ui.ActionBar.q0 q0Var = this.x;
            if (q0Var == null || q0Var.getSearchField() == null) {
                return;
            }
            this.x.getSearchField().setCursorColor(getThemedColor(k6.G6));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
