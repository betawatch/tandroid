// default package

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class xx4 extends gg0 {
    public final Set E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xx4(int i, ey4 ey4Var, fy4 fy4Var, ntb ntbVar, Context context, Looper looper) {
        super(context, looper, r5, i, new ln8((Object) ey4Var, (byte) 26), new v39(fy4Var, (byte) 22), (String) ntbVar.e);
        j9f j9fVar;
        synchronized (j9f.g) {
            j9f j9fVar2 = j9f.h;
            if (j9fVar2 == null) {
                j9fVar2 = new j9f(context.getApplicationContext(), context.getMainLooper());
                j9f.h = j9fVar2;
            }
            j9fVar = j9fVar2;
        }
        Object obj = cy4.d;
        fre.h(ey4Var);
        fre.h(fy4Var);
        Set set = (Set) ntbVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                sc8.j("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.E = set;
    }
}
