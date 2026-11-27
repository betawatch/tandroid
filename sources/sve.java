// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
        throw new ig7(o8aVar.a(), arrayList);
    }
}
