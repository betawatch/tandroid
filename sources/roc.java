// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class roc implements wn {
    public final byte a;

    public roc(e00 e00Var) {
        this.a = e00Var.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof roc) || !vue.a(Integer.valueOf(this.a), Integer.valueOf(((roc) obj).a)) || !vue.a(1, 1) || !vue.a(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return vue.a(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
