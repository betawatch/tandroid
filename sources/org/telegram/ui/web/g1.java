package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.ll0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class g1 extends b61 {
    public final Utilities.Callback d;
    public boolean h;
    public String n;
    public NumberTextView r;
    public org.telegram.ui.ActionBar.w0 v;
    public zw0 w;
    public ArrayList e = e1.a(new a1(this, 1));
    public final ArrayList f = new ArrayList();
    public final HashSet s = new HashSet();

    public g1(org.telegram.ui.d0 d0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override // org.telegram.ui.Components.b61
    public final void U(ArrayList arrayList, w51 w51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    d1 d1Var = (d1) this.e.get(size);
                    calendar.setTimeInMillis(d1Var.b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(i51.q(LocaleController.formatDateChat(d1Var.b / 1000)));
                        i12 = i13;
                    }
                    String str = this.n;
                    int i14 = g.a;
                    i51 J = i51.J(g.class);
                    J.z = 3;
                    J.q = false;
                    J.H = d1Var;
                    J.m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                d1 d1Var2 = (d1) arrayList3.get(size2);
                calendar.setTimeInMillis(d1Var2.b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(i51.q(LocaleController.formatDateChat(d1Var2.b / 1000)));
                    i15 = i16;
                }
                String str2 = this.n;
                int i17 = g.a;
                i51 J2 = i51.J(g.class);
                J2.z = 3;
                J2.q = false;
                J2.H = d1Var2;
                J2.m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(i51.n(32));
                arrayList.add(i51.n(32));
                arrayList.add(i51.n(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(i51.B(null));
    }

    @Override // org.telegram.ui.Components.b61
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override // org.telegram.ui.Components.b61
    public final void W(i51 i51Var, View view) {
        if (!i51Var.G(g.class) || this.actionBar.s()) {
            return;
        }
        finishFragment();
        this.d.run((d1) i51Var.H);
    }

    @Override // org.telegram.ui.Components.b61
    public final boolean X(i51 i51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.b61, org.telegram.ui.ActionBar.p2
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
        this.actionBar.B(getThemedColor(j6.z8), false);
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 26));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.r = numberTextView;
        numberTextView.setTextSize(18);
        this.r.setTypeface(AndroidUtilities.bold());
        this.r.setTextColor(getThemedColor(j6.y8));
        this.r.setOnTouchListener(new oh.d(2));
        j10.addView(this.r, b6.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new f1(this);
        this.v = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        zw0 zw0Var = new zw0(context, null, 1, null);
        this.w = zw0Var;
        zw0Var.d.setText(LocaleController.getString(TextUtils.isEmpty(this.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        this.w.e.setVisibility(8);
        this.w.e(false, false);
        this.w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.w, b6.c(-1.0f, -1));
        this.a.setEmptyView(this.w);
        this.a.j(new mb0(this, 11));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.d6)) > 0.721f;
    }
}
