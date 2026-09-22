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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.w81;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class h1 extends z51 {
    public final Utilities.Callback d;
    public boolean h;
    public String n;
    public NumberTextView r;
    public org.telegram.ui.ActionBar.v0 v;
    public yw0 w;
    public ArrayList e = f1.a(new b1(this, 1));
    public final ArrayList f = new ArrayList();
    public final HashSet s = new HashSet();

    public h1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override // org.telegram.ui.Components.z51
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
                    e1 e1Var = (e1) this.e.get(size);
                    calendar.setTimeInMillis(e1Var.b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(i51.q(LocaleController.formatDateChat(e1Var.b / 1000)));
                        i12 = i13;
                    }
                    String str = this.n;
                    int i14 = g.a;
                    i51 J = i51.J(g.class);
                    J.z = 3;
                    J.q = false;
                    J.H = e1Var;
                    J.m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                e1 e1Var2 = (e1) arrayList3.get(size2);
                calendar.setTimeInMillis(e1Var2.b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(i51.q(LocaleController.formatDateChat(e1Var2.b / 1000)));
                    i15 = i16;
                }
                String str2 = this.n;
                int i17 = g.a;
                i51 J2 = i51.J(g.class);
                J2.z = 3;
                J2.q = false;
                J2.H = e1Var2;
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

    @Override // org.telegram.ui.Components.z51
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override // org.telegram.ui.Components.z51
    public final void W(i51 i51Var, View view) {
        if (!i51Var.G(g.class) || this.actionBar.s()) {
            return;
        }
        finishFragment();
        this.d.run((e1) i51Var.H);
    }

    @Override // org.telegram.ui.Components.z51
    public final boolean X(i51 i51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.z51, org.telegram.ui.ActionBar.n2
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
        this.actionBar.A(getThemedColor(i6.z8), false);
        this.actionBar.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new w81(this, 9));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.r = numberTextView;
        numberTextView.setTextSize(18);
        this.r.setTypeface(AndroidUtilities.bold());
        this.r.setTextColor(getThemedColor(i6.y8));
        this.r.setOnTouchListener(new bi.d(2));
        j3.addView(this.r, x5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new g1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        yw0 yw0Var = new yw0(context, null, 1, null);
        this.w = yw0Var;
        yw0Var.d.setText(LocaleController.getString(TextUtils.isEmpty(this.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        this.w.e.setVisibility(8);
        this.w.e(false, false);
        this.w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.w, x5.c(-1.0f, -1));
        this.a.setEmptyView(this.w);
        this.a.j(new kb0(this, 11));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.d6)) > 0.721f;
    }
}
