package org.telegram.ui;

import android.animation.Animator;
import android.os.Build;
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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class qj extends s4.t {
    public boolean S;
    public final /* synthetic */ qn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(qn qnVar, boolean z10) {
        super(z10);
        this.T = qnVar;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        byte b10;
        qn qnVar = this.T;
        dm dmVar = qnVar.A0;
        int i12 = dmVar.J;
        if (i10 >= i12 && i10 < dmVar.K && (i11 = i10 - i12) >= 0 && i11 < dmVar.L().size() && (c92 = qnVar.c9((messageObject = (MessageObject) qnVar.A0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = c92.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = c92.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = c92.posArray.get(i13);
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

    @Override // s4.t
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            return !((org.telegram.ui.Cells.u1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // s4.n0
    public final int G() {
        if (this.S) {
            return (int) this.T.s9;
        }
        return 0;
    }

    @Override // s4.n0
    public final int J() {
        return this.S ? (int) this.T.s9 : F();
    }

    @Override // s4.n0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.s9) - C()) : super.K();
    }

    @Override // s4.b0
    public final int X0() {
        return (int) this.T.s9;
    }

    @Override // s4.s, s4.b0, s4.n0
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, y0Var);
            return;
        }
        try {
            super.b0(eVar, y0Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new ti(this, 3));
        }
    }

    @Override // s4.b0
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.s9);
        }
        super.i1(i10, i11, z10);
    }

    @Override // s4.b0, s4.n0
    public final int j(s4.y0 y0Var) {
        this.S = true;
        int B0 = B0(y0Var);
        this.S = false;
        return B0;
    }

    @Override // s4.s, s4.b0, s4.n0
    public final int k(s4.y0 y0Var) {
        this.S = true;
        int C0 = C0(y0Var);
        this.S = false;
        return C0;
    }

    @Override // s4.s, s4.b0, s4.n0
    public final int l(s4.y0 y0Var) {
        this.S = true;
        int D0 = D0(y0Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    @Override // s4.s, s4.b0, s4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int i11;
        boolean z10;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        ah.d1 d1Var;
        bh.f fVar;
        boolean z11 = false;
        qn qnVar = this.T;
        if (i10 < 0) {
            float f13 = qnVar.N9;
            if (f13 != 0.0f) {
                float f14 = f13 + i10;
                qnVar.N9 = f14;
                if (f14 < 0.0f) {
                    i10 = (int) f14;
                    qnVar.N9 = 0.0f;
                    qnVar.x0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = qnVar.x0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z10 = false;
                break;
            }
            View childAt = qnVar.x0.getChildAt(i13);
            float f15 = qnVar.s9;
            qnVar.x0.getClass();
            if (RecyclerView.R(childAt) == (qnVar.Qa ? 0 : qnVar.A0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f15 ? (int) (childAt.getTop() - f15) : i10, eVar, y0Var);
                z10 = true;
            } else {
                i13++;
            }
        }
        if (!z10) {
            i11 = super.o0(i10, eVar, y0Var);
        }
        if (!qnVar.xc.f) {
            SparseArray[] sparseArrayArr = qnVar.W5;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(qnVar.e) && !qnVar.e.megagroup) || (qnVar.h4 && !UserObject.isBotForum(qnVar.f))) && (i12 = qnVar.R3) != 3 && i12 != 9 && i12 != 1 && qnVar.x0.getScrollState() == 1)) {
                nj njVar = qnVar.x0;
                if (!njVar.V1 && !njVar.b2 && !qnVar.F9()) {
                    if (qnVar.N9 == 0.0f && qnVar.P9 != null) {
                        ArrayList arrayList = qnVar.fb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            qnVar.P9.i((TLRPC.Chat) qnVar.fb.get(0));
                        } else if (qnVar.h4) {
                            qnVar.P9.j();
                        } else {
                            qnVar.P9.h();
                        }
                    }
                    Animator animator = qnVar.Q9;
                    if (animator != null) {
                        animator.removeAllListeners();
                        qnVar.Q9.cancel();
                    }
                    if (qnVar.N9 < AndroidUtilities.dp(110.0f)) {
                        float dp = qnVar.N9 / AndroidUtilities.dp(110.0f);
                        f10 = (1.0f - dp) * 0.65f;
                        f11 = dp * 0.45f;
                    } else if (qnVar.N9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (qnVar.N9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f10 = (1.0f - dp2) * 0.45f;
                        f11 = dp2 * 0.05f;
                    } else {
                        f7 = 0.05f;
                        f12 = i10 * f7;
                        qnVar.N9 += f12;
                        int i14 = (int) f12;
                        d1Var = ah.d1.B;
                        if (d1Var != null) {
                            d1Var.r -= i14;
                            if (i14 != 0) {
                                d1Var.u = true;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (fVar = qnVar.F) != null) {
                            fVar.f(0.0f, f12);
                        }
                        qnVar.x0.invalidate();
                    }
                    f7 = f11 + f10;
                    f12 = i10 * f7;
                    qnVar.N9 += f12;
                    int i142 = (int) f12;
                    d1Var = ah.d1.B;
                    if (d1Var != null) {
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        fVar.f(0.0f, f12);
                    }
                    qnVar.x0.invalidate();
                }
            }
        }
        if (qnVar.N9 == 0.0f) {
            qnVar.x0.setOverScrollMode(0);
        } else {
            qnVar.x0.setOverScrollMode(2);
        }
        if (qnVar.P9 != null) {
            ne.b bVar = qnVar.vc;
            if (qnVar.N9 > 0.0f && qnVar.x0.getScrollState() == 1) {
                z11 = true;
            }
            bVar.a(z11, true);
        }
        return i11;
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        this.T.sa = false;
        li.n nVar = new li.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }

    @Override // s4.s, s4.b0, s4.n0
    public final boolean y0() {
        return true;
    }
}
