package x4;

import v7.g8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        if (!g8.a(this.a, eVarArr)) {
            this.a = g8.e(eVarArr);
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
        this.a = g8.e(lVar.a);
    }
}
