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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tna {
    public static tna q;
    public Bitmap e;
    public Canvas f;
    public Paint g;
    public long h;
    public ArrayList i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean p;
    public final np3 a = new np3("SpoilerEffectBitmapFactory", 3);
    public final de[] b = new de[rna.C.length];
    public final mj4[] c = new mj4[2];
    public int d = 0;
    public final Rect m = new Rect();
    public final gr4 n = new gr4(this, (byte) 4);
    public final Rect o = new Rect();

    public tna() {
        boolean z = false;
        int L = gm.L(gda.o() == 2 ? 150.0f : 100.0f);
        Point point = gm.q;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, L);
        this.k = min < gm.L(80.0f) ? gm.L(80.0f) : min;
        int i = 0;
        while (true) {
            de[] deVarArr = this.b;
            if (i >= deVarArr.length) {
                return;
            }
            de deVar = new de((byte) 18, z);
            deVar.c = new float[64];
            deVar.b = 0;
            deVarArr[i] = deVar;
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
        z0d z0dVar;
        float f;
        int i6;
        tna tnaVar = this;
        Rect rect2 = rect;
        de[] deVarArr = tnaVar.b;
        int i7 = 0;
        for (de deVar : deVarArr) {
            deVar.b = 0;
        }
        int i8 = 0;
        while (true) {
            arrayList = tnaVar.i;
            if (i8 >= 100) {
                break;
            }
            rna rnaVar = (rna) arrayList.get(i8);
            if (Rect.intersects(rnaVar.getBounds(), rect2)) {
                float[][] fArr2 = rna.D;
                int[] iArr2 = rnaVar.f;
                float[] fArr3 = rnaVar.e;
                int length = deVarArr.length;
                float[] fArr4 = rna.C;
                if (length == fArr4.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int min = (int) Math.min(currentTimeMillis - rnaVar.j, 34L);
                    rnaVar.j = currentTimeMillis;
                    ArrayList arrayList2 = rnaVar.h;
                    Stack stack = rnaVar.c;
                    int i9 = rnaVar.d;
                    int length2 = fArr4.length;
                    Rect bounds = rnaVar.getBounds();
                    float f2 = bounds.left;
                    float f3 = bounds.top;
                    float width = bounds.width();
                    float height = bounds.height();
                    RectF rectF = rnaVar.z;
                    i = i8;
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    float f6 = rectF.right;
                    float f7 = rectF.bottom;
                    float N = gm.N(1.0f);
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
                        nna nnaVar = (nna) arrayList2.get(i10);
                        float f14 = f6;
                        float f15 = f12;
                        float min2 = Math.min(nnaVar.g + f12, nnaVar.f);
                        nnaVar.g = min2;
                        float f16 = nnaVar.a;
                        float f17 = nnaVar.b;
                        boolean z = f16 < f4 || f16 > f14 || f17 < f5 || f17 > f7;
                        if (min2 >= nnaVar.f || z) {
                            if (stack.size() < i9) {
                                stack.push(nnaVar);
                            }
                            int i12 = i11 - 1;
                            if (i10 != i12) {
                                arrayList2.set(i10, (nna) arrayList2.get(i12));
                            }
                            arrayList2.remove(i12);
                            size = i11 - 1;
                            i10--;
                        } else {
                            float f18 = nnaVar.e * f13;
                            nnaVar.a = (nnaVar.c * f18) + f16;
                            nnaVar.b = (nnaVar.d * f18) + f17;
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
                            nna nnaVar2 = !stack.isEmpty() ? (nna) stack.pop() : new nna();
                            int i18 = 0;
                            while (true) {
                                z0dVar = Utilities.c;
                                f = f21;
                                nnaVar2.a = (z0dVar.nextFloat() * width) + f2;
                                float nextFloat = (z0dVar.nextFloat() * height) + f;
                                nnaVar2.b = nextFloat;
                                int i19 = i18 + 1;
                                i6 = i15;
                                float f24 = nnaVar2.a;
                                if ((f24 < f4 || f24 > f19 || nextFloat < f5 || nextFloat > f7) && i19 < 4) {
                                    i15 = i6;
                                    i18 = i19;
                                    f21 = f;
                                }
                            }
                            float[][] fArr5 = fArr2;
                            double d = ((f23 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            nnaVar2.c = (float) Math.cos(d);
                            nnaVar2.d = (float) Math.sin(d);
                            nnaVar2.g = 0.0f;
                            nnaVar2.f = z0dVar.nextInt(2000) + 1000;
                            nnaVar2.e = (f23 * 6.0f) + 4.0f;
                            nnaVar2.h = z0dVar.nextInt(length2);
                            arrayList2.add(nnaVar2);
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
                    int i21 = rnaVar.x;
                    int i22 = 0;
                    while (i22 < size2) {
                        nna nnaVar3 = (nna) arrayList2.get(i22);
                        float f25 = nnaVar3.a;
                        float f26 = nnaVar3.b;
                        if (f25 >= f8 && f25 <= f10 && f26 >= f9 && f26 <= f11) {
                            int i23 = nnaVar3.h;
                            float[] fArr6 = fArr[i23];
                            int i24 = iArr[i23];
                            int i25 = i24 + 1;
                            if (i25 < fArr6.length) {
                                fArr6[i24] = f25;
                                fArr6[i25] = f26;
                                int i26 = i24 + 2;
                                float f27 = rnaVar.b[i23];
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
                        de deVar2 = deVarArr[i28];
                        float[] fArr7 = fArr[i28];
                        int i29 = iArr[i28];
                        int i30 = deVar2.b + i29;
                        float[] fArr8 = (float[]) deVar2.c;
                        if (i30 > fArr8.length) {
                            fArr8 = Arrays.copyOf((float[]) deVar2.c, Math.max(i30, fArr8.length << 1));
                            deVar2.c = fArr8;
                        }
                        System.arraycopy(fArr7, 0, fArr8, deVar2.b, i29);
                        deVar2.b += i29;
                    }
                    i8 = i + 1;
                    tnaVar = this;
                    rect2 = rect;
                    i7 = 0;
                }
            }
            i = i8;
            i8 = i + 1;
            tnaVar = this;
            rect2 = rect;
            i7 = 0;
        }
        rna rnaVar2 = (rna) arrayList.get(i7);
        rnaVar2.getClass();
        float[] fArr9 = rna.C;
        if (deVarArr.length == fArr9.length) {
            for (int i31 = 0; i31 < fArr9.length; i31++) {
                de deVar3 = deVarArr[i31];
                Paint paint = rnaVar2.a[i31];
                int i32 = deVar3.b;
                if (i32 > 0) {
                    canvas.drawPoints((float[]) deVar3.c, 0, i32, paint);
                }
            }
        }
    }
}
