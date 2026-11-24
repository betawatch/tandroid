// default package

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class xl6 {
    public final int a;
    public boolean b;
    public final String c;
    public final jm6 d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public xl6(int i, String str, jm6 jm6Var) {
        this.a = i;
        this.c = str;
        this.d = jm6Var;
    }

    public final void a(jm6 jm6Var) {
        this.e.add(jm6Var);
        this.f.put(jm6Var.C, jm6Var);
    }
}
