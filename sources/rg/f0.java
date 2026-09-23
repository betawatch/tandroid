package rg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.u5;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final ImageView a;
    public final i5 b;
    public final u5 c;
    public final i5 d;
    public e0 e;
    public d0 f;

    public f0(j0 j0Var, Context context, d6 d6Var) {
        super(context);
        int i10;
        int i11;
        i10 = ((f3) j0Var).backgroundPaddingLeft;
        i11 = ((f3) j0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.Lj, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        i5 i5Var = new i5(context);
        this.b = i5Var;
        i5Var.setWidthWrapContent(true);
        i5Var.setTextColor(h6.v0(h6.j5, d6Var));
        i5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        addView(i5Var, x5.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        i5 i5Var2 = new i5(context);
        this.d = i5Var2;
        i5Var2.setTextColor(-1);
        i5Var2.setWidthWrapContent(true);
        i5Var2.setTypeface(AndroidUtilities.bold());
        i5Var2.setTextSize(14);
        u5 u5Var = new u5(this, context, d6Var);
        this.c = u5Var;
        u5Var.setWillNotDraw(false);
        u5Var.addView(i5Var2, x5.e(-2, -2, 17));
        addView(u5Var, x5.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
