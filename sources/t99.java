// default package

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class t99 {
    public final String a;
    public final Bundle b;
    public final HashSet c;

    public t99(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(t99[] t99VarArr) {
        if (t99VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[t99VarArr.length];
        for (int i = 0; i < t99VarArr.length; i++) {
            t99 t99Var = t99VarArr[i];
            t99Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(t99Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(t99Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = t99Var.c.iterator();
                while (it.hasNext()) {
                    j00.j(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                sr.s(addExtras);
            }
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
