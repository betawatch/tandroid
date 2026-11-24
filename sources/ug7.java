// default package

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ug7 extends FileObserver {
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public final CopyOnWriteArrayList a;

    public ug7(String str) {
        super(str, 128);
        this.a = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qp4) it.next()).invoke(str);
        }
    }
}
