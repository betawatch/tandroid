// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sj3 extends iu5 {
    public f89 e;
    public boolean f;
    public boolean g;
    public final tj3 h;
    public final /* synthetic */ uj3 i;

    public sj3(uj3 uj3Var, tj3 tj3Var) {
        this.i = uj3Var;
        this.h = tj3Var;
    }

    @Override // iu5
    public final int b(int i, int i2) {
        if (this.g) {
            return 0;
        }
        return super.b(i, i2);
    }

    @Override // iu5
    public final long d(RecyclerView recyclerView, int i, float f, float f2) {
        uj3 uj3Var;
        of3 of3Var;
        if (i == 4) {
            return 200L;
        }
        if (i == 8 && (of3Var = (uj3Var = this.i).Z0) != null) {
            hl.d3(new vc(of3Var, (byte) 1), this.h.y.e);
            uj3Var.Z0 = null;
        }
        return super.d(recyclerView, i, f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0141, code lost:
    
        if (xea.m(r14) == 4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e5, code lost:
    
        if (xea.m(r14) != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        if (xea.m(r8) != 5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f9, code lost:
    
        if (r14 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).w() == false) goto L8;
     */
    @Override // iu5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(RecyclerView recyclerView, f89 f89Var) {
        wk5 wk5Var;
        a aVar;
        int i;
        boolean z;
        int i2;
        TLRPC.Dialog dialog;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        wk5 wk5Var2;
        tj3 tj3Var = this.h;
        if (!tj3Var.y.k()) {
            uj3 uj3Var = this.i;
            wk5Var = ((e) uj3Var).parentLayout;
            if (wk5Var != null) {
                wk5Var2 = ((e) uj3Var).parentLayout;
            }
            if (!uj3Var.H3.c() && uj3Var.a3 == 0) {
                if (this.f && this.g) {
                    View view = f89Var.a;
                    if (view instanceof of3) {
                        ((of3) view).x = true;
                    }
                    this.f = false;
                    return 0;
                }
                if (!uj3Var.n2 && tj3Var.a() && uj3Var.Y0 == null) {
                    View view2 = f89Var.a;
                    if (view2 instanceof of3) {
                        of3 of3Var = (of3) view2;
                        long dialogId = of3Var.getDialogId();
                        aVar = ((e) uj3Var).actionBar;
                        if (aVar.A(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) uj3Var.getMessagesController().R.f(dialogId);
                            if (uj3Var.a1 && dialog2 != null && uj3Var.H3(dialog2) && !wf3.C(dialogId) && !uj3Var.K3(tj3Var)) {
                                of3 of3Var2 = (of3) f89Var.a;
                                uj3Var.Z0 = of3Var2;
                                yob.h(aob.d6, uj3Var.getResourceProvider(), of3Var2);
                                this.g = false;
                                return iu5.m(3, 0);
                            }
                        } else {
                            int i9 = uj3Var.T0;
                            try {
                                i9 = tj3Var.d.h;
                            } catch (Exception unused) {
                            }
                            ij3 ij3Var = uj3Var.A0;
                            if (ij3Var != null && ij3Var.getVisibility() == 0) {
                                i8 = ((e) uj3Var).currentAccount;
                            }
                            if (uj3Var.e1) {
                                if (dialogId == uj3Var.getUserConfig().n || dialogId == 777000 || i9 == 7 || i9 == 8) {
                                    i = ((e) uj3Var).currentAccount;
                                }
                                if (uj3Var.getMessagesController().G2(dialogId, false)) {
                                    int i10 = uj3Var.getMessagesController().t2;
                                    int i11 = uc7.s5;
                                }
                                if (uj3Var.Y2 == 0) {
                                    i3 = ((e) uj3Var).currentAccount;
                                    if (dialogId >= 0 || !xc2.Y(uc7.s1(i3).M0(Long.valueOf(-dialogId)))) {
                                        i4 = ((e) uj3Var).currentAccount;
                                        if (xea.m(i4) != 3) {
                                            i5 = ((e) uj3Var).currentAccount;
                                            if (xea.m(i5) != 1) {
                                                i6 = ((e) uj3Var).currentAccount;
                                                if (xea.m(i6) != 0) {
                                                    i7 = ((e) uj3Var).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!uj3Var.H3.c()) {
                                        z = true;
                                        i2 = ((e) uj3Var).currentAccount;
                                        if (xea.m(i2) == 1 && (dialog = (TLRPC.Dialog) uj3Var.getMessagesController().R.f(dialogId)) != null && uj3Var.H4(tj3Var, dialog) && uj3Var.getMessagesController().s2(dialog)) {
                                            z = false;
                                        }
                                        this.g = false;
                                        this.f = !(z || wf3.C(of3Var.getDialogId())) || (xea.m1 && wf3.C(of3Var.getDialogId()));
                                        of3Var.setSliding(true);
                                        return iu5.m(0, 4);
                                    }
                                }
                                z = false;
                                i2 = ((e) uj3Var).currentAccount;
                                if (xea.m(i2) == 1) {
                                    z = false;
                                }
                                this.g = false;
                                this.f = !(z || wf3.C(of3Var.getDialogId())) || (xea.m1 && wf3.C(of3Var.getDialogId()));
                                of3Var.setSliding(true);
                                return iu5.m(0, 4);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // iu5
    public final float g(float f) {
        return 3500.0f;
    }

    @Override // iu5
    public final float h() {
        return 0.45f;
    }

    @Override // iu5
    public final float i(float f) {
        return Float.MAX_VALUE;
    }

    @Override // iu5
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        uj3 uj3Var = this.i;
        ArrayList arrayList = uj3Var.c1;
        View view = f89Var2.a;
        if (view instanceof of3) {
            long dialogId = ((of3) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var.getMessagesController().R.f(dialogId);
            if (dialog != null && uj3Var.H3(dialog) && !wf3.C(dialogId)) {
                int b = f89Var.b();
                int b2 = f89Var2.b();
                tj3 tj3Var = this.h;
                if (tj3Var.a.getItemAnimator() == null) {
                    tj3Var.a.setItemAnimator(tj3Var.y);
                }
                yh3 yh3Var = tj3Var.d;
                uj3 uj3Var2 = yh3Var.S;
                int i = yh3Var.G;
                ArrayList o3 = uj3Var2.o3(i, yh3Var.h, yh3Var.r, false);
                int H = yh3Var.H(b);
                int H2 = yh3Var.H(b2);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) o3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) o3.get(H2);
                int i2 = yh3Var.h;
                if (i2 == 7 || i2 == 8) {
                    LongSparseIntArray longSparseIntArray = uc7.s1(i).N[yh3Var.h == 8 ? (char) 1 : (char) 0].j;
                    int i3 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i3);
                } else {
                    int i4 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i4;
                }
                Collections.swap(o3, H, H2);
                yh3Var.S(null);
                int i5 = uj3Var.f0[0].s;
                if (i5 != 7 && i5 != 8) {
                    uj3Var.b1 = true;
                    return true;
                }
                ac7 ac7Var = uj3Var.getMessagesController().N[uj3Var.f0[0].s == 8 ? (char) 1 : (char) 0];
                if (arrayList.contains(ac7Var)) {
                    return true;
                }
                arrayList.add(ac7Var);
                return true;
            }
        }
        return false;
    }

    @Override // iu5
    public final void q(f89 f89Var, int i) {
        if (f89Var != null) {
            this.h.a.f1(false);
        }
        this.e = f89Var;
        if (f89Var != null) {
            View view = f89Var.a;
            if (view instanceof of3) {
                ((of3) view).x = false;
            }
        }
    }

    @Override // iu5
    public final void r(f89 f89Var) {
        int i;
        uj3 uj3Var = this.i;
        if (f89Var == null) {
            uj3Var.Y0 = null;
            return;
        }
        of3 of3Var = (of3) f89Var.a;
        long dialogId = of3Var.getDialogId();
        boolean C = wf3.C(dialogId);
        tj3 tj3Var = this.h;
        if (C) {
            qj3 qj3Var = tj3Var.a;
            int i2 = qj3.C3;
            qj3Var.D1(false, of3Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var.getMessagesController().R.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!uj3Var.getMessagesController().G2(dialogId, false) && uj3Var.Y2 == 0) {
            i = ((e) uj3Var).currentAccount;
            if (xea.m(i) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                uj3Var.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                uj3Var.K4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (xc2.Y(uj3Var.getMessagesController().M0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            uj3Var.K4(arrayList2, jn7.v1, true, false, null);
            return;
        }
        uj3Var.Y0 = of3Var;
        aq1 aq1Var = new aq1(this, dialog, tj3Var.d.b(), f89Var.b(), (byte) 4);
        uj3Var.U4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            aq1Var.run();
            return;
        }
        su7 su7Var = uj3Var.X0;
        if (su7Var == null) {
            qj3 qj3Var2 = tj3Var.a;
            su7Var = new su7();
            su7Var.a = new Paint(1);
            Paint paint = new Paint(1);
            su7Var.b = paint;
            su7Var.e = 0L;
            su7Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.L(2.0f));
            su7Var.c = qj3Var2;
            uj3Var.X0 = su7Var;
        }
        su7Var.d = aq1Var;
        su7Var.h = 0.0f;
        su7Var.g = 0.0f;
        su7Var.e = System.currentTimeMillis();
        su7Var.c.invalidate();
    }
}
