package u2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class q {
    public final c3.o a;
    public qf.b d;
    public t7.u f;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public boolean e = true;
    public int g = 3;

    public q(c3.o oVar, t7.u uVar) {
        this.a = oVar;
        this.f = uVar;
    }

    public static void a(q qVar) {
        c3.o oVar = qVar.a;
        synchronized (oVar) {
            oVar.f = 1;
        }
    }

    public final g0 b(int i10) {
        d9.u uVar;
        d9.u nVar;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.c;
        g0 g0Var = (g0) hashMap.get(valueOf);
        if (g0Var != null) {
            return g0Var;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        HashMap hashMap2 = this.b;
        d9.u uVar2 = (d9.u) hashMap2.get(valueOf2);
        if (uVar2 == null) {
            final qf.b bVar = this.d;
            bVar.getClass();
            if (i10 != 0) {
                final int i11 = 1;
                if (i10 != 1) {
                    final int i12 = 2;
                    if (i10 != 2) {
                        final int i13 = 3;
                        if (i10 == 3) {
                            nVar = new i2.n(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(g0.class), 3);
                        } else {
                            if (i10 != 4) {
                                throw new IllegalArgumentException(i2.o1.k(i10, "Unrecognized contentType: "));
                            }
                            nVar = new d9.u() { // from class: u2.p
                                @Override // d9.u
                                public final Object get() {
                                    switch (i13) {
                                        case 0:
                                            return r.e((Class) this, bVar);
                                        case 1:
                                            return r.e((Class) this, bVar);
                                        case 2:
                                            return r.e((Class) this, bVar);
                                        default:
                                            return new z0(bVar, ((q) this).a);
                                    }
                                }
                            };
                        }
                        uVar2 = nVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(g0.class);
                        uVar = new d9.u() { // from class: u2.p
                            @Override // d9.u
                            public final Object get() {
                                switch (i12) {
                                    case 0:
                                        return r.e((Class) asSubclass, bVar);
                                    case 1:
                                        return r.e((Class) asSubclass, bVar);
                                    case 2:
                                        return r.e((Class) asSubclass, bVar);
                                    default:
                                        return new z0(bVar, ((q) asSubclass).a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(g0.class);
                    uVar = new d9.u() { // from class: u2.p
                        @Override // d9.u
                        public final Object get() {
                            switch (i11) {
                                case 0:
                                    return r.e((Class) asSubclass2, bVar);
                                case 1:
                                    return r.e((Class) asSubclass2, bVar);
                                case 2:
                                    return r.e((Class) asSubclass2, bVar);
                                default:
                                    return new z0(bVar, ((q) asSubclass2).a);
                            }
                        }
                    };
                }
                uVar2 = uVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(g0.class);
                final int i14 = 0;
                uVar2 = new d9.u() { // from class: u2.p
                    @Override // d9.u
                    public final Object get() {
                        switch (i14) {
                            case 0:
                                return r.e((Class) asSubclass3, bVar);
                            case 1:
                                return r.e((Class) asSubclass3, bVar);
                            case 2:
                                return r.e((Class) asSubclass3, bVar);
                            default:
                                return new z0(bVar, ((q) asSubclass3).a);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i10), uVar2);
        }
        g0 g0Var2 = (g0) uVar2.get();
        g0Var2.d(this.f);
        g0Var2.b(this.e);
        g0Var2.c(this.g);
        hashMap.put(Integer.valueOf(i10), g0Var2);
        return g0Var2;
    }
}
