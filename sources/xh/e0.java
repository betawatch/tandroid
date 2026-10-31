package xh;

import android.app.DownloadManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e0 {
    public Long a;
    public final String b;
    public final String c;
    public File d;
    public final String e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public long j;
    public boolean k;
    public boolean l;
    public final Runnable m = new d0(this, 0);
    public final /* synthetic */ f0 n;

    public e0(f0 f0Var, String str, String str2) {
        this.n = f0Var;
        this.b = str;
        this.c = str2;
        TLRPC.User Z1 = vp.r1(f0Var.b).Z1(Long.valueOf(f0Var.c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(h20.p(Z1));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.n("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.a = Long.valueOf(f0Var.d.enqueue(request));
    }

    public final void a() {
        f0 f0Var = this.n;
        f0Var.getClass();
        this.i = true;
        Long l4 = this.a;
        if (l4 != null) {
            f0Var.d.remove(l4.longValue());
            this.a = null;
        }
        f0Var.e.remove(this);
        f0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.g), Long.valueOf(this.g));
        }
        if (this.a == null || this.i) {
            return new Pair(Long.valueOf(this.f), Long.valueOf(this.g));
        }
        if (System.currentTimeMillis() - this.j < 150) {
            return new Pair(Long.valueOf(this.f), Long.valueOf(this.g));
        }
        d();
        return new Pair(Long.valueOf(this.f), Long.valueOf(this.g));
    }

    public final boolean c() {
        return (this.h || this.a == null) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (0 == 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        f0 f0Var = this.n;
        if (this.h || this.i) {
            return;
        }
        Runnable runnable = this.m;
        org.telegram.messenger.i0.r(runnable);
        this.j = System.currentTimeMillis();
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(this.a.longValue());
        Cursor cursor = null;
        try {
            try {
                cursor = f0Var.d.query(query);
                if (cursor.moveToFirst()) {
                    int i10 = cursor.getInt(cursor.getColumnIndex("status"));
                    if (i10 == 8) {
                        File file = new File(Uri.parse(cursor.getString(cursor.getColumnIndex("local_uri"))).getPath());
                        this.d = file;
                        this.h = true;
                        long length = file.length();
                        this.g = length;
                        if (length <= 0) {
                            a();
                        }
                        f0Var.f();
                    } else if (i10 == 16) {
                        a();
                        cursor.close();
                        return;
                    } else {
                        this.f = cursor.getLong(cursor.getColumnIndex("bytes_so_far"));
                        this.g = cursor.getLong(cursor.getColumnIndex("total_size"));
                        org.telegram.messenger.i0.h3(runnable, 160L);
                    }
                } else if (!this.h) {
                    a();
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
            cursor.close();
            f0Var.e();
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public e0(f0 f0Var, JSONObject jSONObject) {
        this.n = f0Var;
        this.b = jSONObject.optString("url");
        this.c = jSONObject.optString("file_name");
        this.g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
