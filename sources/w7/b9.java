package w7;

import a8.ng;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b9 implements c9 {
    public final ArrayList a;

    public b9(Context context, a9 a9Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        a9Var.getClass();
        arrayList.add(new e9(context, a9Var));
    }

    @Override // w7.c9
    public final void a(ng ngVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((c9) obj).a(ngVar);
        }
    }
}
