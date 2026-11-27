// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vn5 implements l12 {
    public final /* synthetic */ zn5 a;

    public vn5(zn5 zn5Var) {
        this.a = zn5Var;
    }

    @Override // l12
    public final boolean E0() {
        return false;
    }

    @Override // l12
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override // l12
    public final void R() {
        this.a.q();
    }

    @Override // l12
    public final void V() {
        hl.t1(this.a.a.getFragmentView().findFocus());
    }

    @Override // l12
    public final boolean o() {
        return false;
    }

    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        n12 n12Var;
        zn5 zn5Var = this.a;
        e eVar = zn5Var.a;
        if (eVar == null || eVar.getParentActivity() == null || (n12Var = zn5Var.c) == null) {
            return;
        }
        if (i != 8 && i != 7) {
            n12Var.I(i);
            if (i == 0) {
                zn5Var.l();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = n12Var.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = zn5Var.c.d2.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z5 = false;
        for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
            q7a q7aVar = new q7a();
            arrayList.add(q7aVar);
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                String str = no6Var.h;
                if (str != null) {
                    q7aVar.c = str;
                } else {
                    q7aVar.c = no6Var.I;
                }
                q7aVar.e = no6Var.c;
                q7aVar.f = no6Var.g;
                q7aVar.k = no6Var.s;
                q7aVar.p = no6Var.d();
                q7aVar.o = no6Var.b;
                q7aVar.z = no6Var.m;
                q7aVar.q = true;
                CharSequence charSequence = no6Var.a;
                q7aVar.d = charSequence != null ? charSequence.toString() : null;
                q7aVar.i = no6Var.n;
                q7aVar.j = no6Var.r;
                q7aVar.h = no6Var.x;
                TLRPC.VideoSize videoSize = no6Var.S;
                q7aVar.v = videoSize;
                z5 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof ro6) {
                ro6 ro6Var = (ro6) obj;
                String str2 = ro6Var.h;
                if (str2 != null) {
                    q7aVar.c = str2;
                } else {
                    q7aVar.l = ro6Var;
                }
                q7aVar.e = ro6Var.c;
                q7aVar.f = ro6Var.g;
                q7aVar.k = ro6Var.s;
                CharSequence charSequence2 = ro6Var.I;
                q7aVar.d = charSequence2 != null ? charSequence2.toString() : null;
                q7aVar.i = ro6Var.n;
                q7aVar.j = ro6Var.r;
                q7aVar.h = ro6Var.x;
                TLRPC.BotInlineResult botInlineResult = ro6Var.N;
                if (botInlineResult != null && ro6Var.H) {
                    q7aVar.m = botInlineResult;
                    q7aVar.n = ro6Var.O;
                }
                System.currentTimeMillis();
            }
        }
        zn5Var.e(arrayList, z5);
        if (i != 8) {
            zn5Var.c.a(true);
        }
    }

    @Override // l12
    public final void e0(Object obj) {
    }

    @Override // l12
    public final void i0(TLRPC.User user) {
    }

    @Override // l12
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
