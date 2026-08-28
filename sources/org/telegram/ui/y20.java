package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y20 extends org.telegram.ui.Components.w7 {
    public final /* synthetic */ o50 A;
    public final /* synthetic */ Activity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(o50 o50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.A = o50Var;
        this.y = activity;
    }

    @Override // org.telegram.ui.Components.w7
    public final TextView a() {
        TextView textView = new TextView(this.y);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.vh0(26, this, textView));
        return textView;
    }
}
