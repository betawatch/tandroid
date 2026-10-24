package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.wx0;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class g1 extends e71 {
    public final Utilities.Callback d;
    public boolean h;
    public String n;
    public NumberTextView r;
    public org.telegram.ui.ActionBar.u0 v;
    public wx0 w;
    public ArrayList e = d1.a(new ig.k0(this, 10));
    public final ArrayList f = new ArrayList();
    public final HashSet s = new HashSet();

    public g1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override // org.telegram.ui.Components.e71
    public final void U(ArrayList arrayList, b71 b71Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.e.get(size);
                    calendar.setTimeInMillis(c1Var.b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(m61.q(LocaleController.formatDateChat(c1Var.b / 1000)));
                        i12 = i13;
                    }
                    String str = this.n;
                    int i14 = h.a;
                    m61 J = m61.J(h.class);
                    J.z = 3;
                    J.q = false;
                    J.H = c1Var;
                    J.m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(m61.q(LocaleController.formatDateChat(c1Var2.b / 1000)));
                    i15 = i16;
                }
                String str2 = this.n;
                int i17 = h.a;
                m61 J2 = m61.J(h.class);
                J2.z = 3;
                J2.q = false;
                J2.H = c1Var2;
                J2.m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(m61.n(32));
                arrayList.add(m61.n(32));
                arrayList.add(m61.n(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(m61.B(null));
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override // org.telegram.ui.Components.e71
    public final void W(m61 m61Var, View view) {
        if (!m61Var.G(h.class) || this.actionBar.s()) {
            return;
        }
        finishFragment();
        this.d.run((c1) m61Var.H);
    }

    @Override // org.telegram.ui.Components.e71
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.e71, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.d6;
        r6.i(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = k6.G6;
        r6.m(kVar2, 5, i11, getResourceProvider());
        r6.m(this.actionBar, 3, k6.z8, getResourceProvider());
        r6.m(this.actionBar, 1, i11, getResourceProvider());
        r6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.y i12 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(i12.getContext());
        this.r = numberTextView;
        numberTextView.setTextSize(18);
        this.r.setTypeface(AndroidUtilities.bold());
        this.r.setTextColor(getThemedColor(k6.y8));
        this.r.setOnTouchListener(new di.d(2));
        i12.addView(this.r, z5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.m().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new f1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        r6.W(searchField, i11, getResourceProvider());
        r6.F(searchField, k6.Si, getResourceProvider());
        r6.x(searchField, i11, getResourceProvider());
        wx0 wx0Var = new wx0(context, null, 1, null);
        this.w = wx0Var;
        wx0Var.d.setText(LocaleController.getString(TextUtils.isEmpty(this.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        this.w.e.setVisibility(8);
        this.w.e(false, false);
        this.w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.w, z5.c(-1.0f, -1));
        this.a.setEmptyView(this.w);
        this.a.j(new kv(this, 18));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(k6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(k6.x0(null, k6.d6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            NumberTextView numberTextView = this.r;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.y8));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.v;
            if (u0Var == null || u0Var.getSearchField() == null) {
                return;
            }
            this.v.getSearchField().setCursorColor(getThemedColor(k6.G6));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
