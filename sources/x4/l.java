package x4;

import v7.g8;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public abstract class l extends k {
    public i0.d[] a;
    public String b;
    public int c;

    public l() {
        this.a = null;
        this.c = 0;
    }

    public i0.d[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.a, dVarArr)) {
            this.a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].a = dVarArr[i10].a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.a = null;
        this.c = 0;
        this.b = lVar.b;
        this.a = g8.e(lVar.a);
    }
}
