// default package

import android.graphics.BlendMode;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.pnv.internal.FirebasePhoneNumberVerificationRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class xi4 implements tq2, zla, ama, nu4, Continuation, dq7, tl5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ xi4(fp fpVar) {
        this.a = (byte) 18;
    }

    public static /* bridge */ /* synthetic */ BlendMode f(Object obj) {
        return (BlendMode) obj;
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void i(Object obj, Object obj2) {
        throw new ifb("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void l(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void m(String str, int i, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    @Override // tl5
    public final boolean b(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 22:
                return false;
            default:
                return i != 2 ? !(i2 == 65 && i3 == 80 && i4 == 73 && i5 == 67) : !(i2 == 80 && i3 == 73 && i4 == 67);
        }
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        zi4 components$lambda$0;
        gj4 components$lambda$02;
        jj4 components$lambda$1;
        switch (this.a) {
            case 1:
                components$lambda$0 = FirebasePhoneNumberVerificationRegistrar.getComponents$lambda$0(am2Var);
                return components$lambda$0;
            case 2:
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(am2Var);
                return components$lambda$1;
            case 3:
                components$lambda$02 = FirebaseSessionsRegistrar.getComponents$lambda$0(am2Var);
                return components$lambda$02;
        }
    }

    @Override // dq7
    public final String c(int i) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i));
    }

    @Override // ama
    public final void d(Object obj, float f) {
        xl4 xl4Var = (xl4) obj;
        switch (this.a) {
            case 7:
                WindowManager.LayoutParams layoutParams = xl4Var.f;
                xl4Var.E = f;
                layoutParams.x = (int) f;
                xl4Var.v();
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = xl4Var.f;
                xl4Var.F = f;
                layoutParams2.y = (int) f;
                xl4Var.v();
                break;
        }
    }

    @Override // zla
    public final float get(Object obj) {
        xl4 xl4Var = (xl4) obj;
        switch (this.a) {
            case 6:
                return xl4Var.E;
            default:
                return xl4Var.F;
        }
    }

    @Override // nu4
    public final Object h(Object obj) {
        do6 do6Var = wt4.k0;
        return 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            su3.e("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            su3.e("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            su3.e(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        su3.e("SERVICE_NOT_AVAILABLE");
        return null;
    }

    public /* synthetic */ xi4(byte b) {
        this.a = b;
    }
}
