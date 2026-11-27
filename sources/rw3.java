// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rw3 extends t2b {
    public final /* synthetic */ boolean H3;
    public final /* synthetic */ sw3 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw3(sw3 sw3Var, Context context, int i, vnb vnbVar, boolean z) {
        super(i, vnbVar, context);
        this.I3 = sw3Var;
        this.H3 = z;
    }

    @Override // t2b
    public final q2b[] F1(q2b[] q2bVarArr) {
        if (q2bVarArr != null && this.H3) {
            int i = 0;
            while (true) {
                if (i >= q2bVarArr.length) {
                    i = -1;
                    break;
                }
                q2b q2bVar = q2bVarArr[i];
                if (q2bVar != null && q2bVar.b) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                int length = q2bVarArr.length;
                q2b[] q2bVarArr2 = new q2b[length];
                q2bVarArr2[0] = q2bVarArr[i];
                int i2 = 1;
                while (i2 < length) {
                    q2bVarArr2[i2] = q2bVarArr[i2 <= i ? i2 - 1 : i2];
                    i2++;
                }
                return q2bVarArr2;
            }
        }
        return q2bVarArr;
    }

    @Override // t2b
    public final void I1(int i) {
        super.I1(i);
        this.I3.d(false);
    }
}
