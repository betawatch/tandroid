// default package

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ot1 extends bmb {
    public zu1 w0;

    @Override // mmb
    public final void H(int i, int i2, r47 r47Var) {
        a aVar;
        a aVar2;
        m47 T6;
        zu1 zu1Var = this.w0;
        if (zu1Var != null) {
            int min = Math.min(i2, zu1Var.getMessagesController().l4.V1.f() + i);
            if (r47Var.c1() != 0 && (T6 = this.w0.T6(r47Var.c1())) != null && !T6.i) {
                r47Var = T6.h;
            }
            if (r47Var != null) {
                ou1 b = ou1.b(i, min, r47Var);
                if (b.i != null) {
                    nr1 nr1Var = this.w0.a0;
                    if (nr1Var != null && nr1Var.getVisibility() == 0) {
                        aVar = ((e) this.w0).actionBar;
                        if (aVar != null) {
                            aVar2 = ((e) this.w0).actionBar;
                            if (aVar2.z()) {
                                this.w0.L5(false);
                            }
                        }
                        this.w0.ec(r47Var, b);
                        nr1 nr1Var2 = this.w0.a0;
                        if (nr1Var2 != null) {
                            nr1Var2.o1();
                            return;
                        }
                        return;
                    }
                    zu1 zu1Var2 = this.w0;
                    zu1Var2.D5 = b;
                    zu1Var2.F5 = r47Var;
                    zu1Var2.x5 = new v47(zu1Var2.h != null, zu1Var2.a8(), xc2.p0(this.w0.e));
                    zu1 zu1Var3 = this.w0;
                    zu1Var3.x5.f(zu1Var3.F5, zu1Var3.T6(r47Var.c1()), this.w0.a(), this.w0.D5);
                    Bundle j = qd4.j(3, "onlySelect", "dialogsType", true);
                    j.putBoolean("quote", true);
                    j.putInt("messagesCount", 1);
                    j.putBoolean("canSelectTopics", true);
                    uj3 uj3Var = new uj3(j);
                    zu1 zu1Var4 = this.w0;
                    uj3Var.E2 = zu1Var4;
                    zu1Var4.presentFragment(uj3Var);
                }
            }
        }
    }

    @Override // mmb
    public final boolean a() {
        zu1 zu1Var;
        zu1 zu1Var2 = this.w0;
        if ((zu1Var2 != null && zu1Var2.a() == 489000) || (zu1Var = this.w0) == null) {
            return true;
        }
        if (!wf3.B(zu1Var.a()) && this.w0.a8()) {
            return false;
        }
        hmb hmbVar = this.W;
        return hmbVar == null || ((wb2) hmbVar).getMessageObject() == null || ((wb2) this.W).getMessageObject().k == null || !((wb2) this.W).getMessageObject().k.noforwards;
    }

    public final void c0(zu1 zu1Var) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i >= sparseArray.size()) {
                sparseArray.clear();
                e(false);
                this.C = null;
                this.w0 = zu1Var;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i))).cancel();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r3.u9.q0 == false) goto L42;
     */
    @Override // mmb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        hmb hmbVar;
        zu1 zu1Var;
        TLRPC.Chat chat;
        zu1 zu1Var2 = this.w0;
        if (zu1Var2 == null || zu1Var2.a() != 489000) {
            zu1 zu1Var3 = this.w0;
            boolean z = (zu1Var3 != null && zu1Var3.a8()) || !((hmbVar = this.W) == null || ((wb2) hmbVar).getMessageObject() == null || ((wb2) this.W).getMessageObject().k == null || !((wb2) this.W).getMessageObject().k.noforwards);
            if (!this.s0 && (zu1Var = this.w0) != null && zu1Var.h == null) {
                hmb hmbVar2 = this.W;
                if (hmbVar2 != null) {
                    if (((wb2) hmbVar2).getMessageObject() != null && ((wb2) this.W).getMessageObject().D != 23 && !((wb2) this.W).getMessageObject().S4() && !((wb2) this.W).getMessageObject().z3() && (((wb2) this.W).getMessageObject().y2 == null || ll9.c(((wb2) this.W).getMessageObject()))) {
                        zu1Var = this.w0;
                    }
                }
                if (!zu1Var.getMessagesController().j4.A(this.w0.l6) && !lbc.C(this.w0.l6) && (!z || (chat = this.w0.e) == null || xc2.B(chat))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // mmb
    public final int n() {
        zu1 zu1Var = this.w0;
        if (zu1Var == null) {
            return 0;
        }
        return zu1Var.Ya;
    }

    @Override // mmb
    public final int o() {
        zu1 zu1Var = this.w0;
        if (zu1Var == null) {
            return 0;
        }
        return (int) zu1Var.P9;
    }

    @Override // mmb
    public final vnb p() {
        zu1 zu1Var = this.w0;
        if (zu1Var != null) {
            return zu1Var.Ba;
        }
        return null;
    }

    @Override // mmb
    public final int s(int i) {
        return aob.v0(i, this.w0.Ba);
    }
}
