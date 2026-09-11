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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class qj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.f6, kv0, pm {
    public final /* synthetic */ co a;

    public /* synthetic */ qj(co coVar) {
        this.a = coVar;
    }

    @Override // org.telegram.ui.kv0
    public void E0(MessageObject messageObject) {
        co coVar = this.a;
        coVar.x0.I0(true);
        coVar.x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            coVar.X0.removeView(coVar.t8);
            coVar.t8 = null;
            coVar.w8 = null;
            coVar.v8 = null;
        }
        for (int i10 = 0; i10 < coVar.x0.getChildCount(); i10++) {
            if (coVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) coVar.x0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int G0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.kv0
    public void H(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.x0.getChildCount(); i10++) {
                if (this.a.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.a.x0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.d6 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                vk vkVar = this.a.wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                nv0 nv0Var = vkVar.d;
                                Bitmap bitmap = nv0Var == null ? null : nv0Var.b.getBitmap(width, height);
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
            co coVar = this.a;
            mediaController.setTextureView(coVar.w8, coVar.v8, coVar.t8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.pm
    public void V0(int i10) {
        this.a.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        org.telegram.ui.Components.am0.d(new af(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.kv0
    public TextureView i0() {
        return this.a.w8;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.pm
    public void r0(String str) {
        this.a.da(str, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void d() {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void O0(int i10, int i11) {
    }

    @Override // org.telegram.ui.pm
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }
}
