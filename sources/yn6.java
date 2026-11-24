// default package

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yn6 {
    public final int a;
    public boolean b;
    public final String c;
    public final jo6 d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public yn6(int i, String str, jo6 jo6Var) {
        this.a = i;
        this.c = str;
        this.d = jo6Var;
    }

    public final void a(jo6 jo6Var) {
        this.e.add(jo6Var);
        this.f.put(jo6Var.C, jo6Var);
    }
}
