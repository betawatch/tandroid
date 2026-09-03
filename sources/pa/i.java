package pa;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class i {
    public final l i() {
        if (this instanceof l) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            xa.b bVar = new xa.b(stringWriter);
            bVar.n = 1;
            ra.d.l(this, bVar);
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
