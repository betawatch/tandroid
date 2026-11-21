package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseArray;
import android.widget.ImageView;
import fi.s2;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class b1 extends ImageView {
    public static final /* synthetic */ int M = 0;
    public Paint E;
    public ImageReceiver F;
    public p5 G;
    public float H;
    public boolean I;
    public boolean J;
    public org.telegram.ui.Components.voip.n K;
    public Integer L;
    public final int a;
    public final float[] b;
    public final s1 c;
    public final h6 d;
    public boolean e;
    public final float f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public LinearGradient w;
    public final Path x;
    public Paint y;

    public b1(int i7, Context context, h6 h6Var) {
        super(context);
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.w = null;
        this.x = new Path();
        this.y = new Paint(1);
        this.H = 1.0f;
        this.a = i7;
        this.d = h6Var;
        setImageResource(i7 == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i7 == 0) {
            s1 s1Var = new s1(5);
            this.c = s1Var;
            s1Var.g();
            s1Var.M = false;
            s1Var.s = 4;
            s1Var.t = 4;
            s1Var.r = 2;
            s1Var.o = 0.1f;
            s1Var.c();
            return;
        }
        if (i7 == 2) {
            this.f = 0.8f;
            this.y.setColor(m6.x0(null, m6.a7, false));
        } else if (i7 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i7 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (!this.e || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int i7 = this.n;
        float[] fArr = this.b;
        Color.colorToHSV(i7, fArr);
        fArr[1] = fArr[1] * 1.0f;
        if (fArr[2] > 0.7f) {
            fArr[2] = 0.7f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        int i10 = m6.d6;
        h6 h6Var = this.d;
        int f10 = i0.a.f(0.5f, HSVToColor, m6.w0(i10, h6Var));
        int f11 = i0.a.f(0.4f, HSVToColor, m6.w0(i10, h6Var));
        if (this.w != null && this.r == f11 && this.s == f10) {
            return;
        }
        if (this.J) {
            Paint paint = this.y;
            this.E = paint;
            paint.setAlpha(ks.e4);
            this.H = 0.0f;
        }
        this.y = new Paint(1);
        float measuredHeight = getMeasuredHeight();
        this.r = f11;
        this.s = f10;
        LinearGradient linearGradient = new LinearGradient(0.0f, measuredHeight, 0.0f, 0.0f, new int[]{f11, f10}, (float[]) null, Shader.TileMode.CLAMP);
        this.w = linearGradient;
        this.y.setShader(linearGradient);
        invalidate();
    }

    public ImageReceiver getImageReceiver() {
        return this.F;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        if (this.a != 0) {
            a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.y;
        if (paint != null && this.a != 2) {
            paint.setShader(null);
            this.y = null;
        }
        this.w = null;
        this.J = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int intValue;
        s2 s2Var;
        if (this.I) {
            ImageReceiver imageReceiver = this.F;
            if (imageReceiver == null || imageReceiver.n() == null) {
                p5 p5Var = this.G;
                if (p5Var != null) {
                    SparseArray sparseArray = p5.r;
                    long h = p5Var.h();
                    if (h != 0) {
                        if (p5.x == null) {
                            p5.x = new HashMap();
                        }
                        Integer num = (Integer) p5.x.get(Long.valueOf(h));
                        if (num == null && (s2Var = p5Var.k) != null && s2Var.n() != null) {
                            HashMap hashMap = p5.x;
                            Long valueOf = Long.valueOf(h);
                            Integer valueOf2 = Integer.valueOf(org.telegram.messenger.g0.J0(p5Var.k.n()));
                            hashMap.put(valueOf, valueOf2);
                            num = valueOf2;
                        }
                        if (num != null) {
                            intValue = num.intValue();
                            if (intValue == 0) {
                                this.I = false;
                                setColor(intValue);
                            } else {
                                invalidate();
                            }
                        }
                    }
                    intValue = 0;
                    if (intValue == 0) {
                    }
                } else {
                    invalidate();
                }
            } else {
                this.I = false;
                setColor(org.telegram.messenger.g0.J0(this.F.n()));
            }
        }
        Paint paint = this.y;
        if (paint != null) {
            int i7 = this.a;
            if (i7 == 2) {
                float measuredWidth = getMeasuredWidth() / 2.0f;
                canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2.0f, measuredWidth, this.y);
            } else if (i7 == 0) {
                int i10 = this.n;
                Path path = this.x;
                if (i10 != 0) {
                    canvas.drawPath(path, paint);
                } else {
                    ia.e.d().f(-org.telegram.messenger.g0.L(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, ia.e.d().e());
                }
                if (this.K == null) {
                    this.K = new org.telegram.ui.Components.voip.n();
                }
                this.K.f = getMeasuredWidth() / 2;
                org.telegram.ui.Components.voip.n nVar = this.K;
                nVar.k = false;
                nVar.c(this);
                canvas.drawPath(path, nVar.a);
                if (nVar.k) {
                    canvas.drawPath(path, nVar.c);
                }
                canvas.save();
                canvas.clipPath(path);
                this.c.d(canvas);
                canvas.restore();
                invalidate();
            } else {
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                if (this.E == null) {
                    this.H = 1.0f;
                }
                float f10 = this.H;
                if (f10 != 1.0f) {
                    this.y.setAlpha((int) (f10 * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.E);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    float f11 = this.H + 0.10666667f;
                    this.H = f11;
                    if (f11 > 1.0f) {
                        this.H = 1.0f;
                        this.E = null;
                    }
                    invalidate();
                    this.y.setAlpha(ks.e4);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                }
            }
        }
        float f12 = this.f;
        boolean z10 = f12 != 1.0f;
        if (z10) {
            canvas.save();
            canvas.scale(f12, f12, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        this.J = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.a != 0) {
            a();
            return;
        }
        Path path = this.x;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float width = rectF.width() / 2.0f;
        float centerY = rectF.centerY();
        float width2 = rectF.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, centerY, width2, direction);
        rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.N(0.2f), getMeasuredHeight());
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), direction);
        path.close();
        s1 s1Var = this.c;
        s1Var.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        s1Var.a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        this.G = p5Var;
        if (p5Var != null) {
            this.I = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.L = num;
    }

    public void setColor(int i7) {
        this.h = true;
        Integer num = this.L;
        if (num != null) {
            i7 = m6.w(i7, num.intValue());
        }
        if (this.n != i7) {
            this.n = i7;
            int i10 = this.a;
            if (i10 == 0 || i10 == 2) {
                Paint paint = this.y;
                if (paint != null) {
                    paint.setColor(i7);
                }
            } else {
                a();
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.F = imageReceiver;
        if (imageReceiver != null) {
            this.I = true;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.a != 0) {
            setImageResource(z10 ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
