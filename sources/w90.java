// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w90 {
    public final String a;
    public final ArrayList b;

    public w90(String str, ArrayList arrayList) {
        if (str == null) {
            p3d.h("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w90)) {
            return false;
        }
        w90 w90Var = (w90) obj;
        return this.a.equals(w90Var.a) && this.b.equals(w90Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
