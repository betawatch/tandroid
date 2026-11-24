// default package

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ppd extends dp4 implements c36 {
    public static final WeakHashMap m0 = new WeakHashMap();
    public final dd8 l0 = new dd8();

    @Override // dp4
    public final void A() {
        this.V = true;
        dd8 dd8Var = this.l0;
        dd8Var.a = (byte) 5;
        Iterator it = ((Map) dd8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onDestroy();
        }
    }

    @Override // dp4
    public final void F() {
        this.V = true;
        dd8 dd8Var = this.l0;
        dd8Var.a = (byte) 3;
        Iterator it = ((Map) dd8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onResume();
        }
    }

    @Override // dp4
    public final void G(Bundle bundle) {
        this.l0.c(bundle);
    }

    @Override // dp4
    public final void H() {
        this.V = true;
        dd8 dd8Var = this.l0;
        dd8Var.a = (byte) 2;
        Iterator it = ((Map) dd8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onStart();
        }
    }

    @Override // dp4
    public final void I() {
        this.V = true;
        dd8 dd8Var = this.l0;
        dd8Var.a = (byte) 4;
        Iterator it = ((Map) dd8Var.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onStop();
        }
    }

    @Override // c36
    public final void a(String str, y26 y26Var) {
        this.l0.a(str, y26Var);
    }

    @Override // c36
    public final y26 b(Class cls, String str) {
        return (y26) cls.cast(((Map) this.l0.b).get(str));
    }

    @Override // dp4
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.l0.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // dp4
    public final void x(int i, int i2, Intent intent) {
        super.x(i, i2, intent);
        Iterator it = ((Map) this.l0.b).values().iterator();
        while (it.hasNext()) {
            ((y26) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // dp4
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.l0.b(bundle);
    }
}
