// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sl5 implements v02 {
    public final /* synthetic */ wl5 a;

    public sl5(wl5 wl5Var) {
        this.a = wl5Var;
    }

    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x02 x02Var;
        wl5 wl5Var = this.a;
        d dVar = wl5Var.a;
        if (dVar == null || dVar.getParentActivity() == null || (x02Var = wl5Var.c) == null) {
            return;
        }
        if (i != 8 && i != 7) {
            x02Var.J(i);
            if (i == 0) {
                wl5Var.l();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = x02Var.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = wl5Var.c.d2.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z5 = false;
        for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
            y3a y3aVar = new y3a();
            arrayList.add(y3aVar);
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                String str = jm6Var.h;
                if (str != null) {
                    y3aVar.c = str;
                } else {
                    y3aVar.c = jm6Var.I;
                }
                y3aVar.e = jm6Var.c;
                y3aVar.f = jm6Var.g;
                y3aVar.k = jm6Var.s;
                y3aVar.p = jm6Var.d();
                y3aVar.o = jm6Var.b;
                y3aVar.z = jm6Var.m;
                y3aVar.q = true;
                CharSequence charSequence = jm6Var.a;
                y3aVar.d = charSequence != null ? charSequence.toString() : null;
                y3aVar.i = jm6Var.n;
                y3aVar.j = jm6Var.r;
                y3aVar.h = jm6Var.x;
                TLRPC.VideoSize videoSize = jm6Var.S;
                y3aVar.v = videoSize;
                z5 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof nm6) {
                nm6 nm6Var = (nm6) obj;
                String str2 = nm6Var.h;
                if (str2 != null) {
                    y3aVar.c = str2;
                } else {
                    y3aVar.l = nm6Var;
                }
                y3aVar.e = nm6Var.c;
                y3aVar.f = nm6Var.g;
                y3aVar.k = nm6Var.s;
                CharSequence charSequence2 = nm6Var.I;
                y3aVar.d = charSequence2 != null ? charSequence2.toString() : null;
                y3aVar.i = nm6Var.n;
                y3aVar.j = nm6Var.r;
                y3aVar.h = nm6Var.x;
                TLRPC.BotInlineResult botInlineResult = nm6Var.N;
                if (botInlineResult != null && nm6Var.H) {
                    y3aVar.m = botInlineResult;
                    y3aVar.n = nm6Var.O;
                }
                System.currentTimeMillis();
            }
        }
        wl5Var.e(arrayList, z5);
        if (i != 8) {
            wl5Var.c.a(true);
        }
    }

    @Override // v02
    public final void I0() {
        gl.t1(this.a.a.getFragmentView().findFocus());
    }

    @Override // v02
    public final boolean V1() {
        return false;
    }

    @Override // v02
    public final boolean f0() {
        return false;
    }

    @Override // v02
    public final void y0() {
        this.a.q();
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override // v02
    public final void P0(Object obj) {
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
