package y7;

import a8.ng;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class aa implements ba {
    public final ArrayList a;

    public aa(Context context, z9 z9Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        z9Var.getClass();
        arrayList.add(new da(context, z9Var));
    }

    @Override // y7.ba
    public final void a(ng ngVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ba) obj).a(ngVar);
        }
    }
}
