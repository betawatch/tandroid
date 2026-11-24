// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sf3 extends ja {
    public final long c;

    public sf3(long j) {
        super(0, false);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf3) && this.c == ((sf3) obj).c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.c));
    }
}
