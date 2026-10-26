package y4;

import a8.rc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        if (!rc.a(this.a, dVarArr)) {
            this.a = rc.e(dVarArr);
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
        this.a = rc.e(kVar.a);
    }
}
