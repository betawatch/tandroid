// default package

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tn implements TypeEvaluator {
    public q18[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        q18[] q18VarArr = (q18[]) obj;
        q18[] q18VarArr2 = (q18[]) obj2;
        if (!hve.a(q18VarArr, q18VarArr2)) {
            lq5.j("Can't interpolate between two incompatible pathData");
            return null;
        }
        if (!hve.a(this.a, q18VarArr)) {
            this.a = hve.e(q18VarArr);
        }
        int i = 0;
        while (true) {
            int length = q18VarArr.length;
            q18[] q18VarArr3 = this.a;
            if (i >= length) {
                return q18VarArr3;
            }
            q18 q18Var = q18VarArr3[i];
            q18 q18Var2 = q18VarArr[i];
            q18 q18Var3 = q18VarArr2[i];
            q18Var.getClass();
            q18Var.a = q18Var2.a;
            int i2 = 0;
            while (true) {
                float[] fArr = q18Var2.b;
                if (i2 < fArr.length) {
                    q18Var.b[i2] = (q18Var3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
            i++;
        }
    }
}
