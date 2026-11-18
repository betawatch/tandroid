package qi;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class l {
    public final ji.j a;
    public final long b;

    public l(n nVar, ji.j jVar) {
        long length;
        this.a = jVar;
        long length2 = ((nVar.b.length() + nVar.a.length()) * 2) + 128;
        s0 s0Var = (s0) jVar.b;
        if (s0Var == null) {
            length = 1024;
        } else {
            length = (((int[]) s0Var.b) == null ? 0L : ((int[]) s0Var.b).length * 4) + (((int[]) s0Var.c).length * 4) + 64;
        }
        this.b = length2 + length;
    }
}
