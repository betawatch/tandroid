package v4;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            int i7 = this.a;
            if (i7 != aVar.a) {
                return false;
            }
            if (i7 != 8 || Math.abs(this.d - this.b) != 1 || this.d != aVar.b || this.b != aVar.d) {
                if (this.d != aVar.d || this.b != aVar.b) {
                    return false;
                }
                Object obj2 = this.c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.c)) {
                        return false;
                    }
                } else if (aVar.c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i7 = this.a;
        sb2.append(i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.b);
        sb2.append("c:");
        sb2.append(this.d);
        sb2.append(",p:");
        sb2.append(this.c);
        sb2.append("]");
        return sb2.toString();
    }
}
