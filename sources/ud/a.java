package ud;

import java.util.Iterator;
import w7.x;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class a implements Iterable {
    public final char a;
    public final char b;
    public final int c = 1;

    public a(char c10, char c11) {
        this.a = c10;
        this.b = (char) x.a(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a, this.b, this.c);
    }
}
