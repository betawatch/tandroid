package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.q20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r51;
import org.telegram.ui.go0;
import org.telegram.ui.y01;
import w7.b6;
import w7.m6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class b1 extends r51 {
    public final q20 e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public org.telegram.ui.ActionBar.t0 x;
    public dw0 y;
    public ArrayList f = m6.a(new ag.l(this, 28));
    public final ArrayList h = new ArrayList();
    public final HashSet w = new HashSet();

    public b1(org.telegram.ui.y yVar, q20 q20Var) {
        this.e = q20Var;
    }

    @Override // org.telegram.ui.Components.r51
    public final void Y(ArrayList arrayList, p51 p51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    a1 a1Var = (a1) this.f.get(size);
                    calendar.setTimeInMillis(a1Var.b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(a51.r(cd.u(a1Var.b / 1000, false)));
                        i12 = i13;
                    }
                    String str = this.r;
                    int i14 = f.b;
                    a51 K = a51.K(f.class);
                    K.z = 3;
                    K.q = false;
                    K.H = a1Var;
                    K.m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                a1 a1Var2 = (a1) arrayList3.get(size2);
                calendar.setTimeInMillis(a1Var2.b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(a51.r(cd.u(a1Var2.b / 1000, false)));
                    i15 = i16;
                }
                String str2 = this.r;
                int i17 = f.b;
                a51 K2 = a51.K(f.class);
                K2.z = 3;
                K2.q = false;
                K2.H = a1Var2;
                K2.m = str2;
                arrayList.add(K2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.n) {
                arrayList.add(a51.p(32));
                arrayList.add(a51.p(32));
                arrayList.add(a51.p(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(a51.C(null));
    }

    @Override // org.telegram.ui.Components.r51
    public final CharSequence Z() {
        return cd.L0(2131742946, null);
    }

    @Override // org.telegram.ui.Components.r51
    public final void a0(a51 a51Var, View view) {
        if (!a51Var.H(f.class) || this.actionBar.u()) {
            return;
        }
        finishFragment();
        this.e.a((a1) a51Var.H);
    }

    @Override // org.telegram.ui.Components.r51
    public final boolean b0(a51 a51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r51, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = t6.d6;
        a7.i(i10, lVar, getResourceProvider());
        this.actionBar.setActionModeColor(t6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = t6.G6;
        a7.m(lVar2, 5, i11, getResourceProvider());
        a7.m(this.actionBar, 3, t6.z8, getResourceProvider());
        a7.m(this.actionBar, 1, i11, getResourceProvider());
        a7.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 13));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m(null);
        NumberTextView numberTextView = new NumberTextView(m10.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(org.telegram.messenger.i0.o());
        this.s.setTextColor(getThemedColor(t6.y8));
        this.s.setOnTouchListener(new n2(1));
        m10.addView(this.s, b6.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.t0 c10 = this.actionBar.p().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.N();
        c10.H = new go0(this);
        this.x = c10;
        c10.setSearchFieldHint(cd.L0(2131745853, null));
        this.x.setContentDescription(cd.L0(2131745853, null));
        EditTextBoldCursor searchField = this.x.getSearchField();
        a7.V(searchField, i11, getResourceProvider());
        a7.E(searchField, t6.Gj, getResourceProvider());
        a7.w(searchField, i11, getResourceProvider());
        dw0 dw0Var = new dw0(context, null, 1, null);
        this.y = dw0Var;
        dw0Var.d.setText(cd.L0(TextUtils.isEmpty(this.r) ? 2131742944 : 2131742943, null));
        this.y.e.setVisibility(8);
        this.y.e(false, false);
        this.y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.y, b6.c(-1.0f, -1));
        this.a.setEmptyView(this.y);
        this.a.j(new bu0(this, 10));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.i0.B(getThemedColor(t6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.setActionModeColor(t6.x0(null, t6.d6, false));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            NumberTextView numberTextView = this.s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(t6.y8));
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.x;
            if (t0Var == null || t0Var.getSearchField() == null) {
                return;
            }
            this.x.getSearchField().setCursorColor(getThemedColor(t6.G6));
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }
}
