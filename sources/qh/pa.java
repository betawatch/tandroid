package qh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class pa extends View {
    public final ij0 a;
    public final org.telegram.ui.Components.j6 b;
    public final Paint c;
    public final Paint d;
    public final rc e;
    public boolean f;
    public final org.telegram.ui.Components.z5 h;

    public pa(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new rc(this);
        pr prVar = pr.h;
        this.h = new org.telegram.ui.Components.z5(this, 0L, 240L, prVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        ij0 ij0Var = new ij0(R.raw.group_pip_delete_icon, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.a = ij0Var;
        ij0Var.s0 = this;
        ij0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        ij0Var.h = true;
        ij0Var.N(0);
        ij0Var.H(true);
        ij0Var.start();
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, false, false);
        this.b = j6Var;
        j6Var.k(0.3f, 250L, prVar);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.r(-1);
        j6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
        j6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        j6Var.b = 17;
    }

    public final void a(boolean z4, boolean z10) {
        this.e.c(z4);
        this.b.q(LocaleController.getString((z4 || z10) ? R.string.TrashHintRelease : R.string.TrashHintDrag), true, true);
        boolean z11 = z4 && !z10;
        this.f = z11;
        ij0 ij0Var = this.a;
        if (z11) {
            if (ij0Var.Y > 34) {
                ij0Var.L(0, false, false);
            }
            ij0Var.N(33);
            ij0Var.start();
        } else {
            ij0Var.N(z10 ? 66 : 0);
            ij0Var.start();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e6 = (this.h.e(this.f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e6, this.d);
        canvas.drawCircle(width, height, e6, this.c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        ij0 ij0Var = this.a;
        ij0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        ij0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.j6 j6Var = this.b;
        j6Var.setBounds(0, dp3, width2, height2);
        j6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }
}
