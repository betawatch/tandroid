// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s32 extends q59 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public r32 f;
    public int h;
    public final /* synthetic */ w32 n;

    public s32(w32 w32Var, Context context) {
        this.n = w32Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 0;
    }

    public final Object E(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.d.size()) {
            return null;
        }
        return this.d.get(i2);
    }

    @Override // y59
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return i == b() - 1 ? 2 : 0;
    }

    @Override // y59
    public final void f() {
        super.f();
        this.n.R();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        TLRPC.User user;
        if (u69Var.f == 0) {
            v32 v32Var = (v32) u69Var.a;
            boolean z = i != b() + (-2);
            Object E = E(i);
            if (E instanceof yv2) {
                yv2 yv2Var = (yv2) E;
                user = yv2Var.m;
                if (user == null) {
                    v32Var.setCurrentId(yv2Var.a);
                    v32Var.a(null, (CharSequence) this.e.get(i - 1), new o32(yv2Var, (byte) 1), z);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                v32Var.a(user, (CharSequence) this.e.get(i - 1), new p32(user, (byte) 1), z);
            }
            boolean containsKey = this.n.x.containsKey(m32.a(E));
            jh2 jh2Var = v32Var.d;
            if (jh2Var.getVisibility() != 0) {
                jh2Var.setVisibility(0);
            }
            jh2Var.a(containsKey, false);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View v32Var;
        Context context = this.c;
        if (i == 0) {
            v32Var = new v32(context, this.n.a);
        } else if (i != 1) {
            v32Var = new View(context);
            v32Var.setTag(-33024);
        } else {
            v32Var = new View(context);
            v32Var.setLayoutParams(new g69(-1, gm.L(56.0f)));
            v32Var.setTag(-33024);
        }
        return new b59(v32Var);
    }
}
