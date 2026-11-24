// default package

import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
