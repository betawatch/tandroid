// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class r2b extends b71 {
    @Override // b71
    public final void e(int i, Object obj, icc iccVar) {
        jf7.Y(i).a.c(new a39(i, obj, iccVar, (byte) 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b71
    public final void f(int i, Object obj, long j, a71 a71Var) {
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
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getEmojiGroups, new rb7(a71Var, b));
    }

    @Override // b71
    public final void g(int i, Object obj, Object obj2) {
        jf7.Y(i).a.c(new a39(i, obj2, obj, (byte) 17));
    }
}
