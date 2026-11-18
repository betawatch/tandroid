package qi;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
