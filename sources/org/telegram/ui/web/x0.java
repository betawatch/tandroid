package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import c8.za;
import hi.g7;
import hi.s2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ri;
import org.telegram.ui.ct0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class x0 extends r41 {
    public final z10 e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public org.telegram.ui.ActionBar.q0 x;
    public cv0 y;
    public ArrayList f = za.a(new g7(this, 22));
    public final ArrayList h = new ArrayList();
    public final HashSet w = new HashSet();

    public x0(org.telegram.ui.z zVar, z10 z10Var) {
        this.e = z10Var;
    }

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, p41 p41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i7 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    w0 w0Var = (w0) this.f.get(size);
                    calendar.setTimeInMillis(w0Var.b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(b41.r(hd.u(w0Var.b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.r;
                    int i13 = g.b;
                    b41 K = b41.K(g.class);
                    K.z = 3;
                    K.q = false;
                    K.H = w0Var;
                    K.m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                w0 w0Var2 = (w0) arrayList3.get(size2);
                calendar.setTimeInMillis(w0Var2.b);
                int i15 = calendar.get(i7) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(b41.r(hd.u(w0Var2.b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.r;
                int i16 = g.b;
                b41 K2 = b41.K(g.class);
                K2.z = 3;
                K2.q = false;
                K2.H = w0Var2;
                K2.m = str2;
                arrayList.add(K2);
                size2--;
                i7 = 5;
                i10 = 2;
            }
            if (this.n) {
                arrayList.add(b41.p(32));
                arrayList.add(b41.p(32));
                arrayList.add(b41.p(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(b41.C(null));
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return hd.M0(2131742920, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(b41 b41Var, View view) {
        if (!b41Var.H(g.class) || this.actionBar.x()) {
            return;
        }
        finishFragment();
        this.e.a((w0) b41Var.H);
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = j6.d6;
        q6.h(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(j6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = j6.G6;
        q6.l(kVar2, 5, i10, getResourceProvider());
        q6.l(this.actionBar, 3, j6.z8, getResourceProvider());
        q6.l(this.actionBar, 1, i10, getResourceProvider());
        q6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 23));
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(org.telegram.messenger.g0.o());
        this.s.setTextColor(getThemedColor(j6.y8));
        this.s.setOnTouchListener(new gi.a(2));
        p10.addView(this.s, ja.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.q0 c10 = this.actionBar.s().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.O();
        c10.I = new s2(this);
        this.x = c10;
        c10.setSearchFieldHint(hd.M0(2131745836, null));
        this.x.setContentDescription(hd.M0(2131745836, null));
        EditTextBoldCursor searchField = this.x.getSearchField();
        q6.U(searchField, i10, getResourceProvider());
        q6.D(searchField, j6.Jj, getResourceProvider());
        q6.v(searchField, i10, getResourceProvider());
        cv0 cv0Var = new cv0(context, null, 1, null);
        this.y = cv0Var;
        cv0Var.d.setText(hd.M0(TextUtils.isEmpty(this.r) ? 2131742918 : 2131742917, null));
        this.y.e.setVisibility(8);
        this.y.e(false, false);
        this.y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.y, ja.c(-1.0f, -1));
        this.a.setEmptyView(this.y);
        this.a.j(new ri(this, 27));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(getThemedColor(j6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(j6.x0(null, j6.d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(j6.y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.x;
            if (q0Var == null || q0Var.getSearchField() == null) {
                return;
            }
            this.x.getSearchField().setCursorColor(getThemedColor(j6.G6));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
