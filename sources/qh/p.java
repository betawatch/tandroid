package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.q70;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class p extends k {
    public static final int[] N1 = {21600, 43200, 86400, 172800};
    public n A1;
    public float B1;
    public float C1;
    public final org.telegram.ui.Components.z5 D1;
    public final org.telegram.ui.Components.z5 E1;
    public final org.telegram.ui.Components.z5 F1;
    public final org.telegram.ui.Components.z5 G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public final l M1;
    public final ImageView P0;
    public final ImageView Q0;
    public final j R0;
    public q70 S0;
    public boolean T0;
    public int U0;
    public Drawable V0;
    public boolean W0;
    public final o X0;
    public final org.telegram.ui.Components.j6 Y0;
    public float Z0;
    public float a1;
    public long b1;
    public final Paint c1;
    public final Paint d1;
    public final org.telegram.ui.Components.u9 e1;
    public final org.telegram.ui.Components.u9 f1;
    public final Drawable g1;
    public float h1;
    public final org.telegram.ui.Components.z5 i1;
    public final Path j1;
    public final Path k1;
    public final Paint l1;
    public final Paint m1;
    public final Paint n1;
    public final Paint o1;
    public final org.telegram.ui.Components.z5 p1;
    public final RectF q1;
    public final RectF r1;
    public final RectF s1;
    public final Path t1;
    public k01 u1;
    public Path v1;
    public Paint w1;
    public k01 x1;
    public Utilities.Callback y1;
    public Utilities.Callback z1;

    public p(Context context, FrameLayout frameLayout, pv0 pv0Var, FrameLayout frameLayout2, oh.b bVar, org.telegram.ui.Components.ba baVar) {
        super(context, frameLayout, pv0Var, frameLayout2, bVar, baVar);
        this.T0 = true;
        this.U0 = 0;
        q9 q9Var = (q9) this;
        this.X0 = new o(q9Var, q9Var);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.Y0 = j6Var;
        pr prVar = pr.f;
        j6Var.k(0.16f, 50L, prVar);
        j6Var.t(AndroidUtilities.dp(15.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.q("0:00.0", true, true);
        j6Var.r(-1);
        Paint paint = new Paint(1);
        this.c1 = paint;
        Paint paint2 = new Paint(1);
        this.d1 = paint2;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(11, LiteMode.FLAGS_CHAT);
        this.e1 = u9Var;
        org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(12, LiteMode.FLAGS_CHAT);
        this.f1 = u9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        u9Var.a = AndroidUtilities.dp(47.0f);
        u9Var.b = AndroidUtilities.dp(55.0f);
        u9Var.b();
        u9Var2.a = AndroidUtilities.dp(47.0f);
        u9Var2.b = AndroidUtilities.dp(55.0f);
        u9Var2.b();
        this.g1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.i1 = new org.telegram.ui.Components.z5(new l(q9Var, 0), 200L, prVar, 0);
        this.j1 = new Path();
        this.k1 = new Path();
        this.l1 = new Paint(1);
        this.m1 = new Paint(1);
        this.n1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.o1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        l lVar = new l(q9Var, 0);
        pr prVar2 = pr.h;
        this.p1 = new org.telegram.ui.Components.z5(lVar, 350L, prVar2);
        this.q1 = new RectF();
        this.r1 = new RectF();
        this.s1 = new RectF();
        this.t1 = new Path();
        this.D1 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar2);
        this.E1 = new org.telegram.ui.Components.z5(new l(q9Var, 0), 420L, prVar2, 0);
        this.F1 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar2);
        this.G1 = new org.telegram.ui.Components.z5(new l(q9Var, 0), 350L, prVar2, 0);
        this.M1 = new l(q9Var, 1);
        ImageView imageView = new ImageView(context);
        this.P0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, k7.c6.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(q9Var, 7));
        ImageView imageView2 = new ImageView(context);
        this.Q0 = imageView2;
        j jVar = new j(5);
        this.R0 = jVar;
        imageView2.setImageDrawable(jVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, k7.c6.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new q31(q9Var, frameLayout, bVar, 2));
    }

    public final void A(int i10, boolean z4) {
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                i11 = 2;
                break;
            } else if (N1[i11] == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (this.U0 == i11) {
            return;
        }
        this.U0 = i11;
        this.R0.d(i10 / 3600, false, z4);
    }

    public final void B() {
        if (this.W0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new mh.m5(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, this.a));
            }
        }
    }

    @Override // qh.k
    public final int b() {
        return 36;
    }

    @Override // qh.k
    public final void c(boolean z4) {
        int i10 = (z4 || !this.T0) ? 8 : 0;
        ImageView imageView = this.Q0;
        imageView.setVisibility(i10);
        this.P0.setVisibility(z4 ? 8 : 0);
        if (z4) {
            imageView.setVisibility(8);
        }
    }

    @Override // qh.k
    public final void d(boolean z4) {
        if (z4) {
            return;
        }
        this.Q0.setVisibility(this.T0 ? 0 : 8);
        this.P0.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r10.K1 == false) goto L67;
     */
    @Override // qh.k, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n nVar;
        Drawable drawable;
        if (this.L1 && (nVar = this.A1) != null && nVar.a != null && (drawable = this.V0) != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(drawable.getBounds());
            rectF.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
            int i10 = 0;
            while (true) {
                if (i10 >= motionEvent.getPointerCount()) {
                    break;
                }
                if (!AndroidUtilities.rectTmp.contains(motionEvent.getX(i10), motionEvent.getY(i10))) {
                    i10++;
                } else if (motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5) {
                    this.A1.a.switchCamera();
                    Drawable drawable2 = this.V0;
                    if (drawable2 instanceof AnimatedVectorDrawable) {
                        ((AnimatedVectorDrawable) drawable2).start();
                    }
                }
            }
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        ImageView imageView = this.P0;
        rectF2.set(imageView.getX(), imageView.getY(), imageView.getX() + imageView.getMeasuredWidth(), imageView.getY() + imageView.getMeasuredHeight());
        if (!this.K1 && (this.W0 || this.m0 || !rectF2.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.L1 && this.J1) {
                if (this.r1.contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, true);
                    this.K1 = false;
                    return true;
                }
            }
            if (this.L1) {
                if (this.q1.contains(motionEvent.getX(), motionEvent.getY()) || getBounds().contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, false);
                    this.K1 = false;
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        o oVar = this.X0;
        l lVar = this.M1;
        if (action != 0) {
            if (motionEvent.getAction() == 2) {
                if (!this.H1) {
                    this.Z0 = Utilities.clamp((this.B1 - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                    float clamp = Utilities.clamp((this.C1 - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                    this.a1 = clamp;
                    boolean z4 = this.J1;
                    if (!z4 && !this.H1 && this.Z0 >= 1.0f) {
                        this.H1 = true;
                        this.L1 = false;
                        imageView.setVisibility(4);
                        this.Q0.setVisibility(4);
                        oVar.g = true;
                        hj0 hj0Var = oVar.h;
                        hj0Var.Q(0.0f, true);
                        if (oVar.f) {
                            hj0Var.start();
                        }
                        n nVar2 = this.A1;
                        if (nVar2 != null) {
                            nVar2.x = true;
                            AndroidUtilities.cancelRunOnUIThread(nVar2.h);
                            CameraController.getInstance().stopVideoRecording(nVar2.a.getCameraSessionRecording(), false, false);
                            nVar2.a(false);
                        }
                        AndroidUtilities.runOnUIThread(lVar, 800L);
                    } else if (!z4 && !this.H1 && clamp >= 1.0f && this.Z0 < 0.4f) {
                        this.J1 = true;
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    invalidate();
                    n();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (!this.H1 && !this.J1) {
                    z(false, false);
                }
                this.K1 = false;
            }
            return this.K1;
        }
        if (this.L1) {
            this.K1 = false;
            z(false, false);
            return true;
        }
        this.K1 = true;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        q9 q9Var = (q9) this;
        boolean isCameraAllowed = CameraView.isCameraAllowed();
        ba baVar = q9Var.P1;
        if (!isCameraAllowed ? false : ba.d(baVar)) {
            AndroidUtilities.cancelRunOnUIThread(lVar);
            this.B1 = motionEvent.getX();
            this.C1 = motionEvent.getY();
            this.h1 = 0.0f;
            this.Z0 = 0.0f;
            this.D1.d(0.0f, true);
            this.E1.d(0.0f, true);
            this.H1 = false;
            this.I1 = false;
            this.J1 = false;
            oVar.g = false;
            hj0 hj0Var2 = oVar.h;
            hj0Var2.stop();
            hj0Var2.Q(0.0f, true);
            this.L1 = true;
            this.b1 = System.currentTimeMillis();
            this.H0 = true;
            this.I0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            invalidate();
            n();
            n nVar3 = new n(this, getContext());
            this.A1 = nVar3;
            n nVar4 = baVar.n1;
            if (nVar4 != null) {
                nVar4.a(true);
            }
            p9 p9Var = baVar.U0;
            if (p9Var != null) {
                p9Var.L = true;
                p9Var.c();
                p9 p9Var2 = baVar.U0;
                p9Var2.m(0L);
                la laVar = p9Var2.C;
                if (laVar != null) {
                    laVar.setProgress(0L);
                }
            }
            nVar3.n = new oh.z(1, q9Var, nVar3);
            nVar3.r = new l(q9Var, 2);
            m9 m9Var = baVar.e0;
            baVar.n1 = nVar3;
            m9Var.addView(nVar3, k7.c6.c(-1.0f, -1));
            return true;
        }
        return true;
    }

    @Override // qh.k
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.R).storyCaptionLengthLimitDefault;
    }

    @Override // qh.k
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.R).storyCaptionLengthLimitPremium;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override // qh.k
    public final void j(Canvas canvas, RectF rectF) {
        float f10;
        Paint paint;
        float f11;
        float f12;
        float f13;
        float f14;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.A1 != null) {
            float e6 = this.D1.e(this.H1);
            float e10 = this.F1.e(this.J1);
            if (this.b1 <= 0) {
                this.b1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin(((System.currentTimeMillis() - this.b1) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float dp = rectF.left + AndroidUtilities.dp(21.0f);
            float dp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            o oVar = this.X0;
            oVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            oVar.draw(canvas3);
            int dp3 = (int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e6));
            int dp4 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f));
            int dp5 = (int) (rectF.left + AndroidUtilities.dp(133.3f));
            int dp6 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.j6 j6Var = this.Y0;
            j6Var.setBounds(dp3, dp4, dp5, dp6);
            long b10 = this.A1.b();
            int i10 = (int) (b10 / 1000);
            int i11 = (int) ((b10 - (i10 * MediaDataController.MAX_STYLE_RUNS_COUNT)) / 100);
            int i12 = i10 / 60;
            int i13 = i10 % 60;
            StringBuilder sb = new StringBuilder();
            sb.append(i12);
            sb.append(":");
            sb.append(i13 < 10 ? "0" : "");
            sb.append(i13);
            sb.append(".");
            sb.append(i11);
            j6Var.q(sb.toString(), true, true);
            j6Var.w = (int) ((1.0f - e6) * 255.0f);
            j6Var.draw(canvas3);
            float f15 = 1.0f - e10;
            float f16 = (1.0f - this.Z0) * f15;
            Paint c3 = this.M.c(1.0f);
            if (c3 != null) {
                f10 = f16;
                paint = c3;
                f11 = 10.0f;
                f12 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f10 = f16;
                paint = c3;
                f11 = 10.0f;
                f12 = 12.0f;
            }
            if (f10 > 0.0f) {
                if (this.u1 == null) {
                    this.u1 = new k01(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.v1 == null) {
                    Path path = new Path();
                    this.v1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.v1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.v1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f11));
                    Paint paint2 = new Paint(1);
                    this.w1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.w1.setStrokeCap(Paint.Cap.ROUND);
                    this.w1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.w1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.u1.p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - j6Var.d());
                float c10 = yh.c(1.0f, this.Z0, AndroidUtilities.dp(6.0f) * sin, (rectF.centerX() - ((this.u1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.Z0, 1.0f, e10) * (rectF.width() / 6.0f)));
                int l1 = org.telegram.ui.ActionBar.k6.l1(f10, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(c10, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.w1.setColor(l1);
                canvas3.drawPath(this.v1, this.w1);
                canvas3.restore();
                f13 = 15.0f;
                f14 = 0.0f;
                this.u1.c(c10 + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, l1, canvas3);
            } else {
                f13 = 15.0f;
                f14 = 0.0f;
            }
            if (e10 > f14) {
                if (this.x1 == null) {
                    this.x1 = new k01(LocaleController.getString(R.string.CancelRound), f13, AndroidUtilities.bold());
                }
                this.x1.p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - j6Var.d());
                float width = ((rectF.width() / 4.0f) * f15) + (rectF.centerX() - (this.x1.l() / 2.0f));
                canvas2 = canvas;
                this.x1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.k6.l1(e10, paint != null ? -1 : -2130706433), canvas2);
                this.r1.set(width - AndroidUtilities.dp(f12), rectF.top, this.x1.l() + width + AndroidUtilities.dp(f12), rectF.bottom);
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

    @Override // qh.k
    public final void k(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        if (f10 <= 0.0f) {
            return;
        }
        boolean z4 = this.H1;
        org.telegram.ui.Components.z5 z5Var = this.E1;
        float e6 = z5Var.e(z4);
        boolean z10 = this.J1;
        org.telegram.ui.Components.z5 z5Var2 = this.G1;
        float e10 = z5Var2.e(z10);
        float d = this.i1.d(this.h1, false);
        float f14 = 1.0f - e6;
        float w10 = e2.c.w(1.0f, this.Z0, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f)) * f14 * f10;
        float lerp = AndroidUtilities.lerp(yh.c(1.0f, e10, getWidth() * 0.35f * this.Z0, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e6);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
        Paint paint = this.d1;
        if (isEnabled) {
            float dp2 = AndroidUtilities.dp(47.0f);
            org.telegram.ui.Components.u9 u9Var = this.e1;
            u9Var.a = dp2;
            Paint paint2 = u9Var.d;
            f13 = 0.0f;
            u9Var.b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            float dp3 = AndroidUtilities.dp(50.0f);
            f11 = e10;
            org.telegram.ui.Components.u9 u9Var2 = this.f1;
            u9Var2.a = dp3;
            Paint paint3 = u9Var2.d;
            f12 = f14;
            u9Var2.b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            u9Var2.e(d, 1.01f);
            u9Var.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.k6.l1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f15 = w10 / u9Var2.a;
            canvas.scale(f15, f15, lerp, dp);
            u9Var2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.k6.l1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f16 = w10 / u9Var.a;
            canvas.scale(f16, f16, lerp, dp);
            u9Var.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f11 = e10;
            f12 = f14;
            f13 = 0.0f;
        }
        float min = Math.min(w10, AndroidUtilities.dp(55.0f));
        float f17 = f10 * 255.0f;
        paint.setAlpha((int) f17);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.j1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.g1;
        drawable.setBounds((int) (lerp - (((drawable.getIntrinsicWidth() / 2.0f) * f12) * (this.I1 ? f10 : 1.0f))), (int) (dp - (((drawable.getIntrinsicHeight() / 2.0f) * f12) * (this.I1 ? f10 : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f12 * (this.I1 ? f10 : 1.0f)) + lerp), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f12 * (this.I1 ? f10 : 1.0f)) + dp));
        drawable.setAlpha((int) (f12 * 255.0f * (this.I1 ? f10 : 1.0f)));
        drawable.draw(canvas);
        if (f11 > f13) {
            float dpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f11 * f10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(lerp - dpf2, dp - dpf2, lerp + dpf2, dp + dpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.c1);
        }
        canvas.restore();
        float f18 = z5Var.c;
        float f19 = z5Var2.c;
        float y10 = org.telegram.messenger.y3.y(1.0f, f18, AndroidUtilities.lerp(this.p1.e(this.Z0 < 0.4f), 0.0f, f19), f10);
        float dp4 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f19) * y10) / 2.0f;
        float f20 = 1.0f - f19;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.a1) * f20), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - y10);
        float dp5 = (AndroidUtilities.dp(36.0f) * y10) / 2.0f;
        RectF rectF3 = this.q1;
        rectF3.set(dp4 - dp5, lerp3 - lerp2, dp5 + dp4, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f19);
        float dp6 = AndroidUtilities.dp(1.0f);
        float dp7 = AndroidUtilities.dp(0.66f);
        int l1 = org.telegram.ui.ActionBar.k6.l1(y10, TLObject.FLAG_29);
        Paint paint4 = this.m1;
        paint4.setShadowLayer(dp6, 0.0f, dp7, l1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c3 = this.O.c(y10);
        if (c3 == null) {
            Paint paint5 = this.l1;
            paint5.setColor(TLObject.FLAG_30);
            paint5.setAlpha((int) (64.0f * y10));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c3);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * y10));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(y10, y10, dp4, lerp3);
        int l12 = org.telegram.ui.ActionBar.k6.l1(y10, -1);
        Paint paint7 = this.n1;
        paint7.setColor(l12);
        int l13 = org.telegram.ui.ActionBar.k6.l1(y10 * f20, -1);
        Paint paint8 = this.o1;
        paint8.setColor(l13);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f19);
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f19);
        float dp8 = (AndroidUtilities.dp(4.0f) * f20) + lerp3;
        canvas.rotate(this.a1 * 12.0f * f20, dp4, dp8);
        float f21 = lerp5 / 2.0f;
        float f22 = lerp6 / 2.0f;
        float f23 = dp8 - f22;
        RectF rectF4 = this.s1;
        rectF4.set(dp4 - f21, f23, f21 + dp4, dp8 + f22);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f19 < 1.0f) {
            canvas.save();
            canvas.rotate(this.a1 * 12.0f * f20, dp4, f23);
            canvas.translate(0.0f, f22 * f19);
            canvas.scale(f20, f20, dp4, f23);
            Path path2 = this.t1;
            path2.rewind();
            float dp9 = AndroidUtilities.dp(4.33f);
            float dp10 = f23 - AndroidUtilities.dp(3.66f);
            float f24 = dp4 + dp9;
            path2.moveTo(f24, AndroidUtilities.dp(3.66f) + dp10);
            path2.lineTo(f24, dp10);
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f25 = dp4 - dp9;
            rectF5.set(f25, dp10 - dp9, f24, dp9 + dp10);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f25, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.a1), 1.0f, f19) * AndroidUtilities.dp(3.66f)) + dp10);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.H1) {
            ImageView imageView = this.P0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.z5 z5Var3 = this.J0;
            ImageView imageView2 = this.Q0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || z5Var3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.l0) * 255.0f), 31);
                Path path3 = this.k1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || z5Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || z5Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.V0 == null) {
            this.V0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.V0.setAlpha((int) (f17 * f12));
        float timelineHeight = getTimelineHeight();
        this.V0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.V0.draw(canvas);
    }

    @Override // qh.k, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o oVar = this.X0;
        hj0 hj0Var = oVar.h;
        oVar.f = true;
        if (oVar.g) {
            hj0Var.start();
        }
        hj0Var.s0 = oVar.i;
    }

    @Override // qh.k, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o oVar = this.X0;
        oVar.f = false;
        hj0 hj0Var = oVar.h;
        hj0Var.stop();
        hj0Var.s0 = null;
    }

    public void setAmplitude(double d) {
        this.h1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z4) {
        int i10 = z4 ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.P0;
        imageView.setImageResource(i10);
        imageView.setContentDescription(LocaleController.getString(z4 ? R.string.AccDescrRemoveRoundVideo : R.string.AccDescrVideoMessage));
        this.W0 = z4;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.y1 = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.z1 = callback;
    }

    public void setPeriod(int i10) {
        A(i10, true);
    }

    public void setPeriodVisible(boolean z4) {
        this.T0 = z4;
        this.Q0.setVisibility((!z4 || this.m0) ? 8 : 0);
    }

    @Override // qh.k
    public final void u(float f10) {
        float f11 = 1.0f - f10;
        this.Q0.setAlpha(f11);
        this.P0.setAlpha(f11);
    }

    public final void z(boolean z4, boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.M1);
        this.I1 = true;
        this.L1 = false;
        int dp = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.Z0));
        this.H0 = false;
        this.I0 = dp;
        invalidate();
        n nVar = this.A1;
        if (nVar != null) {
            if (!z4) {
                if (z10) {
                    nVar.x = true;
                    AndroidUtilities.cancelRunOnUIThread(nVar.h);
                    CameraController.getInstance().stopVideoRecording(nVar.a.getCameraSessionRecording(), false, false);
                    nVar.a(false);
                } else {
                    nVar.c();
                }
            }
            this.A1 = null;
        }
        n();
    }
}
