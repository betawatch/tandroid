// default package

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class wg4 implements OnSuccessListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ wg4(FirebaseMessaging firebaseMessaging, byte b) {
        this.a = b;
        this.b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z;
        byte b = this.a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (b) {
            case 0:
                owb owbVar = (owb) obj;
                if (!firebaseMessaging.f.z() || owbVar.g.a() == null) {
                    return;
                }
                synchronized (owbVar) {
                    z = owbVar.f;
                }
                if (z) {
                    return;
                }
                owbVar.e(0L);
                return;
            default:
                aj2 aj2Var = (aj2) obj;
                if (aj2Var != null) {
                    xoe.b(aj2Var.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
