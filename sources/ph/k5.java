package ph;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tg;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zz;
import org.telegram.ui.co;
import org.telegram.ui.dy0;
import org.telegram.ui.sg1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class k5 extends FrameLayout {
    public static final /* synthetic */ int y0 = 0;
    public y B;
    public oa C;
    public final org.telegram.ui.Components.ba D;
    public final j5 E;
    public long F;
    public long G;
    public final i5 H;
    public final i5 I;
    public final i5 J;
    public g8 K;
    public boolean L;
    public final org.telegram.ui.Components.z5 M;
    public final Paint N;
    public Drawable O;
    public Drawable P;
    public final Paint Q;
    public int R;
    public int S;
    public final Matrix T;
    public final float[] U;
    public float V;
    public float W;
    public Bitmap a;
    public float a0;
    public final Rect b;
    public boolean b0;
    public final Rect c;
    public final org.telegram.ui.Components.z5 c0;
    public t6 d;
    public boolean d0;
    public i71 e;
    public final Matrix e0;
    public int f;
    public final Matrix f0;
    public final Matrix g0;
    public int h;
    public boolean h0;
    public final PointF i0;
    public final PointF j0;
    public float k0;
    public double l0;
    public boolean m0;
    public w61 n;
    public boolean n0;
    public boolean o0;
    public final Matrix p0;
    public final Matrix q0;
    public TextureView r;
    public float r0;
    public of0 s;
    public boolean s0;
    public boolean t0;
    public long u0;
    public g8 v;
    public Runnable v0;
    public dg.b3 w;
    public final HashSet w0;
    public i71 x;
    public c0 x0;
    public i71 y;

    public k5(Context context, org.telegram.ui.Components.ba baVar, j5 j5Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new i5(this, 2);
        this.H = new i5(this, 3);
        this.I = new i5(this, 4);
        this.J = new i5(this, 5);
        this.M = new org.telegram.ui.Components.z5(this, 0L, 350L, mr.h);
        this.N = new Paint(7);
        this.Q = new Paint(1);
        this.T = new Matrix();
        this.U = new float[2];
        this.b0 = true;
        this.c0 = new org.telegram.ui.Components.z5(this, 0L, 320L, mr.g);
        this.d0 = false;
        this.e0 = new Matrix();
        this.f0 = new Matrix();
        this.g0 = new Matrix();
        this.h0 = true;
        this.i0 = new PointF();
        this.j0 = new PointF();
        this.p0 = new Matrix();
        this.q0 = new Matrix();
        this.w0 = new HashSet();
        this.D = baVar;
        this.E = j5Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(k5 k5Var, t6 t6Var) {
        long j10;
        long j11;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (t6Var != null) {
            int measuredWidth = k5Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : k5Var.getMeasuredWidth();
            int i10 = (int) ((measuredWidth * 16) / 9.0f);
            if (t6Var.K) {
                Bitmap bitmap = t6Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = t6Var.N) != null && str.startsWith("vthumb://")) {
                    j10 = Long.parseLong(t6Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = k5Var.getContext().getContentResolver().loadThumbnail(t6Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(measuredWidth, i10), null);
                        } catch (Exception unused) {
                        }
                    }
                    j11 = j10;
                    if (j11 >= 0 && t6Var.K && t6Var.N == null) {
                        k5Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = t6Var.Z0;
                        if (file == null) {
                            file = t6Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        d9.c cVar = new d9.c(k5Var, t6Var, j11, file.getPath(), 7);
                        boolean z4 = t6Var.K;
                        bitmapArr[0] = t6.q(cVar, measuredWidth, i10, !z4 ? t6Var.Q : 0, !z4);
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
        AndroidUtilities.runOnUIThread(new dy0(k5Var, bitmapArr, t6Var, zArr, 13));
    }

    public static Drawable e(Drawable drawable, int i10, long j10, boolean z4) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
            if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
        }
        return f(drawable, i10, wallPaper, z4);
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
    public static Drawable f(Drawable drawable, int i10, TLRPC.WallPaper wallPaper, boolean z4) {
        int[] iArr;
        org.telegram.ui.ActionBar.h6 k10;
        if (wallPaper != null && TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
            return co.d(drawable, wallPaper, z4);
        }
        org.telegram.ui.ActionBar.e4 theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i10).getTheme(sf.b.d(wallPaper.settings.emoticon));
        if (theme != null) {
            return g(i10, theme, z4);
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.i6 N0 = !z4 ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = N0.d;
            SparseIntArray Q0 = str3 == null ? org.telegram.ui.ActionBar.j6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.j6.Q0(new File(N0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.j6.nl;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    sparseIntArray.put(i11, iArr[i11]);
                }
            }
            k10 = N0.k(false);
            if (k10 == null) {
                k10.c(Q0, sparseIntArray);
            } else {
                for (int i12 = 0; i12 < Q0.size(); i12++) {
                    sparseIntArray.put(Q0.keyAt(i12), Q0.valueAt(i12));
                }
            }
            c5.j H = org.telegram.ui.ActionBar.j6.H(N0, sparseIntArray, strArr[0], 0, true);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) H.b;
            return bitmapDrawable == null ? bitmapDrawable : (Drawable) H.a;
        }
        str = string;
        if (!z4) {
        }
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        String[] strArr2 = new String[1];
        String str32 = N0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.j6.nl;
        if (iArr != null) {
        }
        k10 = N0.k(false);
        if (k10 == null) {
        }
        c5.j H2 = org.telegram.ui.ActionBar.j6.H(N0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) H2.b;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.e4 e4Var, final boolean z4) {
        if (e4Var.m()) {
            org.telegram.ui.ActionBar.j6.H(org.telegram.ui.ActionBar.e4.e(z4), e4Var.h(i10, z4 ? 1 : 0), ((org.telegram.ui.ActionBar.d4) e4Var.f.get(z4 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = e4Var.h(i10, z4 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.j6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.j6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.j6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.j6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        final ec0 ec0Var = new ec0();
        ec0Var.g = false;
        ec0Var.t(ec0Var.u, e4Var.k(z4 ? 1 : 0).settings.intensity);
        ec0Var.o(i12, i14, i16, i18, 0, true);
        ec0Var.v(0);
        final int f10 = ec0Var.f();
        e4Var.o(z4 ? 1 : 0, new ResultCallback() { // from class: ph.h5
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((pf.a) pair.second).b;
                org.telegram.ui.ActionBar.e4 e4Var2 = org.telegram.ui.ActionBar.e4.this;
                if (longValue != e4Var2.i(z4 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i19 = e4Var2.k(z4 ? 1 : 0).settings.intensity;
                ec0 ec0Var2 = ec0Var;
                ec0Var2.t(bitmap, i19);
                ec0Var2.u(f10);
                ec0Var2.s(1.0f);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(Throwable th2) {
                org.telegram.tgnet.k.a(this, th2);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.k.b(this, tL_error);
            }
        });
        return ec0Var;
    }

    private void setupCollage(t6 t6Var) {
        oa oaVar = this.C;
        if (oaVar != null) {
            oaVar.setCollage(t6Var != null ? t6Var.T : null);
        }
    }

    private void setupImage(t6 t6Var) {
        Utilities.searchQueue.postRunnable(new sg1(24, this, t6Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        t6 t6Var;
        i71 i71Var = this.e;
        float f11 = 0.0f;
        if (i71Var != null) {
            i71Var.W((this.L || ((t6Var = this.d) != null && t6Var.Y)) ? 0.0f : t6Var != null ? t6Var.P : 1.0f);
        }
        i71 i71Var2 = this.x;
        if (i71Var2 != null) {
            if (this.L) {
                f10 = 0.0f;
            } else {
                t6 t6Var2 = this.d;
                f10 = t6Var2 != null ? t6Var2.u0 : 1.0f;
            }
            i71Var2.W(f10);
        }
        i71 i71Var3 = this.y;
        if (i71Var3 != null) {
            if (!this.L) {
                t6 t6Var3 = this.d;
                f11 = t6Var3 != null ? t6Var3.G : 1.0f;
            }
            i71Var3.W(f11);
        }
        y yVar = this.B;
        if (yVar != null) {
            yVar.setMuted(this.L);
        }
    }

    public final void d(Matrix matrix) {
        if (this.d == null) {
            return;
        }
        float[] fArr = this.U;
        fArr[0] = r0.k0 / 2.0f;
        fArr[1] = r0.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.V = fArr[0];
        this.W = fArr[1];
        t6 t6Var = this.d;
        fArr[0] = t6Var.k0;
        fArr[1] = t6Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.a0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.W, fArr[0] - this.V));
        k7.n6.a(this.V, this.W, fArr[0], fArr[1]);
        t6 t6Var2 = this.d;
        fArr[0] = t6Var2.k0 / 2.0f;
        fArr[1] = t6Var2.l0;
        matrix.mapPoints(fArr);
        k7.n6.a(this.V, this.W, fArr[0], fArr[1]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.P != null) {
            if (this.d0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.P;
            float d = ((drawable instanceof ec0) && ((ec0) drawable).u == null) ? 0.0f : this.M.d(1.0f, false);
            Drawable drawable2 = this.O;
            if (drawable2 != null && d < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - d) * 255.0f));
                t6.j(canvas, this.O, getWidth(), getHeight());
            }
            this.P.setAlpha((int) (d * 255.0f));
            t6.j(canvas, this.P, getWidth(), getHeight());
            if (this.d0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.Q);
        }
        c0 c0Var = this.x0;
        if (c0Var != null) {
            c0Var.d.b(canvas2, true);
        } else if (this.b0 && this.d != null && !j()) {
            float e = this.c0.e(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    t6 t6Var = this.d;
                    int i10 = t6Var.k0;
                    int i11 = t6Var.l0;
                    int i12 = t6Var.Q;
                    MediaController.CropState cropState = t6Var.m0;
                    if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                        i11 = i10;
                        i10 = i11;
                    }
                    float f10 = cropState.cropPw;
                    float f11 = cropState.cropPh;
                    float f12 = i10;
                    float f13 = i11;
                    canvas2.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                    float f14 = this.d.m0.cropScale;
                    canvas2.scale(f14, f14);
                    MediaController.CropState cropState2 = this.d.m0;
                    canvas2.translate(cropState2.cropPx * f12, cropState2.cropPy * f13);
                    canvas2.rotate(this.d.m0.cropRotate + r0.transformRotation);
                    if (this.d.m0.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    t6 t6Var2 = this.d;
                    canvas2.translate((-t6Var2.k0) / 2.0f, (-t6Var2.l0) / 2.0f);
                }
                Paint paint = this.N;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                t6 t6Var3 = this.d;
                int i13 = t6Var3.k0;
                int i14 = t6Var3.l0;
                Rect rect2 = this.c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0181, code lost:
    
        if (r1 != false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        boolean v = v(motionEvent);
        da daVar = ((s9) this).z0;
        t9 t9Var = daVar.Z0;
        boolean z4 = false;
        if (t9Var == null || !t9Var.L1) {
            mf0 mf0Var = daVar.z1;
            dc0 dc0Var = mf0Var.F;
            if (mf0Var.v && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    mf0Var.y = false;
                    mf0Var.B = System.currentTimeMillis();
                    mf0Var.C = motionEvent.getX();
                    mf0Var.D = motionEvent.getY();
                    of0 of0Var = mf0Var.w;
                    if (of0Var != null) {
                        mf0Var.E = of0Var.getEnhanceValue();
                    }
                    z4 = true;
                    if (motionEvent.getAction() == 0) {
                        this.u0 = System.currentTimeMillis();
                    } else if (motionEvent.getAction() == 1) {
                        if (System.currentTimeMillis() - this.u0 <= ViewConfiguration.getTapTimeout() && (runnable = this.v0) != null) {
                            runnable.run();
                        }
                        this.u0 = 0L;
                    } else if (motionEvent.getAction() == 3) {
                        this.u0 = 0L;
                    }
                    if (!z4) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (motionEvent.getPointerCount() <= 1) {
                        super.dispatchTouchEvent(motionEvent);
                    }
                    return true;
                }
                if (action == 2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (!mf0Var.y && System.currentTimeMillis() - mf0Var.B <= ViewConfiguration.getLongPressTimeout() && Math.abs(mf0Var.D - y10) < Math.abs(mf0Var.C - x10) && Math.abs(mf0Var.C - x10) > AndroidUtilities.touchSlop) {
                        mf0Var.y = true;
                        AndroidUtilities.cancelRunOnUIThread(dc0Var);
                        mf0Var.r = true;
                        mf0Var.invalidate();
                    }
                    if (mf0Var.y) {
                        float f10 = x10 - mf0Var.C;
                        if (mf0Var.w == null) {
                            mf0Var.x.run();
                        }
                        of0 of0Var2 = mf0Var.w;
                        if (of0Var2 == null) {
                            mf0Var.y = false;
                        } else {
                            float enhanceValue = of0Var2.getEnhanceValue();
                            float clamp = Utilities.clamp((f10 / (AndroidUtilities.displaySize.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(clamp * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(mf0Var.E * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                    AndroidUtilities.vibrateCursor(mf0Var);
                                    mf0Var.E = clamp;
                                }
                            } else {
                                try {
                                    mf0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                mf0Var.E = clamp;
                            }
                            mf0Var.w.setEnhanceValue(clamp);
                            of0 of0Var3 = mf0Var.w;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((of0Var3 == null ? 0.0f : of0Var3.getEnhanceValue()) * 100.0f), mf0Var.b, mf0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            mf0Var.f = staticLayout;
                            mf0Var.h = staticLayout.getLineCount() > 0 ? mf0Var.f.getLineWidth(0) : 0.0f;
                            mf0Var.n = mf0Var.f.getLineCount() > 0 ? mf0Var.f.getLineLeft(0) : 0.0f;
                            mf0Var.invalidate();
                        }
                    }
                    mf0Var.C = x10;
                    mf0Var.D = y10;
                } else if (action == 1 || action == 3) {
                    mf0Var.y = false;
                    mf0Var.B = -1L;
                    of0 of0Var4 = mf0Var.w;
                    if (of0Var4 != null) {
                        mf0Var.E = of0Var4.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(dc0Var, 600L);
                }
            } else if (mf0Var.r) {
                mf0Var.r = false;
                mf0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t6 t6Var;
        t6 t6Var2;
        w61 w61Var = this.n;
        if (view == w61Var && (t6Var2 = this.d) != null && t6Var2.u) {
            return false;
        }
        if ((view != w61Var && view != this.r) || (t6Var = this.d) == null || t6Var.m0 == null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            t6 t6Var3 = this.d;
            int i10 = t6Var3.k0;
            int i11 = t6Var3.l0;
            int i12 = t6Var3.Q;
            MediaController.CropState cropState = t6Var3.m0;
            if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                i11 = i10;
                i10 = i11;
            }
            float f10 = cropState.cropPw;
            float f11 = cropState.cropPh;
            canvas.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (i10 * f10) / 2.0f, (i11 * f11) / 2.0f);
            canvas.rotate(this.d.Q);
            t6 t6Var4 = this.d;
            canvas.translate((-t6Var4.k0) / 2.0f, (-t6Var4.l0) / 2.0f);
        }
        canvas.concat(this.e0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        t6 t6Var = this.d;
        if (t6Var == null) {
            return 1;
        }
        return t6Var.l0;
    }

    public int getContentWidth() {
        t6 t6Var = this.d;
        if (t6Var == null) {
            return 1;
        }
        return t6Var.k0;
    }

    public long getCurrentPosition() {
        i71 i71Var = this.e;
        if (i71Var != null) {
            return i71Var.n();
        }
        i71 i71Var2 = this.x;
        if (i71Var2 != null) {
            return i71Var2.n();
        }
        i71 i71Var3 = this.y;
        if (i71Var3 != null) {
            return i71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        t6 t6Var = this.d;
        if (t6Var != null) {
            double d = t6Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        i71 i71Var = this.e;
        if (i71Var == null || i71Var.p() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.p();
    }

    public int getOrientation() {
        t6 t6Var = this.d;
        if (t6Var == null) {
            return 0;
        }
        return t6Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public w61 getTextureView() {
        return this.n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        w61 w61Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (w61Var = this.n) != null) {
                    bitmapArr[i10] = w61Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i10] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i10] = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i10]);
                    canvas.save();
                    float max = Math.max(dp / viewArr[i10].getWidth(), dp2 / viewArr[i10].getHeight());
                    canvas.scale(max, max);
                    viewArr[i10].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.globalQueue.postRunnable(new tg(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        t6 t6Var;
        return (this.B == null || (t6Var = this.d) == null || !t6Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.w0.contains(-9982);
    }

    public final void l(t6 t6Var) {
        this.d = t6Var;
        if (t6Var == null) {
            setupImage(null);
            u(null);
            this.Q.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (t6Var.K) {
            setupImage(t6Var);
            if (t6Var.A0 == 0 && t6Var.B0 == 0) {
                t6Var.z(new i5((s9) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(t6Var);
            r();
        }
        b();
        u(t6Var);
        q(t6Var, false);
        s(t6Var, null, false);
    }

    public final void m(long j10) {
        i71 i71Var = this.e;
        if (i71Var != null) {
            i71Var.L(j10, false);
        } else if (j()) {
            this.B.m(j10, false);
        } else {
            i71 i71Var2 = this.x;
            if (i71Var2 != null) {
                i71Var2.L(j10, false);
            } else {
                i71 i71Var3 = this.y;
                if (i71Var3 != null) {
                    i71Var3.L(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(t6 t6Var, m8 m8Var, long j10) {
        this.d = t6Var;
        if (t6Var == null) {
            t(null, m8Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.Q.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (t6Var.v()) {
            setupImage(null);
            t(null, m8Var, j10);
            setupCollage(t6Var);
        } else if (t6Var.K) {
            setupImage(t6Var);
            setupCollage(null);
            t(t6Var, m8Var, j10);
            if (t6Var.A0 == 0 && t6Var.B0 == 0) {
                t6Var.z(new i5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, m8Var, 0L);
            setupImage(t6Var);
            r();
        }
        b();
        u(t6Var);
        q(t6Var, false);
        s(t6Var, null, false);
    }

    public final void o(TextureView textureView, of0 of0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = of0Var;
        this.r = textureView;
        if (of0Var != null) {
            int i10 = this.R;
            int i11 = this.S;
            vz vzVar = of0Var.i0;
            if (vzVar != null) {
                vzVar.i(i10, i11);
            } else {
                of0Var.G0 = i10;
                of0Var.H0 = i11;
            }
        }
        TextureView textureView3 = this.r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.h0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        return true;
    }

    public final void p(MessageObject messageObject) {
        long duration;
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.j = true;
            if (messageObject == null || messageObject.messageOwner == null) {
                t6Var.y = null;
                t6Var.z = null;
                t6Var.A = null;
                t6Var.B = null;
                t6Var.D = 0L;
                t6Var.C = 0L;
                t6Var.E = 0.0f;
                t6Var.F = 1.0f;
            } else {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.id != 0) {
                    this.d.z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.z;
                    inputDocument.id = document.id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach == null || !pathToAttach.exists()) {
                            t6 t6Var2 = this.d;
                            t6Var2.y = null;
                            t6Var2.z = null;
                            t6Var2.A = null;
                            t6Var2.B = null;
                            t6Var2.D = 0L;
                            t6Var2.C = 0L;
                            t6Var2.E = 0.0f;
                            t6Var2.F = 1.0f;
                            return;
                        }
                        this.d.y = pathToAttach.getAbsolutePath();
                    }
                    this.d.y = pathToAttach.getAbsolutePath();
                } else {
                    this.d.y = messageObject.messageOwner.attachPath;
                }
                t6 t6Var3 = this.d;
                t6Var3.A = null;
                t6Var3.B = null;
                if (document != null) {
                    ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i11);
                        i11++;
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
                t6 t6Var4 = this.d;
                t6Var4.D = 0L;
                if (t6Var4.K) {
                    t6Var4.D = (long) (t6Var4.Z * getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.B.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        t6 t6Var5 = ((x) obj).n;
                        if (t6Var5 != null && t6Var5.K) {
                            duration = this.B.getDuration();
                            break;
                        }
                    }
                }
                t6 t6Var6 = this.d;
                duration = t6Var6.K ? getDuration() : t6Var6.C;
                oa oaVar = this.C;
                int maxCount = oaVar == null ? 1 : oaVar.getMaxCount();
                t6 t6Var7 = this.d;
                t6Var7.F = t6Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
            }
        }
        q(this.d, true);
    }

    public final void q(t6 t6Var, boolean z4) {
        boolean z10;
        i71 i71Var = this.y;
        if (i71Var != null) {
            i71Var.B();
            this.y.H();
            this.y = null;
        }
        if (t6Var == null) {
            return;
        }
        oa oaVar = this.C;
        boolean z11 = false;
        if (oaVar != null) {
            String str = t6Var.y;
            String str2 = t6Var.A;
            String str3 = t6Var.B;
            long j10 = t6Var.C;
            long j11 = t6Var.D;
            float f10 = t6Var.E;
            float f11 = t6Var.F;
            float f12 = t6Var.G;
            if (!TextUtils.equals(oaVar.L, str)) {
                ha haVar = oaVar.U;
                if (haVar != null) {
                    haVar.a();
                    oaVar.U = null;
                    oaVar.R = false;
                }
                oaVar.L = str;
                oaVar.p();
            }
            oaVar.L = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            oaVar.K = !isEmpty;
            if (isEmpty) {
                oaVar.M = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (oaVar.K) {
                oaVar.O = j10;
                oaVar.N = j11 - ((long) (j10 * f10));
                oaVar.P = f10;
                oaVar.Q = f11;
                oaVar.S = f12;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, oaVar.I0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    oaVar.J0 = staticLayout;
                    oaVar.K0 = staticLayout.getLineCount() > 0 ? oaVar.J0.getLineWidth(0) : 0.0f;
                    oaVar.L0 = oaVar.J0.getLineCount() > 0 ? oaVar.J0.getLineLeft(0) : 0.0f;
                } else {
                    oaVar.K0 = 0.0f;
                    oaVar.J0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, oaVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    oaVar.N0 = staticLayout2;
                    oaVar.O0 = staticLayout2.getLineCount() > 0 ? oaVar.N0.getLineWidth(0) : 0.0f;
                    oaVar.P0 = oaVar.N0.getLineCount() > 0 ? oaVar.N0.getLineLeft(0) : 0.0f;
                } else {
                    oaVar.O0 = 0.0f;
                    oaVar.N0 = null;
                }
            }
            if (z4) {
                z10 = true;
            } else {
                z10 = true;
                oaVar.b0.f(oaVar.K, true);
            }
            oaVar.invalidate();
        } else {
            z10 = true;
        }
        if (t6Var.y != null) {
            i71 i71Var2 = new i71();
            this.y = i71Var2;
            i71Var2.y = z10;
            i71Var2.G = new zz(this, 7);
            i71Var2.D(Uri.fromFile(new File(t6Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (t6Var.Z * getDuration());
                this.e.L(duration, false);
                this.C.setProgress(duration);
            }
            w(true);
        }
        da daVar = ((s9) this).z0;
        h9 h9Var = daVar.s1;
        if (h9Var != null) {
            t6 t6Var2 = daVar.H1;
            if (t6Var2 != null && t6Var2.y != null) {
                z11 = true;
            }
            h9Var.setHasAudio(z11);
        }
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        t6 t6Var = this.d;
        int i10 = t6Var.A0;
        int i11 = 2;
        Paint paint = this.Q;
        if (i10 == 0 || t6Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new org.telegram.ui.Cells.pa(this, measuredHeight, i11).run(g0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f10 = measuredHeight;
            t6 t6Var2 = this.d;
            int i12 = t6Var2.A0;
            this.R = i12;
            int i13 = t6Var2.B0;
            this.S = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            w61 w61Var = this.n;
            if (w61Var != null) {
                int i14 = this.R;
                int i15 = this.S;
                vz vzVar = w61Var.b;
                if (vzVar == null) {
                    w61Var.n = i14;
                    w61Var.r = i15;
                } else {
                    vzVar.i(i14, i15);
                }
            }
            of0 of0Var = this.s;
            if (of0Var != null) {
                int i16 = this.R;
                int i17 = this.S;
                vz vzVar2 = of0Var.i0;
                if (vzVar2 != null) {
                    vzVar2.i(i16, i17);
                } else {
                    of0Var.G0 = i16;
                    of0Var.H0 = i17;
                }
            }
        }
        invalidate();
    }

    public final void s(t6 t6Var, dg.b3 b3Var, boolean z4) {
        i71 i71Var;
        if (t6Var == null || t6Var.o0 == null) {
            i71 i71Var2 = this.x;
            if (i71Var2 != null) {
                i71Var2.B();
                this.x.H();
                this.x = null;
            }
            oa oaVar = this.C;
            if (oaVar != null) {
                oaVar.setRoundNull(z4);
            }
            this.w = null;
            AndroidUtilities.cancelRunOnUIThread(this.H);
            return;
        }
        i71 i71Var3 = this.x;
        if (i71Var3 != null) {
            i71Var3.H();
            this.x = null;
        }
        i71 i71Var4 = new i71();
        this.x = i71Var4;
        i71Var4.y = true;
        i71Var4.G = new tp0(this, 6);
        this.x.D(Uri.fromFile(t6Var.o0), "other");
        c();
        this.w = b3Var;
        if (b3Var != null && (i71Var = this.x) != null) {
            i71Var.V(b3Var.r0);
        }
        this.C.n(t6Var.o0.getAbsolutePath(), t6Var.q0, t6Var.r0, t6Var.s0, t6Var.t0, t6Var.u0, z4);
        y(true);
    }

    public void set(t6 t6Var) {
        n(t6Var, null, 0L);
    }

    public void setAllowCropping(boolean z4) {
        this.h0 = z4;
    }

    public void setCollageView(y yVar) {
        this.B = yVar;
    }

    public void setCropEditorDrawing(c0 c0Var) {
        if (this.x0 != c0Var) {
            this.x0 = c0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z4) {
        this.b0 = z4;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.v0 = runnable;
    }

    public void setVideoTimelineView(oa oaVar) {
        this.C = oaVar;
        if (oaVar != null) {
            oaVar.setDelegate(new o2.i(this, 11));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(t6 t6Var, Runnable runnable, long j10) {
        ArrayList arrayList;
        org.telegram.ui.Components.ha haVar;
        if (t6Var == null || t6Var.v()) {
            i71 i71Var = this.e;
            if (i71Var != null) {
                i71Var.B();
                this.e.H();
                this.e = null;
            }
            j5 j5Var = this.E;
            if (j5Var == null || !j5Var.g) {
                w61 w61Var = this.n;
                if (w61Var != null) {
                    w61Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new i5(this, 6)).start();
                }
            } else {
                j5Var.a(null);
            }
            oa oaVar = this.C;
            if (oaVar != null) {
                oaVar.o(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.H);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        i71 i71Var2 = this.e;
        if (i71Var2 != null) {
            i71Var2.H();
            this.e = null;
        }
        int i10 = 0;
        i71 i71Var3 = new i71();
        this.e = i71Var3;
        i71Var3.y = true;
        i71Var3.G = new l7.w0(this, t6Var, new Runnable[]{runnable}, 24);
        w61 w61Var2 = this.n;
        if (w61Var2 != null) {
            w61Var2.clearAnimation();
            w61 w61Var3 = this.n;
            vz vzVar = w61Var3.b;
            if (vzVar != null) {
                vzVar.postRunnable(new sz(vzVar, i10));
            }
            w61Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new w61(getContext(), this.e);
        this.D.e();
        w61 w61Var4 = this.n;
        org.telegram.ui.Components.ba baVar = t6Var.u ? null : this.D;
        w61Var4.s = baVar;
        vz vzVar2 = w61Var4.b;
        if (vzVar2 != null && (haVar = vzVar2.F) != null) {
            org.telegram.ui.Components.ba baVar2 = haVar.t;
            if (baVar2 != null && baVar2.m != null) {
                baVar2.m = null;
            }
            haVar.t = baVar;
            if (baVar != null && baVar.m != haVar) {
                baVar.m = haVar;
                baVar.d();
            }
        }
        this.n.setOpaque(false);
        b();
        j5 j5Var2 = this.E;
        if (j5Var2 == null || !j5Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, k7.b6.e(-2, -2, 51));
        } else {
            j5Var2.a(this.n);
        }
        org.telegram.ui.web.a1 a1Var = new org.telegram.ui.web.a1(this, 9);
        s6 s6Var = t6Var.d1;
        if (s6Var != null) {
            a1Var.run(s6Var);
        } else if (!t6Var.K || Build.VERSION.SDK_INT < 24) {
            s6 s6Var2 = new s6();
            t6Var.d1 = s6Var2;
            a1Var.run(s6Var2);
        } else {
            Utilities.globalQueue.postRunnable(new o6(t6Var, a1Var, i10));
        }
        File file = t6Var.Z0;
        if (file == null) {
            file = t6Var.L;
        }
        this.e.D(Uri.fromFile(file), "other");
        this.e.P(this.w0.isEmpty());
        this.e.N(true);
        if (t6Var.h) {
            j10 = (long) ((t6Var.Z * t6Var.h0) + j10);
        }
        if (j10 > 0) {
            this.e.L(j10, false);
        }
        c();
        w(true);
        boolean z4 = t6Var.u && (arrayList = t6Var.v) != null && arrayList.size() == 1 && ((MessageObject) t6Var.v.get(0)).type == 5;
        oa oaVar2 = this.C;
        File file2 = t6Var.Z0;
        if (file2 == null) {
            file2 = t6Var.L;
        }
        oaVar2.o(z4, file2.getAbsolutePath(), getDuration(), t6Var.P);
        this.C.setVideoLeft(t6Var.Z);
        this.C.setVideoRight(t6Var.a0);
        oa oaVar3 = this.C;
        if (oaVar3 == null || j10 <= 0) {
            return;
        }
        oaVar3.setProgress(j10);
    }

    public final void u(t6 t6Var) {
        Drawable drawable = this.P;
        this.O = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (t6Var == null) {
            this.P = null;
            return;
        }
        long j10 = t6Var.z0;
        if (j10 == Long.MIN_VALUE) {
            this.P = null;
            return;
        }
        Drawable e = e(this.P, t6Var.a, j10, t6Var.y0);
        t6Var.x0 = e;
        this.P = e;
        if (this.O != e) {
            this.O = null;
        }
        if (e != null) {
            e.setCallback(this);
        }
        org.telegram.ui.Components.ba baVar = this.D;
        if (baVar != null) {
            Drawable drawable2 = this.P;
            if (drawable2 == null) {
                baVar.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                baVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.P.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 1080;
                    intrinsicHeight = 1920;
                }
                float f10 = intrinsicWidth;
                float f11 = intrinsicHeight;
                float max = Math.max(100.0f / f10, 100.0f / f11);
                if (max > 1.0f) {
                    intrinsicWidth = (int) (f10 * max);
                    intrinsicHeight = (int) (f11 * max);
                }
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                this.P.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.P.draw(new Canvas(createBitmap));
                baVar.f(createBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double d;
        float f10;
        PointF pointF;
        if (this.h0) {
            boolean z4 = motionEvent.getPointerCount() > 1;
            PointF pointF2 = this.j0;
            if (z4) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = k7.n6.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z10 = this.m0;
            PointF pointF3 = this.i0;
            if (z10 != z4) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.k0 = f10;
                this.l0 = d;
                this.m0 = z4;
            }
            if (this.d != null) {
                float width = r2.i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.p0;
                if (actionMasked == 0) {
                    this.r0 = 0.0f;
                    this.s0 = false;
                    invalidate();
                    this.t0 = true;
                    matrix.set(this.d.n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.t0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.k0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.l0);
                        float f17 = this.r0 + degrees;
                        this.r0 = f17;
                        if (!this.o0) {
                            boolean z11 = Math.abs(f17) > 20.0f;
                            this.o0 = z11;
                            if (!z11) {
                                d(matrix);
                                this.o0 = (((float) Math.round(this.a0 / 90.0f)) * 90.0f) - this.a0 > 20.0f;
                            }
                            if (!this.s0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.s0 = true;
                            }
                        }
                        if (this.o0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.n0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.n0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.q0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.T;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.a0 / 90.0f) * 90.0f) - this.a0;
                    if (this.o0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.V, this.W);
                            if (!this.s0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.s0 = true;
                            }
                        } else {
                            this.s0 = false;
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
                        this.n0 = false;
                        da daVar = ((s9) this).z0;
                        daVar.l1.a(true, false, daVar.f0);
                        daVar.l1.b(daVar.Z0.getText());
                    }
                    this.t0 = false;
                    this.o0 = false;
                    this.r0 = 0.0f;
                    this.s0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.k0 = f10;
                this.l0 = d;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.P == drawable || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r2 <= (r11 + r9)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z4) {
        long n10;
        boolean y10;
        if (this.y == null || this.d == null) {
            return;
        }
        boolean z10 = true;
        if (this.e == null && this.x == null && !j()) {
            this.y.P(this.w0.isEmpty());
            this.y.N(true);
            long n11 = this.y.n();
            if (!z4 || this.y.p() == -9223372036854775807L) {
                return;
            }
            float p10 = n11 / this.y.p();
            t6 t6Var = this.d;
            if ((p10 < t6Var.E || p10 > t6Var.F) && System.currentTimeMillis() - this.G > 500) {
                this.G = System.currentTimeMillis();
                this.y.K(-this.d.D);
                return;
            }
            return;
        }
        if (j()) {
            n10 = this.B.getPositionWithOffset();
            y10 = this.B.n0;
        } else {
            i71 i71Var = this.e;
            if (i71Var == null) {
                i71Var = this.x;
            }
            n10 = i71Var.n();
            y10 = i71Var.y();
        }
        t6 t6Var2 = this.d;
        float f10 = t6Var2.F;
        float f11 = t6Var2.E;
        long j10 = t6Var2.C;
        long j11 = (long) ((f10 - f11) * j10);
        if (y10) {
            long j12 = t6Var2.D;
            if (n10 >= j12) {
            }
        }
        z10 = false;
        long j13 = n10 - (t6Var2.D - ((long) (f11 * j10)));
        if (this.y.y() != z10) {
            this.y.P(z10);
            this.y.K(j13);
        } else if (z4) {
            if (Math.abs(this.y.n() - j13) > (j() ? 300 : 120)) {
                this.y.K(j13);
            }
        }
    }

    public final void x(int i10, boolean z4) {
        HashSet hashSet = this.w0;
        if (z4) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        i71 i71Var = this.e;
        if (i71Var != null) {
            i71Var.P(hashSet.isEmpty());
        }
        y yVar = this.B;
        if (yVar != null) {
            yVar.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z4) {
        long n10;
        boolean y10;
        if (this.x == null || this.d == null) {
            return;
        }
        if (this.e == null && !j()) {
            this.x.P(this.w0.isEmpty());
            this.x.N(true);
            dg.b3 b3Var = this.w;
            if (b3Var != null && !b3Var.y0) {
                b3Var.y0 = true;
                b3Var.z0.f(true, true);
                b3Var.invalidate();
            }
            long n11 = this.x.n();
            if (!z4 || this.x.p() == -9223372036854775807L) {
                return;
            }
            float p10 = n11 / this.x.p();
            t6 t6Var = this.d;
            if ((p10 < t6Var.s0 || p10 > t6Var.t0) && System.currentTimeMillis() - this.G > 500) {
                this.G = System.currentTimeMillis();
                this.x.L(-this.d.r0, false);
                return;
            }
            return;
        }
        if (j()) {
            n10 = this.B.getPositionWithOffset();
            y10 = this.B.n0;
        } else {
            n10 = this.e.n();
            y10 = this.e.y();
        }
        t6 t6Var2 = this.d;
        float f10 = t6Var2.t0;
        float f11 = t6Var2.s0;
        float f12 = t6Var2.q0;
        long j10 = (long) ((f10 - f11) * f12);
        long j11 = t6Var2.r0;
        boolean z10 = n10 >= j11 && n10 <= j10 + j11;
        boolean z11 = y10 && z10;
        long j12 = (n10 - j11) + ((long) (f11 * f12));
        dg.b3 b3Var2 = this.w;
        if (b3Var2 != null && b3Var2.y0 != z10) {
            b3Var2.y0 = z10;
            b3Var2.invalidate();
        }
        if (this.x.y() != z11) {
            this.x.P(z11);
            this.x.L(j12, false);
        } else if (z4) {
            if (Math.abs(this.x.n() - j12) > (j() ? 300 : 120)) {
                this.x.L(j12, false);
            }
        }
    }
}
