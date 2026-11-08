package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class r10 extends org.telegram.ui.Components.w7 {
    public final /* synthetic */ Activity D;
    public final /* synthetic */ c40 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(c40 c40Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = c40Var;
        this.D = activity;
    }

    @Override // org.telegram.ui.Components.w7
    public final TextView a() {
        TextView textView = new TextView(this.D);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.Vg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.t41(16, this, textView));
        return textView;
    }
}
