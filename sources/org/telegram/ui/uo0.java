package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uo0 implements gs {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.b20 b;
    public final /* synthetic */ org.telegram.messenger.ye c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ PhotoViewer h;

    public uo0(PhotoViewer photoViewer, String str, org.telegram.messenger.b20 b20Var, org.telegram.messenger.ye yeVar, boolean z10, int i3, int i10, boolean z11) {
        this.h = photoViewer;
        this.a = str;
        this.b = b20Var;
        this.c = yeVar;
        this.d = z10;
        this.e = i3;
        this.f = i10;
        this.g = z11;
    }

    @Override // org.telegram.ui.gs
    public final boolean A() {
        return this.h.y7 != null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final boolean I() {
        return this.h.u7 != null;
    }

    @Override // org.telegram.ui.gs
    public final void K(CharSequence charSequence, String str, org.telegram.ui.Components.ei eiVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.x7 = true;
        R();
        photoViewer.q5.p(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.x1(), this.c.c, eiVar, null);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.x7 = true;
        R();
        photoViewer.q5.p(this.a, this.b, str, null, true, 0L, null, null, photoViewer.x1(), this.c.c, null, null);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean Q() {
        return true;
    }

    public final void R() {
        is p10 = is.p();
        ImageReceiver imageReceiver = p10.A;
        org.telegram.messenger.ye yeVar = this.c;
        if (yeVar.c != null) {
            try {
                new File(yeVar.c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            yeVar.c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.y0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.h(canvas, null);
        }
        if (p10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / p10.C.getWidth(), createBitmap.getHeight() / p10.C.getHeight());
            p10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, p10.C.getWidth(), p10.C.getHeight());
            path.addRoundRect(rectF, p10.C.getWidth() / 8.0f, p10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            p10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.V8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.zb.a0(createBitmap, photoViewer.i1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.w7.G(photoViewer.U);
        yeVar.c = org.telegram.messenger.w7.K(a02, null, true, true).toString();
    }

    @Override // org.telegram.ui.gs
    public final long a() {
        return this.h.F5;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ boolean k(int i3) {
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.x7 = true;
        R();
        photoViewer.q5.p(this.a, this.b, str, null, false, 0L, null, null, photoViewer.x1(), this.c.c, null, photoViewer.y7);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ org.telegram.ui.Components.f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.gs
    public final void v(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.x7 = true;
        R();
        photoViewer.q5.p(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.u7, photoViewer.x1(), this.c.c, null, null);
    }

    @Override // org.telegram.ui.gs
    public final boolean x() {
        kq0 kq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        wm wmVar = photoViewer.m4;
        if ((wmVar == null || (chat = wmVar.e) == null || org.telegram.messenger.t3.t(chat)) && (kq0Var = photoViewer.d) != null) {
            return (kq0Var.Q() && photoViewer.m4 == null) ? false : true;
        }
        return false;
    }

    @Override // org.telegram.ui.gs
    public final void y(String str) {
        PhotoViewer photoViewer = this.h;
        kq0 kq0Var = photoViewer.d;
        if (kq0Var == null) {
            return;
        }
        boolean Q = kq0Var.Q();
        org.telegram.messenger.ye yeVar = this.c;
        if (Q) {
            if (photoViewer.m4 == null) {
                return;
            }
            photoViewer.x7 = true;
            R();
            photoViewer.q5.p(this.a, this.b, str, null, false, photoViewer.m4.a(), null, null, photoViewer.x1(), yeVar.c, null, null);
            return;
        }
        photoViewer.x7 = true;
        R();
        yeVar.h = this.a;
        photoViewer.d.o(photoViewer.Q4, this.b, this.d, this.e, this.f, this.g);
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0).m(org.telegram.messenger.hs.s3, Boolean.TRUE);
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ org.telegram.messenger.zi z() {
        return null;
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void i(org.telegram.messenger.ry ryVar) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.gs
    public final /* synthetic */ void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
    }
}
