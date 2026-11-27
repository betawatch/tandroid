// default package

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wea {
    public jx8 a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public wea(jx8 jx8Var) {
        this.a = jx8Var;
    }

    public static wea a(int i, SerializedData serializedData) {
        long j;
        long j2;
        m66 a = jx8.a();
        String readString = serializedData.readString(false);
        if (readString == null) {
            readString = "";
        }
        a.c = readString;
        a.b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a.e = readString3;
        String readString4 = serializedData.readString(false);
        a.f = readString4 != null ? readString4 : "";
        if (i >= 2) {
            j = serializedData.readInt64(false);
            j2 = serializedData.readInt64(false);
        } else {
            j = 0;
            j2 = 0;
        }
        if (i >= 3) {
            a.o(jx8.f(serializedData.readInt32(false)));
        } else {
            a.o(TextUtils.isEmpty(readString4) ? 1 : 2);
        }
        wea weaVar = new wea(a.c());
        weaVar.e = j2;
        weaVar.b = j;
        weaVar.d = j > 0;
        return weaVar;
    }
}
