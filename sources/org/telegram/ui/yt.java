package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yt extends org.telegram.ui.Cells.f5 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.b9 f;
    public final /* synthetic */ org.telegram.ui.Cells.t8[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.b9 b9Var, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i10;
        this.f = b9Var;
        this.h = t8VarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
        org.telegram.messenger.z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, w7.b6.d(-1, -1.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.n5, null);
        org.telegram.messenger.z20.o(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity((org.telegram.messenger.cd.X ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, w7.b6.d(-2, -1.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.h0 h0Var = new org.telegram.ui.Cells.h0(activity);
        this.c = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new l2.f(this, 13));
        h0Var.setImportantForAccessibility(2);
        addView(h0Var, w7.b6.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(h0Var.getSeekBarAccessibilityDelegate());
    }
}
