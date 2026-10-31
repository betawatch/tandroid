package u2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p {
    public final c3.m a;
    public hf.b d;
    public t7.u f;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public boolean e = true;
    public int g = 3;

    public p(c3.m mVar, t7.u uVar) {
        this.a = mVar;
        this.f = uVar;
    }

    public static void a(p pVar) {
        c3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.f = 1;
        }
    }

    public final f0 b(int i10) {
        d9.t tVar;
        d9.t mVar;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        HashMap hashMap2 = this.b;
        d9.t tVar2 = (d9.t) hashMap2.get(valueOf2);
        if (tVar2 == null) {
            final hf.b bVar = this.d;
            bVar.getClass();
            if (i10 != 0) {
                final int i11 = 1;
                if (i10 != 1) {
                    final int i12 = 2;
                    if (i10 != 2) {
                        final int i13 = 3;
                        if (i10 == 3) {
                            mVar = new i2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        } else {
                            if (i10 != 4) {
                                throw new IllegalArgumentException(i0.a.i(i10, "Unrecognized contentType: "));
                            }
                            mVar = new d9.t() { // from class: u2.o
                                @Override // d9.t
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
                        tVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        tVar = new d9.t() { // from class: u2.o
                            @Override // d9.t
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
                    tVar = new d9.t() { // from class: u2.o
                        @Override // d9.t
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
                tVar2 = new d9.t() { // from class: u2.o
                    @Override // d9.t
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
        f0Var2.d(this.f);
        f0Var2.b(this.e);
        f0Var2.c(this.g);
        hashMap.put(Integer.valueOf(i10), f0Var2);
        return f0Var2;
    }
}
