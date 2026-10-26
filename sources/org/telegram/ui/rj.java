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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rj extends s4.u {
    public boolean S;
    public final /* synthetic */ un T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(un unVar, boolean z10) {
        super(z10);
        this.T = unVar;
    }

    @Override // s4.u
    public final boolean C1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages h92;
        byte b10;
        un unVar = this.T;
        fm fmVar = unVar.A0;
        int i12 = fmVar.J;
        if (i10 >= i12 && i10 < fmVar.K && (i11 = i10 - i12) >= 0 && i11 < fmVar.L().size() && (h92 = unVar.h9((messageObject = (MessageObject) unVar.A0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = h92.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = h92.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = h92.posArray.get(i13);
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
            return (int) this.T.E9;
        }
        return 0;
    }

    @Override // s4.p0
    public final int J() {
        return this.S ? (int) this.T.E9 : F();
    }

    @Override // s4.p0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.E9) - C()) : super.K();
    }

    @Override // s4.c0
    public final int X0() {
        return (int) this.T.E9;
    }

    @Override // s4.t, s4.c0, s4.p0
    public final void b0(rf.e eVar, s4.b1 b1Var) {
        oj ojVar;
        fm fmVar;
        un unVar = this.T;
        int i10 = unVar.lb;
        if (i10 != 0 && unVar.mb != Integer.MIN_VALUE && (ojVar = unVar.x0) != null && (fmVar = unVar.A0) != null && !fmVar.N && !ojVar.V1) {
            MessageObject messageObject = (MessageObject) unVar.A6[0].get(i10);
            int indexOf = messageObject != null ? unVar.G6.indexOf(messageObject) : -1;
            if (indexOf >= 0) {
                int i11 = unVar.A0.J + indexOf;
                int paddingTop = unVar.mb - unVar.x0.getPaddingTop();
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
            AndroidUtilities.runOnUIThread(new ui(this, 3));
        }
    }

    @Override // s4.c0
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.E9);
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
        un unVar = this.T;
        if (i10 < 0) {
            float f12 = unVar.Z9;
            if (f12 != 0.0f) {
                float f13 = f12 + i10;
                unVar.Z9 = f13;
                if (f13 < 0.0f) {
                    i10 = (int) f13;
                    unVar.Z9 = 0.0f;
                    unVar.x0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = unVar.x0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z10 = false;
                break;
            }
            View childAt = unVar.x0.getChildAt(i13);
            float f14 = unVar.E9;
            unVar.x0.getClass();
            if (RecyclerView.R(childAt) == (unVar.cb ? 0 : unVar.A0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f14 ? (int) (childAt.getTop() - f14) : i10, eVar, b1Var);
                z10 = true;
            } else {
                i13++;
            }
        }
        if (!z10) {
            i11 = super.o0(i10, eVar, b1Var);
        }
        if (!unVar.Tc.f) {
            SparseArray[] sparseArrayArr = unVar.i6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(unVar.e) && !unVar.e.megagroup) || (unVar.t4 && !UserObject.isBotForum(unVar.f))) && (i12 = unVar.d4) != 3 && i12 != 9 && i12 != 1 && unVar.x0.getScrollState() == 1)) {
                oj ojVar = unVar.x0;
                if (!ojVar.V1 && !ojVar.b2 && !unVar.J9()) {
                    if (unVar.Z9 == 0.0f && unVar.ba != null) {
                        ArrayList arrayList = unVar.Bb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            unVar.ba.i((TLRPC.Chat) unVar.Bb.get(0));
                        } else if (unVar.t4) {
                            unVar.ba.j();
                        } else {
                            unVar.ba.h();
                        }
                    }
                    Animator animator = unVar.ca;
                    if (animator != null) {
                        animator.removeAllListeners();
                        unVar.ca.cancel();
                    }
                    if (unVar.Z9 < AndroidUtilities.dp(110.0f)) {
                        float dp = unVar.Z9 / AndroidUtilities.dp(110.0f);
                        f10 = (1.0f - dp) * 0.65f;
                        f11 = dp * 0.45f;
                    } else if (unVar.Z9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (unVar.Z9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f10 = (1.0f - dp2) * 0.45f;
                        f11 = dp2 * 0.05f;
                    } else {
                        f7 = 0.05f;
                        float f15 = i10 * f7;
                        unVar.Z9 += f15;
                        int i14 = (int) f15;
                        s0Var = bh.s0.B;
                        if (s0Var != null) {
                            s0Var.r -= i14;
                            if (i14 != 0) {
                                s0Var.u = true;
                            }
                        }
                        unVar.x0.invalidate();
                    }
                    f7 = f11 + f10;
                    float f152 = i10 * f7;
                    unVar.Z9 += f152;
                    int i142 = (int) f152;
                    s0Var = bh.s0.B;
                    if (s0Var != null) {
                    }
                    unVar.x0.invalidate();
                }
            }
        }
        if (unVar.Z9 == 0.0f) {
            unVar.x0.setOverScrollMode(0);
        } else {
            unVar.x0.setOverScrollMode(2);
        }
        if (unVar.ba != null) {
            oe.b bVar = unVar.Rc;
            if (unVar.Z9 > 0.0f && unVar.x0.getScrollState() == 1) {
                z11 = true;
            }
            bVar.a(z11, true);
        }
        return i11;
    }

    @Override // s4.c0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        this.T.Ea = false;
        mi.n nVar = new mi.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }

    @Override // s4.t, s4.c0, s4.p0
    public final boolean y0() {
        return true;
    }
}
