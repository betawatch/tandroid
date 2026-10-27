package w8;

import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o implements com.google.android.gms.common.api.b {
    public final int a;

    public o(ag.j jVar) {
        this.a = jVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !o6.l.l(Integer.valueOf(this.a), Integer.valueOf(((o) obj).a)) || !o6.l.l(1, 1) || !o6.l.l(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return o6.l.l(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
