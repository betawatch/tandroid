// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yf4 implements g59, h59 {
    public final /* synthetic */ ig4 a;

    public /* synthetic */ yf4(ig4 ig4Var) {
        this.a = ig4Var;
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        ig4 ig4Var = this.a;
        dg4 dg4Var = ig4Var.K;
        if (((dk3) dg4Var).b.l2) {
            return;
        }
        gg4 gg4Var = (gg4) view;
        if (!ig4Var.n) {
            if (i != ig4Var.L || dg4Var == null) {
                ig4Var.g(gg4Var.b, i);
                return;
            } else {
                ((dk3) dg4Var).b.R4(true, false);
                return;
            }
        }
        if (i != 0) {
            int L = gm.L(6.0f);
            RectF rectF = gg4Var.f;
            float f3 = L;
            if (rectF.left - f3 >= f || rectF.right + f3 <= f) {
                return;
            }
            dk3 dk3Var = (dk3) ig4Var.K;
            dk3Var.d((ub7) dk3Var.b.getMessagesController().S0().get(gg4Var.b.a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if ((r12 & (-1537)) != 0) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01af  */
    @Override // h59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(int i, View view) {
        a aVar;
        ub7 ub7Var;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ub7 ub7Var2;
        ub7 ub7Var3;
        boolean z5;
        int i2;
        String str;
        int i3;
        CharSequence M0;
        int i4;
        int i5;
        int i6;
        boolean z6;
        TLRPC.Chat L0;
        ig4 ig4Var = this.a;
        dg4 dg4Var = ig4Var.K;
        if (!((dk3) dg4Var).b.l2 && !ig4Var.n) {
            gg4 gg4Var = (gg4) view;
            dk3 dk3Var = (dk3) dg4Var;
            nk3 nk3Var = dk3Var.b;
            if (nk3Var.T0 == 0) {
                aVar = ((d) nk3Var).actionBar;
                if (!aVar.y() && nk3Var.U == 0.0f) {
                    bu5 bu5Var = nk3Var.M0;
                    if (bu5Var != null && bu5Var.E()) {
                        nk3Var.M0.u();
                        nk3Var.M0 = null;
                        return false;
                    }
                    if (gg4Var.getId() != nk3Var.A0.getDefaultTabId()) {
                        ArrayList S0 = nk3Var.getMessagesController().S0();
                        int id = gg4Var.getId();
                        if (S0 != null && id >= 0 && id < S0.size()) {
                            ub7Var = (ub7) S0.get(gg4Var.getId());
                            boolean z7 = true;
                            boolean z8 = ub7Var != null;
                            boolean[] zArr = {true};
                            oc7 messagesController = nk3Var.getMessagesController();
                            arrayList = new ArrayList(!z8 ? messagesController.V0(nk3Var.Y2) : messagesController.y);
                            if (ub7Var == null) {
                                ub7Var2 = (ub7) nk3Var.getMessagesController().S0().get(gg4Var.getId());
                                int i7 = 0;
                                int i8 = i7;
                                if (ub7Var2 != null) {
                                    while (i8 < arrayList.size()) {
                                        if (!ub7Var2.a(nk3Var.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i8)).id)) {
                                            arrayList.remove(i8);
                                            i8--;
                                        }
                                        i8++;
                                    }
                                    if (!ub7Var2.c()) {
                                        if (ub7Var2.i.isEmpty()) {
                                            int i9 = ub7Var2.g;
                                            int i10 = oc7.s5;
                                        }
                                        i7 = 0;
                                        if (i7 != 0) {
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 >= ub7Var2.h.size()) {
                                                    break;
                                                }
                                                long longValue = ((Long) ub7Var2.h.get(i11)).longValue();
                                                if (longValue < 0 && (L0 = nk3Var.getMessagesController().L0(Long.valueOf(-longValue))) != null && qf4.j0(L0)) {
                                                    zArr[0] = false;
                                                    break;
                                                }
                                                i11++;
                                            }
                                        }
                                    }
                                    i7 = 1;
                                    if (i7 != 0) {
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    z = true;
                                    z2 = z8;
                                    z3 = false;
                                    z4 = i7;
                                } else {
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= arrayList.size()) {
                                            z = z7;
                                            z2 = z8;
                                            z6 = z;
                                            break;
                                        }
                                        z = z7;
                                        z2 = z8;
                                        if (!nk3Var.getMessagesController().o2(((TLRPC.Dialog) arrayList.get(i12)).id, 0L, null)) {
                                            z6 = false;
                                            break;
                                        }
                                        i12++;
                                        z7 = z;
                                        z8 = z2;
                                    }
                                    z3 = !z6;
                                    z4 = i7;
                                }
                            } else {
                                z = true;
                                z2 = z8;
                                z3 = false;
                                z4 = 0;
                                ub7Var2 = null;
                            }
                            if (z2) {
                                nk3Var.getMessagesController().getClass();
                                if (ub7Var2 != null && (ub7Var2.g & 64) == 0) {
                                    ub7Var3 = ub7Var2;
                                }
                                ub7Var3 = null;
                            } else {
                                ArrayList S02 = nk3Var.getMessagesController().S0();
                                for (int i13 = 0; i13 < S02.size(); i13++) {
                                    if (((ub7) S02.get(i13)).d()) {
                                        ub7Var3 = (ub7) S02.get(i13);
                                        break;
                                    }
                                }
                                ub7Var3 = null;
                            }
                            z5 = (ub7Var3 == null && nk3Var.getMessagesController().t0(ub7Var3)) ? z : false;
                            boolean z9 = false;
                            for (i2 = 0; i2 < arrayList.size(); i2++) {
                                if (((TLRPC.Dialog) arrayList.get(i2)).unread_mark || ((TLRPC.Dialog) arrayList.get(i2)).unread_count > 0) {
                                    z9 = z;
                                }
                            }
                            bu5 I = bu5.I(nk3Var, gg4Var);
                            ck3 ck3Var = new ck3((byte) 0);
                            Paint paint = new Paint(z ? 1 : 0);
                            ck3Var.b = paint;
                            ck3Var.c = new RectF();
                            paint.setColor(dk3Var.b.getThemedColor(cmb.F8));
                            I.X(ck3Var);
                            I.k(R.drawable.tabs_reorder, jb6.M0(2131750642, null), new bi3(dk3Var, (byte) 7), nk3Var.getMessagesController().S0().size() <= 1);
                            if (z2) {
                                str = null;
                                i3 = 2131750718;
                            } else {
                                i3 = 2131750717;
                                str = null;
                            }
                            I.b(R.drawable.msg_edit, jb6.M0(i3, str), new bk3(dk3Var, z2, ub7Var), false);
                            boolean z10 = ub7Var == null && !arrayList.isEmpty();
                            if (z3) {
                                M0 = jb6.M0(2131750632, null);
                                i4 = R.drawable.msg_unmute;
                            } else {
                                M0 = jb6.M0(2131750674, null);
                                i4 = R.drawable.msg_mute;
                            }
                            I.k(i4, M0, new np6((Object) dk3Var, (Object) arrayList, z3, (byte) 17), z10);
                            I.k(R.drawable.msg_markread, jb6.M0(2131748439, null), new rd3(dk3Var, arrayList, (byte) 8), z9);
                            boolean z11 = ub7Var3 == null;
                            if (z5) {
                                i5 = R.drawable.msg_markunread;
                                i6 = 2131750634;
                            } else {
                                i5 = R.drawable.msg_discussion;
                                i6 = 2131750638;
                            }
                            I.k(i5, jb6.M0(i6, null), new bk3(dk3Var, ub7Var3, z5), z11);
                            I.k(R.drawable.msg_share, qf4.E0((ub7Var2 == null && ub7Var2.e()) ? -1 : 0, jb6.M0(2131748682, null), true), new pz2(dk3Var, zArr, ub7Var2, (byte) 4), z4);
                            I.l(R.drawable.msg_delete, new rd3(dk3Var, ub7Var, (byte) 9), jb6.M0(2131750724, null), !z2, true);
                            I.s = (short) 96;
                            I.i = (byte) 3;
                            I.b0(gm.L(-12.0f), gm.L(-4.0f));
                            I.a0();
                            nk3Var.M0 = I;
                            ig4Var.G.e1(true);
                            return true;
                        }
                    }
                    ub7Var = null;
                    boolean z72 = true;
                    if (ub7Var != null) {
                    }
                    boolean[] zArr2 = {true};
                    oc7 messagesController2 = nk3Var.getMessagesController();
                    arrayList = new ArrayList(!z8 ? messagesController2.V0(nk3Var.Y2) : messagesController2.y);
                    if (ub7Var == null) {
                    }
                    if (z2) {
                    }
                    if (ub7Var3 == null) {
                    }
                    boolean z92 = false;
                    while (i2 < arrayList.size()) {
                    }
                    bu5 I2 = bu5.I(nk3Var, gg4Var);
                    ck3 ck3Var2 = new ck3((byte) 0);
                    Paint paint2 = new Paint(z ? 1 : 0);
                    ck3Var2.b = paint2;
                    ck3Var2.c = new RectF();
                    paint2.setColor(dk3Var.b.getThemedColor(cmb.F8));
                    I2.X(ck3Var2);
                    I2.k(R.drawable.tabs_reorder, jb6.M0(2131750642, null), new bi3(dk3Var, (byte) 7), nk3Var.getMessagesController().S0().size() <= 1);
                    if (z2) {
                    }
                    I2.b(R.drawable.msg_edit, jb6.M0(i3, str), new bk3(dk3Var, z2, ub7Var), false);
                    if (ub7Var == null) {
                    }
                    if (z3) {
                    }
                    I2.k(i4, M0, new np6((Object) dk3Var, (Object) arrayList, z3, (byte) 17), z10);
                    I2.k(R.drawable.msg_markread, jb6.M0(2131748439, null), new rd3(dk3Var, arrayList, (byte) 8), z92);
                    if (ub7Var3 == null) {
                    }
                    if (z5) {
                    }
                    I2.k(i5, jb6.M0(i6, null), new bk3(dk3Var, ub7Var3, z5), z11);
                    I2.k(R.drawable.msg_share, qf4.E0((ub7Var2 == null && ub7Var2.e()) ? -1 : 0, jb6.M0(2131748682, null), true), new pz2(dk3Var, zArr2, ub7Var2, (byte) 4), z4);
                    I2.l(R.drawable.msg_delete, new rd3(dk3Var, ub7Var, (byte) 9), jb6.M0(2131750724, null), !z2, true);
                    I2.s = (short) 96;
                    I2.i = (byte) 3;
                    I2.b0(gm.L(-12.0f), gm.L(-4.0f));
                    I2.a0();
                    nk3Var.M0 = I2;
                    ig4Var.G.e1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
