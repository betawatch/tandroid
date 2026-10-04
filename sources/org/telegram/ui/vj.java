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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class vj extends s4.t {
    public boolean S;
    public final /* synthetic */ yn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(yn ynVar, boolean z10) {
        super(z10);
        this.T = ynVar;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages Y8;
        byte b10;
        yn ynVar = this.T;
        jm jmVar = ynVar.y0;
        int i12 = jmVar.J;
        if (i10 >= i12 && i10 < jmVar.K && (i11 = i10 - i12) >= 0 && i11 < jmVar.L().size() && (Y8 = ynVar.Y8((messageObject = (MessageObject) ynVar.y0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = Y8.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = Y8.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = Y8.posArray.get(i13);
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

    @Override // s4.o0
    public final int G() {
        if (this.S) {
            return (int) this.T.q9;
        }
        return 0;
    }

    @Override // s4.o0
    public final int J() {
        return this.S ? (int) this.T.q9 : F();
    }

    @Override // s4.o0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.q9) - C()) : super.K();
    }

    @Override // s4.c0
    public final int X0() {
        return (int) this.T.q9;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final void b0(of.e eVar, s4.z0 z0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, z0Var);
            return;
        }
        try {
            super.b0(eVar, z0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new bj(this, 2));
        }
    }

    @Override // s4.c0
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.q9);
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
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        boolean z10;
        int i12;
        float f7;
        float f10;
        float f11;
        zg.k0 k0Var;
        boolean z11 = false;
        yn ynVar = this.T;
        if (i10 < 0) {
            float f12 = ynVar.L9;
            if (f12 != 0.0f) {
                float f13 = f12 + i10;
                ynVar.L9 = f13;
                if (f13 < 0.0f) {
                    i10 = (int) f13;
                    ynVar.L9 = 0.0f;
                    ynVar.v0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = ynVar.v0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z10 = false;
                break;
            }
            View childAt = ynVar.v0.getChildAt(i13);
            float f14 = ynVar.q9;
            ynVar.v0.getClass();
            if (RecyclerView.R(childAt) == (ynVar.Na ? 0 : ynVar.y0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f14 ? (int) (childAt.getTop() - f14) : i10, eVar, z0Var);
                z10 = true;
            } else {
                i13++;
            }
        }
        if (!z10) {
            i11 = super.o0(i10, eVar, z0Var);
        }
        if (!ynVar.tc.f) {
            SparseArray[] sparseArrayArr = ynVar.U5;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(ynVar.e) && !ynVar.e.megagroup) || (ynVar.f4 && !UserObject.isBotForum(ynVar.f))) && (i12 = ynVar.P3) != 3 && i12 != 9 && i12 != 1 && ynVar.v0.getScrollState() == 1)) {
                sj sjVar = ynVar.v0;
                if (!sjVar.X1 && !sjVar.d2 && !ynVar.z9()) {
                    if (ynVar.L9 == 0.0f && ynVar.N9 != null) {
                        ArrayList arrayList = ynVar.cb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            ynVar.N9.i((TLRPC.Chat) ynVar.cb.get(0));
                        } else if (ynVar.f4) {
                            ynVar.N9.j();
                        } else {
                            ynVar.N9.h();
                        }
                    }
                    Animator animator = ynVar.O9;
                    if (animator != null) {
                        animator.removeAllListeners();
                        ynVar.O9.cancel();
                    }
                    if (ynVar.L9 < AndroidUtilities.dp(110.0f)) {
                        float dp = ynVar.L9 / AndroidUtilities.dp(110.0f);
                        f10 = (1.0f - dp) * 0.65f;
                        f11 = dp * 0.45f;
                    } else if (ynVar.L9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (ynVar.L9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f10 = (1.0f - dp2) * 0.45f;
                        f11 = dp2 * 0.05f;
                    } else {
                        f7 = 0.05f;
                        float f15 = i10 * f7;
                        ynVar.L9 += f15;
                        int i14 = (int) f15;
                        k0Var = zg.k0.B;
                        if (k0Var != null) {
                            k0Var.r -= i14;
                            if (i14 != 0) {
                                k0Var.u = true;
                            }
                        }
                        ynVar.v0.invalidate();
                    }
                    f7 = f11 + f10;
                    float f152 = i10 * f7;
                    ynVar.L9 += f152;
                    int i142 = (int) f152;
                    k0Var = zg.k0.B;
                    if (k0Var != null) {
                    }
                    ynVar.v0.invalidate();
                }
            }
        }
        if (ynVar.L9 == 0.0f) {
            ynVar.v0.setOverScrollMode(0);
        } else {
            ynVar.v0.setOverScrollMode(2);
        }
        if (ynVar.N9 != null) {
            le.b bVar = ynVar.rc;
            if (ynVar.L9 > 0.0f && ynVar.v0.getScrollState() == 1) {
                z11 = true;
            }
            bVar.a(z11, true);
        }
        return i11;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        this.T.qa = false;
        ji.o oVar = new ji.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }

    @Override // s4.s, s4.c0, s4.o0
    public final boolean y0() {
        return true;
    }
}
