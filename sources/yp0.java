// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class yp0 extends View {
    public final RectF E;
    public final RectF F;
    public final n41 G;
    public final RectF H;
    public final RectF I;
    public final n41 J;
    public final long K;
    public boolean L;
    public final lm M;
    public boolean N;
    public final lm O;
    public boolean P;
    public final lm Q;
    public final tgb R;
    public final tgb S;
    public final xl3 T;
    public tgb U;
    public Drawable V;
    public Drawable W;
    public final Paint a;
    public RenderNode a0;
    public final Paint b;
    public final oz b0;
    public final Paint c;
    public Runnable c0;
    public final Path d;
    public Runnable d0;
    public final Paint e;
    public Runnable e0;
    public final Path f;
    public Object f0;
    public WebView g0;
    public final RectF h;
    public int h0;
    public final RectF n;
    public final n41 r;
    public final RectF s;
    public final RectF w;
    public final n41 x;
    public final RectF y;

    public yp0(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Path();
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Path path = new Path();
        this.f = path;
        this.h = new RectF();
        this.n = new RectF();
        this.r = new n41((View) null);
        this.s = new RectF();
        this.w = new RectF();
        this.x = new n41(this);
        this.y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new n41(this);
        this.H = new RectF();
        this.I = new RectF();
        this.J = new n41(this);
        s33 s33Var = s33.h;
        this.M = new lm(this, 0L, 320L, s33Var);
        this.N = true;
        this.O = new lm(this, 0L, 420L, s33Var);
        this.P = false;
        this.Q = new lm(this, 0L, 420L, s33Var);
        this.T = new xl3((byte) 7);
        this.b0 = new oz(this, (byte) 20);
        this.K = System.currentTimeMillis();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.R = new tgb(k96.M0(2131753060, null), 13.0f, gl.o());
        this.S = new tgb(k96.M0(2131753059, null), 13.0f, gl.o());
        paint2.setPathEffect(new CornerPathEffect(gl.L(1.0f)));
        path.rewind();
        path.moveTo(-gl.N(1.33f), gl.N(0.16f));
        path.lineTo(-gl.N(1.33f), -gl.N(3.5f));
        path.lineTo(gl.N(1.33f), -gl.N(3.5f));
        path.lineTo(gl.N(1.33f), gl.N(0.16f));
        path.lineTo(gl.N(3.5f), gl.N(0.16f));
        path.lineTo(0.0f, gl.N(3.5f));
        path.lineTo(-gl.N(3.5f), gl.N(0.16f));
        path.close();
    }

    public final n41 a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? this.r : this.J : this.G : this.x;
    }

    public final int b(MotionEvent motionEvent) {
        if (this.w.contains(motionEvent.getX(), motionEvent.getY())) {
            return 1;
        }
        if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
            return 2;
        }
        return this.I.contains(motionEvent.getX(), motionEvent.getY()) ? 3 : 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float L;
        float f2;
        float f3;
        WebView webView;
        super.onDraw(canvas);
        Paint paint = this.b;
        paint.setColor(-1);
        Paint paint2 = this.c;
        paint2.setColor(-1);
        paint2.setStrokeWidth(gl.L(2.0f));
        Path path = this.d;
        path.rewind();
        float width = getWidth();
        RectF rectF = this.h;
        float L2 = (width - rectF.right) - gl.L(79.66f);
        float L3 = rectF.top + gl.L(8.0f);
        float width2 = (getWidth() - rectF.right) - gl.L(8.0f);
        float L4 = rectF.top + gl.L(38.0f);
        RectF rectF2 = this.y;
        rectF2.set(L2, L3, width2, L4);
        float f4 = rectF2.left;
        float f5 = rectF2.top;
        float centerX = rectF2.centerX();
        float f6 = rectF2.bottom;
        RectF rectF3 = this.E;
        rectF3.set(f4, f5, centerX, f6);
        this.F.set(rectF3.left - gl.L(8.0f), rectF3.top - gl.L(8.0f), rectF3.right, rectF3.bottom + gl.L(8.0f));
        float centerX2 = rectF2.centerX();
        float f7 = rectF2.top;
        float f8 = rectF2.right;
        float f9 = rectF2.bottom;
        RectF rectF4 = this.H;
        rectF4.set(centerX2, f7, f8, f9);
        this.I.set(rectF4.left, rectF4.top - gl.L(8.0f), rectF4.right + gl.L(8.0f), rectF4.bottom + gl.L(8.0f));
        float L5 = gl.L(15.0f);
        float L6 = gl.L(15.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, L5, L6, direction);
        float d = this.M.d(this.L);
        float d2 = this.O.d(this.N);
        float L7 = (rectF2.left - gl.L(18.0f)) - (rectF.left + gl.L(38.0f));
        tgb tgbVar = this.U;
        if (tgbVar == null) {
            f = 18.0f;
            L = 0.0f;
        } else {
            f = 18.0f;
            L = tgbVar.c + gl.L(this.V != null ? 30.0f : 12.0f);
        }
        float min = Math.min(L7, L);
        float R1 = gl.R1(gl.R1(this.S.c, this.R.c, d) + gl.L(12.0f), min, d2);
        float L8 = rectF.left + gl.L(8.0f);
        float L9 = rectF.top + gl.L(8.0f);
        float L10 = rectF.left + gl.L(38.0f) + R1;
        float L11 = rectF.top + gl.L(38.0f);
        RectF rectF5 = this.n;
        rectF5.set(L8, L9, L10, L11);
        float f10 = rectF5.left;
        float f11 = rectF5.bottom;
        RectF rectF6 = this.s;
        rectF6.set(f10, rectF5.top, gl.L(30.0f) + f10, f11);
        RectF rectF7 = this.w;
        rectF7.set(rectF6);
        rectF7.right = gl.R1(rectF5.right, rectF6.left + gl.L(30.0f), d2);
        rectF7.inset(-gl.L(8.0f), -gl.L(8.0f));
        path.addRoundRect(rectF5, gl.L(15.0f), gl.L(15.0f), direction);
        Object obj = this.f0;
        Paint paint3 = this.a;
        if (obj == null || Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || !((webView = this.g0) == null || webView.getLayerType() == 2)) {
            paint3.setColor(bkb.p1(0.35f, -16777216));
            canvas.drawPath(path, paint3);
        } else {
            if (this.a0 == null) {
                RenderNode renderNode = new RenderNode("bot_fullscreen_blur");
                this.a0 = renderNode;
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(gl.L(f), gl.L(f), Shader.TileMode.CLAMP));
            }
            RenderNode e = qm0.e(this.f0);
            this.a0.setPosition(0, 0, b00.c(16.0f, e.getWidth(), 1), Math.max(1, (int) Math.min(rectF.top + gl.L(46.0f), e.getHeight())));
            RecordingCanvas beginRecording = this.a0.beginRecording();
            beginRecording.translate(-gl.L(8.0f), 0.0f);
            beginRecording.drawRenderNode(e);
            this.a0.endRecording();
            canvas.save();
            canvas.clipPath(path);
            canvas.save();
            canvas.translate(gl.L(8.0f), 0.0f);
            canvas.drawRenderNode(this.a0);
            canvas.restore();
            paint3.setColor(bkb.p1(0.22f, -16777216));
            canvas.drawPaint(paint3);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(rectF6.centerX(), rectF6.centerY());
        n41 n41Var = this.x;
        float a = n41Var.a(0.1f);
        canvas.scale(a, a);
        canvas.translate((-gl.L(6.5f)) * d, 0.0f);
        float R12 = gl.R1(gl.L(4.66f), gl.L(5.5f), d);
        float f12 = -R12;
        canvas.drawLine(gl.R1(f12, 0.0f, d), gl.R1(f12, 0.0f, d), R12, R12, paint2);
        canvas.drawLine(gl.R1(f12, 0.0f, d), gl.R1(R12, 0.0f, d), R12, f12, paint2);
        if (d > 0.0f) {
            canvas.drawLine(0.0f, 0.0f, gl.L(11.6f) * d, 0.0f, paint2);
        }
        canvas.restore();
        Canvas canvas2 = canvas;
        canvas2.saveLayerAlpha((rectF5.left + gl.L(30.0f)) - gl.L(10.0f), rectF5.top, rectF5.right, rectF5.bottom, kk7.d4, 31);
        if (d2 <= 0.0f || this.U == null) {
            f2 = d2;
            f3 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate(ls6.B(1.0f, d2, min, rectF5.left + gl.L(30.0f)), rectF5.centerY());
            tgb tgbVar2 = this.U;
            tgbVar2.p = ((rectF5.right - gl.L(this.V != null ? 30.0f : 12.0f)) - (rectF5.left + gl.L(30.0f))) + 2.0f;
            f3 = 1.0f;
            tgbVar2.c(0.0f, 0.0f, d2, -1, canvas);
            f2 = d2;
            canvas2 = canvas;
            canvas2.translate(this.U.j() + gl.L(5.0f), 0.0f);
            int L12 = gl.L(16.0f);
            Drawable drawable = this.V;
            if (drawable != null) {
                drawable.setBounds(0, (-L12) / 2, L12, L12 / 2);
                this.V.setAlpha((int) (75.0f * f2));
                this.V.draw(canvas2);
            }
            Drawable drawable2 = this.W;
            if (drawable2 != null) {
                drawable2.setBounds(0, (-L12) / 2, L12, L12 / 2);
                this.W.setAlpha((int) (255.0f * f2));
                this.W.draw(canvas2);
            }
            RectF rectF8 = gl.P;
            rectF8.set((rectF5.left + gl.L(30.0f)) - gl.L(10.0f), rectF5.top, rectF5.left + gl.L(30.0f), rectF5.bottom);
            this.T.s(canvas2, rectF8, 2, 1.0f);
            canvas2.restore();
        }
        if (f2 < f3) {
            canvas2.save();
            float a2 = n41Var.a(0.1f);
            canvas2.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
            float f13 = f3 - d;
            if (f13 > 0.0f) {
                this.S.c(((rectF6.left + gl.L(30.0f)) - (gl.L(12.0f) * d)) + (gl.L(32.0f) * f2), rectF6.centerY(), (f3 - f2) * f13, -1, canvas);
            }
            if (d > 0.0f) {
                this.R.c((gl.L(12.0f) * f13) + rectF6.left + gl.L(30.0f) + (gl.L(32.0f) * f2), rectF6.centerY(), (f3 - f2) * d, -1, canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF3.centerX() + gl.L(2.0f), rectF3.centerY());
        float a3 = this.G.a(0.1f);
        canvas2.scale(a3, a3);
        float L13 = gl.L(6.0f);
        float L14 = gl.L(3.0f);
        float f14 = -L14;
        canvas2.drawLine(-L13, f14, 0.0f, L14, paint2);
        canvas.drawLine(0.0f, L14, L13, f14, paint2);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF4.centerX() + gl.L(f3), rectF4.centerY());
        float a4 = this.J.a(0.1f);
        canvas.scale(a4, a4);
        canvas.drawCircle(0.0f, -gl.L(5.0f), gl.L(1.66f), paint);
        canvas.drawCircle(0.0f, 0.0f, gl.L(1.66f), paint);
        canvas.drawCircle(0.0f, gl.L(5.0f), gl.L(1.66f), paint);
        float d3 = this.Q.d(this.P);
        if (d3 > 0.0f) {
            canvas.translate(-gl.N(8.166f), gl.N(3.5f));
            float f15 = (d3 * 0.5f) + 0.5f;
            canvas.scale(f15, f15);
            int p1 = bkb.p1(0.4f, -1);
            Paint paint4 = this.e;
            paint4.setColor(p1);
            Path path2 = this.f;
            canvas.drawPath(path2, paint4);
            float currentTimeMillis = ((System.currentTimeMillis() - this.K) % 450) / 450.0f;
            float f16 = 0.5f + currentTimeMillis;
            canvas.save();
            canvas.clipRect(-gl.L(5.0f), gl.R1(-gl.N(3.5f), gl.N(3.5f), currentTimeMillis), gl.L(5.0f), gl.R1(-gl.N(3.5f), gl.N(3.5f), f16));
            paint4.setColor(bkb.p1(f3, -1));
            canvas.drawPath(path2, paint4);
            canvas.restore();
            if (f16 > f3) {
                canvas.save();
                canvas.clipRect(-gl.L(5.0f), gl.R1(-gl.N(3.5f), gl.N(3.5f), 0.0f), gl.L(5.0f), gl.R1(-gl.N(3.5f), gl.N(3.5f), f16 - f3));
                paint4.setColor(bkb.p1(f3, -1));
                canvas.drawPath(path2, paint4);
                canvas.restore();
            }
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (motionEvent.getAction() == 0) {
            a(this.h0).c(false);
            int b = b(motionEvent);
            this.h0 = b;
            a(b).c(true);
        } else if (motionEvent.getAction() == 2) {
            if (b(motionEvent) != this.h0) {
                this.h0 = 0;
                a(0).c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            int i = this.h0;
            if (i == 1 && (runnable3 = this.c0) != null) {
                runnable3.run();
            } else if (i == 2 && (runnable2 = this.d0) != null) {
                runnable2.run();
            } else if (i == 3 && (runnable = this.e0) != null) {
                runnable.run();
            }
            a(this.h0).c(false);
            this.h0 = 0;
        } else if (motionEvent.getAction() == 3) {
            a(this.h0).c(false);
            this.h0 = 0;
        }
        return this.h0 != 0;
    }

    public void setBack(boolean z) {
        this.L = z;
        invalidate();
    }

    public void setDownloading(boolean z) {
        if (this.P == z) {
            return;
        }
        this.P = z;
        invalidate();
    }

    public void setInsets(RectF rectF) {
        this.h.set(rectF);
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.c0 = runnable;
    }

    public void setOnCollapseClickListener(Runnable runnable) {
        this.d0 = runnable;
    }

    public void setOnMenuClickListener(Runnable runnable) {
        this.e0 = runnable;
    }

    public void setParentRenderNode(Object obj) {
        this.f0 = obj;
    }

    public void setWebView(WebView webView) {
        this.g0 = webView;
    }

    public void setInsets(Rect rect) {
        this.h.set(rect);
    }
}
