package zd;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u extends ae.b implements s, b, ae.g {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    public u(Object obj) {
        this._state$volatile = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:15:0x00c4, B:17:0x00cc, B:20:0x00d3, B:21:0x00d7, B:25:0x00da, B:27:0x00fb, B:30:0x010b, B:31:0x0127, B:37:0x0137, B:33:0x012e, B:36:0x0134, B:46:0x00e0, B:49:0x00e7, B:57:0x0052, B:59:0x005d, B:60:0x00b5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:15:0x00c4, B:17:0x00cc, B:20:0x00d3, B:21:0x00d7, B:25:0x00da, B:27:0x00fb, B:30:0x010b, B:31:0x0127, B:37:0x0137, B:33:0x012e, B:36:0x0134, B:46:0x00e0, B:49:0x00e7, B:57:0x0052, B:59:0x005d, B:60:0x00b5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010a -> B:15:0x00c4). Please report as a decompilation issue!!! */
    @Override // zd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object U(zd.c r18, hd.c r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.u.U(zd.c, hd.c):java.lang.Object");
    }

    @Override // zd.c
    public final Object b(Object obj, fd.c cVar) {
        if (obj == null) {
            obj = ae.i.a;
        }
        c(null, obj);
        return dd.k.a;
    }

    public final boolean c(Object obj, Object obj2) {
        int i3;
        w[] wVarArr;
        be.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.j.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.d;
            if ((i10 & 1) != 0) {
                this.d = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.d = i11;
            w[] wVarArr2 = this.a;
            while (true) {
                if (wVarArr2 != null) {
                    for (w wVar : wVarArr2) {
                        if (wVar != null) {
                            AtomicReference atomicReference = wVar.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (tVar = v.b)) {
                                    be.t tVar2 = v.a;
                                    if (obj4 != tVar2) {
                                        while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((wd.m) obj4).resumeWith(dd.k.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, tVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.d;
                    if (i3 == i11) {
                        this.d = i11 + 1;
                        return true;
                    }
                    wVarArr = this.a;
                }
                wVarArr2 = wVarArr;
                i11 = i3;
            }
        }
    }

    @Override // ae.g
    public final b h(fd.h hVar, int i3, yd.a aVar) {
        return ((((i3 < 0 || i3 >= 2) && i3 != -2) || aVar != yd.a.b) && !((i3 == 0 || i3 == -3) && aVar == yd.a.a)) ? new ae.e(this, hVar, i3, aVar, 0) : this;
    }
}
