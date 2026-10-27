package xb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m.r3;
import m4.c;
import o6.i;
import o6.l;
import org.telegram.tgnet.ConnectionsManager;
import s4.d;
import sb.m;
import x7.e7;
import x7.f7;
import x7.ja;
import x7.k7;
import x7.ma;
import x7.oa;
import x7.z6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i10) {
        l.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z10 = false;
        }
        l.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i10;
        this.e = -1;
    }

    public static a a(Bitmap bitmap, int i10) {
        ma a2;
        Task task;
        a aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i10);
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
            a2 = oa.a(new ja());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        k7 k7Var = k7.b;
        Task task2 = a2.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.i;
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
        r3 r3Var = new r3();
        r3Var.c = z6.b;
        r3Var.b = e7.b;
        r3Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        r3Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        r3Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        r3Var.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        r3Var.h = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        f7 f7Var = new f7(r3Var);
        d dVar = new d(13, false);
        dVar.d = f7Var;
        m.a.execute(new q1(a2, new c(dVar), task.isSuccessful() ? (String) task.getResult() : i.c.a(a2.g)));
        return aVar;
    }
}
