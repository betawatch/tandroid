package org.telegram.ui;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uj extends s4.u {
    public boolean S;
    public final /* synthetic */ wn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(wn wnVar, boolean z10) {
        super(z10);
        this.T = wnVar;
    }

    @Override // s4.u
    public final boolean C1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages k92;
        byte b10;
        wn wnVar = this.T;
        hm hmVar = wnVar.A0;
        int i12 = hmVar.J;
        if (i10 >= i12 && i10 < hmVar.K && (i11 = i10 - i12) >= 0 && i11 < hmVar.L().size() && (k92 = wnVar.k9((messageObject = (MessageObject) wnVar.A0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = k92.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = k92.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = k92.posArray.get(i13);
                    if (groupedMessagePosition != position) {
                        byte b11 = groupedMessagePosition.minY;
                        byte b12 = position.minY;
                        if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // s4.u
    public final boolean D1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // s4.p0
    public final int G() {
        if (this.S) {
            return (int) this.T.I9;
        }
        return 0;
    }

    @Override // s4.p0
    public final int J() {
        return this.S ? (int) this.T.I9 : F();
    }

    @Override // s4.p0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.I9) - C()) : super.K();
    }

    @Override // s4.c0
    public final int X0() {
        return (int) this.T.I9;
    }

    @Override // s4.t, s4.c0, s4.p0
    public final void b0(rf.e eVar, s4.b1 b1Var) {
        rj rjVar;
        hm hmVar;
        wn wnVar = this.T;
        int i10 = wnVar.pb;
        if (i10 != 0 && wnVar.qb != Integer.MIN_VALUE && (rjVar = wnVar.x0) != null && (hmVar = wnVar.A0) != null && !hmVar.N && !rjVar.V1) {
            MessageObject messageObject = (MessageObject) wnVar.E6[0].get(i10);
            int indexOf = messageObject != null ? wnVar.K6.indexOf(messageObject) : -1;
            if (indexOf >= 0) {
                int i11 = wnVar.A0.J + indexOf;
                int paddingTop = wnVar.qb - wnVar.x0.getPaddingTop();
                this.y = i11;
                this.A = paddingTop;
                this.z = false;
                s4.b0 b0Var = this.B;
                if (b0Var != null) {
                    b0Var.a = -1;
                }
            }
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, b1Var);
            return;
        }
        try {
            super.b0(eVar, b1Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new xi(this, 3));
        }
    }

    @Override // s4.c0
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.I9);
        }
        super.i1(i10, i11, z10);
    }

    @Override // s4.c0, s4.p0
    public final int j(s4.b1 b1Var) {
        this.S = true;
        int B0 = B0(b1Var);
        this.S = false;
        return B0;
    }

    @Override // s4.t, s4.c0, s4.p0
    public final int k(s4.b1 b1Var) {
        this.S = true;
        int C0 = C0(b1Var);
        this.S = false;
        return C0;
    }

    @Override // s4.t, s4.c0, s4.p0
    public final int l(s4.b1 b1Var) {
        this.S = true;
        int D0 = D0(b1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    @Override // s4.t, s4.c0, s4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        int i11;
        boolean z10;
        int i12;
        float f7;
        float f10;
        float f11;
        bh.s0 s0Var;
        boolean z11 = false;
        wn wnVar = this.T;
        if (i10 < 0) {
            float f12 = wnVar.da;
            if (f12 != 0.0f) {
                float f13 = f12 + i10;
                wnVar.da = f13;
                if (f13 < 0.0f) {
                    i10 = (int) f13;
                    wnVar.da = 0.0f;
                    wnVar.x0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = wnVar.x0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z10 = false;
                break;
            }
            View childAt = wnVar.x0.getChildAt(i13);
            float f14 = wnVar.I9;
            wnVar.x0.getClass();
            if (RecyclerView.R(childAt) == (wnVar.gb ? 0 : wnVar.A0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f14 ? (int) (childAt.getTop() - f14) : i10, eVar, b1Var);
                z10 = true;
            } else {
                i13++;
            }
        }
        if (!z10) {
            i11 = super.o0(i10, eVar, b1Var);
        }
        if (!wnVar.Xc.f) {
            SparseArray[] sparseArrayArr = wnVar.m6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(wnVar.e) && !wnVar.e.megagroup) || (wnVar.t4 && !UserObject.isBotForum(wnVar.f))) && (i12 = wnVar.d4) != 3 && i12 != 9 && i12 != 1 && wnVar.x0.getScrollState() == 1)) {
                rj rjVar = wnVar.x0;
                if (!rjVar.V1 && !rjVar.b2 && !wnVar.M9()) {
                    if (wnVar.da == 0.0f && wnVar.fa != null) {
                        ArrayList arrayList = wnVar.Fb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            wnVar.fa.i((TLRPC.Chat) wnVar.Fb.get(0));
                        } else if (wnVar.t4) {
                            wnVar.fa.j();
                        } else {
                            wnVar.fa.h();
                        }
                    }
                    Animator animator = wnVar.ga;
                    if (animator != null) {
                        animator.removeAllListeners();
                        wnVar.ga.cancel();
                    }
                    if (wnVar.da < AndroidUtilities.dp(110.0f)) {
                        float dp = wnVar.da / AndroidUtilities.dp(110.0f);
                        f10 = (1.0f - dp) * 0.65f;
                        f11 = dp * 0.45f;
                    } else if (wnVar.da < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (wnVar.da - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f10 = (1.0f - dp2) * 0.45f;
                        f11 = dp2 * 0.05f;
                    } else {
                        f7 = 0.05f;
                        float f15 = i10 * f7;
                        wnVar.da += f15;
                        int i14 = (int) f15;
                        s0Var = bh.s0.B;
                        if (s0Var != null) {
                            s0Var.r -= i14;
                            if (i14 != 0) {
                                s0Var.u = true;
                            }
                        }
                        wnVar.x0.invalidate();
                    }
                    f7 = f11 + f10;
                    float f152 = i10 * f7;
                    wnVar.da += f152;
                    int i142 = (int) f152;
                    s0Var = bh.s0.B;
                    if (s0Var != null) {
                    }
                    wnVar.x0.invalidate();
                }
            }
        }
        if (wnVar.da == 0.0f) {
            wnVar.x0.setOverScrollMode(0);
        } else {
            wnVar.x0.setOverScrollMode(2);
        }
        if (wnVar.fa != null) {
            oe.b bVar = wnVar.Vc;
            if (wnVar.da > 0.0f && wnVar.x0.getScrollState() == 1) {
                z11 = true;
            }
            bVar.a(z11, true);
        }
        return i11;
    }

    @Override // s4.c0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        this.T.Ia = false;
        mi.n nVar = new mi.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }

    @Override // s4.t, s4.c0, s4.p0
    public final boolean y0() {
        return true;
    }
}
