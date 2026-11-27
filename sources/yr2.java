// default package

import android.content.SharedPreferences;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
