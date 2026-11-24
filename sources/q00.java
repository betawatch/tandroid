// default package

import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q00 {
    public static final q00 d;
    public final int a;
    public final int b;
    public final yo5 c;

    static {
        q00 q00Var;
        if (Build.VERSION.SDK_INT >= 33) {
            xo5 xo5Var = new xo5(4);
            for (int i = 1; i <= 10; i++) {
                xo5Var.c(Integer.valueOf(hac.t(i)));
            }
            q00Var = new q00(2, xo5Var.g());
        } else {
            q00Var = new q00(2, 10);
        }
        d = q00Var;
    }

    public q00(int i, Set set) {
        this.a = i;
        yo5 q = yo5.q(set);
        this.c = q;
        v7c it = q.iterator();
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
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return this.a == q00Var.a && this.b == q00Var.b && Objects.equals(this.c, q00Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        yo5 yo5Var = this.c;
        return i + (yo5Var == null ? 0 : yo5Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public q00(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
