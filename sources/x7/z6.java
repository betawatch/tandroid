package x7;

import java.util.ArrayDeque;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class z6 {
    public static byte[] a(ArrayDeque arrayDeque, int i3) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i3) {
            return bArr;
        }
        int length = i3 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i3);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i3 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(rf.a aVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(TLObject.FLAG_13, Math.max(128, Integer.highestOneBit(0) * 2));
        int i3 = 0;
        while (i3 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i3);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = aVar.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return a(arrayDeque, i3);
                }
                i10 += read;
                i3 += read;
            }
            long j10 = min * (min < 4096 ? 4 : 2);
            min = j10 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j10 < -2147483648L ? TLObject.FLAG_31 : (int) j10;
        }
        if (aVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
