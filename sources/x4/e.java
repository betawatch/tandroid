package x4;

import android.animation.TypeEvaluator;
import v7.x7;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {
    public i0.d[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f7, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (!x7.a(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!x7.a(this.a, dVarArr)) {
            this.a = x7.e(dVarArr);
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
