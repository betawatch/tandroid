// default package

import android.os.SystemClock;
import j$.util.Collection;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class toc implements Runnable {
    public final /* synthetic */ uoc a;

    public toc(uoc uocVar) {
        this.a = uocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        uoc uocVar = this.a;
        WeakHashMap weakHashMap = uocVar.e;
        Collection.-EL.removeIf(weakHashMap.entrySet(), new ve((byte) 3, uptimeMillis));
        if (weakHashMap.isEmpty()) {
            uocVar.a();
        } else {
            uocVar.d.postDelayed(this, 250L);
        }
    }
}
