package zh;

import android.util.LongSparseArray;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class u0 {
    public static final u0[] d = new u0[4];
    public final int a;
    public final LongSparseArray b = new LongSparseArray();
    public boolean c;

    public u0(int i10) {
        this.a = i10;
    }

    public static byte[] b(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void a(long j10, TLRPC.ShareTheme shareTheme) {
        this.b.put(j10, shareTheme);
        int i10 = this.a;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            this.c = true;
            byte[] b10 = b(shareTheme);
            if (b10 != null) {
                MessagesController.getMainSettings(i10).edit().putString("qrShareTheme", Utilities.bytesToHex(b10)).apply();
            }
        }
    }
}
