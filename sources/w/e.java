package w;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e implements AutoCloseable {
    public final String[] a;
    public final ArrayDeque b;

    public e(Object obj, String str, ArrayDeque arrayDeque) {
        this.b = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new d(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                StringBuilder sb = new StringBuilder();
                int min = Math.min(arrayDeque.size(), 11);
                if (this.a == null) {
                    this.a = new String[12];
                }
                String str2 = this.a[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    String str3 = new String(cArr);
                    str2 = min == 11 ? str3.concat("...") : str3;
                    this.a[min] = str2;
                }
                sb.append(str2);
                sb.append(g.i(obj.getClass()) + " " + str);
                Log.v("CarApp.Bun", sb.toString());
            }
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = this.b;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i10 = min - 1;
            if (min <= 0) {
                break;
            }
            sb.append(((d) descendingIterator.next()).a());
            min = i10;
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
