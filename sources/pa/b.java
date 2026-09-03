package pa;

import j$.util.Objects;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public final Field a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.a = field;
    }

    public final String toString() {
        return this.a.toString();
    }
}
