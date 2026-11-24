// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class x52 implements v02 {
    public final /* synthetic */ d a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ x31 c;

    public x52(x31 x31Var, p8c p8cVar, d dVar) {
        this.a = dVar;
        this.b = p8cVar;
        this.c = x31Var;
    }

    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x31 x31Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x31Var.d2;
        p8c p8cVar = this.b;
        if (i == 15) {
            d dVar = this.a;
            ij.d0(dVar.getContext(), dVar.getResourceProvider(), null, null, new w52(p8cVar, (byte) 0), null);
        } else if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                y3a y3aVar = new y3a();
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
                    y3aVar.z = jm6Var.m;
                    y3aVar.q = true;
                    y3aVar.o = jm6Var.b;
                    CharSequence charSequence = jm6Var.a;
                    y3aVar.d = charSequence != null ? charSequence.toString() : null;
                    y3aVar.i = jm6Var.n;
                    y3aVar.j = jm6Var.r;
                    y3aVar.h = jm6Var.x;
                    y3aVar.v = jm6Var.S;
                    y3aVar.y = jm6Var;
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
                p8cVar.a(new pd8(y3aVar));
            }
        }
        x31Var.a(true);
    }

    @Override // v02
    public final boolean V1() {
        return false;
    }

    @Override // v02
    public final boolean g0() {
        return false;
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        kk7.f(this.a.getCurrentAccount()).d(vq0Var);
    }

    @Override // v02
    public final void I0() {
    }

    @Override // v02
    public final void z0() {
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
