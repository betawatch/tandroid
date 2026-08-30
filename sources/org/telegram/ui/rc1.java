package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rc1 extends org.telegram.ui.Components.p9 {
    public Drawable D;
    public final boolean E;
    public float F;
    public float G;
    public final /* synthetic */ cd1 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc1(cd1 cd1Var, Activity activity) {
        super(activity);
        this.H = cd1Var;
        this.E = true;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.D;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        this.F = 0.0f;
        this.G = 0.0f;
        boolean z4 = this.E;
        cd1 cd1Var = this.H;
        if (z4) {
            Drawable drawable = this.D;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.dc0)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.D.draw(canvas);
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f10 = 2.0f / AndroidUtilities.density;
                    canvas.scale(f10, f10);
                    this.D.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                    this.D.draw(canvas);
                    canvas.restore();
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.D.getIntrinsicWidth(), measuredHeight / this.D.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.D.getIntrinsicWidth() * max * cd1Var.v1);
                    int ceil2 = (int) Math.ceil(this.D.getIntrinsicHeight() * max * cd1Var.v1);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    this.G = i10;
                    this.D.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                    this.D.draw(canvas);
                }
            }
        }
        if (cd1Var.X1) {
            if (!cd1Var.c.isFinished() && cd1Var.c.computeScrollOffset()) {
                if (cd1Var.c.getStartX() < cd1Var.T1 && cd1Var.c.getStartX() > 0) {
                    cd1Var.U1 = cd1Var.c.getCurrX();
                }
                cd1Var.V0();
                invalidate();
            }
            canvas.save();
            float f11 = -cd1Var.U1;
            this.F = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (cd1Var.J1) {
            float f12 = cd1Var.k1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.k(-16777216, (int) (f12 * 255.0f * cd1Var.l1)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        cd1 cd1Var = this.H;
        org.telegram.ui.Components.o81 o81Var = cd1Var.s1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o81Var.getClass();
        float a2 = org.telegram.ui.Components.o81.a(measuredWidth, measuredHeight);
        cd1Var.v1 = a2;
        if (cd1Var.B1) {
            setScaleX(a2);
            setScaleY(cd1Var.v1);
        }
        if (cd1Var.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (cd1Var.Y1 != measuredWidth2) {
            cd1Var.X1 = false;
            if (cd1Var.z1 != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / cd1Var.z1.getHeight()) * r1.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    cd1Var.X1 = true;
                    cd1Var.W1 = (int) ((cd1Var.z1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    cd1Var.U1 = measuredWidth3;
                    cd1Var.V1 = measuredWidth3;
                    cd1Var.T1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    cd1Var.V0();
                }
            }
            if (!cd1Var.X1) {
                s(-1, -1);
                this.v = false;
            }
        }
        cd1Var.Y1 = measuredWidth2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.D = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.D == drawable || super.verifyDrawable(drawable);
    }
}
