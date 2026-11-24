// default package

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yb3 implements lr2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yy8 b;

    public /* synthetic */ yb3(yy8 yy8Var, byte b) {
        this.a = b;
        this.b = yy8Var;
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        FirebaseMessaging lambda$getComponents$0;
        byte b = this.a;
        yy8 yy8Var = this.b;
        switch (b) {
            case 0:
                return new ac3((Context) sm2Var.a(Context.class), ((li4) sm2Var.a(li4.class)).d(), sm2Var.N(nf5.class), sm2Var.d(ge3.class), (Executor) sm2Var.i(yy8Var));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(yy8Var, sm2Var);
                return lambda$getComponents$0;
        }
    }
}
