package v7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class v {
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.emoji2.text.r a(Context context) {
        ProviderInfo providerInfo;
        o0.e eVar;
        ApplicationInfo applicationInfo;
        rb.a cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(2) : new rb.a(2);
        PackageManager packageManager = context.getPackageManager();
        w7.k6.a(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] N3 = cVar.N3(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : N3) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new o0.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
            }
            if (eVar != null) {
                return null;
            }
            return new androidx.emoji2.text.r(new androidx.emoji2.text.q(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }
}
