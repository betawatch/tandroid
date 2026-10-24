package wh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import c5.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class i {
    public static i q;
    public Bitmap e;
    public Canvas f;
    public Paint g;
    public long h;
    public ArrayList i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean p;
    public final DispatchQueue a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final c0[] b = new c0[g.C.length];
    public final q[] c = new q[2];
    public int d = 0;
    public final Rect m = new Rect();
    public final r4.e n = new r4.e(this, 2);
    public final Rect o = new Rect();

    public i() {
        int dp = AndroidUtilities.dp(SharedConfig.getDevicePerformanceClass() == 2 ? 150.0f : 100.0f);
        Point point = AndroidUtilities.displaySize;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, dp);
        this.k = min < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : min;
        int i10 = 0;
        while (true) {
            c0[] c0VarArr = this.b;
            if (i10 >= c0VarArr.length) {
                return;
            }
            boolean z10 = false;
            c0 c0Var = new c0(16, z10, z10);
            c0Var.c = new float[Math.max(64, 2)];
            c0Var.b = 0;
            c0VarArr[i10] = c0Var;
            i10++;
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        float f10;
        Rect rect2 = rect;
        c0[] c0VarArr = this.b;
        for (c0 c0Var : c0VarArr) {
            c0Var.b = 0;
        }
        int i14 = 0;
        while (i14 < 100) {
            g gVar = (g) this.i.get(i14);
            if (Rect.intersects(gVar.getBounds(), rect2)) {
                float[][] fArr = g.D;
                int[] iArr = gVar.f;
                float[] fArr2 = gVar.e;
                if (c0VarArr != null) {
                    int length = c0VarArr.length;
                    float[] fArr3 = g.C;
                    if (length == fArr3.length) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int min = (int) Math.min(currentTimeMillis - gVar.j, 34L);
                        gVar.j = currentTimeMillis;
                        ArrayList arrayList = gVar.h;
                        Stack stack = gVar.c;
                        int i15 = gVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = gVar.getBounds();
                        float f11 = bounds.left;
                        float f12 = bounds.top;
                        i10 = i14;
                        float width = bounds.width();
                        float height = bounds.height();
                        RectF rectF = gVar.z;
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        float f15 = rectF.right;
                        float f16 = rectF.bottom;
                        float dpf2 = AndroidUtilities.dpf2(1.0f);
                        float f17 = rect2.left - dpf2;
                        float f18 = rect2.top - dpf2;
                        float f19 = rect2.right + dpf2;
                        float f20 = rect2.bottom + dpf2;
                        float f21 = min;
                        float f22 = f21 / 500.0f;
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            int i17 = size;
                            c cVar = (c) arrayList.get(i16);
                            float f23 = f20;
                            float f24 = f15;
                            float min2 = Math.min(cVar.g + f21, cVar.f);
                            cVar.g = min2;
                            float f25 = cVar.a;
                            float f26 = cVar.b;
                            boolean z10 = f25 < f13 || f25 > f24 || f26 < f14 || f26 > f16;
                            if (min2 >= cVar.f || z10) {
                                if (stack.size() < i15) {
                                    stack.push(cVar);
                                }
                                int i18 = i17 - 1;
                                if (i16 != i18) {
                                    arrayList.set(i16, (c) arrayList.get(i18));
                                }
                                arrayList.remove(i18);
                                size = i17 - 1;
                                i16--;
                            } else {
                                float f27 = cVar.e * f22;
                                cVar.a = (cVar.c * f27) + f25;
                                cVar.b = (cVar.d * f27) + f26;
                                size = i17;
                            }
                            i16++;
                            f20 = f23;
                            f15 = f24;
                        }
                        float f28 = f20;
                        float f29 = f15;
                        int size2 = arrayList.size();
                        if (size2 < i15) {
                            int i19 = i15 - size2;
                            int i20 = 14;
                            float f30 = -1.0f;
                            Arrays.fill(fArr2, 0, Math.min(i19, 14), -1.0f);
                            float f31 = f12;
                            int i21 = 0;
                            int i22 = 0;
                            while (i21 < i19) {
                                float f32 = fArr2[i22];
                                if (f32 == f30) {
                                    f32 = Utilities.fastRandom.nextFloat();
                                    fArr2[i22] = f32;
                                }
                                float f33 = f32;
                                int i23 = i22 + 1;
                                i22 = i23 == i20 ? 0 : i23;
                                c cVar2 = !stack.isEmpty() ? (c) stack.pop() : new c();
                                int i24 = 0;
                                while (true) {
                                    cVar2.a = b1.d(Utilities.fastRandom, width, f11);
                                    float d = b1.d(Utilities.fastRandom, height, f31);
                                    cVar2.b = d;
                                    int i25 = i24 + 1;
                                    f10 = width;
                                    float f34 = cVar2.a;
                                    if ((f34 < f13 || f34 > f29 || d < f14 || d > f16) && i25 < 4) {
                                        width = f10;
                                        i24 = i25;
                                    }
                                }
                                float f35 = f31;
                                double d10 = ((f33 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                cVar2.c = (float) Math.cos(d10);
                                cVar2.d = (float) Math.sin(d10);
                                cVar2.g = 0.0f;
                                cVar2.f = Utilities.fastRandom.nextInt(2000) + MediaDataController.MAX_STYLE_RUNS_COUNT;
                                cVar2.e = (f33 * 6.0f) + 4.0f;
                                cVar2.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(cVar2);
                                i21++;
                                width = f10;
                                f31 = f35;
                                i20 = 14;
                                f30 = -1.0f;
                            }
                            size2 = arrayList.size();
                        }
                        for (int i26 = 0; i26 < length2; i26++) {
                            iArr[i26] = 0;
                        }
                        int i27 = gVar.x;
                        int i28 = 0;
                        while (i28 < size2) {
                            c cVar3 = (c) arrayList.get(i28);
                            float f36 = cVar3.a;
                            float f37 = cVar3.b;
                            if (f36 >= f17 && f36 <= f19 && f37 >= f18 && f37 <= f28) {
                                int i29 = cVar3.h;
                                float[] fArr4 = fArr[i29];
                                int i30 = iArr[i29];
                                int i31 = i30 + 1;
                                if (i31 < fArr4.length) {
                                    fArr4[i30] = f36;
                                    fArr4[i31] = f37;
                                    int i32 = i30 + 2;
                                    float f38 = gVar.b[i29];
                                    if (f36 < f38) {
                                        int i33 = i30 + 3;
                                        i11 = size2;
                                        if (i33 < fArr4.length) {
                                            fArr4[i32] = i27 + f36;
                                            fArr4[i33] = f37;
                                            i32 = i30 + 4;
                                        }
                                    } else {
                                        i11 = size2;
                                    }
                                    float f39 = i27;
                                    float f40 = f39 - f38;
                                    if (f36 > f40) {
                                        int i34 = i32 + 1;
                                        f7 = f39;
                                        if (i34 < fArr4.length) {
                                            fArr4[i32] = f36 - f7;
                                            fArr4[i34] = f37;
                                            i32 += 2;
                                        }
                                    } else {
                                        f7 = f39;
                                    }
                                    if (f37 < f38 && (i13 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f36;
                                        fArr4[i13] = f37 + f7;
                                        i32 += 2;
                                    }
                                    if (f37 > f40 && (i12 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f36;
                                        fArr4[i12] = f37 - f7;
                                        i32 += 2;
                                    }
                                    iArr[i29] = i32;
                                    i28++;
                                    size2 = i11;
                                }
                            }
                            i11 = size2;
                            i28++;
                            size2 = i11;
                        }
                        for (int i35 = 0; i35 < length2; i35++) {
                            c0 c0Var2 = c0VarArr[i35];
                            float[] fArr5 = fArr[i35];
                            int i36 = iArr[i35];
                            int i37 = c0Var2.b + i36;
                            float[] fArr6 = (float[]) c0Var2.c;
                            if (i37 > fArr6.length) {
                                c0Var2.c = Arrays.copyOf((float[]) c0Var2.c, Math.max(i37, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) c0Var2.c, c0Var2.b, i36);
                            c0Var2.b += i36;
                        }
                        i14 = i10 + 1;
                        rect2 = rect;
                    }
                }
            }
            i10 = i14;
            i14 = i10 + 1;
            rect2 = rect;
        }
        g gVar2 = (g) this.i.get(0);
        gVar2.getClass();
        float[] fArr7 = g.C;
        if (c0VarArr == null || c0VarArr.length != fArr7.length) {
            return;
        }
        for (int i38 = 0; i38 < fArr7.length; i38++) {
            c0 c0Var3 = c0VarArr[i38];
            Paint paint = gVar2.a[i38];
            int i39 = c0Var3.b;
            if (i39 > 0) {
                canvas.drawPoints((float[]) c0Var3.c, 0, i39, paint);
            }
        }
    }
}
