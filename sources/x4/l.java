package x4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class l {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final i g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final a0.f o;

    public l() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new a0.f(0);
        this.g = new i();
        this.a = new Path();
        this.b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(i iVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        int i13;
        float f10;
        Matrix matrix2 = iVar.a;
        ArrayList arrayList = iVar.b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.a;
        matrix3.preConcat(iVar.j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            j jVar = (j) arrayList.get(i14);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i10, i11);
            } else if (jVar instanceof k) {
                k kVar = (k) jVar;
                float f11 = i10 / this.j;
                float f12 = i11 / this.k;
                float min = Math.min(f11, f12);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f11, f12);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c10], fArr[1]);
                boolean z10 = c10;
                i12 = i14;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f13 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f13) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    i0.d[] dVarArr = kVar.a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (kVar instanceof g) {
                        path2.setFillType(kVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        h hVar = (h) kVar;
                        float f14 = hVar.i;
                        if (f14 != 0.0f || hVar.j != 1.0f) {
                            float f15 = hVar.k;
                            float f16 = (f14 + f15) % 1.0f;
                            float f17 = (hVar.j + f15) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z10);
                            float length = this.f.getLength();
                            float f18 = f16 * length;
                            float f19 = f17 * length;
                            path.reset();
                            if (f18 > f19) {
                                this.f.getSegment(f18, length, path, true);
                                f7 = 0.0f;
                                this.f.getSegment(0.0f, f19, path, true);
                            } else {
                                f7 = 0.0f;
                                this.f.getSegment(f18, f19, path, true);
                            }
                            path.rLineTo(f7, f7);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = hVar.f;
                        if (((Shader) aVar.c) == null && aVar.b == 0) {
                            f10 = 255.0f;
                            i13 = 16777215;
                        } else {
                            if (this.e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) aVar.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(hVar.h * 255.0f));
                                f10 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = aVar.b;
                                float f20 = hVar.h;
                                PorterDuff.Mode mode = o.v;
                                f10 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f20)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(hVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        a5.a aVar2 = hVar.d;
                        if (((Shader) aVar2.c) != null || aVar2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = hVar.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = hVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(hVar.n);
                            Shader shader2 = (Shader) aVar2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(hVar.g * f10));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.b;
                                float f21 = hVar.g;
                                PorterDuff.Mode mode2 = o.v;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f21)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(hVar.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i14 = i12 + 1;
                c10 = 0;
            }
            i12 = i14;
            i14 = i12 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.l = i10;
    }

    public l(l lVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        a0.f fVar = new a0.f(0);
        this.o = fVar;
        this.g = new i(lVar.g, fVar);
        this.a = new Path(lVar.a);
        this.b = new Path(lVar.b);
        this.h = lVar.h;
        this.i = lVar.i;
        this.j = lVar.j;
        this.k = lVar.k;
        this.l = lVar.l;
        this.m = lVar.m;
        String str = lVar.m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.n = lVar.n;
    }
}
