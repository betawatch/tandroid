// default package

import android.content.SharedPreferences;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class yr2 {
    public final String a;
    public String b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public yr2(String str) {
        this.a = str;
    }

    public final void a(Runnable runnable) {
        this.c.addIfAbsent(runnable);
    }

    public abstract boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue);

    public abstract boolean c(SharedPreferences.Editor editor);

    public abstract void d(SharedPreferences sharedPreferences);

    public final String e() {
        String str = this.b;
        return str != null ? str : this.a;
    }
}
