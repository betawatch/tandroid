package yf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import bi.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import wi.q;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c {
    public static volatile long g;
    public static volatile long h;
    public static final HashSet i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long a;
    public final int c;
    public int d;
    public boolean f;
    public String b = null;
    public final ArrayList e = new ArrayList();

    public c(int i7) {
        this.c = i7;
        this.a = p10.i(i7).n;
        SharedPreferences d = d();
        try {
            g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.h3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.id) != null) {
            return;
        }
        b bVar = new b();
        bVar.a = document;
        int i7 = this.d;
        this.d = i7 + 1;
        bVar.c = i7;
        bVar.d = false;
        this.e.add(bVar);
        h();
    }

    public final void b() {
        if (!this.f) {
            f(true);
            this.f = true;
        }
        Utilities.e.c(new q(5, this, new ArrayList(this.e)));
    }

    public final TLRPC.Document c(long j3) {
        ArrayList arrayList = this.e;
        if (!this.f) {
            f(true);
            this.f = true;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (arrayList.get(i7) != null && ((b) arrayList.get(i7)).a != null && ((b) arrayList.get(i7)).a.id == j3) {
                    return ((b) arrayList.get(i7)).a;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.b == null) {
            this.b = "ringtones_pref_" + this.a;
        }
        return t0.b.getSharedPreferences(this.b, 0);
    }

    public final String e(long j3) {
        if (!this.f) {
            f(true);
            this.f = true;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i7 >= arrayList.size()) {
                return "NoSound";
            }
            if (((b) arrayList.get(i7)).a != null && ((b) arrayList.get(i7)).a.id == j3) {
                if (!TextUtils.isEmpty(((b) arrayList.get(i7)).b)) {
                    return ((b) arrayList.get(i7)).b;
                }
                w7.G(this.c);
                return w7.I(((b) arrayList.get(i7)).a).toString();
            }
            i7++;
        }
    }

    public final void f(boolean z9) {
        SharedPreferences d = d();
        int i7 = d.getInt("count", 0);
        ArrayList arrayList = this.e;
        arrayList.clear();
        for (int i10 = 0; i10 < i7; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                b bVar = new b();
                bVar.a = TLdeserialize;
                bVar.b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                bVar.c = i11;
                arrayList.add(bVar);
            } catch (Throwable th2) {
                boolean z10 = r2.a;
                a8.g(th2, true);
            }
        }
        if (z9) {
            g0.h3(new a(this, 1));
        }
    }

    public final void g(boolean z9) {
        boolean z10 = z9 || System.currentTimeMillis() - h > 86400000;
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = g;
        if (z10) {
            ConnectionsManager.getInstance(this.c).sendRequest(getsavedringtones, new j0(this, 26));
            return;
        }
        if (!this.f) {
            f(true);
            this.f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences d = d();
        d.edit().clear().apply();
        SharedPreferences.Editor edit = d.edit();
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i7 >= arrayList.size()) {
                edit.putInt("count", i10);
                edit.apply();
                qs.f(this.c).k(qs.e5, new Object[0]);
                return;
            }
            if (!((b) arrayList.get(i7)).d) {
                i10++;
                TLRPC.Document document = ((b) arrayList.get(i7)).a;
                String str = ((b) arrayList.get(i7)).b;
                SerializedData serializedData = new SerializedData(document.getObjectSize());
                document.serializeToStream(serializedData);
                edit.putString("tone_document" + i7, Utilities.f(serializedData.toByteArray()));
                if (str != null) {
                    edit.putString("tone_local_path" + i7, str);
                }
            }
            i7++;
        }
    }
}
