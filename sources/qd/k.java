package qd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ld.e0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class k {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((qd.q) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k d() {
        k kVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
            kVar = kVar2;
            while (true) {
                k kVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    Object obj = atomicReferenceFieldUpdater2.get(kVar);
                    if (obj == this) {
                        if (kVar2 != kVar) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar2, kVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != kVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (h()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof p) {
                        ((p) obj).a(kVar);
                        break;
                    }
                    if (!(obj instanceof q)) {
                        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        kVar3 = kVar;
                        kVar = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar = (k) atomicReferenceFieldUpdater.get(kVar);
                    }
                }
                kVar = kVar3;
            }
        }
        return kVar;
    }

    public final void e(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (h()) {
                kVar.d();
                return;
            }
            return;
        }
    }

    public final Object f() {
        while (true) {
            Object obj = a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k g() {
        k kVar;
        Object f10 = f();
        q qVar = f10 instanceof q ? (q) f10 : null;
        if (qVar != null && (kVar = qVar.a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) f10;
    }

    public boolean h() {
        return f() instanceof q;
    }

    public String toString() {
        return new j(this, e0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + e0.k(this);
    }
}
