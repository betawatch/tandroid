// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q32 extends m59 {
    public final int r = z8c.t0;
    public final Context s;
    public final /* synthetic */ w32 w;

    public q32(w32 w32Var, Context context) {
        this.w = w32Var;
        this.s = context;
    }

    @Override // m59
    public final int M(int i) {
        if (i == 0 || i == R() - 1) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = this.r;
        HashMap hashMap = bw2.r(i3).c0;
        ArrayList arrayList = bw2.r(i3).d0;
        if (i2 < arrayList.size()) {
            return ((ArrayList) hashMap.get(arrayList.get(i2))).size();
        }
        return 0;
    }

    @Override // m59
    public final Object O(int i, int i2) {
        if (i == 0) {
            return null;
        }
        int i3 = i - 1;
        int i4 = this.r;
        HashMap hashMap = bw2.r(i4).c0;
        ArrayList arrayList = bw2.r(i4).d0;
        if (i3 < arrayList.size()) {
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i3));
            if (i2 < arrayList2.size()) {
                return arrayList2.get(i2);
            }
        }
        return null;
    }

    @Override // m59
    public final int P(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return i == R() - 1 ? 2 : 0;
    }

    @Override // m59
    public final int R() {
        return bw2.r(this.r).d0.size() + 2;
    }

    @Override // m59
    public final boolean V(int i, int i2, u69 u69Var) {
        if (i == 0 || i == R() - 1) {
            return false;
        }
        int i3 = this.r;
        return i2 < ((ArrayList) bw2.r(i3).c0.get(bw2.r(i3).d0.get(i + (-1)))).size();
    }

    @Override // m59
    public final void W(int i, int i2, u69 u69Var) {
        TLRPC.User user;
        if (u69Var.f == 0) {
            v32 v32Var = (v32) u69Var.a;
            Object O = O(i, i2);
            boolean z = true;
            if (i == R() - 2 && i2 == M(i) - 1) {
                z = false;
            }
            if (O instanceof yv2) {
                yv2 yv2Var = (yv2) O;
                user = yv2Var.m;
                if (user == null) {
                    v32Var.setCurrentId(yv2Var.a);
                    v32Var.a(null, bw2.m(0, yv2Var.i, yv2Var.j), new o32(yv2Var, (byte) 0), z);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                v32Var.a(user, null, new p32(user, (byte) 0), z);
            }
            boolean containsKey = this.w.x.containsKey(m32.a(O));
            jh2 jh2Var = v32Var.d;
            if (jh2Var.getVisibility() != 0) {
                jh2Var.setVisibility(0);
            }
            jh2Var.a(containsKey, false);
        }
    }

    @Override // m59, y59
    public final void f() {
        X(false);
        this.w.R();
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View v32Var;
        Context context = this.s;
        if (i == 0) {
            v32Var = new v32(context, this.w.a);
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
