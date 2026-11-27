// default package

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xf8 {
    public static final ic q = new ic(2);
    public final Context a;
    public final vf8 b;
    public final SparseArray c;
    public final boolean d;
    public final pd3 e;
    public final vgb f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final vec i;
    public jq j = new jq();
    public xgb k;
    public Pair l;
    public int m;
    public byte n;
    public long o;
    public int p;

    public xf8(rm3 rm3Var) {
        this.a = (Context) rm3Var.d;
        vf8 vf8Var = (vf8) rm3Var.f;
        vf8Var.getClass();
        this.b = vf8Var;
        this.c = new SparseArray();
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        this.d = rm3Var.a;
        vgb vgbVar = (vgb) rm3Var.g;
        this.f = vgbVar;
        long j = rm3Var.c;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        vec vecVar = (vec) rm3Var.h;
        this.i = vecVar;
        this.e = new pd3((uec) rm3Var.e, vecVar, vgbVar);
        this.g = new CopyOnWriteArraySet();
        new ko4(new jo4());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = (byte) 0;
    }
}
