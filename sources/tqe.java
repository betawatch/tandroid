// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tqe {
    public final jqe a;
    public final Integer b;

    public /* synthetic */ tqe(v8b v8bVar) {
        this.a = (jqe) v8bVar.b;
        this.b = (Integer) v8bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tqe)) {
            return false;
        }
        tqe tqeVar = (tqe) obj;
        return cqe.a(this.a, tqeVar.a) && cqe.a(this.b, tqeVar.b) && cqe.a(null, null) && cqe.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
