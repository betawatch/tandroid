package z4;

import b8.rc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            dVarArr2[i3].a = dVarArr[i3].a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVarArr[i3].b;
                if (i10 < fArr.length) {
                    dVarArr2[i3].b[i10] = fArr[i10];
                    i10++;
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
