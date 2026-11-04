package za;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import org.telegram.ui.Components.he0;
import x7.a7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ k(FirebaseMessaging firebaseMessaging, int i3) {
        this.a = i3;
        this.b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                u uVar = (u) obj;
                if (!this.b.f.t() || uVar.g.a() == null) {
                    return;
                }
                synchronized (uVar) {
                    z10 = uVar.f;
                }
                if (z10) {
                    return;
                }
                uVar.e(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.b;
                l6.a aVar = (l6.a) obj;
                he0 he0Var = FirebaseMessaging.m;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    a7.b(aVar.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
