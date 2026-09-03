package r3;

import b4.a0;
import b4.f0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.cl0;
import q5.c0;
import s8.i0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i {
    public static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final c0 c = new c0(new cl0(24));
    public static final c0 d = new c0(new cl0(25));
    public i0 a;

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new b4.a());
                break;
            case 1:
                arrayList.add(new b4.c());
                break;
            case 2:
                arrayList.add(new b4.d(1));
                break;
            case 3:
                arrayList.add(new s3.a(1));
                break;
            case 4:
                k I = c.I(0);
                if (I == null) {
                    arrayList.add(new u3.a());
                    break;
                } else {
                    arrayList.add(I);
                    break;
                }
            case 5:
                arrayList.add(new v3.b());
                break;
            case 6:
                arrayList.add(new x3.d(0));
                break;
            case 7:
                arrayList.add(new y3.e(1));
                break;
            case 8:
                arrayList.add(new z3.i(0, null, Collections.EMPTY_LIST, null));
                arrayList.add(new z3.l(0));
                break;
            case 9:
                arrayList.add(new a4.e());
                break;
            case 10:
                arrayList.add(new a0());
                break;
            case 11:
                if (this.a == null) {
                    s8.t tVar = s8.v.b;
                    this.a = i0.e;
                }
                arrayList.add(new f0(1, new h5.c0(0L), new b4.f(0, this.a)));
                break;
            case 12:
                c4.d dVar = new c4.d();
                dVar.c = 0;
                dVar.d = -1L;
                dVar.f = -1;
                dVar.g = -1L;
                arrayList.add(dVar);
                break;
            case 14:
                arrayList.add(new w3.a());
                break;
            case 15:
                k I2 = d.I(new Object[0]);
                if (I2 != null) {
                    arrayList.add(I2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new t3.b());
                break;
        }
    }
}
