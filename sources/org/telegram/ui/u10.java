package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u10 extends org.telegram.ui.Components.v7 {
    public final /* synthetic */ Activity D;
    public final /* synthetic */ f40 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(f40 f40Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = f40Var;
        this.D = activity;
    }

    @Override // org.telegram.ui.Components.v7
    public final TextView a() {
        TextView textView = new TextView(this.D);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.m6.Vg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.u41(16, this, textView));
        return textView;
    }
}
