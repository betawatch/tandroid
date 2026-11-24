// default package

import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qz {
    public static final qz d;
    public final int a;
    public final int b;
    public final ym5 c;

    static {
        qz qzVar;
        if (Build.VERSION.SDK_INT >= 33) {
            xm5 xm5Var = new xm5(4);
            for (int i = 1; i <= 10; i++) {
                xm5Var.c(Integer.valueOf(g8c.t(i)));
            }
            qzVar = new qz(2, xm5Var.g());
        } else {
            qzVar = new qz(2, 10);
        }
        d = qzVar;
    }

    public qz(int i, Set set) {
        this.a = i;
        ym5 q = ym5.q(set);
        this.c = q;
        v5c it = q.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return this.a == qzVar.a && this.b == qzVar.b && Objects.equals(this.c, qzVar.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        ym5 ym5Var = this.c;
        return i + (ym5Var == null ? 0 : ym5Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public qz(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
