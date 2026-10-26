package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rw0 extends ug.n {
    public final /* synthetic */ Context i0;
    public final /* synthetic */ vw0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw0(vw0 vw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.j0 = vw0Var;
        this.i0 = context2;
    }

    @Override // ug.n
    public final void h() {
        vw0 vw0Var = this.j0;
        PremiumPreviewFragment premiumPreviewFragment = vw0Var.n;
        if (premiumPreviewFragment.t0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.i0;
            premiumPreviewFragment.t0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            ug.g gVar = vw0Var.d.b;
            bi.r rVar = new bi.r(context, 6);
            rVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i10 = org.telegram.ui.ActionBar.y6.n5;
            org.telegram.ui.ActionBar.f7.V(textView, i10, null);
            org.telegram.messenger.vh.r(textView, 1, 16.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView, org.telegram.ui.Components.gb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lp0 lp0Var = new org.telegram.ui.Components.lp0(context);
            int i11 = 0;
            lp0Var.setDelegate(new u10(gVar, 0));
            ug.o oVar = gVar.c;
            lp0Var.setProgress(oVar == null ? 0.0f : oVar.B / 2.0f);
            lp0Var.setReportChanges(true);
            rVar.addView(lp0Var, org.telegram.ui.Components.gb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
            org.telegram.messenger.vh.r(textView2, 1, 16.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lp0 lp0Var2 = new org.telegram.ui.Components.lp0(context);
            lp0Var2.setDelegate(new u10(gVar, 1));
            ug.o oVar2 = gVar.c;
            lp0Var2.setProgress(oVar2 == null ? 0.0f : oVar2.C / 2.0f);
            lp0Var2.setReportChanges(true);
            rVar.addView(lp0Var2, org.telegram.ui.Components.gb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i12 = org.telegram.ui.ActionBar.y6.Sh;
            org.telegram.ui.ActionBar.f7.V(textView3, i12, null);
            int i13 = org.telegram.ui.ActionBar.y6.Oh;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
            org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i13);
            textView3.setBackground(e);
            org.telegram.ui.ActionBar.f7.k(textView3, e, N, f7, null);
            textView3.setOnClickListener(new v10(context, gVar, i11));
            rVar.addView(textView3, org.telegram.ui.Components.gb1.h(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.ui.ActionBar.f7.V(textView4, i10, null);
            org.telegram.messenger.vh.r(textView4, 1, 16.0f, 1, 1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView4, org.telegram.ui.Components.gb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lp0 lp0Var3 = new org.telegram.ui.Components.lp0(context);
            lp0Var3.setDelegate(new u10(gVar, 2));
            ug.o oVar3 = gVar.c;
            lp0Var3.setProgress(oVar3 == null ? 0.0f : oVar3.D);
            lp0Var3.setReportChanges(true);
            rVar.addView(lp0Var3, org.telegram.ui.Components.gb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.ui.ActionBar.f7.V(textView5, i10, null);
            org.telegram.messenger.vh.r(textView5, 1, 16.0f, 1, 1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView5, org.telegram.ui.Components.gb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lp0 lp0Var4 = new org.telegram.ui.Components.lp0(context);
            lp0Var4.setDelegate(new u10(gVar, 3));
            ug.o oVar4 = gVar.c;
            lp0Var4.setProgress(oVar4 != null ? oVar4.G / 2.0f : 0.0f);
            lp0Var4.setReportChanges(true);
            rVar.addView(lp0Var4, org.telegram.ui.Components.gb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            org.telegram.ui.ActionBar.f7.V(textView6, i12, null);
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.o6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
            org.telegram.ui.ActionBar.b7 f10 = org.telegram.ui.ActionBar.f7.f(i13);
            textView6.setBackground(e10);
            org.telegram.ui.ActionBar.f7.k(textView6, e10, N2, f10, null);
            textView6.setOnClickListener(new v10(context, gVar, 1));
            rVar.addView(textView6, org.telegram.ui.Components.gb1.h(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.ui.ActionBar.f7.V(textView7, i10, null);
            org.telegram.messenger.vh.r(textView7, 1, 16.0f, 1, 1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView7, org.telegram.ui.Components.gb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lp0 lp0Var5 = new org.telegram.ui.Components.lp0(context);
            lp0Var5.setDelegate(new pa.d());
            lp0Var5.setProgress(bi.r.b / 2.0f);
            lp0Var5.setReportChanges(true);
            rVar.addView(lp0Var5, org.telegram.ui.Components.gb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(rVar);
            premiumPreviewFragment.t0.addView(scrollView);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, premiumPreviewFragment.t0, null);
            premiumPreviewFragment.d0.addView(premiumPreviewFragment.t0, org.telegram.ui.Components.gb1.i(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.t0.getLayoutParams()).topMargin = premiumPreviewFragment.c0;
            premiumPreviewFragment.t0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.t0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
