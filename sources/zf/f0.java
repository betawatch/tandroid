package zf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final ImageView a;
    public final h5 b;
    public final bh.g c;
    public final h5 d;
    public e0 e;
    public d0 f;

    public f0(j0 j0Var, Context context, b6 b6Var) {
        super(context);
        int i9;
        int i10;
        i9 = ((f3) j0Var).backgroundPaddingLeft;
        i10 = ((f3) j0Var).backgroundPaddingLeft;
        setPadding(i9, 0, i10, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.Lj, b6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(f6.v0(f6.j5, b6Var));
        h5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        addView(h5Var, e6.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        bh.g gVar = new bh.g(this, context, b6Var);
        this.c = gVar;
        gVar.setWillNotDraw(false);
        gVar.addView(h5Var2, e6.e(-2, -2, 17));
        addView(gVar, e6.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
