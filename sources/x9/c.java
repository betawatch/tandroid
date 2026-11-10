package x9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import da.d1;
import da.e1;
import da.j2;
import hd.h;
import hd.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        j.e(context, "context");
        int i7 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = n.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i7) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(h.d(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            d1 d1Var = new d1();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            d1Var.a = str2;
            d1Var.b = runningAppProcessInfo.pid;
            byte b10 = (byte) (d1Var.e | 1);
            d1Var.c = runningAppProcessInfo.importance;
            d1Var.e = (byte) (b10 | 2);
            d1Var.d = j.a(str2, str);
            d1Var.e = (byte) (d1Var.e | 4);
            arrayList3.add(d1Var.a());
        }
        return arrayList3;
    }

    public final j2 b(Context context) {
        Object obj;
        String processName;
        j.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a10 = a(context);
        int size = a10.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = a10.get(i7);
            i7++;
            if (((e1) ((j2) obj)).b == myPid) {
                break;
            }
        }
        j2 j2Var = (j2) obj;
        if (j2Var != null) {
            return j2Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            processName = Process.myProcessName();
            j.b(processName);
        } else if (i10 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        j.e(processName, "processName");
        d1 d1Var = new d1();
        d1Var.a = processName;
        d1Var.b = myPid;
        byte b10 = (byte) (d1Var.e | 1);
        d1Var.c = 0;
        d1Var.d = false;
        d1Var.e = (byte) (((byte) (b10 | 2)) | 4);
        return d1Var.a();
    }
}
