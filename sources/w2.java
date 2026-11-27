// default package

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class w2 implements Iterator {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;

    public w2(Object[] objArr) {
        this.a = (byte) 1;
        objArr.getClass();
        this.c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (this.b < ((z2) obj).h()) {
                    break;
                }
                break;
            case 1:
                if (this.b < ((Object[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.b < ((gy) obj).a) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    lq5.n();
                    return null;
                }
                int i = this.b;
                this.b = i + 1;
                return ((z2) obj).get(i);
            case 1:
                try {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                gy gyVar = (gy) obj;
                String[] strArr = gyVar.c;
                int i3 = this.b;
                String str = strArr[i3];
                String str2 = gyVar.b[i3];
                if (str == null) {
                    str = "";
                }
                fy fyVar = new fy();
                if (str2 == null) {
                    lq5.j("Object must not be null");
                    return null;
                }
                fyVar.a = str2.trim();
                if (str2.length() == 0) {
                    lq5.j("String must not be empty");
                    return null;
                }
                fyVar.b = str;
                fyVar.c = gyVar;
                this.b++;
                return fyVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                gy gyVar = (gy) this.c;
                int i = this.b;
                int i2 = i - 1;
                this.b = i2;
                int i3 = gyVar.a;
                if (i2 >= i3) {
                    lq5.j("Must be false");
                    return;
                }
                int i4 = (i3 - i2) - 1;
                if (i4 > 0) {
                    String[] strArr = gyVar.b;
                    System.arraycopy(strArr, i, strArr, i2, i4);
                    String[] strArr2 = gyVar.c;
                    System.arraycopy(strArr2, i, strArr2, i2, i4);
                }
                int i5 = gyVar.a - 1;
                gyVar.a = i5;
                gyVar.b[i5] = null;
                gyVar.c[i5] = null;
                return;
        }
    }

    public w2(z2 z2Var) {
        this.a = (byte) 0;
        this.c = z2Var;
    }

    public w2(gy gyVar) {
        this.a = (byte) 2;
        this.c = gyVar;
        this.b = 0;
    }
}
