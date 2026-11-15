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
import fi.u2;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g5;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class a1 extends ImageView {
    public static final /* synthetic */ int M = 0;
    public Paint E;
    public ImageReceiver F;
    public g5 G;
    public float H;
    public boolean I;
    public boolean J;
    public org.telegram.ui.Components.voip.n K;
    public Integer L;
    public final int a;
    public final float[] b;
    public final r1 c;
    public final e6 d;
    public boolean e;
    public final float f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public LinearGradient w;
    public final Path x;
    public Paint y;

    public a1(int i7, Context context, e6 e6Var) {
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
        this.d = e6Var;
        setImageResource(i7 == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i7 == 0) {
            r1 r1Var = new r1(5);
            this.c = r1Var;
            r1Var.g();
            r1Var.M = false;
            r1Var.s = 4;
            r1Var.t = 4;
            r1Var.r = 2;
            r1Var.o = 0.1f;
            r1Var.c();
            return;
        }
        if (i7 == 2) {
            this.f = 0.8f;
            this.y.setColor(j6.x0(null, j6.a7, false));
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
        int i10 = j6.d6;
        e6 e6Var = this.d;
        int f10 = i0.a.f(0.5f, HSVToColor, j6.w0(i10, e6Var));
        int f11 = i0.a.f(0.4f, HSVToColor, j6.w0(i10, e6Var));
        if (this.w != null && this.r == f11 && this.s == f10) {
            return;
        }
        if (this.J) {
            Paint paint = this.y;
            this.E = paint;
            paint.setAlpha(ns.e4);
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
        u2 u2Var;
        if (this.I) {
            ImageReceiver imageReceiver = this.F;
            if (imageReceiver == null || imageReceiver.n() == null) {
                g5 g5Var = this.G;
                if (g5Var != null) {
                    SparseArray sparseArray = g5.r;
                    long h = g5Var.h();
                    if (h != 0) {
                        if (g5.x == null) {
                            g5.x = new HashMap();
                        }
                        Integer num = (Integer) g5.x.get(Long.valueOf(h));
                        if (num == null && (u2Var = g5Var.k) != null && u2Var.n() != null) {
                            HashMap hashMap = g5.x;
                            Long valueOf = Long.valueOf(h);
                            Integer valueOf2 = Integer.valueOf(org.telegram.messenger.g0.J0(g5Var.k.n()));
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
                    ia.f.d().f(-org.telegram.messenger.g0.L(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, ia.f.d().e());
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
                    this.y.setAlpha(ns.e4);
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
        r1 r1Var = this.c;
        r1Var.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        r1Var.a.inset(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
    }

    public void setAnimatedEmojiDrawable(g5 g5Var) {
        this.G = g5Var;
        if (g5Var != null) {
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
            i7 = j6.w(i7, num.intValue());
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
