// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sn5 implements g22 {
    public final /* synthetic */ wn5 a;

    public sn5(wn5 wn5Var) {
        this.a = wn5Var;
    }

    @Override // g22
    public final boolean B() {
        return false;
    }

    @Override // g22
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        i22 i22Var;
        wn5 wn5Var = this.a;
        d dVar = wn5Var.a;
        if (dVar == null || dVar.getParentActivity() == null || (i22Var = wn5Var.c) == null) {
            return;
        }
        if (i != 8 && i != 7) {
            i22Var.I(i);
            if (i == 0) {
                wn5Var.l();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = i22Var.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = wn5Var.c.d2.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z5 = false;
        for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
            z5a z5aVar = new z5a();
            arrayList.add(z5aVar);
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                String str = jo6Var.h;
                if (str != null) {
                    z5aVar.c = str;
                } else {
                    z5aVar.c = jo6Var.I;
                }
                z5aVar.e = jo6Var.c;
                z5aVar.f = jo6Var.g;
                z5aVar.k = jo6Var.s;
                z5aVar.p = jo6Var.d();
                z5aVar.o = jo6Var.b;
                z5aVar.z = jo6Var.m;
                z5aVar.q = true;
                CharSequence charSequence = jo6Var.a;
                z5aVar.d = charSequence != null ? charSequence.toString() : null;
                z5aVar.i = jo6Var.n;
                z5aVar.j = jo6Var.r;
                z5aVar.h = jo6Var.x;
                TLRPC.VideoSize videoSize = jo6Var.S;
                z5aVar.v = videoSize;
                z5 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                String str2 = no6Var.h;
                if (str2 != null) {
                    z5aVar.c = str2;
                } else {
                    z5aVar.l = no6Var;
                }
                z5aVar.e = no6Var.c;
                z5aVar.f = no6Var.g;
                z5aVar.k = no6Var.s;
                CharSequence charSequence2 = no6Var.I;
                z5aVar.d = charSequence2 != null ? charSequence2.toString() : null;
                z5aVar.i = no6Var.n;
                z5aVar.j = no6Var.r;
                z5aVar.h = no6Var.x;
                TLRPC.BotInlineResult botInlineResult = no6Var.N;
                if (botInlineResult != null && no6Var.H) {
                    z5aVar.m = botInlineResult;
                    z5aVar.n = no6Var.O;
                }
                System.currentTimeMillis();
            }
        }
        wn5Var.e(arrayList, z5);
        if (i != 8) {
            wn5Var.c.a(true);
        }
    }

    @Override // g22
    public final void I() {
        this.a.q();
    }

    @Override // g22
    public final boolean K0() {
        return false;
    }

    @Override // g22
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    @Override // g22
    public final void b0() {
        gm.t1(this.a.a.getFragmentView().findFocus());
    }

    @Override // g22
    public final void f0(Object obj) {
    }

    @Override // g22
    public final void z0(TLRPC.User user) {
    }

    @Override // g22
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
