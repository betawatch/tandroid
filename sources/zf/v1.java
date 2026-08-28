package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class v1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public b6 O;
    public long Q;
    public long R;
    public boolean g;
    public boolean h;
    public Utilities.CallbackReturn l;
    public boolean m;
    public final int p;
    public boolean q;
    public int z;
    public final RectF a = new RectF();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f = new boolean[3];
    public final Paint i = new Paint();
    public float j = 0.0f;
    public float k = 0.0f;
    public final ArrayList n = new ArrayList();
    public float o = 1.0f;
    public int r = 14;
    public int s = 12;
    public int t = 10;
    public float u = 0.85f;
    public float v = 0.85f;
    public float w = 0.9f;
    public long x = 2000;
    public int y = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = f6.Uj;
    public int S = 0;

    public v1(int i9) {
        this.p = i9;
        this.B = i9 < 50;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x031e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i9;
        int dp;
        int i10 = 6;
        int i11 = 3;
        if (this.N == 43) {
            if (this.d.length != 6) {
                this.d = new Bitmap[6];
            }
            if (this.e.length != 6) {
                this.e = new boolean[6];
            }
            if (this.f.length != 6) {
                this.f = new boolean[6];
            }
            i9 = 6;
        } else {
            i9 = 3;
        }
        int i12 = 0;
        while (i12 < i9) {
            float f10 = this.u;
            if (i12 == 0) {
                dp = AndroidUtilities.dp(this.r);
            } else if (i12 == 1) {
                f10 = this.v;
                dp = AndroidUtilities.dp(this.s);
            } else {
                f10 = this.w;
                dp = AndroidUtilities.dp(this.t);
            }
            int i13 = this.N;
            if (i13 == 9) {
                this.d[i12] = SvgHelper.getBitmap(i12 == 0 ? R.raw.premium_object_folder : i12 == 1 ? R.raw.premium_object_bubble : R.raw.premium_object_settings, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == 27) {
                this.d[i12] = SvgHelper.getBitmap(i12 == 0 ? R.raw.filled_messages_paid : i12 == 1 ? R.raw.filled_crown_on : R.raw.premium_object_star2, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == 11 || i13 == 4) {
                this.d[i12] = SvgHelper.getBitmap(i12 == 0 ? R.raw.premium_object_smile1 : i12 == 1 ? R.raw.premium_object_smile2 : R.raw.premium_object_like, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == 22) {
                this.d[i12] = SvgHelper.getBitmap(i12 == 0 ? R.raw.premium_object_user : i12 == 1 ? R.raw.cache_photos : R.raw.cache_profile_photos, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == i11) {
                this.d[i12] = SvgHelper.getBitmap(i12 == 0 ? R.raw.premium_object_adsbubble : i12 == 1 ? R.raw.premium_object_like : R.raw.premium_object_noads, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == 7) {
                this.d[i12] = SvgHelper.getBitmap(i12 == 0 ? R.raw.premium_object_video2 : i12 == 1 ? R.raw.premium_object_video : R.raw.premium_object_user, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == 43) {
                this.d[i12] = SvgHelper.getBitmap(i12 == 0 ? R.raw.premium_object_list : i12 == 1 ? R.raw.premium_object_math : i12 == 2 ? R.raw.premium_object_table : i12 == i11 ? R.raw.premium_object_superscript : i12 == 4 ? R.raw.premium_object_bold : R.raw.premium_object_code, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == 1001) {
                this.d[i12] = SvgHelper.getBitmap(R.raw.premium_object_fire, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == 1002) {
                this.d[i12] = SvgHelper.getBitmap(R.raw.premium_object_star2, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == 24) {
                this.d[i12] = SvgHelper.getBitmap(i12 == 0 ? R.raw.premium_object_tag : i12 == 1 ? R.raw.premium_object_check : R.raw.premium_object_star, dp, dp, i0.a.k(f6.v0(this.P, this.O), 30));
                this.e[i12] = true;
            } else if (i13 == 28) {
                if (i12 == 0) {
                    this.d[i12] = SvgHelper.getBitmap(R.raw.filled_premium_dollar, dp, dp, i0.a.k(f6.v0(this.P, this.O), 255));
                    this.f[i12] = true;
                }
                Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                this.d[i12] = createBitmap;
                Canvas canvas = new Canvas(createBitmap);
                if (this.N == i10 || !(i12 == 1 || i12 == 2)) {
                    Path path = new Path();
                    float f11 = dp >> 1;
                    int i14 = (int) (f10 * f11);
                    path.moveTo(0.0f, f11);
                    float f12 = i14;
                    path.lineTo(f12, f12);
                    path.lineTo(f11, 0.0f);
                    float f13 = dp - i14;
                    path.lineTo(f13, f12);
                    float f14 = dp;
                    path.lineTo(f14, f11);
                    path.lineTo(f13, f13);
                    path.lineTo(f11, f14);
                    path.lineTo(f12, f13);
                    path.lineTo(0.0f, f11);
                    path.close();
                    Paint paint = new Paint();
                    if (this.q) {
                        paint.setColor(b());
                        if (this.M) {
                            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.r / 5.0f)));
                        }
                        canvas.drawPath(path, paint);
                    } else {
                        if (dp >= AndroidUtilities.dp(10.0f)) {
                            a1.d().f(dp * (-2), 0.0f, dp, dp);
                        } else {
                            a1.d().f(dp * (-4), 0.0f, dp, dp);
                        }
                        Paint e10 = a1.d().e();
                        if (this.M) {
                            e10.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.r / 5.0f)));
                        }
                        if (this.L) {
                            e10.setAlpha(255);
                        } else if (this.K) {
                            e10.setAlpha(60);
                        } else {
                            e10.setAlpha(120);
                        }
                        canvas.drawPath(path, e10);
                        e10.setPathEffect(null);
                        e10.setAlpha(255);
                    }
                    if (!this.K) {
                        Utilities.stackBlurBitmap(createBitmap, 2);
                    }
                } else {
                    Drawable drawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar);
                    drawable.setColorFilter(new PorterDuffColorFilter(f6.v0(this.P, this.O), PorterDuff.Mode.MULTIPLY));
                    drawable.setBounds(0, 0, dp, dp);
                    drawable.draw(canvas);
                }
            } else {
                if (i13 == 105 && i12 == 0) {
                    this.d[i12] = SvgHelper.getBitmap(R.raw.premium_object_star2, dp, dp, b());
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                this.d[i12] = createBitmap2;
                Canvas canvas2 = new Canvas(createBitmap2);
                if (this.N == i10) {
                }
                Path path2 = new Path();
                float f112 = dp >> 1;
                int i142 = (int) (f10 * f112);
                path2.moveTo(0.0f, f112);
                float f122 = i142;
                path2.lineTo(f122, f122);
                path2.lineTo(f112, 0.0f);
                float f132 = dp - i142;
                path2.lineTo(f132, f122);
                float f142 = dp;
                path2.lineTo(f142, f112);
                path2.lineTo(f132, f132);
                path2.lineTo(f112, f142);
                path2.lineTo(f122, f132);
                path2.lineTo(0.0f, f112);
                path2.close();
                Paint paint2 = new Paint();
                if (this.q) {
                }
                if (!this.K) {
                }
            }
            i12++;
            i10 = 6;
            i11 = 3;
        }
    }

    public int b() {
        return this.N == 100 ? i0.a.k(f6.v0(this.P, this.O), 200) : f6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i9 = this.p;
        if (z10) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length][];
            this.E = new int[length];
            this.F = new float[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.C[i10] = new Matrix();
                this.D[i10] = new float[i9 * 2];
            }
        }
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < i9; i11++) {
                arrayList.add(new u1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x001a, code lost:
    
        if (r5 > 50) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.R;
        long j11 = j10 >= 4 ? 50L : 4L;
        j10 = j11;
        boolean z10 = this.G;
        ArrayList arrayList = this.n;
        if (z10) {
            RectF rectF = this.a;
            float centerX = rectF.centerX() + 0.0f;
            float centerY = rectF.centerY() + this.k;
            int i9 = 0;
            while (true) {
                Matrix[] matrixArr = this.C;
                if (i9 >= matrixArr.length) {
                    break;
                }
                float[] fArr = this.F;
                float f11 = ((j10 / ((i9 * 10000.0f) + 40000.0f)) * 360.0f) + fArr[i9];
                fArr[i9] = f11;
                matrixArr[i9].setRotate(f11, centerX, centerY);
                this.E[i9] = 0;
                i9++;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                u1 u1Var = (u1) arrayList.get(i10);
                v1 v1Var = u1Var.r;
                int[] iArr = v1Var.E;
                int i11 = u1Var.l;
                int i12 = iArr[i11];
                float[] fArr2 = v1Var.D[i11];
                int i13 = i12 * 2;
                fArr2[i13] = u1Var.d;
                fArr2[i13 + 1] = u1Var.e;
                iArr[i11] = i12 + 1;
            }
            int i14 = 0;
            while (true) {
                Matrix[] matrixArr2 = this.C;
                if (i14 >= matrixArr2.length) {
                    break;
                }
                Matrix matrix = matrixArr2[i14];
                float[] fArr3 = this.D[i14];
                matrix.mapPoints(fArr3, 0, fArr3, 0, this.E[i14]);
                this.E[i14] = 0;
                i14++;
            }
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            u1 u1Var2 = (u1) arrayList.get(i15);
            if (this.g) {
                u1Var2.a(canvas, this.Q, f10);
            } else {
                u1Var2.a(canvas, currentTimeMillis, f10);
            }
            if (this.I && currentTimeMillis > u1Var2.a) {
                u1Var2.b(currentTimeMillis);
            }
            if (this.H) {
                if (!this.b.contains(u1Var2.h, u1Var2.i)) {
                    u1Var2.b(currentTimeMillis);
                }
            }
        }
        this.R = currentTimeMillis;
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((u1) arrayList.get(i9)).b(currentTimeMillis);
            i9++;
        }
    }

    public final void g() {
        int v02 = f6.v0(this.P, this.O);
        if (this.z != v02) {
            this.z = v02;
            a();
        }
    }
}
