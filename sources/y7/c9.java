package y7;

import a8.wa;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c9 implements d9 {
    public final ArrayList a;

    public c9(Context context, b9 b9Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        b9Var.getClass();
        arrayList.add(new f9(context, b9Var));
    }

    @Override // y7.d9
    public final void a(wa waVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((d9) obj).a(waVar);
        }
    }
}
