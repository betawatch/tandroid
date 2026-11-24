// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class w0f implements o0f {
    public final ArrayList a;

    public w0f(Context context, j0f j0fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        j0fVar.getClass();
        arrayList.add(new t1f(context, j0fVar));
    }

    @Override // o0f
    public final void a(aec aecVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o0f) obj).a(aecVar);
        }
    }
}
