// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ux6 implements ws4 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ xw6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yx6 d;

    public ux6(yx6 yx6Var, xw6 xw6Var, boolean z) {
        this.d = yx6Var;
        this.b = xw6Var;
        this.c = z;
    }

    @Override // ws4
    public final void k(Throwable th) {
        switch (this.a) {
            case 0:
                efd.d("MediaSessionImpl", "Failed calling onPlayRequested", th);
                break;
            default:
                if (th instanceof UnsupportedOperationException) {
                    efd.g("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    efd.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                yx6 yx6Var = this.d;
                gcc.L(yx6Var.t);
                if (this.c) {
                    yx6Var.n(this.b);
                    break;
                }
                break;
        }
    }

    @Override // ws4
    public final void onSuccess(Object obj) {
        byte b = this.a;
        yx6 yx6Var = this.d;
        boolean z = this.c;
        xw6 xw6Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    boolean z2 = yx6Var.t.m0(16) && yx6Var.t.u() != null;
                    boolean z3 = yx6Var.t.m0(31) || yx6Var.t.m0(20);
                    xw6 q = yx6Var.q(xw6Var);
                    yf8 yf8Var = new yf8();
                    yf8Var.a.b(1);
                    zf8 b2 = yf8Var.b();
                    if (!z2) {
                        if (z3) {
                            yx6Var.e.getClass();
                            co5 b3 = fne.b(new UnsupportedOperationException());
                            b3.b(new xs4(b3, new ux6(yx6Var, q, z, b2), (byte) 0), new pe2(yx6Var, (byte) 3));
                            break;
                        } else {
                            efd.f("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                        }
                    }
                    gcc.L(yx6Var.t);
                    if (z) {
                        yx6Var.n(q);
                        break;
                    }
                }
                break;
            default:
                ote.b(yx6Var.t, (yw6) obj);
                gcc.L(yx6Var.t);
                if (z) {
                    yx6Var.n(xw6Var);
                    break;
                }
                break;
        }
    }

    public ux6(yx6 yx6Var, xw6 xw6Var, boolean z, zf8 zf8Var) {
        this.d = yx6Var;
        this.b = xw6Var;
        this.c = z;
    }
}
