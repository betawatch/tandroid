package x2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class p {
    public final f3.m a;
    public j2.n d;
    public w7.s f;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public boolean e = true;
    public int g = 3;

    public p(f3.m mVar, w7.s sVar) {
        this.a = mVar;
        this.f = sVar;
    }

    public static void a(p pVar) {
        f3.m mVar = pVar.a;
        synchronized (mVar) {
            mVar.f = 1;
        }
    }

    public final f0 b(int i7) {
        g9.u uVar;
        g9.u mVar;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        HashMap hashMap2 = this.b;
        g9.u uVar2 = (g9.u) hashMap2.get(valueOf2);
        if (uVar2 == null) {
            final j2.n nVar = this.d;
            nVar.getClass();
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
                                throw new IllegalArgumentException(jg.g.j(i7, "Unrecognized contentType: "));
                            }
                            mVar = new g9.u() { // from class: x2.o
                                @Override // g9.u
                                public final Object get() {
                                    switch (i12) {
                                        case 0:
                                            return q.e((Class) this, nVar);
                                        case 1:
                                            return q.e((Class) this, nVar);
                                        case 2:
                                            return q.e((Class) this, nVar);
                                        default:
                                            return new x0(nVar, ((p) this).a);
                                    }
                                }
                            };
                        }
                        uVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        uVar = new g9.u() { // from class: x2.o
                            @Override // g9.u
                            public final Object get() {
                                switch (i11) {
                                    case 0:
                                        return q.e((Class) asSubclass, nVar);
                                    case 1:
                                        return q.e((Class) asSubclass, nVar);
                                    case 2:
                                        return q.e((Class) asSubclass, nVar);
                                    default:
                                        return new x0(nVar, ((p) asSubclass).a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.class);
                    uVar = new g9.u() { // from class: x2.o
                        @Override // g9.u
                        public final Object get() {
                            switch (i10) {
                                case 0:
                                    return q.e((Class) asSubclass2, nVar);
                                case 1:
                                    return q.e((Class) asSubclass2, nVar);
                                case 2:
                                    return q.e((Class) asSubclass2, nVar);
                                default:
                                    return new x0(nVar, ((p) asSubclass2).a);
                            }
                        }
                    };
                }
                uVar2 = uVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(f0.class);
                final int i13 = 0;
                uVar2 = new g9.u() { // from class: x2.o
                    @Override // g9.u
                    public final Object get() {
                        switch (i13) {
                            case 0:
                                return q.e((Class) asSubclass3, nVar);
                            case 1:
                                return q.e((Class) asSubclass3, nVar);
                            case 2:
                                return q.e((Class) asSubclass3, nVar);
                            default:
                                return new x0(nVar, ((p) asSubclass3).a);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i7), uVar2);
        }
        f0 f0Var2 = (f0) uVar2.get();
        f0Var2.a(this.f);
        f0Var2.c(this.e);
        f0Var2.d(this.g);
        hashMap.put(Integer.valueOf(i7), f0Var2);
        return f0Var2;
    }
}
