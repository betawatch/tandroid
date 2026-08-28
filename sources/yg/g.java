package yg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends Drawable implements DownloadController.FileDownloadProgressListener, kn0 {
    public String A;
    public String B;
    public boolean C;
    public MessageObject D;
    public double E;
    public int F;
    public final ln0 G;
    public float H;
    public float I;
    public SvgHelper.SvgDrawable J;
    public up K;
    public Drawable L;
    public a M;
    public boolean N;
    public boolean O;
    public TLRPC.MessageMedia P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int W;
    public int X;
    public final int Z;
    public final td.a a;
    public int a0;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public int c0;
    public final t1 d;
    public String e;
    public String f;
    public String h;
    public nz0 n;
    public nz0 r;
    public nz0 s;
    public nz0 v;
    public final RadialProgress2 x;
    public final boolean y;
    public final Paint w = new Paint(1);
    public int V = 0;
    public int Y = 255;

    public g(int i9, t1 t1Var, b6 b6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.c = i9;
        this.y = z10;
        this.x = new RadialProgress2(t1Var, b6Var);
        this.d = t1Var;
        ln0 ln0Var = new ln0(t1Var);
        this.G = ln0Var;
        ln0Var.h = this;
        this.a = new td.a(t1Var, sd.a.a, 180L);
        this.Z = DownloadController.getInstance(i9).generateObserverTag();
    }

    public final void a() {
        this.b.onAttachedToWindow();
        this.x.e();
    }

    @Override // org.telegram.ui.Components.kn0
    public final void b(float f10) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
            n(true);
        }
    }

    public final void c(boolean z10) {
        nz0 nz0Var = this.n;
        if (nz0Var != null) {
            nz0Var.o(f6.w0(null, z10 ? f6.Fb : f6.Dd, false));
        }
        this.w.setColor(1711276032);
        nz0 nz0Var2 = this.v;
        if (nz0Var2 != null) {
            nz0Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.J;
        if (svgDrawable != null) {
            svgDrawable.setColorKey(z10 ? f6.Pb : f6.qe);
        }
        boolean z11 = this.T;
        RadialProgress2 radialProgress2 = this.x;
        if (!z11 && !this.S) {
            radialProgress2.g(f6.le, f6.me, f6.ne, f6.oe);
            return;
        }
        ln0 ln0Var = this.G;
        if (z10) {
            int w02 = f6.w0(null, f6.wb, false);
            int w03 = f6.w0(null, f6.xb, false);
            int i9 = f6.zb;
            ln0Var.h(w02, w03, f6.w0(null, i9, false), f6.w0(null, i9, false), f6.w0(null, f6.yb, false));
            radialProgress2.g(f6.Nb, f6.Ob, f6.Pa, f6.Qa);
            return;
        }
        radialProgress2.g(f6.ie, f6.je, f6.uc, f6.vc);
        int w04 = f6.w0(null, f6.ud, false);
        int w05 = f6.w0(null, f6.vd, false);
        int i10 = f6.xd;
        ln0Var.h(w04, w05, f6.w0(null, i10, false), f6.w0(null, i10, false), f6.w0(null, f6.wd, false));
    }

    public final void d() {
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.Y == 0 || bounds.isEmpty()) {
            return;
        }
        f(false);
        boolean z10 = this.S;
        int i9 = 2;
        RadialProgress2 radialProgress2 = this.x;
        if (z10 || this.T) {
            int i10 = bounds.left;
            boolean z11 = this.y;
            int dp = i10 + (z11 ? 0 : AndroidUtilities.dp(8.0f));
            int dp2 = bounds.top + (z11 ? 0 : AndroidUtilities.dp(3.0f));
            int dp3 = this.T ? 0 : AndroidUtilities.dp(3.0f);
            nz0 nz0Var = this.n;
            if (nz0Var != null) {
                nz0Var.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(15.0f) + dp2 + dp3);
            }
            if (this.T) {
                float f10 = this.a.e;
                if (this.r != null && f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    int i11 = dp2 + dp3;
                    canvas.scale(f11, f11, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(35.0f) + i11);
                    this.r.a.setAlpha((int) (f11 * 255.0f));
                    this.r.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(35.0f) + i11);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    ln0 ln0Var = this.G;
                    ln0Var.t = f10;
                    ln0Var.j(ll.w(56.0f, dp, bounds.right), AndroidUtilities.dp(30.0f));
                    canvas.save();
                    float dp4 = AndroidUtilities.dp(45.0f) + dp;
                    this.H = dp4;
                    float dp5 = AndroidUtilities.dp(21.0f) + dp2 + dp3;
                    this.I = dp5;
                    canvas.translate(dp4, dp5);
                    ln0Var.b(canvas);
                    canvas.restore();
                }
            }
            nz0 nz0Var2 = this.s;
            if (nz0Var2 != null) {
                nz0Var2.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp((this.T ? 20 : 2) + 34) + dp3 + dp2);
            }
            int dp6 = AndroidUtilities.dp(2.0f) + dp;
            this.W = dp6;
            int dp7 = AndroidUtilities.dp(5.0f) + dp2;
            this.X = dp7;
            radialProgress2.q(dp6, dp7, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + dp, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + dp2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.Y / 255.0f);
            imageReceiver.setImageCoords(bounds);
            imageReceiver.draw(canvas);
            if (this.U && (drawable = this.L) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.L.getIntrinsicHeight() * 0.8f);
                int A = (int) e2.c.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - gr.k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                this.L.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                this.L.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                this.L.draw(canvas);
            }
            radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
            if (this.C && this.v != null) {
                canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.w);
                this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
            }
        }
        if (this.U) {
            return;
        }
        MessageObject messageObject = this.D;
        if (messageObject == null || !messageObject.isSending()) {
            a aVar = this.M;
            if (aVar == null || !aVar.g) {
                if (this.T) {
                    if (aVar != null && aVar.f) {
                        i9 = 4;
                    }
                    l(i9, true);
                } else {
                    k(g());
                }
            } else if (this.T) {
                l(3, true);
            } else {
                k(3);
            }
        } else if (ImageLoader.getInstance().getFileProgressSizes(this.B) == null) {
            radialProgress2.o(1.0f, true);
            if (this.T) {
                l(6, true);
            } else {
                k(6);
            }
        }
        if (this.T) {
            k(g());
        }
        radialProgress2.draw(canvas);
    }

    @Override // org.telegram.ui.Components.kn0
    public final void e(float f10) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f10;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f10);
            n(true);
        }
    }

    public final void f(boolean z10) {
        int width = getBounds().width() - AndroidUtilities.dp(this.y ? 64.0f : 72.0f);
        if (this.V != width || z10) {
            this.V = width;
            String str = this.e;
            if (str != null) {
                if (this.n == null) {
                    this.n = new nz0(str, 15.0f, AndroidUtilities.bold());
                }
                nz0 nz0Var = this.n;
                nz0Var.r(TextUtils.ellipsize(this.e, nz0Var.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                if (this.r == null) {
                    this.r = new nz0(str2, 14.0f, null);
                }
                nz0 nz0Var2 = this.r;
                nz0Var2.r(TextUtils.ellipsize(this.f, nz0Var2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.s == null) {
                    this.s = new nz0(str3, 12.0f, null);
                }
                nz0 nz0Var3 = this.s;
                nz0Var3.r(TextUtils.ellipsize(this.h, nz0Var3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.C && this.v == null) {
                this.v = new nz0(AndroidUtilities.formatLongDuration(this.F), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.T;
        if (z10 && this.a.f) {
            return !MediaController.getInstance().isMessagePaused() ? 1 : 0;
        }
        if (this.C || z10) {
            return 0;
        }
        if (!this.S) {
            return 4;
        }
        a aVar = this.M;
        return (aVar == null || !aVar.f) ? 2 : 5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.Y;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.Z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i9) {
        if (this.T) {
            return AndroidUtilities.dp(63.0f);
        }
        if (this.S) {
            return AndroidUtilities.dp(56.0f);
        }
        int i10 = this.Q;
        if (i10 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return Math.min(Math.round((i9 / i10) * this.R), this.y ? (i9 * 4) / 5 : (i9 * 5) / 4);
    }

    public final boolean i() {
        return this.T && MediaController.getInstance().isPlayingMessage(this.D) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.y;
    }

    public final boolean j(float f10, float f11, int i9) {
        if (!this.T || this.b0 == 4) {
            return false;
        }
        if (i9 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            if (f10 >= this.W + dp2 && f10 <= r4 + dp) {
                if (f11 >= this.X + dp2 && f11 <= r7 + dp) {
                    this.N = true;
                    return true;
                }
            }
        }
        boolean z10 = this.N;
        if (z10) {
            if (i9 == 1) {
                a aVar = this.M;
                if (aVar != null) {
                    TLRPC.Document document = aVar.b;
                    int i10 = aVar.a;
                    if (aVar.g) {
                        FileLoader.getInstance(i10).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f) {
                        FileLoader.getInstance(i10).loadFile(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    d();
                }
                this.N = false;
                return true;
            }
            if (i9 == 3) {
                this.N = false;
                return true;
            }
        }
        return z10;
    }

    public final void k(int i9) {
        if (this.a0 != i9) {
            this.a0 = i9;
            this.x.setIcon(i9, true, true);
        }
    }

    public final void l(int i9, boolean z10) {
        if (this.b0 != i9) {
            this.b0 = i9;
            this.x.k(i9, true, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(MessageObject messageObject, TLRPC.MessageMedia messageMedia, MessageObject messageObject2, int i9, String str, boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i10;
        double d;
        String str2 = this.A;
        this.Q = 0;
        this.R = 0;
        this.D = messageObject;
        this.P = messageMedia;
        this.S = false;
        this.T = false;
        this.C = false;
        this.U = false;
        this.E = 0.0d;
        this.F = 0;
        this.B = str;
        this.A = null;
        this.M = null;
        int i11 = this.c;
        RadialProgress2 radialProgress2 = this.x;
        ImageReceiver imageReceiver = this.b;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true, closestPhotoSizeWithSize, true);
                if (closestPhotoSizeWithSize2 != null) {
                    int i12 = closestPhotoSizeWithSize2.w;
                    this.Q = i12;
                    int i13 = closestPhotoSizeWithSize2.h;
                    this.R = i13;
                    Locale locale = Locale.US;
                    float f10 = AndroidUtilities.density;
                    String l10 = e2.c.l((int) (i12 / f10), "_", (int) (i13 / f10));
                    String concat = l10.concat("_b");
                    this.A = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                    imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), l10, ImageLocation.getForObject(closestPhotoSizeWithSize, photo), concat, null, closestPhotoSizeWithSize2.size, null, messageObject2, 1);
                    z11 = true;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                if (messageMedia.geo != null) {
                    if (this.J == null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, f6.Pb, (f6.I.q() ? 3 : 6) * 0.12f);
                        this.J = svgThumb;
                        svgThumb.setAspectCenter(true);
                        this.K = new up(this.J);
                    }
                    if (this.L == null) {
                        this.L = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.U = true;
                    this.Q = i9;
                    int i14 = (i9 * 9) / 16;
                    this.R = i14;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f11 = AndroidUtilities.density;
                    imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, (int) (i9 / f11), (int) (i14 / f11), 15, Math.min(2, (int) Math.ceil(f11)))), (String) null, (ImageLocation) null, (String) null, this.K, messageObject2, 0);
                    z11 = true;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.M = new a(i11, messageObject, document, str);
                this.A = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                if (MessageObject.isMusicDocument(document)) {
                    this.T = true;
                    this.e = MessageObject.getMusicTitle(document, true);
                    this.f = MessageObject.getMusicAuthor(document, true);
                    int i15 = 0;
                    while (true) {
                        if (i15 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i15);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i15++;
                    }
                    if (MessageObject.isDocumentHasThumb(document)) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                        radialProgress2.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize3, true), closestPhotoSizeWithSize3, document, this.D);
                    } else {
                        String artworkUrl = MessageObject.getArtworkUrl(document, true);
                        if (TextUtils.isEmpty(artworkUrl)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(artworkUrl);
                        }
                    }
                    this.E = d;
                    this.h = AndroidUtilities.formatShortDuration(i() ? MediaController.getInstance().getPlayingMessageObject().audioProgressSec : 0, (int) this.E);
                    z12 = true;
                } else if (MessageObject.isVideoDocument(document)) {
                    this.F = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(document)));
                    this.C = true;
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                    float f12 = i9;
                    TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, (int) (f12 / AndroidUtilities.density), false, closestPhotoSizeWithSize4, false);
                    ImageLocation forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize4, document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize5, document);
                    int i16 = (int) (f12 / AndroidUtilities.density);
                    if (closestPhotoSizeWithSize4 != null) {
                        int i17 = closestPhotoSizeWithSize4.w;
                        this.Q = i17;
                        int i18 = closestPhotoSizeWithSize4.h;
                        this.R = i18;
                        if (i17 != 0) {
                            i10 = (i18 * i16) / i17;
                            String l11 = e2.c.l(i16, "_", i10);
                            z12 = true;
                            imageReceiver.setImage(null, l11, forDocument, l11, forDocument2, l11, null, 0L, null, messageObject2, 0);
                        }
                        i10 = i16;
                        String l112 = e2.c.l(i16, "_", i10);
                        z12 = true;
                        imageReceiver.setImage(null, l112, forDocument, l112, forDocument2, l112, null, 0L, null, messageObject2, 0);
                    } else {
                        if (closestPhotoSizeWithSize5 != null) {
                            int i19 = closestPhotoSizeWithSize5.w;
                            this.Q = i19;
                            int i20 = closestPhotoSizeWithSize5.h;
                            this.R = i20;
                            if (i19 != 0) {
                                i10 = (i20 * i16) / i19;
                                String l1122 = e2.c.l(i16, "_", i10);
                                z12 = true;
                                imageReceiver.setImage(null, l1122, forDocument, l1122, forDocument2, l1122, null, 0L, null, messageObject2, 0);
                            }
                        }
                        i10 = i16;
                        String l11222 = e2.c.l(i16, "_", i10);
                        z12 = true;
                        imageReceiver.setImage(null, l11222, forDocument, l11222, forDocument2, l11222, null, 0L, null, messageObject2, 0);
                    }
                } else {
                    z12 = true;
                    this.S = true;
                    this.e = FileLoader.getDocumentFileName(document);
                    String str3 = AndroidUtilities.formatFileSize(document.size) + " " + FileLoader.getDocumentExtension(document);
                    this.h = str3;
                    this.f = str3;
                }
                f(z12);
                z11 = true;
            }
            this.O = z11;
            if (!z11) {
                imageReceiver.clearImage();
            }
            if (!TextUtils.equals(str2, this.A)) {
                if (!TextUtils.isEmpty(str2)) {
                    DownloadController.getInstance(i11).removeLoadingFileObserver(this);
                }
                if (!TextUtils.isEmpty(this.A)) {
                    DownloadController.getInstance(i11).addLoadingFileObserver(this.A, this);
                }
            }
            if (!this.T) {
                radialProgress2.i(null, null, null);
                l(4, false);
            }
            n(z10);
        }
        z11 = false;
        this.O = z11;
        if (!z11) {
        }
        if (!TextUtils.equals(str2, this.A)) {
        }
        if (!this.T) {
        }
        n(z10);
    }

    public final void n(boolean z10) {
        int i9;
        if (!this.T || this.D == null) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        boolean i10 = i();
        this.a.a(i10, z10);
        if (playingMessageObject == null || !i10) {
            i9 = 0;
        } else {
            i9 = playingMessageObject.audioProgressSec;
            ln0 ln0Var = this.G;
            if (!ln0Var.e) {
                ln0Var.i(playingMessageObject.audioProgress);
                ln0Var.q = playingMessageObject.bufferedProgress;
            }
            ln0Var.k(playingMessageObject);
        }
        if (this.c0 != i9) {
            this.c0 = i9;
            this.h = AndroidUtilities.formatShortDuration(i9, (int) this.E);
            f(true);
            this.d.invalidate();
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        d();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.x.o(min, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        if (this.T) {
            l(min >= 1.0f ? 4 : 3, true);
        } else {
            k(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.x.o(min, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        if (this.T) {
            l(min >= 1.0f ? 4 : 3, true);
        } else {
            k(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.Y = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
