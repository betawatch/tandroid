package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import di.n4;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final ImageView a;
    public final n5 b;
    public final n4 c;
    public final n5 d;
    public g0 e;
    public f0 f;

    public h0(l0 l0Var, Context context, i6 i6Var) {
        super(context);
        int i7 = l0.S2;
        int i10 = l0Var.u0;
        setPadding(i10, 0, i10, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        u6.s(imageView, n6.Ck, i6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ma.d(24, 24.0f, (gd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        n5 n5Var = new n5(context);
        this.b = n5Var;
        n5Var.setWidthWrapContent(true);
        u6.X(n5Var, n6.j5, i6Var);
        n5Var.setTextSize(14);
        boolean z10 = gd.a0;
        addView(n5Var, ma.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        n5 n5Var2 = new n5(context);
        this.d = n5Var2;
        n5Var2.setTextColor(-1);
        n5Var2.setWidthWrapContent(true);
        n5Var2.setTypeface(org.telegram.messenger.g0.o());
        n5Var2.setTextSize(14);
        n4 n4Var = new n4(this, context, i6Var);
        this.c = n4Var;
        n4Var.setWillNotDraw(false);
        n4Var.addView(n5Var2, ma.e(-2, -2, 17));
        addView(n4Var, ma.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
