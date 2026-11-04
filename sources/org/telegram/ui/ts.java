package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ts extends org.telegram.ui.Cells.b5 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.y8 f;
    public final /* synthetic */ org.telegram.ui.Cells.q8[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i3, org.telegram.ui.Cells.y8 y8Var, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i3;
        this.f = y8Var;
        this.h = q8VarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, b8.mf.d(-1, -1.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.n5, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity((org.telegram.messenger.bd.a0 ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, b8.mf.d(-2, -1.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.h0 h0Var = new org.telegram.ui.Cells.h0(activity);
        this.c = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new gi.w5(this, 28));
        h0Var.setImportantForAccessibility(2);
        addView(h0Var, b8.mf.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(h0Var.getSeekBarAccessibilityDelegate());
    }
}
