// default package

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yj6 extends nfa {
    public final /* synthetic */ zj6 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj6(zj6 zj6Var, Context context, long j, ffa ffaVar, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i, zj6 zj6Var2, xj6 xj6Var, wjb wjbVar, kl0 kl0Var) {
        super(context, j, ffaVar, 0, null, chatFull, userFull, i, 0, zj6Var2, xj6Var, 0, wjbVar, kl0Var);
        this.x2 = zj6Var;
    }

    @Override // nfa
    public final boolean H() {
        zj6 zj6Var = this.x2;
        return zj6Var.c0() || zj6Var.a == 3;
    }

    @Override // nfa
    public final void J0(SparseArray sparseArray) {
        int size = sparseArray.size();
        zj6 zj6Var = this.x2;
        zj6Var.w = sparseArray;
        u41 u41Var = zj6Var.O;
        if (u41Var != null) {
            u41Var.setEnabled(size > 0);
            zj6Var.O.c(size, true);
            if (zj6Var.S.getClosestTab() == 8) {
                zj6Var.O.i(k96.G(size, "ArchiveStories", new Object[0]), true, true);
            }
        }
    }

    @Override // nfa
    public final void R0(boolean z) {
        int i;
        zj6 zj6Var = this.x2;
        Activity parentActivity = zj6Var.getParentActivity();
        i = ((d) zj6Var).classGuid;
        gl.y2(parentActivity, i);
    }

    @Override // nfa
    public final void S0() {
        super.S0();
        this.x2.e0();
    }

    @Override // nfa
    public final void T0(float f) {
        zj6 zj6Var = this.x2;
        if (zj6Var.a != 1) {
            return;
        }
        int i = Math.round(f - 8.0f) > 0 ? 1 : 0;
        ch6 ch6Var = zj6Var.K;
        if (ch6Var != null && zj6Var.M != i) {
            zj6Var.M = i;
            ch6Var.r(zj6Var.L[i], true);
        }
        zj6Var.f0(true);
    }

    @Override // nfa
    public final int getInitialTab() {
        return this.x2.T;
    }

    @Override // nfa
    public final String getStoriesHashtag() {
        return this.x2.h;
    }

    @Override // nfa
    public final String getStoriesHashtagUsername() {
        return this.x2.n;
    }

    @Override // nfa
    public final boolean h0() {
        zj6 zj6Var = this.x2;
        return zj6Var.a == 0 && zj6Var.e == zj6Var.getUserConfig().e() && zj6Var.f == 0;
    }

    @Override // nfa
    public final boolean i0() {
        return this.x2.c0();
    }

    @Override // nfa
    public final boolean k0() {
        return this.x2.a == 2;
    }

    @Override // nfa
    public final void l1(boolean z) {
        if (this.F1 != z) {
            super.l1(z);
            zj6 zj6Var = this.x2;
            if (zj6Var.c0()) {
                if (z) {
                    r1(null);
                }
                this.P1 = z;
            }
            fm0 fm0Var = zj6Var.P;
            if (fm0Var != null) {
                fm0Var.a(z, true);
            }
        }
    }

    @Override // nfa
    public final boolean q() {
        return !this.x2.c0();
    }

    @Override // nfa
    public final boolean s0() {
        return this.x2.c0();
    }
}
