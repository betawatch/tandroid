package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qt extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Components.wk0 a;
    public org.telegram.ui.Components.yy b;
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

    public static org.telegram.ui.Cells.ba T(Context context) {
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
        baVar.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 12.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 16.0f), 0);
        kt ktVar = new kt();
        ktVar.a = new jt(0, baVar);
        baVar.addOnAttachStateChangeListener(ktVar);
        return baVar;
    }

    public static SpannableStringBuilder U(lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xy(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.a);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        kVar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 7);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.G(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y6, false), true);
        this.actionBar.G(org.telegram.ui.ActionBar.f6.w0(null, i9, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.f = false;
        this.e = false;
        nt ntVar = new nt(this, context, this.s, this.n);
        this.c = ntVar;
        this.d = new ot(this, context, ntVar.s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.b = yyVar;
        yyVar.c();
        this.b.setShowAtCenter(true);
        this.b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.b, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.a = wk0Var;
        wk0Var.setSectionsType(3);
        this.a.setEmptyView(this.b);
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setFastScrollEnabled(0);
        this.a.setFastScrollVisible(true);
        this.a.setLayoutManager(new f2.m0(1, false));
        this.a.setAdapter(this.c);
        this.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.a, g7.e6.c(-1.0f, -1));
        this.a.setOnItemClickListener(new i(this, 6));
        this.a.setOnScrollListener(new l3(this, 8));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        nt ntVar = this.c;
        if (ntVar != null) {
            ntVar.X(false);
        }
    }
}
