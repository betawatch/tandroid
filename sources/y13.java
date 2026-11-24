// default package

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class y13 {
    public static final t13 a = new t13();
    public static final Set b;
    public static final boolean c;
    public static final /* synthetic */ int d = 0;

    static {
        Set set;
        Integer[] numArr = {7, 20};
        int length = numArr.length;
        if (length == 0) {
            set = f24.a;
        } else if (length != 1) {
            set = new LinkedHashSet(qi6.b(numArr.length));
            for (Integer num : numArr) {
                set.add(num);
            }
        } else {
            set = Collections.singleton(numArr[0]);
            set.getClass();
        }
        b = set;
        c = true;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        resultReceiver.getClass();
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", c ? 1 : 0);
        intent.putExtra("RESULT_RECEIVER", c(resultReceiver));
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, eq4 eq4Var, Executor executor, o13 o13Var, CancellationSignal cancellationSignal) {
        executor.getClass();
        o13Var.getClass();
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        Object invoke = eq4Var.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"));
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (l23.a(cancellationSignal)) {
            return true;
        }
        executor.execute(new gu2((Object) o13Var, invoke, (byte) 19));
        return true;
    }

    public static ResultReceiver c(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        resultReceiver.getClass();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}
