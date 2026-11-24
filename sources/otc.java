// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class otc extends FrameLayout {
    public static final /* synthetic */ int J = 0;
    public AnimatorSet E;
    public int F;
    public int G;
    public final frc H;
    public final /* synthetic */ stc I;
    public final ImageReceiver a;
    public boolean b;
    public final TextPaint c;
    public StaticLayout d;
    public StaticLayout e;
    public final Paint f;
    public final Paint h;
    public final Paint n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otc(stc stcVar, Activity activity) {
        super(activity);
        this.I = stcVar;
        this.y = true;
        this.H = new frc(this, (byte) 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(gl.L(12.0f));
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.n = paint3;
        paint3.setColor(-1);
        this.a = new ImageReceiver(this);
    }

    public final void a() {
        frc frcVar = this.H;
        gl.r(frcVar);
        if (this.y && this.I.a.c0()) {
            gl.d3(frcVar, 3000L);
        }
    }

    public final void b(int i) {
        if (this.s == i || i < 0 || this.I.I) {
            return;
        }
        this.s = i;
        StaticLayout staticLayout = new StaticLayout(gl.g0(this.s, false, false), this.c, gl.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.r = (int) Math.ceil(this.d.getLineWidth(0));
        }
        invalidate();
    }

    public final void c(int i) {
        if (this.b || i < 0 || this.I.I) {
            return;
        }
        this.w = i;
        this.e = new StaticLayout(gl.g0(this.w, false, false), this.c, gl.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public final void d(boolean z, boolean z2) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z3 = this.y;
        Property property = View.ALPHA;
        if (z3) {
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.E = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<otc, Float>) property, 1.0f));
                this.E.setDuration(150L);
                this.E.addListener(new ntc(this, (byte) 0));
                this.E.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z2) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.E = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<otc, Float>) property, 0.0f));
            this.E.setDuration(150L);
            this.E.addListener(new ntc(this, (byte) 1));
            this.E.start();
        } else {
            setAlpha(0.0f);
        }
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int L;
        int L2;
        Canvas canvas2;
        int i;
        stc stcVar = this.I;
        if (stcVar.Q) {
            if (stcVar.N && stcVar.O != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - stcVar.M;
                stcVar.M = currentTimeMillis;
                float f = stcVar.O - (j / 150.0f);
                stcVar.O = f;
                if (f < 0.0f) {
                    stcVar.O = 0.0f;
                }
                invalidate();
            }
            float f2 = stcVar.O;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f2);
            imageReceiver.h(canvas, null);
        }
        if (stcVar.a.d == null || stcVar.I) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!stcVar.V) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - gl.L(58.0f)) - this.r, measuredHeight - gl.L((stcVar.U ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(gl.L(18.0f), measuredHeight - gl.L((stcVar.U ? 6 : 10) + 29));
                this.e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.s != 0) {
            int i2 = 0;
            if (stcVar.V) {
                L = measuredHeight - gl.L(3.0f);
                L2 = gl.L(7.0f);
            } else if (stcVar.U) {
                L = measuredHeight - gl.L(29.0f);
                i2 = gl.L(36.0f) + this.r;
                measuredWidth = (measuredWidth - gl.L(76.0f)) - this.r;
                L2 = gl.L(28.0f);
            } else {
                L = measuredHeight - gl.L(13.0f);
                L2 = gl.L(12.0f);
            }
            int i3 = measuredHeight - L2;
            boolean z = stcVar.U;
            Paint paint = this.h;
            if (z) {
                canvas.drawRect(i2, L, measuredWidth, gl.L(3.0f) + L, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i4 = this.b ? this.G : ((int) ((this.w / this.s) * (measuredWidth - i2))) + i2;
            int i5 = this.x;
            if (i5 != 0 && (i = this.s) != 0) {
                float f3 = i2;
                float f4 = L;
                float A = b00.A(i5, i, measuredWidth - i2, f3);
                float L3 = gl.L(3.0f) + L;
                if (stcVar.U) {
                    paint = this.n;
                }
                canvas2.drawRect(f3, f4, A, L3, paint);
            }
            float f5 = i4;
            float L4 = gl.L(3.0f) + L;
            Paint paint2 = this.f;
            canvas2.drawRect(i2, L, f5, L4, paint2);
            if (stcVar.V) {
                return;
            }
            canvas2.drawCircle(f5, i3, gl.L(this.b ? 7.0f : 5.0f), paint2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.y) {
            onTouchEvent(motionEvent);
            return this.b;
        }
        d(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i;
        int i2;
        stc stcVar = this.I;
        lbc lbcVar = stcVar.a;
        if (stcVar.U) {
            i = gl.L(36.0f) + this.r;
            measuredWidth = (getMeasuredWidth() - gl.L(76.0f)) - this.r;
            measuredHeight = getMeasuredHeight() - gl.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - gl.L(12.0f);
            i = 0;
        }
        int i3 = this.s;
        if (i3 != 0) {
            i2 = (int) ((this.w / i3) * (measuredWidth - i));
        } else {
            i2 = 0;
        }
        int i4 = i2 + i;
        int action = motionEvent.getAction();
        frc frcVar = this.H;
        if (action == 0) {
            if (!this.y || stcVar.V || stcVar.I) {
                d(true, true);
            } else if (this.s != 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x >= i4 - gl.L(10.0f) && x <= gl.L(10.0f) + i4 && y >= measuredHeight - gl.L(10.0f) && y <= gl.L(10.0f) + measuredHeight) {
                    this.b = true;
                    this.F = x;
                    this.G = i4;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            gl.r(frcVar);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (stcVar.x && lbcVar.c0()) {
                gl.d3(frcVar, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (stcVar.x) {
                    int i5 = (int) (((this.G - i) / (measuredWidth - i)) * this.s);
                    this.w = i5;
                    lbcVar.p0(i5 * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.b) {
            int x2 = (int) motionEvent.getX();
            int i6 = this.G - (this.F - x2);
            this.G = i6;
            this.F = x2;
            if (i6 < i) {
                this.G = i;
                i6 = i;
            } else if (i6 > measuredWidth) {
                this.G = measuredWidth;
                i6 = measuredWidth;
            }
            c((int) (((i6 - i) / (measuredWidth - i)) * this.s * 1000));
            invalidate();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        a();
    }
}
