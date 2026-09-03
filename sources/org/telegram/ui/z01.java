package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z01 extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final /* synthetic */ ProfileActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.a = profileActivity;
        e();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.a.w0));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
