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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class qs extends org.telegram.ui.ActionBar.f2 {
    public org.telegram.ui.Components.pj0 a;
    public org.telegram.ui.Components.iy b;
    public os c;
    public org.telegram.ui.Components.oj d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public boolean n;
    public ps r;
    public final ArrayList s;

    public qs(ArrayList arrayList, boolean z9) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.s = new ArrayList(arrayList);
        }
        this.h = z9;
    }

    public static org.telegram.ui.Cells.w9 Z(Context context) {
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
        w9Var.setPadding(org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 16.0f : 12.0f), 0, org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 12.0f : 16.0f), 0);
        e5 e5Var = new e5();
        e5Var.b = new ls(0, w9Var);
        w9Var.addOnAttachStateChangeListener(e5Var);
        return w9Var;
    }

    public static SpannableStringBuilder a0(ms msVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.hd.F0(msVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.hy(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) msVar.a);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752134, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i7, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.u8, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i7, null);
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 22));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
        a10.N();
        int i10 = 9;
        a10.H = new kg.v1(this, 9);
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        this.actionBar.I(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false), true);
        this.actionBar.I(org.telegram.ui.ActionBar.k6.x0(null, i7, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f = false;
        this.e = false;
        os osVar = new os(this, context, this.s, this.n);
        this.c = osVar;
        this.d = new org.telegram.ui.Components.oj(this, context, osVar.s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.b = iyVar;
        iyVar.c();
        this.b.setShowAtCenter(true);
        this.b.setText(org.telegram.messenger.hd.M0(2131748166, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.a = pj0Var;
        pj0Var.setSectionsType(3);
        this.a.setEmptyView(this.b);
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setFastScrollEnabled(0);
        this.a.setFastScrollVisible(true);
        this.a.setLayoutManager(new v4.b0(1, false));
        this.a.setAdapter(this.c);
        this.a.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        frameLayout.addView(this.a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        this.a.setOnItemClickListener(new h(this, 7));
        this.a.setOnScrollListener(new g3(this, i10));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        os osVar = this.c;
        if (osVar != null) {
            osVar.X(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.I(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i7 = org.telegram.ui.ActionBar.k6.G6;
                kVar2.I(org.telegram.ui.ActionBar.k6.x0(null, i7, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            }
            org.telegram.ui.Components.pj0 pj0Var = this.a;
            if (pj0Var != null) {
                pj0Var.x1();
                if (this.a.getFastScroll() != null) {
                    this.a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
