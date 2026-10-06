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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.z61;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class h1 extends z61 {
    public final Utilities.Callback e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public org.telegram.ui.ActionBar.v0 w;
    public ux0 x;
    public ArrayList f = e1.a(new ii.q1(this, 4));
    public final ArrayList h = new ArrayList();
    public final HashSet v = new HashSet();

    public h1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.e = callback;
    }

    @Override // org.telegram.ui.Components.z61
    public final void S(ArrayList arrayList, w61 w61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    d1 d1Var = (d1) this.f.get(size);
                    calendar.setTimeInMillis(d1Var.b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(h61.r(LocaleController.formatDateChat(d1Var.b / 1000)));
                        i12 = i13;
                    }
                    String str = this.r;
                    int i14 = g.a;
                    h61 K = h61.K(g.class);
                    K.z = 3;
                    K.q = false;
                    K.H = d1Var;
                    K.m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                d1 d1Var2 = (d1) arrayList3.get(size2);
                calendar.setTimeInMillis(d1Var2.b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(h61.r(LocaleController.formatDateChat(d1Var2.b / 1000)));
                    i15 = i16;
                }
                String str2 = this.r;
                int i17 = g.a;
                h61 K2 = h61.K(g.class);
                K2.z = 3;
                K2.q = false;
                K2.H = d1Var2;
                K2.m = str2;
                arrayList.add(K2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.n) {
                arrayList.add(h61.p(32));
                arrayList.add(h61.p(32));
                arrayList.add(h61.p(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(h61.C(null));
    }

    @Override // org.telegram.ui.Components.z61
    public final CharSequence T() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override // org.telegram.ui.Components.z61
    public final void U(h61 h61Var, View view) {
        if (!h61Var.H(g.class) || this.actionBar.s()) {
            return;
        }
        finishFragment();
        this.e.run((d1) h61Var.H);
    }

    @Override // org.telegram.ui.Components.z61
    public final boolean W(h61 h61Var, View view) {
        return false;
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
        this.actionBar.setActionBarMenuOnItemClick(new f1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(AndroidUtilities.bold());
        this.s.setTextColor(getThemedColor(i6.y8));
        this.s.setOnTouchListener(new bi.d(2));
        j3.addView(this.s, z5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new g1(this);
        this.w = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.w.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.w.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        ux0 ux0Var = new ux0(context, null, 1, null);
        this.x = ux0Var;
        ux0Var.d.setText(LocaleController.getString(TextUtils.isEmpty(this.r) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        this.x.e.setVisibility(8);
        this.x.e(false, false);
        this.x.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.x, z5.c(-1.0f, -1));
        this.a.setEmptyView(this.x);
        this.a.j(new xb0(this, 12));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.d6)) > 0.721f;
    }
}
