package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class si implements org.telegram.ui.ActionBar.n0, tq0, org.telegram.ui.Components.n40, gl, gm0 {
    public final /* synthetic */ wm a;

    public /* synthetic */ si(wm wmVar) {
        this.a = wmVar;
    }

    @Override // org.telegram.ui.tq0
    public void G(org.telegram.messenger.zi ziVar) {
        if (ziVar == null) {
            return;
        }
        if (MediaController.B().I(ziVar)) {
            for (int i3 = 0; i3 < this.a.A0.getChildCount(); i3++) {
                if (this.a.A0.getChildAt(i3) instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.a.A0.getChildAt(i3);
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == ziVar.f1()) {
                        org.telegram.ui.Components.t5 m10 = q1Var.getPhotoImage().m();
                        if (m10.c0) {
                            m10.stop();
                        }
                        Bitmap m11 = m10.m();
                        if (m11 != null) {
                            try {
                                uj ujVar = this.a.Qa;
                                int width = m11.getWidth();
                                int height = m11.getHeight();
                                org.telegram.ui.Cells.t5 t5Var = ujVar.d;
                                Bitmap bitmap = t5Var == null ? null : ((TextureView) t5Var.d).getBitmap(width, height);
                                new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                org.telegram.messenger.a8.g(th2, true);
                            }
                        }
                    }
                }
            }
            this.a.c8(true);
            MediaController B = MediaController.B();
            wm wmVar = this.a;
            B.p0(wmVar.L8, wmVar.K8, wmVar.I8, true);
        }
        this.a.A0.invalidate();
    }

    @Override // org.telegram.ui.tq0
    public void I0(org.telegram.messenger.zi ziVar) {
        wm wmVar = this.a;
        wmVar.A0.I0(true);
        wmVar.A0.C0();
        if (MediaController.B().I(ziVar)) {
            wmVar.m1.removeView(wmVar.I8);
            wmVar.I8 = null;
            wmVar.L8 = null;
            wmVar.K8 = null;
        }
        for (int i3 = 0; i3 < wmVar.A0.getChildCount(); i3++) {
            if (wmVar.A0.getChildAt(i3) instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) wmVar.A0.getChildAt(i3);
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == ziVar.f1()) {
                    q1Var.getPhotoImage().O0(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.gl
    public void T0(int i3) {
        this.a.l(i3, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void g() {
        org.telegram.ui.Components.nk0.d(new ke(this.a, 2));
    }

    @Override // org.telegram.ui.tq0
    public TextureView i0() {
        return this.a.L8;
    }

    @Override // org.telegram.ui.gm0
    public void m() {
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.gl
    public void w0(String str) {
        this.a.Da(str, false);
    }

    @Override // org.telegram.ui.gm0
    public void a(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void e() {
    }

    @Override // org.telegram.ui.gl
    public /* synthetic */ void Y(boolean z10, boolean z11) {
    }
}
