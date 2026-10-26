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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sh1 implements nh0 {
    public final org.telegram.ui.Cells.s1 a;
    public final org.telegram.ui.Components.mm0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.si i;
    public final org.telegram.ui.ActionBar.u6 j;
    public float k;
    public float l;

    public sh1(org.telegram.ui.Cells.s1 s1Var, hk hkVar, org.telegram.ui.Components.mm0 mm0Var, org.telegram.ui.Components.si siVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.j = u6Var;
        this.a = s1Var;
        this.i = siVar;
        this.b = mm0Var;
        s1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = hkVar.getRecordCircle();
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
        this.h = s1Var.getMessageObject().stableId;
        ((ArrayList) siVar.c).add(this);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new bh.b0(25, this, siVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new rh1(this, s1Var, siVar));
        if (s1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.pp0 seekBarWaveform = s1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.n;
            if (s1Var2 != null) {
                s1Var2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.nh0
    public final void a(final Canvas canvas) {
        float y3;
        float x9;
        float f7;
        final float f10 = this.d;
        float f11 = f10 > 0.6f ? 1.0f : f10 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        org.telegram.ui.Components.si siVar = this.i;
        float x10 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.J) - siVar.getX();
        final float y10 = recordCircle != null ? (recordCircle.getY() + recordCircle.K) - siVar.getY() : 0.0f;
        org.telegram.ui.Cells.s1 s1Var = this.a;
        int i10 = s1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.mm0 mm0Var = this.b;
        if (i10 != i11) {
            x9 = this.k;
            y3 = this.l;
        } else {
            y3 = (mm0Var.getY() + (s1Var.getY() + s1Var.getRadialProgress().a.centerY())) - siVar.getY();
            x9 = (mm0Var.getX() + (s1Var.getX() + s1Var.getRadialProgress().a.centerX())) - siVar.getX();
        }
        this.k = x9;
        this.l = y3;
        float interpolation = org.telegram.ui.Components.ds.f.getInterpolation(f10);
        float interpolation2 = org.telegram.ui.Components.ds.h.getInterpolation(f10);
        final float f12 = (x9 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f13 = 1.0f - interpolation;
        final float f14 = (y3 * interpolation) + (y10 * f13);
        float height = s1Var.getRadialProgress().a.height() / 2.0f;
        float f15 = (height * interpolation) + (this.c * f13);
        mm0Var.getY();
        siVar.getY();
        mm0Var.getMeasuredHeight();
        if (siVar.getMeasuredHeight() > 0) {
            siVar.getMeasuredHeight();
        }
        int i12 = s1Var.getRadialProgress().p;
        int i13 = org.telegram.ui.ActionBar.y6.cf;
        org.telegram.ui.ActionBar.u6 u6Var = this.j;
        float f16 = f11;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int f17 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        Paint paint = this.e;
        paint.setColor(f17);
        if (recordCircle != null) {
            float f18 = 1.0f - f16;
            org.telegram.ui.Components.fa faVar = recordCircle.h;
            org.telegram.ui.Components.fa faVar2 = recordCircle.n;
            f7 = x10;
            float interpolation3 = org.telegram.ui.Components.ds.g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.j4;
            float f20 = f19 > 0.7f ? 1.0f : f19 / 0.7f;
            canvas.save();
            float f21 = ((faVar2.t * 1.4f) + 0.878f) * chatActivityEnterView.h4 * f20 * interpolation3 * f18;
            canvas.scale(f21, f21, f12, f14);
            faVar2.a(f12, f14, canvas, faVar2.d);
            canvas.restore();
            float f22 = ((faVar.t * 1.4f) + 0.926f) * chatActivityEnterView.h4 * f20 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f22, f22, f12, f14);
            faVar.a(f12, f14, canvas, faVar.d);
            canvas.restore();
        } else {
            f7 = x10;
        }
        canvas.drawCircle(f12, f14, f15, paint);
        canvas.save();
        final float f23 = f15 / height;
        canvas.scale(f23, f23, f12, f14);
        final float centerX = f12 - s1Var.getRadialProgress().a.centerX();
        final float centerY = f14 - s1Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        s1Var.getRadialProgress().E = interpolation;
        s1Var.getRadialProgress().B = false;
        final float f24 = f7;
        s1Var.q2(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.qh1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f25;
                Drawable drawable;
                sh1 sh1Var = sh1.this;
                RadialProgress2 radialProgress = sh1Var.a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = sh1Var.g;
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
                        rect.set(d3.x(2, i14, drawable), d3.i(2, i15, drawable), d3.C(2, i14, drawable), d3.B(2, i15, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(d3.x(2, i14, drawable2), d3.i(2, i15, drawable2), d3.C(2, i14, drawable2), d3.B(2, i15, drawable2));
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
        s1Var.getRadialProgress().B = true;
        s1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
