// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zc7 {
    public long a;
    public long b;

    public static zc7 a(long j, long j2) {
        zc7 zc7Var = new zc7();
        zc7Var.a = j;
        zc7Var.b = j2;
        return zc7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zc7.class == obj.getClass()) {
            zc7 zc7Var = (zc7) obj;
            if (this.a == zc7Var.a && this.b == zc7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        return "TopicKey{dialogId=" + this.a + ", topicId=" + this.b + '}';
    }
}
