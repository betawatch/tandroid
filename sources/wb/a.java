package wb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import lf.g;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class a implements OnFailureListener, q9.d {
    public static final a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    @Override // q9.d
    public Object E(cf.c cVar) {
        return new c(cVar.q(b.class));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        g gVar = MobileVisionBase.e;
        if (Log.isLoggable(gVar.b, 6)) {
            String str = gVar.c;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }
}
