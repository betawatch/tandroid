// default package

import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class tp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet c;

    public /* synthetic */ tp6(hs6 hs6Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                hs6Var.N.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                hs6Var.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
                break;
            case 1:
                hs6Var.N.k(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                hs6Var.getNotificationCenter().k(65, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
                break;
            case 2:
                vh6 vh6Var = hs6Var.I[4];
                for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i);
                    vh6Var.k(document, document.id);
                }
                break;
            case 3:
                try {
                    SQLitePreparedStatement executeFast = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindString(1, "s_" + tL_messages_stickerSet.set.id);
                    executeFast.bindInteger(2, 6);
                    executeFast.bindString(3, "");
                    executeFast.bindString(4, "");
                    executeFast.bindString(5, "");
                    executeFast.bindInteger(6, 0);
                    executeFast.bindInteger(7, 0);
                    executeFast.bindInteger(8, 0);
                    executeFast.bindInteger(9, 0);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                    tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(10, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    executeFast.dispose();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            default:
                try {
                    SQLitePreparedStatement executeFast2 = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                    tL_messages_stickerSet.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindLong(1, tL_messages_stickerSet.set.id);
                    executeFast2.bindByteBuffer(2, nativeByteBuffer2);
                    executeFast2.bindInteger(3, tL_messages_stickerSet.set.hash);
                    executeFast2.bindLong(4, System.currentTimeMillis());
                    String str = tL_messages_stickerSet.set.short_name;
                    executeFast2.bindString(5, str != null ? str.toLowerCase() : "");
                    executeFast2.step();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
