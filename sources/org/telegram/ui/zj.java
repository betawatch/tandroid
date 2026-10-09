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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zj extends s4.t {
    public boolean S;
    public final /* synthetic */ zn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(zn znVar, boolean z10) {
        super(z10);
        this.T = znVar;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        byte b10;
        zn znVar = this.T;
        mm mmVar = znVar.A0;
        int i12 = mmVar.J;
        if (i10 >= i12 && i10 < mmVar.K && (i11 = i10 - i12) >= 0 && i11 < mmVar.L().size() && (c92 = znVar.c9((messageObject = (MessageObject) znVar.A0.L().get(i11)))) != null) {
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

    @Override // s4.p0
    public final int G() {
        if (this.S) {
            return (int) this.T.s9;
        }
        return 0;
    }

    @Override // s4.p0
    public final int J() {
        return this.S ? (int) this.T.s9 : F();
    }

    @Override // s4.p0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.s9) - C()) : super.K();
    }

    @Override // s4.d0
    public final int X0() {
        return (int) this.T.s9;
    }

    @Override // s4.s, s4.d0, s4.p0
    public final void b0(pf.e eVar, s4.a1 a1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, a1Var);
            return;
        }
        try {
            super.b0(eVar, a1Var);
        } catch (Exception e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new cj(this, 3));
        }
    }

    @Override // s4.d0
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.s9);
        }
        super.i1(i10, i11, z10);
    }

    @Override // s4.d0, s4.p0
    public final int j(s4.a1 a1Var) {
        this.S = true;
        int B0 = B0(a1Var);
        this.S = false;
        return B0;
    }

    @Override // s4.s, s4.d0, s4.p0
    public final int k(s4.a1 a1Var) {
        this.S = true;
        int C0 = C0(a1Var);
        this.S = false;
        return C0;
    }

    @Override // s4.s, s4.d0, s4.p0
    public final int l(s4.a1 a1Var) {
        this.S = true;
        int D0 = D0(a1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    @Override // s4.s, s4.d0, s4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        int i11;
        boolean z10;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        zg.j0 j0Var;
        ah.h hVar;
        boolean z11 = false;
        zn znVar = this.T;
        if (i10 < 0) {
            float f13 = znVar.N9;
            if (f13 != 0.0f) {
                float f14 = f13 + i10;
                znVar.N9 = f14;
                if (f14 < 0.0f) {
                    i10 = (int) f14;
                    znVar.N9 = 0.0f;
                    znVar.x0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = znVar.x0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z10 = false;
                break;
            }
            View childAt = znVar.x0.getChildAt(i13);
            float f15 = znVar.s9;
            znVar.x0.getClass();
            if (RecyclerView.R(childAt) == (znVar.Qa ? 0 : znVar.A0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f15 ? (int) (childAt.getTop() - f15) : i10, eVar, a1Var);
                z10 = true;
            } else {
                i13++;
            }
        }
        if (!z10) {
            i11 = super.o0(i10, eVar, a1Var);
        }
        if (!znVar.wc.f) {
            SparseArray[] sparseArrayArr = znVar.W5;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(znVar.e) && !znVar.e.megagroup) || (znVar.h4 && !UserObject.isBotForum(znVar.f))) && (i12 = znVar.R3) != 3 && i12 != 9 && i12 != 1 && znVar.x0.getScrollState() == 1)) {
                wj wjVar = znVar.x0;
                if (!wjVar.V1 && !wjVar.b2 && !znVar.F9()) {
                    if (znVar.N9 == 0.0f && znVar.P9 != null) {
                        ArrayList arrayList = znVar.fb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            znVar.P9.i((TLRPC.Chat) znVar.fb.get(0));
                        } else if (znVar.h4) {
                            znVar.P9.j();
                        } else {
                            znVar.P9.h();
                        }
                    }
                    Animator animator = znVar.Q9;
                    if (animator != null) {
                        animator.removeAllListeners();
                        znVar.Q9.cancel();
                    }
                    if (znVar.N9 < AndroidUtilities.dp(110.0f)) {
                        float dp = znVar.N9 / AndroidUtilities.dp(110.0f);
                        f10 = (1.0f - dp) * 0.65f;
                        f11 = dp * 0.45f;
                    } else if (znVar.N9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (znVar.N9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f10 = (1.0f - dp2) * 0.45f;
                        f11 = dp2 * 0.05f;
                    } else {
                        f7 = 0.05f;
                        f12 = i10 * f7;
                        znVar.N9 += f12;
                        int i14 = (int) f12;
                        j0Var = zg.j0.B;
                        if (j0Var != null) {
                            j0Var.r -= i14;
                            if (i14 != 0) {
                                j0Var.u = true;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (hVar = znVar.F) != null) {
                            hVar.f(0.0f, f12);
                        }
                        znVar.x0.invalidate();
                    }
                    f7 = f11 + f10;
                    f12 = i10 * f7;
                    znVar.N9 += f12;
                    int i142 = (int) f12;
                    j0Var = zg.j0.B;
                    if (j0Var != null) {
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        hVar.f(0.0f, f12);
                    }
                    znVar.x0.invalidate();
                }
            }
        }
        if (znVar.N9 == 0.0f) {
            znVar.x0.setOverScrollMode(0);
        } else {
            znVar.x0.setOverScrollMode(2);
        }
        if (znVar.P9 != null) {
            me.b bVar = znVar.uc;
            if (znVar.N9 > 0.0f && znVar.x0.getScrollState() == 1) {
                z11 = true;
            }
            bVar.a(z11, true);
        }
        return i11;
    }

    @Override // s4.d0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        this.T.sa = false;
        ji.o oVar = new ji.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }

    @Override // s4.s, s4.d0, s4.p0
    public final boolean y0() {
        return true;
    }
}
