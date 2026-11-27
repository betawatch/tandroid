// default package

import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rz {
    public static final rz d;
    public final int a;
    public final int b;
    public final bp5 c;

    static {
        rz rzVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ap5 ap5Var = new ap5(4);
            for (int i = 1; i <= 10; i++) {
                ap5Var.c(Integer.valueOf(gcc.t(i)));
            }
            rzVar = new rz(2, ap5Var.g());
        } else {
            rzVar = new rz(2, 10);
        }
        d = rzVar;
    }

    public rz(int i, Set set) {
        this.a = i;
        bp5 q = bp5.q(set);
        this.c = q;
        v9c it = q.iterator();
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
        if (!(obj instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) obj;
        return this.a == rzVar.a && this.b == rzVar.b && Objects.equals(this.c, rzVar.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        bp5 bp5Var = this.c;
        return i + (bp5Var == null ? 0 : bp5Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public rz(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
