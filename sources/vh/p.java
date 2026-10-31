package vh;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.sc;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.jo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class p extends k {
    public static final int[] P1 = {21600, 43200, 86400, 172800};
    public q20 A1;
    public q20 B1;
    public n C1;
    public float D1;
    public float E1;
    public final org.telegram.ui.Components.t5 F1;
    public final org.telegram.ui.Components.t5 G1;
    public final org.telegram.ui.Components.t5 H1;
    public final org.telegram.ui.Components.t5 I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public final l O1;
    public final ImageView R0;
    public final ImageView S0;
    public final j T0;
    public z60 U0;
    public boolean V0;
    public int W0;
    public Drawable X0;
    public boolean Y0;
    public final o Z0;
    public final org.telegram.ui.Components.e6 a1;
    public float b1;
    public float c1;
    public long d1;
    public final Paint e1;
    public final Paint f1;
    public final m9 g1;
    public final m9 h1;
    public final Drawable i1;
    public float j1;
    public final org.telegram.ui.Components.t5 k1;
    public final Path l1;
    public final Path m1;
    public final Paint n1;
    public final Paint o1;
    public final Paint p1;
    public final Paint q1;
    public final org.telegram.ui.Components.t5 r1;
    public final RectF s1;
    public final RectF t1;
    public final RectF u1;
    public final Path v1;
    public qz0 w1;
    public Path x1;
    public Paint y1;
    public qz0 z1;

    public p(Context context, FrameLayout frameLayout, uu0 uu0Var, FrameLayout frameLayout2, th.b bVar, s9 s9Var) {
        super(context, frameLayout, uu0Var, frameLayout2, bVar, s9Var);
        this.V0 = true;
        int i10 = 0;
        this.W0 = 0;
        e8 e8Var = (e8) this;
        this.Z0 = new o(e8Var, e8Var);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.a1 = e6Var;
        gr grVar = gr.f;
        e6Var.n(0.16f, 50L, grVar);
        e6Var.w(org.telegram.messenger.i0.L(15.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.t("0:00.0", true, true);
        e6Var.u(-1);
        Paint paint = new Paint(1);
        this.e1 = paint;
        Paint paint2 = new Paint(1);
        this.f1 = paint2;
        m9 m9Var = new m9(11, 360928);
        this.g1 = m9Var;
        m9 m9Var2 = new m9(12, 360928);
        this.h1 = m9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        m9Var.a = org.telegram.messenger.i0.L(47.0f);
        m9Var.b = org.telegram.messenger.i0.L(55.0f);
        m9Var.b();
        m9Var2.a = org.telegram.messenger.i0.L(47.0f);
        m9Var2.b = org.telegram.messenger.i0.L(55.0f);
        m9Var2.b();
        this.i1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.k1 = new org.telegram.ui.Components.t5(new l(e8Var, i10), 200L, grVar, 0);
        this.l1 = new Path();
        this.m1 = new Path();
        this.n1 = new Paint(1);
        this.o1 = new Paint(1);
        this.p1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.q1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        l lVar = new l(e8Var, i10);
        gr grVar2 = gr.h;
        this.r1 = new org.telegram.ui.Components.t5(lVar, 350L, grVar2);
        this.s1 = new RectF();
        this.t1 = new RectF();
        this.u1 = new RectF();
        this.v1 = new Path();
        this.F1 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar2);
        this.G1 = new org.telegram.ui.Components.t5(new l(e8Var, i10), 420L, grVar2, 0);
        this.H1 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar2);
        this.I1 = new org.telegram.ui.Components.t5(new l(e8Var, i10), 350L, grVar2, 0);
        this.O1 = new l(e8Var, 1);
        ImageView imageView = new ImageView(context);
        this.R0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(cd.L0(2131754736, null));
        addView(imageView, w7.b6.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new rh.s(e8Var, 18));
        ImageView imageView2 = new ImageView(context);
        this.S0 = imageView2;
        j jVar = new j(5);
        this.T0 = jVar;
        imageView2.setImageDrawable(jVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(cd.L0(2131744609, null));
        A(86400, false);
        addView(imageView2, w7.b6.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new rh.e7(e8Var, frameLayout, bVar, 6));
    }

    public final void A(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                i11 = 2;
                break;
            } else if (P1[i11] == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (this.W0 == i11) {
            return;
        }
        this.W0 = i11;
        this.T0.d(i10 / 3600, false, z10);
    }

    public final void B() {
        if (this.Y0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
            String L0 = cd.L0(2131744524, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131744525, null);
            alertDialog$Builder.k(cd.L0(2131746336, null), new rh.d0(this, 23));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, this.a);
            }
        }
    }

    @Override // vh.k
    public final int b() {
        return 36;
    }

    @Override // vh.k
    public final void c(boolean z10) {
        int i10 = (z10 || !this.V0) ? 8 : 0;
        ImageView imageView = this.S0;
        imageView.setVisibility(i10);
        this.R0.setVisibility(z10 ? 8 : 0);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override // vh.k
    public final void d(boolean z10) {
        if (z10) {
            return;
        }
        this.S0.setVisibility(this.V0 ? 0 : 8);
        this.R0.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r10.M1 == false) goto L67;
     */
    @Override // vh.k, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n nVar;
        Drawable drawable;
        if (this.N1 && (nVar = this.C1) != null && nVar.a != null && (drawable = this.X0) != null) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(drawable.getBounds());
            rectF.inset(-org.telegram.messenger.i0.L(12.0f), -org.telegram.messenger.i0.L(12.0f));
            int i10 = 0;
            while (true) {
                if (i10 >= motionEvent.getPointerCount()) {
                    break;
                }
                if (!org.telegram.messenger.i0.P.contains(motionEvent.getX(i10), motionEvent.getY(i10))) {
                    i10++;
                } else if (motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5) {
                    this.C1.a.switchCamera();
                    Drawable drawable2 = this.X0;
                    if (drawable2 instanceof AnimatedVectorDrawable) {
                        ((AnimatedVectorDrawable) drawable2).start();
                    }
                }
            }
        }
        RectF rectF2 = org.telegram.messenger.i0.P;
        ImageView imageView = this.R0;
        rectF2.set(imageView.getX(), imageView.getY(), imageView.getX() + imageView.getMeasuredWidth(), imageView.getY() + imageView.getMeasuredHeight());
        if (!this.M1 && (this.Y0 || this.o0 || !rectF2.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.N1 && this.L1) {
                if (this.t1.contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, true);
                    this.M1 = false;
                    return true;
                }
            }
            if (this.N1) {
                if (this.s1.contains(motionEvent.getX(), motionEvent.getY()) || getBounds().contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, false);
                    this.M1 = false;
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        o oVar = this.Z0;
        l lVar = this.O1;
        if (action != 0) {
            if (motionEvent.getAction() == 2) {
                if (!this.J1) {
                    this.b1 = Utilities.i((this.D1 - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                    float i11 = Utilities.i((this.E1 - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                    this.c1 = i11;
                    boolean z10 = this.L1;
                    if (!z10 && !this.J1 && this.b1 >= 1.0f) {
                        this.J1 = true;
                        this.N1 = false;
                        imageView.setVisibility(4);
                        this.S0.setVisibility(4);
                        oVar.g = true;
                        bi0 bi0Var = oVar.h;
                        bi0Var.T(true, 0.0f);
                        if (oVar.f) {
                            bi0Var.start();
                        }
                        n nVar2 = this.C1;
                        if (nVar2 != null) {
                            nVar2.y = true;
                            org.telegram.messenger.i0.r(nVar2.h);
                            CameraController.getInstance().stopVideoRecording(nVar2.a.getCameraSessionRecording(), false, false);
                            nVar2.a(false);
                        }
                        org.telegram.messenger.i0.h3(lVar, 800L);
                    } else if (!z10 && !this.J1 && i11 >= 1.0f && this.b1 < 0.4f) {
                        this.L1 = true;
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    invalidate();
                    n();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (!this.J1 && !this.L1) {
                    z(false, false);
                }
                this.M1 = false;
            }
            return this.M1;
        }
        if (this.N1) {
            this.M1 = false;
            z(false, false);
            return true;
        }
        this.M1 = true;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        e8 e8Var = (e8) this;
        boolean isCameraAllowed = CameraView.isCameraAllowed();
        o8 o8Var = e8Var.R1;
        if (!isCameraAllowed ? false : o8.c(o8Var)) {
            org.telegram.messenger.i0.r(lVar);
            this.D1 = motionEvent.getX();
            this.E1 = motionEvent.getY();
            this.j1 = 0.0f;
            this.b1 = 0.0f;
            this.F1.e(true, 0.0f);
            this.G1.e(true, 0.0f);
            this.J1 = false;
            this.K1 = false;
            this.L1 = false;
            oVar.g = false;
            bi0 bi0Var2 = oVar.h;
            bi0Var2.stop();
            bi0Var2.T(true, 0.0f);
            this.N1 = true;
            this.d1 = System.currentTimeMillis();
            this.J0 = true;
            this.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            invalidate();
            n();
            n nVar3 = new n(this, getContext());
            this.C1 = nVar3;
            n nVar4 = o8Var.q1;
            if (nVar4 != null) {
                nVar4.a(true);
            }
            d8 d8Var = o8Var.X0;
            if (d8Var != null) {
                d8Var.O = true;
                d8Var.c();
                d8 d8Var2 = o8Var.X0;
                d8Var2.m(0L);
                z8 z8Var = d8Var2.F;
                if (z8Var != null) {
                    z8Var.setProgress(0L);
                }
            }
            nVar3.n = new jo(5, e8Var, nVar3);
            nVar3.r = new l(e8Var, 2);
            b8 b8Var = o8Var.h0;
            o8Var.q1 = nVar3;
            b8Var.addView(nVar3, w7.b6.c(-1.0f, -1));
            return true;
        }
        return true;
    }

    @Override // vh.k
    public int getCaptionDefaultLimit() {
        return vp.r1(this.U).W4;
    }

    @Override // vh.k
    public int getCaptionPremiumLimit() {
        return vp.r1(this.U).X4;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override // vh.k
    public final void j(Canvas canvas, RectF rectF) {
        float f7;
        float f10;
        float f11;
        Paint paint;
        float f12;
        String str;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.C1 != null) {
            float d = this.F1.d(this.J1);
            float d10 = this.H1.d(this.L1);
            if (this.d1 <= 0) {
                this.d1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin(((System.currentTimeMillis() - this.d1) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float L = rectF.left + org.telegram.messenger.i0.L(21.0f);
            float L2 = rectF.bottom - org.telegram.messenger.i0.L(20.0f);
            o oVar = this.Z0;
            oVar.setBounds((int) (L - org.telegram.messenger.i0.L(12.0f)), (int) (L2 - org.telegram.messenger.i0.L(12.0f)), (int) (L + org.telegram.messenger.i0.L(12.0f)), (int) (L2 + org.telegram.messenger.i0.L(12.0f)));
            oVar.draw(canvas3);
            int L3 = (int) ((rectF.left + org.telegram.messenger.i0.L(33.3f)) - (org.telegram.messenger.i0.L(10.0f) * d));
            int L4 = (int) ((rectF.bottom - org.telegram.messenger.i0.L(20.0f)) - org.telegram.messenger.i0.L(9.0f));
            int L5 = (int) (rectF.left + org.telegram.messenger.i0.L(133.3f));
            int L6 = (int) ((rectF.bottom - org.telegram.messenger.i0.L(20.0f)) + org.telegram.messenger.i0.L(9.0f));
            org.telegram.ui.Components.e6 e6Var = this.a1;
            e6Var.setBounds(L3, L4, L5, L6);
            long b10 = this.C1.b();
            int i10 = (int) (b10 / 1000);
            int i11 = (int) ((b10 - (i10 * 1000)) / 100);
            int i12 = i10 / 60;
            int i13 = i10 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(":");
            sb2.append(i13 < 10 ? "0" : "");
            sb2.append(i13);
            sb2.append(".");
            sb2.append(i11);
            e6Var.t(sb2.toString(), true, true);
            e6Var.B = (int) ((1.0f - d) * 255.0f);
            e6Var.draw(canvas3);
            float f13 = 1.0f - d10;
            float f14 = (1.0f - this.b1) * f13;
            Paint c10 = this.P.c(1.0f);
            if (c10 != null) {
                f10 = 10.0f;
                paint = c10;
                f7 = 12.0f;
                f11 = f14;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, zs.e4, 31);
                canvas3 = canvas;
            } else {
                f7 = 12.0f;
                f10 = 10.0f;
                f11 = f14;
                paint = c10;
            }
            if (f11 > 0.0f) {
                if (this.w1 == null) {
                    this.w1 = new qz0(cd.L0(2131745331, null), 15.0f, null);
                }
                if (this.x1 == null) {
                    Path path = new Path();
                    this.x1 = path;
                    path.moveTo(org.telegram.messenger.i0.L(3.83f), 0.0f);
                    this.x1.lineTo(0.0f, org.telegram.messenger.i0.L(5.0f));
                    this.x1.lineTo(org.telegram.messenger.i0.L(3.83f), org.telegram.messenger.i0.L(f10));
                    Paint paint2 = new Paint(1);
                    this.y1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.y1.setStrokeCap(Paint.Cap.ROUND);
                    this.y1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.y1.setStrokeWidth(org.telegram.messenger.i0.L(1.33f));
                this.w1.p = (int) ((rectF.width() - org.telegram.messenger.i0.L(116.0f)) - e6Var.c());
                float z10 = sc.e.z(1.0f, this.b1, org.telegram.messenger.i0.L(6.0f) * sin, (rectF.centerX() - ((this.w1.k() + org.telegram.messenger.i0.L(11.33f)) / 2.0f)) - (org.telegram.messenger.i0.T1(this.b1, 1.0f, d10) * (rectF.width() / 6.0f)));
                int r12 = org.telegram.ui.ActionBar.t6.r1(f11, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(z10, rectF.centerY() - org.telegram.messenger.i0.L(5.0f));
                this.y1.setColor(r12);
                canvas3.drawPath(this.x1, this.y1);
                canvas3.restore();
                str = null;
                f12 = 15.0f;
                this.w1.c(z10 + org.telegram.messenger.i0.L(11.33f), rectF.centerY(), 1.0f, r12, canvas3);
            } else {
                f12 = 15.0f;
                str = null;
            }
            if (d10 > 0.0f) {
                if (this.z1 == null) {
                    this.z1 = new qz0(cd.L0(2131752570, str), f12, org.telegram.messenger.i0.o());
                }
                this.z1.p = (int) ((rectF.width() - org.telegram.messenger.i0.L(116.0f)) - e6Var.c());
                float width = ((rectF.width() / 4.0f) * f13) + (rectF.centerX() - (this.z1.k() / 2.0f));
                canvas2 = canvas;
                this.z1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.t6.r1(d10, paint != null ? -1 : -2130706433), canvas2);
                this.t1.set(width - org.telegram.messenger.i0.L(f7), rectF.top, this.z1.k() + width + org.telegram.messenger.i0.L(f7), rectF.bottom);
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

    @Override // vh.k
    public final void k(Canvas canvas, RectF rectF, float f7) {
        float f10;
        float f11;
        float f12;
        if (f7 <= 0.0f) {
            return;
        }
        boolean z10 = this.J1;
        org.telegram.ui.Components.t5 t5Var = this.G1;
        float d = t5Var.d(z10);
        boolean z11 = this.L1;
        org.telegram.ui.Components.t5 t5Var2 = this.I1;
        float d10 = t5Var2.d(z11);
        float e = this.k1.e(false, this.j1);
        float f13 = 1.0f - d;
        float z12 = c3.i0.z(1.0f, this.b1, org.telegram.messenger.i0.L(30.0f) * e, org.telegram.messenger.i0.L(41.0f)) * f13 * f7;
        float T1 = org.telegram.messenger.i0.T1(sc.e.z(1.0f, d10, getWidth() * 0.35f * this.b1, rectF.right - org.telegram.messenger.i0.L(20.0f)), rectF.left + org.telegram.messenger.i0.L(20.0f), d);
        float L = rectF.bottom - org.telegram.messenger.i0.L(20.0f);
        boolean e7 = sc.e(360928);
        Paint paint = this.f1;
        if (e7) {
            float L2 = org.telegram.messenger.i0.L(47.0f);
            m9 m9Var = this.g1;
            m9Var.a = L2;
            Paint paint2 = m9Var.d;
            f10 = 0.0f;
            m9Var.b = (org.telegram.messenger.i0.L(15.0f) * 0.6f) + org.telegram.messenger.i0.L(47.0f);
            float L3 = org.telegram.messenger.i0.L(50.0f);
            f11 = d10;
            m9 m9Var2 = this.h1;
            m9Var2.a = L3;
            Paint paint3 = m9Var2.d;
            f12 = f13;
            m9Var2.b = (org.telegram.messenger.i0.L(12.0f) * 0.6f) + org.telegram.messenger.i0.L(50.0f);
            m9Var2.e(e, 1.01f);
            m9Var.e(e, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.t6.r1(0.15f * f7, paint.getColor()));
            canvas.save();
            float f14 = z12 / m9Var2.a;
            canvas.scale(f14, f14, T1, L);
            m9Var2.a(T1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f * f7, paint.getColor()));
            canvas.save();
            float f15 = z12 / m9Var.a;
            canvas.scale(f15, f15, T1, L);
            m9Var.a(T1, L, canvas, paint2);
            canvas.restore();
        } else {
            f10 = 0.0f;
            f11 = d10;
            f12 = f13;
        }
        float min = Math.min(z12, org.telegram.messenger.i0.L(55.0f));
        float f16 = f7 * 255.0f;
        paint.setAlpha((int) f16);
        canvas.drawCircle(T1, L, min, paint);
        canvas.save();
        Path path = this.l1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(T1, L, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.i1;
        drawable.setBounds((int) (T1 - (((drawable.getIntrinsicWidth() / 2.0f) * f12) * (this.K1 ? f7 : 1.0f))), (int) (L - (((drawable.getIntrinsicHeight() / 2.0f) * f12) * (this.K1 ? f7 : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f12 * (this.K1 ? f7 : 1.0f)) + T1), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f12 * (this.K1 ? f7 : 1.0f)) + L));
        drawable.setAlpha((int) (f12 * 255.0f * (this.K1 ? f7 : 1.0f)));
        drawable.draw(canvas);
        if (f11 > f10) {
            float N = (org.telegram.messenger.i0.N(19.33f) / 2.0f) * f11 * f7;
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(T1 - N, L - N, T1 + N, L + N);
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(5.33f), this.e1);
        }
        canvas.restore();
        float f17 = t5Var.c;
        float f18 = t5Var2.c;
        float A = org.telegram.messenger.m5.A(1.0f, f17, org.telegram.messenger.i0.T1(this.r1.d(this.b1 < 0.4f), f10, f18), f7);
        float L4 = rectF.right - org.telegram.messenger.i0.L(20.0f);
        float W1 = (org.telegram.messenger.i0.W1(f18, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(36.0f)) * A) / 2.0f;
        float f19 = 1.0f - f18;
        float T12 = org.telegram.messenger.i0.T1(((rectF.bottom - org.telegram.messenger.i0.L(80.0f)) - W1) - ((org.telegram.messenger.i0.L(120.0f) * this.c1) * f19), rectF.bottom - org.telegram.messenger.i0.L(20.0f), 1.0f - A);
        float L5 = (org.telegram.messenger.i0.L(36.0f) * A) / 2.0f;
        RectF rectF3 = this.s1;
        rectF3.set(L4 - L5, T12 - W1, L5 + L4, W1 + T12);
        float W12 = org.telegram.messenger.i0.W1(f18, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(14.0f));
        float L6 = org.telegram.messenger.i0.L(1.0f);
        float L7 = org.telegram.messenger.i0.L(0.66f);
        int r12 = org.telegram.ui.ActionBar.t6.r1(A, TLObject.FLAG_29);
        Paint paint4 = this.o1;
        paint4.setShadowLayer(L6, 0.0f, L7, r12);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, W12, W12, paint4);
        Paint c10 = this.R.c(A);
        if (c10 == null) {
            Paint paint5 = this.n1;
            paint5.setColor(TLObject.FLAG_30);
            paint5.setAlpha((int) (64.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint5);
        } else {
            canvas.drawRoundRect(rectF3, W12, W12, c10);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint6);
        }
        canvas.save();
        canvas.scale(A, A, L4, T12);
        int r13 = org.telegram.ui.ActionBar.t6.r1(A, -1);
        Paint paint7 = this.p1;
        paint7.setColor(r13);
        int r14 = org.telegram.ui.ActionBar.t6.r1(A * f19, -1);
        Paint paint8 = this.q1;
        paint8.setColor(r14);
        float W13 = org.telegram.messenger.i0.W1(f18, org.telegram.messenger.i0.L(15.33f), org.telegram.messenger.i0.L(13.0f));
        float W14 = org.telegram.messenger.i0.W1(f18, org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(13.0f));
        float L8 = (org.telegram.messenger.i0.L(4.0f) * f19) + T12;
        canvas.rotate(this.c1 * 12.0f * f19, L4, L8);
        float f20 = W13 / 2.0f;
        float f21 = W14 / 2.0f;
        float f22 = L8 - f21;
        RectF rectF4 = this.u1;
        rectF4.set(L4 - f20, f22, f20 + L4, L8 + f21);
        canvas.drawRoundRect(rectF4, org.telegram.messenger.i0.L(3.66f), org.telegram.messenger.i0.L(3.66f), paint7);
        if (f18 < 1.0f) {
            canvas.save();
            canvas.rotate(this.c1 * 12.0f * f19, L4, f22);
            canvas.translate(0.0f, f21 * f18);
            canvas.scale(f19, f19, L4, f22);
            Path path2 = this.v1;
            path2.rewind();
            float L9 = org.telegram.messenger.i0.L(4.33f);
            float L10 = f22 - org.telegram.messenger.i0.L(3.66f);
            float f23 = L4 + L9;
            path2.moveTo(f23, org.telegram.messenger.i0.L(3.66f) + L10);
            path2.lineTo(f23, L10);
            RectF rectF5 = org.telegram.messenger.i0.P;
            float f24 = L4 - L9;
            rectF5.set(f24, L10 - L9, f23, L9 + L10);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f24, (org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(0.4f, 0.0f, this.c1), 1.0f, f18) * org.telegram.messenger.i0.L(3.66f)) + L10);
            paint8.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.J1) {
            ImageView imageView = this.R0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.t5 t5Var3 = this.L0;
            ImageView imageView2 = this.S0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || t5Var3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.n0) * 255.0f), 31);
                Path path3 = this.m1;
                path3.rewind();
                path3.addRoundRect(rectF, org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || t5Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.i0.L(180.0f) * f12) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || t5Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.i0.L(180.0f) * f12) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.X0 == null) {
            this.X0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.X0.setAlpha((int) (f16 * f12));
        float timelineHeight = getTimelineHeight();
        this.X0.setBounds(org.telegram.messenger.i0.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.i0.L(48.0f)), (int) (rectF.left + org.telegram.messenger.i0.L(40.0f)), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.i0.L(12.0f)));
        this.X0.draw(canvas);
    }

    @Override // vh.k, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o oVar = this.Z0;
        bi0 bi0Var = oVar.h;
        oVar.f = true;
        if (oVar.g) {
            bi0Var.start();
        }
        bi0Var.R(oVar.i);
    }

    @Override // vh.k, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o oVar = this.Z0;
        oVar.f = false;
        bi0 bi0Var = oVar.h;
        bi0Var.stop();
        bi0Var.R(null);
    }

    public void setAmplitude(double d) {
        this.j1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i10 = z10 ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.R0;
        imageView.setImageResource(i10);
        imageView.setContentDescription(cd.L0(z10 ? 2131754788 : 2131754736, null));
        this.Y0 = z10;
    }

    public void setOnPeriodUpdate(q20 q20Var) {
        this.A1 = q20Var;
    }

    public void setOnPremiumHint(q20 q20Var) {
        this.B1 = q20Var;
    }

    public void setPeriod(int i10) {
        A(i10, true);
    }

    public void setPeriodVisible(boolean z10) {
        this.V0 = z10;
        this.S0.setVisibility((!z10 || this.o0) ? 8 : 0);
    }

    @Override // vh.k
    public final void u(float f7) {
        float f10 = 1.0f - f7;
        this.S0.setAlpha(f10);
        this.R0.setAlpha(f10);
    }

    public final void z(boolean z10, boolean z11) {
        org.telegram.messenger.i0.r(this.O1);
        this.K1 = true;
        this.N1 = false;
        int L = (int) ((getBounds().right - org.telegram.messenger.i0.L(20.0f)) - ((getWidth() * 0.35f) * this.b1));
        this.J0 = false;
        this.K0 = L;
        invalidate();
        n nVar = this.C1;
        if (nVar != null) {
            if (!z10) {
                if (z11) {
                    nVar.y = true;
                    org.telegram.messenger.i0.r(nVar.h);
                    CameraController.getInstance().stopVideoRecording(nVar.a.getCameraSessionRecording(), false, false);
                    nVar.a(false);
                } else {
                    nVar.c();
                }
            }
            this.C1 = null;
        }
        n();
    }
}
