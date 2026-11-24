// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class px6 implements ts4 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ sw6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tx6 d;

    public px6(tx6 tx6Var, sw6 sw6Var, boolean z) {
        this.d = tx6Var;
        this.b = sw6Var;
        this.c = z;
    }

    @Override // ts4
    public final void j(Throwable th) {
        switch (this.a) {
            case 0:
                ncd.d("MediaSessionImpl", "Failed calling onPlayRequested", th);
                break;
            default:
                if (th instanceof UnsupportedOperationException) {
                    ncd.g("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    ncd.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                tx6 tx6Var = this.d;
                hac.L(tx6Var.t);
                if (this.c) {
                    tx6Var.n(this.b);
                    break;
                }
                break;
        }
    }

    @Override // ts4
    public final void onSuccess(Object obj) {
        byte b = this.a;
        tx6 tx6Var = this.d;
        boolean z = this.c;
        sw6 sw6Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    boolean z2 = tx6Var.t.m0(16) && tx6Var.t.u() != null;
                    boolean z3 = tx6Var.t.m0(31) || tx6Var.t.m0(20);
                    sw6 q = tx6Var.q(sw6Var);
                    me8 me8Var = new me8();
                    me8Var.a.b(1);
                    ne8 b2 = me8Var.b();
                    if (!z2) {
                        if (z3) {
                            tx6Var.e.getClass();
                            zn5 b3 = kke.b(new UnsupportedOperationException());
                            b3.b(new us4(b3, new px6(tx6Var, q, z, b2), (byte) 0), new rf2(tx6Var, (byte) 3));
                            break;
                        } else {
                            ncd.f("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                        }
                    }
                    hac.L(tx6Var.t);
                    if (z) {
                        tx6Var.n(q);
                        break;
                    }
                }
                break;
            default:
                zqe.b(tx6Var.t, (tw6) obj);
                hac.L(tx6Var.t);
                if (z) {
                    tx6Var.n(sw6Var);
                    break;
                }
                break;
        }
    }

    public px6(tx6 tx6Var, sw6 sw6Var, boolean z, ne8 ne8Var) {
        this.d = tx6Var;
        this.b = sw6Var;
        this.c = z;
    }
}
