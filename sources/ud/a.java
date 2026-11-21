package ud;

import c8.u9;
import java.util.Iterator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class a implements Iterable {
    public final char a;
    public final char b;
    public final int c = 1;

    public a(char c10, char c11) {
        this.a = c10;
        this.b = (char) u9.a(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a, this.b, this.c);
    }
}
