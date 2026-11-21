package x2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class p {
    public final f3.m a;
    public wf.b d;
    public nb.a f;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public boolean e = true;
    public int g = 3;

    public p(f3.m mVar, nb.a aVar) {
        this.a = mVar;
        this.f = aVar;
    }

    public static void a(p pVar) {
        f3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.f = 1;
        }
    }

    public final f0 b(int i7) {
        g9.t tVar;
        g9.t mVar;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        HashMap hashMap2 = this.b;
        g9.t tVar2 = (g9.t) hashMap2.get(valueOf2);
        if (tVar2 == null) {
            final wf.b bVar = this.d;
            bVar.getClass();
            if (i7 != 0) {
                final int i10 = 1;
                if (i7 != 1) {
                    final int i11 = 2;
                    if (i7 != 2) {
                        final int i12 = 3;
                        if (i7 == 3) {
                            mVar = new l2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        } else {
                            if (i7 != 4) {
                                throw new IllegalArgumentException(i5.c.i(i7, "Unrecognized contentType: "));
                            }
                            mVar = new g9.t() { // from class: x2.o
                                @Override // g9.t
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
                        tVar = new g9.t() { // from class: x2.o
                            @Override // g9.t
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
                    tVar = new g9.t() { // from class: x2.o
                        @Override // g9.t
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
                tVar2 = new g9.t() { // from class: x2.o
                    @Override // g9.t
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
            hashMap2.put(Integer.valueOf(i7), tVar2);
        }
        f0 f0Var2 = (f0) tVar2.get();
        f0Var2.a(this.f);
        f0Var2.c(this.e);
        f0Var2.d(this.g);
        hashMap.put(Integer.valueOf(i7), f0Var2);
        return f0Var2;
    }
}
