package pb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements OnFailureListener, r9.d {
    public static final a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    @Override // r9.d
    public Object K(bh.d dVar) {
        return new c(dVar.J(b.class));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        c5.a aVar = MobileVisionBase.e;
        if (Log.isLoggable(aVar.b, 6)) {
            String str = aVar.c;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }
}
