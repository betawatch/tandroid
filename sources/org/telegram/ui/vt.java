package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class vt extends org.telegram.ui.Cells.c5 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.d9 f;
    public final /* synthetic */ org.telegram.ui.Cells.v8[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.d9 d9Var, org.telegram.ui.Cells.v8[] v8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i10;
        this.f = d9Var;
        this.h = v8VarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        org.telegram.messenger.kk.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        org.telegram.messenger.kk.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.n5, false), 1, 16.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
        org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(activity);
        this.c = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new org.telegram.ui.Cells.b5(this));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, w7.z5.a(38.0f, 6.0f, 36.0f, 6.0f, 0.0f, -1, 51));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(j0Var.getSeekBarAccessibilityDelegate());
    }
}
