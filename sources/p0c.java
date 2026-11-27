// default package

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0c implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p0c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        o0c o0cVar;
        Void lambda$emulateSendNFT$23;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.c;
                uf7 uf7Var = (uf7) this.d;
                ji4 ji4Var = (ji4) this.e;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f;
                ri4 ri4Var = (ri4) this.g;
                synchronized (o0c.class) {
                    WeakReference weakReference = o0c.d;
                    o0cVar = weakReference != null ? (o0c) weakReference.get() : null;
                    if (o0cVar == null) {
                        o0c o0cVar2 = new o0c(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor);
                        o0cVar2.b();
                        o0c.d = new WeakReference(o0cVar2);
                        o0cVar = o0cVar2;
                    }
                }
                return new q0c(uf7Var, o0cVar, new ko9(ji4Var, firebaseMessaging, ri4Var), context, scheduledThreadPoolExecutor);
            default:
                lambda$emulateSendNFT$23 = ((WalletEngine2) this.b).lambda$emulateSendNFT$23((AtomicBoolean) this.c, (String) this.d, (String) this.e, (String) this.f, (icc) this.g);
                return lambda$emulateSendNFT$23;
        }
    }
}
