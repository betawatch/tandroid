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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vj extends f2.x {
    public boolean S;
    public final /* synthetic */ zn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(zn znVar, boolean z4) {
        super(z4);
        this.T = znVar;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        zn znVar = this.T;
        lm lmVar = znVar.x0;
        int i12 = lmVar.G;
        if (i10 >= i12 && i10 < lmVar.H && (i11 = i10 - i12) >= 0 && i11 < lmVar.L().size() && (X8 = znVar.X8((messageObject = (MessageObject) znVar.x0.L().get(i11)))) != null) {
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
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.v0
    public final int G() {
        if (this.S) {
            return (int) this.T.p9;
        }
        return 0;
    }

    @Override // f2.v0
    public final int J() {
        return this.S ? (int) this.T.p9 : F();
    }

    @Override // f2.v0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.p9) - C()) : super.K();
    }

    @Override // f2.i0
    public final int X0() {
        return (int) this.T.p9;
    }

    @Override // f2.w, f2.i0, f2.v0
    public final void b0(af.h hVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(hVar, i1Var);
            return;
        }
        try {
            super.b0(hVar, i1Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new bj(this, 2));
        }
    }

    @Override // f2.i0
    public final void i1(int i10, int i11, boolean z4) {
        if (!z4) {
            i11 = (int) ((i11 - F()) + this.T.p9);
        }
        super.i1(i10, i11, z4);
    }

    @Override // f2.i0, f2.v0
    public final int j(f2.i1 i1Var) {
        this.S = true;
        int B0 = B0(i1Var);
        this.S = false;
        return B0;
    }

    @Override // f2.w, f2.i0, f2.v0
    public final int k(f2.i1 i1Var) {
        this.S = true;
        int C0 = C0(i1Var);
        this.S = false;
        return C0;
    }

    @Override // f2.w, f2.i0, f2.v0
    public final int l(f2.i1 i1Var) {
        this.S = true;
        int D0 = D0(i1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    @Override // f2.w, f2.i0, f2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, af.h hVar, f2.i1 i1Var) {
        int i11;
        boolean z4;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        mg.m0 m0Var;
        ng.e eVar;
        boolean z10 = false;
        zn znVar = this.T;
        if (i10 < 0) {
            float f14 = znVar.K9;
            if (f14 != 0.0f) {
                float f15 = f14 + i10;
                znVar.K9 = f15;
                if (f15 < 0.0f) {
                    i10 = (int) f15;
                    znVar.K9 = 0.0f;
                    znVar.u0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = znVar.u0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z4 = false;
                break;
            }
            View childAt = znVar.u0.getChildAt(i13);
            float f16 = znVar.p9;
            znVar.u0.getClass();
            if (RecyclerView.R(childAt) == (znVar.Ma ? 0 : znVar.x0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f16 ? (int) (childAt.getTop() - f16) : i10, hVar, i1Var);
                z4 = true;
            } else {
                i13++;
            }
        }
        if (!z4) {
            i11 = super.o0(i10, hVar, i1Var);
        }
        if (!znVar.tc.f) {
            SparseArray[] sparseArrayArr = znVar.T5;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(znVar.e) && !znVar.e.megagroup) || (znVar.e4 && !UserObject.isBotForum(znVar.f))) && (i12 = znVar.O3) != 3 && i12 != 9 && i12 != 1 && znVar.u0.getScrollState() == 1)) {
                sj sjVar = znVar.u0;
                if (!sjVar.U1 && !sjVar.a2 && !znVar.A9()) {
                    if (znVar.K9 == 0.0f && znVar.M9 != null) {
                        ArrayList arrayList = znVar.cb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            znVar.M9.i((TLRPC.Chat) znVar.cb.get(0));
                        } else if (znVar.e4) {
                            znVar.M9.j();
                        } else {
                            znVar.M9.h();
                        }
                    }
                    Animator animator = znVar.N9;
                    if (animator != null) {
                        animator.removeAllListeners();
                        znVar.N9.cancel();
                    }
                    if (znVar.K9 < AndroidUtilities.dp(110.0f)) {
                        float dp = znVar.K9 / AndroidUtilities.dp(110.0f);
                        f11 = (1.0f - dp) * 0.65f;
                        f12 = dp * 0.45f;
                    } else if (znVar.K9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (znVar.K9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f11 = (1.0f - dp2) * 0.45f;
                        f12 = dp2 * 0.05f;
                    } else {
                        f10 = 0.05f;
                        f13 = i10 * f10;
                        znVar.K9 += f13;
                        int i14 = (int) f13;
                        m0Var = mg.m0.B;
                        if (m0Var != null) {
                            m0Var.r -= i14;
                            if (i14 != 0) {
                                m0Var.u = true;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (eVar = znVar.C) != null) {
                            eVar.f(0.0f, f13);
                        }
                        znVar.u0.invalidate();
                    }
                    f10 = f12 + f11;
                    f13 = i10 * f10;
                    znVar.K9 += f13;
                    int i142 = (int) f13;
                    m0Var = mg.m0.B;
                    if (m0Var != null) {
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        eVar.f(0.0f, f13);
                    }
                    znVar.u0.invalidate();
                }
            }
        }
        if (znVar.K9 == 0.0f) {
            znVar.u0.setOverScrollMode(0);
        } else {
            znVar.u0.setOverScrollMode(2);
        }
        if (znVar.M9 != null) {
            xd.a aVar = znVar.rc;
            if (znVar.K9 > 0.0f && znVar.u0.getScrollState() == 1) {
                z10 = true;
            }
            aVar.a(z10, true);
        }
        return i11;
    }

    @Override // f2.i0, f2.v0
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        this.T.pa = false;
        wh.o oVar = new wh.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }

    @Override // f2.w, f2.i0, f2.v0
    public final boolean y0() {
        return true;
    }
}
