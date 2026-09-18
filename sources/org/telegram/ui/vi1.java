package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class vi1 implements ci0 {
    public final org.telegram.ui.Cells.u1 a;
    public final org.telegram.ui.Components.wl0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.ui i;
    public final org.telegram.ui.ActionBar.e6 j;
    public float k;
    public float l;

    public vi1(org.telegram.ui.Cells.u1 u1Var, lk lkVar, org.telegram.ui.Components.wl0 wl0Var, org.telegram.ui.Components.ui uiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.j = e6Var;
        this.a = u1Var;
        this.i = uiVar;
        this.b = wl0Var;
        u1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = lkVar.getRecordCircle();
        this.g = recordCircle;
        if (recordCircle != null) {
            this.c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = u1Var.getMessageObject().stableId;
        ((ArrayList) uiVar.c).add(this);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ai.x(25, this, uiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new ui1(this, u1Var, uiVar));
        if (u1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.wo0 seekBarWaveform = u1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.n;
            if (u1Var2 != null) {
                u1Var2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ci0
    public final void a(final Canvas canvas) {
        float y3;
        float x10;
        float f7;
        final float f10 = this.d;
        float f11 = f10 > 0.6f ? 1.0f : f10 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        org.telegram.ui.Components.ui uiVar = this.i;
        float x11 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.J) - uiVar.getX();
        final float y10 = recordCircle == null ? 0.0f : (recordCircle.getY() + recordCircle.K) - uiVar.getY();
        org.telegram.ui.Cells.u1 u1Var = this.a;
        int i10 = u1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.wl0 wl0Var = this.b;
        if (i10 != i11) {
            x10 = this.k;
            y3 = this.l;
        } else {
            y3 = (wl0Var.getY() + (u1Var.getY() + u1Var.getRadialProgress().a.centerY())) - uiVar.getY();
            x10 = (wl0Var.getX() + (u1Var.getX() + u1Var.getRadialProgress().a.centerX())) - uiVar.getX();
        }
        this.k = x10;
        this.l = y3;
        float interpolation = org.telegram.ui.Components.qr.f.getInterpolation(f10);
        float interpolation2 = org.telegram.ui.Components.qr.h.getInterpolation(f10);
        final float f12 = (x10 * interpolation2) + ((1.0f - interpolation2) * x11);
        float f13 = 1.0f - interpolation;
        final float f14 = (y3 * interpolation) + (y10 * f13);
        float height = u1Var.getRadialProgress().a.height() / 2.0f;
        float f15 = (height * interpolation) + (this.c * f13);
        wl0Var.getY();
        uiVar.getY();
        wl0Var.getMeasuredHeight();
        if (uiVar.getMeasuredHeight() > 0) {
            uiVar.getMeasuredHeight();
        }
        int i12 = u1Var.getRadialProgress().p;
        int i13 = org.telegram.ui.ActionBar.j6.cf;
        org.telegram.ui.ActionBar.e6 e6Var = this.j;
        float f16 = f11;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, e6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        Paint paint = this.e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f17 = 1.0f - f16;
            org.telegram.ui.Components.ba baVar = recordCircle.h;
            org.telegram.ui.Components.ba baVar2 = recordCircle.n;
            f7 = x11;
            float interpolation3 = org.telegram.ui.Components.qr.g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f18 = chatActivityEnterView.i4;
            float f19 = f18 > 0.7f ? 1.0f : f18 / 0.7f;
            canvas.save();
            float f20 = ((baVar2.t * 1.4f) + 0.878f) * chatActivityEnterView.g4 * f19 * interpolation3 * f17;
            canvas.scale(f20, f20, f12, f14);
            baVar2.a(f12, f14, canvas, baVar2.d);
            canvas.restore();
            float f21 = ((baVar.t * 1.4f) + 0.926f) * chatActivityEnterView.g4 * f19 * interpolation3 * f17;
            canvas.save();
            canvas.scale(f21, f21, f12, f14);
            baVar.a(f12, f14, canvas, baVar.d);
            canvas.restore();
        } else {
            f7 = x11;
        }
        canvas.drawCircle(f12, f14, f15, paint);
        canvas.save();
        final float f22 = f15 / height;
        canvas.scale(f22, f22, f12, f14);
        final float centerX = f12 - u1Var.getRadialProgress().a.centerX();
        final float centerY = f14 - u1Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        u1Var.getRadialProgress().E = interpolation;
        u1Var.getRadialProgress().B = false;
        final float f23 = f7;
        u1Var.q2(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.ti1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f24;
                Drawable drawable;
                vi1 vi1Var = vi1.this;
                RadialProgress2 radialProgress = vi1Var.a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f25 = centerX;
                float f26 = centerY;
                canvas3.translate(-f25, -f26);
                float f27 = f22;
                float f28 = 1.0f / f27;
                float f29 = f12;
                float f30 = f14;
                canvas3.scale(f28, f28, f29, f30);
                ChatActivityEnterView.RecordCircle recordCircle2 = vi1Var.g;
                if (recordCircle2 != null) {
                    int i14 = (int) f23;
                    int i15 = (int) y10;
                    float f31 = 1.0f - f10;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.r4;
                    Rect rect = chatActivityEnterView2.S3;
                    Drawable drawable2 = null;
                    if (z10) {
                        if (recordCircle2.f != 1.0f) {
                            drawable2 = chatActivityEnterView2.c1 ? chatActivityEnterView2.P3 : chatActivityEnterView2.O3;
                        }
                        drawable = chatActivityEnterView2.Q3;
                        canvas2 = canvas3;
                        f24 = f31;
                        rect.set(org.telegram.ui.Cells.c1.r(2, i14, drawable), org.telegram.ui.Cells.c1.c(2, i15, drawable), org.telegram.ui.Cells.c1.v(2, i14, drawable), org.telegram.ui.Cells.c1.u(2, i15, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(org.telegram.ui.Cells.c1.r(2, i14, drawable2), org.telegram.ui.Cells.c1.c(2, i15, drawable2), org.telegram.ui.Cells.c1.v(2, i14, drawable2), org.telegram.ui.Cells.c1.u(2, i15, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f24 = f31;
                        drawable = chatActivityEnterView2.c1 ? chatActivityEnterView2.P3 : chatActivityEnterView2.O3;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable3 = drawable;
                    Drawable drawable4 = drawable2;
                    drawable3.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable3, drawable4, recordCircle2.f, (int) (255.0f * f24));
                }
                canvas3.scale(f27, f27, f29, f30);
                canvas3.translate(f25, f26);
            }
        });
        u1Var.getRadialProgress().B = true;
        u1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
