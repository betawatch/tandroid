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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zt extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Components.sl0 a;
    public org.telegram.ui.Components.oz b;
    public vt c;
    public xt d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public boolean n;
    public yt r;
    public final ArrayList s;

    public zt(ArrayList arrayList, boolean z4) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.s = new ArrayList(arrayList);
        }
        this.h = z4;
    }

    public static org.telegram.ui.Cells.aa U(Context context) {
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
        aaVar.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 12.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 16.0f), 0);
        st stVar = new st();
        stVar.a = new rt(0, aaVar);
        aaVar.addOnAttachStateChangeListener(stVar);
        return aaVar;
    }

    public static SpannableStringBuilder V(tt ttVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ttVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ttVar.a);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        kVar.C(org.telegram.ui.ActionBar.k6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 3));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 7);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.G(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y6, false), true);
        this.actionBar.G(org.telegram.ui.ActionBar.k6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.f = false;
        this.e = false;
        vt vtVar = new vt(this, context, this.s, this.n);
        this.c = vtVar;
        this.d = new xt(this, context, vtVar.s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.b = ozVar;
        ozVar.c();
        this.b.setShowAtCenter(true);
        this.b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.b, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.a = sl0Var;
        sl0Var.setSectionsType(3);
        this.a.setEmptyView(this.b);
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setFastScrollEnabled(0);
        this.a.setFastScrollVisible(true);
        this.a.setLayoutManager(new f2.j0(1, false));
        this.a.setAdapter(this.c);
        this.a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.a, k7.c6.c(-1.0f, -1));
        this.a.setOnItemClickListener(new j(this, 6));
        this.a.setOnScrollListener(new l3(this, 8));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        vt vtVar = this.c;
        if (vtVar != null) {
            vtVar.X(false);
        }
    }
}
