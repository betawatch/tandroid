package x7;

import android.content.Context;
import b8.kg;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z8 implements a9 {
    public final ArrayList a;

    public z8(Context context, y8 y8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        y8Var.getClass();
        arrayList.add(new c9(context, y8Var));
    }

    @Override // x7.a9
    public final void a(kg kgVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((a9) obj).a(kgVar);
        }
    }
}
