// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xd4 implements d39, e39 {
    public final /* synthetic */ he4 a;

    public /* synthetic */ xd4(he4 he4Var) {
        this.a = he4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if ((r12 & (-1537)) != 0) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027d  */
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
    @Override // e39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i, View view) {
        a aVar;
        t97 t97Var;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        t97 t97Var2;
        t97 t97Var3;
        boolean z5;
        int i2;
        String str;
        int i3;
        CharSequence M0;
        int i4;
        int i5;
        int i6;
        boolean z6;
        TLRPC.Chat K0;
        he4 he4Var = this.a;
        ce4 ce4Var = he4Var.K;
        if (!((ti3) ce4Var).b.l2 && !he4Var.n) {
            fe4 fe4Var = (fe4) view;
            ti3 ti3Var = (ti3) ce4Var;
            cj3 cj3Var = ti3Var.b;
            if (cj3Var.T0 == 0) {
                aVar = ((d) cj3Var).actionBar;
                if (!aVar.y() && cj3Var.U == 0.0f) {
                    cs5 cs5Var = cj3Var.M0;
                    if (cs5Var != null && cs5Var.E()) {
                        cj3Var.M0.u();
                        cj3Var.M0 = null;
                        return false;
                    }
                    if (fe4Var.getId() != cj3Var.A0.getDefaultTabId()) {
                        ArrayList R0 = cj3Var.getMessagesController().R0();
                        int id = fe4Var.getId();
                        if (R0 != null && id >= 0 && id < R0.size()) {
                            t97Var = (t97) R0.get(fe4Var.getId());
                            boolean z7 = true;
                            boolean z8 = t97Var != null;
                            boolean[] zArr = {true};
                            na7 messagesController = cj3Var.getMessagesController();
                            arrayList = new ArrayList(!z8 ? messagesController.U0(cj3Var.Y2) : messagesController.y);
                            if (t97Var == null) {
                                t97Var2 = (t97) cj3Var.getMessagesController().R0().get(fe4Var.getId());
                                int i7 = 0;
                                int i8 = i7;
                                if (t97Var2 != null) {
                                    while (i8 < arrayList.size()) {
                                        if (!t97Var2.a(cj3Var.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i8)).id)) {
                                            arrayList.remove(i8);
                                            i8--;
                                        }
                                        i8++;
                                    }
                                    if (!t97Var2.c()) {
                                        if (t97Var2.i.isEmpty()) {
                                            int i9 = t97Var2.g;
                                            int i10 = na7.q5;
                                        }
                                        i7 = 0;
                                        if (i7 != 0) {
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 >= t97Var2.h.size()) {
                                                    break;
                                                }
                                                long longValue = ((Long) t97Var2.h.get(i11)).longValue();
                                                if (longValue < 0 && (K0 = cj3Var.getMessagesController().K0(Long.valueOf(-longValue))) != null && pd4.i0(K0)) {
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
                                        if (!cj3Var.getMessagesController().n2(((TLRPC.Dialog) arrayList.get(i12)).id, 0L, null)) {
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
                                t97Var2 = null;
                            }
                            if (z2) {
                                cj3Var.getMessagesController().getClass();
                                if (t97Var2 != null && (t97Var2.g & 64) == 0) {
                                    t97Var3 = t97Var2;
                                }
                                t97Var3 = null;
                            } else {
                                ArrayList R02 = cj3Var.getMessagesController().R0();
                                for (int i13 = 0; i13 < R02.size(); i13++) {
                                    if (((t97) R02.get(i13)).d()) {
                                        t97Var3 = (t97) R02.get(i13);
                                        break;
                                    }
                                }
                                t97Var3 = null;
                            }
                            z5 = (t97Var3 == null && cj3Var.getMessagesController().t0(t97Var3)) ? z : false;
                            boolean z9 = false;
                            for (i2 = 0; i2 < arrayList.size(); i2++) {
                                if (((TLRPC.Dialog) arrayList.get(i2)).unread_mark || ((TLRPC.Dialog) arrayList.get(i2)).unread_count > 0) {
                                    z9 = z;
                                }
                            }
                            cs5 I = cs5.I(cj3Var, fe4Var);
                            si3 si3Var = new si3((byte) 0);
                            Paint paint = new Paint(z ? 1 : 0);
                            si3Var.b = paint;
                            si3Var.c = new RectF();
                            paint.setColor(ti3Var.b.getThemedColor(bkb.F8));
                            I.X(si3Var);
                            I.k(R.drawable.tabs_reorder, k96.M0(2131750693, null), new li3(ti3Var, (byte) 2), cj3Var.getMessagesController().R0().size() <= 1);
                            if (z2) {
                                str = null;
                                i3 = 2131750769;
                            } else {
                                i3 = 2131750768;
                                str = null;
                            }
                            I.b(R.drawable.msg_edit, k96.M0(i3, str), new ri3(ti3Var, z2, t97Var), false);
                            boolean z10 = t97Var == null && !arrayList.isEmpty();
                            if (z3) {
                                M0 = k96.M0(2131750683, null);
                                i4 = R.drawable.msg_unmute;
                            } else {
                                M0 = k96.M0(2131750725, null);
                                i4 = R.drawable.msg_mute;
                            }
                            I.k(i4, M0, new mn6((Object) ti3Var, (Object) arrayList, z3, (byte) 17), z10);
                            I.k(R.drawable.msg_markread, k96.M0(2131748490, null), new wc3(ti3Var, arrayList, (byte) 7), z9);
                            boolean z11 = t97Var3 == null;
                            if (z5) {
                                i5 = R.drawable.msg_markunread;
                                i6 = 2131750685;
                            } else {
                                i5 = R.drawable.msg_discussion;
                                i6 = 2131750689;
                            }
                            I.k(i5, k96.M0(i6, null), new ri3(ti3Var, t97Var3, z5), z11);
                            I.k(R.drawable.msg_share, pd4.D0((t97Var2 == null && t97Var2.e()) ? -1 : 0, k96.M0(2131748733, null), true), new mg3(ti3Var, zArr, t97Var2, (byte) 2), z4);
                            I.l(R.drawable.msg_delete, new wc3(ti3Var, t97Var, (byte) 8), k96.M0(2131750775, null), !z2, true);
                            I.s = (short) 96;
                            I.i = (byte) 3;
                            I.b0(gl.L(-12.0f), gl.L(-4.0f));
                            I.a0();
                            cj3Var.M0 = I;
                            he4Var.G.e1(true);
                            return true;
                        }
                    }
                    t97Var = null;
                    boolean z72 = true;
                    if (t97Var != null) {
                    }
                    boolean[] zArr2 = {true};
                    na7 messagesController2 = cj3Var.getMessagesController();
                    arrayList = new ArrayList(!z8 ? messagesController2.U0(cj3Var.Y2) : messagesController2.y);
                    if (t97Var == null) {
                    }
                    if (z2) {
                    }
                    if (t97Var3 == null) {
                    }
                    boolean z92 = false;
                    while (i2 < arrayList.size()) {
                    }
                    cs5 I2 = cs5.I(cj3Var, fe4Var);
                    si3 si3Var2 = new si3((byte) 0);
                    Paint paint2 = new Paint(z ? 1 : 0);
                    si3Var2.b = paint2;
                    si3Var2.c = new RectF();
                    paint2.setColor(ti3Var.b.getThemedColor(bkb.F8));
                    I2.X(si3Var2);
                    I2.k(R.drawable.tabs_reorder, k96.M0(2131750693, null), new li3(ti3Var, (byte) 2), cj3Var.getMessagesController().R0().size() <= 1);
                    if (z2) {
                    }
                    I2.b(R.drawable.msg_edit, k96.M0(i3, str), new ri3(ti3Var, z2, t97Var), false);
                    if (t97Var == null) {
                    }
                    if (z3) {
                    }
                    I2.k(i4, M0, new mn6((Object) ti3Var, (Object) arrayList, z3, (byte) 17), z10);
                    I2.k(R.drawable.msg_markread, k96.M0(2131748490, null), new wc3(ti3Var, arrayList, (byte) 7), z92);
                    if (t97Var3 == null) {
                    }
                    if (z5) {
                    }
                    I2.k(i5, k96.M0(i6, null), new ri3(ti3Var, t97Var3, z5), z11);
                    I2.k(R.drawable.msg_share, pd4.D0((t97Var2 == null && t97Var2.e()) ? -1 : 0, k96.M0(2131748733, null), true), new mg3(ti3Var, zArr2, t97Var2, (byte) 2), z4);
                    I2.l(R.drawable.msg_delete, new wc3(ti3Var, t97Var, (byte) 8), k96.M0(2131750775, null), !z2, true);
                    I2.s = (short) 96;
                    I2.i = (byte) 3;
                    I2.b0(gl.L(-12.0f), gl.L(-4.0f));
                    I2.a0();
                    cj3Var.M0 = I2;
                    he4Var.G.e1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        he4 he4Var = this.a;
        ce4 ce4Var = he4Var.K;
        if (((ti3) ce4Var).b.l2) {
            return;
        }
        fe4 fe4Var = (fe4) view;
        if (!he4Var.n) {
            if (i != he4Var.L || ce4Var == null) {
                he4Var.g(fe4Var.b, i);
                return;
            } else {
                ((ti3) ce4Var).b.N4(true, false);
                return;
            }
        }
        if (i != 0) {
            int L = gl.L(6.0f);
            RectF rectF = fe4Var.f;
            float f3 = L;
            if (rectF.left - f3 >= f || rectF.right + f3 <= f) {
                return;
            }
            ti3 ti3Var = (ti3) he4Var.K;
            ti3Var.d((t97) ti3Var.b.getMessagesController().R0().get(fe4Var.b.a));
        }
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
