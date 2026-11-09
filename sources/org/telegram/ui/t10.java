package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t10 extends org.telegram.ui.Components.w7 {
    public final /* synthetic */ Activity D;
    public final /* synthetic */ e40 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t10(e40 e40Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = e40Var;
        this.D = activity;
    }

    @Override // org.telegram.ui.Components.w7
    public final TextView a() {
        TextView textView = new TextView(this.D);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.Vg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.u41(16, this, textView));
        return textView;
    }
}
