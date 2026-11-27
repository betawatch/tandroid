// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x22 extends c79 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public w22 f;
    public int h;
    public final /* synthetic */ b32 n;

    public x22(b32 b32Var, Context context) {
        this.n = b32Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 0;
    }

    public final Object E(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.d.size()) {
            return null;
        }
        return this.d.get(i2);
    }

    @Override // j79
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return i == b() - 1 ? 2 : 0;
    }

    @Override // j79
    public final void f() {
        super.f();
        this.n.R();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        TLRPC.User user;
        if (f89Var.f == 0) {
            a32 a32Var = (a32) f89Var.a;
            boolean z = i != b() + (-2);
            Object E = E(i);
            if (E instanceof iv2) {
                iv2 iv2Var = (iv2) E;
                user = iv2Var.m;
                if (user == null) {
                    a32Var.setCurrentId(iv2Var.a);
                    a32Var.a(null, (CharSequence) this.e.get(i - 1), new t22(iv2Var, (byte) 1), z);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                a32Var.a(user, (CharSequence) this.e.get(i - 1), new u22(user, (byte) 1), z);
            }
            boolean containsKey = this.n.x.containsKey(r22.a(E));
            og2 og2Var = a32Var.d;
            if (og2Var.getVisibility() != 0) {
                og2Var.setVisibility(0);
            }
            og2Var.a(containsKey, false);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View a32Var;
        Context context = this.c;
        if (i == 0) {
            a32Var = new a32(context, this.n.a);
        } else if (i != 1) {
            a32Var = new View(context);
            a32Var.setTag(-33024);
        } else {
            a32Var = new View(context);
            a32Var.setLayoutParams(new r79(-1, hl.L(56.0f)));
            a32Var.setTag(-33024);
        }
        return new n69(a32Var);
    }
}
