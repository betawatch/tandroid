package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class xi implements org.telegram.ui.ActionBar.n0, dr0, org.telegram.ui.Components.f50, ll, pm0 {
    public final /* synthetic */ bn a;

    public /* synthetic */ xi(bn bnVar) {
        this.a = bnVar;
    }

    @Override // org.telegram.ui.dr0
    public void G0(org.telegram.messenger.fj fjVar) {
        bn bnVar = this.a;
        bnVar.A0.I0(true);
        bnVar.A0.C0();
        if (MediaController.B().I(fjVar)) {
            bnVar.m1.removeView(bnVar.J8);
            bnVar.J8 = null;
            bnVar.M8 = null;
            bnVar.L8 = null;
        }
        for (int i7 = 0; i7 < bnVar.A0.getChildCount(); i7++) {
            if (bnVar.A0.getChildAt(i7) instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) bnVar.A0.getChildAt(i7);
                if (r1Var.getMessageObject() != null && r1Var.getMessageObject().e1() == fjVar.e1()) {
                    r1Var.getPhotoImage().O0(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.dr0
    public void H(org.telegram.messenger.fj fjVar) {
        if (fjVar == null) {
            return;
        }
        if (MediaController.B().I(fjVar)) {
            for (int i7 = 0; i7 < this.a.A0.getChildCount(); i7++) {
                if (this.a.A0.getChildAt(i7) instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.a.A0.getChildAt(i7);
                    if (r1Var.getMessageObject() != null && r1Var.getMessageObject().e1() == fjVar.e1()) {
                        org.telegram.ui.Components.c6 m10 = r1Var.getPhotoImage().m();
                        if (m10.c0) {
                            m10.stop();
                        }
                        Bitmap m11 = m10.m();
                        if (m11 != null) {
                            try {
                                zj zjVar = this.a.Ta;
                                int width = m11.getWidth();
                                int height = m11.getHeight();
                                org.telegram.ui.Cells.v5 v5Var = zjVar.d;
                                Bitmap bitmap = v5Var == null ? null : ((TextureView) v5Var.d).getBitmap(width, height);
                                new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                org.telegram.messenger.a8.g(th2, true);
                            }
                        }
                    }
                }
            }
            this.a.e8(true);
            MediaController B = MediaController.B();
            bn bnVar = this.a;
            B.p0(bnVar.M8, bnVar.L8, bnVar.J8, true);
        }
        this.a.A0.invalidate();
    }

    @Override // org.telegram.ui.ll
    public void K0(int i7) {
        this.a.l(i7, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.dr0
    public TextureView f0() {
        return this.a.M8;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void k() {
        org.telegram.ui.Components.yk0.d(new le(this.a, 2));
    }

    @Override // org.telegram.ui.pm0
    public void p() {
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

    @Override // org.telegram.ui.ll
    public void x0(String str) {
        this.a.Ga(str, false);
    }

    @Override // org.telegram.ui.pm0
    public void d(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void j() {
    }

    @Override // org.telegram.ui.ll
    public /* synthetic */ void V(boolean z10, boolean z11) {
    }
}
