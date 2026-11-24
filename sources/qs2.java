// default package

import android.content.SharedPreferences;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qs2 {
    public final String a;
    public String b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public qs2(String str) {
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
