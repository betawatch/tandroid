// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class y97 {
    public long a;
    public long b;
    public byte[] c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof y97)) {
            return false;
        }
        y97 y97Var = (y97) obj;
        return this.a == y97Var.a && this.b == y97Var.b && Arrays.equals(this.c, y97Var.c);
    }
}
