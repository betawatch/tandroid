package z4;

import android.animation.TypeEvaluator;
import b8.rc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {
    public i0.d[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (!rc.a(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!rc.a(this.a, dVarArr)) {
            this.a = rc.e(dVarArr);
        }
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            i0.d dVar = this.a[i3];
            i0.d dVar2 = dVarArr[i3];
            i0.d dVar3 = dVarArr2[i3];
            dVar.getClass();
            dVar.a = dVar2.a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVar2.b;
                if (i10 < fArr.length) {
                    dVar.b[i10] = (dVar3.b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                    i10++;
                }
            }
        }
        return this.a;
    }
}
