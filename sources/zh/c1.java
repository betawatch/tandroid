package zh;

import android.util.LongSparseArray;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class c1 {
    public static final c1[] d = new c1[4];
    public final int a;
    public final LongSparseArray b = new LongSparseArray();
    public boolean c;

    public c1(int i10) {
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
