package vg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import ci.t4;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout {
    public final ImageView a;
    public final k5 b;
    public final t4 c;
    public final k5 d;
    public d0 e;
    public c0 f;

    public e0(i0 i0Var, Context context, e6 e6Var) {
        super(context);
        int i3 = i0.P2;
        int i10 = i0Var.u0;
        setPadding(i10, 0, i10, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r6.t(imageView, k6.zk, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, mf.d(24, 24.0f, (bd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.b = k5Var;
        k5Var.setWidthWrapContent(true);
        r6.Y(k5Var, k6.j5, e6Var);
        k5Var.setTextSize(14);
        boolean z10 = bd.a0;
        addView(k5Var, mf.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        k5 k5Var2 = new k5(context);
        this.d = k5Var2;
        k5Var2.setTextColor(-1);
        k5Var2.setWidthWrapContent(true);
        k5Var2.setTypeface(org.telegram.messenger.g0.o());
        k5Var2.setTextSize(14);
        t4 t4Var = new t4(this, context, e6Var);
        this.c = t4Var;
        t4Var.setWillNotDraw(false);
        t4Var.addView(k5Var2, mf.e(-2, -2, 17));
        addView(t4Var, mf.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
