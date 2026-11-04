package sb;

import android.util.Log;
import b8.ke;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import org.telegram.messenger.m6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements OnFailureListener, t9.d {
    public static final a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        m6 m6Var = MobileVisionBase.e;
        if (Log.isLoggable(m6Var.a, 6)) {
            String str = m6Var.b;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        return new c(keVar.I(b.class));
    }
}
