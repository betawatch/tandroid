package u2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class p {
    public final c3.m a;
    public rf.b d;
    public qb.a f;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public boolean e = true;
    public int g = 3;

    public p(c3.m mVar, qb.a aVar) {
        this.a = mVar;
        this.f = aVar;
    }

    public static void a(p pVar) {
        c3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.f = 1;
        }
    }

    public final f0 b(int i10) {
        e9.t tVar;
        e9.t nVar;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        HashMap hashMap2 = this.b;
        e9.t tVar2 = (e9.t) hashMap2.get(valueOf2);
        if (tVar2 == null) {
            final rf.b bVar = this.d;
            bVar.getClass();
            if (i10 != 0) {
                final int i11 = 1;
                if (i10 != 1) {
                    final int i12 = 2;
                    if (i10 != 2) {
                        final int i13 = 3;
                        if (i10 == 3) {
                            nVar = new i2.n(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        } else {
                            if (i10 != 4) {
                                throw new IllegalArgumentException(ic.a.i(i10, "Unrecognized contentType: "));
                            }
                            nVar = new e9.t() { // from class: u2.o
                                @Override // e9.t
                                public final Object get() {
                                    switch (i13) {
                                        case 0:
                                            return q.e((Class) this, bVar);
                                        case 1:
                                            return q.e((Class) this, bVar);
                                        case 2:
                                            return q.e((Class) this, bVar);
                                        default:
                                            return new x0(bVar, ((p) this).a);
                                    }
                                }
                            };
                        }
                        tVar2 = nVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        tVar = new e9.t() { // from class: u2.o
                            @Override // e9.t
                            public final Object get() {
                                switch (i12) {
                                    case 0:
                                        return q.e((Class) asSubclass, bVar);
                                    case 1:
                                        return q.e((Class) asSubclass, bVar);
                                    case 2:
                                        return q.e((Class) asSubclass, bVar);
                                    default:
                                        return new x0(bVar, ((p) asSubclass).a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.class);
                    tVar = new e9.t() { // from class: u2.o
                        @Override // e9.t
                        public final Object get() {
                            switch (i11) {
                                case 0:
                                    return q.e((Class) asSubclass2, bVar);
                                case 1:
                                    return q.e((Class) asSubclass2, bVar);
                                case 2:
                                    return q.e((Class) asSubclass2, bVar);
                                default:
                                    return new x0(bVar, ((p) asSubclass2).a);
                            }
                        }
                    };
                }
                tVar2 = tVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(f0.class);
                final int i14 = 0;
                tVar2 = new e9.t() { // from class: u2.o
                    @Override // e9.t
                    public final Object get() {
                        switch (i14) {
                            case 0:
                                return q.e((Class) asSubclass3, bVar);
                            case 1:
                                return q.e((Class) asSubclass3, bVar);
                            case 2:
                                return q.e((Class) asSubclass3, bVar);
                            default:
                                return new x0(bVar, ((p) asSubclass3).a);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i10), tVar2);
        }
        f0 f0Var2 = (f0) tVar2.get();
        f0Var2.b(this.f);
        f0Var2.c(this.e);
        f0Var2.d(this.g);
        hashMap.put(Integer.valueOf(i10), f0Var2);
        return f0Var2;
    }
}
