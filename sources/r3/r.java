package r3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r {
    public final t a;
    public final t b;

    public r(t tVar, t tVar2) {
        this.a = tVar;
        this.b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.a.equals(rVar.a) && this.b.equals(rVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        t tVar = this.a;
        sb.append(tVar);
        t tVar2 = this.b;
        if (tVar.equals(tVar2)) {
            str = "";
        } else {
            str = ", " + tVar2;
        }
        return android.support.v4.media.a.r(sb, str, "]");
    }
}
