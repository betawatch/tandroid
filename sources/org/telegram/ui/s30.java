package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s30 extends org.telegram.ui.Components.e8 {
    public final /* synthetic */ j60 E;
    public final /* synthetic */ Activity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(j60 j60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = j60Var;
        this.y = activity;
    }

    @Override // org.telegram.ui.Components.e8
    public final TextView a() {
        TextView textView = new TextView(this.y);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new tv(9, this, textView));
        return textView;
    }
}
