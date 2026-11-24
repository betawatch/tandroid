// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ye9 implements g22 {
    public final /* synthetic */ i22 a;
    public final /* synthetic */ jf9 b;

    public ye9(jf9 jf9Var, i22 i22Var) {
        this.b = jf9Var;
        this.a = i22Var;
    }

    @Override // g22
    public final boolean B() {
        return false;
    }

    @Override // g22
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        i22 i22Var = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
        jf9 jf9Var = this.b;
        if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            ch9 ch9Var = jf9Var.Q;
            ll0 ll0Var = ch9Var.j4;
            ch9Var.j4 = null;
            int i4 = 0;
            while (true) {
                if (i4 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i4));
                if (obj instanceof jo6) {
                    ch9 ch9Var2 = jf9Var.Q;
                    if (ll0Var != null) {
                        ch9Var2.P1(ll0Var, (jo6) obj);
                    } else {
                        ch9Var2.a2((jo6) obj);
                    }
                } else {
                    i4++;
                }
            }
        }
        jf9Var.Q.j4 = null;
        i22Var.a(true);
    }

    @Override // g22
    public final boolean K0() {
        return false;
    }

    @Override // g22
    public final void a1(vr0 vr0Var) {
        nm7.f(this.b.getCurrentAccount()).d(vr0Var);
    }

    @Override // g22
    public final void I() {
    }

    @Override // g22
    public final void b0() {
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
