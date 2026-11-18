package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t10 extends org.telegram.ui.Components.b8 {
    public final /* synthetic */ Activity E;
    public final /* synthetic */ f40 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t10(f40 f40Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.F = f40Var;
        this.E = activity;
    }

    @Override // org.telegram.ui.Components.b8
    public final TextView a() {
        TextView textView = new TextView(this.E);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.Yg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.c31(20, this, textView));
        return textView;
    }
}
