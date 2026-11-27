// default package

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rr5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ rr5(byte b) {
        this.a = b;
    }

    public final d05 a(Context context, Looper looper, oxb oxbVar, Object obj, k05 k05Var, l05 l05Var) {
        byte b = this.a;
        switch (b) {
            case 2:
                Object obj2 = oxbVar.f;
                Integer num = (Integer) oxbVar.h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new xka(context, looper, oxbVar, bundle, k05Var, l05Var);
            case 3:
                obj.getClass();
                throw new ClassCastException();
            case 4:
            case 5:
            case 6:
            case 8:
            case 11:
            case 14:
            case 15:
            case 17:
            case 19:
            default:
                switch (b) {
                    case 0:
                        context.getClass();
                        looper.getClass();
                        oxbVar.getClass();
                        ((vn) obj).getClass();
                        return new cm5(jn7.W5, k05Var, l05Var, oxbVar, context, looper);
                    case 1:
                        context.getClass();
                        looper.getClass();
                        oxbVar.getClass();
                        ((vn) obj).getClass();
                        return new b5d(429, k05Var, l05Var, oxbVar, context, looper);
                    case 2:
                    case 3:
                    case 7:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case 16:
                    case 18:
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                    case 4:
                        return new e8d(jn7.e5, k05Var, l05Var, oxbVar, context, looper);
                    case 5:
                        return new f6d(449, k05Var, l05Var, oxbVar, context, looper);
                    case 6:
                        return new z7d(context, looper, oxbVar, (jkb) obj, k05Var, l05Var);
                    case 8:
                        return new i8d(k05Var, l05Var, oxbVar, context, looper);
                    case 11:
                        return new qlf(jn7.J1, k05Var, l05Var, oxbVar, context, looper);
                    case 14:
                        return new hsd(k05Var, l05Var, oxbVar, context, looper);
                    case 15:
                        return new bbd(19, k05Var, l05Var, oxbVar, context, looper);
                    case 17:
                        return new rrd(457, k05Var, l05Var, oxbVar, context, looper);
                    case 19:
                        context.getClass();
                        looper.getClass();
                        oxbVar.getClass();
                        ((vn) obj).getClass();
                        return new q4f(380, k05Var, l05Var, oxbVar, context, looper);
                }
            case 7:
                return new p8d(context, looper, oxbVar, (o8d) obj, k05Var, l05Var);
            case 9:
                return new q8d(context, looper, oxbVar, (GoogleSignInOptions) obj, k05Var, l05Var);
            case 10:
                return new qre(40, k05Var, l05Var, oxbVar, context, looper);
            case 12:
                roc rocVar = (roc) obj;
                if (rocVar == null) {
                    rocVar = new roc(new e00());
                }
                return new nad(rocVar.a, k05Var, l05Var, oxbVar, context, looper);
            case 13:
                gd1 gd1Var = (gd1) obj;
                xve.i(gd1Var, "Setting the API options is required.");
                return new bmf(context, looper, oxbVar, gd1Var.a, gd1Var.c, gd1Var.d, k05Var, l05Var);
            case 16:
                gd1 gd1Var2 = (gd1) obj;
                xve.i(gd1Var2, "Setting the API options is required.");
                return new olf(context, looper, oxbVar, gd1Var2.a, gd1Var2.b, gd1Var2.c, k05Var, l05Var);
            case 18:
                return new ape(k05Var, l05Var, oxbVar, context, looper);
            case 20:
                return new v9f(jn7.q2, k05Var, l05Var, oxbVar, context, looper);
            case 21:
                return new gbd(k05Var, l05Var, oxbVar, context, looper);
            case 22:
                return new gcf(jn7.d2, k05Var, l05Var, oxbVar, context, looper);
        }
    }
}
