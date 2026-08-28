package pf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u1 {
    public static volatile u1[] e = new u1[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public boolean b;
    public boolean c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            f[i9] = new Object();
        }
    }

    public u1(int i9) {
        this.a = i9;
    }

    public static u1 b(int i9) {
        u1 u1Var;
        u1 u1Var2 = e[i9];
        if (u1Var2 != null) {
            return u1Var2;
        }
        synchronized (f[i9]) {
            try {
                u1Var = e[i9];
                if (u1Var == null) {
                    u1[] u1VarArr = e;
                    u1 u1Var3 = new u1(i9);
                    u1VarArr[i9] = u1Var3;
                    u1Var = u1Var3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u1Var;
    }

    public static String e(TLRPC.TL_timezone tL_timezone, boolean z10) {
        if (tL_timezone == null) {
            return null;
        }
        if (!z10) {
            return tL_timezone.name;
        }
        return tL_timezone.name + ", " + f(tL_timezone);
    }

    public static String f(TLRPC.TL_timezone tL_timezone) {
        int i9 = tL_timezone.utc_offset;
        if (i9 == 0) {
            return "GMT";
        }
        String concat = "GMT".concat(i9 < 0 ? "-" : "+");
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i10 = abs / 60;
        int i11 = abs % 60;
        StringBuilder n10 = e2.c.n(concat);
        n10.append(i10 < 10 ? "0" : "");
        n10.append(i10);
        StringBuilder n11 = e2.c.n(ta.b.j(n10.toString(), ":"));
        n11.append(i11 < 10 ? "0" : "");
        n11.append(i11);
        return n11.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i9);
            if (TextUtils.equals(tL_timezone.id, str)) {
                return tL_timezone;
            }
            i9++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c() {
        ZoneId systemDefault = ZoneId.systemDefault();
        String id2 = systemDefault != null ? systemDefault.getId() : null;
        if (this.b || !this.c) {
            g();
            return id2;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 >= arrayList.size()) {
                int totalSeconds = systemDefault != null ? systemDefault.getRules().getOffset(Instant.now()).getTotalSeconds() : 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i10);
                    if (totalSeconds == tL_timezone.utc_offset) {
                        return tL_timezone.id;
                    }
                }
                if (!arrayList.isEmpty()) {
                    return ((TLRPC.TL_timezone) arrayList.get(0)).id;
                }
            } else {
                if (TextUtils.equals(((TLRPC.TL_timezone) arrayList.get(i9)).id, id2)) {
                    break;
                }
                i9++;
            }
        }
    }

    public final String d(String str, boolean z10) {
        String str2;
        TLRPC.TL_timezone a2 = a(str);
        if (a2 != null) {
            return e(a2, z10);
        }
        ZoneId of2 = ZoneId.of(str);
        if (of2 == null) {
            return "";
        }
        if (z10) {
            String displayName = of2.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            str2 = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                str2 = "GMT".concat(displayName);
            }
        } else {
            str2 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(of2.getId().replace("/", ", ").replace("_", " "));
        sb2.append(str2 != null ? ", ".concat(str2) : "");
        return sb2.toString();
    }

    public final void g() {
        if (this.b || this.c) {
            return;
        }
        this.b = true;
        int i9 = this.a;
        SharedPreferences mainSettings = MessagesController.getInstance(i9).getMainSettings();
        TLRPC.help_timezonesList help_timezoneslist = null;
        String string = mainSettings.getString("timezones", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            help_timezoneslist = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (help_timezoneslist != null) {
            arrayList.addAll(help_timezoneslist.timezones);
        }
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
        TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
        tL_help_getTimezonesList.hash = help_timezoneslist != null ? help_timezoneslist.hash : 0;
        ConnectionsManager.getInstance(i9).sendRequest(tL_help_getTimezonesList, new o71(10, this, mainSettings));
    }
}
