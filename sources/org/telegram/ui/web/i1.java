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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.o81;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class i1 extends n61 {
    public final Utilities.Callback e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public org.telegram.ui.ActionBar.v0 w;
    public jx0 x;
    public ArrayList f = f1.a(new b1(this, 1));
    public final ArrayList h = new ArrayList();
    public final HashSet v = new HashSet();

    public i1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.e = callback;
    }

    @Override // org.telegram.ui.Components.n61
    public final void U(ArrayList arrayList, k61 k61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    e1 e1Var = (e1) this.f.get(size);
                    calendar.setTimeInMillis(e1Var.b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(w51.q(LocaleController.formatDateChat(e1Var.b / 1000)));
                        i12 = i13;
                    }
                    String str = this.r;
                    int i14 = g.a;
                    w51 J = w51.J(g.class);
                    J.z = 3;
                    J.q = false;
                    J.H = e1Var;
                    J.m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                e1 e1Var2 = (e1) arrayList3.get(size2);
                calendar.setTimeInMillis(e1Var2.b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(w51.q(LocaleController.formatDateChat(e1Var2.b / 1000)));
                    i15 = i16;
                }
                String str2 = this.r;
                int i17 = g.a;
                w51 J2 = w51.J(g.class);
                J2.z = 3;
                J2.q = false;
                J2.H = e1Var2;
                J2.m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.n) {
                arrayList.add(w51.n(32));
                arrayList.add(w51.n(32));
                arrayList.add(w51.n(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(w51.B(null));
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override // org.telegram.ui.Components.n61
    public final void W(w51 w51Var, View view) {
        if (!w51Var.G(g.class) || this.actionBar.s()) {
            return;
        }
        finishFragment();
        this.e.run((e1) w51Var.H);
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean X(w51 w51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = j6.d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(j6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = j6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.A(getThemedColor(j6.z8), false);
        this.actionBar.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 10));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(AndroidUtilities.bold());
        this.s.setTextColor(getThemedColor(j6.y8));
        this.s.setOnTouchListener(new bi.d(2));
        j3.addView(this.s, y5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new h1(this);
        this.w = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.w.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.w.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        jx0 jx0Var = new jx0(context, null, 1, null);
        this.x = jx0Var;
        jx0Var.d.setText(LocaleController.getString(TextUtils.isEmpty(this.r) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        this.x.e.setVisibility(8);
        this.x.e(false, false);
        this.x.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.x, y5.c(-1.0f, -1));
        this.a.setEmptyView(this.x);
        this.a.j(new sb0(this, 12));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.d6)) > 0.721f;
    }
}
