package w7;

import a8.ng;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
