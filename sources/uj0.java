// default package

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uj0 implements rzc {
    public final Context a;

    public uj0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            default:
                context.getClass();
                this.a = context;
                break;
        }
    }

    public static s13 b(uj0 uj0Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return uj0Var.d();
        }
        if (obj instanceof ws4) {
            Iterator it = ((ws4) obj).a.iterator();
            while (it.hasNext()) {
                if (((r13) it.next()) instanceof ys4) {
                    return uj0Var.d();
                }
            }
        }
        Context context = uj0Var.a;
        context.getClass();
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return uj0Var.d();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            g23 g23Var = new g23(context);
            g23 g23Var2 = g23Var.isAvailableOnDevice() ? g23Var : null;
            return g23Var2 == null ? uj0Var.d() : g23Var2;
        }
        if (i <= 33) {
            return uj0Var.d();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(fm4 fm4Var) {
        String str = fm4Var.t;
        if (str == null || !ud7.k(str)) {
            return ls6.a(0, 0, 0, 0);
        }
        String str2 = fm4Var.t;
        String str3 = g8c.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return ls6.a(4, 0, 0, 0);
        }
        return ls6.a(1, 0, 0, 0);
    }

    @Override // vzc
    public final Object a() {
        return this.a;
    }

    public final s13 d() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), kk7.P1);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List k = yk2.k(arrayList);
        if (k.isEmpty()) {
            return null;
        }
        Iterator it = k.iterator();
        s13 s13Var = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                newInstance.getClass();
                s13 s13Var2 = (s13) newInstance;
                if (!s13Var2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (s13Var != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    s13Var = s13Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return s13Var;
    }

    public /* synthetic */ uj0(Context context, char c) {
        this.a = context;
    }
}
