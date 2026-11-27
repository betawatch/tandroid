// default package

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class wi4 implements OnSuccessListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ wi4(FirebaseMessaging firebaseMessaging, byte b) {
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
                q0c q0cVar = (q0c) obj;
                if (!firebaseMessaging.f.x() || q0cVar.g.a() == null) {
                    return;
                }
                synchronized (q0cVar) {
                    z = q0cVar.f;
                }
                if (z) {
                    return;
                }
                q0cVar.e(0L);
                return;
            default:
                wj2 wj2Var = (wj2) obj;
                if (wj2Var != null) {
                    rte.b(wj2Var.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
