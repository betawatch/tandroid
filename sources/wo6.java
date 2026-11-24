// default package

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class wo6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ wo6(hq6 hq6Var, String str, byte b) {
        this.a = b;
        this.b = hq6Var;
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
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
                    executeFast.bindString(1, str);
                    executeFast.step();
                    executeFast.dispose();
                    gl.c3(new wo6(hq6Var, str, b2));
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                hq6Var.C1.remove(str);
                hq6Var.D1.add(str);
                hq6Var.getNotificationCenter().k(kk7.m3, new Object[0]);
                break;
            case 2:
                hq6Var.C1.remove(str);
                hq6Var.D1.add(str);
                hq6Var.O(new String[]{str}, false);
                hq6Var.getNotificationCenter().k(kk7.m3, new Object[0]);
                break;
            case 3:
                hq6Var.C1.remove(str);
                hq6Var.getNotificationCenter().k(kk7.K2, str);
                break;
            case 4:
                hq6Var.T.remove(str);
                break;
            default:
                hq6 hq6Var2 = this.b;
                String str2 = this.c;
                String str3 = null;
                try {
                    SQLiteCursor queryFinalized = hq6Var2.getMessagesStorage().b.queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str2);
                    if (queryFinalized.next()) {
                        str3 = queryFinalized.stringValue(0);
                        i = queryFinalized.intValue(1);
                        try {
                            queryFinalized.longValue(2);
                        } catch (Exception e2) {
                            e = e2;
                            fa4.g(e, true);
                            String str4 = str3;
                            i2 = i;
                            boolean z = w01.a;
                            if (i2 != -1) {
                            }
                            hq6Var2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new ae((Object) hq6Var2, i2, (Object) str4, (Object) str2, (byte) 5));
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
                boolean z2 = w01.a;
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
                hq6Var2.getConnectionsManager().sendRequest(tL_messages_getEmojiKeywordsDifference, new ae((Object) hq6Var2, i2, (Object) str42, (Object) str2, (byte) 5));
        }
    }
}
