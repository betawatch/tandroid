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
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.y31;
import org.telegram.ui.pt0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class z0 extends o41 {
    public final c20 e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public org.telegram.ui.ActionBar.r0 x;
    public cv0 y;
    public ArrayList f = xa.a(new ii.c(this, 17));
    public final ArrayList h = new ArrayList();
    public final HashSet w = new HashSet();

    public z0(org.telegram.ui.a0 a0Var, c20 c20Var) {
        this.e = c20Var;
    }

    @Override // org.telegram.ui.Components.o41
    public final void Z(ArrayList arrayList, m41 m41Var) {
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
                        arrayList.add(y31.r(id.u(y0Var.b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.r;
                    int i13 = f.b;
                    y31 K = y31.K(f.class);
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
                    arrayList.add(y31.r(id.u(y0Var2.b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.r;
                int i16 = f.b;
                y31 K2 = y31.K(f.class);
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
                arrayList.add(y31.p(32));
                arrayList.add(y31.p(32));
                arrayList.add(y31.p(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(y31.C(null));
    }

    @Override // org.telegram.ui.Components.o41
    public final CharSequence a0() {
        return id.M0(2131742920, null);
    }

    @Override // org.telegram.ui.Components.o41
    public final void b0(y31 y31Var, View view) {
        if (!y31Var.H(f.class) || this.actionBar.w()) {
            return;
        }
        finishFragment();
        this.e.a((y0) y31Var.H);
    }

    @Override // org.telegram.ui.Components.o41
    public final boolean c0(y31 y31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.o41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = l6.d6;
        s6.h(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(l6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = l6.G6;
        s6.l(kVar2, 5, i10, getResourceProvider());
        s6.l(this.actionBar, 3, l6.z8, getResourceProvider());
        s6.l(this.actionBar, 1, i10, getResourceProvider());
        s6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new pt0(this, 22));
        org.telegram.ui.ActionBar.y o4 = this.actionBar.o(null);
        NumberTextView numberTextView = new NumberTextView(o4.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(org.telegram.messenger.g0.o());
        this.s.setTextColor(getThemedColor(l6.y8));
        this.s.setOnTouchListener(new ei.b(2));
        o4.addView(this.s, ha.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.r().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.N();
        c10.H = new u2(this);
        this.x = c10;
        c10.setSearchFieldHint(id.M0(2131745836, null));
        this.x.setContentDescription(id.M0(2131745836, null));
        EditTextBoldCursor searchField = this.x.getSearchField();
        s6.U(searchField, i10, getResourceProvider());
        s6.D(searchField, l6.Gj, getResourceProvider());
        s6.v(searchField, i10, getResourceProvider());
        cv0 cv0Var = new cv0(context, null, 1, null);
        this.y = cv0Var;
        cv0Var.d.setText(id.M0(TextUtils.isEmpty(this.r) ? 2131742918 : 2131742917, null));
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
        return org.telegram.messenger.g0.B(getThemedColor(l6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(l6.x0(null, l6.d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(l6.y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.x;
            if (r0Var == null || r0Var.getSearchField() == null) {
                return;
            }
            this.x.getSearchField().setCursorColor(getThemedColor(l6.G6));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
