package ug;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.qs;
import org.telegram.messenger.sz;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class p1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean N;
    public f6 P;
    public long R;
    public long S;
    public boolean g;
    public boolean h;
    public d20 l;
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
    public int y = 1000;
    public final float A = 1000.0f / org.telegram.messenger.g0.r;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = k6.Ik;
    public int T = 0;

    public p1(int i7) {
        this.p = i7;
        this.B = i7 < 50;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i7;
        int L;
        int i10 = 6;
        int i11 = 3;
        if (this.O == 43) {
            if (this.d.length != 6) {
                this.d = new Bitmap[6];
            }
            if (this.e.length != 6) {
                this.e = new boolean[6];
            }
            if (this.f.length != 6) {
                this.f = new boolean[6];
            }
            i7 = 6;
        } else {
            i7 = 3;
        }
        int i12 = 0;
        while (i12 < i7) {
            float f10 = this.u;
            if (i12 == 0) {
                L = org.telegram.messenger.g0.L(this.r);
            } else if (i12 == 1) {
                f10 = this.v;
                L = org.telegram.messenger.g0.L(this.s);
            } else {
                f10 = this.w;
                L = org.telegram.messenger.g0.L(this.t);
            }
            int i13 = this.O;
            if (i13 == 9) {
                this.d[i12] = sz.d(i12 == 0 ? R.raw.premium_object_folder : i12 == 1 ? R.raw.premium_object_bubble : R.raw.premium_object_settings, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                this.e[i12] = true;
            } else {
                int i14 = R.raw.premium_object_star2;
                if (i13 == 27) {
                    if (i12 == 0) {
                        i14 = R.raw.filled_messages_paid;
                    } else if (i12 == 1) {
                        i14 = R.raw.filled_crown_on;
                    }
                    this.d[i12] = sz.d(i14, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                    this.e[i12] = true;
                } else {
                    int i15 = R.raw.premium_object_like;
                    if (i13 == 11 || i13 == 4) {
                        if (i12 == 0) {
                            i15 = R.raw.premium_object_smile1;
                        } else if (i12 == 1) {
                            i15 = R.raw.premium_object_smile2;
                        }
                        this.d[i12] = sz.d(i15, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                        this.e[i12] = true;
                    } else {
                        int i16 = R.raw.premium_object_user;
                        if (i13 == 22) {
                            if (i12 != 0) {
                                i16 = i12 == 1 ? R.raw.cache_photos : R.raw.cache_profile_photos;
                            }
                            this.d[i12] = sz.d(i16, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                            this.e[i12] = true;
                        } else if (i13 == i11) {
                            if (i12 == 0) {
                                i15 = R.raw.premium_object_adsbubble;
                            } else if (i12 != 1) {
                                i15 = R.raw.premium_object_noads;
                            }
                            this.d[i12] = sz.d(i15, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                            this.e[i12] = true;
                        } else if (i13 == 7) {
                            if (i12 == 0) {
                                i16 = R.raw.premium_object_video2;
                            } else if (i12 == 1) {
                                i16 = R.raw.premium_object_video;
                            }
                            this.d[i12] = sz.d(i16, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                            this.e[i12] = true;
                        } else if (i13 == 43) {
                            this.d[i12] = sz.d(i12 == 0 ? R.raw.premium_object_list : i12 == 1 ? R.raw.premium_object_math : i12 == 2 ? R.raw.premium_object_table : i12 == i11 ? R.raw.premium_object_superscript : i12 == 4 ? R.raw.premium_object_bold : R.raw.premium_object_code, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                            this.e[i12] = true;
                        } else if (i13 == 1001) {
                            this.d[i12] = sz.d(R.raw.premium_object_fire, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                            this.e[i12] = true;
                        } else if (i13 == 1002) {
                            this.d[i12] = sz.d(R.raw.premium_object_star2, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                            this.e[i12] = true;
                        } else if (i13 == 24) {
                            this.d[i12] = sz.d(i12 == 0 ? R.raw.premium_object_tag : i12 == 1 ? R.raw.premium_object_check : R.raw.premium_object_star, L, L, i0.a.o(k6.w0(this.Q, this.P), 30));
                            this.e[i12] = true;
                        } else if (i13 == 28) {
                            if (i12 == 0) {
                                this.d[i12] = sz.d(R.raw.filled_premium_dollar, L, L, i0.a.o(k6.w0(this.Q, this.P), qs.e4));
                                this.f[i12] = true;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                            this.d[i12] = createBitmap;
                            Canvas canvas = new Canvas(createBitmap);
                            if (this.O == i10 || !(i12 == 1 || i12 == 2)) {
                                Path path = new Path();
                                float f11 = L >> 1;
                                int i17 = (int) (f10 * f11);
                                path.moveTo(0.0f, f11);
                                float f12 = i17;
                                path.lineTo(f12, f12);
                                path.lineTo(f11, 0.0f);
                                float f13 = L - i17;
                                path.lineTo(f13, f12);
                                float f14 = L;
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
                                        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(this.r / 5.0f)));
                                    }
                                    canvas.drawPath(path, paint);
                                } else {
                                    if (L >= org.telegram.messenger.g0.L(10.0f)) {
                                        ia.e.d().f(L * (-2), 0.0f, L, L);
                                    } else {
                                        ia.e.d().f(L * (-4), 0.0f, L, L);
                                    }
                                    Paint e10 = ia.e.d().e();
                                    if (this.M) {
                                        e10.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(this.r / 5.0f)));
                                    }
                                    if (this.L) {
                                        e10.setAlpha(qs.e4);
                                    } else if (this.K) {
                                        e10.setAlpha(60);
                                    } else {
                                        e10.setAlpha(120);
                                    }
                                    canvas.drawPath(path, e10);
                                    e10.setPathEffect(null);
                                    e10.setAlpha(qs.e4);
                                }
                                if (!this.K) {
                                    Utilities.stackBlurBitmap(createBitmap, 2);
                                }
                            } else {
                                Drawable drawable = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_premium_liststar);
                                drawable.setColorFilter(new PorterDuffColorFilter(k6.w0(this.Q, this.P), PorterDuff.Mode.MULTIPLY));
                                drawable.setBounds(0, 0, L, L);
                                drawable.draw(canvas);
                            }
                        } else {
                            if (i13 == 105 && i12 == 0) {
                                this.d[i12] = sz.d(R.raw.premium_object_star2, L, L, b());
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                            this.d[i12] = createBitmap2;
                            Canvas canvas2 = new Canvas(createBitmap2);
                            if (this.O == i10) {
                            }
                            Path path2 = new Path();
                            float f112 = L >> 1;
                            int i172 = (int) (f10 * f112);
                            path2.moveTo(0.0f, f112);
                            float f122 = i172;
                            path2.lineTo(f122, f122);
                            path2.lineTo(f112, 0.0f);
                            float f132 = L - i172;
                            path2.lineTo(f132, f122);
                            float f142 = L;
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
                    }
                }
            }
            i12++;
            i10 = 6;
            i11 = 3;
        }
    }

    public int b() {
        return this.O == 100 ? i0.a.o(k6.w0(this.Q, this.P), qs.e3) : k6.w0(this.Q, this.P);
    }

    public final void c() {
        a();
        boolean z9 = this.G;
        int i7 = this.p;
        if (z9) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length][];
            this.E = new int[length];
            this.F = new float[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.C[i10] = new Matrix();
                this.D[i10] = new float[i7 * 2];
            }
        }
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < i7; i11++) {
                arrayList.add(new o1(this));
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
        int i7;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.S;
        long j10 = j3 >= 4 ? 50L : 4L;
        j3 = j10;
        boolean z9 = this.G;
        ArrayList arrayList = this.n;
        if (z9) {
            RectF rectF = this.a;
            float centerX = rectF.centerX() + 0.0f;
            float centerY = rectF.centerY() + this.k;
            int i10 = 0;
            while (true) {
                Matrix[] matrixArr = this.C;
                if (i10 >= matrixArr.length) {
                    break;
                }
                float[] fArr = this.F;
                float f11 = ((j3 / ((i10 * 10000.0f) + 40000.0f)) * 360.0f) + fArr[i10];
                fArr[i10] = f11;
                matrixArr[i10].setRotate(f11, centerX, centerY);
                this.E[i10] = 0;
                i10++;
            }
            i7 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                o1 o1Var = (o1) arrayList.get(i11);
                p1 p1Var = o1Var.t;
                int[] iArr = p1Var.E;
                int i12 = o1Var.l;
                int i13 = iArr[i12];
                float[] fArr2 = p1Var.D[i12];
                int i14 = i13 * 2;
                fArr2[i14] = o1Var.d;
                fArr2[i14 + 1] = o1Var.e;
                iArr[i12] = i13 + 1;
            }
            int i15 = 0;
            while (true) {
                Matrix[] matrixArr2 = this.C;
                if (i15 >= matrixArr2.length) {
                    break;
                }
                Matrix matrix = matrixArr2[i15];
                float[] fArr3 = this.D[i15];
                matrix.mapPoints(fArr3, 0, fArr3, 0, this.E[i15]);
                this.E[i15] = 0;
                i15++;
            }
        } else {
            i7 = 0;
        }
        for (int i16 = i7; i16 < arrayList.size(); i16++) {
            o1 o1Var2 = (o1) arrayList.get(i16);
            if (this.g) {
                o1Var2.a(canvas, this.R, f10);
            } else {
                o1Var2.a(canvas, currentTimeMillis, f10);
            }
            if (this.I && currentTimeMillis > o1Var2.a) {
                o1Var2.b(currentTimeMillis);
            }
            if (this.H) {
                if (!this.b.contains(o1Var2.h, o1Var2.i)) {
                    o1Var2.b(currentTimeMillis);
                }
            }
        }
        this.S = currentTimeMillis;
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((o1) arrayList.get(i7)).b(currentTimeMillis);
            i7++;
        }
    }

    public final void g() {
        int w02 = k6.w0(this.Q, this.P);
        if (this.z != w02) {
            this.z = w02;
            a();
        }
    }
}
