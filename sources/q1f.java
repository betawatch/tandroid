// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class q1f implements g2f {
    public final ArrayList a;

    public q1f(Context context, y0f y0fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        y0fVar.getClass();
        arrayList.add(new k3f(context, y0fVar));
    }

    @Override // g2f
    public final void a(rx rxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((g2f) obj).a(rxVar);
        }
    }
}
