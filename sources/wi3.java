// default package

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wi3 extends yc8 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ uj3 b;

    public wi3(uj3 uj3Var, boolean[] zArr) {
        this.b = uj3Var;
        this.a = zArr;
    }

    @Override // yc8, ed8
    public final CharSequence B(int i) {
        uj3 uj3Var = this.b;
        if (i < 0 || i >= uj3Var.F2.size() || !((no6) uj3Var.F2.get(i)).b) {
            return uj3Var.E2();
        }
        return null;
    }

    @Override // yc8, ed8
    public final void C() {
        int i;
        uj3 uj3Var = this.b;
        sea seaVar = uj3Var.I2;
        if (seaVar != null) {
            i = ((e) uj3Var).currentAccount;
            seaVar.i(i, uj3Var.F2);
        }
    }

    @Override // yc8, ed8
    public final int G() {
        ArrayList arrayList = this.b.F2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // yc8, ed8
    public final boolean H() {
        return this.b.G2();
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        int i4;
        ArrayList arrayList;
        uj3 uj3Var = this.b;
        ArrayList arrayList2 = uj3Var.K2;
        if (uj3Var.D1 != null && (arrayList = uj3Var.F2) != null && !arrayList.isEmpty()) {
            no6 no6Var = (no6) uj3Var.F2.get(0);
            bi3 bi3Var = uj3Var.D1;
            CharSequence charSequence = no6Var.a;
            if (charSequence == null) {
                charSequence = "";
            }
            bi3Var.setFieldText(charSequence);
        }
        sea seaVar = uj3Var.I2;
        if (seaVar != null) {
            i4 = ((e) uj3Var).currentAccount;
            seaVar.i(i4, uj3Var.F2);
        }
        if ((z && i2 == 0 && !z2) || uj3Var.E2 == null || arrayList2.isEmpty()) {
            PhotoViewer.q0().A(true, false);
            return;
        }
        uj3Var.L2 = z;
        uj3Var.M2 = i2;
        uj3Var.O2 = z2;
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            arrayList3.add(if7.a(((Long) arrayList2.get(i5)).longValue(), 0L));
        }
        PhotoViewer.q0().A(true, false);
        uj3Var.E2.q(uj3Var, arrayList3, uj3Var.D1.getFieldText(), false, z, i2, i3, null);
    }

    @Override // yc8, ed8
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        uj3 uj3Var = this.b;
        sea seaVar = uj3Var.I2;
        de0 f = seaVar != null ? seaVar.f(i) : null;
        if (f == null) {
            return null;
        }
        int[] iArr = new int[2];
        f.getLocationInWindow(iArr);
        fd8 fd8Var = new fd8();
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = uj3Var.I2;
        ImageReceiver imageReceiver = f.getImageReceiver();
        fd8Var.a = imageReceiver;
        fd8Var.e = imageReceiver.p();
        fd8Var.k = f.getScaleX();
        fd8Var.h = new int[]{hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f)};
        return fd8Var;
    }

    @Override // yc8, ed8
    public final long a() {
        ArrayList arrayList = this.b.K2;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayList.get(0)).longValue();
    }

    @Override // yc8, ed8
    public final boolean b() {
        uj3 uj3Var = this.b;
        ArrayList arrayList = uj3Var.K2;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                long longValue = ((Long) obj).longValue();
                if (!wf3.B(longValue) && uj3Var.getMessagesController().M1(longValue) <= 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // yc8, ed8
    public final CharSequence d0(int i) {
        uj3 uj3Var = this.b;
        ArrayList arrayList = uj3Var.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = uj3Var.F2.size();
        ArrayList arrayList2 = uj3Var.F2;
        if (size == 1) {
            return ob6.M0(((no6) arrayList2.get(0)).b ? 2131753926 : 2131753941, null);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList2.get(i4);
            i4++;
            if (((no6) obj).b) {
                i2++;
            } else {
                i3++;
            }
        }
        return i2 == 0 ? ob6.G(size, "ShareSendPhotos", new Object[0]) : i3 == 0 ? ob6.G(size, "ShareSendVideos", new Object[0]) : ob6.G(size, "ShareSendItems", new Object[0]);
    }

    @Override // yc8, ed8
    public final void f(CharSequence charSequence) {
        uj3 uj3Var = this.b;
        bi3 bi3Var = uj3Var.D1;
        if (bi3Var != null) {
            bi3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = uj3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((no6) obj).a = charSequence;
            }
        }
    }

    @Override // yc8, ed8
    public final boolean i() {
        TLRPC.User X1;
        uj3 uj3Var = this.b;
        ArrayList arrayList = uj3Var.K2;
        if (!arrayList.isEmpty()) {
            uc7 messagesController = uj3Var.getMessagesController();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Long l = (Long) obj;
                if (wf3.D(l.longValue()) && (X1 = messagesController.X1(l)) != null && !X1.bot && !lbc.D(X1)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // yc8, ed8
    public final mn5 k(int i) {
        sea seaVar = this.b.I2;
        de0 f = seaVar != null ? seaVar.f(i) : null;
        if (f != null) {
            return f.getImageReceiver().p();
        }
        return null;
    }

    @Override // yc8, ed8
    public final void r() {
        bi3 bi3Var;
        ub1 c0;
        PhotoViewer q0 = PhotoViewer.q0();
        CharSequence charSequence = null;
        if (q0.V0() && (c0 = q0.c0()) != null) {
            charSequence = c0.getText();
        }
        uj3 uj3Var = this.b;
        if (charSequence != null && (bi3Var = uj3Var.D1) != null) {
            bi3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = uj3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((no6) obj).a = charSequence;
            }
        }
    }

    @Override // yc8, ed8
    public final boolean w(int i) {
        return this.a[i];
    }

    @Override // yc8, ed8
    public final int D(int i, oec oecVar) {
        return i;
    }
}
