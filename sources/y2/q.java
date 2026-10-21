package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.jg0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class q {
    public static final jg0 g = new jg0(27);
    public static final jg0 h = new jg0(28);
    public int d;
    public int e;
    public int f;
    public final p[] b = new p[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.c;
        ArrayList arrayList = this.a;
        if (i11 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i12 = this.f;
        p[] pVarArr = this.b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new p();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.a = i14;
        pVar.b = i10;
        pVar.c = f7;
        arrayList.add(pVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 <= 2000) {
                return;
            }
            int i16 = i15 - 2000;
            p pVar2 = (p) arrayList.get(0);
            int i17 = pVar2.b;
            if (i17 <= i16) {
                this.e -= i17;
                arrayList.remove(0);
                int i18 = this.f;
                if (i18 < 5) {
                    this.f = i18 + 1;
                    pVarArr[i18] = pVar2;
                }
            } else {
                pVar2.b = i17 - i16;
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
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.b;
            if (i11 >= f7) {
                return pVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) i2.e.h(1, arrayList)).c;
    }
}
