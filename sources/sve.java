// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class sve {
    public static final void a(int i, int i2, o8a o8aVar) {
        o8aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = i2 & (~i);
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(o8aVar.g(i4));
            }
            i3 >>>= 1;
        }
        throw new jg7(o8aVar.a(), arrayList);
    }
}
