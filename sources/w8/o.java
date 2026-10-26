package w8;

import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
