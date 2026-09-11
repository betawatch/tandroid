package t9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import fg.f;
import hd.g;
import hd.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import y9.t0;
import y9.t1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        ArrayList arrayList2 = new ArrayList(hd.i.d(arrayList));
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            f fVar = new f();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            fVar.a = str2;
            fVar.b = Integer.valueOf(runningAppProcessInfo.pid);
            fVar.c = Integer.valueOf(runningAppProcessInfo.importance);
            fVar.d = Boolean.valueOf(i.a(runningAppProcessInfo.processName, str));
            arrayList2.add(fVar.g());
        }
        return arrayList2;
    }

    public final t1 b(Context context) {
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
            if (((t0) ((t1) obj)).b == myPid) {
                break;
            }
        }
        t1 t1Var = (t1) obj;
        if (t1Var != null) {
            return t1Var;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            processName = Process.myProcessName();
            i.d(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i11 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        i.e(processName, "processName");
        f fVar = new f();
        fVar.a = processName;
        fVar.b = Integer.valueOf(myPid);
        fVar.c = 0;
        fVar.d = false;
        return fVar.g();
    }
}
