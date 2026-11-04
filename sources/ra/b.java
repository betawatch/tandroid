package ra;

import android.content.Context;
import b8.ke;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
import t9.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements t9.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ b(r rVar, int i3) {
        this.a = i3;
        this.b = rVar;
    }

    @Override // t9.d
    public final Object q1(ke keVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.a) {
            case 0:
                return new d((Context) keVar.a(Context.class), ((n9.h) keVar.a(n9.h.class)).d(), keVar.I(e.class), keVar.f(bb.b.class), (Executor) keVar.g(this.b));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, keVar);
                return lambda$getComponents$0;
        }
    }
}
