package z7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class vf implements uf {
    public final ArrayList a;

    public vf(Context context, tf tfVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        tfVar.getClass();
        arrayList.add(new yf(context, tfVar));
    }

    @Override // z7.uf
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uf) obj).a(aVar);
        }
    }
}
