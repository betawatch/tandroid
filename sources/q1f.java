// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
