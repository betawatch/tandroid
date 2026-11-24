// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pbc {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final mbc g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final qt o;

    public pbc(pbc pbcVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = nm7.d4;
        this.m = null;
        this.n = null;
        qt qtVar = new qt(0);
        this.o = qtVar;
        this.g = new mbc(pbcVar.g, qtVar);
        this.a = new Path(pbcVar.a);
        this.b = new Path(pbcVar.b);
        this.h = pbcVar.h;
        this.i = pbcVar.i;
        this.j = pbcVar.j;
        this.k = pbcVar.k;
        this.l = pbcVar.l;
        this.m = pbcVar.m;
        String str = pbcVar.m;
        if (str != null) {
            qtVar.put(str, this);
        }
        this.n = pbcVar.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(mbc mbcVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = mbcVar.a;
        ArrayList arrayList = mbcVar.b;
        matrix2.set(matrix);
        Matrix matrix3 = mbcVar.a;
        matrix3.preConcat(mbcVar.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            nbc nbcVar = (nbc) arrayList.get(i5);
            if (nbcVar instanceof mbc) {
                a((mbc) nbcVar, matrix3, canvas, i, i2);
            } else if (nbcVar instanceof obc) {
                obc obcVar = (obc) nbcVar;
                float f3 = i / this.j;
                float f4 = i2 / this.k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    m08[] m08VarArr = obcVar.a;
                    if (m08VarArr != null) {
                        pse.f(m08VarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (obcVar instanceof kbc) {
                        path2.setFillType(obcVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        lbc lbcVar = (lbc) obcVar;
                        float f6 = lbcVar.i;
                        if (f6 != 0.0f || lbcVar.j != 1.0f) {
                            float f7 = lbcVar.k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (lbcVar.j + f7) % 1.0f;
                            PathMeasure pathMeasure = this.f;
                            PathMeasure pathMeasure2 = pathMeasure;
                            if (pathMeasure == null) {
                                PathMeasure pathMeasure3 = new PathMeasure();
                                this.f = pathMeasure3;
                                pathMeasure2 = pathMeasure3;
                            }
                            pathMeasure2.setPath(path, z);
                            float length = this.f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure4 = this.f;
                            if (f10 > f11) {
                                pathMeasure4.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure4.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        kq kqVar = lbcVar.f;
                        if (((Shader) kqVar.c) == null && kqVar.b == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) kqVar.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(lbcVar.h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(nm7.d4);
                                int i6 = kqVar.b;
                                float f12 = lbcVar.h;
                                PorterDuff.Mode mode = sbc.w;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(lbcVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        kq kqVar2 = lbcVar.d;
                        if (((Shader) kqVar2.c) != null || kqVar2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = lbcVar.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = lbcVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(lbcVar.n);
                            Shader shader2 = (Shader) kqVar2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(lbcVar.g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(nm7.d4);
                                int i7 = kqVar2.b;
                                float f13 = lbcVar.g;
                                PorterDuff.Mode mode2 = sbc.w;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(lbcVar.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public pbc() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = nm7.d4;
        this.m = null;
        this.n = null;
        this.o = new qt(0);
        this.g = new mbc();
        this.a = new Path();
        this.b = new Path();
    }
}
