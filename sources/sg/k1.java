package sg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k1 {
    public j1 a;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();

    public final boolean a() {
        return !this.c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.b.put(uuid, runnable);
        this.c.add(uuid);
        org.telegram.messenger.g0.h3(new q2.d(this, 11));
    }

    public final void c() {
        ArrayList arrayList = this.c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.b;
        Runnable runnable = (Runnable) hashMap.get(uuid);
        hashMap.remove(uuid);
        arrayList.remove(size);
        runnable.run();
        org.telegram.messenger.g0.h3(new q2.d(this, 11));
    }
}
