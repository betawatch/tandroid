package te;

import android.content.Context;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import o4.g;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public static final a b = new a();
    public final SparseArray a;

    public a() {
        this.a = new SparseArray();
    }

    public static void a(Context context, int i10, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(i10));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            while (serializedData.remaining() > 0) {
                sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
            }
            bufferedInputStream.close();
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

    public a(g gVar) {
        SparseArray sparseArray = (SparseArray) gVar.b;
        this.a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
