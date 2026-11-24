// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rya extends t61 {
    @Override // t61
    public final void e(int i, Object obj, i8c i8cVar) {
        ad7.Y(i).a.c(new t79(i, obj, i8cVar, (byte) 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t61
    public final void f(int i, Object obj, long j, s61 s61Var) {
        TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups;
        Integer num = (Integer) obj;
        byte b = 2;
        if (num.intValue() == 1) {
            TLRPC.TL_messages_getEmojiStatusGroups tL_messages_getEmojiStatusGroups = new TLRPC.TL_messages_getEmojiStatusGroups();
            tL_messages_getEmojiStatusGroups.hash = (int) j;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStatusGroups;
        } else if (num.intValue() == 2) {
            TLRPC.TL_messages_getEmojiProfilePhotoGroups tL_messages_getEmojiProfilePhotoGroups = new TLRPC.TL_messages_getEmojiProfilePhotoGroups();
            tL_messages_getEmojiProfilePhotoGroups.hash = (int) j;
            tL_messages_getEmojiGroups = tL_messages_getEmojiProfilePhotoGroups;
        } else if (num.intValue() == 3) {
            TLRPC.TL_messages_getEmojiStickerGroups tL_messages_getEmojiStickerGroups = new TLRPC.TL_messages_getEmojiStickerGroups();
            tL_messages_getEmojiStickerGroups.hash = (int) j;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStickerGroups;
        } else {
            TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups2 = new TLRPC.TL_messages_getEmojiGroups();
            tL_messages_getEmojiGroups2.hash = (int) j;
            tL_messages_getEmojiGroups = tL_messages_getEmojiGroups2;
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getEmojiGroups, new k97(s61Var, b));
    }

    @Override // t61
    public final void g(int i, Object obj, Object obj2) {
        ad7.Y(i).a.c(new t79(i, obj2, obj, (byte) 16));
    }
}
