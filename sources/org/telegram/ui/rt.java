package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rt extends org.telegram.ui.ActionBar.k2 {
    public org.telegram.ui.Components.tk0 a;
    public org.telegram.ui.Components.xy b;
    public pt c;
    public org.telegram.ui.Components.pj d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public boolean n;
    public qt r;
    public final ArrayList s;

    public rt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.x9 Y(Context context) {
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
        x9Var.setPadding(org.telegram.messenger.i0.L(org.telegram.messenger.cd.X ? 16.0f : 12.0f), 0, org.telegram.messenger.i0.L(org.telegram.messenger.cd.X ? 12.0f : 16.0f), 0);
        d5 d5Var = new d5();
        d5Var.b = new mt(0, x9Var);
        x9Var.addOnAttachStateChangeListener(d5Var);
        return x9Var;
    }

    public static SpannableStringBuilder Z(nt ntVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = org.telegram.messenger.cd.E0(ntVar.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wy(1), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ntVar.a);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131752134, null));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(lVar, 1, i10, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.u8, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 5, i10, null);
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 13));
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.N();
        int i11 = 9;
        a2.H = new ag.l3(this, 9);
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.actionBar.I(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false), true);
        this.actionBar.I(org.telegram.ui.ActionBar.t6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f = false;
        this.e = false;
        pt ptVar = new pt(this, context, this.s, this.n);
        this.c = ptVar;
        this.d = new org.telegram.ui.Components.pj(this, context, ptVar.s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.b = xyVar;
        xyVar.c();
        this.b.setShowAtCenter(true);
        this.b.setText(org.telegram.messenger.cd.L0(2131748183, null));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.a = tk0Var;
        tk0Var.setSectionsType(3);
        this.a.setEmptyView(this.b);
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setFastScrollEnabled(0);
        this.a.setFastScrollVisible(true);
        this.a.setLayoutManager(new s4.a0(1, false));
        this.a.setAdapter(this.c);
        this.a.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        this.a.setOnItemClickListener(new g(this, 7));
        this.a.setOnScrollListener(new h3(this, i11));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        pt ptVar = this.c;
        if (ptVar != null) {
            ptVar.X(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.I(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false), true);
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                int i10 = org.telegram.ui.ActionBar.t6.G6;
                lVar2.I(org.telegram.ui.ActionBar.t6.x0(null, i10, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            }
            org.telegram.ui.Components.tk0 tk0Var = this.a;
            if (tk0Var != null) {
                tk0Var.x1();
                if (this.a.getFastScroll() != null) {
                    this.a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
