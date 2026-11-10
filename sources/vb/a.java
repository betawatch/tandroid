package vb;

import a8.r7;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a implements OnFailureListener, u9.d {
    public static final a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    @Override // u9.d
    public Object e(r7 r7Var) {
        return new c(r7Var.H(b.class));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        f5.a aVar = MobileVisionBase.e;
        if (Log.isLoggable(aVar.a, 6)) {
            String str = aVar.b;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }
}
