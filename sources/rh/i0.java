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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public h0 f;

    public i0(Context context, int i10, long j10) {
        this.a = context;
        this.b = i10;
        this.c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i10, 0).getStringSet("" + j10, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    h0 h0Var = new h0(this, new JSONObject(it.next()));
                    File file = h0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(h0Var);
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

    public static i0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = g;
        i0 i0Var = (i0) hashMap.get(pair);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(context, i10, j10);
        hashMap.put(pair, i0Var2);
        return i0Var2;
    }

    public final void b(String str, String str2) {
        h0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            h0 h0Var = new h0(this, str, str2);
            this.f = h0Var;
            h0Var.l = false;
            this.e.add(h0Var);
            f();
            e();
        }
    }

    public final h0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            if (TextUtils.equals(h0Var.b, str) && h0Var.h) {
                return h0Var;
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
            h0 h0Var = (h0) obj;
            h0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", h0Var.b);
                jSONObject.put("file_name", h0Var.c);
                jSONObject.put("size", h0Var.g);
                File file = h0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", h0Var.h);
                jSONObject.put("mime", h0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
