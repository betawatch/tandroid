package zf;

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
import ih.z2;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class b1 extends ImageView {
    public static final /* synthetic */ int H = 0;
    public ImageReceiver A;
    public k5 B;
    public float C;
    public boolean D;
    public boolean E;
    public org.telegram.ui.Components.voip.h F;
    public Integer G;
    public final int a;
    public final float[] b;
    public final v1 c;
    public final b6 d;
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

    public b1(Context context, int i9, b6 b6Var) {
        super(context);
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.v = null;
        this.w = new Path();
        this.x = new Paint(1);
        this.C = 1.0f;
        this.a = i9;
        this.d = b6Var;
        setImageResource(i9 == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i9 == 0) {
            v1 v1Var = new v1(5);
            this.c = v1Var;
            v1Var.g();
            v1Var.M = false;
            v1Var.s = 4;
            v1Var.t = 4;
            v1Var.r = 2;
            v1Var.o = 0.1f;
            v1Var.c();
            return;
        }
        if (i9 == 2) {
            this.f = 0.8f;
            this.x.setColor(f6.w0(null, f6.a7, false));
        } else if (i9 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i9 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (!this.e || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int i9 = this.n;
        float[] fArr = this.b;
        Color.colorToHSV(i9, fArr);
        fArr[1] = fArr[1] * 1.0f;
        if (fArr[2] > 0.7f) {
            fArr[2] = 0.7f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        int i10 = f6.d6;
        b6 b6Var = this.d;
        int d = i0.a.d(0.5f, HSVToColor, f6.v0(i10, b6Var));
        int d9 = i0.a.d(0.4f, HSVToColor, f6.v0(i10, b6Var));
        if (this.v != null && this.r == d9 && this.s == d) {
            return;
        }
        if (this.E) {
            Paint paint = this.x;
            this.y = paint;
            paint.setAlpha(255);
            this.C = 0.0f;
        }
        this.x = new Paint(1);
        float measuredHeight = getMeasuredHeight();
        this.r = d9;
        this.s = d;
        LinearGradient linearGradient = new LinearGradient(0.0f, measuredHeight, 0.0f, 0.0f, new int[]{d9, d}, (float[]) null, Shader.TileMode.CLAMP);
        this.v = linearGradient;
        this.x.setShader(linearGradient);
        invalidate();
    }

    public ImageReceiver getImageReceiver() {
        return this.A;
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
        this.E = false;
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
        if (this.D) {
            ImageReceiver imageReceiver = this.A;
            if (imageReceiver == null || imageReceiver.getBitmap() == null) {
                k5 k5Var = this.B;
                if (k5Var != null) {
                    SparseArray sparseArray = k5.q;
                    long i9 = k5Var.i();
                    if (i9 != 0) {
                        if (k5.w == null) {
                            k5.w = new HashMap();
                        }
                        Integer num = (Integer) k5.w.get(Long.valueOf(i9));
                        if (num == null && (z2Var = k5Var.k) != null && z2Var.getBitmap() != null) {
                            HashMap hashMap = k5.w;
                            Long valueOf = Long.valueOf(i9);
                            Integer valueOf2 = Integer.valueOf(AndroidUtilities.getDominantColor(k5Var.k.getBitmap()));
                            hashMap.put(valueOf, valueOf2);
                            num = valueOf2;
                        }
                        if (num != null) {
                            intValue = num.intValue();
                            if (intValue == 0) {
                                this.D = false;
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
                this.D = false;
                setColor(AndroidUtilities.getDominantColor(this.A.getBitmap()));
            }
        }
        Paint paint = this.x;
        if (paint != null) {
            int i10 = this.a;
            if (i10 == 2) {
                float measuredWidth = getMeasuredWidth() / 2.0f;
                canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2.0f, measuredWidth, this.x);
            } else if (i10 == 0) {
                int i11 = this.n;
                Path path = this.w;
                if (i11 != 0) {
                    canvas.drawPath(path, paint);
                } else {
                    a1.d().f(-AndroidUtilities.dp(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, a1.d().e());
                }
                if (this.F == null) {
                    this.F = new org.telegram.ui.Components.voip.h();
                }
                this.F.f = getMeasuredWidth() / 2;
                org.telegram.ui.Components.voip.h hVar = this.F;
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
                    this.C = 1.0f;
                }
                float f10 = this.C;
                if (f10 != 1.0f) {
                    this.x.setAlpha((int) (f10 * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.x);
                    float f11 = this.C + 0.10666667f;
                    this.C = f11;
                    if (f11 > 1.0f) {
                        this.C = 1.0f;
                        this.y = null;
                    }
                    invalidate();
                    this.x.setAlpha(255);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.x);
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
        this.E = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
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
        v1 v1Var = this.c;
        v1Var.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        v1Var.a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
    }

    public void setAnimatedEmojiDrawable(k5 k5Var) {
        this.B = k5Var;
        if (k5Var != null) {
            this.D = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.G = num;
    }

    public void setColor(int i9) {
        this.h = true;
        Integer num = this.G;
        if (num != null) {
            i9 = f6.v(i9, num.intValue());
        }
        if (this.n != i9) {
            this.n = i9;
            int i10 = this.a;
            if (i10 == 0 || i10 == 2) {
                Paint paint = this.x;
                if (paint != null) {
                    paint.setColor(i9);
                }
            } else {
                a();
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.A = imageReceiver;
        if (imageReceiver != null) {
            this.D = true;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.a != 0) {
            setImageResource(z10 ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
