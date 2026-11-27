// default package

import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.RingtoneManager;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wp7 {
    public final int a;

    public wp7(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TLRPC.NotificationSound notificationSound, SharedPreferences.Editor editor, long j, long j2, int i) {
        String str;
        String str2;
        String str3;
        TLRPC.NotificationSound notificationSound2;
        String str4;
        if (notificationSound == null) {
            return;
        }
        if (j != 0) {
            String p = ip7.p(j, j2, true);
            str = c00.i("sound_", p);
            str3 = c00.i("sound_path_", p);
            str2 = c00.i("sound_document_id_", p);
        } else if (i == 0) {
            str = "GroupSound";
            str2 = "GroupSoundDocId";
            str3 = "GroupSoundPath";
        } else if (i == 3) {
            str = "StoriesSound";
            str2 = "StoriesSoundDocId";
            str3 = "StoriesSoundPath";
        } else if (i == 1) {
            str = "GlobalSound";
            str2 = "GlobalSoundDocId";
            str3 = "GlobalSoundPath";
        } else if (i == 4 || i == 5) {
            str = "ReactionSound";
            str2 = "ReactionSoundDocId";
            str3 = "ReactionSoundPath";
        } else {
            str = "ChannelSound";
            str2 = "ChannelSoundDocId";
            str3 = "ChannelSoundPath";
        }
        String str5 = str3;
        String str6 = str;
        String str7 = str2;
        if (notificationSound instanceof TLRPC.TL_notificationSoundLocal) {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = (TLRPC.TL_notificationSoundLocal) notificationSound;
            if ("Default".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                notificationSound2 = new TLRPC.TL_notificationSoundDefault();
            } else if ("NoSound".equalsIgnoreCase(tL_notificationSoundLocal.data)) {
                notificationSound2 = new TLRPC.TL_notificationSoundNone();
            } else {
                String str8 = tL_notificationSoundLocal.title;
                if (str8 != null) {
                    try {
                        RingtoneManager ringtoneManager = new RingtoneManager(a.b);
                        ringtoneManager.setType(2);
                        Cursor cursor = ringtoneManager.getCursor();
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(1);
                            str4 = cursor.getString(2) + "/" + cursor.getString(0);
                            if (str8.equalsIgnoreCase(string)) {
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        cc4.g(th, true);
                    }
                }
                str4 = null;
                if (str4 == null) {
                    return;
                } else {
                    tL_notificationSoundLocal.data = str4;
                }
            }
            if (!(notificationSound2 instanceof TLRPC.TL_notificationSoundDefault)) {
                editor.putString(str6, "Default");
                editor.putString(str5, "Default");
                editor.remove(str7);
                return;
            }
            if (notificationSound2 instanceof TLRPC.TL_notificationSoundNone) {
                editor.putString(str6, "NoSound");
                editor.putString(str5, "NoSound");
                editor.remove(str7);
                return;
            } else {
                if (notificationSound2 instanceof TLRPC.TL_notificationSoundLocal) {
                    TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal2 = (TLRPC.TL_notificationSoundLocal) notificationSound2;
                    editor.putString(str6, tL_notificationSoundLocal2.title);
                    editor.putString(str5, tL_notificationSoundLocal2.data);
                    editor.remove(str7);
                    return;
                }
                if (notificationSound2 instanceof TLRPC.TL_notificationSoundRingtone) {
                    TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = (TLRPC.TL_notificationSoundRingtone) notificationSound2;
                    editor.putLong(str7, tL_notificationSoundRingtone.id);
                    ls6.d0(this.a).A0.g(true);
                    ls6.d0(this.a).A0.c(tL_notificationSoundRingtone.id);
                    return;
                }
                return;
            }
        }
        notificationSound2 = notificationSound;
        if (!(notificationSound2 instanceof TLRPC.TL_notificationSoundDefault)) {
        }
    }

    public final SharedPreferences b() {
        return uc7.s1(this.a).X3;
    }

    public final int c(int i, long j, long j2, String str) {
        String p = ip7.p(j, j2, true);
        SharedPreferences b = b();
        StringBuilder sb = new StringBuilder(str);
        sb.append(p);
        return b.contains(sb.toString()) ? qu6.g(str, p, b(), i) : qu6.g(str, ip7.p(j, 0L, true), b(), i);
    }

    public final long d(long j, long j2) {
        String p = ip7.p(j, j2, true);
        if (b().contains("sound_document_id_" + p)) {
            return b().getLong("sound_document_id_" + p, 0L);
        }
        String p2 = ip7.p(j, 0L, true);
        return b().getLong("sound_document_id_" + p2, 0L);
    }

    public final boolean e(long j, long j2) {
        String p = ip7.p(j, j2, false);
        if (b().contains("custom_" + p)) {
            return b().getBoolean("custom_" + p, false);
        }
        String p2 = ip7.p(j, 0L, false);
        return b().getBoolean("custom_" + p2, false);
    }

    public final String f(long j, long j2) {
        String p = ip7.p(j, j2, false);
        if (b().contains("sound_path_" + p)) {
            return b().getString("sound_path_" + p, null);
        }
        String p2 = ip7.p(j, 0L, false);
        return b().getString("sound_path_" + p2, null);
    }
}
