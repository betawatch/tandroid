// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zwe implements oxe {
    public final ArrayList a;

    public zwe(Context context, hwe hweVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        hweVar.getClass();
        arrayList.add(new tye(context, hweVar));
    }

    @Override // oxe
    public final void a(qx qxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((oxe) obj).a(qxVar);
        }
    }
}
