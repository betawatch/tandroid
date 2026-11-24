// default package

import android.os.SystemClock;
import j$.util.Collection;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class tmc implements Runnable {
    public final /* synthetic */ umc a;

    public tmc(umc umcVar) {
        this.a = umcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        umc umcVar = this.a;
        WeakHashMap weakHashMap = umcVar.e;
        Collection.-EL.removeIf(weakHashMap.entrySet(), new vd((byte) 3, uptimeMillis));
        if (weakHashMap.isEmpty()) {
            umcVar.a();
        } else {
            umcVar.d.postDelayed(this, 250L);
        }
    }
}
