package qe;

import android.content.Context;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import n2.p;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public static final a b = new a();
    public final SparseArray a;

    public a() {
        this.a = new SparseArray();
    }

    public static void a(Context context, int i9, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(i9));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            while (serializedData.remaining() > 0) {
                sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
            }
            bufferedInputStream.close();
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.a.get(str.hashCode());
    }

    public a(p pVar) {
        SparseArray sparseArray = (SparseArray) pVar.b;
        this.a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
