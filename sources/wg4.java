// default package

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                if (!firebaseMessaging.f.A() || owbVar.g.a() == null) {
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
