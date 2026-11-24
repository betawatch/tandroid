// default package

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z4d implements aq2, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ z4d(ad1 ad1Var) {
        this.a = (byte) 3;
    }

    @Override // aq2
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 0:
                return new ie7((byte) 0);
            default:
                return new l69(gl2Var.O(k69.class));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        cze.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public /* synthetic */ z4d(byte b) {
        this.a = b;
    }
}
