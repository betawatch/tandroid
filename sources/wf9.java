// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class wf9 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (wf9.class) {
            a.clear();
            b.clear();
            int i = 0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    TLRPC.Photo photo = (TLRPC.Photo) obj;
                    if (photo != null) {
                        a.put(Long.valueOf(photo.id), photo);
                    }
                }
            }
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    TLRPC.Document document = (TLRPC.Document) obj2;
                    if (document != null) {
                        b.put(Long.valueOf(document.id), document);
                    }
                }
            }
        }
    }
}
