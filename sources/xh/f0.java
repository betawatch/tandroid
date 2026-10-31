package xh;

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
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public e0 f;

    public f0(Context context, int i10, long j10) {
        this.a = context;
        this.b = i10;
        this.c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i10, 0).getStringSet("" + j10, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    e0 e0Var = new e0(this, new JSONObject(it.next()));
                    File file = e0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(e0Var);
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    public static void a() {
        Context context = org.telegram.messenger.w0.b;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botdownloads_" + i10, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static f0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = g;
        f0 f0Var = (f0) hashMap.get(pair);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(context, i10, j10);
        hashMap.put(pair, f0Var2);
        return f0Var2;
    }

    public final void b(String str, String str2) {
        e0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            e0 e0Var = new e0(this, str, str2);
            this.f = e0Var;
            e0Var.l = false;
            this.e.add(e0Var);
            f();
            e();
        }
    }

    public final e0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e0 e0Var = (e0) obj;
            if (TextUtils.equals(e0Var.b, str) && e0Var.h) {
                return e0Var;
            }
        }
        return null;
    }

    public final void e() {
        zs.f(this.b).k(zs.J3, new Object[0]);
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
            e0 e0Var = (e0) obj;
            e0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", e0Var.b);
                jSONObject.put("file_name", e0Var.c);
                jSONObject.put("size", e0Var.g);
                File file = e0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", e0Var.h);
                jSONObject.put("mime", e0Var.e);
            } catch (Exception e) {
                f8.g(e, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
