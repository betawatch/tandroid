// default package

import android.text.Editable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v52 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v52(pm5 pm5Var, File file, String str, int i, Object obj, int i2) {
        this.d = pm5Var;
        this.e = file;
        this.f = str;
        this.b = i;
        this.h = obj;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        kc4 E;
        byte b2 = this.a;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b2) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) serializable;
                yv1 yv1Var = (yv1) obj;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                i22 i22Var = chatAttachAlertPhotoLayout.b;
                if (!i22Var.z1 || i22Var.A1) {
                    b = this.c;
                } else {
                    PhotoViewer.r0().T1(null, dVar, null);
                    PhotoViewer r0 = PhotoViewer.r0();
                    r0.h = 0;
                    r0.n = false;
                    b = 3;
                }
                if (i22Var.B1) {
                    b = 13;
                }
                PhotoViewer.r0().o1(arrayList, this.b, b, false, chatAttachAlertPhotoLayout.i1, i22Var.B1 ? null : yv1Var);
                PhotoViewer.r0().G1(i22Var.K1);
                if (i22Var.z1 && !i22Var.A1) {
                    PhotoViewer.r0().P = false;
                } else if (i22Var.N2 != 0) {
                    PhotoViewer.r0().P = true;
                    PhotoViewer.r0().Q = i22Var.O2 != null;
                }
                if (i22Var.A1) {
                    PhotoViewer.r0().U(null, null, false, i22Var.D1);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer r02 = PhotoViewer.r0();
                    Editable text = i22Var.U0().getText();
                    r02.u7 = true;
                    r02.v7 = text;
                    r02.J1(null, text, false, false);
                    r02.E2(null);
                    break;
                }
                break;
            default:
                pm5 pm5Var = (pm5) obj3;
                File file = (File) obj2;
                String str = (String) serializable;
                pm5Var.getClass();
                int i = this.b;
                if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (E = bc4.E(obj)) != null)) {
                    k47 k47Var = obj instanceof k47 ? (k47) obj : null;
                    long j = E.a;
                    if (pve.d(j >= 0 ? 1 : sd2.V(oc7.r1(i).L0(Long.valueOf(-j))) ? 4 : 2, E, k47Var, i)) {
                        gm.e(file.toString());
                    }
                }
                nm7.f(i).k(nm7.Y1, str, file);
                fn5 fn5Var = pm5Var.b;
                fn5Var.s.c(new sv2(fn5Var, str, this.c, file, (byte) 1));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i, d dVar, ArrayList arrayList, int i2, yv1 yv1Var) {
        this.d = chatAttachAlertPhotoLayout;
        this.c = i;
        this.e = dVar;
        this.f = arrayList;
        this.b = i2;
        this.h = yv1Var;
    }
}
