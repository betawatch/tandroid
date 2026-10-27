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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f1 extends n71 {
    public final Utilities.Callback e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public org.telegram.ui.ActionBar.w0 w;
    public fy0 x;
    public ArrayList f = c1.a(new ig.o(this, 14));
    public final ArrayList h = new ArrayList();
    public final HashSet v = new HashSet();

    public f1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.e = callback;
    }

    @Override // org.telegram.ui.Components.n71
    public final void V(ArrayList arrayList, k71 k71Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    b1 b1Var = (b1) this.f.get(size);
                    calendar.setTimeInMillis(b1Var.b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(u61.r(LocaleController.formatDateChat(b1Var.b / 1000)));
                        i12 = i13;
                    }
                    String str = this.r;
                    int i14 = h.a;
                    u61 K = u61.K(h.class);
                    K.z = 3;
                    K.q = false;
                    K.H = b1Var;
                    K.m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                b1 b1Var2 = (b1) arrayList3.get(size2);
                calendar.setTimeInMillis(b1Var2.b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(u61.r(LocaleController.formatDateChat(b1Var2.b / 1000)));
                    i15 = i16;
                }
                String str2 = this.r;
                int i17 = h.a;
                u61 K2 = u61.K(h.class);
                K2.z = 3;
                K2.q = false;
                K2.H = b1Var2;
                K2.m = str2;
                arrayList.add(K2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.n) {
                arrayList.add(u61.p(32));
                arrayList.add(u61.p(32));
                arrayList.add(u61.p(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(u61.C(null));
    }

    @Override // org.telegram.ui.Components.n71
    public final CharSequence W() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override // org.telegram.ui.Components.n71
    public final void X(u61 u61Var, View view) {
        if (!u61Var.H(h.class) || this.actionBar.q()) {
            return;
        }
        finishFragment();
        this.e.run((b1) u61Var.H);
    }

    @Override // org.telegram.ui.Components.n71
    public final boolean Y(u61 u61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = y6.d6;
        f7.i(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(y6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = y6.G6;
        f7.m(kVar2, 5, i11, getResourceProvider());
        f7.m(this.actionBar, 3, y6.z8, getResourceProvider());
        f7.m(this.actionBar, 1, i11, getResourceProvider());
        f7.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new d1(this));
        org.telegram.ui.ActionBar.z i12 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(i12.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(AndroidUtilities.bold());
        this.s.setTextColor(getThemedColor(y6.y8));
        this.s.setOnTouchListener(new ei.d(2));
        i12.addView(this.s, kb1.q(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.l().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.N();
        c10.H = new e1(this);
        this.w = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.w.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.w.getSearchField();
        f7.V(searchField, i11, getResourceProvider());
        f7.E(searchField, y6.Si, getResourceProvider());
        f7.w(searchField, i11, getResourceProvider());
        fy0 fy0Var = new fy0(context, null, 1, null);
        this.x = fy0Var;
        fy0Var.d.setText(LocaleController.getString(TextUtils.isEmpty(this.r) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        this.x.e.setVisibility(8);
        this.x.e(false, false);
        this.x.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.x, kb1.g(-1.0f, -1));
        this.a.setEmptyView(this.x);
        this.a.j(new ml(this, 23));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(y6.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(y6.x0(null, y6.d6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            NumberTextView numberTextView = this.s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(y6.y8));
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.w;
            if (w0Var == null || w0Var.getSearchField() == null) {
                return;
            }
            this.w.getSearchField().setCursorColor(getThemedColor(y6.G6));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
