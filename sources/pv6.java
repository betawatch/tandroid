// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pv6 implements sq4 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ su6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tv6 d;

    public pv6(tv6 tv6Var, su6 su6Var, boolean z) {
        this.d = tv6Var;
        this.b = su6Var;
        this.c = z;
    }

    @Override // sq4
    public final void k(Throwable th) {
        switch (this.a) {
            case 0:
                lad.d("MediaSessionImpl", "Failed calling onPlayRequested", th);
                break;
            default:
                if (th instanceof UnsupportedOperationException) {
                    lad.g("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    lad.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                tv6 tv6Var = this.d;
                g8c.L(tv6Var.t);
                if (this.c) {
                    tv6Var.n(this.b);
                    break;
                }
                break;
        }
    }

    @Override // sq4
    public final void onSuccess(Object obj) {
        byte b = this.a;
        tv6 tv6Var = this.d;
        boolean z = this.c;
        su6 su6Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    boolean z2 = tv6Var.t.m0(16) && tv6Var.t.u() != null;
                    boolean z3 = tv6Var.t.m0(31) || tv6Var.t.m0(20);
                    su6 q = tv6Var.q(su6Var);
                    jc8 jc8Var = new jc8();
                    jc8Var.a.b(1);
                    kc8 b2 = jc8Var.b();
                    if (!z2) {
                        if (z3) {
                            tv6Var.e.getClass();
                            zl5 b3 = jie.b(new UnsupportedOperationException());
                            b3.b(new tq4(b3, new pv6(tv6Var, q, z, b2), (byte) 0), new ge2(tv6Var, (byte) 3));
                            break;
                        } else {
                            lad.f("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                        }
                    }
                    g8c.L(tv6Var.t);
                    if (z) {
                        tv6Var.n(q);
                        break;
                    }
                }
                break;
            default:
                woe.b(tv6Var.t, (tu6) obj);
                g8c.L(tv6Var.t);
                if (z) {
                    tv6Var.n(su6Var);
                    break;
                }
                break;
        }
    }

    public pv6(tv6 tv6Var, su6 su6Var, boolean z, kc8 kc8Var) {
        this.d = tv6Var;
        this.b = su6Var;
        this.c = z;
    }
}
