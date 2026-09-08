package v7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class w8 implements x8 {
    public final ArrayList a;

    public w8(Context context, v8 v8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        v8Var.getClass();
        arrayList.add(new b9(context, v8Var));
    }

    @Override // v7.x8
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((x8) obj).a(aVar);
        }
    }
}
