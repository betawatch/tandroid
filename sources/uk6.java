// default package

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uk6 implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ vk6 b;

    public uk6(vk6 vk6Var, ek6 ek6Var) {
        this.b = vk6Var;
        Handler q = g8c.q(this);
        this.a = q;
        ek6Var.m(this, q);
    }

    public final void a(long j) {
        Surface surface;
        vk6 vk6Var = this.b;
        v8b v8bVar = vk6Var.c1;
        if (this != vk6Var.Q1 || vk6Var.c0 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            vk6Var.M0 = true;
            return;
        }
        try {
            vk6Var.I0(j);
            icc iccVar = vk6Var.L1;
            if (!iccVar.equals(icc.d) && !iccVar.equals(vk6Var.M1)) {
                vk6Var.M1 = iccVar;
                v8bVar.q(iccVar);
            }
            vk6Var.O0.e++;
            uac uacVar = vk6Var.f1;
            boolean z = uacVar.e != 3;
            uacVar.e = 3;
            uacVar.k.getClass();
            uacVar.g = g8c.T(SystemClock.elapsedRealtime());
            if (z && (surface = vk6Var.v1) != null) {
                v8bVar.p(surface);
                vk6Var.y1 = true;
            }
            vk6Var.n0(j);
        } catch (j54 e) {
            vk6Var.N0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = g8c.a;
        a(((i & 4294967295L) << 32) | (i2 & 4294967295L));
        return true;
    }
}
