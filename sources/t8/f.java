package t8;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements com.google.android.gms.common.api.internal.c {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        synchronized (h.k) {
            try {
                ArrayList arrayList = new ArrayList(h.l.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    h hVar = (h) obj;
                    if (hVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = hVar.i.iterator();
                        while (it.hasNext()) {
                            h hVar2 = ((e) it.next()).a;
                            if (!z10) {
                                ((w9.c) hVar2.h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
