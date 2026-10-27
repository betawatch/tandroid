package v9;

import aa.v0;
import aa.v1;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import kd.g;
import kd.o;
import kotlin.jvm.internal.i;
import ti.e;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    public static ArrayList a(Context context) {
        i.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = o.a;
        }
        ArrayList f7 = g.f(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = f7.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = f7.get(i12);
            i12++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kd.i.d(arrayList));
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            e eVar = new e(1, false);
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            eVar.b = str2;
            eVar.c = Integer.valueOf(runningAppProcessInfo.pid);
            eVar.d = Integer.valueOf(runningAppProcessInfo.importance);
            eVar.e = Boolean.valueOf(i.a(runningAppProcessInfo.processName, str));
            arrayList2.add(eVar.c());
        }
        return arrayList2;
    }

    public final v1 b(Context context) {
        Object obj;
        String processName;
        i.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = a2.get(i10);
            i10++;
            if (((v0) ((v1) obj)).b == myPid) {
                break;
            }
        }
        v1 v1Var = (v1) obj;
        if (v1Var != null) {
            return v1Var;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            processName = Process.myProcessName();
            i.d(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i11 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        i.e(processName, "processName");
        e eVar = new e(1, false);
        eVar.b = processName;
        eVar.c = Integer.valueOf(myPid);
        eVar.d = 0;
        eVar.e = false;
        return eVar.c();
    }
}
