package vb;

import a8.r7;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a implements OnFailureListener, u9.d {
    public static final a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    @Override // u9.d
    public Object i(r7 r7Var) {
        return new c(r7Var.I(b.class));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        k8.a aVar = MobileVisionBase.e;
        if (Log.isLoggable((String) aVar.b, 6)) {
            String str = (String) aVar.c;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }
}
