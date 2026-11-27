// default package

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class u68 extends s29 {
    public static final String c;
    public final float b;

    static {
        String str = gcc.a;
        c = "1";
    }

    public u68(float f) {
        yve.e("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }

    @Override // s29
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // s29
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(s29.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u68) {
            return this.b == ((u68) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public u68() {
        this.b = -1.0f;
    }
}
