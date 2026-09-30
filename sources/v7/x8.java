package v7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class x8 implements y8 {
    public final ArrayList a;

    public x8(Context context, w8 w8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        w8Var.getClass();
        arrayList.add(new c9(context, w8Var));
    }

    @Override // v7.y8
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((y8) obj).a(aVar);
        }
    }
}
