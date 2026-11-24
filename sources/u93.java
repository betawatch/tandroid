// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class u93 {
    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.executeFast(str).stepThis().dispose();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public static boolean b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(kt6.o("PRAGMA table_info(", str, ")"), new Object[0]);
        while (queryFinalized.next()) {
            try {
                if (str2.equals(queryFinalized.stringValue(1))) {
                    return true;
                }
            } finally {
                queryFinalized.dispose();
            }
        }
        return false;
    }

    public static int c(cf7 cf7Var, SQLiteDatabase sQLiteDatabase, int i) {
        char c;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        int i2;
        int i3;
        NativeByteBuffer nativeByteBuffer;
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        SQLiteCursor sQLiteCursor5;
        SQLiteCursor sQLiteCursor6;
        SQLiteCursor sQLiteCursor7;
        SQLiteCursor sQLiteCursor8;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        mp3 mp3Var = cf7Var.a;
        byte b = 0;
        int i4 = 4;
        int i5 = i;
        if (i5 < 4) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS user_photos(uid INTEGER, id INTEGER, data BLOB, PRIMARY KEY (uid, id))", "DROP INDEX IF EXISTS read_state_out_idx_messages;", "DROP INDEX IF EXISTS ttl_idx_messages;", "DROP INDEX IF EXISTS date_idx_messages;");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages ON messages(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages ON messages(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages ON messages(uid, date, mid);", "CREATE TABLE IF NOT EXISTS user_contacts_v6(uid INTEGER PRIMARY KEY, fname TEXT, sname TEXT)");
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS user_phones_v6(uid INTEGER, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (uid, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v6(sphone, deleted);", "CREATE INDEX IF NOT EXISTS mid_idx_randoms ON randoms(mid);", "CREATE TABLE IF NOT EXISTS sent_files_v2(uid TEXT, type INTEGER, data BLOB, PRIMARY KEY (uid, type))");
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, PRIMARY KEY (uid, type));", "CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);", "CREATE TABLE IF NOT EXISTS dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);", "CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);");
            sQLiteDatabase2.executeFast("UPDATE messages SET send_state = 2 WHERE mid < 0 AND send_state = 1").stepThis().dispose();
            mp3Var.c(new xd7(cf7Var, b));
            sQLiteDatabase2.executeFast("PRAGMA user_version = 4").stepThis().dispose();
            i5 = 4;
        }
        int i6 = 2;
        int i7 = 1;
        if (i5 == 4) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v2(mid INTEGER PRIMARY KEY, date INTEGER)").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v2 ON enc_tasks_v2(date);").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT date, data FROM enc_tasks WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast = sQLiteDatabase2.executeFast("REPLACE INTO enc_tasks_v2 VALUES(?, ?)");
            if (queryFinalized.next()) {
                int intValue = queryFinalized.intValue(0);
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    int limit = byteBufferValue.limit();
                    for (int i8 = 0; i8 < limit / 4; i8++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, byteBufferValue.readInt32(false));
                        executeFast.bindInteger(2, intValue);
                        executeFast.step();
                    }
                    byteBufferValue.reuse();
                }
            }
            executeFast.dispose();
            queryFinalized.dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS enc_tasks;").stepThis().dispose();
            ts2.y(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN media INTEGER default 0", "PRAGMA user_version = 6");
            i5 = 6;
        }
        if (i5 == 6) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);", "CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);", "ALTER TABLE enc_chats ADD COLUMN layer INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN seq_in INTEGER default 0");
            ts2.y(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN seq_out INTEGER default 0", "PRAGMA user_version = 7");
            i5 = 7;
        }
        if (i5 == 7 || i5 == 8 || i5 == 9) {
            ts2.A(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN use_count INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN exchange_id INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN key_date INTEGER default 0", "ALTER TABLE enc_chats ADD COLUMN fprint INTEGER default 0");
            ts2.z(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN fauthkey BLOB default NULL", "ALTER TABLE enc_chats ADD COLUMN khash BLOB default NULL", "PRAGMA user_version = 10");
            i5 = 10;
        }
        if (i5 == 10) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, PRIMARY KEY (id, type));", "PRAGMA user_version = 11");
            i5 = 11;
        }
        if (i5 == 11 || i5 == 12) {
            ts2.A(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_idx_media;", "DROP INDEX IF EXISTS mid_idx_media;", "DROP INDEX IF EXISTS uid_date_mid_idx_media;", "DROP TABLE IF EXISTS media;");
            ts2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS media_counts;", "CREATE TABLE IF NOT EXISTS media_v2(mid INTEGER PRIMARY KEY, uid INTEGER, date INTEGER, type INTEGER, data BLOB)", "CREATE TABLE IF NOT EXISTS media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, PRIMARY KEY(uid, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media ON media_v2(uid, mid, type, date);");
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS keyvalue(id TEXT PRIMARY KEY, value TEXT)", "PRAGMA user_version = 13");
            i5 = 13;
        }
        if (i5 == 13) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN replydata BLOB default NULL", "PRAGMA user_version = 14");
            i5 = 14;
        }
        if (i5 == 14) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);", "PRAGMA user_version = 15");
            i5 = 15;
        }
        if (i5 == 15) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS webpage_pending(id INTEGER, mid INTEGER, PRIMARY KEY (id, mid));", "PRAGMA user_version = 16");
            i5 = 16;
        }
        if (i5 == 16) {
            ts2.z(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN inbox_max INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN outbox_max INTEGER default 0", "PRAGMA user_version = 17");
            i5 = 17;
        }
        if (i5 == 17) {
            ts2.x(sQLiteDatabase2, "PRAGMA user_version = 18");
            i5 = 18;
        }
        if (i5 == 18) {
            ts2.z(sQLiteDatabase2, "DROP TABLE IF EXISTS stickers;", "CREATE TABLE IF NOT EXISTS stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);", "PRAGMA user_version = 19");
            i5 = 19;
        }
        if (i5 == 19) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid ON bot_keyboard(mid);", "PRAGMA user_version = 20");
            i5 = 20;
        }
        if (i5 == 20) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);", "PRAGMA user_version = 21");
            i5 = 21;
        }
        if (i5 == 21) {
            ts2.x(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB)");
            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid, participants FROM chat_settings WHERE uid < 0", new Object[0]);
            SQLitePreparedStatement executeFast2 = sQLiteDatabase2.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?)");
            while (queryFinalized2.next()) {
                long intValue2 = queryFinalized2.intValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(1);
                if (byteBufferValue2 != null) {
                    TLRPC.ChatParticipants TLdeserialize = TLRPC.ChatParticipants.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                    byteBufferValue2.reuse();
                    if (TLdeserialize != null) {
                        TLRPC.TL_chatFull tL_chatFull = new TLRPC.TL_chatFull();
                        tL_chatFull.id = intValue2;
                        tL_chatFull.chat_photo = new TLRPC.TL_photoEmpty();
                        tL_chatFull.notify_settings = new TLRPC.TL_peerNotifySettingsEmpty_layer77();
                        tL_chatFull.exported_invite = null;
                        tL_chatFull.participants = TLdeserialize;
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_chatFull.getObjectSize());
                        tL_chatFull.serializeToStream(nativeByteBuffer2);
                        executeFast2.requery();
                        executeFast2.bindLong(1, intValue2);
                        executeFast2.bindByteBuffer(2, nativeByteBuffer2);
                        executeFast2.step();
                        nativeByteBuffer2.reuse();
                    }
                }
            }
            executeFast2.dispose();
            queryFinalized2.dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS chat_settings;").stepThis().dispose();
            sQLiteDatabase2.executeFast("ALTER TABLE dialogs ADD COLUMN last_mid_i INTEGER default 0").stepThis().dispose();
            ts2.A(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN unread_count_i INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN pts INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN date_i INTEGER default 0", "CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);", "ALTER TABLE messages ADD COLUMN imp INTEGER default 0", "CREATE TABLE IF NOT EXISTS messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes(uid, end);");
            ts2.x(sQLiteDatabase2, "PRAGMA user_version = 22");
            i5 = 22;
        }
        if (i5 == 22) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);", "PRAGMA user_version = 23");
            i5 = 23;
        }
        if (i5 == 23 || i5 == 24) {
            ts2.y(sQLiteDatabase2, "DELETE FROM media_holes_v2 WHERE uid != 0 AND type >= 0 AND start IN (0, 1)", "PRAGMA user_version = 25");
            i5 = 25;
        }
        if (i5 == 25 || i5 == 26) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))", "PRAGMA user_version = 27");
            i5 = 27;
        }
        if (i5 == 27) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE web_recent_v3 ADD COLUMN document BLOB default NULL", "PRAGMA user_version = 28");
            i5 = 28;
        }
        if (i5 == 28 || i5 == 29) {
            ts2.z(sQLiteDatabase2, "DELETE FROM sent_files_v2 WHERE 1", "DELETE FROM download_queue WHERE 1", "PRAGMA user_version = 30");
            i5 = 30;
        }
        if (i5 == 30) {
            ts2.A(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN pinned INTEGER default 0", "CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;", "CREATE TABLE IF NOT EXISTS users_data(uid INTEGER PRIMARY KEY, about TEXT)", "PRAGMA user_version = 31");
            i5 = 31;
        }
        char c2 = ' ';
        if (i5 == 31) {
            ts2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS bot_recent;", "CREATE TABLE IF NOT EXISTS chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))", "CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);", "PRAGMA user_version = 32");
            i5 = 32;
        }
        if (i5 == 32) {
            ts2.z(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_idx_imp_messages;", "DROP INDEX IF EXISTS uid_date_mid_imp_idx_messages;", "PRAGMA user_version = 33");
            i5 = 33;
        }
        if (i5 == 33) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS pending_tasks(id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 34");
            i5 = 34;
        }
        if (i5 == 34) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER);", "PRAGMA user_version = 35");
            i5 = 35;
        }
        if (i5 == 35) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));", "PRAGMA user_version = 36");
            i5 = 36;
        }
        if (i5 == 36) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN in_seq_no INTEGER default 0", "PRAGMA user_version = 37");
            i5 = 37;
        }
        if (i5 == 37) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)", "CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);", "PRAGMA user_version = 38");
            i5 = 38;
        }
        if (i5 == 38) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN pinned INTEGER default 0", "PRAGMA user_version = 39");
            i5 = 39;
        }
        if (i5 == 39) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN admin_id INTEGER default 0", "PRAGMA user_version = 40");
            i5 = 40;
        }
        if (i5 == 40) {
            mp3Var.c(new xd7(cf7Var, b));
            sQLiteDatabase2.executeFast("PRAGMA user_version = 41").stepThis().dispose();
            i5 = 41;
        }
        if (i5 == 41) {
            ts2.A(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN mention INTEGER default 0", "ALTER TABLE user_contacts_v6 ADD COLUMN imported INTEGER default 0", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages ON messages(uid, mention, read_state);", "PRAGMA user_version = 42");
            i5 = 42;
        }
        if (i5 == 42) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB);", "PRAGMA user_version = 43");
            i5 = 43;
        }
        if (i5 == 43) {
            ts2.x(sQLiteDatabase2, "PRAGMA user_version = 44");
            i5 = 44;
        }
        if (i5 == 44) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)", "CREATE TABLE IF NOT EXISTS user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);", "PRAGMA user_version = 45");
            i5 = 45;
        }
        if (i5 == 45) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE enc_chats ADD COLUMN mtproto_seq INTEGER default 0", "PRAGMA user_version = 46");
            i5 = 46;
        }
        if (i5 == 46) {
            ts2.y(sQLiteDatabase2, "DELETE FROM botcache WHERE 1", "PRAGMA user_version = 47");
            i5 = 47;
        }
        if (i5 == 47) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN flags INTEGER default 0", "PRAGMA user_version = 48");
            i5 = 48;
        }
        if (i5 == 48) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, PRIMARY KEY(uid, mid))", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);", "PRAGMA user_version = 49");
            i5 = 49;
        }
        if (i5 == 49) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)", "CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;", "PRAGMA user_version = 50");
            i5 = 50;
        }
        if (i5 == 50) {
            ts2.A(sQLiteDatabase2, "DELETE FROM sent_files_v2 WHERE 1", "ALTER TABLE sent_files_v2 ADD COLUMN parent TEXT", "DELETE FROM download_queue WHERE 1", "ALTER TABLE download_queue ADD COLUMN parent TEXT");
            ts2.x(sQLiteDatabase2, "PRAGMA user_version = 51");
            i5 = 51;
        }
        if (i5 == 51) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE media_counts_v2 ADD COLUMN old INTEGER", "PRAGMA user_version = 52");
            i5 = 52;
        }
        if (i5 == 52) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));", "CREATE INDEX IF NOT EXISTS polls_id ON polls_v2(id);", "PRAGMA user_version = 53");
            i5 = 53;
        }
        if (i5 == 53) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN online INTEGER default 0", "PRAGMA user_version = 54");
            i5 = 54;
        }
        if (i5 == 54) {
            ts2.y(sQLiteDatabase2, "DROP TABLE IF EXISTS wallpapers;", "PRAGMA user_version = 55");
            i5 = 55;
        }
        if (i5 == 55) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)", "CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);", "PRAGMA user_version = 56");
            i5 = 56;
        }
        if (i5 == 56 || i5 == 57) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));", "CREATE TABLE IF NOT EXISTS emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER);", "PRAGMA user_version = 58");
            i5 = 58;
        }
        if (i5 == 58) {
            ts2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);", "ALTER TABLE emoji_keywords_info_v2 ADD COLUMN date INTEGER default 0", "PRAGMA user_version = 59");
            i5 = 59;
        }
        if (i5 == 59) {
            ts2.A(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN folder_id INTEGER default 0", "ALTER TABLE dialogs ADD COLUMN data BLOB default NULL", "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON dialogs(folder_id);", "PRAGMA user_version = 60");
            i5 = 60;
        }
        if (i5 == 60) {
            ts2.z(sQLiteDatabase2, "DROP TABLE IF EXISTS channel_admins;", "DROP TABLE IF EXISTS blocked_users;", "PRAGMA user_version = 61");
            i5 = 61;
        }
        if (i5 == 61) {
            ts2.z(sQLiteDatabase2, "DROP INDEX IF EXISTS send_state_idx_messages;", "CREATE INDEX IF NOT EXISTS send_state_idx_messages2 ON messages(mid, send_state, date);", "PRAGMA user_version = 62");
            i5 = 62;
        }
        if (i5 == 62) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS scheduled_messages(mid INTEGER PRIMARY KEY, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB)", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages ON scheduled_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages ON scheduled_messages(uid, date);", "PRAGMA user_version = 63");
            i5 = 63;
        }
        if (i5 == 63) {
            ts2.y(sQLiteDatabase2, "DELETE FROM download_queue WHERE 1", "PRAGMA user_version = 64");
            i5 = 64;
        }
        if (i5 == 64) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT)", "CREATE TABLE IF NOT EXISTS dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))", "PRAGMA user_version = 65");
            i5 = 65;
        }
        if (i5 == 65) {
            ts2.y(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON dialogs(flags);", "PRAGMA user_version = 66");
            i5 = 66;
        }
        if (i5 == 66) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))", "PRAGMA user_version = 67");
            i5 = 67;
        }
        if (i5 == 67) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);", "PRAGMA user_version = 68");
            i5 = 68;
        }
        if (i5 == 68) {
            a(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN forwards INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 69").stepThis().dispose();
            i5 = 69;
        }
        if (i5 == 69) {
            a(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN replies_data BLOB default NULL");
            a(sQLiteDatabase2, "ALTER TABLE messages ADD COLUMN thread_reply_id INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 70").stepThis().dispose();
            i5 = 70;
        }
        if (i5 == 70) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));", "PRAGMA user_version = 71");
            i5 = 71;
        }
        if (i5 == 71) {
            a(sQLiteDatabase2, "ALTER TABLE sharing_locations ADD COLUMN proximity INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 72").stepThis().dispose();
            i5 = 72;
        }
        if (i5 == 72) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);", "PRAGMA user_version = 73");
            i5 = 73;
        }
        if (i5 == 73) {
            a(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN inviter INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 74").stepThis().dispose();
            i5 = 74;
        }
        if (i5 == 74) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));", "CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);", "PRAGMA user_version = 75");
            i5 = 75;
        }
        if (i5 == 75) {
            a(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN links INTEGER default 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 76").stepThis().dispose();
            i5 = 76;
        }
        if (i5 == 76) {
            a(sQLiteDatabase2, "ALTER TABLE enc_tasks_v2 ADD COLUMN media INTEGER default -1");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 77").stepThis().dispose();
            i5 = 77;
        }
        if (i5 == 77) {
            ts2.z(sQLiteDatabase2, "DROP TABLE IF EXISTS channel_admins_v2;", "CREATE TABLE IF NOT EXISTS channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))", "PRAGMA user_version = 78");
            i5 = 78;
        }
        if (i5 == 78) {
            ts2.z(sQLiteDatabase2, "DROP TABLE IF EXISTS bot_info;", "CREATE TABLE IF NOT EXISTS bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))", "PRAGMA user_version = 79");
            i5 = 79;
        }
        int i9 = 3;
        if (i5 == 79) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS enc_tasks_v3(mid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, media))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v3 ON enc_tasks_v3(date);").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            SQLiteCursor queryFinalized3 = sQLiteDatabase2.queryFinalized("SELECT mid, date, media FROM enc_tasks_v2 WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast3 = sQLiteDatabase2.executeFast("REPLACE INTO enc_tasks_v3 VALUES(?, ?, ?)");
            if (queryFinalized3.next()) {
                long longValue = queryFinalized3.longValue(0);
                int intValue3 = queryFinalized3.intValue(1);
                int intValue4 = queryFinalized3.intValue(2);
                executeFast3.requery();
                executeFast3.bindLong(1, longValue);
                executeFast3.bindInteger(2, intValue3);
                executeFast3.bindInteger(3, intValue4);
                executeFast3.step();
            }
            executeFast3.dispose();
            queryFinalized3.dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS date_idx_enc_tasks_v2;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS enc_tasks_v2;").stepThis().dispose();
            ts2.x(sQLiteDatabase2, "PRAGMA user_version = 80");
            i5 = 80;
        }
        int i10 = 5;
        if (i5 == 80) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);");
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS bot_keyboard_idx_mid;").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor8 = sQLiteDatabase2.queryFinalized("SELECT mid, uid, send_state, date, data, ttl, replydata FROM scheduled_messages_v2 WHERE 1", new Object[0]);
            } catch (Exception e) {
                fc4.f(e);
                sQLiteCursor8 = null;
            }
            if (sQLiteCursor8 != null) {
                SQLitePreparedStatement executeFast4 = sQLiteDatabase2.executeFast("REPLACE INTO scheduled_messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                while (sQLiteCursor8.next()) {
                    NativeByteBuffer byteBufferValue3 = sQLiteCursor8.byteBufferValue(i4);
                    if (byteBufferValue3 != null) {
                        int intValue5 = sQLiteCursor8.intValue(b);
                        long longValue2 = sQLiteCursor8.longValue(1);
                        char c3 = c2;
                        int intValue6 = sQLiteCursor8.intValue(2);
                        int intValue7 = sQLiteCursor8.intValue(i9);
                        int intValue8 = sQLiteCursor8.intValue(i10);
                        NativeByteBuffer byteBufferValue4 = sQLiteCursor8.byteBufferValue(6);
                        executeFast4.requery();
                        executeFast4.bindInteger(1, intValue5);
                        executeFast4.bindLong(2, longValue2);
                        executeFast4.bindInteger(3, intValue6);
                        executeFast4.bindByteBuffer(4, byteBufferValue3);
                        executeFast4.bindInteger(5, intValue7);
                        executeFast4.bindInteger(6, intValue8);
                        if (byteBufferValue4 != null) {
                            executeFast4.bindByteBuffer(7, byteBufferValue4);
                        } else {
                            executeFast4.bindNull(7);
                        }
                        executeFast4.step();
                        if (byteBufferValue4 != null) {
                            byteBufferValue4.reuse();
                        }
                        byteBufferValue3.reuse();
                        c2 = c3;
                        b = 0;
                        i4 = 4;
                        i9 = 3;
                        i10 = 5;
                    }
                }
                c = c2;
                sQLiteCursor8.dispose();
                executeFast4.dispose();
            } else {
                c = ' ';
            }
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS send_state_idx_scheduled_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_date_idx_scheduled_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS scheduled_messages;").stepThis().dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 81").stepThis().dispose();
            i5 = 81;
        } else {
            c = ' ';
        }
        if (i5 == 81) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS media_v3(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid))").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v3 ON media_v3(uid, mid, type, date);").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor7 = sQLiteDatabase2.queryFinalized("SELECT mid, uid, date, type, data FROM media_v2 WHERE 1", new Object[0]);
            } catch (Exception e2) {
                fc4.f(e2);
                sQLiteCursor7 = null;
            }
            if (sQLiteCursor7 != null) {
                SQLitePreparedStatement executeFast5 = sQLiteDatabase2.executeFast("REPLACE INTO media_v3 VALUES(?, ?, ?, ?, ?)");
                while (sQLiteCursor7.next()) {
                    NativeByteBuffer byteBufferValue5 = sQLiteCursor7.byteBufferValue(4);
                    if (byteBufferValue5 != null) {
                        int intValue9 = sQLiteCursor7.intValue(0);
                        long longValue3 = sQLiteCursor7.longValue(1);
                        if (((int) longValue3) == 0) {
                            longValue3 = pg3.E((int) (longValue3 >> c));
                        }
                        int intValue10 = sQLiteCursor7.intValue(2);
                        int intValue11 = sQLiteCursor7.intValue(3);
                        executeFast5.requery();
                        executeFast5.bindInteger(1, intValue9);
                        executeFast5.bindLong(2, longValue3);
                        executeFast5.bindInteger(3, intValue10);
                        executeFast5.bindInteger(4, intValue11);
                        executeFast5.bindByteBuffer(5, byteBufferValue5);
                        executeFast5.step();
                        byteBufferValue5.reuse();
                    }
                }
                sQLiteCursor7.dispose();
                executeFast5.dispose();
            }
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mid_type_date_idx_media;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS media_v2;").stepThis().dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 82").stepThis().dispose();
            i5 = 82;
        }
        if (i5 == 82) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))", "CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);", "CREATE TABLE IF NOT EXISTS enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))", "CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);");
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor3 = sQLiteDatabase2.queryFinalized("SELECT r.random_id, r.mid, m.uid FROM randoms as r INNER JOIN messages as m ON r.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e3) {
                fc4.f(e3);
                sQLiteCursor3 = null;
            }
            if (sQLiteCursor3 != null) {
                SQLitePreparedStatement executeFast6 = sQLiteDatabase2.executeFast("REPLACE INTO randoms_v2 VALUES(?, ?, ?)");
                while (sQLiteCursor3.next()) {
                    long longValue4 = sQLiteCursor3.longValue(0);
                    int intValue12 = sQLiteCursor3.intValue(1);
                    long longValue5 = sQLiteCursor3.longValue(2);
                    if (((int) longValue5) == 0) {
                        longValue5 = pg3.E((int) (longValue5 >> c));
                    }
                    executeFast6.requery();
                    executeFast6.bindLong(1, longValue4);
                    executeFast6.bindInteger(2, intValue12);
                    executeFast6.bindLong(3, longValue5);
                    executeFast6.step();
                }
                sQLiteCursor3.dispose();
                executeFast6.dispose();
            }
            try {
                sQLiteCursor4 = sQLiteDatabase2.queryFinalized("SELECT p.mid, m.uid, p.id FROM polls as p INNER JOIN messages as m ON p.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e4) {
                fc4.f(e4);
                sQLiteCursor4 = null;
            }
            if (sQLiteCursor4 != null) {
                SQLitePreparedStatement executeFast7 = sQLiteDatabase2.executeFast("REPLACE INTO polls_v2 VALUES(?, ?, ?)");
                while (sQLiteCursor4.next()) {
                    int intValue13 = sQLiteCursor4.intValue(0);
                    long longValue6 = sQLiteCursor4.longValue(1);
                    long longValue7 = sQLiteCursor4.longValue(2);
                    if (((int) longValue6) == 0) {
                        longValue6 = pg3.E((int) (longValue6 >> c));
                    }
                    executeFast7.requery();
                    executeFast7.bindInteger(1, intValue13);
                    executeFast7.bindLong(2, longValue6);
                    executeFast7.bindLong(3, longValue7);
                    executeFast7.step();
                }
                sQLiteCursor4.dispose();
                executeFast7.dispose();
            }
            try {
                sQLiteCursor5 = sQLiteDatabase2.queryFinalized("SELECT wp.id, wp.mid, m.uid FROM webpage_pending as wp INNER JOIN messages as m ON wp.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e5) {
                fc4.f(e5);
                sQLiteCursor5 = null;
            }
            if (sQLiteCursor5 != null) {
                SQLitePreparedStatement executeFast8 = sQLiteDatabase2.executeFast("REPLACE INTO webpage_pending_v2 VALUES(?, ?, ?)");
                while (sQLiteCursor5.next()) {
                    long longValue8 = sQLiteCursor5.longValue(0);
                    int intValue14 = sQLiteCursor5.intValue(1);
                    long longValue9 = sQLiteCursor5.longValue(2);
                    if (((int) longValue9) == 0) {
                        longValue9 = pg3.E((int) (longValue9 >> c));
                    }
                    executeFast8.requery();
                    executeFast8.bindLong(1, longValue8);
                    executeFast8.bindInteger(2, intValue14);
                    executeFast8.bindLong(3, longValue9);
                    executeFast8.step();
                }
                sQLiteCursor5.dispose();
                executeFast8.dispose();
            }
            try {
                sQLiteCursor6 = sQLiteDatabase2.queryFinalized("SELECT et.mid, m.uid, et.date, et.media FROM enc_tasks_v3 as et INNER JOIN messages as m ON et.mid = m.mid WHERE 1", new Object[0]);
            } catch (Exception e6) {
                fc4.f(e6);
                sQLiteCursor6 = null;
            }
            if (sQLiteCursor6 != null) {
                SQLitePreparedStatement executeFast9 = sQLiteDatabase2.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                while (sQLiteCursor6.next()) {
                    int intValue15 = sQLiteCursor6.intValue(0);
                    long longValue10 = sQLiteCursor6.longValue(1);
                    int intValue16 = sQLiteCursor6.intValue(2);
                    int intValue17 = sQLiteCursor6.intValue(3);
                    if (((int) longValue10) == 0) {
                        longValue10 = pg3.E((int) (longValue10 >> c));
                    }
                    executeFast9.requery();
                    executeFast9.bindInteger(1, intValue15);
                    executeFast9.bindLong(2, longValue10);
                    executeFast9.bindInteger(3, intValue16);
                    executeFast9.bindInteger(4, intValue17);
                    executeFast9.step();
                }
                sQLiteCursor6.dispose();
                executeFast9.dispose();
            }
            ts2.A(sQLiteDatabase2, "DROP INDEX IF EXISTS mid_idx_randoms;", "DROP TABLE IF EXISTS randoms;", "DROP INDEX IF EXISTS date_idx_enc_tasks_v3;", "DROP TABLE IF EXISTS enc_tasks_v3;");
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS polls_id;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS polls;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS webpage_pending;").stepThis().dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 83").stepThis().dispose();
            i5 = 83;
        }
        if (i5 == 83) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);", "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);");
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT mid, uid, read_state, send_state, date, data, out, ttl, media, replydata, imp, mention, forwards, replies_data, thread_reply_id FROM messages WHERE 1", new Object[0]);
            } catch (Exception e7) {
                fc4.f(e7);
                sQLiteCursor2 = null;
            }
            if (sQLiteCursor2 != null) {
                SQLitePreparedStatement executeFast10 = sQLiteDatabase2.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                while (sQLiteCursor2.next()) {
                    NativeByteBuffer byteBufferValue6 = sQLiteCursor2.byteBufferValue(5);
                    if (byteBufferValue6 != null) {
                        long intValue18 = sQLiteCursor2.intValue(0);
                        long longValue11 = sQLiteCursor2.longValue(i7);
                        if (((int) longValue11) == 0) {
                            longValue11 = pg3.E((int) (longValue11 >> c));
                        }
                        int intValue19 = sQLiteCursor2.intValue(i6);
                        int intValue20 = sQLiteCursor2.intValue(3);
                        int intValue21 = sQLiteCursor2.intValue(4);
                        int intValue22 = sQLiteCursor2.intValue(6);
                        int intValue23 = sQLiteCursor2.intValue(7);
                        int intValue24 = sQLiteCursor2.intValue(8);
                        NativeByteBuffer byteBufferValue7 = sQLiteCursor2.byteBufferValue(9);
                        int intValue25 = sQLiteCursor2.intValue(10);
                        int intValue26 = sQLiteCursor2.intValue(11);
                        int intValue27 = sQLiteCursor2.intValue(12);
                        NativeByteBuffer byteBufferValue8 = sQLiteCursor2.byteBufferValue(13);
                        int intValue28 = sQLiteCursor2.intValue(14);
                        SQLiteCursor sQLiteCursor9 = sQLiteCursor2;
                        int i11 = (int) (longValue11 >> c);
                        if (intValue23 < 0) {
                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue6, byteBufferValue6.readInt32(false), false);
                            if (TLdeserialize2 != null) {
                                i2 = intValue28;
                                TLdeserialize2.readAttachPath(byteBufferValue6, cf7Var.getUserConfig().n);
                                if (TLdeserialize2.params == null) {
                                    HashMap<String, String> hashMap = new HashMap<>();
                                    TLdeserialize2.params = hashMap;
                                    nativeByteBuffer = byteBufferValue6;
                                    hashMap.put("fwd_peer", String.valueOf(intValue23));
                                } else {
                                    nativeByteBuffer = byteBufferValue6;
                                }
                                nativeByteBuffer.reuse();
                                byteBufferValue6 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                TLdeserialize2.serializeToStream(byteBufferValue6);
                            } else {
                                i2 = intValue28;
                            }
                            i3 = 0;
                        } else {
                            i2 = intValue28;
                            i3 = intValue23;
                        }
                        executeFast10.requery();
                        executeFast10.bindInteger(1, (int) intValue18);
                        executeFast10.bindLong(2, longValue11);
                        executeFast10.bindInteger(3, intValue19);
                        executeFast10.bindInteger(4, intValue20);
                        executeFast10.bindInteger(5, intValue21);
                        executeFast10.bindByteBuffer(6, byteBufferValue6);
                        executeFast10.bindInteger(7, intValue22);
                        executeFast10.bindInteger(8, i3);
                        executeFast10.bindInteger(9, intValue24);
                        if (byteBufferValue7 != null) {
                            executeFast10.bindByteBuffer(10, byteBufferValue7);
                        } else {
                            executeFast10.bindNull(10);
                        }
                        executeFast10.bindInteger(11, intValue25);
                        executeFast10.bindInteger(12, intValue26);
                        executeFast10.bindInteger(13, intValue27);
                        if (byteBufferValue8 != null) {
                            executeFast10.bindByteBuffer(14, byteBufferValue8);
                        } else {
                            executeFast10.bindNull(14);
                        }
                        executeFast10.bindInteger(15, i2);
                        executeFast10.bindInteger(16, i11 > 0 ? 1 : 0);
                        executeFast10.step();
                        if (byteBufferValue7 != null) {
                            byteBufferValue7.reuse();
                        }
                        if (byteBufferValue8 != null) {
                            byteBufferValue8.reuse();
                        }
                        byteBufferValue6.reuse();
                        sQLiteCursor2 = sQLiteCursor9;
                        i6 = 2;
                        i7 = 1;
                    }
                }
                sQLiteCursor2.dispose();
                executeFast10.dispose();
            }
            int i12 = 0;
            sQLiteDatabase2 = sQLiteDatabase;
            SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT did, last_mid, last_mid_i FROM dialogs WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast11 = sQLiteDatabase2.executeFast("UPDATE dialogs SET last_mid = ?, last_mid_i = ? WHERE did = ?");
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (queryFinalized4.next()) {
                long longValue12 = queryFinalized4.longValue(i12);
                int i13 = (int) longValue12;
                int i14 = (int) (longValue12 >> c);
                if (i13 == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(i14));
                } else if (i14 == 2) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(i13));
                }
                executeFast11.requery();
                executeFast11.bindInteger(1, queryFinalized4.intValue(1));
                executeFast11.bindInteger(2, queryFinalized4.intValue(2));
                executeFast11.bindLong(3, longValue12);
                executeFast11.step();
                i12 = 0;
            }
            executeFast11.dispose();
            queryFinalized4.dispose();
            int i15 = 0;
            SQLiteCursor queryFinalized5 = sQLiteDatabase2.queryFinalized("SELECT uid, mid FROM unread_push_messages WHERE 1", new Object[0]);
            SQLitePreparedStatement executeFast12 = sQLiteDatabase2.executeFast("UPDATE unread_push_messages SET mid = ? WHERE uid = ? AND mid = ?");
            while (queryFinalized5.next()) {
                long longValue13 = queryFinalized5.longValue(i15);
                int intValue29 = queryFinalized5.intValue(1);
                executeFast12.requery();
                executeFast12.bindInteger(1, intValue29);
                executeFast12.bindLong(2, longValue13);
                executeFast12.bindInteger(3, intValue29);
                executeFast12.step();
                i15 = 0;
            }
            executeFast12.dispose();
            queryFinalized5.dispose();
            if (arrayList != null) {
                SQLitePreparedStatement executeFast13 = sQLiteDatabase2.executeFast("UPDATE dialogs SET did = ? WHERE did = ?");
                SQLitePreparedStatement executeFast14 = sQLiteDatabase2.executeFast("UPDATE dialog_filter_pin_v2 SET peer = ? WHERE peer = ?");
                SQLitePreparedStatement executeFast15 = sQLiteDatabase2.executeFast("UPDATE dialog_filter_ep SET peer = ? WHERE peer = ?");
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    long intValue30 = ((Integer) arrayList.get(i16)).intValue();
                    long E = pg3.E(intValue30);
                    long j = intValue30 << c;
                    executeFast13.requery();
                    executeFast13.bindLong(1, E);
                    executeFast13.bindLong(2, j);
                    executeFast13.step();
                    executeFast14.requery();
                    executeFast14.bindLong(1, E);
                    executeFast14.bindLong(2, j);
                    executeFast14.step();
                    executeFast15.requery();
                    executeFast15.bindLong(1, E);
                    executeFast15.bindLong(2, j);
                    executeFast15.step();
                }
                executeFast13.dispose();
                executeFast14.dispose();
                executeFast15.dispose();
            }
            if (arrayList2 != null) {
                SQLitePreparedStatement executeFast16 = sQLiteDatabase2.executeFast("UPDATE dialogs SET did = ? WHERE did = ?");
                int size2 = arrayList2.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    int intValue31 = ((Integer) arrayList2.get(i17)).intValue();
                    long F = pg3.F(intValue31);
                    executeFast16.requery();
                    executeFast16.bindLong(1, F);
                    executeFast16.bindLong(2, intValue31 | 8589934592L);
                    executeFast16.step();
                }
                executeFast16.dispose();
            }
            ts2.A(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_read_out_idx_messages;", "DROP INDEX IF EXISTS uid_date_mid_idx_messages;", "DROP INDEX IF EXISTS mid_out_idx_messages;", "DROP INDEX IF EXISTS task_idx_messages;");
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS send_state_idx_messages2;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP INDEX IF EXISTS uid_mention_idx_messages;").stepThis().dispose();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS messages;").stepThis().dispose();
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 84").stepThis().dispose();
            i5 = 84;
        }
        if (i5 == 84) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))").stepThis().dispose();
            sQLiteDatabase2.beginTransaction();
            try {
                sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT mid, uid, date, type, data FROM media_v3 WHERE 1", new Object[0]);
            } catch (Exception e8) {
                fc4.f(e8);
                sQLiteCursor = null;
            }
            if (sQLiteCursor != null) {
                SQLitePreparedStatement executeFast17 = sQLiteDatabase2.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue9 = sQLiteCursor.byteBufferValue(4);
                    if (byteBufferValue9 != null) {
                        int intValue32 = sQLiteCursor.intValue(0);
                        long longValue14 = sQLiteCursor.longValue(1);
                        if (((int) longValue14) == 0) {
                            longValue14 = pg3.E((int) (longValue14 >> c));
                        }
                        int intValue33 = sQLiteCursor.intValue(2);
                        int intValue34 = sQLiteCursor.intValue(3);
                        executeFast17.requery();
                        executeFast17.bindInteger(1, intValue32);
                        executeFast17.bindLong(2, longValue14);
                        executeFast17.bindInteger(3, intValue33);
                        executeFast17.bindInteger(4, intValue34);
                        executeFast17.bindByteBuffer(5, byteBufferValue9);
                        executeFast17.step();
                        byteBufferValue9.reuse();
                    }
                }
                sQLiteCursor.dispose();
                executeFast17.dispose();
            }
            sQLiteDatabase2.commitTransaction();
            sQLiteDatabase2.executeFast("DROP TABLE IF EXISTS media_v3;").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 85").stepThis().dispose();
            i5 = 85;
        }
        if (i5 == 85) {
            a(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            a(sQLiteDatabase2, "ALTER TABLE scheduled_messages_v2 ADD COLUMN reply_to_message_id INTEGER default 0");
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);").stepThis().dispose();
            a(sQLiteDatabase2, "UPDATE messages_v2 SET replydata = NULL");
            a(sQLiteDatabase2, "UPDATE scheduled_messages_v2 SET replydata = NULL");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 86").stepThis().dispose();
            i5 = 86;
        }
        if (i5 == 86) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS reactions(data BLOB, hash INTEGER, date INTEGER);", "PRAGMA user_version = 87");
            i5 = 87;
        }
        if (i5 == 87) {
            ts2.z(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN unread_reactions INTEGER default 0", "CREATE TABLE reaction_mentions(message_id INTEGER PRIMARY KEY, state INTEGER);", "PRAGMA user_version = 88");
            i5 = 88;
        }
        if (i5 == 88 || i5 == 89) {
            ts2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS reaction_mentions;", "CREATE TABLE IF NOT EXISTS reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(dialog_id, message_id));", "CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);", "DROP INDEX IF EXISTS uid_mid_type_date_idx_media_v3");
            ts2.y(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);", "PRAGMA user_version = 90");
            i5 = 90;
        }
        if (i5 == 90 || i5 == 91) {
            ts2.z(sQLiteDatabase2, "DROP TABLE IF EXISTS downloading_documents;", "CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));", "PRAGMA user_version = 92");
            i5 = 92;
        }
        if (i5 == 92) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);", "PRAGMA user_version = 93");
            i5 = 95;
        }
        if (i5 == 95 || i5 == 93) {
            a(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN custom_params BLOB default NULL");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 96").stepThis().dispose();
            i5 = 96;
        }
        if (i5 == 96) {
            sQLiteDatabase2.executeFast("CREATE TABLE IF NOT EXISTS premium_promo(data BLOB, date INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("UPDATE stickers_v2 SET date = 0");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 97").stepThis().dispose();
            i5 = 97;
        }
        if (i5 == 97) {
            ts2.z(sQLiteDatabase2, "DROP TABLE IF EXISTS stickers_featured;", "CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER);", "PRAGMA user_version = 98");
            i5 = 98;
        }
        if (i5 == 98) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 99");
            i5 = 99;
        }
        if (i5 == 99) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE stickers_featured ADD COLUMN emoji INTEGER default 0", "PRAGMA user_version = 100");
            i5 = 100;
        }
        if (i5 == 100) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE emoji_statuses(data BLOB, type INTEGER);", "PRAGMA user_version = 101");
            i5 = 101;
        }
        if (i5 == 101) {
            ts2.A(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN group_id INTEGER default NULL", "ALTER TABLE dialogs ADD COLUMN last_mid_group INTEGER default NULL", "CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);", "PRAGMA user_version = 102");
            i5 = nm7.m1;
        }
        if (i5 == 102) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes_topics(uid, topic_id, end);", "CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, PRIMARY KEY(mid, topic_id, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, mid, read_state, out);");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);", "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, mention, read_state);", "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS mid_uid_topic_id_messages_topics ON messages_topics(mid, topic_id, uid);", "CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);", "CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);", "CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, PRIMARY KEY(did, topic_id));", "CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);", "PRAGMA user_version = 103");
            i5 = nm7.n1;
        }
        if (i5 == 103) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))", "CREATE TABLE IF NOT EXISTS reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);", "PRAGMA user_version = 104");
            i5 = nm7.o1;
        }
        if (i5 == 104) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN read_outbox INTEGER default 0", "PRAGMA user_version = 105");
            i5 = nm7.p1;
        }
        if (i5 == 105) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN pinned INTEGER default 0", "PRAGMA user_version = 106");
            i5 = nm7.q1;
        }
        if (i5 == 106) {
            ts2.A(sQLiteDatabase2, "DROP INDEX IF EXISTS uid_mid_read_out_idx_messages_topics", "DROP INDEX IF EXISTS uid_mention_idx_messages_topics", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);", "CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);", "CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);", "CREATE INDEX IF NOT EXISTS did_topics ON topics(did);");
            ts2.x(sQLiteDatabase2, "PRAGMA user_version = 107");
            i5 = nm7.r1;
        }
        if (i5 == 107) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN total_messages_count INTEGER default 0", "PRAGMA user_version = 108");
            i5 = nm7.s1;
        }
        if (i5 == 108) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN hidden INTEGER default 0", "PRAGMA user_version = 109");
            i5 = nm7.t1;
        }
        if (i5 == 109) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN ttl_period INTEGER default 0", "PRAGMA user_version = 110");
            i5 = nm7.u1;
        }
        if (i5 == 110) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE stickersets(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER);", "PRAGMA user_version = 111");
            i5 = nm7.v1;
        }
        if (i5 == 111) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)", "PRAGMA user_version = 112");
            i5 = nm7.w1;
        }
        if (i5 == 112) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE app_config(data BLOB)", "PRAGMA user_version = 113");
            i5 = nm7.x1;
        }
        if (i5 == 113) {
            cf7Var.p1();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 114").stepThis().dispose();
            i5 = nm7.y1;
        }
        if (i5 == 114) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))", "CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);", "PRAGMA user_version = 115");
            i5 = nm7.z1;
        }
        if (i5 == 115) {
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);", "PRAGMA user_version = 117");
            i5 = nm7.B1;
        }
        if (i5 == 116 || i5 == 117 || i5 == 118) {
            ts2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS stories", "DROP TABLE IF EXISTS stories_counter", "CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, local_path TEXT, local_thumb_path TEXT, PRIMARY KEY (dialog_id, story_id));", "CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);");
            sQLiteDatabase2.executeFast("PRAGMA user_version = 119").stepThis().dispose();
            cf7Var.getMessagesController().N1().p();
            i5 = nm7.D1;
        }
        if (i5 == 119) {
            ts2.z(sQLiteDatabase2, "ALTER TABLE messages_v2 ADD COLUMN reply_to_story_id INTEGER default 0", "ALTER TABLE messages_topics ADD COLUMN reply_to_story_id INTEGER default 0", "PRAGMA user_version = 120");
            i5 = nm7.E1;
        }
        if (i5 == 120) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, PRIMARY KEY(dialog_id, story_id));", "CREATE TABLE archived_stories (story_id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 121");
            i5 = 121;
        }
        if (i5 == 121) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB);", "PRAGMA user_version = 122");
            i5 = nm7.F1;
        }
        if (i5 == 122) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE chat_settings_v2 ADD COLUMN participants_count INTEGER default 0", "PRAGMA user_version = 123");
            i5 = nm7.G1;
        }
        if (i5 == 123) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE story_pushes (uid INTEGER PRIMARY KEY, minId INTEGER, maxId INTEGER, date INTEGER, localName TEXT);", "PRAGMA user_version = 124");
            i5 = nm7.H1;
        }
        if (i5 == 124) {
            ts2.z(sQLiteDatabase2, "DROP TABLE IF EXISTS story_pushes;", "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, PRIMARY KEY(uid, sid));", "PRAGMA user_version = 125");
            i5 = nm7.I1;
        }
        if (i5 == 125) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE story_pushes ADD COLUMN flags INTEGER default 0", "PRAGMA user_version = 126");
            i5 = nm7.J1;
        }
        if (i5 == 126) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE story_pushes ADD COLUMN expire_date INTEGER default 0", "PRAGMA user_version = 127");
            i5 = nm7.K1;
        }
        if (i5 == 127) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE stories ADD COLUMN custom_params BLOB default NULL", "PRAGMA user_version = 128");
            i5 = 128;
        }
        if (i5 == 128) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE story_drafts ADD COLUMN type INTEGER default 0", "PRAGMA user_version = 129");
            i5 = nm7.M1;
        }
        if (i5 == 129) {
            ts2.y(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);", "PRAGMA user_version = 130");
            i5 = nm7.N1;
        }
        if (i5 == 130) {
            ts2.z(sQLiteDatabase2, "DROP TABLE archived_stories", "ALTER TABLE profile_stories ADD COLUMN type INTEGER default 0", "PRAGMA user_version = 131");
            i5 = nm7.O1;
        }
        if (i5 == 131) {
            ts2.z(sQLiteDatabase2, "ALTER TABLE stories DROP COLUMN local_path", "ALTER TABLE stories DROP COLUMN local_thumb_path", "PRAGMA user_version = 132");
            i5 = nm7.P1;
        }
        if (i5 == 132) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE unconfirmed_auth (data BLOB);", "PRAGMA user_version = 133");
            i5 = nm7.Q1;
        }
        if (i5 == 133) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE unread_push_messages ADD COLUMN topicId INTEGER default 0", "PRAGMA user_version = 134");
            i5 = 134;
        }
        if (i5 == 134) {
            ts2.A(sQLiteDatabase2, "DROP TABLE user_photos", "CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))", "CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)", "PRAGMA user_version = 135");
            i5 = 135;
        }
        if (i5 == 135) {
            a.l();
            sQLiteDatabase2.executeFast("CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER);").stepThis().dispose();
            sQLiteDatabase2.executeFast("CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);").stepThis().dispose();
            sQLiteDatabase2.executeFast("PRAGMA user_version = 136").stepThis().dispose();
            i5 = nm7.R1;
        }
        if (i5 == 136) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE saved_dialogs(did INTEGER PRIMARY KEY, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER)", "CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);");
            ts2.y(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);", "PRAGMA user_version = 137");
            i5 = nm7.S1;
        }
        if (i5 == 137) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE unread_push_messages ADD COLUMN is_reaction INTEGER default 0", "PRAGMA user_version = 138");
            i5 = nm7.T1;
        }
        if (i5 == 138 || i5 == 139 || i5 == 140 || i5 == 141) {
            ts2.A(sQLiteDatabase2, "DROP TABLE IF EXISTS tag_message_id;", "CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);", "CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);", "CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);");
            ts2.z(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);", "CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);", "PRAGMA user_version = 142");
            i5 = nm7.X1;
        }
        if (i5 == 142) {
            ts2.z(sQLiteDatabase2, "DROP TABLE IF EXISTS saved_reaction_tags;", "CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);", "PRAGMA user_version = 143");
            i5 = nm7.Y1;
        }
        if (i5 == 143) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE dialog_filter ADD COLUMN color INTEGER default -1", "PRAGMA user_version = 144");
            i5 = nm7.Z1;
        }
        if (i5 == 144) {
            ts2.x(sQLiteDatabase2, "PRAGMA user_version = 145");
            i5 = nm7.a2;
        }
        if (i5 == 145) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER);", "PRAGMA user_version = 146");
            i5 = nm7.b2;
        }
        if (i5 == 146) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);");
            ts2.y(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);", "PRAGMA user_version = 147");
            i5 = nm7.c2;
        }
        if (i5 == 147) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE business_replies ADD COLUMN count INTEGER default 0", "PRAGMA user_version = 148");
            i5 = nm7.d2;
        }
        if (i5 == 148) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN edit_date INTEGER default 0", "PRAGMA user_version = 149");
            i5 = nm7.e2;
        }
        if (i5 == 149) {
            ts2.z(sQLiteDatabase2, "ALTER TABLE stickersets2 ADD COLUMN short_name TEXT;", "CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);", "PRAGMA user_version = 150");
            i5 = nm7.f2;
        }
        if (i5 == 150) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE business_links(data BLOB, order_value INTEGER);", "PRAGMA user_version = 151");
            i5 = nm7.g2;
        }
        if (i5 == 151) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE profile_stories ADD COLUMN seen INTEGER default 0;", "PRAGMA user_version = 152");
            i5 = nm7.h2;
        }
        if (i5 == 152) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE profile_stories ADD COLUMN pin INTEGER default 0;", "PRAGMA user_version = 153");
            i5 = nm7.i2;
        }
        if (i5 == 153) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE effects(data BLOB)", "PRAGMA user_version = 154");
            i5 = nm7.j2;
        }
        if (i5 == 154) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);", "PRAGMA user_version = 155");
            i5 = nm7.k2;
        }
        if (i5 == 155) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT);", "PRAGMA user_version = 156");
            i5 = nm7.l2;
        }
        if (i5 == 156 || i5 == 157) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER);", "PRAGMA user_version = 158");
            i5 = nm7.n2;
        }
        if (i5 == 158) {
            ts2.z(sQLiteDatabase2, "DELETE FROM star_gifts2", "ALTER TABLE star_gifts2 ADD COLUMN pos INTEGER default 0;", "PRAGMA user_version = 159");
            i5 = nm7.o2;
        }
        if (i5 == 159) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE dialog_filter ADD COLUMN entities BLOB", "PRAGMA user_version = 160");
            i5 = nm7.p2;
        }
        if (i5 == 160) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE dialog_filter ADD COLUMN noanimate INTEGER", "PRAGMA user_version = 161");
            i5 = nm7.q2;
        }
        if (i5 == 161) {
            ts2.z(sQLiteDatabase2, "DELETE FROM popular_bots", "ALTER TABLE popular_bots ADD COLUMN pos INTEGER", "PRAGMA user_version = 162");
            i5 = nm7.r2;
        }
        if (i5 == 162) {
            ts2.A(sQLiteDatabase2, "DROP TABLE saved_dialogs", "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "PRAGMA user_version = 163");
            i5 = nm7.s2;
        }
        if (i5 == 163) {
            ts2.A(sQLiteDatabase2, "DROP TABLE saved_dialogs", "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON saved_dialogs(last_mid);");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS folder_id_idx_dialogs ON saved_dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "PRAGMA user_version = 164");
            i5 = nm7.t2;
        }
        if (i5 == 164) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN nopaid_messages_exception INTEGER default 0;", "PRAGMA user_version = 165");
            i5 = nm7.u2;
        }
        if (i5 == 165) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));", "CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));", "PRAGMA user_version = 166");
            i5 = nm7.v2;
        }
        if (i5 == 166) {
            ts2.z(sQLiteDatabase2, "DROP TABLE profile_stories", "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));", "PRAGMA user_version = 167");
            i5 = nm7.w2;
        }
        if (i5 == 167) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);", "PRAGMA user_version = 168");
            i5 = nm7.x2;
        }
        if (i5 == 168) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE dialogs ADD COLUMN unread_poll_votes INTEGER default 0", "PRAGMA user_version = 169");
            i5 = nm7.y2;
        }
        if (i5 == 169) {
            ts2.y(sQLiteDatabase2, "ALTER TABLE topics ADD COLUMN unread_poll_votes INTEGER default 0", "PRAGMA user_version = 170");
            i5 = nm7.z2;
        }
        if (i5 == 170) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);", "CREATE TABLE IF NOT EXISTS poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);");
            ts2.x(sQLiteDatabase2, "PRAGMA user_version = 171");
            i5 = nm7.A2;
        }
        if (i5 == 171) {
            ts2.z(sQLiteDatabase2, "DROP TABLE story_pushes", "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));", "PRAGMA user_version = 172");
            i5 = nm7.B2;
        }
        if (i5 == 172) {
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_dialogs ON messages_holes(uid, end);", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_topics ON messages_holes_topics(uid, topic_id, end);", "CREATE INDEX IF NOT EXISTS date_idx_4_saved_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS date_idx_4_dialogs ON dialogs(date);");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS last_mid_idx_4_saved_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_dialogs ON dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_saved_dialogs ON saved_dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_dialogs ON dialogs(folder_id);");
            ts2.A(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS flags_idx_4_saved_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS flags_idx_4_dialogs ON dialogs(flags);", "DROP INDEX IF EXISTS uid_end_messages_holes;", "DROP INDEX IF EXISTS date_idx_dialogs;");
            ts2.A(sQLiteDatabase2, "DROP INDEX IF EXISTS last_mid_idx_dialogs;", "DROP INDEX IF EXISTS folder_id_idx_dialogs;", "DROP INDEX IF EXISTS flags_idx_dialogs;", "PRAGMA user_version = 173");
            i5 = nm7.C2;
        }
        if (i5 == 173) {
            ts2.y(sQLiteDatabase2, "CREATE TABLE web_browser_settings(data BLOB)", "PRAGMA user_version = 174");
            i5 = nm7.D2;
        }
        if (i5 == 174) {
            ts2.y(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS uid_type_date_mid_idx_media_v4 ON media_v4(uid, type, date DESC, mid DESC);", "PRAGMA user_version = 175");
            i5 = nm7.E2;
        }
        if (i5 == 175) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE ephemeral_messages (id INTEGER, dialog_id INTEGER, topic_id INTEGER, date INTEGER, data BLOB, PRIMARY KEY(dialog_id, id));", "CREATE INDEX IF NOT EXISTS ephemeral_messages_date_idx ON ephemeral_messages(date);", "PRAGMA user_version = 176");
            i5 = nm7.F2;
        }
        if (i5 == 176) {
            ts2.A(sQLiteDatabase2, "CREATE TABLE welcome_messages(mid INTEGER, dialog_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, dialog_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_welcome_messages ON welcome_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS dialog_date_idx_welcome_messages ON welcome_messages(dialog_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_welcome_messages ON welcome_messages(mid, reply_to_message_id);");
            ts2.y(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS idx_to_reply_welcome_messages ON welcome_messages(reply_to_message_id, mid);", "PRAGMA user_version = 177");
            i5 = nm7.G2;
        }
        if (i5 == 177) {
            ts2.y(sQLiteDatabase2, "CREATE INDEX IF NOT EXISTS media_v4_music_browse_idx ON media_v4(uid, date DESC, mid DESC) WHERE type = 4 AND mid > 0 AND uid != 0;", "PRAGMA user_version = 178");
            i5 = nm7.H2;
        }
        if (i5 == 178) {
            ts2.y(sQLiteDatabase2, "DELETE FROM downloading_documents", "PRAGMA user_version = 179");
            i5 = nm7.I2;
        }
        if (i5 == 179) {
            ts2.z(sQLiteDatabase2, "CREATE TABLE widget_state(uid INTEGER, mid INTEGER, local TEXT, PRIMARY KEY(uid, mid));", "CREATE TABLE widget_heights(uid INTEGER, mid INTEGER, width INTEGER, height INTEGER, date INTEGER, PRIMARY KEY(uid, mid, width));", "PRAGMA user_version = 180");
            i5 = nm7.J2;
        }
        if (i5 == 180) {
            if (b(sQLiteDatabase2, "widget_state", "height")) {
                ts2.x(sQLiteDatabase2, "DROP TABLE widget_state");
            }
            ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS widget_state(uid INTEGER, mid INTEGER, local TEXT, PRIMARY KEY(uid, mid));", "CREATE TABLE IF NOT EXISTS widget_heights(uid INTEGER, mid INTEGER, width INTEGER, height INTEGER, date INTEGER, anchor INTEGER default 0, PRIMARY KEY(uid, mid, width));");
            if (!b(sQLiteDatabase2, "widget_heights", "anchor")) {
                ts2.x(sQLiteDatabase2, "ALTER TABLE widget_heights ADD COLUMN anchor INTEGER default 0");
            }
            ts2.x(sQLiteDatabase2, "PRAGMA user_version = 181");
            i5 = nm7.K2;
        }
        if (i5 != 181) {
            return i5;
        }
        ts2.y(sQLiteDatabase2, "CREATE TABLE IF NOT EXISTS onchain_offer_intents(slug TEXT, amount INTEGER, duration INTEGER, random_id INTEGER, used_at INTEGER, PRIMARY KEY(slug, amount, duration));", "PRAGMA user_version = 182");
        return nm7.L2;
    }
}
