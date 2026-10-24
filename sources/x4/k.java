package x4;

import v7.x7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class k extends j {
    public i0.d[] a;
    public String b;
    public int c;

    public k() {
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
        if (!x7.a(this.a, dVarArr)) {
            this.a = x7.e(dVarArr);
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

    public k(k kVar) {
        this.a = null;
        this.c = 0;
        this.b = kVar.b;
        this.a = x7.e(kVar.a);
    }
}
