package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import di.n4;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout {
    public final ImageView a;
    public final m5 b;
    public final n4 c;
    public final m5 d;
    public f0 e;
    public e0 f;

    public g0(k0 k0Var, Context context, h6 h6Var) {
        super(context);
        int i7 = k0.S2;
        int i10 = k0Var.u0;
        setPadding(i10, 0, i10, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        t6.s(imageView, m6.Ck, h6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ma.d(24, 24.0f, (hd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        m5 m5Var = new m5(context);
        this.b = m5Var;
        m5Var.setWidthWrapContent(true);
        t6.X(m5Var, m6.j5, h6Var);
        m5Var.setTextSize(14);
        boolean z10 = hd.a0;
        addView(m5Var, ma.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        m5 m5Var2 = new m5(context);
        this.d = m5Var2;
        m5Var2.setTextColor(-1);
        m5Var2.setWidthWrapContent(true);
        m5Var2.setTypeface(org.telegram.messenger.g0.o());
        m5Var2.setTextSize(14);
        n4 n4Var = new n4(this, context, h6Var);
        this.c = n4Var;
        n4Var.setWillNotDraw(false);
        n4Var.addView(m5Var2, ma.e(-2, -2, 17));
        addView(n4Var, ma.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
