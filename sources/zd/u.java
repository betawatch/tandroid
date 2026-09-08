package zd;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u {
    public final Object a;
    public final k b;
    public final rd.l c;
    public final Object d;
    public final Throwable e;

    public u(Object obj, k kVar, rd.l lVar, Object obj2, Throwable th2) {
        this.a = obj;
        this.b = kVar;
        this.c = lVar;
        this.d = obj2;
        this.e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i10) {
        Object obj = uVar.a;
        if ((i10 & 2) != 0) {
            kVar = uVar.b;
        }
        k kVar2 = kVar;
        rd.l lVar = uVar.c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
            th2 = uVar.e;
        }
        return new u(obj, kVar2, lVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.i.a(this.a, uVar.a) && kotlin.jvm.internal.i.a(this.b, uVar.b) && kotlin.jvm.internal.i.a(this.c, uVar.c) && kotlin.jvm.internal.i.a(this.d, uVar.d) && kotlin.jvm.internal.i.a(this.e, uVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        rd.l lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ u(Object obj, k kVar, rd.l lVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
