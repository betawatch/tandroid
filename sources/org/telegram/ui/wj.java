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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wj implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.c6, sv0, org.telegram.ui.Components.s60, sm {
    public final /* synthetic */ fo a;

    public /* synthetic */ wj(fo foVar) {
        this.a = foVar;
    }

    @Override // org.telegram.ui.sv0
    public void D0(MessageObject messageObject) {
        fo foVar = this.a;
        foVar.x0.I0(true);
        foVar.x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            foVar.X0.removeView(foVar.t8);
            foVar.t8 = null;
            foVar.w8 = null;
            foVar.v8 = null;
        }
        for (int i10 = 0; i10 < foVar.x0.getChildCount(); i10++) {
            if (foVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) foVar.x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int F0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override // org.telegram.ui.sv0
    public void H(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.x0.getChildCount(); i10++) {
                if (this.a.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.a.x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.f6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                bl blVar = this.a.wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                vv0 vv0Var = blVar.d;
                                Bitmap bitmap = vv0Var == null ? null : vv0Var.b.getBitmap(width, height);
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.a.Q7(true);
            MediaController mediaController = MediaController.getInstance();
            fo foVar = this.a;
            mediaController.setTextureView(foVar.w8, foVar.v8, foVar.t8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.sm
    public void U0(int i10) {
        this.a.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int b0(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void e() {
        org.telegram.ui.Components.cn0.d(new hf(this.a, 2));
    }

    @Override // org.telegram.ui.sv0
    public TextureView g0() {
        return this.a.w8;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int g1(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.sm
    public void r0(String str) {
        this.a.ia(str, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void d() {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void N0(int i10, int i11) {
    }

    @Override // org.telegram.ui.sm
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }
}
