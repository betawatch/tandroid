// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ppa {
    public static ppa q;
    public Bitmap e;
    public Canvas f;
    public Paint g;
    public long h;
    public ArrayList i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean p;
    public final uo3 a = new uo3("SpoilerEffectBitmapFactory", 3);
    public final ed[] b = new ed[npa.C.length];
    public final ym4[] c = new ym4[2];
    public int d = 0;
    public final Rect m = new Rect();
    public final jr4 n = new jr4(this, (byte) 4);
    public final Rect o = new Rect();

    public ppa() {
        boolean z = false;
        int L = hl.L(xea.o() == 2 ? 150.0f : 100.0f);
        Point point = hl.q;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, L);
        this.k = min < hl.L(80.0f) ? hl.L(80.0f) : min;
        int i = 0;
        while (true) {
            ed[] edVarArr = this.b;
            if (i >= edVarArr.length) {
                return;
            }
            ed edVar = new ed((byte) 18, z);
            edVar.c = new float[64];
            edVar.b = 0;
            edVarArr[i] = edVar;
            i++;
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        ArrayList arrayList;
        int i;
        float[][] fArr;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        o3d o3dVar;
        float f;
        int i6;
        ppa ppaVar = this;
        Rect rect2 = rect;
        ed[] edVarArr = ppaVar.b;
        int i7 = 0;
        for (ed edVar : edVarArr) {
            edVar.b = 0;
        }
        int i8 = 0;
        while (true) {
            arrayList = ppaVar.i;
            if (i8 >= 100) {
                break;
            }
            npa npaVar = (npa) arrayList.get(i8);
            if (Rect.intersects(npaVar.getBounds(), rect2)) {
                float[][] fArr2 = npa.D;
                int[] iArr2 = npaVar.f;
                float[] fArr3 = npaVar.e;
                int length = edVarArr.length;
                float[] fArr4 = npa.C;
                if (length == fArr4.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int min = (int) Math.min(currentTimeMillis - npaVar.j, 34L);
                    npaVar.j = currentTimeMillis;
                    ArrayList arrayList2 = npaVar.h;
                    Stack stack = npaVar.c;
                    int i9 = npaVar.d;
                    int length2 = fArr4.length;
                    Rect bounds = npaVar.getBounds();
                    float f2 = bounds.left;
                    float f3 = bounds.top;
                    float width = bounds.width();
                    float height = bounds.height();
                    RectF rectF = npaVar.z;
                    i = i8;
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    float f6 = rectF.right;
                    float f7 = rectF.bottom;
                    float N = hl.N(1.0f);
                    float f8 = rect2.left - N;
                    float f9 = rect2.top - N;
                    float f10 = rect2.right + N;
                    float f11 = rect2.bottom + N;
                    float f12 = min;
                    float f13 = f12 / 500.0f;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        jpa jpaVar = (jpa) arrayList2.get(i10);
                        float f14 = f6;
                        float f15 = f12;
                        float min2 = Math.min(jpaVar.g + f12, jpaVar.f);
                        jpaVar.g = min2;
                        float f16 = jpaVar.a;
                        float f17 = jpaVar.b;
                        boolean z = f16 < f4 || f16 > f14 || f17 < f5 || f17 > f7;
                        if (min2 >= jpaVar.f || z) {
                            if (stack.size() < i9) {
                                stack.push(jpaVar);
                            }
                            int i12 = i11 - 1;
                            if (i10 != i12) {
                                arrayList2.set(i10, (jpa) arrayList2.get(i12));
                            }
                            arrayList2.remove(i12);
                            size = i11 - 1;
                            i10--;
                        } else {
                            float f18 = jpaVar.e * f13;
                            jpaVar.a = (jpaVar.c * f18) + f16;
                            jpaVar.b = (jpaVar.d * f18) + f17;
                            size = i11;
                        }
                        i10++;
                        f6 = f14;
                        f12 = f15;
                    }
                    float f19 = f6;
                    int size2 = arrayList2.size();
                    if (size2 < i9) {
                        int i13 = i9 - size2;
                        int i14 = 14;
                        float f20 = -1.0f;
                        Arrays.fill(fArr3, 0, Math.min(i13, 14), -1.0f);
                        float f21 = f3;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i13) {
                            float f22 = fArr3[i16];
                            if (f22 == f20) {
                                f22 = Utilities.c.nextFloat();
                                fArr3[i16] = f22;
                            }
                            float f23 = f22;
                            int i17 = i16 + 1;
                            i16 = i17 == i14 ? 0 : i17;
                            jpa jpaVar2 = !stack.isEmpty() ? (jpa) stack.pop() : new jpa();
                            int i18 = 0;
                            while (true) {
                                o3dVar = Utilities.c;
                                f = f21;
                                jpaVar2.a = (o3dVar.nextFloat() * width) + f2;
                                float nextFloat = (o3dVar.nextFloat() * height) + f;
                                jpaVar2.b = nextFloat;
                                int i19 = i18 + 1;
                                i6 = i15;
                                float f24 = jpaVar2.a;
                                if ((f24 < f4 || f24 > f19 || nextFloat < f5 || nextFloat > f7) && i19 < 4) {
                                    i15 = i6;
                                    i18 = i19;
                                    f21 = f;
                                }
                            }
                            float[][] fArr5 = fArr2;
                            double d = ((f23 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            jpaVar2.c = (float) Math.cos(d);
                            jpaVar2.d = (float) Math.sin(d);
                            jpaVar2.g = 0.0f;
                            jpaVar2.f = o3dVar.nextInt(2000) + 1000;
                            jpaVar2.e = (f23 * 6.0f) + 4.0f;
                            jpaVar2.h = o3dVar.nextInt(length2);
                            arrayList2.add(jpaVar2);
                            i15 = i6 + 1;
                            iArr2 = iArr2;
                            f21 = f;
                            fArr2 = fArr5;
                            i14 = 14;
                            f20 = -1.0f;
                        }
                        fArr = fArr2;
                        iArr = iArr2;
                        size2 = arrayList2.size();
                    } else {
                        fArr = fArr2;
                        iArr = iArr2;
                    }
                    for (int i20 = 0; i20 < length2; i20++) {
                        iArr[i20] = 0;
                    }
                    int i21 = npaVar.x;
                    int i22 = 0;
                    while (i22 < size2) {
                        jpa jpaVar3 = (jpa) arrayList2.get(i22);
                        float f25 = jpaVar3.a;
                        float f26 = jpaVar3.b;
                        if (f25 >= f8 && f25 <= f10 && f26 >= f9 && f26 <= f11) {
                            int i23 = jpaVar3.h;
                            float[] fArr6 = fArr[i23];
                            int i24 = iArr[i23];
                            int i25 = i24 + 1;
                            if (i25 < fArr6.length) {
                                fArr6[i24] = f25;
                                fArr6[i25] = f26;
                                int i26 = i24 + 2;
                                float f27 = npaVar.b[i23];
                                if (f25 < f27 && (i5 = i24 + 3) < fArr6.length) {
                                    fArr6[i26] = i21 + f25;
                                    fArr6[i5] = f26;
                                    i26 = i24 + 4;
                                }
                                float f28 = i21;
                                float f29 = f28 - f27;
                                if (f25 > f29) {
                                    int i27 = i26 + 1;
                                    i2 = size2;
                                    if (i27 < fArr6.length) {
                                        fArr6[i26] = f25 - f28;
                                        fArr6[i27] = f26;
                                        i26 += 2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (f26 < f27 && (i4 = i26 + 1) < fArr6.length) {
                                    fArr6[i26] = f25;
                                    fArr6[i4] = f26 + f28;
                                    i26 += 2;
                                }
                                if (f26 > f29 && (i3 = i26 + 1) < fArr6.length) {
                                    fArr6[i26] = f25;
                                    fArr6[i3] = f26 - f28;
                                    i26 += 2;
                                }
                                iArr[i23] = i26;
                                i22++;
                                size2 = i2;
                            }
                        }
                        i2 = size2;
                        i22++;
                        size2 = i2;
                    }
                    for (int i28 = 0; i28 < length2; i28++) {
                        ed edVar2 = edVarArr[i28];
                        float[] fArr7 = fArr[i28];
                        int i29 = iArr[i28];
                        int i30 = edVar2.b + i29;
                        float[] fArr8 = (float[]) edVar2.c;
                        if (i30 > fArr8.length) {
                            fArr8 = Arrays.copyOf((float[]) edVar2.c, Math.max(i30, fArr8.length << 1));
                            edVar2.c = fArr8;
                        }
                        System.arraycopy(fArr7, 0, fArr8, edVar2.b, i29);
                        edVar2.b += i29;
                    }
                    i8 = i + 1;
                    ppaVar = this;
                    rect2 = rect;
                    i7 = 0;
                }
            }
            i = i8;
            i8 = i + 1;
            ppaVar = this;
            rect2 = rect;
            i7 = 0;
        }
        npa npaVar2 = (npa) arrayList.get(i7);
        npaVar2.getClass();
        float[] fArr9 = npa.C;
        if (edVarArr.length == fArr9.length) {
            for (int i31 = 0; i31 < fArr9.length; i31++) {
                ed edVar3 = edVarArr[i31];
                Paint paint = npaVar2.a[i31];
                int i32 = edVar3.b;
                if (i32 > 0) {
                    canvas.drawPoints((float[]) edVar3.c, 0, i32, paint);
                }
            }
        }
    }
}
