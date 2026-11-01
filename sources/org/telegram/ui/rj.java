package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rj implements org.telegram.ui.ActionBar.q0, ns0, org.telegram.ui.Components.h50, gm, vn0 {
    public final /* synthetic */ un a;

    public /* synthetic */ rj(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.ns0
    public void H0(org.telegram.messenger.kj kjVar) {
        un unVar = this.a;
        unVar.z0.I0(true);
        unVar.z0.C0();
        if (MediaController.B().I(kjVar)) {
            unVar.l1.removeView(unVar.H8);
            unVar.H8 = null;
            unVar.K8 = null;
            unVar.J8 = null;
        }
        for (int i10 = 0; i10 < unVar.z0.getChildCount(); i10++) {
            if (unVar.z0.getChildAt(i10) instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) unVar.z0.getChildAt(i10);
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == kjVar.f1()) {
                    q1Var.getPhotoImage().O0(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ns0
    public void I(org.telegram.messenger.kj kjVar) {
        if (kjVar == null) {
            return;
        }
        if (MediaController.B().I(kjVar)) {
            for (int i10 = 0; i10 < this.a.z0.getChildCount(); i10++) {
                if (this.a.z0.getChildAt(i10) instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.a.z0.getChildAt(i10);
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == kjVar.f1()) {
                        org.telegram.ui.Components.s5 m10 = q1Var.getPhotoImage().m();
                        if (m10.b0) {
                            m10.stop();
                        }
                        Bitmap m11 = m10.m();
                        if (m11 != null) {
                            try {
                                uk ukVar = this.a.Pa;
                                int width = m11.getWidth();
                                int height = m11.getHeight();
                                org.telegram.ui.Cells.y5 y5Var = ukVar.d;
                                Bitmap bitmap = y5Var == null ? null : ((TextureView) y5Var.d).getBitmap(width, height);
                                new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                org.telegram.messenger.f8.g(th2, true);
                            }
                        }
                    }
                }
            }
            this.a.Z7(true);
            MediaController B = MediaController.B();
            un unVar = this.a;
            B.p0(unVar.K8, unVar.J8, unVar.H8, true);
        }
        this.a.z0.invalidate();
    }

    @Override // org.telegram.ui.gm
    public void T0(int i10) {
        this.a.l(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.vn0
    public void V() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            this.a.startActivityForResult(createChooser, 1);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void e() {
        org.telegram.ui.Components.ol0.d(new xe(this.a, 2));
    }

    @Override // org.telegram.ui.ns0
    public TextureView k0() {
        return this.a.K8;
    }

    @Override // org.telegram.ui.gm
    public void v0(String str) {
        this.a.ya(str, false);
    }

    @Override // org.telegram.ui.vn0
    public void b(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void a() {
    }

    @Override // org.telegram.ui.gm
    public /* synthetic */ void X(boolean z10, boolean z11) {
    }
}
