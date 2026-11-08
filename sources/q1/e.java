package q1;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e {
    public final String a;

    public e(String name) {
        j.e(name, "name");
        this.a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return j.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
