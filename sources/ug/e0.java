package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout {
    public final ImageView a;
    public final m5 b;
    public final bi.m5 c;
    public final m5 d;
    public d0 e;
    public c0 f;

    public e0(i0 i0Var, Context context, h6 h6Var) {
        super(context);
        int i7 = i0.R2;
        int i10 = i0Var.t0;
        setPadding(i10, 0, i10, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        t6.s(imageView, m6.zk, h6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ha.d(24, 24.0f, (id.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        m5 m5Var = new m5(context);
        this.b = m5Var;
        m5Var.setWidthWrapContent(true);
        t6.X(m5Var, m6.j5, h6Var);
        m5Var.setTextSize(14);
        boolean z9 = id.a0;
        addView(m5Var, ha.d(-2, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 30.0f : 60.0f, 0.0f, z9 ? 60.0f : 30.0f, 0.0f));
        m5 m5Var2 = new m5(context);
        this.d = m5Var2;
        m5Var2.setTextColor(-1);
        m5Var2.setWidthWrapContent(true);
        m5Var2.setTypeface(org.telegram.messenger.g0.o());
        m5Var2.setTextSize(14);
        bi.m5 m5Var3 = new bi.m5(this, context, h6Var);
        this.c = m5Var3;
        m5Var3.setWillNotDraw(false);
        m5Var3.addView(m5Var2, ha.e(-2, -2, 17));
        addView(m5Var3, ha.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
