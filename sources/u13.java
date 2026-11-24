// default package

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u13 implements qp4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u13(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // qp4
    public final Object invoke(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                w13 w13Var = (w13) obj2;
                Context context = w13Var.e;
                ih0 ih0Var = (ih0) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!l23.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    y13.a(w13Var.i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", ih0Var.a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal)) {
                            w13Var.f().execute(new mk2(w13Var, (byte) 14));
                        }
                    }
                }
                return g5cVar;
            case 1:
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj3;
                d23 d23Var = (d23) obj2;
                Context context2 = d23Var.e;
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!l23.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    y13.a(d23Var.i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal2)) {
                            Executor executor = d23Var.g;
                            if (executor == null) {
                                rp5.e("executor");
                                throw null;
                            }
                            executor.execute(new b23(d23Var, (byte) 0));
                        }
                    }
                }
                return g5cVar;
            case 2:
                i23 i23Var = (i23) obj2;
                Context context3 = i23Var.e;
                z28 z28Var = (z28) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!l23.a((CancellationSignal) obj3)) {
                    Intent intent3 = new Intent(context3, (Class<?>) IdentityCredentialApiHiddenActivity.class);
                    intent3.setFlags(65536);
                    intent3.putExtra("RESULT_RECEIVER", y13.c(i23Var.i));
                    intent3.putExtra("EXTRA_FLOW_PENDING_INTENT", z28Var.a);
                    intent3.putExtra("EXTRA_ERROR_NAME", "GET_UNKNOWN");
                    context3.startActivity(intent3);
                }
                return g5cVar;
            default:
                ((kc5) obj3).c.removeCallbacks((rld) obj2);
                return g5cVar;
        }
    }
}
