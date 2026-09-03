package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rw0 extends gg.i {
    public final /* synthetic */ Context V;
    public final /* synthetic */ vw0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw0(vw0 vw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.W = vw0Var;
        this.V = context2;
    }

    @Override // gg.i
    public final void g() {
        vw0 vw0Var = this.W;
        PremiumPreviewFragment premiumPreviewFragment = vw0Var.n;
        if (premiumPreviewFragment.o0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.V;
            premiumPreviewFragment.o0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            gg.a aVar = vw0Var.d.b;
            eg.s3 s3Var = new eg.s3(context, 8);
            int i10 = 1;
            s3Var.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i11 = org.telegram.ui.ActionBar.k6.n5;
            int i12 = 0;
            b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, i11, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            s3Var.addView(textView, k7.c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ko0 ko0Var = new org.telegram.ui.Components.ko0(context);
            ko0Var.setDelegate(new f20(aVar, 0));
            gg.j jVar = aVar.c;
            ko0Var.setProgress(jVar == null ? 0.0f : jVar.v / 2.0f);
            ko0Var.setReportChanges(true);
            s3Var.addView(ko0Var, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            b.q(textView2, org.telegram.ui.ActionBar.k6.w0(null, i11, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            s3Var.addView(textView2, k7.c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ko0 ko0Var2 = new org.telegram.ui.Components.ko0(context);
            ko0Var2.setDelegate(new f20(aVar, 1));
            gg.j jVar2 = aVar.c;
            ko0Var2.setProgress(jVar2 == null ? 0.0f : jVar2.w / 2.0f);
            ko0Var2.setReportChanges(true);
            s3Var.addView(ko0Var2, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i13 = org.telegram.ui.ActionBar.k6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
            int i14 = org.telegram.ui.ActionBar.k6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.w0(null, i14, false)));
            textView3.setOnClickListener(new g20(context, aVar, i12));
            s3Var.addView(textView3, k7.c6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            b.q(textView4, org.telegram.ui.ActionBar.k6.w0(null, i11, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            s3Var.addView(textView4, k7.c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ko0 ko0Var3 = new org.telegram.ui.Components.ko0(context);
            ko0Var3.setDelegate(new f20(aVar, 2));
            gg.j jVar3 = aVar.c;
            ko0Var3.setProgress(jVar3 == null ? 0.0f : jVar3.x);
            ko0Var3.setReportChanges(true);
            s3Var.addView(ko0Var3, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            b.q(textView5, org.telegram.ui.ActionBar.k6.w0(null, i11, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            s3Var.addView(textView5, k7.c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ko0 ko0Var4 = new org.telegram.ui.Components.ko0(context);
            ko0Var4.setDelegate(new f20(aVar, 3));
            gg.j jVar4 = aVar.c;
            ko0Var4.setProgress(jVar4 == null ? 0.0f : jVar4.A / 2.0f);
            ko0Var4.setReportChanges(true);
            s3Var.addView(ko0Var4, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
            textView6.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.w0(null, i14, false)));
            textView6.setOnClickListener(new g20(context, aVar, i10));
            s3Var.addView(textView6, k7.c6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            b.q(textView7, org.telegram.ui.ActionBar.k6.w0(null, i11, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            s3Var.addView(textView7, k7.c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ko0 ko0Var5 = new org.telegram.ui.Components.ko0(context);
            ko0Var5.setDelegate(new cb.b(16));
            ko0Var5.setProgress(eg.s3.b / 2.0f);
            ko0Var5.setReportChanges(true);
            s3Var.addView(ko0Var5, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(s3Var);
            premiumPreviewFragment.o0.addView(scrollView);
            premiumPreviewFragment.o0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
            premiumPreviewFragment.a0.addView(premiumPreviewFragment.o0, k7.c6.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.o0.getLayoutParams()).topMargin = premiumPreviewFragment.Z;
            premiumPreviewFragment.o0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.o0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
