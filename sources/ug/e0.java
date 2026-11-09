package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.m5;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout {
    public final ImageView a;
    public final l5 b;
    public final m5 c;
    public final l5 d;
    public d0 e;
    public c0 f;

    public e0(i0 i0Var, Context context, g6 g6Var) {
        super(context);
        int i7 = i0.O2;
        int i10 = i0Var.t0;
        setPadding(i10, 0, i10, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        s6.s(imageView, l6.zk, g6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ha.d(24, 24.0f, (id.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        l5 l5Var = new l5(context);
        this.b = l5Var;
        l5Var.setWidthWrapContent(true);
        s6.X(l5Var, l6.j5, g6Var);
        l5Var.setTextSize(14);
        boolean z9 = id.a0;
        addView(l5Var, ha.d(-2, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 30.0f : 60.0f, 0.0f, z9 ? 60.0f : 30.0f, 0.0f));
        l5 l5Var2 = new l5(context);
        this.d = l5Var2;
        l5Var2.setTextColor(-1);
        l5Var2.setWidthWrapContent(true);
        l5Var2.setTypeface(org.telegram.messenger.g0.o());
        l5Var2.setTextSize(14);
        m5 m5Var = new m5(this, context, g6Var);
        this.c = m5Var;
        m5Var.setWillNotDraw(false);
        m5Var.addView(l5Var2, ha.e(-2, -2, 17));
        addView(m5Var, ha.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
