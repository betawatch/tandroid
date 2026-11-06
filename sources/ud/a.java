package ud;

import c8.t9;
import java.util.Iterator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class a implements Iterable {
    public final char a;
    public final char b;
    public final int c = 1;

    public a(char c10, char c11) {
        this.a = c10;
        this.b = (char) t9.a(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a, this.b, this.c);
    }
}
