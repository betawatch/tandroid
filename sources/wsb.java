// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wsb {
    public static volatile wsb[] e = new wsb[4];
    public static final Object[] f = new Object[4];
    public final int a;
    public boolean b;
    public boolean c;
    public final ArrayList d = new ArrayList();

    static {
        for (int i = 0; i < 4; i++) {
            f[i] = new Object();
        }
    }

    public wsb(int i) {
        this.a = i;
    }

    public static wsb b(int i) {
        wsb wsbVar;
        wsb wsbVar2 = e[i];
        if (wsbVar2 != null) {
            return wsbVar2;
        }
        synchronized (f[i]) {
            wsbVar = e[i];
            if (wsbVar == null) {
                wsb[] wsbVarArr = e;
                wsb wsbVar3 = new wsb(i);
                wsbVarArr[i] = wsbVar3;
                wsbVar = wsbVar3;
            }
        }
        return wsbVar;
    }

    public static String e(TLRPC.TL_timezone tL_timezone, boolean z) {
        if (tL_timezone == null) {
            return null;
        }
        String str = tL_timezone.name;
        if (!z) {
            return str;
        }
        return str + ", " + f(tL_timezone);
    }

    public static String f(TLRPC.TL_timezone tL_timezone) {
        int i = tL_timezone.utc_offset;
        if (i == 0) {
            return "GMT";
        }
        String concat = "GMT".concat(i < 0 ? "-" : "+");
        int abs = Math.abs(tL_timezone.utc_offset) / 60;
        int i2 = abs / 60;
        int i3 = abs % 60;
        StringBuilder sb = new StringBuilder(concat);
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        StringBuilder sb2 = new StringBuilder(sb.toString().concat(":"));
        sb2.append(i3 < 10 ? "0" : "");
        sb2.append(i3);
        return sb2.toString();
    }

    public final TLRPC.TL_timezone a(String str) {
        if (str == null) {
            return null;
        }
        g();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i);
            if (TextUtils.equals(tL_timezone.id, str)) {
                return tL_timezone;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c() {
        ZoneId systemDefault = ZoneId.systemDefault();
        String id = systemDefault != null ? systemDefault.getId() : null;
        if (this.b || !this.c) {
            g();
            return id;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                int totalSeconds = systemDefault != null ? systemDefault.getRules().getOffset(Instant.now()).getTotalSeconds() : 0;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i2);
                    if (totalSeconds == tL_timezone.utc_offset) {
                        return tL_timezone.id;
                    }
                }
                if (!arrayList.isEmpty()) {
                    return ((TLRPC.TL_timezone) arrayList.get(0)).id;
                }
            } else {
                if (TextUtils.equals(((TLRPC.TL_timezone) arrayList.get(i)).id, id)) {
                    break;
                }
                i++;
            }
        }
    }

    public final String d(String str, boolean z) {
        String str2;
        TLRPC.TL_timezone a = a(str);
        if (a != null) {
            return e(a, z);
        }
        ZoneId of = ZoneId.of(str);
        if (of == null) {
            return "";
        }
        if (z) {
            String displayName = of.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, ob6.D0().y);
            str2 = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                str2 = "GMT".concat(displayName);
            }
        } else {
            str2 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(of.getId().replace("/", ", ").replace("_", " "));
        sb.append(str2 != null ? ", ".concat(str2) : "");
        return sb.toString();
    }

    public final void g() {
        if (this.b || this.c) {
            return;
        }
        this.b = true;
        int i = this.a;
        SharedPreferences sharedPreferences = uc7.s1(i).X3;
        TLRPC.help_timezonesList help_timezoneslist = null;
        String string = sharedPreferences.getString("timezones", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            help_timezoneslist = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (help_timezoneslist != null) {
            arrayList.addAll(help_timezoneslist.timezones);
        }
        jn7.f(i).k(jn7.t3, new Object[0]);
        TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
        tL_help_getTimezonesList.hash = help_timezoneslist != null ? help_timezoneslist.hash : 0;
        ConnectionsManager.getInstance(i).sendRequest(tL_help_getTimezonesList, new isa(this, sharedPreferences, (byte) 16));
    }
}
