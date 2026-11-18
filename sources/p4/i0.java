package p4;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements l0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ i0(m0 m0Var, int i7, int i10) {
        this.a = i10;
        this.b = m0Var;
        this.c = i7;
    }

    @Override // p4.l0
    public final void f(v vVar) {
        int i7 = this.a;
        int i10 = 0;
        r0 = false;
        boolean z10 = false;
        i10 = 0;
        i10 = 0;
        int i11 = this.c;
        m0 m0Var = this.b;
        switch (i7) {
            case 0:
                i1 i1Var = m0Var.h.t;
                int i12 = n.a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 == 1) {
                        i10 = 1;
                    } else if (i11 == 2 || i11 == 3) {
                        i10 = 2;
                    } else {
                        h2.a.l("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i11 + " was converted to `Player.REPEAT_MODE_OFF`");
                    }
                }
                i1Var.k(i10);
                return;
            default:
                i1 i1Var2 = m0Var.h.t;
                int i13 = n.a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalArgumentException(i5.c.i(i11, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                i1Var2.x(z10);
                return;
        }
    }
}
