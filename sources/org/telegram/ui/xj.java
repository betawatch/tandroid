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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xj extends s4.t {
    public boolean S;
    public final /* synthetic */ co T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(co coVar, boolean z10) {
        super(z10);
        this.T = coVar;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        co coVar = this.T;
        om omVar = coVar.A0;
        int i12 = omVar.J;
        if (i10 >= i12 && i10 < omVar.K && (i11 = i10 - i12) >= 0 && i11 < omVar.L().size() && (X8 = coVar.X8((messageObject = (MessageObject) coVar.A0.L().get(i11)))) != null) {
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

    @Override // s4.t
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // s4.o0
    public final int G() {
        if (this.S) {
            return (int) this.T.s9;
        }
        return 0;
    }

    @Override // s4.o0
    public final int J() {
        return this.S ? (int) this.T.s9 : F();
    }

    @Override // s4.o0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.s9) - C()) : super.K();
    }

    @Override // s4.c0
    public final int X0() {
        return (int) this.T.s9;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final void b0(pf.e eVar, s4.z0 z0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, z0Var);
            return;
        }
        try {
            super.b0(eVar, z0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new dj(this, 2));
        }
    }

    @Override // s4.c0
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.s9);
        }
        super.i1(i10, i11, z10);
    }

    @Override // s4.c0, s4.o0
    public final int j(s4.z0 z0Var) {
        this.S = true;
        int B0 = B0(z0Var);
        this.S = false;
        return B0;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int k(s4.z0 z0Var) {
        this.S = true;
        int C0 = C0(z0Var);
        this.S = false;
        return C0;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int l(s4.z0 z0Var) {
        this.S = true;
        int D0 = D0(z0Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    @Override // s4.s, s4.c0, s4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, pf.e eVar, s4.z0 z0Var) {
        int i11;
        boolean z10;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        ah.e1 e1Var;
        bh.f fVar;
        boolean z11 = false;
        co coVar = this.T;
        if (i10 < 0) {
            float f13 = coVar.N9;
            if (f13 != 0.0f) {
                float f14 = f13 + i10;
                coVar.N9 = f14;
                if (f14 < 0.0f) {
                    i10 = (int) f14;
                    coVar.N9 = 0.0f;
                    coVar.x0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = coVar.x0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z10 = false;
                break;
            }
            View childAt = coVar.x0.getChildAt(i13);
            float f15 = coVar.s9;
            coVar.x0.getClass();
            if (RecyclerView.R(childAt) == (coVar.Pa ? 0 : coVar.A0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f15 ? (int) (childAt.getTop() - f15) : i10, eVar, z0Var);
                z10 = true;
            } else {
                i13++;
            }
        }
        if (!z10) {
            i11 = super.o0(i10, eVar, z0Var);
        }
        if (!coVar.wc.f) {
            SparseArray[] sparseArrayArr = coVar.W5;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(coVar.e) && !coVar.e.megagroup) || (coVar.h4 && !UserObject.isBotForum(coVar.f))) && (i12 = coVar.R3) != 3 && i12 != 9 && i12 != 1 && coVar.x0.getScrollState() == 1)) {
                uj ujVar = coVar.x0;
                if (!ujVar.X1 && !ujVar.d2 && !coVar.A9()) {
                    if (coVar.N9 == 0.0f && coVar.P9 != null) {
                        ArrayList arrayList = coVar.fb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            coVar.P9.i((TLRPC.Chat) coVar.fb.get(0));
                        } else if (coVar.h4) {
                            coVar.P9.j();
                        } else {
                            coVar.P9.h();
                        }
                    }
                    Animator animator = coVar.Q9;
                    if (animator != null) {
                        animator.removeAllListeners();
                        coVar.Q9.cancel();
                    }
                    if (coVar.N9 < AndroidUtilities.dp(110.0f)) {
                        float dp = coVar.N9 / AndroidUtilities.dp(110.0f);
                        f10 = (1.0f - dp) * 0.65f;
                        f11 = dp * 0.45f;
                    } else if (coVar.N9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (coVar.N9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f10 = (1.0f - dp2) * 0.45f;
                        f11 = dp2 * 0.05f;
                    } else {
                        f7 = 0.05f;
                        f12 = i10 * f7;
                        coVar.N9 += f12;
                        int i14 = (int) f12;
                        e1Var = ah.e1.B;
                        if (e1Var != null) {
                            e1Var.r -= i14;
                            if (i14 != 0) {
                                e1Var.u = true;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (fVar = coVar.F) != null) {
                            fVar.f(0.0f, f12);
                        }
                        coVar.x0.invalidate();
                    }
                    f7 = f11 + f10;
                    f12 = i10 * f7;
                    coVar.N9 += f12;
                    int i142 = (int) f12;
                    e1Var = ah.e1.B;
                    if (e1Var != null) {
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        fVar.f(0.0f, f12);
                    }
                    coVar.x0.invalidate();
                }
            }
        }
        if (coVar.N9 == 0.0f) {
            coVar.x0.setOverScrollMode(0);
        } else {
            coVar.x0.setOverScrollMode(2);
        }
        if (coVar.P9 != null) {
            le.b bVar = coVar.uc;
            if (coVar.N9 > 0.0f && coVar.x0.getScrollState() == 1) {
                z11 = true;
            }
            bVar.a(z11, true);
        }
        return i11;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        this.T.sa = false;
        ki.p pVar = new ki.p(recyclerView.getContext(), 0);
        pVar.a = i10;
        w0(pVar);
    }

    @Override // s4.s, s4.c0, s4.o0
    public final boolean y0() {
        return true;
    }
}
