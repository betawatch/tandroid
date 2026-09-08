package v8;

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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class a {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public static final long b = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int c = 0;

    public static void a(Task task, Activity activity) {
        v vVar = new v();
        int incrementAndGet = v.f.incrementAndGet();
        vVar.a = incrementAndGet;
        v.e.put(incrementAndGet, vVar);
        v.d.postDelayed(vVar, a);
        task.addOnCompleteListener(vVar);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i10 = vVar.a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i10);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", b);
        w wVar = new w();
        wVar.setArguments(bundle);
        int i11 = vVar.a;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb2.append(i11);
        beginTransaction.add(wVar, sb2.toString()).commit();
    }

    public static void b(Activity activity, int i10, int i11, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i10, intent, TLObject.FLAG_30);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                createPendingResult.send(i11);
            } catch (PendingIntent.CanceledException e7) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e7);
                }
            }
        }
    }
}
