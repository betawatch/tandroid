package qh;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class r5 extends View implements c2 {
    public final org.telegram.ui.Components.z5 A0;
    public final Paint B;
    public final org.telegram.ui.Components.z5 B0;
    public final Paint C;
    public final org.telegram.ui.Components.z5 C0;
    public final Paint D;
    public final org.telegram.ui.Components.z5 D0;
    public final Matrix E;
    public float E0;
    public final RadialGradient F;
    public final org.telegram.ui.Components.z5 F0;
    public final rc G;
    public final org.telegram.ui.Components.z5 G0;
    public final rc H;
    public final org.telegram.ui.Components.z5 H0;
    public final rc I;
    public final o5 I0;
    public float J;
    public final o5 J0;
    public final org.telegram.ui.Components.z5 K;
    public final Path K0;
    public boolean L;
    public final Path L0;
    public final org.telegram.ui.Components.z5 M;
    public final PointF M0;
    public long N;
    public final PointF N0;
    public long O;
    public final PointF O0;
    public final Path P;
    public final PointF P0;
    public final PointF Q;
    public final PointF Q0;
    public final PointF R;
    public final PointF R0;
    public final PointF S;
    public final PointF S0;
    public final q5 T;
    public final PointF T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public boolean W;
    public p5 a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final pq c;
    public boolean c0;
    public final Drawable d;
    public float d0;
    public final Drawable e;
    public final org.telegram.ui.Components.z5 e0;
    public final Drawable f;
    public float f0;
    public float g0;
    public final Drawable h;
    public float h0;
    public float i0;
    public final org.telegram.ui.Components.z5 j0;
    public float k0;
    public boolean l0;
    public final org.telegram.ui.Components.z5 m0;
    public final Drawable n;
    public final org.telegram.ui.Components.z5 n0;
    public boolean o0;
    public final float[] p0;
    public final org.telegram.ui.Components.z5 q0;
    public final Paint r;
    public boolean r0;
    public final Paint s;
    public long s0;
    public boolean t0;
    public boolean u0;
    public final Paint v;
    public float v0;
    public final Paint w;
    public boolean w0;
    public final Paint x;
    public boolean x0;
    public final Paint y;
    public final org.telegram.ui.Components.z5 y0;
    public final org.telegram.ui.Components.z5 z0;

    public r5(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.b = imageReceiver;
        this.r = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.w = paint3;
        Paint paint4 = new Paint(1);
        this.x = paint4;
        Paint paint5 = new Paint(1);
        this.y = paint5;
        Paint paint6 = new Paint(1);
        this.B = paint6;
        Paint paint7 = new Paint(1);
        this.C = paint7;
        Paint paint8 = new Paint(1);
        this.D = paint8;
        Matrix matrix = new Matrix();
        this.E = matrix;
        this.G = new rc(this);
        this.H = new rc(this);
        this.I = new rc(this);
        pr prVar = pr.h;
        this.K = new org.telegram.ui.Components.z5(this, 0L, 310L, prVar);
        this.M = new org.telegram.ui.Components.z5(this, 0L, 330L, prVar);
        this.P = new Path();
        this.Q = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.R = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.S = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.e0 = new org.telegram.ui.Components.z5(this, 0L, 200L, pr.f);
        this.j0 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.k0 = -1.0f;
        this.l0 = true;
        this.m0 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.n0 = new org.telegram.ui.Components.z5(this, 0L, 850L, prVar);
        this.p0 = new float[2];
        this.q0 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.y0 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.z0 = new org.telegram.ui.Components.z5(this, 0L, 650L, prVar);
        this.A0 = new org.telegram.ui.Components.z5(this, 0L, 160L, pr.i);
        this.B0 = new org.telegram.ui.Components.z5(this, 0L, 750L, prVar);
        this.C0 = new org.telegram.ui.Components.z5(this, 0L, 650L, prVar);
        this.D0 = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.F0 = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.G0 = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.H0 = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.I0 = new o5(this, 2);
        this.J0 = new o5(this, 3);
        this.K0 = new Path();
        this.L0 = new Path();
        this.M0 = new PointF();
        this.N0 = new PointF();
        this.O0 = new PointF();
        this.P0 = new PointF();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        setWillNotDraw(false);
        q5 q5Var = new q5(this, this);
        this.T = q5Var;
        r0.j0.k(this, q5Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(radialGradient);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-577231);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint8.setStyle(style);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setStrokeCap(cap);
        if (Build.VERSION.SDK_INT >= 29) {
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.setParentView(this);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        Drawable mutate = activity.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        pq pqVar = new pq(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.c = pqVar;
        pqVar.w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        pqVar.e = dp;
        pqVar.f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f10, float f11, double d, float f12, PointF pointF) {
        double d10 = f12;
        pointF.x = (float) ((Math.cos(d) * d10) + f10);
        pointF.y = (float) ((Math.sin(d) * d10) + f11);
    }

    public static void f(Drawable drawable, float f10, float f11) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f10 - max), (int) (f11 - max), (int) (f10 + max), (int) (f11 + max));
    }

    public final boolean b() {
        return this.E0 >= 1.0f;
    }

    public final boolean c(float f10, float f11, float f12, float f13, float f14, boolean z4) {
        return this.o0 ? (!z4 || f13 - f11 <= ((float) AndroidUtilities.dp(100.0f))) && Math.abs(f12 - f10) <= f14 : k7.o6.a(f10, f11, f12, f13) <= f14;
    }

    public final void d(float f10) {
        this.K.g = f10 > 180.0f ? 620L : 310L;
        this.J += f10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        q5 q5Var = this.T;
        if (q5Var == null || !q5Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(float f10, boolean z4) {
        if (Math.abs(f10 - this.E0) < 0.01f) {
            return;
        }
        this.E0 = f10;
        if (!z4) {
            this.F0.f(f10 > 0.0f && !this.o0, true);
            this.G0.d(f10, true);
        }
        invalidate();
    }

    public final void g(boolean z4) {
        this.r0 = false;
        if (!z4) {
            org.telegram.ui.Components.z5 z5Var = this.q0;
            z5Var.getClass();
            z5Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        p5 p5Var = this.a;
        ImageReceiver imageReceiver = this.b;
        if (p5Var != null) {
            p5Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().w.b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((s6) arrayList2.get(0)).O0 != null) {
                this.b.setImage(ImageLocation.getForPath(((s6) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.c, 0L, null, null, 0);
                return;
            }
        }
        MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
        MediaController.PhotoEntry photoEntry = (albumEntry == null || (arrayList = albumEntry.photos) == null || arrayList.isEmpty()) ? null : albumEntry.photos.get(0);
        if (photoEntry != null && (str = photoEntry.thumbPath) != null) {
            this.b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.c, 0L, null, null, 0);
            return;
        }
        if (photoEntry == null || photoEntry.path == null) {
            imageReceiver.setImageBitmap(this.c);
            return;
        }
        if (photoEntry.isVideo) {
            this.b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.c, 0L, null, null, 0);
            return;
        }
        imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
        this.b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.c, 0L, null, null, 0);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        char c3;
        float f15;
        float f16;
        Canvas canvas2;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        RectF rectF;
        Paint paint;
        float f23;
        RectF rectF2;
        float f24;
        float f25;
        RectF rectF3;
        Canvas canvas3;
        float f26;
        float f27;
        float f28;
        org.telegram.ui.Components.z5 z5Var;
        rc rcVar;
        float f29;
        int i10;
        float f30;
        float f31;
        float f32;
        double d;
        double d10;
        float d11 = this.m0.d(this.o0 ? 1.0f : 0.0f, false);
        float d12 = this.n0.d(this.o0 ? 1.0f : 0.0f, false);
        float f33 = this.k0;
        if (f33 < 0.0f) {
            f33 = this.j0.d(this.l0 ? 1.0f : 0.0f, false);
        }
        float max = Math.max(d11, f33);
        float d13 = this.y0.d(this.t0 ? 1.0f : 0.0f, false);
        float abs = Math.abs(this.v0 - this.f0);
        float dp = AndroidUtilities.dp(64.0f);
        rc rcVar2 = this.G;
        float d14 = this.z0.d((abs >= dp || !(this.o0 || rcVar2.h)) ? 0.0f : 1.0f, false) * d13;
        float d15 = this.A0.d(Math.abs(this.v0 - this.f0) < ((float) AndroidUtilities.dp(64.0f)) ? 1.0f : 0.0f, false) * d13;
        float clamp = Utilities.clamp((this.v0 - this.f0) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float clamp2 = Utilities.clamp((this.v0 - this.f0) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        float d16 = this.C0.d(Math.min(Math.abs(this.v0 - this.i0), Math.abs(this.v0 - this.h0)) < ((float) AndroidUtilities.dp(16.0f)) ? 1.0f : 0.0f, false) * d13;
        float f34 = 1.0f - d11;
        float e6 = this.F0.e(this.E0 > 0.0f) * f34;
        float d17 = this.G0.d(this.E0, false);
        float e10 = this.H0.e(b());
        float f35 = this.w0 ? d11 * max * d13 : 0.0f;
        if (f35 > 0.0f) {
            f15 = 1.0f;
            float dp2 = this.f0 - AndroidUtilities.dp(50.0f);
            f16 = 0.0f;
            float dp3 = this.f0 + AndroidUtilities.dp(50.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            Paint paint2 = this.B;
            paint2.setStrokeWidth(dp4);
            float dp5 = AndroidUtilities.dp(2.0f);
            Paint paint3 = this.C;
            paint3.setStrokeWidth(dp5);
            f12 = e6;
            float f36 = f35;
            f14 = d12;
            f11 = d16;
            f10 = d15;
            c3 = 1;
            f13 = e10;
            canvas.drawLine(dp3, this.g0, AndroidUtilities.lerp(dp3, this.i0 - AndroidUtilities.dp(30.0f), f35), this.g0, paint3);
            canvas.drawLine(dp3, this.g0, AndroidUtilities.lerp(dp3, this.i0 - AndroidUtilities.dp(30.0f), f36), this.g0, paint2);
            canvas.drawLine(dp2, this.g0, AndroidUtilities.lerp(dp2, this.h0 + AndroidUtilities.dp(30.0f), f36), this.g0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(dp2, this.g0, AndroidUtilities.lerp(dp2, this.h0 + AndroidUtilities.dp(30.0f), f36), this.g0, paint2);
        } else {
            f10 = d15;
            f11 = d16;
            f12 = e6;
            f13 = e10;
            f14 = d12;
            c3 = 1;
            f15 = 1.0f;
            f16 = 0.0f;
            canvas2 = canvas;
        }
        float f37 = this.f0;
        float lerp = AndroidUtilities.lerp(f37, this.B0.d((AndroidUtilities.dp(4.0f) * clamp) + f37, false), d14);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), d11), AndroidUtilities.dp(32.0f) - (Math.abs(clamp2) * AndroidUtilities.dp(4.0f)), d14);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), d11), AndroidUtilities.dp(32.0f), d14);
        float lerp4 = AndroidUtilities.lerp(rcVar2.a(this.l0 ? 0.0f : 0.2f), (this.e0.d(this.d0, false) * 0.2f) + f15, d11);
        RectF rectF4 = AndroidUtilities.rectTmp;
        float f38 = lerp - lerp2;
        float f39 = this.g0;
        float f40 = lerp + lerp2;
        rectF4.set(f38, f39 - lerp2, f40, f39 + lerp2);
        float f41 = f15 - f13;
        int d18 = i0.a.d(max * f41, -1, -577231);
        Paint paint4 = this.r;
        paint4.setColor(d18);
        if (f13 > f16) {
            canvas2.save();
            canvas2.scale(lerp4, lerp4, this.f0, this.g0);
            paint4.setAlpha((int) (f41 * 255.0f));
            canvas2.drawRoundRect(rectF4, lerp3, lerp3, paint4);
            canvas2.restore();
            f18 = f40;
            f19 = d11;
            f21 = f38;
            f17 = f41;
            f22 = lerp4;
            rectF = rectF4;
            f23 = max;
            f20 = d13;
            paint = paint4;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f17 = f41;
            f18 = f40;
            f19 = d11;
            f20 = d13;
            f21 = f38;
            f22 = lerp4;
            rectF = rectF4;
            paint = paint4;
            f23 = max;
            canvas2.save();
        }
        canvas2.scale(f22, f22, this.f0, this.g0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, lerp3, lerp3, paint);
        if (f13 > f16) {
            float dp6 = AndroidUtilities.dp(4.0f);
            Paint paint5 = this.D;
            paint5.setStrokeWidth(dp6);
            Path path = this.P;
            path.rewind();
            PointF pointF = this.Q;
            f25 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f42 = pointF.x;
            PointF pointF2 = this.R;
            float f43 = f13 / 0.3f;
            rectF2 = rectF;
            f24 = lerp3;
            path.lineTo(AndroidUtilities.lerp(f42, pointF2.x, Utilities.clamp(f43, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f43, 1.0f, 0.0f)));
            if (f13 > 0.3f) {
                float f44 = pointF2.x;
                PointF pointF3 = this.S;
                float f45 = (f13 - 0.3f) / 0.7f;
                path.lineTo(AndroidUtilities.lerp(f44, pointF3.x, Utilities.clamp(f45, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f45, 1.0f, 0.0f)));
            }
            canvas2.translate(this.f0, this.g0);
            canvas2.drawPath(path, paint5);
        } else {
            rectF2 = rectF;
            f24 = lerp3;
            f25 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f22, 1.0f);
        canvas2.scale(max2, max2, this.f0, this.g0);
        float max3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - d14) * AndroidUtilities.dp(5.0f) * f12) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), d14) + lerp2);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f12);
        float lerp6 = AndroidUtilities.lerp(max3, (lerp2 - lerp5) - AndroidUtilities.dp(4.0f), f13);
        float f46 = this.f0;
        float f47 = this.g0;
        RectF rectF5 = rectF2;
        rectF5.set(f46 - lerp6, f47 - lerp6, f46 + lerp6, f47 + lerp6);
        Paint paint6 = this.s;
        paint6.setStrokeWidth(lerp5);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f12) * 255.0f * f17));
        canvas2.drawCircle(this.f0, this.g0, lerp6, paint6);
        if ((d17 > 0.0f) && ((f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1)) > 0)) {
            paint6.setAlpha(255);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, d17 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.N;
        float f48 = this.o0 ? 0.0f : 1.0f - f14;
        long j10 = this.a != null ? 177000L : 60000L;
        float min = Math.min((currentTimeMillis / 60000) * 360.0f, 360.0f);
        float e11 = this.q0.e(this.r0);
        Paint paint7 = this.v;
        paint7.setStrokeWidth(lerp5);
        paint7.setAlpha((int) (Math.max(e11 * f25, 1.0f - f48) * 255.0f));
        if (e11 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            tp.a(this.p0, (SystemClock.elapsedRealtime() - this.s0) % 5400);
            invalidate();
            float[] fArr = this.p0;
            float f49 = fArr[0];
            float f50 = fArr[c3];
            float f51 = (f49 + f50) / 2.0f;
            float abs2 = Math.abs(f50 - f49) / 2.0f;
            if (this.r0) {
                float f52 = min / 2.0f;
                f51 = AndroidUtilities.lerp((-90.0f) + f52, f51, e11);
                abs2 = AndroidUtilities.lerp(f52, abs2, e11);
            }
            float f53 = f51 - abs2;
            float f54 = abs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f53, f54, false, paint7);
        }
        if (this.o0) {
            invalidate();
            long j11 = currentTimeMillis / 1000;
            if (j11 != this.O / 1000) {
                ((y8) this.a).a.G0.a(j11, true);
            }
            if (j10 > 0 && currentTimeMillis >= j10) {
                post(new o5(this, 0));
            }
            this.O = currentTimeMillis;
        }
        canvas3.restore();
        boolean z4 = this.x0;
        rc rcVar3 = this.I;
        if (z4) {
            float a2 = rcVar3.a(0.2f) * f19;
            if (a2 > 0.0f) {
                canvas3.save();
                canvas3.scale(a2, a2, this.h0, this.g0);
                canvas3.drawCircle(this.h0, this.g0, AndroidUtilities.dp(22.0f), this.w);
                canvas3.rotate(-getRotation(), this.h0, this.g0);
                this.f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a10 = rcVar3.a(0.2f) * f34 * f17;
        if (a10 > 0.0f) {
            canvas3.save();
            canvas3.scale(a10, a10, this.h0, this.g0);
            canvas3.rotate(-getRotation(), this.h0, this.g0);
            this.b.draw(canvas3);
            canvas3.restore();
        }
        float d19 = this.M.d(this.L ? 1.0f : 0.0f, false);
        Paint paint8 = this.x;
        org.telegram.ui.Components.z5 z5Var2 = this.K;
        rc rcVar4 = this.H;
        if (d19 > 0.0f) {
            canvas3.save();
            float a11 = rcVar4.a(0.2f) * d19 * f17;
            canvas3.scale(a11, a11, this.i0, this.g0);
            canvas3.rotate(z5Var2.d(this.J, false) - getRotation(), this.i0, this.g0);
            canvas3.drawCircle(this.i0, this.g0, AndroidUtilities.dp(22.0f), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
        }
        if (d19 < 1.0f) {
            canvas3.save();
            f26 = f17;
            float y10 = org.telegram.messenger.y3.y(1.0f, d19, rcVar4.a(0.2f), f26);
            canvas3.scale(y10, y10, this.i0, this.g0);
            canvas3.rotate(z5Var2.d(this.J, false) - getRotation(), this.i0, this.g0);
            canvas3.drawCircle(this.i0, this.g0, AndroidUtilities.dp(22.0f), this.w);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f26 = f17;
        }
        if (!this.w0 || b()) {
            f27 = 0.0f;
        } else {
            float f55 = f11;
            f27 = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(clamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), f55), Math.max(f55, d14)) * f20 * f23 * f19;
        }
        float d20 = this.D0.d((this.w0 || !this.o0) ? 0.0f : 1.0f, false);
        int i11 = (f27 > 0.0f ? 1 : (f27 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            Paint paint9 = this.y;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.v0, this.g0, f27, paint9);
            float f56 = this.v0;
            float abs3 = 1.0f - ((Math.abs(clamp2) * f20) / 1.3f);
            f31 = 22.0f;
            float clamp3 = Utilities.clamp(abs3, 1.0f, 0.0f);
            float abs4 = Math.abs(lerp - f56);
            if (abs4 >= lerp2 + (f27 * 2.0f) || clamp3 >= 0.6f) {
                f28 = f27;
                z5Var = z5Var2;
                rcVar = rcVar4;
                f29 = d20;
                i10 = i11;
                f30 = f26;
            } else {
                float f57 = lerp2 + f27;
                if (abs4 < f57) {
                    float f58 = lerp2 * lerp2;
                    float f59 = abs4 * abs4;
                    float f60 = f27 * f27;
                    f32 = f27;
                    f29 = d20;
                    i10 = i11;
                    double acos = Math.acos(((f58 + f59) - f60) / ((lerp2 * 2.0f) * abs4));
                    d10 = Math.acos(((f60 + f59) - f58) / (r15 * abs4));
                    d = acos;
                } else {
                    f32 = f27;
                    f29 = d20;
                    i10 = i11;
                    d = 0.0d;
                    d10 = 0.0d;
                }
                double d21 = f56 > lerp ? 0.0d : 3.141592653589793d;
                double d22 = d;
                double acos2 = (float) Math.acos((lerp2 - f32) / abs4);
                double d23 = acos2 - d22;
                double d24 = clamp3;
                double d25 = d23 * d24;
                double d26 = d21 + d22 + d25;
                double d27 = (d21 - d22) - d25;
                double d28 = ((3.141592653589793d - d10) - acos2) * d24;
                double d29 = ((d21 + 3.141592653589793d) - d10) - d28;
                double d30 = (d21 - 3.141592653589793d) + d10 + d28;
                float f61 = this.g0;
                PointF pointF4 = this.M0;
                a(lerp, f61, d26, lerp2, pointF4);
                float f62 = this.g0;
                PointF pointF5 = this.N0;
                a(lerp, f62, d27, lerp2, pointF5);
                float f63 = this.g0;
                PointF pointF6 = this.O0;
                float f64 = f32;
                a(f56, f63, d29, f64, pointF6);
                float f65 = this.g0;
                PointF pointF7 = this.P0;
                a(f56, f65, d30, f64, pointF7);
                f28 = f64;
                f30 = f26;
                z5Var = z5Var2;
                rcVar = rcVar4;
                float min2 = Math.min(1.0f, (abs4 * 2.0f) / f57) * Math.min(clamp3 * 2.4f, k7.o6.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f57);
                float f66 = lerp2 * min2;
                float f67 = f28 * min2;
                a(pointF4.x, pointF4.y, d26 - 1.5707963705062866d, f66, this.Q0);
                a(pointF5.x, pointF5.y, d27 + 1.5707963705062866d, f66, this.R0);
                a(pointF6.x, pointF6.y, d29 + 1.5707963705062866d, f67, this.S0);
                a(pointF7.x, pointF7.y, d30 - 1.5707963705062866d, f67, this.T0);
                float f68 = f19;
                float z10 = e2.c.z(f20, f23, f68, f10);
                if (z10 > 0.0f) {
                    Path path2 = this.K0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.Q0;
                    float f69 = pointF8.x;
                    float f70 = pointF8.y;
                    f19 = f68;
                    PointF pointF9 = this.S0;
                    path2.cubicTo(f69, f70, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.T0;
                    float f71 = pointF10.x;
                    float f72 = pointF10.y;
                    PointF pointF11 = this.R0;
                    path2.cubicTo(f71, f72, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (z10 * 255.0f));
                    canvas3.drawPath(path2, paint9);
                    float f73 = this.g0;
                    rectF3.set(f21, f73 - lerp2, f18, f73 + lerp2);
                    float f74 = f24;
                    canvas3.drawRoundRect(rectF3, f74, f74, paint9);
                } else {
                    f19 = f68;
                }
            }
        } else {
            f28 = f27;
            z5Var = z5Var2;
            rcVar = rcVar4;
            f29 = d20;
            i10 = i11;
            f30 = f26;
            f31 = 22.0f;
        }
        if (i10 > 0 || f29 > 0.0f) {
            float a12 = rcVar3.a(0.2f) * f19 * f30;
            canvas3.save();
            Path path3 = this.L0;
            path3.rewind();
            if (i10 > 0) {
                path3.addCircle(this.v0, this.g0, f28, Path.Direction.CW);
            }
            if (f29 > 0.0f && this.x0) {
                path3.addCircle(this.h0, this.g0, f29 * AndroidUtilities.dp(f31) * a12, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.x0) {
                canvas3.save();
                canvas3.scale(a12, a12, this.h0, this.g0);
                canvas3.drawCircle(this.h0, this.g0, AndroidUtilities.dp(f31), paint8);
                canvas3.rotate(-getRotation(), this.h0, this.g0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a13 = rcVar.a(0.2f) * f30;
            canvas3.save();
            canvas3.scale(a13, a13, this.i0, this.g0);
            canvas3.rotate(z5Var.d(this.J, false) - getRotation(), this.i0, this.g0);
            canvas3.drawCircle(this.i0, this.g0, AndroidUtilities.dp(f31), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        q5 q5Var = this.T;
        if (q5Var == null) {
            return;
        }
        boolean b10 = b();
        boolean z11 = this.U;
        boolean z12 = this.o0;
        if (z11 == z12 && this.V == b10 && this.W == this.L && this.a0 == this.l0 && this.b0 == this.r0 && this.c0 == this.x0) {
            return;
        }
        this.U = z12;
        this.V = b10;
        this.W = this.L;
        this.a0 = this.l0;
        this.b0 = this.r0;
        this.c0 = this.x0;
        q5Var.i();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f10 = size;
        this.f0 = f10 / 2.0f;
        this.g0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f10 * 0.35f);
        float f11 = this.f0;
        this.h0 = f11 - min;
        float f12 = f11 + min;
        this.i0 = f12;
        float f13 = this.g0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f12 - dp2), (int) (f13 - dp2), (int) (f12 + dp2), (int) (f13 + dp2));
        float f14 = this.i0;
        float f15 = this.g0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.e.setBounds((int) (f14 - dp3), (int) (f15 - dp3), (int) (f14 + dp3), (int) (f15 + dp3));
        f(this.f, this.h0, this.g0);
        f(this.h, this.h0, this.g0);
        f(this.n, this.h0, this.g0);
        this.b.setImageCoords(this.h0 - AndroidUtilities.dp(20.0f), this.g0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.E;
        matrix.reset();
        matrix.postTranslate(this.f0, this.g0);
        this.F.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        q5 q5Var = this.T;
        if (q5Var != null) {
            q5Var.i();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.i0, this.h0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean c3 = c(clamp, y10, this.i0, this.g0, AndroidUtilities.dp(7.0f), true);
        boolean z4 = this.r0;
        rc rcVar = this.I;
        rc rcVar2 = this.G;
        rc rcVar3 = this.H;
        boolean z10 = true;
        if (z4) {
            rcVar2.c(false);
            rcVar3.c(false);
            rcVar.c(false);
        } else if (action == 0 || this.t0) {
            rcVar2.c(c(clamp, y10, this.f0, this.g0, AndroidUtilities.dp(60.0f), false));
            rcVar3.c(c(clamp, y10, this.i0, this.g0, (float) AndroidUtilities.dp(30.0f), true) && !b());
            rcVar.c(c(clamp, y10, this.h0, this.g0, (float) AndroidUtilities.dp(30.0f), false) && !b());
        }
        o5 o5Var = this.J0;
        o5 o5Var2 = this.I0;
        if (action == 0) {
            this.t0 = true;
            this.u0 = rcVar2.h || rcVar3.h;
            System.currentTimeMillis();
            this.v0 = clamp;
            if (Math.abs(clamp - this.f0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(o5Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (rcVar3.h) {
                AndroidUtilities.runOnUIThread(o5Var, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.t0) {
                    this.v0 = Utilities.clamp(clamp, this.i0, this.h0);
                    invalidate();
                    if (this.o0 && !this.U0 && c3) {
                        d(180.0f);
                        ((y8) this.a).b();
                    }
                    if (this.o0 && this.w0) {
                        float clamp2 = Utilities.clamp(((this.g0 - AndroidUtilities.dp(48.0f)) - y10) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                        ca caVar = ((y8) this.a).a;
                        caVar.S0.b(clamp2, true);
                        caVar.j0(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.t0) {
                    this.t0 = false;
                    this.u0 = false;
                    AndroidUtilities.cancelRunOnUIThread(o5Var2);
                    AndroidUtilities.cancelRunOnUIThread(o5Var);
                    boolean z11 = this.o0;
                    if (!z11 && rcVar.h) {
                        ca caVar2 = ((y8) this.a).a;
                        if (caVar2.c0 == 0 && !caVar2.M1 && !caVar2.N1 && ca.b(caVar2)) {
                            caVar2.f(true);
                        }
                    } else if (z11 && this.w0) {
                        if (rcVar.h) {
                            this.w0 = false;
                            this.D0.d(1.0f, true);
                            e3 e3Var = ((y8) this.a).a.Q0;
                            e3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                            e3Var.invalidate();
                        } else {
                            this.o0 = false;
                            this.s0 = SystemClock.elapsedRealtime();
                            this.r0 = true;
                            ((y8) this.a).d(false);
                        }
                    } else if (rcVar2.h) {
                        if (b()) {
                            ((y8) this.a).a();
                        } else if (!this.l0 && !this.o0 && !this.w0) {
                            ((y8) this.a).c();
                        } else if (this.o0) {
                            this.o0 = false;
                            this.s0 = SystemClock.elapsedRealtime();
                            this.r0 = true;
                            ((y8) this.a).d(false);
                        } else if (ca.d(((y8) this.a).a)) {
                            this.O = 0L;
                            this.N = System.currentTimeMillis();
                            this.x0 = false;
                            ((y8) this.a).e(new o5(this, 1), false);
                        }
                    }
                    this.w0 = false;
                    if (rcVar3.h) {
                        d(180.0f);
                        ((y8) this.a).b();
                    }
                    rcVar2.c(false);
                    rcVar3.c(false);
                    rcVar.c(false);
                    invalidate();
                }
                return false;
            }
            z10 = false;
        }
        this.U0 = c3;
        return z10;
    }

    public void setDelegate(p5 p5Var) {
        this.a = p5Var;
    }

    public void setDual(boolean z4) {
        if (z4 != this.L) {
            this.L = z4;
            invalidate();
        }
    }

    @Override // qh.c2
    public void setInvert(float f10) {
        this.s.setColor(i0.a.d(f10, -1, -16777216));
        this.w.setColor(i0.a.d(f10, 1677721600, 369098752));
        this.B.setColor(i0.a.d(f10, 1493172223, 285212671));
        this.C.setColor(i0.a.d(f10, 402653184, 805306368));
        int d = i0.a.d(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), mode));
    }
}
