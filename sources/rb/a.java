package rb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m.o3;
import org.telegram.tgnet.ConnectionsManager;
import p6.j;
import p6.m;
import p7.d;
import w9.b;
import y7.e7;
import y7.f7;
import y7.ja;
import y7.k7;
import y7.ma;
import y7.oa;
import y7.z6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i3) {
        m.g(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z10 = true;
        if (i3 != 0 && i3 != 90 && i3 != 180 && i3 != 270) {
            z10 = false;
        }
        m.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i3;
        this.e = -1;
    }

    public static a a(Bitmap bitmap, int i3) {
        ma a10;
        Task task;
        a aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i3);
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
        o3 o3Var = new o3();
        o3Var.c = z6.b;
        o3Var.b = e7.b;
        o3Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        o3Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        o3Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        o3Var.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        o3Var.g = Integer.valueOf(i3 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        f7 f7Var = new f7(o3Var);
        d dVar = new d(26, false);
        dVar.c = f7Var;
        mb.m.a.execute(new j1(a10, new b(dVar), task.isSuccessful() ? (String) task.getResult() : j.c.a(a10.g)));
        return aVar;
    }
}
