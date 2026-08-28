package zf;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout implements l0 {
    public final b6 a;
    public final ArrayList b;
    public final m0 c;
    public final m0 d;
    public final m0 e;
    public final boolean f;

    public n0(Context context, b6 b6Var) {
        super(context);
        this.b = new ArrayList();
        this.a = b6Var;
        for (pa0 pa0Var : pa0.values()) {
            if (pa0Var.e) {
                this.b.add(pa0Var);
            }
            if (this.b.size() == 3) {
                break;
            }
        }
        if (this.b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f = true;
        } else {
            this.c = a(context, 0);
            this.d = a(context, 1);
            this.e = a(context, 2);
            setClipChildren(false);
        }
    }

    public final m0 a(Context context, int i9) {
        pa0 pa0Var = (pa0) this.b.get(i9);
        m0 m0Var = new m0(context);
        v1 v1Var = new v1(20);
        m0Var.e = v1Var;
        Paint paint = new Paint(1);
        m0Var.f = paint;
        v1Var.r = 12;
        v1Var.s = 8;
        v1Var.t = 6;
        if (i9 == 1) {
            v1Var.N = 1001;
        }
        if (i9 == 0) {
            v1Var.N = 1002;
        }
        v1Var.O = this.a;
        v1Var.P = f6.Zj;
        v1Var.c();
        paint.setColor(-1);
        m0Var.setLayoutParams(e6.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        m0Var.setForeground(pa0Var.c);
        m0Var.setBackgroundResource(pa0Var.b);
        m0Var.setPadding(AndroidUtilities.dp(8.0f));
        m0Var.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(m0Var);
        return m0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        int dp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.height = dp;
        layoutParams.width = dp;
        float f10 = dp;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f10);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = dp;
        layoutParams2.width = dp;
        int i11 = (int) (f10 * 0.95f);
        layoutParams2.rightMargin = i11;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams3.height = dp;
        layoutParams3.width = dp;
        layoutParams3.leftMargin = i11;
    }

    @Override // zf.l0
    public void setOffset(float f10) {
        if (this.f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = gr.i.getInterpolation(abs);
        int right = getRight();
        m0 m0Var = this.e;
        m0Var.setTranslationX(((m0Var.getWidth() * 1.5f) + (right - m0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        m0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        m0Var.setScaleX(clamp);
        m0Var.setScaleY(clamp);
        int top = getTop();
        m0 m0Var2 = this.c;
        m0Var2.setTranslationY((((top - m0Var2.getTop()) - (m0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        m0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        m0Var2.setScaleX(clamp2);
        m0Var2.setScaleY(clamp2);
        float interpolation2 = gr.g.getInterpolation(abs);
        int left = getLeft();
        m0 m0Var3 = this.d;
        m0Var3.setTranslationX((((left - m0Var3.getLeft()) - (m0Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        m0Var3.setTranslationY(((m0Var3.getHeight() * 2.5f) + (getBottom() - m0Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float clamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, abs), 1.0f, 0.0f);
        m0Var3.setScaleX(clamp3);
        m0Var3.setScaleY(clamp3);
        float f11 = abs < 0.4f ? abs / 0.4f : 1.0f;
        m0Var.h = f11;
        m0Var2.h = f11;
        m0Var3.h = f11;
    }
}
