package ve;

import android.content.Context;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import org.telegram.tgnet.SerializedData;
import ph.j5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a {
    public static final a b = new a();
    public final SparseArray a;

    public a() {
        this.a = new SparseArray();
    }

    public static SparseArray a(Context context, int i10, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(i10));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            int readInt32 = serializedData.readInt32(true);
            int i11 = 0;
            if (sparseArray == null) {
                sparseArray = new SparseArray(readInt32);
                while (i11 < readInt32) {
                    sparseArray.append(serializedData.readInt32(true), serializedData.readString(true));
                    i11++;
                }
            } else {
                while (i11 < readInt32) {
                    sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
                    i11++;
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

    public a(j5 j5Var) {
        SparseArray sparseArray = (SparseArray) j5Var.b;
        this.a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
