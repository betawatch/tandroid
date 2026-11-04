package w2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p {
    public final e3.m a;
    public tf.b d;
    public mb.b f;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public boolean e = true;
    public int g = 3;

    public p(e3.m mVar, mb.b bVar) {
        this.a = mVar;
        this.f = bVar;
    }

    public static void a(p pVar) {
        e3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.f = 1;
        }
    }

    public final f0 b(int i3) {
        f9.t tVar;
        f9.t mVar;
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = this.c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i3);
        HashMap hashMap2 = this.b;
        f9.t tVar2 = (f9.t) hashMap2.get(valueOf2);
        if (tVar2 == null) {
            final tf.b bVar = this.d;
            bVar.getClass();
            if (i3 != 0) {
                final int i10 = 1;
                if (i3 != 1) {
                    final int i11 = 2;
                    if (i3 != 2) {
                        final int i12 = 3;
                        if (i3 == 3) {
                            mVar = new k2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        } else {
                            if (i3 != 4) {
                                throw new IllegalArgumentException(k2.p1.i(i3, "Unrecognized contentType: "));
                            }
                            mVar = new f9.t() { // from class: w2.o
                                @Override // f9.t
                                public final Object get() {
                                    switch (i12) {
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
                        tVar = new f9.t() { // from class: w2.o
                            @Override // f9.t
                            public final Object get() {
                                switch (i11) {
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
                    tVar = new f9.t() { // from class: w2.o
                        @Override // f9.t
                        public final Object get() {
                            switch (i10) {
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
                final int i13 = 0;
                tVar2 = new f9.t() { // from class: w2.o
                    @Override // f9.t
                    public final Object get() {
                        switch (i13) {
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
            hashMap2.put(Integer.valueOf(i3), tVar2);
        }
        f0 f0Var2 = (f0) tVar2.get();
        f0Var2.a(this.f);
        f0Var2.b(this.e);
        f0Var2.d(this.g);
        hashMap.put(Integer.valueOf(i3), f0Var2);
        return f0Var2;
    }
}
