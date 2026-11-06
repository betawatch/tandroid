package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.m5;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout {
    public final ImageView a;
    public final k5 b;
    public final m5 c;
    public final k5 d;
    public d0 e;
    public c0 f;

    public e0(i0 i0Var, Context context, f6 f6Var) {
        super(context);
        int i7 = i0.O2;
        int i10 = i0Var.t0;
        setPadding(i10, 0, i10, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r6.t(imageView, k6.zk, f6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ha.d(24, 24.0f, (hd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.b = k5Var;
        k5Var.setWidthWrapContent(true);
        r6.Y(k5Var, k6.j5, f6Var);
        k5Var.setTextSize(14);
        boolean z9 = hd.a0;
        addView(k5Var, ha.d(-2, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 30.0f : 60.0f, 0.0f, z9 ? 60.0f : 30.0f, 0.0f));
        k5 k5Var2 = new k5(context);
        this.d = k5Var2;
        k5Var2.setTextColor(-1);
        k5Var2.setWidthWrapContent(true);
        k5Var2.setTypeface(org.telegram.messenger.g0.o());
        k5Var2.setTextSize(14);
        m5 m5Var = new m5(this, context, f6Var);
        this.c = m5Var;
        m5Var.setWillNotDraw(false);
        m5Var.addView(k5Var2, ha.e(-2, -2, 17));
        addView(m5Var, ha.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
