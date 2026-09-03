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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tj extends f2.x {
    public boolean S;
    public final /* synthetic */ xn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(xn xnVar, boolean z4) {
        super(z4);
        this.T = xnVar;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        xn xnVar = this.T;
        jm jmVar = xnVar.x0;
        int i12 = jmVar.G;
        if (i10 >= i12 && i10 < jmVar.H && (i11 = i10 - i12) >= 0 && i11 < jmVar.L().size() && (X8 = xnVar.X8((messageObject = (MessageObject) xnVar.x0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = X8.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = X8.posArray.get(i13);
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

    @Override // f2.x
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.w0
    public final int G() {
        if (this.S) {
            return (int) this.T.p9;
        }
        return 0;
    }

    @Override // f2.w0
    public final int J() {
        return this.S ? (int) this.T.p9 : F();
    }

    @Override // f2.w0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.p9) - C()) : super.K();
    }

    @Override // f2.j0
    public final int X0() {
        return (int) this.T.p9;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final void b0(bf.f fVar, f2.j1 j1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(fVar, j1Var);
            return;
        }
        try {
            super.b0(fVar, j1Var);
        } catch (Exception e6) {
            FileLog.e(e6);
            AndroidUtilities.runOnUIThread(new zi(this, 2));
        }
    }

    @Override // f2.j0
    public final void i1(int i10, int i11, boolean z4) {
        if (!z4) {
            i11 = (int) ((i11 - F()) + this.T.p9);
        }
        super.i1(i10, i11, z4);
    }

    @Override // f2.j0, f2.w0
    public final int j(f2.j1 j1Var) {
        this.S = true;
        int B0 = B0(j1Var);
        this.S = false;
        return B0;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int k(f2.j1 j1Var) {
        this.S = true;
        int C0 = C0(j1Var);
        this.S = false;
        return C0;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int l(f2.j1 j1Var) {
        this.S = true;
        int D0 = D0(j1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    @Override // f2.w, f2.j0, f2.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        int i11;
        boolean z4;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        ng.m0 m0Var;
        og.e eVar;
        boolean z10 = false;
        xn xnVar = this.T;
        if (i10 < 0) {
            float f14 = xnVar.K9;
            if (f14 != 0.0f) {
                float f15 = f14 + i10;
                xnVar.K9 = f15;
                if (f15 < 0.0f) {
                    i10 = (int) f15;
                    xnVar.K9 = 0.0f;
                    xnVar.u0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = xnVar.u0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z4 = false;
                break;
            }
            View childAt = xnVar.u0.getChildAt(i13);
            float f16 = xnVar.p9;
            xnVar.u0.getClass();
            if (RecyclerView.R(childAt) == (xnVar.Ma ? 0 : xnVar.x0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f16 ? (int) (childAt.getTop() - f16) : i10, fVar, j1Var);
                z4 = true;
            } else {
                i13++;
            }
        }
        if (!z4) {
            i11 = super.o0(i10, fVar, j1Var);
        }
        if (!xnVar.tc.f) {
            SparseArray[] sparseArrayArr = xnVar.T5;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(xnVar.e) && !xnVar.e.megagroup) || (xnVar.e4 && !UserObject.isBotForum(xnVar.f))) && (i12 = xnVar.O3) != 3 && i12 != 9 && i12 != 1 && xnVar.u0.getScrollState() == 1)) {
                qj qjVar = xnVar.u0;
                if (!qjVar.U1 && !qjVar.a2 && !xnVar.A9()) {
                    if (xnVar.K9 == 0.0f && xnVar.M9 != null) {
                        ArrayList arrayList = xnVar.cb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            xnVar.M9.i((TLRPC.Chat) xnVar.cb.get(0));
                        } else if (xnVar.e4) {
                            xnVar.M9.j();
                        } else {
                            xnVar.M9.h();
                        }
                    }
                    Animator animator = xnVar.N9;
                    if (animator != null) {
                        animator.removeAllListeners();
                        xnVar.N9.cancel();
                    }
                    if (xnVar.K9 < AndroidUtilities.dp(110.0f)) {
                        float dp = xnVar.K9 / AndroidUtilities.dp(110.0f);
                        f11 = (1.0f - dp) * 0.65f;
                        f12 = dp * 0.45f;
                    } else if (xnVar.K9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (xnVar.K9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f11 = (1.0f - dp2) * 0.45f;
                        f12 = dp2 * 0.05f;
                    } else {
                        f10 = 0.05f;
                        f13 = i10 * f10;
                        xnVar.K9 += f13;
                        int i14 = (int) f13;
                        m0Var = ng.m0.B;
                        if (m0Var != null) {
                            m0Var.r -= i14;
                            if (i14 != 0) {
                                m0Var.u = true;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (eVar = xnVar.C) != null) {
                            eVar.f(0.0f, f13);
                        }
                        xnVar.u0.invalidate();
                    }
                    f10 = f12 + f11;
                    f13 = i10 * f10;
                    xnVar.K9 += f13;
                    int i142 = (int) f13;
                    m0Var = ng.m0.B;
                    if (m0Var != null) {
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        eVar.f(0.0f, f13);
                    }
                    xnVar.u0.invalidate();
                }
            }
        }
        if (xnVar.K9 == 0.0f) {
            xnVar.u0.setOverScrollMode(0);
        } else {
            xnVar.u0.setOverScrollMode(2);
        }
        if (xnVar.M9 != null) {
            xd.a aVar = xnVar.rc;
            if (xnVar.K9 > 0.0f && xnVar.u0.getScrollState() == 1) {
                z10 = true;
            }
            aVar.a(z10, true);
        }
        return i11;
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        this.T.pa = false;
        xh.o oVar = new xh.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }

    @Override // f2.w, f2.j0, f2.w0
    public final boolean y0() {
        return true;
    }
}
