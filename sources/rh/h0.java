package rh;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class h0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public g0 f;

    public h0(Context context, int i10, long j10) {
        this.a = context;
        this.b = i10;
        this.c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i10, 0).getStringSet("" + j10, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    g0 g0Var = new g0(this, new JSONObject(it.next()));
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(g0Var);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static void a() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botdownloads_" + i10, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static h0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = g;
        h0 h0Var = (h0) hashMap.get(pair);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(context, i10, j10);
        hashMap.put(pair, h0Var2);
        return h0Var2;
    }

    public final void b(String str, String str2) {
        g0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            g0 g0Var = new g0(this, str, str2);
            this.f = g0Var;
            g0Var.l = false;
            this.e.add(g0Var);
            f();
            e();
        }
    }

    public final g0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g0 g0Var = (g0) obj;
            if (TextUtils.equals(g0Var.b, str) && g0Var.h) {
                return g0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        int i10 = 0;
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botdownloads_" + this.b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g0 g0Var = (g0) obj;
            g0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", g0Var.b);
                jSONObject.put("file_name", g0Var.c);
                jSONObject.put("size", g0Var.g);
                File file = g0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", g0Var.h);
                jSONObject.put("mime", g0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
