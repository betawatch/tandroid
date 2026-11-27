// default package

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class s9d implements tq2, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ s9d(id1 id1Var) {
        this.a = (byte) 3;
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 0:
                return new sg7((byte) 0);
            default:
                return new y99(am2Var.N(x99.class));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        v3f.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public /* synthetic */ s9d(byte b) {
        this.a = b;
    }
}
