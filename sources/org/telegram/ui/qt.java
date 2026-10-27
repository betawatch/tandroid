package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qt extends org.telegram.ui.ActionBar.r2 {
    public org.telegram.ui.Components.nm0 a;
    public org.telegram.ui.Components.uz b;
    public nt c;
    public ot d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public boolean n;
    public pt r;
    public final ArrayList s;

    public qt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ga V(Context context) {
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
        gaVar.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 12.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 16.0f), 0);
        kt ktVar = new kt();
        ktVar.a = new jt(0, gaVar);
        gaVar.addOnAttachStateChangeListener(ktVar);
        return gaVar;
    }

    public static SpannableStringBuilder W(lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.a);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.m(kVar, 1, i10, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.u8, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 5, i10, null);
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 21));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 9);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.D(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false), true);
        this.actionBar.D(org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f = false;
        this.e = false;
        nt ntVar = new nt(this, context, this.s, this.n);
        this.c = ntVar;
        this.d = new ot(this, context, ntVar.s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.b = uzVar;
        uzVar.c();
        this.b.setShowAtCenter(true);
        this.b.setText(LocaleController.getString(R.string.NoResult));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.a = nm0Var;
        nm0Var.setSectionsType(3);
        this.a.setEmptyView(this.b);
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setFastScrollEnabled(0);
        this.a.setFastScrollVisible(true);
        this.a.setLayoutManager(new s4.c0(1, false));
        this.a.setAdapter(this.c);
        this.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.a.setOnItemClickListener(new h(this, 7));
        this.a.setOnScrollListener(new i3(this, 9));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        nt ntVar = this.c;
        if (ntVar != null) {
            ntVar.X(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.D(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i10 = org.telegram.ui.ActionBar.y6.G6;
                kVar2.D(org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            }
            org.telegram.ui.Components.nm0 nm0Var = this.a;
            if (nm0Var != null) {
                nm0Var.A1();
                if (this.a.getFastScroll() != null) {
                    this.a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
