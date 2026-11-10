package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rl extends org.telegram.ui.Cells.j9 {
    public cn w0;

    @Override // org.telegram.ui.Cells.v9
    public final void I(int i7, int i10, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.messenger.dj T8;
        cn cnVar = this.w0;
        if (cnVar != null) {
            int min = Math.min(i10, cnVar.getMessagesController().o4 + i7);
            if (ijVar.c1() != 0 && (T8 = this.w0.T8(ijVar.c1())) != null && !T8.i) {
                ijVar = T8.h;
            }
            if (ijVar == null) {
                return;
            }
            sm b10 = sm.b(i7, min, ijVar);
            if (b10.i == null) {
                return;
            }
            sj sjVar = this.w0.Z;
            if (sjVar != null && sjVar.getVisibility() == 0) {
                lVar = ((org.telegram.ui.ActionBar.f2) this.w0).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.f2) this.w0).actionBar;
                    if (lVar2.x()) {
                        this.w0.O7(false);
                    }
                }
                this.w0.ic(ijVar, b10);
                sj sjVar2 = this.w0.Z;
                if (sjVar2 != null) {
                    sjVar2.H0();
                    return;
                }
                return;
            }
            cn cnVar2 = this.w0;
            cnVar2.B5 = b10;
            cnVar2.D5 = ijVar;
            cnVar2.v5 = new org.telegram.messenger.mj(cnVar2.h != null, cnVar2.V9(), org.telegram.messenger.t3.p0(this.w0.e));
            cn cnVar3 = this.w0;
            cnVar3.v5.f(cnVar3.D5, cnVar3.T8(ijVar.c1()), this.w0.a(), this.w0.B5);
            Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
            h.putBoolean("quote", true);
            h.putInt("messagesCount", 1);
            h.putBoolean("canSelectTopics", true);
            zw zwVar = new zw(h);
            cn cnVar4 = this.w0;
            zwVar.D2 = cnVar4;
            cnVar4.presentFragment(zwVar);
        }
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean b() {
        cn cnVar;
        cn cnVar2 = this.w0;
        if ((cnVar2 != null && cnVar2.a() == 489000) || (cnVar = this.w0) == null) {
            return true;
        }
        if (!org.telegram.messenger.m5.C(cnVar.a()) && this.w0.V9()) {
            return false;
        }
        org.telegram.ui.Cells.q9 q9Var = this.W;
        return q9Var == null || ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards;
    }

    public final void d0(cn cnVar) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i7 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = cnVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
            i7++;
        }
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean e() {
        org.telegram.ui.Cells.q9 q9Var;
        cn cnVar;
        org.telegram.ui.Cells.q9 q9Var2;
        TLRPC.Chat chat;
        cn cnVar2 = this.w0;
        if (cnVar2 == null || cnVar2.a() != 489000) {
            cn cnVar3 = this.w0;
            boolean z9 = (cnVar3 != null && cnVar3.V9()) || !((q9Var = this.W) == null || ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() == null || ((org.telegram.ui.Cells.q1) this.W).getMessageObject().k == null || !((org.telegram.ui.Cells.q1) this.W).getMessageObject().k.noforwards);
            if (!this.s0 && (cnVar = this.w0) != null && cnVar.h == null && (((q9Var2 = this.W) == null || (((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.q1) this.W).getMessageObject().D != 23 && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().T4() && !((org.telegram.ui.Cells.q1) this.W).getMessageObject().z3() && ((((org.telegram.ui.Cells.q1) this.W).getMessageObject().w2 == null || org.telegram.messenger.ov.c(((org.telegram.ui.Cells.q1) this.W).getMessageObject())) && !this.w0.s9.q0))) && !this.w0.getMessagesController().s7.B(this.w0.j6) && !org.telegram.messenger.t10.A(this.w0.j6) && (!z9 || (chat = this.w0.e) == null || org.telegram.messenger.t3.B(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int o() {
        cn cnVar = this.w0;
        if (cnVar == null) {
            return 0;
        }
        return cnVar.Wa;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int p() {
        cn cnVar = this.w0;
        if (cnVar == null) {
            return 0;
        }
        return (int) cnVar.N9;
    }

    @Override // org.telegram.ui.Cells.v9
    public final org.telegram.ui.ActionBar.h6 q() {
        cn cnVar = this.w0;
        if (cnVar != null) {
            return cnVar.za;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int t(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.w0.za);
    }
}
