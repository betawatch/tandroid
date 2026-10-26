package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ss0 implements dt {
    public final /* synthetic */ String a;
    public final /* synthetic */ VideoEditedInfo b;
    public final /* synthetic */ MediaController.PhotoEntry c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ PhotoViewer h;

    public ss0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.a = str;
        this.b = videoEditedInfo;
        this.c = photoEntry;
        this.d = z10;
        this.e = i10;
        this.f = i11;
        this.g = z11;
    }

    @Override // org.telegram.ui.dt
    public final boolean A() {
        return this.h.x7 != null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final boolean I() {
        return this.h.t7 != null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void N(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, true, 0L, null, null, photoViewer.w1(), this.c.thumbPath, null, null);
    }

    @Override // org.telegram.ui.dt
    public final void O(CharSequence charSequence, String str, org.telegram.ui.Components.oy oyVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, charSequence, false, 0L, null, null, photoViewer.w1(), this.c.thumbPath, oyVar, null);
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    public final void R() {
        ft o10 = ft.o();
        ImageReceiver imageReceiver = o10.A;
        MediaController.PhotoEntry photoEntry = this.c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoEntry.thumbPath = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.setImageCoords(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.draw(canvas);
        }
        if (o10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / o10.C.getWidth(), createBitmap.getHeight() / o10.C.getHeight());
            o10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, o10.C.getWidth(), o10.C.getHeight());
            path.addRoundRect(rectF, o10.C.getWidth() / 8.0f, o10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            o10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.T).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.h1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
    }

    @Override // org.telegram.ui.dt
    public final long a() {
        return this.h.E5;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ org.telegram.ui.Components.k80 i(bh.p pVar) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean l(int i10) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void n(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, false, 0L, null, null, photoViewer.w1(), this.c.thumbPath, null, photoViewer.x7);
    }

    @Override // org.telegram.ui.dt
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final void v(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.w7 = true;
        R();
        photoViewer.p5.p(this.a, this.b, str, null, false, 0L, stickerSet, photoViewer.t7, photoViewer.w1(), this.c.thumbPath, null, null);
    }

    @Override // org.telegram.ui.dt
    public final boolean x() {
        PhotoViewer photoViewer = this.h;
        ou0 ou0Var = photoViewer.d;
        if (ou0Var != null) {
            return (ou0Var.Q() && photoViewer.l4 == null) ? false : true;
        }
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void y(String str) {
        PhotoViewer photoViewer = this.h;
        ou0 ou0Var = photoViewer.d;
        if (ou0Var == null) {
            return;
        }
        boolean Q = ou0Var.Q();
        MediaController.PhotoEntry photoEntry = this.c;
        if (Q) {
            if (photoViewer.l4 == null) {
                return;
            }
            photoViewer.w7 = true;
            R();
            photoViewer.p5.p(this.a, this.b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.w1(), photoEntry.thumbPath, null, null);
            return;
        }
        photoViewer.w7 = true;
        R();
        photoEntry.imagePath = this.a;
        photoViewer.d.o(photoViewer.P4, this.b, this.d, this.e, this.f, this.g);
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
