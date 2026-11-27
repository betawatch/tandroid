// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
