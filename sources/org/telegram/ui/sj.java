package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sj implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.f6, nv0, qm {
    public final /* synthetic */ eo a;

    public /* synthetic */ sj(eo eoVar) {
        this.a = eoVar;
    }

    @Override // org.telegram.ui.nv0
    public void D0(MessageObject messageObject) {
        eo eoVar = this.a;
        eoVar.x0.I0(true);
        eoVar.x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            eoVar.X0.removeView(eoVar.t8);
            eoVar.t8 = null;
            eoVar.w8 = null;
            eoVar.v8 = null;
        }
        for (int i10 = 0; i10 < eoVar.x0.getChildCount(); i10++) {
            if (eoVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) eoVar.x0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int F0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.nv0
    public void G(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.x0.getChildCount(); i10++) {
                if (this.a.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.a.x0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.c6 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                xk xkVar = this.a.wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                qv0 qv0Var = xkVar.d;
                                Bitmap bitmap = qv0Var == null ? null : qv0Var.b.getBitmap(width, height);
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            eo eoVar = this.a;
            mediaController.setTextureView(eoVar.w8, eoVar.v8, eoVar.t8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.qm
    public void S0(int i10) {
        this.a.E(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void e() {
        org.telegram.ui.Components.km0.d(new cf(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int e0(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f1(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.nv0
    public TextureView g0() {
        return this.a.w8;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.qm
    public void r0(String str) {
        this.a.da(str, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.qm
    public /* synthetic */ void V(boolean z10, boolean z11) {
    }
}
