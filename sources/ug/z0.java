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
import di.z2;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i5;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class z0 extends ImageView {
    public static final /* synthetic */ int L = 0;
    public Paint D;
    public ImageReceiver E;
    public i5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.n J;
    public Integer K;
    public final int a;
    public final float[] b;
    public final p1 c;
    public final f6 d;
    public boolean e;
    public final float f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public LinearGradient w;
    public final Path x;
    public Paint y;

    public z0(int i7, Context context, f6 f6Var) {
        super(context);
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.w = null;
        this.x = new Path();
        this.y = new Paint(1);
        this.G = 1.0f;
        this.a = i7;
        this.d = f6Var;
        setImageResource(i7 == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i7 == 0) {
            p1 p1Var = new p1(5);
            this.c = p1Var;
            p1Var.g();
            p1Var.M = false;
            p1Var.s = 4;
            p1Var.t = 4;
            p1Var.r = 2;
            p1Var.o = 0.1f;
            p1Var.c();
            return;
        }
        if (i7 == 2) {
            this.f = 0.8f;
            this.y.setColor(k6.x0(null, k6.a7, false));
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
        int i10 = k6.d6;
        f6 f6Var = this.d;
        int f10 = i0.a.f(0.5f, HSVToColor, k6.w0(i10, f6Var));
        int f11 = i0.a.f(0.4f, HSVToColor, k6.w0(i10, f6Var));
        if (this.w != null && this.r == f11 && this.s == f10) {
            return;
        }
        if (this.I) {
            Paint paint = this.y;
            this.D = paint;
            paint.setAlpha(qs.e4);
            this.G = 0.0f;
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
        return this.E;
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
        this.I = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int intValue;
        z2 z2Var;
        if (this.H) {
            ImageReceiver imageReceiver = this.E;
            if (imageReceiver == null || imageReceiver.n() == null) {
                i5 i5Var = this.F;
                if (i5Var != null) {
                    SparseArray sparseArray = i5.r;
                    long h = i5Var.h();
                    if (h != 0) {
                        if (i5.x == null) {
                            i5.x = new HashMap();
                        }
                        Integer num = (Integer) i5.x.get(Long.valueOf(h));
                        if (num == null && (z2Var = i5Var.k) != null && z2Var.n() != null) {
                            HashMap hashMap = i5.x;
                            Long valueOf = Long.valueOf(h);
                            Integer valueOf2 = Integer.valueOf(org.telegram.messenger.g0.J0(i5Var.k.n()));
                            hashMap.put(valueOf, valueOf2);
                            num = valueOf2;
                        }
                        if (num != null) {
                            intValue = num.intValue();
                            if (intValue == 0) {
                                this.H = false;
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
                this.H = false;
                setColor(org.telegram.messenger.g0.J0(this.E.n()));
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
                if (this.J == null) {
                    this.J = new org.telegram.ui.Components.voip.n();
                }
                this.J.f = getMeasuredWidth() / 2;
                org.telegram.ui.Components.voip.n nVar = this.J;
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
                if (this.D == null) {
                    this.G = 1.0f;
                }
                float f10 = this.G;
                if (f10 != 1.0f) {
                    this.y.setAlpha((int) (f10 * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.D);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    float f11 = this.G + 0.10666667f;
                    this.G = f11;
                    if (f11 > 1.0f) {
                        this.G = 1.0f;
                        this.D = null;
                    }
                    invalidate();
                    this.y.setAlpha(qs.e4);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                }
            }
        }
        float f12 = this.f;
        boolean z9 = f12 != 1.0f;
        if (z9) {
            canvas.save();
            canvas.scale(f12, f12, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (z9) {
            canvas.restore();
        }
        this.I = true;
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
        p1 p1Var = this.c;
        p1Var.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        p1Var.a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
    }

    public void setAnimatedEmojiDrawable(i5 i5Var) {
        this.F = i5Var;
        if (i5Var != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.K = num;
    }

    public void setColor(int i7) {
        this.h = true;
        Integer num = this.K;
        if (num != null) {
            i7 = k6.w(i7, num.intValue());
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
        this.E = imageReceiver;
        if (imageReceiver != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setLocked(boolean z9) {
        if (this.a != 0) {
            setImageResource(z9 ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
