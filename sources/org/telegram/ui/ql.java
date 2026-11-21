package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ql extends org.telegram.ui.Cells.k9 {
    public bn w0;

    @Override // org.telegram.ui.Cells.w9
    public final void I(int i7, int i10, org.telegram.messenger.fj fjVar) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.messenger.aj U8;
        bn bnVar = this.w0;
        if (bnVar != null) {
            int min = Math.min(i10, bnVar.getMessagesController().r4 + i7);
            if (fjVar.c1() != 0 && (U8 = this.w0.U8(fjVar.c1())) != null && !U8.i) {
                fjVar = U8.h;
            }
            if (fjVar == null) {
                return;
            }
            rm b10 = rm.b(i7, min, fjVar);
            if (b10.i == null) {
                return;
            }
            rj rjVar = this.w0.a0;
            if (rjVar != null && rjVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.g2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.g2) this.w0).actionBar;
                    if (kVar2.x()) {
                        this.w0.O7(false);
                    }
                }
                this.w0.jc(fjVar, b10);
                rj rjVar2 = this.w0.a0;
                if (rjVar2 != null) {
                    rjVar2.i1();
                    return;
                }
                return;
            }
            bn bnVar2 = this.w0;
            bnVar2.D5 = b10;
            bnVar2.F5 = fjVar;
            bnVar2.x5 = new org.telegram.messenger.jj(bnVar2.h != null, bnVar2.W9(), org.telegram.messenger.v3.p0(this.w0.e));
            bn bnVar3 = this.w0;
            bnVar3.x5.f(bnVar3.F5, bnVar3.U8(fjVar.c1()), this.w0.a(), this.w0.D5);
            Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
            l10.putBoolean("quote", true);
            l10.putInt("messagesCount", 1);
            l10.putBoolean("canSelectTopics", true);
            cx cxVar = new cx(l10);
            bn bnVar4 = this.w0;
            cxVar.E2 = bnVar4;
            bnVar4.presentFragment(cxVar);
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean b() {
        bn bnVar;
        bn bnVar2 = this.w0;
        if ((bnVar2 != null && bnVar2.a() == 489000) || (bnVar = this.w0) == null) {
            return true;
        }
        if (!org.telegram.messenger.n5.C(bnVar.a()) && this.w0.W9()) {
            return false;
        }
        org.telegram.ui.Cells.r9 r9Var = this.W;
        return r9Var == null || ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() == null || ((org.telegram.ui.Cells.r1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.r1) this.W).getMessageObject().k.noforwards;
    }

    public final void d0(bn bnVar) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i7 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = bnVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
            i7++;
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean e() {
        org.telegram.ui.Cells.r9 r9Var;
        bn bnVar;
        org.telegram.ui.Cells.r9 r9Var2;
        TLRPC.Chat chat;
        bn bnVar2 = this.w0;
        if (bnVar2 == null || bnVar2.a() != 489000) {
            bn bnVar3 = this.w0;
            boolean z10 = (bnVar3 != null && bnVar3.W9()) || !((r9Var = this.W) == null || ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() == null || ((org.telegram.ui.Cells.r1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.r1) this.W).getMessageObject().k.noforwards);
            if (!this.s0 && (bnVar = this.w0) != null && bnVar.h == null && (((r9Var2 = this.W) == null || (((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.r1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.r1) this.W).getMessageObject().T4() && !((org.telegram.ui.Cells.r1) this.W).getMessageObject().z3() && ((((org.telegram.ui.Cells.r1) this.W).getMessageObject().y2 == null || org.telegram.messenger.iv.c(((org.telegram.ui.Cells.r1) this.W).getMessageObject())) && !this.w0.u9.q0))) && !this.w0.getMessagesController().v7.B(this.w0.l6) && !org.telegram.messenger.o10.B(this.w0.l6) && (!z10 || (chat = this.w0.e) == null || org.telegram.messenger.v3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int o() {
        bn bnVar = this.w0;
        if (bnVar == null) {
            return 0;
        }
        return bnVar.Ya;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int p() {
        bn bnVar = this.w0;
        if (bnVar == null) {
            return 0;
        }
        return (int) bnVar.P9;
    }

    @Override // org.telegram.ui.Cells.w9
    public final org.telegram.ui.ActionBar.h6 q() {
        bn bnVar = this.w0;
        if (bnVar != null) {
            return bnVar.Ba;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int t(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.w0.Ba);
    }
}
