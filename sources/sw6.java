// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class sw6 {
    public final long a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof sw6) && this.a == ((sw6) obj).a && vue.a(null, null);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0, Boolean.FALSE, null});
    }
}
