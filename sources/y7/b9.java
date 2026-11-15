package y7;

import a8.xa;
import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b9 implements c9 {
    public final ArrayList a;

    public b9(Context context, a9 a9Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        a9Var.getClass();
        arrayList.add(new e9(context, a9Var));
    }

    @Override // y7.c9
    public final void a(xa xaVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((c9) obj).a(xaVar);
        }
    }
}
