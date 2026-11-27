// default package

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ux7 {
    public byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ux7(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = (byte) 16;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (bitmap.isRecycled()) {
            lq5.j("Bitmap is not valid");
            throw null;
        }
        arrayList2.add(lyc.h);
        this.b = bitmap;
        arrayList.add(ujb.d);
        arrayList.add(ujb.e);
        arrayList.add(ujb.f);
        arrayList.add(ujb.g);
        arrayList.add(ujb.h);
        arrayList.add(ujb.i);
    }

    public final lyc a() {
        ArrayList arrayList;
        lyc lycVar;
        ArrayList arrayList2 = (ArrayList) this.d;
        Bitmap bitmap = (Bitmap) this.b;
        int height = bitmap.getHeight() * bitmap.getWidth();
        double sqrt = height > 12544 ? Math.sqrt(12544.0d / height) : -1.0d;
        int i = 0;
        Bitmap createScaledBitmap = sqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * sqrt), (int) Math.ceil(bitmap.getHeight() * sqrt), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        am2 am2Var = new am2(iArr, this.a, arrayList2.isEmpty() ? null : (tx7[]) arrayList2.toArray(new tx7[arrayList2.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) am2Var.d;
        ArrayList arrayList4 = (ArrayList) this.c;
        lyc lycVar2 = new lyc(arrayList3, arrayList4);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) lycVar2.d;
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            ujb ujbVar = (ujb) arrayList4.get(i2);
            float[] fArr = ujbVar.c;
            float[] fArr2 = ujbVar.a;
            int length = fArr.length;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i3 = i; i3 < length; i3++) {
                float f3 = fArr[i3];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                int length2 = fArr.length;
                for (int i4 = i; i4 < length2; i4++) {
                    float f4 = fArr[i4];
                    if (f4 > 0.0f) {
                        fArr[i4] = f4 / f2;
                    }
                }
            }
            qs qsVar = (qs) lycVar2.c;
            ArrayList arrayList5 = (ArrayList) lycVar2.b;
            int size2 = arrayList5.size();
            int i5 = i;
            float f5 = 0.0f;
            vx7 vx7Var = null;
            while (i5 < size2) {
                vx7 vx7Var2 = (vx7) arrayList5.get(i5);
                float[] b = vx7Var2.b();
                float f6 = b[1];
                float f7 = f;
                float[] fArr3 = ujbVar.b;
                if (f6 >= fArr2[i5] && f6 <= fArr2[2]) {
                    float f8 = b[2];
                    if (f8 >= fArr3[i5] && f8 <= fArr3[2] && !sparseBooleanArray.get(vx7Var2.d)) {
                        float[] b2 = vx7Var2.b();
                        arrayList = arrayList4;
                        vx7 vx7Var3 = (vx7) lycVar2.e;
                        int i6 = vx7Var3 != null ? vx7Var3.e : 1;
                        lycVar = lycVar2;
                        float[] fArr4 = ujbVar.c;
                        float f9 = fArr4[i5];
                        float abs = f9 > f7 ? (1.0f - Math.abs(b2[1] - fArr2[1])) * f9 : f7;
                        float f10 = fArr4[1];
                        float abs2 = f10 > f7 ? (1.0f - Math.abs(b2[2] - fArr3[1])) * f10 : f7;
                        float f11 = fArr4[2];
                        float f12 = abs + abs2 + (f11 > f7 ? (vx7Var2.e / i6) * f11 : f7);
                        if (vx7Var == null || f12 > f5) {
                            vx7Var = vx7Var2;
                            f5 = f12;
                        }
                        i5++;
                        f = f7;
                        arrayList4 = arrayList;
                        lycVar2 = lycVar;
                    }
                }
                arrayList = arrayList4;
                lycVar = lycVar2;
                i5++;
                f = f7;
                arrayList4 = arrayList;
                lycVar2 = lycVar;
            }
            ArrayList arrayList6 = arrayList4;
            lyc lycVar3 = lycVar2;
            if (vx7Var != null) {
                sparseBooleanArray.append(vx7Var.d, true);
            }
            qsVar.put(ujbVar, vx7Var);
            i2++;
            i = i5;
            arrayList4 = arrayList6;
            lycVar2 = lycVar3;
        }
        lyc lycVar4 = lycVar2;
        sparseBooleanArray.clear();
        return lycVar4;
    }

    public final void b(Throwable th) {
        boolean z = th instanceof TimeoutException;
        cnd cndVar = (cnd) this.d;
        if (z) {
            cndVar.E(jn7.m1, 28, hod.p);
            old.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            cndVar.E(95, 28, hod.p);
            old.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.c).run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ux7(cnd cndVar, int i, pt2 pt2Var, Runnable runnable) {
        this.a = i;
        this.b = pt2Var;
        this.c = runnable;
        this.d = cndVar;
    }
}
