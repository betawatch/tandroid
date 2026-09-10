package y2;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s {
    public static final sg.p g = new sg.p(15);
    public static final sg.p h = new sg.p(16);
    public int d;
    public int e;
    public int f;
    public final r[] b = new r[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f7, int i10) {
        r rVar;
        int i11 = this.c;
        ArrayList arrayList = this.a;
        if (i11 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i12 = this.f;
        r[] rVarArr = this.b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f = i13;
            rVar = rVarArr[i13];
        } else {
            rVar = new r();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        rVar.a = i14;
        rVar.b = i10;
        rVar.c = f7;
        arrayList.add(rVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 <= 2000) {
                return;
            }
            int i16 = i15 - 2000;
            r rVar2 = (r) arrayList.get(0);
            int i17 = rVar2.b;
            if (i17 <= i16) {
                this.e -= i17;
                arrayList.remove(0);
                int i18 = this.f;
                if (i18 < 5) {
                    this.f = i18 + 1;
                    rVarArr[i18] = rVar2;
                }
            } else {
                rVar2.b = i17 - i16;
                this.e -= i16;
            }
        }
    }

    public final float b() {
        int i10 = this.c;
        ArrayList arrayList = this.a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            r rVar = (r) arrayList.get(i12);
            i11 += rVar.b;
            if (i11 >= f7) {
                return rVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) hc.b.i(1, arrayList)).c;
    }
}
