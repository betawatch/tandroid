package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import di.k4;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final ImageView a;
    public final j5 b;
    public final k4 c;
    public final j5 d;
    public e0 e;
    public d0 f;

    public f0(j0 j0Var, Context context, e6 e6Var) {
        super(context);
        int i7 = j0.S2;
        int i10 = j0Var.u0;
        setPadding(i10, 0, i10, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        q6.s(imageView, j6.Ck, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ja.d(24, 24.0f, (hd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.b = j5Var;
        j5Var.setWidthWrapContent(true);
        q6.X(j5Var, j6.j5, e6Var);
        j5Var.setTextSize(14);
        boolean z10 = hd.a0;
        addView(j5Var, ja.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        j5 j5Var2 = new j5(context);
        this.d = j5Var2;
        j5Var2.setTextColor(-1);
        j5Var2.setWidthWrapContent(true);
        j5Var2.setTypeface(org.telegram.messenger.g0.o());
        j5Var2.setTextSize(14);
        k4 k4Var = new k4(this, context, e6Var);
        this.c = k4Var;
        k4Var.setWillNotDraw(false);
        k4Var.addView(j5Var2, ja.e(-2, -2, 17));
        addView(k4Var, ja.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
