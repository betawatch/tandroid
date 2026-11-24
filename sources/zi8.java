// default package

import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class zi8 extends FrameLayout {
    public static final /* synthetic */ int C0 = 0;
    public final HashSet A0;
    public t23 B0;
    public lbc E;
    public qk2 F;
    public kob G;
    public final sl0 H;
    public final n00 I;
    public long J;
    public long K;
    public final yi8 L;
    public final yi8 M;
    public final yi8 N;
    public d6b O;
    public boolean P;
    public final lm Q;
    public final Paint R;
    public Drawable S;
    public Drawable T;
    public final Paint U;
    public int V;
    public int W;
    public Bitmap a;
    public final Matrix a0;
    public final Rect b;
    public final float[] b0;
    public final Rect c;
    public float c0;
    public f4b d;
    public float d0;
    public lbc e;
    public float e0;
    public int f;
    public boolean f0;
    public final lm g0;
    public int h;
    public boolean h0;
    public final Matrix i0;
    public final Matrix j0;
    public final Matrix k0;
    public boolean l0;
    public final PointF m0;
    public kac n;
    public final PointF n0;
    public float o0;
    public double p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public l58 s;
    public boolean s0;
    public final Matrix t0;
    public final Matrix u0;
    public float v0;
    public d6b w;
    public boolean w0;
    public am9 x;
    public boolean x0;
    public lbc y;
    public long y0;
    public Runnable z0;

    public zi8(Context context, sl0 sl0Var, n00 n00Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new yi8(this, (byte) 2);
        this.L = new yi8(this, (byte) 3);
        this.M = new yi8(this, (byte) 4);
        this.N = new yi8(this, (byte) 5);
        this.Q = new lm(this, 0L, 350L, s33.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.a0 = new Matrix();
        this.b0 = new float[2];
        this.f0 = true;
        this.g0 = new lm(this, 0L, 320L, s33.g);
        this.h0 = false;
        this.i0 = new Matrix();
        this.j0 = new Matrix();
        this.k0 = new Matrix();
        this.l0 = true;
        this.m0 = new PointF();
        this.n0 = new PointF();
        this.t0 = new Matrix();
        this.u0 = new Matrix();
        this.A0 = new HashSet();
        this.H = sl0Var;
        this.I = n00Var;
        paint.setStrokeWidth(gl.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(gl.L(3.0f), 0.0f, gl.L(1.0f), TLObject.FLAG_30);
    }

    public static Drawable d(Drawable drawable, int i, long j, boolean z) {
        TLRPC.WallPaper wallPaper = null;
        if (j == Long.MIN_VALUE) {
            return null;
        }
        if (j >= 0) {
            TLRPC.UserFull W1 = na7.q1(i).W1(j);
            if (W1 != null) {
                wallPaper = W1.wallpaper;
            }
        } else {
            TLRPC.ChatFull L0 = na7.q1(i).L0(-j);
            if (L0 != null) {
                wallPaper = L0.wallpaper;
            }
        }
        return e(drawable, i, wallPaper, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable e(Drawable drawable, int i, TLRPC.WallPaper wallPaper, boolean z) {
        jy3 jy3Var;
        int[] iArr;
        zjb i2;
        if (wallPaper != null) {
            if (TextUtils.isEmpty(je2.h(wallPaper))) {
                return p72.d(drawable, wallPaper, z);
            }
            if (wallPaper.settings != null) {
                jy3Var = je2.e(i).g(elb.d(wallPaper.settings.emoticon));
                if (jy3Var == null) {
                    return f(i, jy3Var, z);
                }
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (bkb.O0(string) == null || bkb.O0(string).o()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (bkb.O0(string2) == null || !bkb.O0(string2).o()) {
                    string2 = "Dark Blue";
                }
                akb akbVar = bkb.I;
                if (!string.equals(string2)) {
                    str2 = string2;
                } else if (akbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                    str2 = string2;
                    akb O0 = !z ? bkb.O0(str2) : bkb.O0(str);
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    String[] strArr = new String[1];
                    String str3 = O0.d;
                    SparseIntArray R0 = str3 == null ? bkb.R0(null, str3, strArr) : bkb.R0(new File(O0.b), null, strArr);
                    iArr = bkb.gm;
                    if (iArr != null) {
                        for (int i3 = 0; i3 < iArr.length; i3++) {
                            sparseIntArray.put(i3, iArr[i3]);
                        }
                    }
                    i2 = O0.i(false);
                    if (i2 == null) {
                        i2.d(R0, sparseIntArray);
                    } else {
                        for (int i4 = 0; i4 < R0.size(); i4++) {
                            sparseIntArray.put(R0.keyAt(i4), R0.valueAt(i4));
                        }
                    }
                    gl2 I = bkb.I(O0, sparseIntArray, strArr[0], 0, true);
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) I.c;
                    return bitmapDrawable == null ? bitmapDrawable : (Drawable) I.b;
                }
                str = string;
                if (!z) {
                }
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                String[] strArr2 = new String[1];
                String str32 = O0.d;
                if (str32 == null) {
                }
                iArr = bkb.gm;
                if (iArr != null) {
                }
                i2 = O0.i(false);
                if (i2 == null) {
                }
                gl2 I2 = bkb.I(O0, sparseIntArray2, strArr2[0], 0, true);
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) I2.c;
                if (bitmapDrawable2 == null) {
                }
            }
        }
        jy3Var = null;
        if (jy3Var == null) {
        }
    }

    public static Drawable f(int i, final jy3 jy3Var, final boolean z) {
        if (jy3Var.l()) {
            bkb.I(jy3.d(z), jy3Var.g(i, z ? 1 : 0), ((iy3) jy3Var.f.get(z ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g = jy3Var.g(i, z ? 1 : 0);
        int i2 = bkb.De;
        int i3 = g.get(i2, bkb.w0(null, i2, false));
        int i4 = bkb.Ee;
        int i5 = g.get(i4, bkb.w0(null, i4, false));
        int i6 = bkb.Fe;
        int i7 = g.get(i6, bkb.w0(null, i6, false));
        int i8 = bkb.Ge;
        int i9 = g.get(i8, bkb.w0(null, i8, false));
        final ye7 ye7Var = new ye7();
        ye7Var.g = false;
        ye7Var.r(jy3Var.j(z ? 1 : 0).settings.intensity, ye7Var.u);
        ye7Var.n(true, i3, i5, i7, i9);
        ye7Var.t(0);
        final int f = ye7Var.f();
        jy3Var.n(z ? 1 : 0, new ResultCallback() { // from class: xi8
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((mqc) pair.second).a;
                    jy3 jy3Var2 = jy3.this;
                    if (longValue != jy3Var2.h(z ? 1 : 0) || bitmap == null) {
                        return;
                    }
                    int i10 = jy3Var2.j(z ? 1 : 0).settings.intensity;
                    ye7 ye7Var2 = ye7Var;
                    ye7Var2.r(i10, bitmap);
                    ye7Var2.s(f);
                    ye7Var2.q(1.0f);
                }
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final void onError(TLRPC.TL_error tL_error) {
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final void onError(Throwable th) {
            }
        });
        return ye7Var;
    }

    private void setupCollage(f4b f4bVar) {
        kob kobVar = this.G;
        if (kobVar != null) {
            kobVar.setCollage(f4bVar != null ? f4bVar.T : null);
        }
    }

    private void setupImage(f4b f4bVar) {
        Utilities.g.c(new h18(this, f4bVar, (byte) 21));
    }

    public abstract void a();

    public final void b() {
        float f;
        float f2;
        lbc lbcVar = this.e;
        float f3 = 0.0f;
        if (lbcVar != null) {
            if (!this.P) {
                f4b f4bVar = this.d;
                if (f4bVar == null) {
                    f2 = 1.0f;
                } else if (!f4bVar.Y) {
                    f2 = f4bVar.P;
                }
                lbcVar.A0(f2);
            }
            f2 = 0.0f;
            lbcVar.A0(f2);
        }
        lbc lbcVar2 = this.y;
        if (lbcVar2 != null) {
            if (this.P) {
                f = 0.0f;
            } else {
                f4b f4bVar2 = this.d;
                f = f4bVar2 != null ? f4bVar2.u0 : 1.0f;
            }
            lbcVar2.A0(f);
        }
        lbc lbcVar3 = this.E;
        if (lbcVar3 != null) {
            if (!this.P) {
                f4b f4bVar3 = this.d;
                f3 = f4bVar3 != null ? f4bVar3.G : 1.0f;
            }
            lbcVar3.A0(f3);
        }
        qk2 qk2Var = this.F;
        if (qk2Var != null) {
            qk2Var.setMuted(this.P);
        }
    }

    public final void c(Matrix matrix) {
        if (this.d == null) {
            return;
        }
        float[] fArr = this.b0;
        fArr[0] = r0.k0 / 2.0f;
        fArr[1] = r0.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.c0 = fArr[0];
        this.d0 = fArr[1];
        f4b f4bVar = this.d;
        fArr[0] = f4bVar.k0;
        fArr[1] = f4bVar.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.d0, fArr[0] - this.c0));
        float f = fArr[0];
        float f2 = fArr[1];
        f4b f4bVar2 = this.d;
        fArr[0] = f4bVar2.k0 / 2.0f;
        fArr[1] = f4bVar2.l0;
        matrix.mapPoints(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.T != null) {
            if (this.h0) {
                Path path = new Path();
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            float e = ((drawable instanceof ye7) && ((ye7) drawable).u == null) ? 0.0f : this.Q.e(false, 1.0f);
            Drawable drawable2 = this.S;
            if (drawable2 != null && e < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - e) * 255.0f));
                f4b.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (e * 255.0f));
            f4b.j(canvas, this.T, getWidth(), getHeight());
            if (this.h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        t23 t23Var = this.B0;
        if (t23Var != null) {
            t23Var.d.b(canvas2, true);
        } else if (this.f0 && this.d != null && !i()) {
            float d = this.g0.d(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    f4b f4bVar = this.d;
                    int i = f4bVar.k0;
                    int i2 = f4bVar.l0;
                    int i3 = f4bVar.Q;
                    zl6 zl6Var = f4bVar.m0;
                    if (((i3 + zl6Var.k) / 90) % 2 == 1) {
                        i2 = i;
                        i = i2;
                    }
                    float f = zl6Var.e;
                    float f2 = zl6Var.f;
                    float f3 = i;
                    float f4 = i2;
                    canvas2.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (f * f3) / 2.0f, (f2 * f4) / 2.0f);
                    float f5 = this.d.m0.c;
                    canvas2.scale(f5, f5);
                    zl6 zl6Var2 = this.d.m0;
                    canvas2.translate(zl6Var2.a * f3, zl6Var2.b * f4);
                    canvas2.rotate(this.d.m0.d + r0.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    f4b f4bVar2 = this.d;
                    canvas2.translate((-f4bVar2.k0) / 2.0f, (-f4bVar2.l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                f4b f4bVar3 = this.d;
                int i4 = f4bVar3.k0;
                int i5 = f4bVar3.l0;
                Rect rect2 = this.c;
                rect2.set(0, 0, i4, i5);
                canvas2.drawBitmap(this.a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0171, code lost:
    
        if (r1 != false) goto L70;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        boolean v = v(motionEvent);
        t7b t7bVar = ((i7b) this).D0;
        j7b j7bVar = t7bVar.d1;
        boolean z = false;
        if (j7bVar == null || !j7bVar.O1) {
            k58 k58Var = t7bVar.D1;
            oq7 oq7Var = k58Var.J;
            if (k58Var.w && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    k58Var.E = false;
                    k58Var.F = System.currentTimeMillis();
                    k58Var.G = motionEvent.getX();
                    k58Var.H = motionEvent.getY();
                    l58 l58Var = k58Var.x;
                    if (l58Var != null) {
                        k58Var.I = l58Var.getEnhanceValue();
                    }
                    z = true;
                    if (motionEvent.getAction() == 0) {
                        this.y0 = System.currentTimeMillis();
                    } else if (motionEvent.getAction() == 1) {
                        if (System.currentTimeMillis() - this.y0 <= ViewConfiguration.getTapTimeout() && (runnable = this.z0) != null) {
                            runnable.run();
                        }
                        this.y0 = 0L;
                    } else if (motionEvent.getAction() == 3) {
                        this.y0 = 0L;
                    }
                    if (!z) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (motionEvent.getPointerCount() <= 1) {
                        super.dispatchTouchEvent(motionEvent);
                    }
                    return true;
                }
                if (action == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (!k58Var.E && System.currentTimeMillis() - k58Var.F <= ViewConfiguration.getLongPressTimeout() && Math.abs(k58Var.H - y) < Math.abs(k58Var.G - x) && Math.abs(k58Var.G - x) > gl.e) {
                        k58Var.E = true;
                        gl.r(oq7Var);
                        k58Var.r = true;
                        k58Var.invalidate();
                    }
                    if (k58Var.E) {
                        float f = x - k58Var.G;
                        if (k58Var.x == null) {
                            k58Var.y.run();
                        }
                        l58 l58Var2 = k58Var.x;
                        if (l58Var2 == null) {
                            k58Var.E = false;
                        } else {
                            float enhanceValue = l58Var2.getEnhanceValue();
                            float i = Utilities.i((f / (gl.q.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(i * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(k58Var.I * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (gba.o() == 2 ? 5 : 10)) {
                                    gl.W3(k58Var);
                                    k58Var.I = i;
                                }
                            } else {
                                try {
                                    k58Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                k58Var.I = i;
                            }
                            k58Var.x.setEnhanceValue(i);
                            l58 l58Var3 = k58Var.x;
                            StaticLayout staticLayout = new StaticLayout(String.valueOf(Math.round((l58Var3 == null ? 0.0f : l58Var3.getEnhanceValue()) * 100.0f)), k58Var.b, k58Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            k58Var.f = staticLayout;
                            k58Var.h = staticLayout.getLineCount() > 0 ? k58Var.f.getLineWidth(0) : 0.0f;
                            k58Var.n = k58Var.f.getLineCount() > 0 ? k58Var.f.getLineLeft(0) : 0.0f;
                            k58Var.invalidate();
                        }
                    }
                    k58Var.G = x;
                    k58Var.H = y;
                } else if (action == 1 || action == 3) {
                    k58Var.E = false;
                    k58Var.F = -1L;
                    l58 l58Var4 = k58Var.x;
                    if (l58Var4 != null) {
                        k58Var.I = l58Var4.getEnhanceValue();
                    }
                    gl.d3(oq7Var, 600L);
                }
            } else if (k58Var.r) {
                k58Var.r = false;
                k58Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        f4b f4bVar;
        f4b f4bVar2;
        kac kacVar = this.n;
        if (view == kacVar && (f4bVar2 = this.d) != null && f4bVar2.u) {
            return false;
        }
        if ((view != kacVar && view != this.r) || (f4bVar = this.d) == null || f4bVar.m0 == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            f4b f4bVar3 = this.d;
            int i = f4bVar3.k0;
            int i2 = f4bVar3.l0;
            int i3 = f4bVar3.Q;
            zl6 zl6Var = f4bVar3.m0;
            if (((i3 + zl6Var.k) / 90) % 2 == 1) {
                i2 = i;
                i = i2;
            }
            float f = zl6Var.e;
            float f2 = zl6Var.f;
            canvas.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (i * f) / 2.0f, (i2 * f2) / 2.0f);
            canvas.rotate(this.d.Q);
            f4b f4bVar4 = this.d;
            canvas.translate((-f4bVar4.k0) / 2.0f, (-f4bVar4.l0) / 2.0f);
        }
        canvas.concat(this.i0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.Bitmap[], java.io.Serializable] */
    public final void g(p8c p8cVar, View... viewArr) {
        kac kacVar;
        int L = (int) (gl.L(26.0f) * gl.p);
        int L2 = (int) (gl.L(30.33f) * gl.p);
        int L3 = (int) (gl.L(4.0f) * gl.p);
        ?? r5 = new Bitmap[viewArr.length];
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view != null && view.getWidth() >= 0 && viewArr[i].getHeight() > 0) {
                View view2 = viewArr[i];
                if (view2 == this && (kacVar = this.n) != null) {
                    r5[i] = kacVar.getBitmap();
                } else if (view2 instanceof TextureView) {
                    r5[i] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    r5[i] = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(r5[i]);
                    canvas.save();
                    float max = Math.max(L / viewArr[i].getWidth(), L2 / viewArr[i].getHeight());
                    canvas.scale(max, max);
                    viewArr[i].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.e.c(new os2(L, L2, L3, r5, p8cVar, (byte) 1));
    }

    public int getContentHeight() {
        f4b f4bVar = this.d;
        if (f4bVar == null) {
            return 1;
        }
        return f4bVar.l0;
    }

    public int getContentWidth() {
        f4b f4bVar = this.d;
        if (f4bVar == null) {
            return 1;
        }
        return f4bVar.k0;
    }

    public long getCurrentPosition() {
        lbc lbcVar = this.e;
        if (lbcVar != null) {
            return lbcVar.S();
        }
        lbc lbcVar2 = this.y;
        if (lbcVar2 != null) {
            return lbcVar2.S();
        }
        lbc lbcVar3 = this.E;
        if (lbcVar3 != null) {
            return lbcVar3.S();
        }
        return 0L;
    }

    public long getDuration() {
        f4b f4bVar = this.d;
        if (f4bVar != null) {
            double d = f4bVar.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        lbc lbcVar = this.e;
        if (lbcVar == null || lbcVar.U() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.U();
    }

    public int getOrientation() {
        f4b f4bVar = this.d;
        if (f4bVar == null) {
            return 0;
        }
        return f4bVar.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public kac getTextureView() {
        return this.n;
    }

    public abstract void h();

    public final boolean i() {
        f4b f4bVar;
        return (this.F == null || (f4bVar = this.d) == null || !f4bVar.v()) ? false : true;
    }

    public final boolean j() {
        return !this.A0.contains(-9982);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(f4b f4bVar) {
        long j;
        long j2;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (f4bVar != null) {
            int measuredWidth = getMeasuredWidth() <= 0 ? gl.q.x : getMeasuredWidth();
            int i = (int) ((measuredWidth << 4) / 9.0f);
            if (f4bVar.K) {
                Bitmap bitmap = f4bVar.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = f4bVar.N) != null && str.startsWith("vthumb://")) {
                    j = Long.parseLong(f4bVar.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = getContext().getContentResolver().loadThumbnail(f4bVar.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j), new Size(measuredWidth, i), null);
                        } catch (Exception unused) {
                        }
                    }
                    j2 = j;
                    if (j2 >= 0 && f4bVar.K && f4bVar.N == null) {
                        invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = f4bVar.Z0;
                        if (file == null) {
                            file = f4bVar.L;
                        }
                        if (file == null) {
                            return;
                        }
                        qm1 qm1Var = new qm1((Object) this, (Object) f4bVar, j2, (Object) file.getPath(), (byte) 6);
                        boolean z = f4bVar.K;
                        bitmapArr[0] = f4b.q(qm1Var, measuredWidth, i, !z ? f4bVar.Q : 0, !z);
                        zArr[0] = false;
                    }
                }
            }
            j = -1;
            j2 = j;
            if (j2 >= 0) {
            }
            if (bitmapArr[0] == null) {
            }
        }
        gl.c3(new jw6(this, bitmapArr, f4bVar, zArr, (byte) 23));
    }

    public final void l(f4b f4bVar) {
        this.d = f4bVar;
        byte b = 0;
        if (f4bVar == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (f4bVar.K) {
            setupImage(f4bVar);
            if (f4bVar.A0 == 0 && f4bVar.B0 == 0) {
                f4bVar.y(new yi8(this, b));
            } else {
                r();
            }
        } else {
            setupImage(f4bVar);
            r();
        }
        a();
        u(f4bVar);
        q(f4bVar, false);
        s(f4bVar, null, false);
    }

    public final void m(long j) {
        lbc lbcVar = this.e;
        if (lbcVar != null) {
            lbcVar.p0(j, false);
        } else if (i()) {
            this.F.m(j, false);
        } else {
            lbc lbcVar2 = this.y;
            if (lbcVar2 != null) {
                lbcVar2.p0(j, false);
            } else {
                lbc lbcVar3 = this.E;
                if (lbcVar3 != null) {
                    lbcVar3.p0(j, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(f4b f4bVar, a5b a5bVar, long j) {
        this.d = f4bVar;
        if (f4bVar == null) {
            t(null, a5bVar, j);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (f4bVar.v()) {
            setupImage(null);
            t(null, a5bVar, j);
            setupCollage(f4bVar);
        } else if (f4bVar.K) {
            setupImage(f4bVar);
            setupCollage(null);
            t(f4bVar, a5bVar, j);
            if (f4bVar.A0 == 0 && f4bVar.B0 == 0) {
                f4bVar.y(new yi8(this, (byte) 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, a5bVar, 0L);
            setupImage(f4bVar);
            r();
        }
        a();
        u(f4bVar);
        q(f4bVar, false);
        s(f4bVar, null, false);
    }

    public final void o(TextureView textureView, l58 l58Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = l58Var;
        this.r = textureView;
        if (l58Var != null) {
            int i = this.V;
            int i2 = this.W;
            td4 td4Var = l58Var.m0;
            if (td4Var != null) {
                td4Var.f(i, i2);
            } else {
                l58Var.K0 = i;
                l58Var.L0 = i2;
            }
        }
        TextureView textureView3 = this.r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.l0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        return true;
    }

    public final void p(k27 k27Var) {
        long duration;
        f4b f4bVar = this.d;
        if (f4bVar != null) {
            f4bVar.j = true;
            if (k27Var != null) {
                int i = k27Var.K1;
                if (k27Var.k != null) {
                    TLRPC.Document F0 = k27Var.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i2 = 0;
                    if (TextUtils.isEmpty(k27Var.k.attachPath)) {
                        ba4.G(i);
                        File J = ba4.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            ba4.G(i);
                            J = ba4.J(F0, null, true, true);
                            if (J == null || !J.exists()) {
                                f4b f4bVar2 = this.d;
                                f4bVar2.y = null;
                                f4bVar2.z = null;
                                f4bVar2.A = null;
                                f4bVar2.B = null;
                                f4bVar2.D = 0L;
                                f4bVar2.C = 0L;
                                f4bVar2.E = 0.0f;
                                f4bVar2.F = 1.0f;
                                return;
                            }
                            this.d.y = J.getAbsolutePath();
                        }
                        this.d.y = J.getAbsolutePath();
                    } else {
                        this.d.y = k27Var.k.attachPath;
                    }
                    f4b f4bVar3 = this.d;
                    f4bVar3.A = null;
                    f4bVar3.B = null;
                    if (F0 != null) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i3);
                            i3++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                this.d.A = documentAttribute2.performer;
                                if (!TextUtils.isEmpty(documentAttribute2.title)) {
                                    this.d.B = documentAttribute2.title;
                                }
                                this.d.C = (long) (documentAttribute2.duration * 1000.0d);
                            } else if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                this.d.B = documentAttribute2.file_name;
                            }
                        }
                    }
                    f4b f4bVar4 = this.d;
                    f4bVar4.D = 0L;
                    if (f4bVar4.K) {
                        f4bVar4.D = (long) (f4bVar4.Z * getDuration());
                    }
                    this.d.E = 0.0f;
                    if (i()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            f4b f4bVar5 = ((pk2) obj).n;
                            if (f4bVar5 != null && f4bVar5.K) {
                                duration = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    f4b f4bVar6 = this.d;
                    duration = f4bVar6.K ? getDuration() : f4bVar6.C;
                    kob kobVar = this.G;
                    int maxCount = kobVar == null ? 1 : kobVar.getMaxCount();
                    f4b f4bVar7 = this.d;
                    f4bVar7.F = f4bVar7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
                }
            }
            f4bVar.y = null;
            f4bVar.z = null;
            f4bVar.A = null;
            f4bVar.B = null;
            f4bVar.D = 0L;
            f4bVar.C = 0L;
            f4bVar.E = 0.0f;
            f4bVar.F = 1.0f;
        }
        q(this.d, true);
    }

    public final void q(f4b f4bVar, boolean z) {
        boolean z2;
        lbc lbcVar = this.E;
        if (lbcVar != null) {
            lbcVar.f0();
            this.E.l0();
            this.E = null;
        }
        if (f4bVar != null) {
            kob kobVar = this.G;
            boolean z3 = false;
            if (kobVar != null) {
                String str = f4bVar.y;
                String str2 = f4bVar.A;
                String str3 = f4bVar.B;
                long j = f4bVar.C;
                long j2 = f4bVar.D;
                float f = f4bVar.E;
                float f2 = f4bVar.F;
                float f3 = f4bVar.G;
                if (!TextUtils.equals(kobVar.P, str)) {
                    dob dobVar = kobVar.b0;
                    if (dobVar != null) {
                        dobVar.a();
                        kobVar.b0 = null;
                        kobVar.V = false;
                    }
                    kobVar.P = str;
                    kobVar.p();
                }
                kobVar.P = str;
                boolean isEmpty = TextUtils.isEmpty(str);
                kobVar.O = !isEmpty;
                if (isEmpty) {
                    kobVar.Q = false;
                    str2 = null;
                    str3 = null;
                }
                String str4 = TextUtils.isEmpty(str2) ? null : str2;
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                if (kobVar.O) {
                    kobVar.S = j;
                    kobVar.R = j2 - ((long) (j * f));
                    kobVar.T = f;
                    kobVar.U = f2;
                    kobVar.W = f3;
                    if (str4 != null) {
                        StaticLayout staticLayout = new StaticLayout(str4, kobVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        kobVar.N0 = staticLayout;
                        kobVar.O0 = staticLayout.getLineCount() > 0 ? kobVar.N0.getLineWidth(0) : 0.0f;
                        kobVar.P0 = kobVar.N0.getLineCount() > 0 ? kobVar.N0.getLineLeft(0) : 0.0f;
                    } else {
                        kobVar.O0 = 0.0f;
                        kobVar.N0 = null;
                    }
                    if (str3 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str3, kobVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        kobVar.R0 = staticLayout2;
                        kobVar.S0 = staticLayout2.getLineCount() > 0 ? kobVar.R0.getLineWidth(0) : 0.0f;
                        kobVar.T0 = kobVar.R0.getLineCount() > 0 ? kobVar.R0.getLineLeft(0) : 0.0f;
                    } else {
                        kobVar.S0 = 0.0f;
                        kobVar.R0 = null;
                    }
                }
                if (z) {
                    z2 = true;
                } else {
                    z2 = true;
                    kobVar.f0.f(kobVar.O, true);
                }
                kobVar.invalidate();
            } else {
                z2 = true;
            }
            if (f4bVar.y != null) {
                lbc lbcVar2 = new lbc();
                this.E = lbcVar2;
                lbcVar2.E = z2;
                lbcVar2.K = new gi3(this);
                lbcVar2.i0(Uri.fromFile(new File(f4bVar.y)), "other");
                b();
                if (this.e != null && getDuration() > 0) {
                    long duration = (long) (f4bVar.Z * getDuration());
                    this.e.p0(duration, false);
                    this.G.setProgress(duration);
                }
                z2 = true;
                w(true);
            }
            t7b t7bVar = ((i7b) this).D0;
            x6b x6bVar = t7bVar.w1;
            if (x6bVar != null) {
                f4b f4bVar2 = t7bVar.L1;
                if (f4bVar2 != null && f4bVar2.y != null) {
                    z3 = z2;
                }
                x6bVar.setHasAudio(z3);
            }
        }
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : gl.q.y;
        f4b f4bVar = this.d;
        int i = f4bVar.A0;
        Paint paint = this.U;
        if (i == 0 || f4bVar.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new jq0((Object) this, measuredHeight, (byte) 3).a(kee.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f = measuredHeight;
            f4b f4bVar2 = this.d;
            int i2 = f4bVar2.A0;
            this.V = i2;
            int i3 = f4bVar2.B0;
            this.W = i3;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{i2, i3}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            kac kacVar = this.n;
            if (kacVar != null) {
                int i4 = this.V;
                int i5 = this.W;
                td4 td4Var = kacVar.b;
                if (td4Var == null) {
                    kacVar.n = i4;
                    kacVar.r = i5;
                } else {
                    td4Var.f(i4, i5);
                }
            }
            l58 l58Var = this.s;
            if (l58Var != null) {
                int i6 = this.V;
                int i7 = this.W;
                td4 td4Var2 = l58Var.m0;
                if (td4Var2 != null) {
                    td4Var2.f(i6, i7);
                } else {
                    l58Var.K0 = i6;
                    l58Var.L0 = i7;
                }
            }
        }
        invalidate();
    }

    public final void s(f4b f4bVar, am9 am9Var, boolean z) {
        lbc lbcVar;
        if (f4bVar == null || f4bVar.o0 == null) {
            lbc lbcVar2 = this.y;
            if (lbcVar2 != null) {
                lbcVar2.f0();
                this.y.l0();
                this.y = null;
            }
            kob kobVar = this.G;
            if (kobVar != null) {
                kobVar.setRoundNull(z);
            }
            this.x = null;
            gl.r(this.L);
            return;
        }
        lbc lbcVar3 = this.y;
        if (lbcVar3 != null) {
            lbcVar3.l0();
            this.y = null;
        }
        lbc lbcVar4 = new lbc();
        this.y = lbcVar4;
        lbcVar4.E = true;
        lbcVar4.K = new s34((Object) this, (byte) 26);
        this.y.i0(Uri.fromFile(f4bVar.o0), "other");
        b();
        this.x = am9Var;
        if (am9Var != null && (lbcVar = this.y) != null) {
            lbcVar.z0(am9Var.w0);
        }
        this.G.n(f4bVar.o0.getAbsolutePath(), f4bVar.q0, f4bVar.r0, f4bVar.s0, f4bVar.t0, f4bVar.u0, z);
        y(true);
    }

    public void set(f4b f4bVar) {
        n(f4bVar, null, 0L);
    }

    public void setAllowCropping(boolean z) {
        this.l0 = z;
    }

    public void setCollageView(qk2 qk2Var) {
        this.F = qk2Var;
    }

    public void setCropEditorDrawing(t23 t23Var) {
        if (this.B0 != t23Var) {
            this.B0 = t23Var;
            invalidate();
        }
    }

    public void setDraw(boolean z) {
        this.f0 = z;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.z0 = runnable;
    }

    public void setVideoTimelineView(kob kobVar) {
        this.G = kobVar;
        if (kobVar != null) {
            kobVar.setDelegate(new z24((Object) this, (byte) 25));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            set(null);
        }
    }

    public final void t(f4b f4bVar, a5b a5bVar, long j) {
        ArrayList arrayList;
        xl0 xl0Var;
        if (f4bVar == null || f4bVar.v()) {
            lbc lbcVar = this.e;
            if (lbcVar != null) {
                lbcVar.f0();
                this.e.l0();
                this.e = null;
            }
            n00 n00Var = this.I;
            if (n00Var == null || !n00Var.g) {
                kac kacVar = this.n;
                if (kacVar != null) {
                    kacVar.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new yi8(this, (byte) 6)).start();
                }
            } else {
                n00Var.a(null);
            }
            kob kobVar = this.G;
            if (kobVar != null) {
                kobVar.o(false, null, 1L, 0.0f);
            }
            gl.r(this.L);
            if (a5bVar != null) {
                gl.c3(a5bVar);
                return;
            }
            return;
        }
        lbc lbcVar2 = this.e;
        if (lbcVar2 != null) {
            lbcVar2.l0();
            this.e = null;
        }
        byte b = 0;
        lbc lbcVar3 = new lbc();
        this.e = lbcVar3;
        lbcVar3.E = true;
        lbcVar3.K = new xl3((ViewGroup) this, (Object) f4bVar, (Object) new Runnable[]{a5bVar}, (byte) 24);
        kac kacVar2 = this.n;
        if (kacVar2 != null) {
            kacVar2.clearAnimation();
            kac kacVar3 = this.n;
            td4 td4Var = kacVar3.b;
            if (td4Var != null) {
                td4Var.postRunnable(new rd4(td4Var, b));
            }
            kacVar3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new kac(this.e, getContext());
        this.H.e();
        kac kacVar4 = this.n;
        sl0 sl0Var = f4bVar.u ? null : this.H;
        kacVar4.s = sl0Var;
        td4 td4Var2 = kacVar4.b;
        if (td4Var2 != null && (xl0Var = td4Var2.J) != null) {
            sl0 sl0Var2 = xl0Var.t;
            if (sl0Var2 != null && sl0Var2.m != null) {
                sl0Var2.m = null;
            }
            xl0Var.t = sl0Var;
            if (sl0Var != null && sl0Var.m != xl0Var) {
                sl0Var.m = xl0Var;
                sl0Var.d();
            }
        }
        this.n.setOpaque(false);
        a();
        n00 n00Var2 = this.I;
        if (n00Var2 == null || !n00Var2.g) {
            this.n.setAlpha(a5bVar != null ? 1.0f : 0.0f);
            addView(this.n, nme.e(-2, -2, 51));
        } else {
            n00Var2.a(this.n);
        }
        zf7 zf7Var = new zf7(this, (byte) 17);
        e4b e4bVar = f4bVar.d1;
        if (e4bVar != null) {
            zf7Var.a(e4bVar);
        } else if (!f4bVar.K || Build.VERSION.SDK_INT < 24) {
            e4b e4bVar2 = new e4b();
            f4bVar.d1 = e4bVar2;
            zf7Var.a(e4bVar2);
        } else {
            Utilities.e.c(new a4b(f4bVar, zf7Var, b));
        }
        File file = f4bVar.Z0;
        if (file == null) {
            file = f4bVar.L;
        }
        this.e.i0(Uri.fromFile(file), "other");
        this.e.t0(this.A0.isEmpty());
        this.e.r0(true);
        if (f4bVar.h) {
            j = (long) ((f4bVar.Z * f4bVar.h0) + j);
        }
        if (j > 0) {
            this.e.p0(j, false);
        }
        b();
        w(true);
        boolean z = f4bVar.u && (arrayList = f4bVar.v) != null && arrayList.size() == 1 && ((k27) f4bVar.v.get(0)).D == 5;
        kob kobVar2 = this.G;
        File file2 = f4bVar.Z0;
        if (file2 == null) {
            file2 = f4bVar.L;
        }
        kobVar2.o(z, file2.getAbsolutePath(), getDuration(), f4bVar.P);
        this.G.setVideoLeft(f4bVar.Z);
        this.G.setVideoRight(f4bVar.a0);
        kob kobVar3 = this.G;
        if (kobVar3 == null || j <= 0) {
            return;
        }
        kobVar3.setProgress(j);
    }

    public final void u(f4b f4bVar) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (f4bVar == null) {
            this.T = null;
            return;
        }
        long j = f4bVar.z0;
        if (j == Long.MIN_VALUE) {
            this.T = null;
            return;
        }
        Drawable d = d(this.T, f4bVar.a, j, f4bVar.y0);
        f4bVar.x0 = d;
        this.T = d;
        if (this.S != d) {
            this.S = null;
        }
        if (d != null) {
            d.setCallback(this);
        }
        sl0 sl0Var = this.H;
        if (sl0Var != null) {
            Drawable drawable2 = this.T;
            if (drawable2 == null) {
                sl0Var.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                sl0Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.T.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 1080;
                    intrinsicHeight = 1920;
                }
                float f = intrinsicWidth;
                float f2 = intrinsicHeight;
                float max = Math.max(100.0f / f, 100.0f / f2);
                if (max > 1.0f) {
                    intrinsicWidth = (int) (f * max);
                    intrinsicHeight = (int) (f2 * max);
                }
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                this.T.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.T.draw(new Canvas(createBitmap));
                sl0Var.f(createBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double d;
        float f;
        PointF pointF;
        if (this.l0) {
            boolean z = motionEvent.getPointerCount() > 1;
            PointF pointF2 = this.n0;
            if (z) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f = loe.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f = 0.0f;
            }
            boolean z2 = this.q0;
            PointF pointF3 = this.m0;
            if (z2 != z) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.o0 = f;
                this.p0 = d;
                this.q0 = z;
            }
            if (this.d != null) {
                float width = r2.i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.t0;
                if (actionMasked == 0) {
                    this.v0 = 0.0f;
                    this.w0 = false;
                    invalidate();
                    this.x0 = true;
                    matrix.set(this.d.n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.x0 && this.d != null) {
                    float f2 = pointF2.x * width;
                    float f3 = pointF2.y * width;
                    float f4 = pointF3.x * width;
                    float f5 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f6 = this.o0;
                        if (f6 != 0.0f) {
                            float f7 = f / f6;
                            matrix.postScale(f7, f7, f2, f3);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.p0);
                        float f8 = this.v0 + degrees;
                        this.v0 = f8;
                        if (!this.s0) {
                            boolean z3 = Math.abs(f8) > 20.0f;
                            this.s0 = z3;
                            if (!z3) {
                                c(matrix);
                                this.s0 = (((float) Math.round(this.e0 / 90.0f)) * 90.0f) - this.e0 > 20.0f;
                            }
                            if (!this.w0) {
                                gl.W3(this);
                                this.w0 = true;
                            }
                        }
                        if (this.s0) {
                            matrix.postRotate(degrees, f2, f3);
                        }
                        this.r0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.r0) {
                        matrix.postTranslate(f2 - f4, f3 - f5);
                    }
                    Matrix matrix2 = this.u0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.a0;
                    matrix3.set(matrix);
                    c(matrix3);
                    float round = (Math.round(this.e0 / 90.0f) * 90.0f) - this.e0;
                    if (this.s0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.c0, this.d0);
                            if (!this.w0) {
                                gl.W3(this);
                                this.w0 = true;
                            }
                        } else {
                            this.w0 = false;
                        }
                    }
                    this.d.n0.set(matrix2);
                    this.d.j = true;
                    a();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.r0 = false;
                        t7b t7bVar = ((i7b) this).D0;
                        t7bVar.p1.a(true, false, t7bVar.j0);
                        t7bVar.p1.b(t7bVar.d1.getText());
                    }
                    this.x0 = false;
                    this.s0 = false;
                    this.v0 = 0.0f;
                    this.w0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.o0 = f;
                this.p0 = d;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.T == drawable || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r3 <= (r11 + r9)) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z) {
        long S;
        boolean c0;
        if (this.E == null || this.d == null) {
            return;
        }
        boolean z2 = true;
        if (this.e == null && this.y == null && !i()) {
            this.E.t0(this.A0.isEmpty());
            this.E.r0(true);
            long S2 = this.E.S();
            if (!z || this.E.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.E.U();
            f4b f4bVar = this.d;
            if ((U < f4bVar.E || U > f4bVar.F) && System.currentTimeMillis() - this.K > 500) {
                this.K = System.currentTimeMillis();
                this.E.p0(-this.d.D, false);
                return;
            }
            return;
        }
        if (i()) {
            S = this.F.getPositionWithOffset();
            c0 = this.F.r0;
        } else {
            lbc lbcVar = this.e;
            if (lbcVar == null) {
                lbcVar = this.y;
            }
            S = lbcVar.S();
            c0 = lbcVar.c0();
        }
        f4b f4bVar2 = this.d;
        float f = f4bVar2.F;
        float f2 = f4bVar2.E;
        float f3 = f4bVar2.C;
        long j = (long) ((f - f2) * f3);
        if (c0) {
            long j2 = f4bVar2.D;
            if (S >= j2) {
            }
        }
        z2 = false;
        long j3 = S - (f4bVar2.D - ((long) (f2 * f3)));
        if (this.E.c0() != z2) {
            this.E.t0(z2);
            this.E.p0(j3, false);
        } else if (z) {
            if (Math.abs(this.E.S() - j3) > (i() ? kk7.W4 : 120)) {
                this.E.p0(j3, false);
            }
        }
    }

    public final void x(int i, boolean z) {
        HashSet hashSet = this.A0;
        if (z) {
            hashSet.add(Integer.valueOf(i));
        } else {
            hashSet.remove(Integer.valueOf(i));
        }
        lbc lbcVar = this.e;
        if (lbcVar != null) {
            lbcVar.t0(hashSet.isEmpty());
        }
        qk2 qk2Var = this.F;
        if (qk2Var != null) {
            qk2Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z) {
        long S;
        boolean c0;
        if (this.y == null || this.d == null) {
            return;
        }
        if (this.e == null && !i()) {
            this.y.t0(this.A0.isEmpty());
            this.y.r0(true);
            am9 am9Var = this.x;
            if (am9Var != null && !am9Var.D0) {
                am9Var.D0 = true;
                am9Var.E0.f(true, true);
                am9Var.invalidate();
            }
            long S2 = this.y.S();
            if (!z || this.y.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.y.U();
            f4b f4bVar = this.d;
            if ((U < f4bVar.s0 || U > f4bVar.t0) && System.currentTimeMillis() - this.K > 500) {
                this.K = System.currentTimeMillis();
                this.y.p0(-this.d.r0, false);
                return;
            }
            return;
        }
        if (i()) {
            S = this.F.getPositionWithOffset();
            c0 = this.F.r0;
        } else {
            S = this.e.S();
            c0 = this.e.c0();
        }
        f4b f4bVar2 = this.d;
        float f = f4bVar2.t0;
        float f2 = f4bVar2.s0;
        float f3 = f4bVar2.q0;
        long j = (long) ((f - f2) * f3);
        long j2 = f4bVar2.r0;
        boolean z2 = S >= j2 && S <= j + j2;
        boolean z3 = c0 && z2;
        long j3 = (S - j2) + ((long) (f2 * f3));
        am9 am9Var2 = this.x;
        if (am9Var2 != null && am9Var2.D0 != z2) {
            am9Var2.D0 = z2;
            am9Var2.invalidate();
        }
        if (this.y.c0() != z3) {
            this.y.t0(z3);
            this.y.p0(j3, false);
        } else if (z) {
            if (Math.abs(this.y.S() - j3) > (i() ? kk7.W4 : 120)) {
                this.y.p0(j3, false);
            }
        }
    }
}
