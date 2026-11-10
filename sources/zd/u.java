package zd;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class u {
    public final Object a;
    public final k b;
    public final rd.q c;
    public final Object d;
    public final Throwable e;

    public u(Object obj, k kVar, rd.q qVar, Object obj2, Throwable th2) {
        this.a = obj;
        this.b = kVar;
        this.c = qVar;
        this.d = obj2;
        this.e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i7) {
        Object obj = uVar.a;
        if ((i7 & 2) != 0) {
            kVar = uVar.b;
        }
        k kVar2 = kVar;
        rd.q qVar = uVar.c;
        Object obj2 = uVar.d;
        if ((i7 & 16) != 0) {
            th2 = uVar.e;
        }
        return new u(obj, kVar2, qVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.j.a(this.a, uVar.a) && kotlin.jvm.internal.j.a(this.b, uVar.b) && kotlin.jvm.internal.j.a(this.c, uVar.c) && kotlin.jvm.internal.j.a(this.d, uVar.d) && kotlin.jvm.internal.j.a(this.e, uVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        rd.q qVar = this.c;
        int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ u(Object obj, k kVar, rd.q qVar, Throwable th2, int i7) {
        this(obj, (i7 & 2) != 0 ? null : kVar, (i7 & 4) != 0 ? null : qVar, (Object) null, (i7 & 16) != 0 ? null : th2);
    }
}
