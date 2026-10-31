package vh;

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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.ur;
import org.telegram.messenger.vp;
import org.telegram.messenger.ye;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x9;
import org.telegram.ui.px0;
import org.telegram.ui.vg;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class k4 extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public b0 A0;
    public u61 D;
    public x E;
    public z8 F;
    public final s9 G;
    public final j4 H;
    public long I;
    public long J;
    public final i4 K;
    public final i4 L;
    public final i4 M;
    public y6 N;
    public boolean O;
    public final org.telegram.ui.Components.t5 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap a;
    public final float[] a0;
    public final Rect b;
    public float b0;
    public final Rect c;
    public float c0;
    public n5 d;
    public float d0;
    public u61 e;
    public boolean e0;
    public int f;
    public final org.telegram.ui.Components.t5 f0;
    public boolean g0;
    public int h;
    public final Matrix h0;
    public final Matrix i0;
    public final Matrix j0;
    public boolean k0;
    public final PointF l0;
    public final PointF m0;
    public k61 n;
    public float n0;
    public double o0;
    public boolean p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public oe0 s;
    public final Matrix s0;
    public final Matrix t0;
    public float u0;
    public boolean v0;
    public y6 w;
    public boolean w0;
    public jg.i2 x;
    public long x0;
    public u61 y;
    public Runnable y0;
    public final HashSet z0;

    public k4(Context context, s9 s9Var, j4 j4Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new i4(this, 2);
        this.K = new i4(this, 3);
        this.L = new i4(this, 4);
        this.M = new i4(this, 5);
        this.P = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.a0 = new float[2];
        this.e0 = true;
        this.f0 = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.g);
        this.g0 = false;
        this.h0 = new Matrix();
        this.i0 = new Matrix();
        this.j0 = new Matrix();
        this.k0 = true;
        this.l0 = new PointF();
        this.m0 = new PointF();
        this.s0 = new Matrix();
        this.t0 = new Matrix();
        this.z0 = new HashSet();
        this.G = s9Var;
        this.H = j4Var;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.i0.L(3.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(k4 k4Var, n5 n5Var) {
        long j10;
        long j11;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (n5Var != null) {
            int measuredWidth = k4Var.getMeasuredWidth() <= 0 ? org.telegram.messenger.i0.q.x : k4Var.getMeasuredWidth();
            int i10 = (int) ((measuredWidth * 16) / 9.0f);
            if (n5Var.K) {
                Bitmap bitmap = n5Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = n5Var.N) != null && str.startsWith("vthumb://")) {
                    j10 = Long.parseLong(n5Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = k4Var.getContext().getContentResolver().loadThumbnail(n5Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(measuredWidth, i10), null);
                        } catch (Exception unused) {
                        }
                    }
                    j11 = j10;
                    if (j11 >= 0 && n5Var.K && n5Var.N == null) {
                        k4Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = n5Var.Z0;
                        if (file == null) {
                            file = n5Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        vg vgVar = new vg(k4Var, n5Var, j11, file.getPath(), 8);
                        boolean z10 = n5Var.K;
                        bitmapArr[0] = n5.q(vgVar, measuredWidth, i10, !z10 ? n5Var.Q : 0, !z10);
                        zArr[0] = false;
                    }
                }
            }
            j10 = -1;
            j11 = j10;
            if (j11 >= 0) {
            }
            if (bitmapArr[0] == null) {
            }
        }
        org.telegram.messenger.i0.g3(new px0(k4Var, bitmapArr, n5Var, zArr, 26));
    }

    public static Drawable e(Drawable drawable, int i10, long j10, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull a2 = vp.r1(i10).a2(j10);
            if (a2 != null) {
                wallPaper = a2.wallpaper;
            }
        } else {
            TLRPC.ChatFull M0 = vp.r1(i10).M0(-j10);
            if (M0 != null) {
                wallPaper = M0.wallpaper;
            }
        }
        return f(drawable, i10, wallPaper, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable f(Drawable drawable, int i10, TLRPC.WallPaper wallPaper, boolean z10) {
        int[] iArr;
        org.telegram.ui.ActionBar.r6 k10;
        if (wallPaper != null && TextUtils.isEmpty(org.telegram.messenger.g4.j(wallPaper))) {
            return xn.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.y3 i11 = (wallPaper == null || wallPaper.settings == null) ? null : org.telegram.messenger.g4.f(i10).i(yf.b.d(wallPaper.settings.emoticon));
        if (i11 != null) {
            return g(i10, i11, z10);
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.t6.Q0(string) == null || org.telegram.ui.ActionBar.t6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.t6.Q0(string2) == null || !org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (s6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.s6 Q0 = !z10 ? org.telegram.ui.ActionBar.t6.Q0(str2) : org.telegram.ui.ActionBar.t6.Q0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = Q0.d;
            SparseIntArray T0 = str3 == null ? org.telegram.ui.ActionBar.t6.T0(null, str3, strArr) : org.telegram.ui.ActionBar.t6.T0(new File(Q0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.t6.em;
            if (iArr != null) {
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    sparseIntArray.put(i12, iArr[i12]);
                }
            }
            k10 = Q0.k(false);
            if (k10 == null) {
                k10.d(T0, sparseIntArray);
            } else {
                for (int i13 = 0; i13 < T0.size(); i13++) {
                    sparseIntArray.put(T0.keyAt(i13), T0.valueAt(i13));
                }
            }
            bh.d I = org.telegram.ui.ActionBar.t6.I(Q0, sparseIntArray, strArr[0], 0, true);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) I.b;
            return bitmapDrawable == null ? bitmapDrawable : (Drawable) I.a;
        }
        str = string;
        if (!z10) {
        }
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        String[] strArr2 = new String[1];
        String str32 = Q0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.t6.em;
        if (iArr != null) {
        }
        k10 = Q0.k(false);
        if (k10 == null) {
        }
        bh.d I2 = org.telegram.ui.ActionBar.t6.I(Q0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) I2.b;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.y3 y3Var, final boolean z10) {
        if (y3Var.l()) {
            org.telegram.ui.ActionBar.t6.I(org.telegram.ui.ActionBar.y3.d(z10), y3Var.g(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.x3) y3Var.f.get(z10 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g10 = y3Var.g(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.t6.Be;
        int i12 = g10.get(i11, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.t6.Ce;
        int i14 = g10.get(i13, org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.t6.De;
        int i16 = g10.get(i15, org.telegram.ui.ActionBar.t6.x0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.t6.Ee;
        int i18 = g10.get(i17, org.telegram.ui.ActionBar.t6.x0(null, i17, false));
        final jb0 jb0Var = new jb0();
        jb0Var.g = false;
        jb0Var.s(jb0Var.u, y3Var.j(z10 ? 1 : 0).settings.intensity);
        jb0Var.o(i12, i14, i16, i18, 0, true);
        jb0Var.u(0);
        final int f7 = jb0Var.f();
        y3Var.n(z10 ? 1 : 0, new ResultCallback() { // from class: vh.h4
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((wf.a) pair.second).a;
                org.telegram.ui.ActionBar.y3 y3Var2 = org.telegram.ui.ActionBar.y3.this;
                if (longValue != y3Var2.h(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i19 = y3Var2.j(z10 ? 1 : 0).settings.intensity;
                jb0 jb0Var2 = jb0Var;
                jb0Var2.s(bitmap, i19);
                jb0Var2.t(f7);
                jb0Var2.r(1.0f);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(Throwable th2) {
                org.telegram.tgnet.l.a(this, th2);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.l.b(this, tL_error);
            }
        });
        return jb0Var;
    }

    private void setupCollage(n5 n5Var) {
        z8 z8Var = this.F;
        if (z8Var != null) {
            z8Var.setCollage(n5Var != null ? n5Var.T : null);
        }
    }

    private void setupImage(n5 n5Var) {
        Utilities.g.c(new d1(5, this, n5Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        n5 n5Var;
        u61 u61Var = this.e;
        float f10 = 0.0f;
        if (u61Var != null) {
            u61Var.B0((this.O || ((n5Var = this.d) != null && n5Var.Y)) ? 0.0f : n5Var != null ? n5Var.P : 1.0f);
        }
        u61 u61Var2 = this.y;
        if (u61Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                n5 n5Var2 = this.d;
                f7 = n5Var2 != null ? n5Var2.u0 : 1.0f;
            }
            u61Var2.B0(f7);
        }
        u61 u61Var3 = this.D;
        if (u61Var3 != null) {
            if (!this.O) {
                n5 n5Var3 = this.d;
                f10 = n5Var3 != null ? n5Var3.G : 1.0f;
            }
            u61Var3.B0(f10);
        }
        x xVar = this.E;
        if (xVar != null) {
            xVar.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        if (this.d == null) {
            return;
        }
        float[] fArr = this.a0;
        fArr[0] = r0.k0 / 2.0f;
        fArr[1] = r0.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.b0 = fArr[0];
        this.c0 = fArr[1];
        n5 n5Var = this.d;
        fArr[0] = n5Var.k0;
        fArr[1] = n5Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.c0, fArr[0] - this.b0));
        w7.z8.a(this.b0, this.c0, fArr[0], fArr[1]);
        n5 n5Var2 = this.d;
        fArr[0] = n5Var2.k0 / 2.0f;
        fArr[1] = n5Var2.l0;
        matrix.mapPoints(fArr);
        w7.z8.a(this.b0, this.c0, fArr[0], fArr[1]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.S != null) {
            if (this.g0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            float e = ((drawable instanceof jb0) && ((jb0) drawable).u == null) ? 0.0f : this.P.e(false, 1.0f);
            Drawable drawable2 = this.R;
            if (drawable2 != null && e < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - e) * 255.0f));
                n5.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (e * 255.0f));
            n5.j(canvas, this.S, getWidth(), getHeight());
            if (this.g0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.T);
        }
        b0 b0Var = this.A0;
        if (b0Var != null) {
            b0Var.d.b(canvas2, true);
        } else if (this.e0 && this.d != null && !j()) {
            float d = this.f0.d(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    n5 n5Var = this.d;
                    int i10 = n5Var.k0;
                    int i11 = n5Var.l0;
                    int i12 = n5Var.Q;
                    ye yeVar = n5Var.m0;
                    if (((i12 + yeVar.k) / 90) % 2 == 1) {
                        i11 = i10;
                        i10 = i11;
                    }
                    float f7 = yeVar.e;
                    float f10 = yeVar.f;
                    float f11 = i10;
                    float f12 = i11;
                    canvas2.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                    float f13 = this.d.m0.c;
                    canvas2.scale(f13, f13);
                    ye yeVar2 = this.d.m0;
                    canvas2.translate(yeVar2.a * f11, yeVar2.b * f12);
                    canvas2.rotate(this.d.m0.d + r0.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    n5 n5Var2 = this.d;
                    canvas2.translate((-n5Var2.k0) / 2.0f, (-n5Var2.l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                n5 n5Var3 = this.d;
                int i13 = n5Var3.k0;
                int i14 = n5Var3.l0;
                Rect rect2 = this.c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x017d, code lost:
    
        if (r1 != false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        boolean v = v(motionEvent);
        o8 o8Var = ((d8) this).C0;
        e8 e8Var = o8Var.c1;
        boolean z10 = false;
        if (e8Var == null || !e8Var.N1) {
            ne0 ne0Var = o8Var.C1;
            eb0 eb0Var = ne0Var.I;
            if (ne0Var.w && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    ne0Var.D = false;
                    ne0Var.E = System.currentTimeMillis();
                    ne0Var.F = motionEvent.getX();
                    ne0Var.G = motionEvent.getY();
                    oe0 oe0Var = ne0Var.x;
                    if (oe0Var != null) {
                        ne0Var.H = oe0Var.getEnhanceValue();
                    }
                    z10 = true;
                    if (motionEvent.getAction() == 0) {
                        this.x0 = System.currentTimeMillis();
                    } else if (motionEvent.getAction() == 1) {
                        if (System.currentTimeMillis() - this.x0 <= ViewConfiguration.getTapTimeout() && (runnable = this.y0) != null) {
                            runnable.run();
                        }
                        this.x0 = 0L;
                    } else if (motionEvent.getAction() == 3) {
                        this.x0 = 0L;
                    }
                    if (!z10) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (motionEvent.getPointerCount() <= 1) {
                        super.dispatchTouchEvent(motionEvent);
                    }
                    return true;
                }
                if (action == 2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    if (!ne0Var.D && System.currentTimeMillis() - ne0Var.E <= ViewConfiguration.getLongPressTimeout() && Math.abs(ne0Var.G - y3) < Math.abs(ne0Var.F - x10) && Math.abs(ne0Var.F - x10) > org.telegram.messenger.i0.e) {
                        ne0Var.D = true;
                        org.telegram.messenger.i0.r(eb0Var);
                        ne0Var.r = true;
                        ne0Var.invalidate();
                    }
                    if (ne0Var.D) {
                        float f7 = x10 - ne0Var.F;
                        if (ne0Var.x == null) {
                            ne0Var.y.run();
                        }
                        oe0 oe0Var2 = ne0Var.x;
                        if (oe0Var2 == null) {
                            ne0Var.D = false;
                        } else {
                            float enhanceValue = oe0Var2.getEnhanceValue();
                            float i10 = Utilities.i((f7 / (org.telegram.messenger.i0.q.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(i10 * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(ne0Var.H * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (tz.o() == 2 ? 5 : 10)) {
                                    org.telegram.messenger.i0.b4(ne0Var);
                                    ne0Var.H = i10;
                                }
                            } else {
                                try {
                                    ne0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                ne0Var.H = i10;
                            }
                            ne0Var.x.setEnhanceValue(i10);
                            oe0 oe0Var3 = ne0Var.x;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((oe0Var3 == null ? 0.0f : oe0Var3.getEnhanceValue()) * 100.0f), ne0Var.b, ne0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            ne0Var.f = staticLayout;
                            ne0Var.h = staticLayout.getLineCount() > 0 ? ne0Var.f.getLineWidth(0) : 0.0f;
                            ne0Var.n = ne0Var.f.getLineCount() > 0 ? ne0Var.f.getLineLeft(0) : 0.0f;
                            ne0Var.invalidate();
                        }
                    }
                    ne0Var.F = x10;
                    ne0Var.G = y3;
                } else if (action == 1 || action == 3) {
                    ne0Var.D = false;
                    ne0Var.E = -1L;
                    oe0 oe0Var4 = ne0Var.x;
                    if (oe0Var4 != null) {
                        ne0Var.H = oe0Var4.getEnhanceValue();
                    }
                    org.telegram.messenger.i0.h3(eb0Var, 600L);
                }
            } else if (ne0Var.r) {
                ne0Var.r = false;
                ne0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        n5 n5Var;
        n5 n5Var2;
        k61 k61Var = this.n;
        if (view == k61Var && (n5Var2 = this.d) != null && n5Var2.u) {
            return false;
        }
        if ((view != k61Var && view != this.r) || (n5Var = this.d) == null || n5Var.m0 == null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            n5 n5Var3 = this.d;
            int i10 = n5Var3.k0;
            int i11 = n5Var3.l0;
            int i12 = n5Var3.Q;
            ye yeVar = n5Var3.m0;
            if (((i12 + yeVar.k) / 90) % 2 == 1) {
                i11 = i10;
                i10 = i11;
            }
            float f7 = yeVar.e;
            float f10 = yeVar.f;
            canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
            canvas.rotate(this.d.Q);
            n5 n5Var4 = this.d;
            canvas.translate((-n5Var4.k0) / 2.0f, (-n5Var4.l0) / 2.0f);
        }
        canvas.concat(this.h0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        n5 n5Var = this.d;
        if (n5Var == null) {
            return 1;
        }
        return n5Var.l0;
    }

    public int getContentWidth() {
        n5 n5Var = this.d;
        if (n5Var == null) {
            return 1;
        }
        return n5Var.k0;
    }

    public long getCurrentPosition() {
        u61 u61Var = this.e;
        if (u61Var != null) {
            return u61Var.S();
        }
        u61 u61Var2 = this.y;
        if (u61Var2 != null) {
            return u61Var2.S();
        }
        u61 u61Var3 = this.D;
        if (u61Var3 != null) {
            return u61Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        n5 n5Var = this.d;
        if (n5Var != null) {
            double d = n5Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        u61 u61Var = this.e;
        if (u61Var == null || u61Var.U() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.U();
    }

    public int getOrientation() {
        n5 n5Var = this.d;
        if (n5Var == null) {
            return 0;
        }
        return n5Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public k61 getTextureView() {
        return this.n;
    }

    public final void h(q20 q20Var, View... viewArr) {
        k61 k61Var;
        int L = (int) (org.telegram.messenger.i0.L(26.0f) * org.telegram.messenger.i0.p);
        int L2 = (int) (org.telegram.messenger.i0.L(30.33f) * org.telegram.messenger.i0.p);
        int L3 = (int) (org.telegram.messenger.i0.L(4.0f) * org.telegram.messenger.i0.p);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (k61Var = this.n) != null) {
                    bitmapArr[i10] = k61Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i10] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i10] = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i10]);
                    canvas.save();
                    float max = Math.max(L / viewArr[i10].getWidth(), L2 / viewArr[i10].getHeight());
                    canvas.scale(max, max);
                    viewArr[i10].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.e.c(new ur(L, L2, L3, bitmapArr, q20Var));
    }

    public abstract void i();

    public final boolean j() {
        n5 n5Var;
        return (this.E == null || (n5Var = this.d) == null || !n5Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.z0.contains(-9982);
    }

    public final void l(n5 n5Var) {
        this.d = n5Var;
        if (n5Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (n5Var.K) {
            setupImage(n5Var);
            if (n5Var.A0 == 0 && n5Var.B0 == 0) {
                n5Var.z(new i4((d8) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(n5Var);
            r();
        }
        b();
        u(n5Var);
        q(n5Var, false);
        s(n5Var, null, false);
    }

    public final void m(long j10) {
        u61 u61Var = this.e;
        if (u61Var != null) {
            u61Var.q0(j10, false);
        } else if (j()) {
            this.E.m(j10, false);
        } else {
            u61 u61Var2 = this.y;
            if (u61Var2 != null) {
                u61Var2.q0(j10, false);
            } else {
                u61 u61Var3 = this.D;
                if (u61Var3 != null) {
                    u61Var3.q0(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(n5 n5Var, c7 c7Var, long j10) {
        this.d = n5Var;
        if (n5Var == null) {
            t(null, c7Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (n5Var.v()) {
            setupImage(null);
            t(null, c7Var, j10);
            setupCollage(n5Var);
        } else if (n5Var.K) {
            setupImage(n5Var);
            setupCollage(null);
            t(n5Var, c7Var, j10);
            if (n5Var.A0 == 0 && n5Var.B0 == 0) {
                n5Var.z(new i4(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, c7Var, 0L);
            setupImage(n5Var);
            r();
        }
        b();
        u(n5Var);
        q(n5Var, false);
        s(n5Var, null, false);
    }

    public final void o(TextureView textureView, oe0 oe0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = oe0Var;
        this.r = textureView;
        if (oe0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            gz gzVar = oe0Var.l0;
            if (gzVar != null) {
                gzVar.h(i10, i11);
            } else {
                oe0Var.J0 = i10;
                oe0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.k0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        return true;
    }

    public final void p(jj jjVar) {
        long duration;
        n5 n5Var = this.d;
        if (n5Var != null) {
            n5Var.j = true;
            if (jjVar != null) {
                int i10 = jjVar.I1;
                if (jjVar.k != null) {
                    TLRPC.Document F0 = jjVar.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i11 = 0;
                    if (TextUtils.isEmpty(jjVar.k.attachPath)) {
                        org.telegram.messenger.b8.G(i10);
                        File K = org.telegram.messenger.b8.K(F0, null, false, true);
                        if (K == null || !K.exists()) {
                            org.telegram.messenger.b8.G(i10);
                            K = org.telegram.messenger.b8.K(F0, null, true, true);
                            if (K == null || !K.exists()) {
                                n5 n5Var2 = this.d;
                                n5Var2.y = null;
                                n5Var2.z = null;
                                n5Var2.A = null;
                                n5Var2.B = null;
                                n5Var2.D = 0L;
                                n5Var2.C = 0L;
                                n5Var2.E = 0.0f;
                                n5Var2.F = 1.0f;
                                return;
                            }
                            this.d.y = K.getAbsolutePath();
                        }
                        this.d.y = K.getAbsolutePath();
                    } else {
                        this.d.y = jjVar.k.attachPath;
                    }
                    n5 n5Var3 = this.d;
                    n5Var3.A = null;
                    n5Var3.B = null;
                    if (F0 != null) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
                        int size = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                            i12++;
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
                    n5 n5Var4 = this.d;
                    n5Var4.D = 0L;
                    if (n5Var4.K) {
                        n5Var4.D = (long) (n5Var4.Z * getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.E.h;
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            n5 n5Var5 = ((w) obj).n;
                            if (n5Var5 != null && n5Var5.K) {
                                duration = this.E.getDuration();
                                break;
                            }
                        }
                    }
                    n5 n5Var6 = this.d;
                    duration = n5Var6.K ? getDuration() : n5Var6.C;
                    z8 z8Var = this.F;
                    int maxCount = z8Var == null ? 1 : z8Var.getMaxCount();
                    n5 n5Var7 = this.d;
                    n5Var7.F = n5Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
                }
            }
            n5Var.y = null;
            n5Var.z = null;
            n5Var.A = null;
            n5Var.B = null;
            n5Var.D = 0L;
            n5Var.C = 0L;
            n5Var.E = 0.0f;
            n5Var.F = 1.0f;
        }
        q(this.d, true);
    }

    public final void q(n5 n5Var, boolean z10) {
        boolean z11;
        u61 u61Var = this.D;
        if (u61Var != null) {
            u61Var.g0();
            this.D.m0();
            this.D = null;
        }
        if (n5Var == null) {
            return;
        }
        z8 z8Var = this.F;
        boolean z12 = false;
        if (z8Var != null) {
            String str = n5Var.y;
            String str2 = n5Var.A;
            String str3 = n5Var.B;
            long j10 = n5Var.C;
            long j11 = n5Var.D;
            float f7 = n5Var.E;
            float f10 = n5Var.F;
            float f11 = n5Var.G;
            if (!TextUtils.equals(z8Var.O, str)) {
                s8 s8Var = z8Var.a0;
                if (s8Var != null) {
                    s8Var.a();
                    z8Var.a0 = null;
                    z8Var.U = false;
                }
                z8Var.O = str;
                z8Var.p();
            }
            z8Var.O = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            z8Var.N = !isEmpty;
            if (isEmpty) {
                z8Var.P = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (z8Var.N) {
                z8Var.R = j10;
                z8Var.Q = j11 - ((long) (j10 * f7));
                z8Var.S = f7;
                z8Var.T = f10;
                z8Var.V = f11;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, z8Var.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    z8Var.M0 = staticLayout;
                    z8Var.N0 = staticLayout.getLineCount() > 0 ? z8Var.M0.getLineWidth(0) : 0.0f;
                    z8Var.O0 = z8Var.M0.getLineCount() > 0 ? z8Var.M0.getLineLeft(0) : 0.0f;
                } else {
                    z8Var.N0 = 0.0f;
                    z8Var.M0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, z8Var.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    z8Var.Q0 = staticLayout2;
                    z8Var.R0 = staticLayout2.getLineCount() > 0 ? z8Var.Q0.getLineWidth(0) : 0.0f;
                    z8Var.S0 = z8Var.Q0.getLineCount() > 0 ? z8Var.Q0.getLineLeft(0) : 0.0f;
                } else {
                    z8Var.R0 = 0.0f;
                    z8Var.Q0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                z8Var.e0.f(z8Var.N, true);
            }
            z8Var.invalidate();
        } else {
            z11 = true;
        }
        if (n5Var.y != null) {
            u61 u61Var2 = new u61();
            this.D = u61Var2;
            u61Var2.D = z11;
            u61Var2.J = new e0(this);
            u61Var2.j0(Uri.fromFile(new File(n5Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (n5Var.Z * getDuration());
                this.e.q0(duration, false);
                this.F.setProgress(duration);
            }
            z11 = true;
            w(true);
        }
        o8 o8Var = ((d8) this).C0;
        s7 s7Var = o8Var.v1;
        if (s7Var != null) {
            n5 n5Var2 = o8Var.K1;
            if (n5Var2 != null && n5Var2.y != null) {
                z12 = z11;
            }
            s7Var.setHasAudio(z12);
        }
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : org.telegram.messenger.i0.q.y;
        n5 n5Var = this.d;
        int i10 = n5Var.A0;
        Paint paint = this.T;
        if (i10 == 0 || n5Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new ag.s2(this, measuredHeight, 7).a(w7.l8.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f7 = measuredHeight;
            n5 n5Var2 = this.d;
            int i11 = n5Var2.A0;
            this.U = i11;
            int i12 = n5Var2.B0;
            this.V = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            k61 k61Var = this.n;
            if (k61Var != null) {
                int i13 = this.U;
                int i14 = this.V;
                gz gzVar = k61Var.b;
                if (gzVar == null) {
                    k61Var.n = i13;
                    k61Var.r = i14;
                } else {
                    gzVar.h(i13, i14);
                }
            }
            oe0 oe0Var = this.s;
            if (oe0Var != null) {
                int i15 = this.U;
                int i16 = this.V;
                gz gzVar2 = oe0Var.l0;
                if (gzVar2 != null) {
                    gzVar2.h(i15, i16);
                } else {
                    oe0Var.J0 = i15;
                    oe0Var.K0 = i16;
                }
            }
        }
        invalidate();
    }

    public final void s(n5 n5Var, jg.i2 i2Var, boolean z10) {
        u61 u61Var;
        if (n5Var == null || n5Var.o0 == null) {
            u61 u61Var2 = this.y;
            if (u61Var2 != null) {
                u61Var2.g0();
                this.y.m0();
                this.y = null;
            }
            z8 z8Var = this.F;
            if (z8Var != null) {
                z8Var.setRoundNull(z10);
            }
            this.x = null;
            org.telegram.messenger.i0.r(this.K);
            return;
        }
        u61 u61Var3 = this.y;
        if (u61Var3 != null) {
            u61Var3.m0();
            this.y = null;
        }
        u61 u61Var4 = new u61();
        this.y = u61Var4;
        u61Var4.D = true;
        u61Var4.J = new w3(this);
        this.y.j0(Uri.fromFile(n5Var.o0), "other");
        c();
        this.x = i2Var;
        if (i2Var != null && (u61Var = this.y) != null) {
            u61Var.A0(i2Var.u0);
        }
        this.F.n(n5Var.o0.getAbsolutePath(), n5Var.q0, n5Var.r0, n5Var.s0, n5Var.t0, n5Var.u0, z10);
        y(true);
    }

    public void set(n5 n5Var) {
        n(n5Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.k0 = z10;
    }

    public void setCollageView(x xVar) {
        this.E = xVar;
    }

    public void setCropEditorDrawing(b0 b0Var) {
        if (this.A0 != b0Var) {
            this.A0 = b0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.y0 = runnable;
    }

    public void setVideoTimelineView(z8 z8Var) {
        this.F = z8Var;
        if (z8Var != null) {
            z8Var.setDelegate(new r2.y(this, 13));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.lang.Runnable[]] */
    public final void t(n5 n5Var, Runnable runnable, long j10) {
        ArrayList arrayList;
        x9 x9Var;
        if (n5Var == null || n5Var.v()) {
            u61 u61Var = this.e;
            if (u61Var != null) {
                u61Var.g0();
                this.e.m0();
                this.e = null;
            }
            j4 j4Var = this.H;
            if (j4Var == null || !j4Var.g) {
                k61 k61Var = this.n;
                if (k61Var != null) {
                    k61Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new i4(this, 6)).start();
                }
            } else {
                j4Var.a(null);
            }
            z8 z8Var = this.F;
            if (z8Var != null) {
                z8Var.o(false, null, 1L, 0.0f);
            }
            org.telegram.messenger.i0.r(this.K);
            if (runnable != null) {
                org.telegram.messenger.i0.g3(runnable);
                return;
            }
            return;
        }
        u61 u61Var2 = this.e;
        if (u61Var2 != null) {
            u61Var2.m0();
            this.e = null;
        }
        int i10 = 0;
        u61 u61Var3 = new u61();
        this.e = u61Var3;
        u61Var3.D = true;
        u61Var3.J = new q5.d((FrameLayout) this, (Object) n5Var, (Serializable) new Runnable[]{runnable}, 15);
        k61 k61Var2 = this.n;
        if (k61Var2 != null) {
            k61Var2.clearAnimation();
            k61 k61Var3 = this.n;
            gz gzVar = k61Var3.b;
            if (gzVar != null) {
                gzVar.postRunnable(new dz(gzVar, i10));
            }
            k61Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new k61(getContext(), this.e);
        this.G.e();
        k61 k61Var4 = this.n;
        s9 s9Var = n5Var.u ? null : this.G;
        k61Var4.s = s9Var;
        gz gzVar2 = k61Var4.b;
        if (gzVar2 != null && (x9Var = gzVar2.I) != null) {
            s9 s9Var2 = x9Var.t;
            if (s9Var2 != null && s9Var2.m != null) {
                s9Var2.m = null;
            }
            x9Var.t = s9Var;
            if (s9Var != null && s9Var.m != x9Var) {
                s9Var.m = x9Var;
                s9Var.d();
            }
        }
        this.n.setOpaque(false);
        b();
        j4 j4Var2 = this.H;
        if (j4Var2 == null || !j4Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, w7.b6.e(-2, -2, 51));
        } else {
            j4Var2.a(this.n);
        }
        ph.h1 h1Var = new ph.h1(this, 27);
        m5 m5Var = n5Var.d1;
        if (m5Var != null) {
            h1Var.a(m5Var);
        } else if (!n5Var.K || Build.VERSION.SDK_INT < 24) {
            m5 m5Var2 = new m5();
            n5Var.d1 = m5Var2;
            h1Var.a(m5Var2);
        } else {
            Utilities.e.c(new i5(n5Var, h1Var, i10));
        }
        File file = n5Var.Z0;
        if (file == null) {
            file = n5Var.L;
        }
        this.e.j0(Uri.fromFile(file), "other");
        this.e.u0(this.z0.isEmpty());
        this.e.s0(true);
        if (n5Var.h) {
            j10 = (long) ((n5Var.Z * n5Var.h0) + j10);
        }
        if (j10 > 0) {
            this.e.q0(j10, false);
        }
        c();
        w(true);
        boolean z10 = n5Var.u && (arrayList = n5Var.v) != null && arrayList.size() == 1 && ((jj) n5Var.v.get(0)).D == 5;
        z8 z8Var2 = this.F;
        File file2 = n5Var.Z0;
        if (file2 == null) {
            file2 = n5Var.L;
        }
        z8Var2.o(z10, file2.getAbsolutePath(), getDuration(), n5Var.P);
        this.F.setVideoLeft(n5Var.Z);
        this.F.setVideoRight(n5Var.a0);
        z8 z8Var3 = this.F;
        if (z8Var3 == null || j10 <= 0) {
            return;
        }
        z8Var3.setProgress(j10);
    }

    public final void u(n5 n5Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (n5Var == null) {
            this.S = null;
            return;
        }
        long j10 = n5Var.z0;
        if (j10 == Long.MIN_VALUE) {
            this.S = null;
            return;
        }
        Drawable e = e(this.S, n5Var.a, j10, n5Var.y0);
        n5Var.x0 = e;
        this.S = e;
        if (this.R != e) {
            this.R = null;
        }
        if (e != null) {
            e.setCallback(this);
        }
        s9 s9Var = this.G;
        if (s9Var != null) {
            Drawable drawable2 = this.S;
            if (drawable2 == null) {
                s9Var.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                s9Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.S.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 1080;
                    intrinsicHeight = 1920;
                }
                float f7 = intrinsicWidth;
                float f10 = intrinsicHeight;
                float max = Math.max(100.0f / f7, 100.0f / f10);
                if (max > 1.0f) {
                    intrinsicWidth = (int) (f7 * max);
                    intrinsicHeight = (int) (f10 * max);
                }
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                this.S.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.S.draw(new Canvas(createBitmap));
                s9Var.f(createBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double d;
        float f7;
        PointF pointF;
        if (this.k0) {
            boolean z10 = motionEvent.getPointerCount() > 1;
            PointF pointF2 = this.m0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f7 = w7.z8.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f7 = 0.0f;
            }
            boolean z11 = this.p0;
            PointF pointF3 = this.l0;
            if (z11 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.n0 = f7;
                this.o0 = d;
                this.p0 = z10;
            }
            if (this.d != null) {
                float width = r2.i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.s0;
                if (actionMasked == 0) {
                    this.u0 = 0.0f;
                    this.v0 = false;
                    invalidate();
                    this.w0 = true;
                    matrix.set(this.d.n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.o0);
                        float f16 = this.u0 + degrees;
                        this.u0 = f16;
                        if (!this.r0) {
                            boolean z12 = Math.abs(f16) > 20.0f;
                            this.r0 = z12;
                            if (!z12) {
                                d(matrix);
                                this.r0 = (((float) Math.round(this.d0 / 90.0f)) * 90.0f) - this.d0 > 20.0f;
                            }
                            if (!this.v0) {
                                org.telegram.messenger.i0.b4(this);
                                this.v0 = true;
                            }
                        }
                        if (this.r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.d0 / 90.0f) * 90.0f) - this.d0;
                    if (this.r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.b0, this.c0);
                            if (!this.v0) {
                                org.telegram.messenger.i0.b4(this);
                                this.v0 = true;
                            }
                        } else {
                            this.v0 = false;
                        }
                    }
                    this.d.n0.set(matrix2);
                    this.d.j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.q0 = false;
                        o8 o8Var = ((d8) this).C0;
                        o8Var.o1.a(true, false, o8Var.i0);
                        o8Var.o1.b(o8Var.c1.getText());
                    }
                    this.w0 = false;
                    this.r0 = false;
                    this.u0 = 0.0f;
                    this.v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.n0 = f7;
                this.o0 = d;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.S == drawable || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r2 <= (r11 + r9)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z10) {
        long S;
        boolean d02;
        if (this.D == null || this.d == null) {
            return;
        }
        boolean z11 = true;
        if (this.e == null && this.y == null && !j()) {
            this.D.u0(this.z0.isEmpty());
            this.D.s0(true);
            long S2 = this.D.S();
            if (!z10 || this.D.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.D.U();
            n5 n5Var = this.d;
            if ((U < n5Var.E || U > n5Var.F) && System.currentTimeMillis() - this.J > 500) {
                this.J = System.currentTimeMillis();
                this.D.p0(-this.d.D);
                return;
            }
            return;
        }
        if (j()) {
            S = this.E.getPositionWithOffset();
            d02 = this.E.q0;
        } else {
            u61 u61Var = this.e;
            if (u61Var == null) {
                u61Var = this.y;
            }
            S = u61Var.S();
            d02 = u61Var.d0();
        }
        n5 n5Var2 = this.d;
        float f7 = n5Var2.F;
        float f10 = n5Var2.E;
        long j10 = n5Var2.C;
        long j11 = (long) ((f7 - f10) * j10);
        if (d02) {
            long j12 = n5Var2.D;
            if (S >= j12) {
            }
        }
        z11 = false;
        long j13 = S - (n5Var2.D - ((long) (f10 * j10)));
        if (this.D.d0() != z11) {
            this.D.u0(z11);
            this.D.p0(j13);
        } else if (z10) {
            if (Math.abs(this.D.S() - j13) > (j() ? zs.X4 : 120)) {
                this.D.p0(j13);
            }
        }
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        u61 u61Var = this.e;
        if (u61Var != null) {
            u61Var.u0(hashSet.isEmpty());
        }
        x xVar = this.E;
        if (xVar != null) {
            xVar.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long S;
        boolean d02;
        if (this.y == null || this.d == null) {
            return;
        }
        if (this.e == null && !j()) {
            this.y.u0(this.z0.isEmpty());
            this.y.s0(true);
            jg.i2 i2Var = this.x;
            if (i2Var != null && !i2Var.B0) {
                i2Var.B0 = true;
                i2Var.C0.f(true, true);
                i2Var.invalidate();
            }
            long S2 = this.y.S();
            if (!z10 || this.y.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.y.U();
            n5 n5Var = this.d;
            if ((U < n5Var.s0 || U > n5Var.t0) && System.currentTimeMillis() - this.J > 500) {
                this.J = System.currentTimeMillis();
                this.y.q0(-this.d.r0, false);
                return;
            }
            return;
        }
        if (j()) {
            S = this.E.getPositionWithOffset();
            d02 = this.E.q0;
        } else {
            S = this.e.S();
            d02 = this.e.d0();
        }
        n5 n5Var2 = this.d;
        float f7 = n5Var2.t0;
        float f10 = n5Var2.s0;
        float f11 = n5Var2.q0;
        long j10 = (long) ((f7 - f10) * f11);
        long j11 = n5Var2.r0;
        boolean z11 = S >= j11 && S <= j10 + j11;
        boolean z12 = d02 && z11;
        long j12 = (S - j11) + ((long) (f10 * f11));
        jg.i2 i2Var2 = this.x;
        if (i2Var2 != null && i2Var2.B0 != z11) {
            i2Var2.B0 = z11;
            i2Var2.invalidate();
        }
        if (this.y.d0() != z12) {
            this.y.u0(z12);
            this.y.q0(j12, false);
        } else if (z10) {
            if (Math.abs(this.y.S() - j12) > (j() ? zs.X4 : 120)) {
                this.y.q0(j12, false);
            }
        }
    }
}
