package sg;

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
import bi.y3;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.q5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class e1 extends ImageView {
    public static final /* synthetic */ int L = 0;
    public ImageReceiver E;
    public q5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.h J;
    public Integer K;
    public final int a;
    public final float[] b;
    public final y1 c;
    public final f6 d;
    public boolean e;
    public final float f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public LinearGradient v;
    public final Path w;
    public Paint x;
    public Paint y;

    public e1(Context context, int i10, f6 f6Var) {
        super(context);
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.v = null;
        this.w = new Path();
        this.x = new Paint(1);
        this.G = 1.0f;
        this.a = i10;
        this.d = f6Var;
        setImageResource(i10 == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i10 == 0) {
            y1 y1Var = new y1(5);
            this.c = y1Var;
            y1Var.g();
            y1Var.M = false;
            y1Var.s = 4;
            y1Var.t = 4;
            y1Var.r = 2;
            y1Var.o = 0.1f;
            y1Var.c();
            return;
        }
        if (i10 == 2) {
            this.f = 0.8f;
            this.x.setColor(j6.w0(null, j6.a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (!this.e || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int i10 = this.n;
        float[] fArr = this.b;
        Color.colorToHSV(i10, fArr);
        fArr[1] = fArr[1] * 1.0f;
        if (fArr[2] > 0.7f) {
            fArr[2] = 0.7f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        int i11 = j6.d6;
        f6 f6Var = this.d;
        int d = i0.a.d(0.5f, HSVToColor, j6.v0(i11, f6Var));
        int d10 = i0.a.d(0.4f, HSVToColor, j6.v0(i11, f6Var));
        if (this.v != null && this.r == d10 && this.s == d) {
            return;
        }
        if (this.I) {
            Paint paint = this.x;
            this.y = paint;
            paint.setAlpha(255);
            this.G = 0.0f;
        }
        this.x = new Paint(1);
        float measuredHeight = getMeasuredHeight();
        this.r = d10;
        this.s = d;
        LinearGradient linearGradient = new LinearGradient(0.0f, measuredHeight, 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
        this.v = linearGradient;
        this.x.setShader(linearGradient);
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
        Paint paint = this.x;
        if (paint != null && this.a != 2) {
            paint.setShader(null);
            this.x = null;
        }
        this.v = null;
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
        y3 y3Var;
        if (this.H) {
            ImageReceiver imageReceiver = this.E;
            if (imageReceiver == null || imageReceiver.getBitmap() == null) {
                q5 q5Var = this.F;
                if (q5Var != null) {
                    SparseArray sparseArray = q5.q;
                    long i10 = q5Var.i();
                    if (i10 != 0) {
                        if (q5.w == null) {
                            q5.w = new HashMap();
                        }
                        Integer num = (Integer) q5.w.get(Long.valueOf(i10));
                        if (num == null && (y3Var = q5Var.k) != null && y3Var.getBitmap() != null) {
                            HashMap hashMap = q5.w;
                            Long valueOf = Long.valueOf(i10);
                            Integer valueOf2 = Integer.valueOf(AndroidUtilities.getDominantColor(q5Var.k.getBitmap()));
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
                setColor(AndroidUtilities.getDominantColor(this.E.getBitmap()));
            }
        }
        Paint paint = this.x;
        if (paint != null) {
            int i11 = this.a;
            if (i11 == 2) {
                float measuredWidth = getMeasuredWidth() / 2.0f;
                canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2.0f, measuredWidth, this.x);
            } else if (i11 == 0) {
                int i12 = this.n;
                Path path = this.w;
                if (i12 != 0) {
                    canvas.drawPath(path, paint);
                } else {
                    d1.d().f(-AndroidUtilities.dp(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, d1.d().e());
                }
                if (this.J == null) {
                    this.J = new org.telegram.ui.Components.voip.h();
                }
                this.J.f = getMeasuredWidth() / 2;
                org.telegram.ui.Components.voip.h hVar = this.J;
                hVar.k = false;
                hVar.c(this);
                canvas.drawPath(path, hVar.a);
                if (hVar.k) {
                    canvas.drawPath(path, hVar.c);
                }
                canvas.save();
                canvas.clipPath(path);
                this.c.d(canvas);
                canvas.restore();
                invalidate();
            } else {
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                if (this.y == null) {
                    this.G = 1.0f;
                }
                float f7 = this.G;
                if (f7 != 1.0f) {
                    this.x.setAlpha((int) (f7 * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.x);
                    float f10 = this.G + 0.10666667f;
                    this.G = f10;
                    if (f10 > 1.0f) {
                        this.G = 1.0f;
                        this.y = null;
                    }
                    invalidate();
                    this.x.setAlpha(255);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.x);
                }
            }
        }
        float f11 = this.f;
        boolean z10 = f11 != 1.0f;
        if (z10) {
            canvas.save();
            canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        this.I = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.a != 0) {
            a();
            return;
        }
        Path path = this.w;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float width = rectF.width() / 2.0f;
        float centerY = rectF.centerY();
        float width2 = rectF.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, centerY, width2, direction);
        rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
        path.close();
        y1 y1Var = this.c;
        y1Var.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        y1Var.a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
    }

    public void setAnimatedEmojiDrawable(q5 q5Var) {
        this.F = q5Var;
        if (q5Var != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.K = num;
    }

    public void setColor(int i10) {
        this.h = true;
        Integer num = this.K;
        if (num != null) {
            i10 = j6.v(i10, num.intValue());
        }
        if (this.n != i10) {
            this.n = i10;
            int i11 = this.a;
            if (i11 == 0 || i11 == 2) {
                Paint paint = this.x;
                if (paint != null) {
                    paint.setColor(i10);
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

    public void setLocked(boolean z10) {
        if (this.a != 0) {
            setImageResource(z10 ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
