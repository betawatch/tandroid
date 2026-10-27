package y4;

import a8.rc;
import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {
    public i0.d[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f7, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (!rc.a(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!rc.a(this.a, dVarArr)) {
            this.a = rc.e(dVarArr);
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            i0.d dVar = this.a[i10];
            i0.d dVar2 = dVarArr[i10];
            i0.d dVar3 = dVarArr2[i10];
            dVar.getClass();
            dVar.a = dVar2.a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVar2.b;
                if (i11 < fArr.length) {
                    dVar.b[i11] = (dVar3.b[i11] * f7) + ((1.0f - f7) * fArr[i11]);
                    i11++;
                }
            }
        }
        return this.a;
    }
}
