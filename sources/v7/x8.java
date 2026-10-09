package v7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class x8 implements y8 {
    public final ArrayList a;

    public x8(Context context, w8 w8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        w8Var.getClass();
        arrayList.add(new b9(context, w8Var));
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
