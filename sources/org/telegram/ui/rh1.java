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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class rh1 implements qh0 {
    public final org.telegram.ui.Cells.t1 a;
    public final org.telegram.ui.Components.mm0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.si i;
    public final org.telegram.ui.ActionBar.g6 j;
    public float k;
    public float l;

    public rh1(org.telegram.ui.Cells.t1 t1Var, gk gkVar, org.telegram.ui.Components.mm0 mm0Var, org.telegram.ui.Components.si siVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.j = g6Var;
        this.a = t1Var;
        this.i = siVar;
        this.b = mm0Var;
        t1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = gkVar.getRecordCircle();
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
        this.h = t1Var.getMessageObject().stableId;
        ((ArrayList) siVar.c).add(this);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ah.l0(26, this, siVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new qh1(this, t1Var, siVar));
        if (t1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.kp0 seekBarWaveform = t1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.n;
            if (t1Var2 != null) {
                t1Var2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.qh0
    public final void a(final Canvas canvas) {
        float y3;
        float x10;
        float f7;
        final float f10 = this.d;
        float f11 = f10 > 0.6f ? 1.0f : f10 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        org.telegram.ui.Components.si siVar = this.i;
        float x11 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.J) - siVar.getX();
        final float y10 = recordCircle != null ? (recordCircle.getY() + recordCircle.K) - siVar.getY() : 0.0f;
        org.telegram.ui.Cells.t1 t1Var = this.a;
        int i10 = t1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.mm0 mm0Var = this.b;
        if (i10 != i11) {
            x10 = this.k;
            y3 = this.l;
        } else {
            y3 = (mm0Var.getY() + (t1Var.getY() + t1Var.getRadialProgress().a.centerY())) - siVar.getY();
            x10 = (mm0Var.getX() + (t1Var.getX() + t1Var.getRadialProgress().a.centerX())) - siVar.getX();
        }
        this.k = x10;
        this.l = y3;
        float interpolation = org.telegram.ui.Components.bs.f.getInterpolation(f10);
        float interpolation2 = org.telegram.ui.Components.bs.h.getInterpolation(f10);
        final float f12 = (x10 * interpolation2) + ((1.0f - interpolation2) * x11);
        float f13 = 1.0f - interpolation;
        final float f14 = (y3 * interpolation) + (y10 * f13);
        float height = t1Var.getRadialProgress().a.height() / 2.0f;
        float f15 = (height * interpolation) + (this.c * f13);
        mm0Var.getY();
        siVar.getY();
        mm0Var.getMeasuredHeight();
        if (siVar.getMeasuredHeight() > 0) {
            siVar.getMeasuredHeight();
        }
        int i12 = t1Var.getRadialProgress().p;
        int i13 = org.telegram.ui.ActionBar.k6.cf;
        org.telegram.ui.ActionBar.g6 g6Var = this.j;
        float f16 = f11;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int f17 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        Paint paint = this.e;
        paint.setColor(f17);
        if (recordCircle != null) {
            float f18 = 1.0f - f16;
            org.telegram.ui.Components.ba baVar = recordCircle.h;
            org.telegram.ui.Components.ba baVar2 = recordCircle.n;
            f7 = x11;
            float interpolation3 = org.telegram.ui.Components.bs.g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.j4;
            float f20 = f19 > 0.7f ? 1.0f : f19 / 0.7f;
            canvas.save();
            float f21 = ((baVar2.t * 1.4f) + 0.878f) * chatActivityEnterView.h4 * f20 * interpolation3 * f18;
            canvas.scale(f21, f21, f12, f14);
            baVar2.a(f12, f14, canvas, baVar2.d);
            canvas.restore();
            float f22 = ((baVar.t * 1.4f) + 0.926f) * chatActivityEnterView.h4 * f20 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f22, f22, f12, f14);
            baVar.a(f12, f14, canvas, baVar.d);
            canvas.restore();
        } else {
            f7 = x11;
        }
        canvas.drawCircle(f12, f14, f15, paint);
        canvas.save();
        final float f23 = f15 / height;
        canvas.scale(f23, f23, f12, f14);
        final float centerX = f12 - t1Var.getRadialProgress().a.centerX();
        final float centerY = f14 - t1Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        t1Var.getRadialProgress().E = interpolation;
        t1Var.getRadialProgress().B = false;
        final float f24 = f7;
        t1Var.p2(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.ph1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f25;
                Drawable drawable;
                rh1 rh1Var = rh1.this;
                RadialProgress2 radialProgress = rh1Var.a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f26 = centerX;
                float f27 = centerY;
                canvas3.translate(-f26, -f27);
                float f28 = f23;
                float f29 = 1.0f / f28;
                float f30 = f12;
                float f31 = f14;
                canvas3.scale(f29, f29, f30, f31);
                ChatActivityEnterView.RecordCircle recordCircle2 = rh1Var.g;
                if (recordCircle2 != null) {
                    int i14 = (int) f24;
                    int i15 = (int) y10;
                    float f32 = 1.0f - f10;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable2 = null;
                    if (z10) {
                        if (recordCircle2.f != 1.0f) {
                            drawable2 = chatActivityEnterView2.c1 ? chatActivityEnterView2.Q3 : chatActivityEnterView2.P3;
                        }
                        drawable = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f25 = f32;
                        rect.set(org.telegram.ui.Cells.b1.f(2, i14, drawable), org.telegram.messenger.sl.d(2, i15, drawable), org.telegram.ui.Cells.b1.y(2, i14, drawable), org.telegram.ui.Cells.b1.u(2, i15, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(org.telegram.ui.Cells.b1.f(2, i14, drawable2), org.telegram.messenger.sl.d(2, i15, drawable2), org.telegram.ui.Cells.b1.y(2, i14, drawable2), org.telegram.ui.Cells.b1.u(2, i15, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f25 = f32;
                        drawable = chatActivityEnterView2.c1 ? chatActivityEnterView2.Q3 : chatActivityEnterView2.P3;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable3 = drawable;
                    Drawable drawable4 = drawable2;
                    drawable3.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable3, drawable4, recordCircle2.f, (int) (255.0f * f25));
                }
                canvas3.scale(f28, f28, f30, f31);
                canvas3.translate(f26, f27);
            }
        });
        t1Var.getRadialProgress().B = true;
        t1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
