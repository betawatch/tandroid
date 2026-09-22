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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.e6, lv0, om {
    public final /* synthetic */ bo a;

    public /* synthetic */ qj(bo boVar) {
        this.a = boVar;
    }

    @Override // org.telegram.ui.lv0
    public void E0(MessageObject messageObject) {
        bo boVar = this.a;
        boVar.x0.I0(true);
        boVar.x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            boVar.X0.removeView(boVar.t8);
            boVar.t8 = null;
            boVar.w8 = null;
            boVar.v8 = null;
        }
        for (int i10 = 0; i10 < boVar.x0.getChildCount(); i10++) {
            if (boVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) boVar.x0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int G0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.lv0
    public void H(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.x0.getChildCount(); i10++) {
                if (this.a.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.a.x0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.b6 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                vk vkVar = this.a.wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                ov0 ov0Var = vkVar.d;
                                Bitmap bitmap = ov0Var == null ? null : ov0Var.b.getBitmap(width, height);
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
            bo boVar = this.a;
            mediaController.setTextureView(boVar.w8, boVar.v8, boVar.t8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.om
    public void S0(int i10) {
        this.a.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public boolean a() {
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        org.telegram.ui.Components.am0.d(new ze(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.lv0
    public TextureView j0() {
        return this.a.w8;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.om
    public void s0(String str) {
        this.a.da(str, false);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.v3;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.om
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }
}
