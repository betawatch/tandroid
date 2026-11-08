package vb;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.HashMap;
import java.util.concurrent.Callable;
import x4.f;
import z7.ha;
import z7.ia;
import z7.pa;
import z7.qa;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(MobileVisionBase mobileVisionBase, ub.a aVar) {
        this.b = mobileVisionBase;
        this.c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ia iaVar;
        int i7 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                ub.a aVar = (ub.a) obj2;
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
