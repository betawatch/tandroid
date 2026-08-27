package re;

import android.content.Context;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import n2.b0;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public a(b0 b0Var) {
        SparseArray sparseArray = (SparseArray) b0Var.b;
        this.a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
