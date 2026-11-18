package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class zs extends org.telegram.ui.Cells.c5 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.z8 f;
    public final /* synthetic */ org.telegram.ui.Cells.r8[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i7, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i7;
        this.f = z8Var;
        this.h = r8VarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
        org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, c8.ma.d(-1, -1.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.n5, null);
        org.telegram.messenger.n10.q(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity((org.telegram.messenger.gd.a0 ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, c8.ma.d(-2, -1.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(activity);
        this.c = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new org.telegram.ui.Cells.b5(this));
        i0Var.setImportantForAccessibility(2);
        addView(i0Var, c8.ma.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(i0Var.getSeekBarAccessibilityDelegate());
    }
}
