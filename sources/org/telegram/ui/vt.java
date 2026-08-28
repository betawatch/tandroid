package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vt extends org.telegram.ui.Cells.d5 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.b9 f;
    public final /* synthetic */ org.telegram.ui.Cells.t8[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i9, org.telegram.ui.Cells.b9 b9Var, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i9;
        this.f = b9Var;
        this.h = t8VarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        org.telegram.messenger.ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.n5, false), 1, 16.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(activity);
        this.c = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new org.telegram.ui.Cells.c5(this));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, g7.e6.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(j0Var.getSeekBarAccessibilityDelegate());
    }
}
