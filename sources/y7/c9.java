package y7;

import a8.wa;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
