package v7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
