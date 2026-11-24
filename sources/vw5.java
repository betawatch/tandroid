// default package

import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class vw5 implements oq4, Serializable {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public vw5(int i) {
        this.a = i;
    }

    @Override // oq4
    public final int getArity() {
        return this.a;
    }

    public final String toString() {
        f59.a.getClass();
        return g59.a(this);
    }
}
