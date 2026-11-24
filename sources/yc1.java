// default package

import android.app.Activity;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class yc1 extends pc1 {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public uib A1;
    public qac B1;
    public qac C1;
    public wc1 D1;
    public float E1;
    public float F1;
    public final ln G1;
    public final ln H1;
    public final ln I1;
    public final ln J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final uc1 P1;
    public final ImageView S0;
    public final ImageView T0;
    public final oc1 U0;
    public bu5 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final xc1 a1;
    public final ho b1;
    public float c1;
    public float d1;
    public long e1;
    public final Paint f1;
    public final Paint g1;
    public final fl0 h1;
    public final fl0 i1;
    public final Drawable j1;
    public float k1;
    public final ln l1;
    public final Path m1;
    public final Path n1;
    public final Paint o1;
    public final Paint p1;
    public final Paint q1;
    public final Paint r1;
    public final ln s1;
    public final RectF t1;
    public final RectF u1;
    public final RectF v1;
    public final Path w1;
    public uib x1;
    public Path y1;
    public Paint z1;

    public yc1(Activity activity, FrameLayout frameLayout, ela elaVar, FrameLayout frameLayout2, r63 r63Var, sm0 sm0Var) {
        super(activity, frameLayout, elaVar, frameLayout2, r63Var, sm0Var);
        this.W0 = true;
        byte b = 0;
        this.X0 = 0;
        l9b l9bVar = (l9b) this;
        this.a1 = new xc1(l9bVar, l9bVar);
        ho hoVar = new ho(false, true, true);
        this.b1 = hoVar;
        d53 d53Var = d53.f;
        hoVar.n(0.16f, 50L, d53Var);
        hoVar.w(gm.L(15.0f));
        hoVar.x(gm.o());
        hoVar.t("0:00.0", true, true);
        hoVar.u(-1);
        Paint paint = new Paint(1);
        this.f1 = paint;
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        fl0 fl0Var = new fl0(11, 360928);
        this.h1 = fl0Var;
        fl0 fl0Var2 = new fl0(12, 360928);
        this.i1 = fl0Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        fl0Var.a = gm.L(47.0f);
        fl0Var.b = gm.L(55.0f);
        fl0Var.b();
        fl0Var2.a = gm.L(47.0f);
        fl0Var2.b = gm.L(55.0f);
        fl0Var2.b();
        this.j1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.l1 = new ln(new uc1(l9bVar, b), 200L, d53Var, 0);
        this.m1 = new Path();
        this.n1 = new Path();
        this.o1 = new Paint(1);
        this.p1 = new Paint(1);
        this.q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        uc1 uc1Var = new uc1(l9bVar, b);
        d53 d53Var2 = d53.h;
        this.s1 = new ln(uc1Var, 350L, d53Var2);
        this.t1 = new RectF();
        this.u1 = new RectF();
        this.v1 = new RectF();
        this.w1 = new Path();
        this.G1 = new ln(this, 0L, 350L, d53Var2);
        this.H1 = new ln(new uc1(l9bVar, b), 420L, d53Var2, 0);
        this.I1 = new ln(this, 0L, 350L, d53Var2);
        this.J1 = new ln(new uc1(l9bVar, b), 350L, d53Var2, 0);
        this.P1 = new uc1(l9bVar, (byte) 1);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(cmb.f0(1090519039, 1, gm.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(jb6.M0(2131754735, null));
        addView(imageView, qoe.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new k81(l9bVar, (byte) 6));
        ImageView imageView2 = new ImageView(activity);
        this.T0 = imageView2;
        oc1 oc1Var = new oc1(5);
        this.U0 = oc1Var;
        imageView2.setImageDrawable(oc1Var);
        imageView2.setBackground(cmb.f0(1090519039, 1, gm.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(jb6.M0(2131744276, null));
        A(86400, false);
        addView(imageView2, qoe.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new b0(l9bVar, frameLayout, r63Var, (byte) 13));
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
            String M0 = jb6.M0(2131744184, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131744185, null);
            alertDialog$Builder.j(jb6.M0(2131746054, null), new xg0(this, (byte) 29));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            TextView textView = (TextView) alertDialog$Builder.o().c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, this.a);
            }
        }
    }

    @Override // pc1
    public final int b() {
        return 36;
    }

    @Override // pc1
    public final void c(boolean z) {
        int i = (z || !this.W0) ? 8 : 0;
        ImageView imageView = this.T0;
        imageView.setVisibility(i);
        this.S0.setVisibility(z ? 8 : 0);
        if (z) {
            imageView.setVisibility(8);
        }
    }

    @Override // pc1
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
    @Override // pc1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wc1 wc1Var;
        Drawable drawable;
        if (this.O1 && (wc1Var = this.D1) != null && wc1Var.a != null && (drawable = this.Y0) != null) {
            RectF rectF = gm.P;
            rectF.set(drawable.getBounds());
            rectF.inset(-gm.L(12.0f), -gm.L(12.0f));
            int i = 0;
            while (true) {
                if (i >= motionEvent.getPointerCount()) {
                    break;
                }
                if (!gm.P.contains(motionEvent.getX(i), motionEvent.getY(i))) {
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
        RectF rectF2 = gm.P;
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
        xc1 xc1Var = this.a1;
        uc1 uc1Var = this.P1;
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
                        xc1Var.g = true;
                        p09 p09Var = xc1Var.h;
                        p09Var.O(true, 0.0f);
                        if (xc1Var.f) {
                            p09Var.start();
                        }
                        wc1 wc1Var2 = this.D1;
                        if (wc1Var2 != null) {
                            wc1Var2.y = true;
                            gm.r(wc1Var2.h);
                            CameraController.getInstance().stopVideoRecording(wc1Var2.a.getCameraSessionRecording(), false, false);
                            wc1Var2.a(false);
                        }
                        gm.d3(uc1Var, 800L);
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
        l9b l9bVar = (l9b) this;
        boolean isCameraAllowed = CameraView.isCameraAllowed();
        v9b v9bVar = l9bVar.S1;
        if (!isCameraAllowed ? false : v9bVar.Y()) {
            gm.r(uc1Var);
            this.E1 = motionEvent.getX();
            this.F1 = motionEvent.getY();
            this.k1 = 0.0f;
            this.c1 = 0.0f;
            this.G1.e(true, 0.0f);
            this.H1.e(true, 0.0f);
            this.K1 = false;
            this.L1 = false;
            this.M1 = false;
            xc1Var.g = false;
            p09 p09Var2 = xc1Var.h;
            p09Var2.stop();
            p09Var2.O(true, 0.0f);
            this.O1 = true;
            this.e1 = System.currentTimeMillis();
            this.K0 = true;
            this.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            invalidate();
            n();
            wc1 wc1Var3 = new wc1(this, getContext());
            this.D1 = wc1Var3;
            wc1 wc1Var4 = v9bVar.r1;
            if (wc1Var4 != null) {
                wc1Var4.a(true);
            }
            k9b k9bVar = v9bVar.Y0;
            if (k9bVar != null) {
                k9bVar.P = true;
                k9bVar.b();
                k9b k9bVar2 = v9bVar.Y0;
                k9bVar2.m(0L);
                lqb lqbVar = k9bVar2.G;
                if (lqbVar != null) {
                    lqbVar.setProgress(0L);
                }
            }
            wc1Var3.n = new qp0(l9bVar, wc1Var3, (byte) 6);
            wc1Var3.r = new uc1(l9bVar, b);
            i9b i9bVar = v9bVar.i0;
            v9bVar.r1 = wc1Var3;
            i9bVar.addView(wc1Var3, qoe.c(-1.0f, -1));
            return true;
        }
        return true;
    }

    @Override // pc1
    public int getCaptionDefaultLimit() {
        return oc7.r1(this.V).l4.i1.f();
    }

    @Override // pc1
    public int getCaptionPremiumLimit() {
        return oc7.r1(this.V).l4.j1.f();
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override // pc1
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
            float L = rectF.left + gm.L(21.0f);
            float L2 = rectF.bottom - gm.L(20.0f);
            xc1 xc1Var = this.a1;
            xc1Var.setBounds((int) (L - gm.L(12.0f)), (int) (L2 - gm.L(12.0f)), (int) (L + gm.L(12.0f)), (int) (L2 + gm.L(12.0f)));
            xc1Var.draw(canvas3);
            int L3 = (int) ((rectF.left + gm.L(33.3f)) - (gm.L(10.0f) * d));
            int L4 = (int) ((rectF.bottom - gm.L(20.0f)) - gm.L(9.0f));
            int L5 = (int) (rectF.left + gm.L(133.3f));
            int L6 = (int) ((rectF.bottom - gm.L(20.0f)) + gm.L(9.0f));
            ho hoVar = this.b1;
            hoVar.setBounds(L3, L4, L5, L6);
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
            hoVar.t(sb.toString(), true, true);
            hoVar.C = (int) ((1.0f - d) * 255.0f);
            hoVar.draw(canvas3);
            float f5 = 1.0f - d2;
            float f6 = (1.0f - this.c1) * f5;
            Paint c = this.Q.c(1.0f);
            if (c != null) {
                f2 = 10.0f;
                paint = c;
                f = 12.0f;
                f3 = f6;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, nm7.d4, 31);
                canvas3 = canvas;
            } else {
                f = 12.0f;
                f2 = 10.0f;
                f3 = f6;
                paint = c;
            }
            if (f3 > 0.0f) {
                if (this.x1 == null) {
                    this.x1 = new uib(jb6.M0(2131745047, null), 15.0f, null);
                }
                if (this.y1 == null) {
                    Path path = new Path();
                    this.y1 = path;
                    path.moveTo(gm.L(3.83f), 0.0f);
                    this.y1.lineTo(0.0f, gm.L(5.0f));
                    this.y1.lineTo(gm.L(3.83f), gm.L(f2));
                    Paint paint2 = new Paint(1);
                    this.z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.z1.setStrokeCap(Paint.Cap.ROUND);
                    this.z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.z1.setStrokeWidth(gm.L(1.33f));
                this.x1.p = (int) ((rectF.width() - gm.L(116.0f)) - hoVar.c());
                float B = kt6.B(1.0f, this.c1, gm.L(6.0f) * sin, (rectF.centerX() - ((this.x1.j() + gm.L(11.33f)) / 2.0f)) - (gm.R1(this.c1, 1.0f, d2) * (rectF.width() / 6.0f)));
                int p1 = cmb.p1(f3, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(B, rectF.centerY() - gm.L(5.0f));
                this.z1.setColor(p1);
                canvas3.drawPath(this.y1, this.z1);
                canvas3.restore();
                str = null;
                f4 = 15.0f;
                this.x1.c(B + gm.L(11.33f), rectF.centerY(), 1.0f, p1, canvas3);
            } else {
                f4 = 15.0f;
                str = null;
            }
            if (d2 > 0.0f) {
                uib uibVar = this.A1;
                if (uibVar == null) {
                    uibVar = new uib(jb6.M0(2131752523, str), f4, gm.o());
                    this.A1 = uibVar;
                }
                uibVar.p = (int) ((rectF.width() - gm.L(116.0f)) - hoVar.c());
                float width = ((rectF.width() / 4.0f) * f5) + (rectF.centerX() - (this.A1.j() / 2.0f));
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, cmb.p1(d2, paint != null ? -1 : -2130706433), canvas2);
                this.u1.set(width - gm.L(f), rectF.top, this.A1.j() + width + gm.L(f), rectF.bottom);
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

    @Override // pc1
    public final void k(Canvas canvas, RectF rectF, float f) {
        float f2;
        float f3;
        float f4;
        if (f <= 0.0f) {
            return;
        }
        boolean z = this.K1;
        ln lnVar = this.H1;
        float d = lnVar.d(z);
        boolean z2 = this.M1;
        ln lnVar2 = this.J1;
        float d2 = lnVar2.d(z2);
        float e = this.l1.e(false, this.k1);
        float f5 = 1.0f - d;
        float A = td4.A(1.0f, this.c1, gm.L(30.0f) * e, gm.L(41.0f)) * f5 * f;
        float R1 = gm.R1(kt6.B(1.0f, d2, getWidth() * 0.35f * this.c1, rectF.right - gm.L(20.0f)), rectF.left + gm.L(20.0f), d);
        float L = rectF.bottom - gm.L(20.0f);
        boolean e2 = e86.e(360928);
        Paint paint = this.g1;
        if (e2) {
            float L2 = gm.L(47.0f);
            fl0 fl0Var = this.h1;
            fl0Var.a = L2;
            Paint paint2 = fl0Var.d;
            f2 = 0.0f;
            fl0Var.b = (gm.L(15.0f) * 0.6f) + gm.L(47.0f);
            float L3 = gm.L(50.0f);
            f3 = d2;
            fl0 fl0Var2 = this.i1;
            fl0Var2.a = L3;
            Paint paint3 = fl0Var2.d;
            f4 = f5;
            fl0Var2.b = (gm.L(12.0f) * 0.6f) + gm.L(50.0f);
            fl0Var2.e(e, 1.01f);
            fl0Var.e(e, 1.02f);
            paint3.setColor(cmb.p1(0.15f * f, paint.getColor()));
            canvas.save();
            float f6 = A / fl0Var2.a;
            canvas.scale(f6, f6, R1, L);
            fl0Var2.a(R1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(cmb.p1(0.3f * f, paint.getColor()));
            canvas.save();
            float f7 = A / fl0Var.a;
            canvas.scale(f7, f7, R1, L);
            fl0Var.a(R1, L, canvas, paint2);
            canvas.restore();
        } else {
            f2 = 0.0f;
            f3 = d2;
            f4 = f5;
        }
        float min = Math.min(A, gm.L(55.0f));
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
            float N = (gm.N(19.33f) / 2.0f) * f3 * f;
            RectF rectF2 = gm.P;
            rectF2.set(R1 - N, L - N, R1 + N, L + N);
            canvas.drawRoundRect(rectF2, gm.L(5.33f), gm.L(5.33f), this.f1);
        }
        canvas.restore();
        float f9 = lnVar.c;
        float f10 = lnVar2.c;
        float z3 = td4.z(1.0f, f9, gm.R1(this.s1.d(this.c1 < 0.4f), f2, f10), f);
        float L4 = rectF.right - gm.L(20.0f);
        float U1 = (gm.U1(f10, gm.L(50.0f), gm.L(36.0f)) * z3) / 2.0f;
        float f11 = 1.0f - f10;
        float R12 = gm.R1(((rectF.bottom - gm.L(80.0f)) - U1) - ((gm.L(120.0f) * this.d1) * f11), rectF.bottom - gm.L(20.0f), 1.0f - z3);
        float L5 = (gm.L(36.0f) * z3) / 2.0f;
        RectF rectF3 = this.t1;
        rectF3.set(L4 - L5, R12 - U1, L5 + L4, U1 + R12);
        float U12 = gm.U1(f10, gm.L(18.0f), gm.L(14.0f));
        float L6 = gm.L(1.0f);
        float L7 = gm.L(0.66f);
        int p1 = cmb.p1(z3, TLObject.FLAG_29);
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
        int p12 = cmb.p1(z3, -1);
        Paint paint7 = this.q1;
        paint7.setColor(p12);
        int p13 = cmb.p1(z3 * f11, -1);
        Paint paint8 = this.r1;
        paint8.setColor(p13);
        float U13 = gm.U1(f10, gm.L(15.33f), gm.L(13.0f));
        float U14 = gm.U1(f10, gm.L(12.66f), gm.L(13.0f));
        float L8 = (gm.L(4.0f) * f11) + R12;
        canvas.rotate(this.d1 * 12.0f * f11, L4, L8);
        float f12 = U13 / 2.0f;
        float f13 = U14 / 2.0f;
        float f14 = L8 - f13;
        RectF rectF4 = this.v1;
        rectF4.set(L4 - f12, f14, f12 + L4, L8 + f13);
        canvas.drawRoundRect(rectF4, gm.L(3.66f), gm.L(3.66f), paint7);
        if (f10 < 1.0f) {
            canvas.save();
            canvas.rotate(this.d1 * 12.0f * f11, L4, f14);
            canvas.translate(0.0f, f13 * f10);
            canvas.scale(f11, f11, L4, f14);
            Path path2 = this.w1;
            path2.rewind();
            float L9 = gm.L(4.33f);
            float L10 = f14 - gm.L(3.66f);
            float f15 = L4 + L9;
            path2.moveTo(f15, gm.L(3.66f) + L10);
            path2.lineTo(f15, L10);
            RectF rectF5 = gm.P;
            float f16 = L4 - L9;
            rectF5.set(f16, L10 - L9, f15, L9 + L10);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f16, (gm.R1(gm.R1(0.4f, 0.0f, this.d1), 1.0f, f10) * gm.L(3.66f)) + L10);
            paint8.setStrokeWidth(gm.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            ln lnVar3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || lnVar3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.o0) * 255.0f), 31);
                Path path3 = this.n1;
                path3.rewind();
                path3.addRoundRect(rectF, gm.L(21.0f), gm.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || lnVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((gm.L(180.0f) * f4) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || lnVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((gm.L(180.0f) * f4) + imageView2.getX(), imageView2.getY());
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
        this.Y0.setBounds(gm.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - gm.L(48.0f)), (int) (rectF.left + gm.L(40.0f)), (int) ((rectF.top - timelineHeight) - gm.L(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override // pc1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xc1 xc1Var = this.a1;
        p09 p09Var = xc1Var.h;
        xc1Var.f = true;
        if (xc1Var.g) {
            p09Var.start();
        }
        p09Var.M(xc1Var.i);
    }

    @Override // pc1, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xc1 xc1Var = this.a1;
        xc1Var.f = false;
        p09 p09Var = xc1Var.h;
        p09Var.stop();
        p09Var.M(null);
    }

    public void setAmplitude(double d) {
        this.k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z) {
        int i = z ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.S0;
        imageView.setImageResource(i);
        imageView.setContentDescription(jb6.M0(z ? 2131754787 : 2131754735, null));
        this.Z0 = z;
    }

    public void setOnPeriodUpdate(qac qacVar) {
        this.B1 = qacVar;
    }

    public void setOnPremiumHint(qac qacVar) {
        this.C1 = qacVar;
    }

    public void setPeriod(int i) {
        A(i, true);
    }

    public void setPeriodVisible(boolean z) {
        this.W0 = z;
        this.T0.setVisibility((!z || this.p0) ? 8 : 0);
    }

    @Override // pc1
    public final void u(float f) {
        float f2 = 1.0f - f;
        this.T0.setAlpha(f2);
        this.S0.setAlpha(f2);
    }

    public final void z(boolean z, boolean z2) {
        gm.r(this.P1);
        this.L1 = true;
        this.O1 = false;
        int L = (int) ((getBounds().right - gm.L(20.0f)) - ((getWidth() * 0.35f) * this.c1));
        this.K0 = false;
        this.L0 = L;
        invalidate();
        wc1 wc1Var = this.D1;
        if (wc1Var != null) {
            if (!z) {
                if (z2) {
                    wc1Var.y = true;
                    gm.r(wc1Var.h);
                    CameraController.getInstance().stopVideoRecording(wc1Var.a.getCameraSessionRecording(), false, false);
                    wc1Var.a(false);
                } else {
                    wc1Var.c();
                }
            }
            this.D1 = null;
        }
        n();
    }
}
