package xh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import bg.y;
import f5.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.messenger.q5;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h {
    public static h q;
    public Bitmap e;
    public Canvas f;
    public Paint g;
    public long h;
    public ArrayList i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean p;
    public final q5 a = new q5("SpoilerEffectBitmapFactory", 3);
    public final u[] b = new u[f.C.length];
    public final v6.e[] c = new v6.e[2];
    public int d = 0;
    public final Rect m = new Rect();
    public final y n = new y(this, 2);
    public final Rect o = new Rect();

    public h() {
        int L = g0.L(iz.o() == 2 ? 150.0f : 100.0f);
        Point point = g0.q;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, L);
        this.k = min < g0.L(80.0f) ? g0.L(80.0f) : min;
        int i7 = 0;
        while (true) {
            u[] uVarArr = this.b;
            if (i7 >= uVarArr.length) {
                return;
            }
            boolean z9 = false;
            u uVar = new u(18, z9, z9);
            uVar.c = new float[Math.max(64, 2)];
            uVar.b = 0;
            uVarArr[i7] = uVar;
            i7++;
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int i7;
        int[] iArr;
        int i10;
        float f10;
        int i11;
        int i12;
        g5.a aVar;
        float f11;
        int i13;
        Rect rect2 = rect;
        u[] uVarArr = this.b;
        for (u uVar : uVarArr) {
            uVar.b = 0;
        }
        int i14 = 0;
        while (i14 < 100) {
            f fVar = (f) this.i.get(i14);
            if (Rect.intersects(fVar.getBounds(), rect2)) {
                float[][] fArr = f.D;
                int[] iArr2 = fVar.f;
                float[] fArr2 = fVar.e;
                int length = uVarArr.length;
                float[] fArr3 = f.C;
                if (length == fArr3.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int min = (int) Math.min(currentTimeMillis - fVar.j, 34L);
                    fVar.j = currentTimeMillis;
                    ArrayList arrayList = fVar.h;
                    Stack stack = fVar.c;
                    int i15 = fVar.d;
                    int length2 = fArr3.length;
                    Rect bounds = fVar.getBounds();
                    float f12 = bounds.left;
                    float f13 = bounds.top;
                    i7 = i14;
                    float width = bounds.width();
                    float height = bounds.height();
                    RectF rectF = fVar.z;
                    float f14 = rectF.left;
                    float f15 = rectF.top;
                    float f16 = rectF.right;
                    float f17 = rectF.bottom;
                    float N = g0.N(1.0f);
                    float f18 = rect2.left - N;
                    float f19 = rect2.top - N;
                    float f20 = rect2.right + N;
                    float f21 = rect2.bottom + N;
                    float f22 = min;
                    float f23 = f22 / 500.0f;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        int i17 = size;
                        b bVar = (b) arrayList.get(i16);
                        float f24 = f22;
                        float f25 = f16;
                        float min2 = Math.min(bVar.g + f24, bVar.f);
                        bVar.g = min2;
                        float f26 = bVar.a;
                        float f27 = bVar.b;
                        boolean z9 = f26 < f14 || f26 > f25 || f27 < f15 || f27 > f17;
                        if (min2 >= bVar.f || z9) {
                            if (stack.size() < i15) {
                                stack.push(bVar);
                            }
                            int i18 = i17 - 1;
                            if (i16 != i18) {
                                arrayList.set(i16, (b) arrayList.get(i18));
                            }
                            arrayList.remove(i18);
                            size = i17 - 1;
                            i16--;
                        } else {
                            float f28 = bVar.e * f23;
                            bVar.a = (bVar.c * f28) + f26;
                            bVar.b = (bVar.d * f28) + f27;
                            size = i17;
                        }
                        i16++;
                        f22 = f24;
                        f16 = f25;
                    }
                    float f29 = f16;
                    int size2 = arrayList.size();
                    if (size2 < i15) {
                        int i19 = i15 - size2;
                        int i20 = 14;
                        float f30 = -1.0f;
                        Arrays.fill(fArr2, 0, Math.min(i19, 14), -1.0f);
                        float f31 = f13;
                        int i21 = 0;
                        int i22 = 0;
                        while (i21 < i19) {
                            float f32 = fArr2[i22];
                            if (f32 == f30) {
                                f32 = Utilities.c.nextFloat();
                                fArr2[i22] = f32;
                            }
                            float f33 = f32;
                            int i23 = i22 + 1;
                            i22 = i23 == i20 ? 0 : i23;
                            b bVar2 = !stack.isEmpty() ? (b) stack.pop() : new b();
                            int i24 = 0;
                            while (true) {
                                aVar = Utilities.c;
                                f11 = f31;
                                bVar2.a = (aVar.nextFloat() * width) + f12;
                                float nextFloat = (aVar.nextFloat() * height) + f11;
                                bVar2.b = nextFloat;
                                int i25 = i24 + 1;
                                i13 = i21;
                                float f34 = bVar2.a;
                                if ((f34 < f14 || f34 > f29 || nextFloat < f15 || nextFloat > f17) && i25 < 4) {
                                    i21 = i13;
                                    i24 = i25;
                                    f31 = f11;
                                }
                            }
                            int[] iArr3 = iArr2;
                            double d = ((f33 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            bVar2.c = (float) Math.cos(d);
                            bVar2.d = (float) Math.sin(d);
                            bVar2.g = 0.0f;
                            bVar2.f = aVar.nextInt(2000) + 1000;
                            bVar2.e = (f33 * 6.0f) + 4.0f;
                            bVar2.h = aVar.nextInt(length2);
                            arrayList.add(bVar2);
                            i21 = i13 + 1;
                            iArr2 = iArr3;
                            f31 = f11;
                            i20 = 14;
                            f30 = -1.0f;
                        }
                        iArr = iArr2;
                        size2 = arrayList.size();
                    } else {
                        iArr = iArr2;
                    }
                    for (int i26 = 0; i26 < length2; i26++) {
                        iArr[i26] = 0;
                    }
                    int i27 = fVar.x;
                    int i28 = 0;
                    while (i28 < size2) {
                        b bVar3 = (b) arrayList.get(i28);
                        float f35 = bVar3.a;
                        float f36 = bVar3.b;
                        if (f35 >= f18 && f35 <= f20 && f36 >= f19 && f36 <= f21) {
                            int i29 = bVar3.h;
                            float[] fArr4 = fArr[i29];
                            int i30 = iArr[i29];
                            int i31 = i30 + 1;
                            if (i31 < fArr4.length) {
                                fArr4[i30] = f35;
                                fArr4[i31] = f36;
                                int i32 = i30 + 2;
                                float f37 = fVar.b[i29];
                                if (f35 < f37) {
                                    int i33 = i30 + 3;
                                    i10 = size2;
                                    if (i33 < fArr4.length) {
                                        fArr4[i32] = i27 + f35;
                                        fArr4[i33] = f36;
                                        i32 = i30 + 4;
                                    }
                                } else {
                                    i10 = size2;
                                }
                                float f38 = i27;
                                float f39 = f38 - f37;
                                if (f35 > f39) {
                                    int i34 = i32 + 1;
                                    f10 = f38;
                                    if (i34 < fArr4.length) {
                                        fArr4[i32] = f35 - f10;
                                        fArr4[i34] = f36;
                                        i32 += 2;
                                    }
                                } else {
                                    f10 = f38;
                                }
                                if (f36 < f37 && (i12 = i32 + 1) < fArr4.length) {
                                    fArr4[i32] = f35;
                                    fArr4[i12] = f36 + f10;
                                    i32 += 2;
                                }
                                if (f36 > f39 && (i11 = i32 + 1) < fArr4.length) {
                                    fArr4[i32] = f35;
                                    fArr4[i11] = f36 - f10;
                                    i32 += 2;
                                }
                                iArr[i29] = i32;
                                i28++;
                                size2 = i10;
                            }
                        }
                        i10 = size2;
                        i28++;
                        size2 = i10;
                    }
                    for (int i35 = 0; i35 < length2; i35++) {
                        u uVar2 = uVarArr[i35];
                        float[] fArr5 = fArr[i35];
                        int i36 = iArr[i35];
                        int i37 = uVar2.b + i36;
                        float[] fArr6 = (float[]) uVar2.c;
                        if (i37 > fArr6.length) {
                            uVar2.c = Arrays.copyOf((float[]) uVar2.c, Math.max(i37, fArr6.length * 2));
                        }
                        System.arraycopy(fArr5, 0, (float[]) uVar2.c, uVar2.b, i36);
                        uVar2.b += i36;
                    }
                    i14 = i7 + 1;
                    rect2 = rect;
                }
            }
            i7 = i14;
            i14 = i7 + 1;
            rect2 = rect;
        }
        f fVar2 = (f) this.i.get(0);
        fVar2.getClass();
        float[] fArr7 = f.C;
        if (uVarArr.length != fArr7.length) {
            return;
        }
        for (int i38 = 0; i38 < fArr7.length; i38++) {
            u uVar3 = uVarArr[i38];
            Paint paint = fVar2.a[i38];
            int i39 = uVar3.b;
            if (i39 > 0) {
                canvas.drawPoints((float[]) uVar3.c, 0, i39, paint);
            }
        }
    }
}
