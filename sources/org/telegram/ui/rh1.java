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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rh1 implements kh0 {
    public final org.telegram.ui.Cells.s1 a;
    public final org.telegram.ui.Components.jl0 b;
    public final float c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f;
    public final ChatActivityEnterView.RecordCircle g;
    public final int h;
    public final org.telegram.ui.Components.mi i;
    public final org.telegram.ui.ActionBar.c6 j;
    public float k;
    public float l;

    public rh1(org.telegram.ui.Cells.s1 s1Var, dk dkVar, org.telegram.ui.Components.jl0 jl0Var, org.telegram.ui.Components.mi miVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.j = c6Var;
        this.a = s1Var;
        this.i = miVar;
        this.b = jl0Var;
        s1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = dkVar.getRecordCircle();
        this.g = recordCircle;
        if (recordCircle != null) {
            this.c = recordCircle.H;
            recordCircle.I = true;
            recordCircle.J = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = s1Var.getMessageObject().stableId;
        ((ArrayList) miVar.c).add(this);
        miVar.a();
        ((ViewGroup) miVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new bg.b3(23, this, miVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new qh1(this, s1Var, miVar));
        if (s1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.co0 seekBarWaveform = s1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.n;
            if (s1Var2 != null) {
                s1Var2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.kh0
    public final void a(final Canvas canvas) {
        float y8;
        float x4;
        float f9;
        final float f10 = this.d;
        float f11 = f10 > 0.6f ? 1.0f : f10 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.g;
        org.telegram.ui.Components.mi miVar = this.i;
        float x10 = recordCircle == null ? 0.0f : (recordCircle.getX() + recordCircle.F) - miVar.getX();
        final float y10 = recordCircle == null ? 0.0f : (recordCircle.getY() + recordCircle.G) - miVar.getY();
        org.telegram.ui.Cells.s1 s1Var = this.a;
        int i10 = s1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.jl0 jl0Var = this.b;
        if (i10 != i11) {
            x4 = this.k;
            y8 = this.l;
        } else {
            y8 = (jl0Var.getY() + (s1Var.getY() + s1Var.getRadialProgress().a.centerY())) - miVar.getY();
            x4 = (jl0Var.getX() + (s1Var.getX() + s1Var.getRadialProgress().a.centerX())) - miVar.getX();
        }
        this.k = x4;
        this.l = y8;
        float interpolation = org.telegram.ui.Components.jr.f.getInterpolation(f10);
        float interpolation2 = org.telegram.ui.Components.jr.h.getInterpolation(f10);
        final float f12 = (x4 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f13 = 1.0f - interpolation;
        final float f14 = (y8 * interpolation) + (y10 * f13);
        float height = s1Var.getRadialProgress().a.height() / 2.0f;
        float f15 = (height * interpolation) + (this.c * f13);
        jl0Var.getY();
        miVar.getY();
        jl0Var.getMeasuredHeight();
        if (miVar.getMeasuredHeight() > 0) {
            miVar.getMeasuredHeight();
        }
        int i12 = s1Var.getRadialProgress().p;
        int i13 = org.telegram.ui.ActionBar.g6.cf;
        org.telegram.ui.ActionBar.c6 c6Var = this.j;
        float f16 = f11;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        Paint paint = this.e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f17 = 1.0f - f16;
            org.telegram.ui.Components.y9 y9Var = recordCircle.h;
            org.telegram.ui.Components.y9 y9Var2 = recordCircle.n;
            f9 = x10;
            float interpolation3 = org.telegram.ui.Components.jr.g.getInterpolation(recordCircle.D);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f18 = chatActivityEnterView.e4;
            float f19 = f18 > 0.7f ? 1.0f : f18 / 0.7f;
            canvas.save();
            float f20 = ((y9Var2.t * 1.4f) + 0.878f) * chatActivityEnterView.c4 * f19 * interpolation3 * f17;
            canvas.scale(f20, f20, f12, f14);
            y9Var2.a(f12, f14, canvas, y9Var2.d);
            canvas.restore();
            float f21 = ((y9Var.t * 1.4f) + 0.926f) * chatActivityEnterView.c4 * f19 * interpolation3 * f17;
            canvas.save();
            canvas.scale(f21, f21, f12, f14);
            y9Var.a(f12, f14, canvas, y9Var.d);
            canvas.restore();
        } else {
            f9 = x10;
        }
        canvas.drawCircle(f12, f14, f15, paint);
        canvas.save();
        final float f22 = f15 / height;
        canvas.scale(f22, f22, f12, f14);
        final float centerX = f12 - s1Var.getRadialProgress().a.centerX();
        final float centerY = f14 - s1Var.getRadialProgress().a.centerY();
        canvas.translate(centerX, centerY);
        s1Var.getRadialProgress().E = interpolation;
        s1Var.getRadialProgress().B = false;
        final float f23 = f9;
        s1Var.q2(canvas, interpolation, new Runnable() { // from class: org.telegram.ui.ph1
            @Override // java.lang.Runnable
            public final void run() {
                Canvas canvas2;
                float f24;
                Drawable drawable;
                rh1 rh1Var = rh1.this;
                RadialProgress2 radialProgress = rh1Var.a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = rh1Var.g;
                if (recordCircle2 != null) {
                    int i14 = (int) f23;
                    int i15 = (int) y10;
                    float f31 = 1.0f - f10;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.n4;
                    Rect rect = chatActivityEnterView2.O3;
                    Drawable drawable2 = null;
                    if (z10) {
                        if (recordCircle2.f != 1.0f) {
                            drawable2 = chatActivityEnterView2.Y0 ? chatActivityEnterView2.L3 : chatActivityEnterView2.K3;
                        }
                        drawable = chatActivityEnterView2.M3;
                        canvas2 = canvas3;
                        f24 = f31;
                        rect.set(b.v(2, i14, drawable), b.f(2, i15, drawable), b.A(2, i14, drawable), b.y(2, i15, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(b.v(2, i14, drawable2), b.f(2, i15, drawable2), b.A(2, i14, drawable2), b.y(2, i15, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f24 = f31;
                        drawable = chatActivityEnterView2.Y0 ? chatActivityEnterView2.L3 : chatActivityEnterView2.K3;
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
        s1Var.getRadialProgress().B = true;
        s1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
