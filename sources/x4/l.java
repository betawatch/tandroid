package x4;

import v7.j8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class l extends k {
    public i0.e[] a;
    public String b;
    public int c;

    public l() {
        this.a = null;
        this.c = 0;
    }

    public i0.e[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!j8.a(this.a, eVarArr)) {
            this.a = j8.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10].a = eVarArr[i10].a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].b;
                if (i11 < fArr.length) {
                    eVarArr2[i10].b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.a = null;
        this.c = 0;
        this.b = lVar.b;
        this.a = j8.e(lVar.a);
    }
}
