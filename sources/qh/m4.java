package qh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class m4 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (m4.class) {
            try {
                a.clear();
                b.clear();
                int i9 = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        TLRPC.Photo photo = (TLRPC.Photo) obj;
                        if (photo != null) {
                            a.put(Long.valueOf(photo.id), photo);
                        }
                    }
                }
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i9 < size2) {
                        Object obj2 = arrayList2.get(i9);
                        i9++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (document != null) {
                            b.put(Long.valueOf(document.id), document);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
