package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import yh.t3;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class d {
    public static final d[] f = new d[4];
    public final int a;
    public TLRPC.TL_shareThemeBackdrops b;
    public boolean c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public d(int i10) {
        this.a = i10;
        String string = MessagesController.getMainSettings(i10).getString("qrBackdrops", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                this.b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
            }
            serializedData.cleanup();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void a(Runnable runnable) {
        if (this.d) {
            runnable.run();
            return;
        }
        this.e.add(runnable);
        if (this.c) {
            return;
        }
        this.c = true;
        TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = this.b;
        tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.hash : 0;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new org.telegram.messenger.a(), new t3(this, 2));
    }
}
