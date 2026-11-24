// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class rb1 extends ib1 {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public tgb A1;
    public p8c B1;
    public p8c C1;
    public pb1 D1;
    public float E1;
    public float F1;
    public final lm G1;
    public final lm H1;
    public final lm I1;
    public final lm J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final nb1 P1;
    public final ImageView S0;
    public final ImageView T0;
    public final hb1 U0;
    public cs5 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final qb1 a1;
    public final gn b1;
    public float c1;
    public float d1;
    public long e1;
    public final Paint f1;
    public final Paint g1;
    public final fk0 h1;
    public final fk0 i1;
    public final Drawable j1;
    public float k1;
    public final lm l1;
    public final Path m1;
    public final Path n1;
    public final Paint o1;
    public final Paint p1;
    public final Paint q1;
    public final Paint r1;
    public final lm s1;
    public final RectF t1;
    public final RectF u1;
    public final RectF v1;
    public final Path w1;
    public tgb x1;
    public Path y1;
    public Paint z1;

    public rb1(Context context, FrameLayout frameLayout, cja cjaVar, FrameLayout frameLayout2, f53 f53Var, sl0 sl0Var) {
        super(context, frameLayout, cjaVar, frameLayout2, f53Var, sl0Var);
        this.W0 = true;
        byte b = 0;
        this.X0 = 0;
        j7b j7bVar = (j7b) this;
        this.a1 = new qb1(j7bVar, j7bVar);
        gn gnVar = new gn(false, true, true);
        this.b1 = gnVar;
        s33 s33Var = s33.f;
        gnVar.n(0.16f, 50L, s33Var);
        gnVar.w(gl.L(15.0f));
        gnVar.x(gl.o());
        gnVar.t("0:00.0", true, true);
        gnVar.u(-1);
        Paint paint = new Paint(1);
        this.f1 = paint;
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        fk0 fk0Var = new fk0(11, 360928);
        this.h1 = fk0Var;
        fk0 fk0Var2 = new fk0(12, 360928);
        this.i1 = fk0Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        fk0Var.a = gl.L(47.0f);
        fk0Var.b = gl.L(55.0f);
        fk0Var.b();
        fk0Var2.a = gl.L(47.0f);
        fk0Var2.b = gl.L(55.0f);
        fk0Var2.b();
        this.j1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.l1 = new lm(new nb1(j7bVar, b), 200L, s33Var, 0);
        this.m1 = new Path();
        this.n1 = new Path();
        this.o1 = new Paint(1);
        this.p1 = new Paint(1);
        this.q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        nb1 nb1Var = new nb1(j7bVar, b);
        s33 s33Var2 = s33.h;
        this.s1 = new lm(nb1Var, 350L, s33Var2);
        this.t1 = new RectF();
        this.u1 = new RectF();
        this.v1 = new RectF();
        this.w1 = new Path();
        this.G1 = new lm(this, 0L, 350L, s33Var2);
        this.H1 = new lm(new nb1(j7bVar, b), 420L, s33Var2, 0);
        this.I1 = new lm(this, 0L, 350L, s33Var2);
        this.J1 = new lm(new nb1(j7bVar, b), 350L, s33Var2, 0);
        this.P1 = new nb1(j7bVar, (byte) 1);
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(bkb.f0(1090519039, 1, gl.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(k96.M0(2131754735, null));
        addView(imageView, nme.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new x91(j7bVar, (byte) 3));
        ImageView imageView2 = new ImageView(context);
        this.T0 = imageView2;
        hb1 hb1Var = new hb1(5);
        this.U0 = hb1Var;
        imageView2.setImageDrawable(hb1Var);
        imageView2.setBackground(bkb.f0(1090519039, 1, gl.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(k96.M0(2131744350, null));
        A(86400, false);
        addView(imageView2, nme.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new b0(j7bVar, frameLayout, f53Var, (byte) 13));
    }

    public final void A(int i, boolean z) {
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                i2 = 2;
                break;
            } else if (Q1[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (this.X0 == i2) {
            return;
        }
        this.X0 = i2;
        this.U0.d(i / 3600, false, z);
    }

    public final void B() {
        if (this.Z0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
            String M0 = k96.M0(2131744258, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131744259, null);
            alertDialog$Builder.j(k96.M0(2131746128, null), new sg0(this, (byte) 26));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            TextView textView = (TextView) alertDialog$Builder.o().c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, this.a);
            }
        }
    }

    @Override // ib1
    public final int b() {
        return 36;
    }

    @Override // ib1
    public final void c(boolean z) {
        int i = (z || !this.W0) ? 8 : 0;
        ImageView imageView = this.T0;
        imageView.setVisibility(i);
        this.S0.setVisibility(z ? 8 : 0);
        if (z) {
            imageView.setVisibility(8);
        }
    }

    @Override // ib1
    public final void d(boolean z) {
        if (z) {
            return;
        }
        this.T0.setVisibility(this.W0 ? 0 : 8);
        this.S0.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r10.N1 == false) goto L66;
     */
    @Override // ib1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pb1 pb1Var;
        Drawable drawable;
        if (this.O1 && (pb1Var = this.D1) != null && pb1Var.a != null && (drawable = this.Y0) != null) {
            RectF rectF = gl.P;
            rectF.set(drawable.getBounds());
            rectF.inset(-gl.L(12.0f), -gl.L(12.0f));
            int i = 0;
            while (true) {
                if (i >= motionEvent.getPointerCount()) {
                    break;
                }
                if (!gl.P.contains(motionEvent.getX(i), motionEvent.getY(i))) {
                    i++;
                } else if (motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5) {
                    this.D1.a.switchCamera();
                    Drawable drawable2 = this.Y0;
                    if (drawable2 instanceof AnimatedVectorDrawable) {
                        ((AnimatedVectorDrawable) drawable2).start();
                    }
                }
            }
        }
        RectF rectF2 = gl.P;
        ImageView imageView = this.S0;
        rectF2.set(imageView.getX(), imageView.getY(), imageView.getX() + imageView.getMeasuredWidth(), imageView.getY() + imageView.getMeasuredHeight());
        if (!this.N1 && (this.Z0 || this.p0 || !rectF2.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.O1 && this.M1) {
                if (this.u1.contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, true);
                    this.N1 = false;
                    return true;
                }
            }
            if (this.O1) {
                if (this.t1.contains(motionEvent.getX(), motionEvent.getY()) || getBounds().contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, false);
                    this.N1 = false;
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        byte b = 2;
        qb1 qb1Var = this.a1;
        nb1 nb1Var = this.P1;
        if (action != 0) {
            if (motionEvent.getAction() == 2) {
                if (!this.K1) {
                    this.c1 = Utilities.i((this.E1 - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                    float i2 = Utilities.i((this.F1 - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                    this.d1 = i2;
                    boolean z = this.M1;
                    if (!z && !this.K1 && this.c1 >= 1.0f) {
                        this.K1 = true;
                        this.O1 = false;
                        imageView.setVisibility(4);
                        this.T0.setVisibility(4);
                        qb1Var.g = true;
                        oy8 oy8Var = qb1Var.h;
                        oy8Var.O(true, 0.0f);
                        if (qb1Var.f) {
                            oy8Var.start();
                        }
                        pb1 pb1Var2 = this.D1;
                        if (pb1Var2 != null) {
                            pb1Var2.y = true;
                            gl.r(pb1Var2.h);
                            CameraController.getInstance().stopVideoRecording(pb1Var2.a.getCameraSessionRecording(), false, false);
                            pb1Var2.a(false);
                        }
                        gl.d3(nb1Var, 800L);
                    } else if (!z && !this.K1 && i2 >= 1.0f && this.c1 < 0.4f) {
                        this.M1 = true;
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    invalidate();
                    n();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (!this.K1 && !this.M1) {
                    z(false, false);
                }
                this.N1 = false;
            }
            return this.N1;
        }
        if (this.O1) {
            this.N1 = false;
            z(false, false);
            return true;
        }
        this.N1 = true;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        j7b j7bVar = (j7b) this;
        boolean isCameraAllowed = CameraView.isCameraAllowed();
        t7b t7bVar = j7bVar.S1;
        if (!isCameraAllowed ? false : t7bVar.Y()) {
            gl.r(nb1Var);
            this.E1 = motionEvent.getX();
            this.F1 = motionEvent.getY();
            this.k1 = 0.0f;
            this.c1 = 0.0f;
            this.G1.e(true, 0.0f);
            this.H1.e(true, 0.0f);
            this.K1 = false;
            this.L1 = false;
            this.M1 = false;
            qb1Var.g = false;
            oy8 oy8Var2 = qb1Var.h;
            oy8Var2.stop();
            oy8Var2.O(true, 0.0f);
            this.O1 = true;
            this.e1 = System.currentTimeMillis();
            this.K0 = true;
            this.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            invalidate();
            n();
            pb1 pb1Var3 = new pb1(this, getContext());
            this.D1 = pb1Var3;
            pb1 pb1Var4 = t7bVar.r1;
            if (pb1Var4 != null) {
                pb1Var4.a(true);
            }
            i7b i7bVar = t7bVar.Y0;
            if (i7bVar != null) {
                i7bVar.P = true;
                i7bVar.b();
                i7b i7bVar2 = t7bVar.Y0;
                i7bVar2.m(0L);
                kob kobVar = i7bVar2.G;
                if (kobVar != null) {
                    kobVar.setProgress(0L);
                }
            }
            pb1Var3.n = new qo0(j7bVar, pb1Var3, (byte) 6);
            pb1Var3.r = new nb1(j7bVar, b);
            g7b g7bVar = t7bVar.i0;
            t7bVar.r1 = pb1Var3;
            g7bVar.addView(pb1Var3, nme.c(-1.0f, -1));
            return true;
        }
        return true;
    }

    @Override // ib1
    public int getCaptionDefaultLimit() {
        return na7.q1(this.V).k4.i1.f();
    }

    @Override // ib1
    public int getCaptionPremiumLimit() {
        return na7.q1(this.V).k4.j1.f();
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override // ib1
    public final void j(Canvas canvas, RectF rectF) {
        float f;
        float f2;
        float f3;
        Paint paint;
        float f4;
        String str;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.D1 != null) {
            float d = this.G1.d(this.K1);
            float d2 = this.I1.d(this.M1);
            if (this.e1 <= 0) {
                this.e1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin(((System.currentTimeMillis() - this.e1) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float L = rectF.left + gl.L(21.0f);
            float L2 = rectF.bottom - gl.L(20.0f);
            qb1 qb1Var = this.a1;
            qb1Var.setBounds((int) (L - gl.L(12.0f)), (int) (L2 - gl.L(12.0f)), (int) (L + gl.L(12.0f)), (int) (L2 + gl.L(12.0f)));
            qb1Var.draw(canvas3);
            int L3 = (int) ((rectF.left + gl.L(33.3f)) - (gl.L(10.0f) * d));
            int L4 = (int) ((rectF.bottom - gl.L(20.0f)) - gl.L(9.0f));
            int L5 = (int) (rectF.left + gl.L(133.3f));
            int L6 = (int) ((rectF.bottom - gl.L(20.0f)) + gl.L(9.0f));
            gn gnVar = this.b1;
            gnVar.setBounds(L3, L4, L5, L6);
            long b = this.D1.b();
            int i = (int) (b / 1000);
            int i2 = (int) ((b - (i * 1000)) / 100);
            int i3 = i / 60;
            int i4 = i % 60;
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append(":");
            sb.append(i4 < 10 ? "0" : "");
            sb.append(i4);
            sb.append(".");
            sb.append(i2);
            gnVar.t(sb.toString(), true, true);
            gnVar.C = (int) ((1.0f - d) * 255.0f);
            gnVar.draw(canvas3);
            float f5 = 1.0f - d2;
            float f6 = (1.0f - this.c1) * f5;
            Paint c = this.Q.c(1.0f);
            if (c != null) {
                f2 = 10.0f;
                paint = c;
                f = 12.0f;
                f3 = f6;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, kk7.d4, 31);
                canvas3 = canvas;
            } else {
                f = 12.0f;
                f2 = 10.0f;
                f3 = f6;
                paint = c;
            }
            if (f3 > 0.0f) {
                if (this.x1 == null) {
                    this.x1 = new tgb(k96.M0(2131745121, null), 15.0f, null);
                }
                if (this.y1 == null) {
                    Path path = new Path();
                    this.y1 = path;
                    path.moveTo(gl.L(3.83f), 0.0f);
                    this.y1.lineTo(0.0f, gl.L(5.0f));
                    this.y1.lineTo(gl.L(3.83f), gl.L(f2));
                    Paint paint2 = new Paint(1);
                    this.z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.z1.setStrokeCap(Paint.Cap.ROUND);
                    this.z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.z1.setStrokeWidth(gl.L(1.33f));
                this.x1.p = (int) ((rectF.width() - gl.L(116.0f)) - gnVar.c());
                float B = ls6.B(1.0f, this.c1, gl.L(6.0f) * sin, (rectF.centerX() - ((this.x1.j() + gl.L(11.33f)) / 2.0f)) - (gl.R1(this.c1, 1.0f, d2) * (rectF.width() / 6.0f)));
                int p1 = bkb.p1(f3, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(B, rectF.centerY() - gl.L(5.0f));
                this.z1.setColor(p1);
                canvas3.drawPath(this.y1, this.z1);
                canvas3.restore();
                str = null;
                f4 = 15.0f;
                this.x1.c(B + gl.L(11.33f), rectF.centerY(), 1.0f, p1, canvas3);
            } else {
                f4 = 15.0f;
                str = null;
            }
            if (d2 > 0.0f) {
                tgb tgbVar = this.A1;
                if (tgbVar == null) {
                    tgbVar = new tgb(k96.M0(2131752558, str), f4, gl.o());
                    this.A1 = tgbVar;
                }
                tgbVar.p = (int) ((rectF.width() - gl.L(116.0f)) - gnVar.c());
                float width = ((rectF.width() / 4.0f) * f5) + (rectF.centerX() - (this.A1.j() / 2.0f));
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, bkb.p1(d2, paint != null ? -1 : -2130706433), canvas2);
                this.u1.set(width - gl.L(f), rectF.top, this.A1.j() + width + gl.L(f), rectF.bottom);
            } else {
                canvas2 = canvas;
            }
            if (paint != null) {
                canvas2.drawRect(rectF, paint);
                canvas2.restore();
            }
            invalidate();
        }
    }

    @Override // ib1
    public final void k(Canvas canvas, RectF rectF, float f) {
        float f2;
        float f3;
        float f4;
        if (f <= 0.0f) {
            return;
        }
        boolean z = this.K1;
        lm lmVar = this.H1;
        float d = lmVar.d(z);
        boolean z2 = this.M1;
        lm lmVar2 = this.J1;
        float d2 = lmVar2.d(z2);
        float e = this.l1.e(false, this.k1);
        float f5 = 1.0f - d;
        float A = tb4.A(1.0f, this.c1, gl.L(30.0f) * e, gl.L(41.0f)) * f5 * f;
        float R1 = gl.R1(ls6.B(1.0f, d2, getWidth() * 0.35f * this.c1, rectF.right - gl.L(20.0f)), rectF.left + gl.L(20.0f), d);
        float L = rectF.bottom - gl.L(20.0f);
        boolean e2 = e66.e(360928);
        Paint paint = this.g1;
        if (e2) {
            float L2 = gl.L(47.0f);
            fk0 fk0Var = this.h1;
            fk0Var.a = L2;
            Paint paint2 = fk0Var.d;
            f2 = 0.0f;
            fk0Var.b = (gl.L(15.0f) * 0.6f) + gl.L(47.0f);
            float L3 = gl.L(50.0f);
            f3 = d2;
            fk0 fk0Var2 = this.i1;
            fk0Var2.a = L3;
            Paint paint3 = fk0Var2.d;
            f4 = f5;
            fk0Var2.b = (gl.L(12.0f) * 0.6f) + gl.L(50.0f);
            fk0Var2.e(e, 1.01f);
            fk0Var.e(e, 1.02f);
            paint3.setColor(bkb.p1(0.15f * f, paint.getColor()));
            canvas.save();
            float f6 = A / fk0Var2.a;
            canvas.scale(f6, f6, R1, L);
            fk0Var2.a(R1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(bkb.p1(0.3f * f, paint.getColor()));
            canvas.save();
            float f7 = A / fk0Var.a;
            canvas.scale(f7, f7, R1, L);
            fk0Var.a(R1, L, canvas, paint2);
            canvas.restore();
        } else {
            f2 = 0.0f;
            f3 = d2;
            f4 = f5;
        }
        float min = Math.min(A, gl.L(55.0f));
        float f8 = f * 255.0f;
        paint.setAlpha((int) f8);
        canvas.drawCircle(R1, L, min, paint);
        canvas.save();
        Path path = this.m1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(R1, L, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.j1;
        drawable.setBounds((int) (R1 - (((drawable.getIntrinsicWidth() / 2.0f) * f4) * (this.L1 ? f : 1.0f))), (int) (L - (((drawable.getIntrinsicHeight() / 2.0f) * f4) * (this.L1 ? f : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f4 * (this.L1 ? f : 1.0f)) + R1), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f4 * (this.L1 ? f : 1.0f)) + L));
        drawable.setAlpha((int) (f4 * 255.0f * (this.L1 ? f : 1.0f)));
        drawable.draw(canvas);
        if (f3 > f2) {
            float N = (gl.N(19.33f) / 2.0f) * f3 * f;
            RectF rectF2 = gl.P;
            rectF2.set(R1 - N, L - N, R1 + N, L + N);
            canvas.drawRoundRect(rectF2, gl.L(5.33f), gl.L(5.33f), this.f1);
        }
        canvas.restore();
        float f9 = lmVar.c;
        float f10 = lmVar2.c;
        float z3 = tb4.z(1.0f, f9, gl.R1(this.s1.d(this.c1 < 0.4f), f2, f10), f);
        float L4 = rectF.right - gl.L(20.0f);
        float U1 = (gl.U1(f10, gl.L(50.0f), gl.L(36.0f)) * z3) / 2.0f;
        float f11 = 1.0f - f10;
        float R12 = gl.R1(((rectF.bottom - gl.L(80.0f)) - U1) - ((gl.L(120.0f) * this.d1) * f11), rectF.bottom - gl.L(20.0f), 1.0f - z3);
        float L5 = (gl.L(36.0f) * z3) / 2.0f;
        RectF rectF3 = this.t1;
        rectF3.set(L4 - L5, R12 - U1, L5 + L4, U1 + R12);
        float U12 = gl.U1(f10, gl.L(18.0f), gl.L(14.0f));
        float L6 = gl.L(1.0f);
        float L7 = gl.L(0.66f);
        int p1 = bkb.p1(z3, TLObject.FLAG_29);
        Paint paint4 = this.p1;
        paint4.setShadowLayer(L6, 0.0f, L7, p1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, U12, U12, paint4);
        Paint c = this.S.c(z3);
        if (c == null) {
            Paint paint5 = this.o1;
            paint5.setColor(TLObject.FLAG_30);
            paint5.setAlpha((int) (64.0f * z3));
            canvas.drawRoundRect(rectF3, U12, U12, paint5);
        } else {
            canvas.drawRoundRect(rectF3, U12, U12, c);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * z3));
            canvas.drawRoundRect(rectF3, U12, U12, paint6);
        }
        canvas.save();
        canvas.scale(z3, z3, L4, R12);
        int p12 = bkb.p1(z3, -1);
        Paint paint7 = this.q1;
        paint7.setColor(p12);
        int p13 = bkb.p1(z3 * f11, -1);
        Paint paint8 = this.r1;
        paint8.setColor(p13);
        float U13 = gl.U1(f10, gl.L(15.33f), gl.L(13.0f));
        float U14 = gl.U1(f10, gl.L(12.66f), gl.L(13.0f));
        float L8 = (gl.L(4.0f) * f11) + R12;
        canvas.rotate(this.d1 * 12.0f * f11, L4, L8);
        float f12 = U13 / 2.0f;
        float f13 = U14 / 2.0f;
        float f14 = L8 - f13;
        RectF rectF4 = this.v1;
        rectF4.set(L4 - f12, f14, f12 + L4, L8 + f13);
        canvas.drawRoundRect(rectF4, gl.L(3.66f), gl.L(3.66f), paint7);
        if (f10 < 1.0f) {
            canvas.save();
            canvas.rotate(this.d1 * 12.0f * f11, L4, f14);
            canvas.translate(0.0f, f13 * f10);
            canvas.scale(f11, f11, L4, f14);
            Path path2 = this.w1;
            path2.rewind();
            float L9 = gl.L(4.33f);
            float L10 = f14 - gl.L(3.66f);
            float f15 = L4 + L9;
            path2.moveTo(f15, gl.L(3.66f) + L10);
            path2.lineTo(f15, L10);
            RectF rectF5 = gl.P;
            float f16 = L4 - L9;
            rectF5.set(f16, L10 - L9, f15, L9 + L10);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f16, (gl.R1(gl.R1(0.4f, 0.0f, this.d1), 1.0f, f10) * gl.L(3.66f)) + L10);
            paint8.setStrokeWidth(gl.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            lm lmVar3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || lmVar3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.o0) * 255.0f), 31);
                Path path3 = this.n1;
                path3.rewind();
                path3.addRoundRect(rectF, gl.L(21.0f), gl.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || lmVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((gl.L(180.0f) * f4) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || lmVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((gl.L(180.0f) * f4) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        Drawable drawable2 = this.Y0;
        if (drawable2 == null) {
            drawable2 = getContext().getDrawable(R.drawable.avd_flip);
            this.Y0 = drawable2;
        }
        drawable2.setAlpha((int) (f8 * f4));
        float timelineHeight = getTimelineHeight();
        this.Y0.setBounds(gl.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - gl.L(48.0f)), (int) (rectF.left + gl.L(40.0f)), (int) ((rectF.top - timelineHeight) - gl.L(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override // ib1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qb1 qb1Var = this.a1;
        oy8 oy8Var = qb1Var.h;
        qb1Var.f = true;
        if (qb1Var.g) {
            oy8Var.start();
        }
        oy8Var.M(qb1Var.i);
    }

    @Override // ib1, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qb1 qb1Var = this.a1;
        qb1Var.f = false;
        oy8 oy8Var = qb1Var.h;
        oy8Var.stop();
        oy8Var.M(null);
    }

    public void setAmplitude(double d) {
        this.k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z) {
        int i = z ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.S0;
        imageView.setImageResource(i);
        imageView.setContentDescription(k96.M0(z ? 2131754787 : 2131754735, null));
        this.Z0 = z;
    }

    public void setOnPeriodUpdate(p8c p8cVar) {
        this.B1 = p8cVar;
    }

    public void setOnPremiumHint(p8c p8cVar) {
        this.C1 = p8cVar;
    }

    public void setPeriod(int i) {
        A(i, true);
    }

    public void setPeriodVisible(boolean z) {
        this.W0 = z;
        this.T0.setVisibility((!z || this.p0) ? 8 : 0);
    }

    @Override // ib1
    public final void u(float f) {
        float f2 = 1.0f - f;
        this.T0.setAlpha(f2);
        this.S0.setAlpha(f2);
    }

    public final void z(boolean z, boolean z2) {
        gl.r(this.P1);
        this.L1 = true;
        this.O1 = false;
        int L = (int) ((getBounds().right - gl.L(20.0f)) - ((getWidth() * 0.35f) * this.c1));
        this.K0 = false;
        this.L0 = L;
        invalidate();
        pb1 pb1Var = this.D1;
        if (pb1Var != null) {
            if (!z) {
                if (z2) {
                    pb1Var.y = true;
                    gl.r(pb1Var.h);
                    CameraController.getInstance().stopVideoRecording(pb1Var.a.getCameraSessionRecording(), false, false);
                    pb1Var.a(false);
                } else {
                    pb1Var.c();
                }
            }
            this.D1 = null;
        }
        n();
    }
}
