package ub;

import a9.h;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m.q3;
import org.telegram.tgnet.ConnectionsManager;
import q6.j;
import q6.m;
import sg.i0;
import y7.d6;
import z7.e7;
import z7.f7;
import z7.ja;
import z7.k7;
import z7.ma;
import z7.oa;
import z7.z6;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i7) {
        m.g(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z9 = true;
        if (i7 != 0 && i7 != 90 && i7 != 180 && i7 != 270) {
            z9 = false;
        }
        m.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z9);
        this.d = i7;
        this.e = -1;
    }

    public static a a(Bitmap bitmap, int i7) {
        ma a10;
        Task task;
        a aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i7);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (oa.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            a10 = oa.a(new ja());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        k7 k7Var = k7.b;
        Task task2 = a10.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a10.i;
        if (hashMap.get(k7Var) == null) {
            task = task2;
            aVar = aVar2;
        } else {
            task = task2;
            aVar = aVar2;
            if (elapsedRealtime3 - ((Long) hashMap.get(k7Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return aVar;
            }
        }
        hashMap.put(k7Var, Long.valueOf(elapsedRealtime3));
        q3 q3Var = new q3();
        q3Var.c = z6.b;
        q3Var.b = e7.b;
        q3Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        q3Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        q3Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        q3Var.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        q3Var.g = Integer.valueOf(i7 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        f7 f7Var = new f7(q3Var);
        d6 d6Var = new d6();
        d6Var.c = f7Var;
        pb.m.a.execute(new h(a10, new i0(d6Var), task.isSuccessful() ? (String) task.getResult() : j.c.a(a10.g)));
        return aVar;
    }
}
