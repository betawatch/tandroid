package y8;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class a {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public static final long b = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int c = 0;

    public static void a(Task task, Activity activity) {
        t tVar = new t();
        int incrementAndGet = t.f.incrementAndGet();
        tVar.a = incrementAndGet;
        t.e.put(incrementAndGet, tVar);
        t.d.postDelayed(tVar, a);
        task.addOnCompleteListener(tVar);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i7 = tVar.a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i7);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", b);
        u uVar = new u();
        uVar.setArguments(bundle);
        int i10 = tVar.a;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb2.append(i10);
        beginTransaction.add(uVar, sb2.toString()).commit();
    }

    public static void b(Activity activity, int i7, int i10, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i7, intent, TLObject.FLAG_30);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                createPendingResult.send(i10);
            } catch (PendingIntent.CanceledException e10) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e10);
                }
            }
        }
    }
}
