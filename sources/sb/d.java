package sb;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.HashMap;
import java.util.concurrent.Callable;
import w4.f;
import y7.ha;
import y7.ia;
import y7.pa;
import y7.qa;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(MobileVisionBase mobileVisionBase, rb.a aVar) {
        this.b = mobileVisionBase;
        this.c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ia iaVar;
        int i3 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                rb.a aVar = (rb.a) obj2;
                HashMap hashMap = ia.f;
                qa.b();
                int i10 = pa.a;
                qa.b();
                if (Boolean.parseBoolean("")) {
                    HashMap hashMap2 = ia.f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ia("detectorTaskWithResource#run"));
                    }
                    iaVar = (ia) hashMap2.get("detectorTaskWithResource#run");
                } else {
                    iaVar = ha.h;
                }
                iaVar.a();
                try {
                    Object e10 = mobileVisionBase.b.e(aVar);
                    iaVar.close();
                    return e10;
                } catch (Throwable th2) {
                    try {
                        iaVar.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            default:
                return (f) ((ShortcutInfoCompatSaverImpl) obj2).b.get((String) obj);
        }
    }

    public d(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.c = shortcutInfoCompatSaverImpl;
        this.b = str;
    }
}
