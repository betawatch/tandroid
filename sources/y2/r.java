package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class r {
    public static final f11 g = new f11(20);
    public static final f11 h = new f11(21);
    public int d;
    public int e;
    public int f;
    public final q[] b = new q[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f7, int i10) {
        q qVar;
        int i11 = this.c;
        ArrayList arrayList = this.a;
        if (i11 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i12 = this.f;
        q[] qVarArr = this.b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f = i13;
            qVar = qVarArr[i13];
        } else {
            qVar = new q();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        qVar.a = i14;
        qVar.b = i10;
        qVar.c = f7;
        arrayList.add(qVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 <= 2000) {
                return;
            }
            int i16 = i15 - 2000;
            q qVar2 = (q) arrayList.get(0);
            int i17 = qVar2.b;
            if (i17 <= i16) {
                this.e -= i17;
                arrayList.remove(0);
                int i18 = this.f;
                if (i18 < 5) {
                    this.f = i18 + 1;
                    qVarArr[i18] = qVar2;
                }
            } else {
                qVar2.b = i17 - i16;
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
            q qVar = (q) arrayList.get(i12);
            i11 += qVar.b;
            if (i11 >= f7) {
                return qVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) i2.g.h(1, arrayList)).c;
    }
}
