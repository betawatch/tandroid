// default package

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
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class pj8 extends ImageView {
    public static final /* synthetic */ int M = 0;
    public Paint E;
    public ImageReceiver F;
    public vm G;
    public float H;
    public boolean I;
    public boolean J;
    public ef1 K;
    public Integer L;
    public final byte a;
    public final float[] b;
    public final cta c;
    public final ylb d;
    public boolean e;
    public final float f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public LinearGradient w;
    public final Path x;
    public Paint y;

    /* JADX WARN: Multi-variable type inference failed */
    public pj8(int i, ylb ylbVar, Context context) {
        super(context);
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.w = null;
        this.x = new Path();
        this.y = new Paint(1);
        this.H = 1.0f;
        this.a = i;
        this.d = ylbVar;
        setImageResource(i == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i == 0) {
            cta ctaVar = new cta(5);
            this.c = ctaVar;
            ctaVar.g();
            ctaVar.L = false;
            ctaVar.s = (byte) 4;
            ctaVar.t = (byte) 4;
            ctaVar.r = (byte) 2;
            ctaVar.o = 0.1f;
            ctaVar.c();
            return;
        }
        if (i == 2) {
            this.f = 0.8f;
            this.y.setColor(cmb.w0(null, cmb.Z6, false));
        } else if (i == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (!this.e || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int i = this.n;
        float[] fArr = this.b;
        Color.colorToHSV(i, fArr);
        fArr[1] = fArr[1] * 1.0f;
        if (fArr[2] > 0.7f) {
            fArr[2] = 0.7f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        int i2 = cmb.c6;
        ylb ylbVar = this.d;
        int f = on2.f(0.5f, HSVToColor, cmb.v0(i2, ylbVar));
        int f2 = on2.f(0.4f, HSVToColor, cmb.v0(i2, ylbVar));
        if (this.w != null && this.r == f2 && this.s == f) {
            return;
        }
        if (this.J) {
            Paint paint = this.y;
            this.E = paint;
            paint.setAlpha(nm7.d4);
            this.H = 0.0f;
        }
        this.y = new Paint(1);
        float measuredHeight = getMeasuredHeight();
        this.r = f2;
        this.s = f;
        LinearGradient linearGradient = new LinearGradient(0.0f, measuredHeight, 0.0f, 0.0f, new int[]{f2, f}, (float[]) null, Shader.TileMode.CLAMP);
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        mm mmVar;
        if (this.I) {
            ImageReceiver imageReceiver = this.F;
            if (imageReceiver == null || imageReceiver.n() == null) {
                vm vmVar = this.G;
                if (vmVar != null) {
                    SparseArray sparseArray = vm.r;
                    long h = vmVar.h();
                    if (h != 0) {
                        HashMap hashMap = vm.x;
                        if (hashMap == null) {
                            hashMap = new HashMap();
                            vm.x = hashMap;
                        }
                        Integer num = (Integer) hashMap.get(Long.valueOf(h));
                        if (num == null && (mmVar = vmVar.k) != null && mmVar.n() != null) {
                            HashMap hashMap2 = vm.x;
                            Long valueOf = Long.valueOf(h);
                            Integer valueOf2 = Integer.valueOf(gm.I0(vmVar.k.n()));
                            hashMap2.put(valueOf, valueOf2);
                            num = valueOf2;
                        }
                        if (num != null) {
                            i = num.intValue();
                            if (i == 0) {
                                this.I = false;
                                setColor(i);
                            } else {
                                invalidate();
                            }
                        }
                    }
                    i = 0;
                    if (i == 0) {
                    }
                } else {
                    invalidate();
                }
            } else {
                this.I = false;
                setColor(gm.I0(this.F.n()));
            }
        }
        Paint paint = this.y;
        if (paint != null) {
            byte b = this.a;
            if (b == 2) {
                float measuredWidth = getMeasuredWidth() / 2.0f;
                canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2.0f, measuredWidth, this.y);
            } else if (b == 0) {
                int i2 = this.n;
                Path path = this.x;
                if (i2 != 0) {
                    canvas.drawPath(path, paint);
                } else {
                    oj8.d().f(-gm.L(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, oj8.d().e());
                }
                ef1 ef1Var = this.K;
                if (ef1Var == null) {
                    ef1Var = new ef1();
                    this.K = ef1Var;
                }
                ef1Var.f = getMeasuredWidth() / 2;
                ef1 ef1Var2 = this.K;
                ef1Var2.k = false;
                ef1Var2.c(this);
                canvas.drawPath(path, ef1Var2.a);
                if (ef1Var2.k) {
                    canvas.drawPath(path, ef1Var2.c);
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
                float f = this.H;
                Paint paint2 = this.y;
                if (f != 1.0f) {
                    paint2.setAlpha((int) (f * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.E);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    float f2 = this.H + 0.10666667f;
                    this.H = f2;
                    if (f2 > 1.0f) {
                        this.H = 1.0f;
                        this.E = null;
                    }
                    invalidate();
                    this.y.setAlpha(nm7.d4);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, paint2);
                }
            }
        }
        float f3 = this.f;
        boolean z = f3 != 1.0f;
        if (z) {
            canvas.save();
            canvas.scale(f3, f3, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (z) {
            canvas.restore();
        }
        this.J = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a != 0) {
            a();
            return;
        }
        Path path = this.x;
        path.rewind();
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float width = rectF.width() / 2.0f;
        float centerY = rectF.centerY();
        float width2 = rectF.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, centerY, width2, direction);
        rectF.set((getMeasuredWidth() / 2.0f) + gm.L(2.5f), gm.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gm.N(0.2f), getMeasuredHeight());
        path.addRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), direction);
        path.close();
        cta ctaVar = this.c;
        ctaVar.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        ctaVar.a.inset(gm.L(6.0f), gm.L(6.0f));
    }

    public void setAnimatedEmojiDrawable(vm vmVar) {
        this.G = vmVar;
        if (vmVar != null) {
            this.I = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.L = num;
    }

    public void setColor(int i) {
        this.h = true;
        Integer num = this.L;
        if (num != null) {
            i = cmb.v(i, num.intValue());
        }
        if (this.n != i) {
            this.n = i;
            byte b = this.a;
            if (b == 0 || b == 2) {
                Paint paint = this.y;
                if (paint != null) {
                    paint.setColor(i);
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

    public void setLocked(boolean z) {
        if (this.a != 0) {
            setImageResource(z ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
