// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class zx6 implements ky6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ly6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zx6(ly6 ly6Var, int i, byte b) {
        this.a = b;
        this.b = ly6Var;
        this.c = i;
    }

    @Override // ky6
    public final void a(sw6 sw6Var) {
        byte b = this.a;
        int i = 0;
        r0 = false;
        boolean z = false;
        i = 0;
        i = 0;
        int i2 = this.c;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                tx6 tx6Var = ly6Var.j;
                tx6Var.t();
                cf8 cf8Var = tx6Var.t;
                int i3 = j26.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 == 1) {
                        i = 1;
                    } else if (i2 == 2 || i2 == 3) {
                        i = 2;
                    } else {
                        ncd.f("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i2 + " was converted to `Player.REPEAT_MODE_OFF`");
                    }
                }
                cf8Var.n0(i);
                break;
            default:
                tx6 tx6Var2 = ly6Var.j;
                tx6Var2.t();
                cf8 cf8Var2 = tx6Var2.t;
                int i4 = j26.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        u36.j(hg9.j(i2, "Unrecognized ShuffleMode: "));
                        break;
                    } else {
                        z = true;
                    }
                }
                cf8Var2.v(z);
                break;
        }
    }
}
