package qi;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class l {
    public final ji.l a;
    public final long b;

    public l(n nVar, ji.l lVar) {
        long length;
        this.a = lVar;
        long length2 = ((nVar.b.length() + nVar.a.length()) * 2) + 128;
        s0 s0Var = (s0) lVar.b;
        if (s0Var == null) {
            length = 1024;
        } else {
            length = (((int[]) s0Var.b) == null ? 0L : ((int[]) s0Var.b).length * 4) + (((int[]) s0Var.c).length * 4) + 64;
        }
        this.b = length2 + length;
    }
}
