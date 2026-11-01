package x4;

import v7.w7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class k extends j {
    public i0.e[] a;
    public String b;
    public int c;

    public k() {
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
        if (!w7.a(this.a, eVarArr)) {
            this.a = w7.e(eVarArr);
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

    public k(k kVar) {
        this.a = null;
        this.c = 0;
        this.b = kVar.b;
        this.a = w7.e(kVar.a);
    }
}
