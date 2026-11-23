package ub;

import a9.h;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import ga.d;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.ConnectionsManager;
import pb.n;
import q6.j;
import q6.m;
import s2.e;
import y7.s2;
import z7.e7;
import z7.f7;
import z7.ja;
import z7.k7;
import z7.ma;
import z7.oa;
import z7.z6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(int i7, Bitmap bitmap) {
        m.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z10 = true;
        if (i7 != 0 && i7 != 90 && i7 != 180 && i7 != 270) {
            z10 = false;
        }
        m.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i7;
        this.e = -1;
    }

    public static a a(int i7, Bitmap bitmap) {
        ma a10;
        Task task;
        a aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(i7, bitmap);
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
        d dVar = new d();
        dVar.c = z6.b;
        dVar.b = e7.b;
        dVar.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        dVar.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        dVar.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        dVar.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        dVar.h = Integer.valueOf(i7 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        f7 f7Var = new f7(dVar);
        s2 s2Var = new s2(4, false);
        s2Var.d = f7Var;
        n.a.execute(new h(a10, new e(s2Var), task.isSuccessful() ? (String) task.getResult() : j.c.a(a10.g)));
        return aVar;
    }
}
