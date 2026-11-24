// default package

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class wq6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ wq6(hs6 hs6Var, String str, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference;
        byte b = this.a;
        byte b2 = 2;
        String str = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = hs6Var.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
                    executeFast.bindString(1, str);
                    executeFast.step();
                    executeFast.dispose();
                    gm.c3(new wq6(hs6Var, str, b2));
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                hs6Var.C1.remove(str);
                hs6Var.D1.add(str);
                hs6Var.getNotificationCenter().k(nm7.n3, new Object[0]);
                break;
            case 2:
                hs6Var.C1.remove(str);
                hs6Var.D1.add(str);
                hs6Var.O(new String[]{str}, false);
                hs6Var.getNotificationCenter().k(nm7.n3, new Object[0]);
                break;
            case 3:
                hs6Var.C1.remove(str);
                hs6Var.getNotificationCenter().k(nm7.L2, str);
                break;
            case 4:
                hs6Var.T.remove(str);
                break;
            default:
                hs6 hs6Var2 = this.b;
                String str2 = this.c;
                String str3 = null;
                try {
                    SQLiteCursor queryFinalized = hs6Var2.getMessagesStorage().b.queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str2);
                    if (queryFinalized.next()) {
                        str3 = queryFinalized.stringValue(0);
                        i = queryFinalized.intValue(1);
                        try {
                            queryFinalized.longValue(2);
                        } catch (Exception e2) {
                            e = e2;
                            fc4.g(e, true);
                            String str4 = str3;
                            i2 = i;
                            boolean z = e21.a;
                            if (i2 != -1) {
                            }
                            hs6Var2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new af((Object) hs6Var2, i2, (Object) str4, (Object) str2, (byte) 5));
                        }
                    } else {
                        i = -1;
                    }
                    queryFinalized.dispose();
                } catch (Exception e3) {
                    e = e3;
                    i = -1;
                }
                String str42 = str3;
                i2 = i;
                boolean z2 = e21.a;
                if (i2 != -1) {
                    TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords = new TLRPC.TL_messages_getEmojiKeywords();
                    tL_messages_getEmojiKeywords.lang_code = str2;
                    tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywords;
                } else {
                    TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference2 = new TLRPC.TL_messages_getEmojiKeywordsDifference();
                    tL_messages_getEmojiKeywordsDifference2.lang_code = str2;
                    tL_messages_getEmojiKeywordsDifference2.from_version = i2;
                    tL_messages_getEmojiKeywordsDifference = tL_messages_getEmojiKeywordsDifference2;
                }
                hs6Var2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new af((Object) hs6Var2, i2, (Object) str42, (Object) str2, (byte) 5));
        }
    }
}
