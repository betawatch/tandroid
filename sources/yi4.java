// default package

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yi4 implements OnSuccessListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ yi4(FirebaseMessaging firebaseMessaging, byte b) {
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
                ryb rybVar = (ryb) obj;
                if (!firebaseMessaging.f.z() || rybVar.g.a() == null) {
                    return;
                }
                synchronized (rybVar) {
                    z = rybVar.f;
                }
                if (z) {
                    return;
                }
                rybVar.e(0L);
                return;
            default:
                ok2 ok2Var = (ok2) obj;
                if (ok2Var != null) {
                    are.b(ok2Var.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
