// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class x26 implements Iterator {
    public final CharSequence a;
    public byte b;
    public int c;
    public int d;
    public int e;

    public x26(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        byte b = this.b;
        if (b != 0) {
            return b == 1;
        }
        if (this.e < 0) {
            this.b = (byte) 2;
            return false;
        }
        CharSequence charSequence = this.a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i3 = this.c; i3 < length2; i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i3 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i3;
                this.b = (byte) 1;
                this.e = i;
                this.d = length;
                return true;
            }
        }
        i = -1;
        this.b = (byte) 1;
        this.e = i;
        this.d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            w26.g();
            return null;
        }
        this.b = (byte) 0;
        int i = this.d;
        int i2 = this.c;
        this.c = this.e + i;
        return this.a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
