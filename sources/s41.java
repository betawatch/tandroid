// default package

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s41 implements AutoCloseable {
    public final String[] a;
    public final ArrayDeque b;

    public s41(Object obj, String str, ArrayDeque arrayDeque) {
        this.b = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new r41(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                int min = Math.min(arrayDeque.size(), 11);
                String[] strArr = this.a;
                if (strArr == null) {
                    strArr = new String[12];
                    this.a = strArr;
                }
                String str2 = strArr[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    String str3 = new String(cArr);
                    str2 = min == 11 ? str3.concat("...") : str3;
                    this.a[min] = str2;
                }
                Log.v("CarApp.Bun", str2.concat(u41.i(obj.getClass()) + " " + str));
            }
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = this.b;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i = min - 1;
            if (min <= 0) {
                break;
            }
            sb.append(((r41) descendingIterator.next()).a());
            min = i;
        }
        if (descendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.removeFirst();
    }
}
