package v7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
