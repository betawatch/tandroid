// default package

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ow7 {
    public byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ow7(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = (byte) 16;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (bitmap.isRecycled()) {
            u36.j("Bitmap is not valid");
            throw null;
        }
        arrayList2.add(xvc.h);
        this.b = bitmap;
        arrayList.add(zhb.d);
        arrayList.add(zhb.e);
        arrayList.add(zhb.f);
        arrayList.add(zhb.g);
        arrayList.add(zhb.h);
        arrayList.add(zhb.i);
    }

    public final xvc a() {
        ArrayList arrayList;
        xvc xvcVar;
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
        sm2 sm2Var = new sm2(iArr, this.a, arrayList2.isEmpty() ? null : (nw7[]) arrayList2.toArray(new nw7[arrayList2.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) sm2Var.d;
        ArrayList arrayList4 = (ArrayList) this.c;
        xvc xvcVar2 = new xvc(arrayList3, arrayList4);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) xvcVar2.d;
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            zhb zhbVar = (zhb) arrayList4.get(i2);
            float[] fArr = zhbVar.c;
            float[] fArr2 = zhbVar.a;
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
            qt qtVar = (qt) xvcVar2.c;
            ArrayList arrayList5 = (ArrayList) xvcVar2.b;
            int size2 = arrayList5.size();
            int i5 = i;
            float f5 = 0.0f;
            pw7 pw7Var = null;
            while (i5 < size2) {
                pw7 pw7Var2 = (pw7) arrayList5.get(i5);
                float[] b = pw7Var2.b();
                float f6 = b[1];
                float f7 = f;
                float[] fArr3 = zhbVar.b;
                if (f6 >= fArr2[i5] && f6 <= fArr2[2]) {
                    float f8 = b[2];
                    if (f8 >= fArr3[i5] && f8 <= fArr3[2] && !sparseBooleanArray.get(pw7Var2.d)) {
                        float[] b2 = pw7Var2.b();
                        arrayList = arrayList4;
                        pw7 pw7Var3 = (pw7) xvcVar2.e;
                        int i6 = pw7Var3 != null ? pw7Var3.e : 1;
                        xvcVar = xvcVar2;
                        float[] fArr4 = zhbVar.c;
                        float f9 = fArr4[i5];
                        float abs = f9 > f7 ? (1.0f - Math.abs(b2[1] - fArr2[1])) * f9 : f7;
                        float f10 = fArr4[1];
                        float abs2 = f10 > f7 ? (1.0f - Math.abs(b2[2] - fArr3[1])) * f10 : f7;
                        float f11 = fArr4[2];
                        float f12 = abs + abs2 + (f11 > f7 ? (pw7Var2.e / i6) * f11 : f7);
                        if (pw7Var == null || f12 > f5) {
                            pw7Var = pw7Var2;
                            f5 = f12;
                        }
                        i5++;
                        f = f7;
                        arrayList4 = arrayList;
                        xvcVar2 = xvcVar;
                    }
                }
                arrayList = arrayList4;
                xvcVar = xvcVar2;
                i5++;
                f = f7;
                arrayList4 = arrayList;
                xvcVar2 = xvcVar;
            }
            ArrayList arrayList6 = arrayList4;
            xvc xvcVar3 = xvcVar2;
            if (pw7Var != null) {
                sparseBooleanArray.append(pw7Var.d, true);
            }
            qtVar.put(zhbVar, pw7Var);
            i2++;
            i = i5;
            arrayList4 = arrayList6;
            xvcVar2 = xvcVar3;
        }
        xvc xvcVar4 = xvcVar2;
        sparseBooleanArray.clear();
        return xvcVar4;
    }

    public final void b(Throwable th) {
        boolean z = th instanceof TimeoutException;
        nkd nkdVar = (nkd) this.d;
        if (z) {
            nkdVar.E(nm7.m1, 28, sld.p);
            yid.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            nkdVar.E(95, 28, sld.p);
            yid.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.c).run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ow7(nkd nkdVar, int i, gu2 gu2Var, Runnable runnable) {
        this.a = i;
        this.b = gu2Var;
        this.c = runnable;
        this.d = nkdVar;
    }
}
