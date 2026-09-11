package x4;

import android.animation.TypeEvaluator;
import v7.g8;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {
    public i0.e[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f7, Object obj, Object obj2) {
        i0.e[] eVarArr = (i0.e[]) obj;
        i0.e[] eVarArr2 = (i0.e[]) obj2;
        if (!g8.a(eVarArr, eVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!g8.a(this.a, eVarArr)) {
            this.a = g8.e(eVarArr);
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            i0.e eVar = this.a[i10];
            i0.e eVar2 = eVarArr[i10];
            i0.e eVar3 = eVarArr2[i10];
            eVar.getClass();
            eVar.a = eVar2.a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVar2.b;
                if (i11 < fArr.length) {
                    eVar.b[i11] = (eVar3.b[i11] * f7) + ((1.0f - f7) * fArr[i11]);
                    i11++;
                }
            }
        }
        return this.a;
    }
}
