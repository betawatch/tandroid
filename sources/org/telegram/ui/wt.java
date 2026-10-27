package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wt extends org.telegram.ui.Cells.h5 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.i9 f;
    public final /* synthetic */ org.telegram.ui.Cells.a9[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.i9 i9Var, org.telegram.ui.Cells.a9[] a9VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i10;
        this.f = i9Var;
        this.h = a9VarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
        org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, org.telegram.ui.Components.kb1.h(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.n5, null);
        org.telegram.messenger.wh.r(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, org.telegram.ui.Components.kb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(activity);
        this.c = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new org.telegram.ui.Cells.g5(this));
        i0Var.setImportantForAccessibility(2);
        addView(i0Var, org.telegram.ui.Components.kb1.h(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(i0Var.getSeekBarAccessibilityDelegate());
    }
}
