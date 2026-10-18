package sg;

import ai.n5;
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
import org.telegram.ui.ActionBar.j5;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout {
    public final ImageView a;
    public final j5 b;
    public final n5 c;
    public final j5 d;
    public f0 e;
    public e0 f;

    public g0(k0 k0Var, Context context, d6 d6Var) {
        super(context);
        int i10;
        int i11;
        i10 = ((f3) k0Var).backgroundPaddingLeft;
        i11 = ((f3) k0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.Lj, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.b = j5Var;
        j5Var.setWidthWrapContent(true);
        j5Var.setTextColor(h6.w0(h6.j5, d6Var));
        j5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        addView(j5Var, z5.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        j5 j5Var2 = new j5(context);
        this.d = j5Var2;
        j5Var2.setTextColor(-1);
        j5Var2.setWidthWrapContent(true);
        j5Var2.setTypeface(AndroidUtilities.bold());
        j5Var2.setTextSize(14);
        n5 n5Var = new n5(this, context, d6Var);
        this.c = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.addView(j5Var2, z5.e(-2, -2, 17));
        addView(n5Var, z5.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
