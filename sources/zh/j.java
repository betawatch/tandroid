package zh;

import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class j implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final ArrayList b;
    public final HashMap c;
    public final HashMap d = new HashMap();
    public final int e;
    public final boolean f;
    public final v0 h;
    public boolean n;
    public boolean r;

    public j(int i10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, int i11, boolean z10, v0 v0Var) {
        this.a = i10;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.b = arrayList2;
        this.c = hashMap2;
        this.e = i11;
        this.f = z10;
        this.h = v0Var;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        FileLoader fileLoader = FileLoader.getInstance(i10);
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            Long l4 = (Long) obj;
            l4.getClass();
            TLRPC.Document document = (TLRPC.Document) hashMap.get(l4);
            if (document != null && ("application/x-tgsticker".equals(document.mime_type) || "video/webm".equals(document.mime_type))) {
                this.d.put(l4, document);
                if (!FileLoader.getInstance(this.a).getPathToAttach(document, true).exists()) {
                    fileLoader.loadFile(document, document, 1, 1);
                }
            }
        }
        a();
    }

    public final void a() {
        File file;
        boolean z10;
        if (this.r || this.n) {
            return;
        }
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            if (!FileLoader.getInstance(this.a).getPathToAttach((TLRPC.Document) it.next(), true).exists()) {
                return;
            }
        }
        this.r = true;
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoadFailed);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            Long l4 = (Long) obj;
            long longValue = l4.longValue();
            TLRPC.Document document = (TLRPC.Document) this.d.get(l4);
            File pathToAttach = document != null ? FileLoader.getInstance(this.a).getPathToAttach(document, true) : null;
            if (document == null || !"video/webm".equals(document.mime_type)) {
                file = pathToAttach;
                z10 = false;
            } else {
                file = pathToAttach;
                z10 = true;
            }
            arrayList.add(new k(longValue, file, z10, (Bitmap) this.c.get(l4)));
        }
        Utilities.globalQueue.postRunnable(new uf.c(20, this, arrayList));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoadFailed && objArr.length > 0) {
            HashMap hashMap = this.d;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                Long l4 = (Long) obj;
                if (FileLoader.getAttachFileName((TLObject) hashMap.get(l4)).equals(objArr[0])) {
                    hashMap.remove(l4);
                }
            }
        }
        a();
    }
}
