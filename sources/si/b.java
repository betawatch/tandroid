package si;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class b {
    public static SparseIntArray b;
    public static final b c = new b();
    public final SparseArray a;

    public b() {
        this.a = new SparseArray();
    }

    public static SparseArray a(Context context, String str, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            int readInt32 = serializedData.readInt32(true);
            int i7 = 0;
            if (sparseArray == null) {
                sparseArray = new SparseArray(readInt32);
                while (i7 < readInt32) {
                    sparseArray.append(serializedData.readInt32(true), serializedData.readString(true));
                    i7++;
                }
            } else {
                while (i7 < readInt32) {
                    sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
                    i7++;
                }
            }
            bufferedInputStream.close();
            return sparseArray;
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.a.get(str.hashCode());
    }

    public final String c(int i7, Context context, String str) {
        String b10 = str != null ? b(str) : null;
        if (b10 != null || i7 == 0) {
            return b10;
        }
        if (context != null && i7 != 0) {
            if (b == null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().getAssets().open("string_resource_ids.bin"));
                    try {
                        SerializedData serializedData = new SerializedData(bufferedInputStream);
                        int readInt32 = serializedData.readInt32(true);
                        SparseIntArray sparseIntArray = new SparseIntArray(readInt32);
                        for (int i10 = 0; i10 < readInt32; i10++) {
                            sparseIntArray.append(serializedData.readInt32(true), serializedData.readInt32(true));
                        }
                        bufferedInputStream.close();
                        b = sparseIntArray;
                    } finally {
                    }
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
            int i11 = b.get(i7);
            if (i11 != 0) {
                return (String) this.a.get(i11);
            }
        }
        return null;
    }

    public b(a aVar) {
        SparseArray sparseArray = aVar.a;
        this.a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
