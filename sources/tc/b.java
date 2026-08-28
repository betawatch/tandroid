package tc;

import aa.d;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import pc.c;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends c implements a, Serializable {
    public final Enum[] a;

    public b(Enum[] entries) {
        i.e(entries, "entries");
        this.a = entries;
    }

    @Override // pc.c, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        Enum[] enumArr = this.a;
        i.e(enumArr, "<this>");
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i9 < 0 || i9 >= length) {
            throw new IndexOutOfBoundsException(d.k(i9, length, "index: ", ", size: "));
        }
        return enumArr[i9];
    }

    @Override // pc.c
    public final int i() {
        return this.a.length;
    }

    @Override // pc.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        Enum[] enumArr = this.a;
        i.e(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42) {
            return ordinal;
        }
        return -1;
    }

    @Override // pc.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
