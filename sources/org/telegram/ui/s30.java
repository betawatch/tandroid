package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class s30 extends org.telegram.ui.Components.b8 {
    public final /* synthetic */ i60 E;
    public final /* synthetic */ Activity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(i60 i60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = i60Var;
        this.y = activity;
    }

    @Override // org.telegram.ui.Components.b8
    public final TextView a() {
        TextView textView = new TextView(this.y);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new sv(9, this, textView));
        return textView;
    }
}
