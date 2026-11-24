// default package

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ux3 implements Runnable {
    public final ArrayList a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ux3(List list, int i, Throwable th) {
        nte.a(list, "initCallbacks cannot be null");
        this.a = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                ((tx3) arrayList.get(i)).getClass();
                i++;
            }
        } else {
            while (i < size) {
                ((tx3) arrayList.get(i)).a();
                i++;
            }
        }
    }
}
