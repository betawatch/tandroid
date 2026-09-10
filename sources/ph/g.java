package ph;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g extends Drawable implements DownloadController.FileDownloadProgressListener, jo0 {
    public String E;
    public String F;
    public boolean G;
    public MessageObject H;
    public double I;
    public int J;
    public final ko0 K;
    public float L;
    public float M;
    public SvgHelper.SvgDrawable N;
    public kq O;
    public Drawable P;
    public a Q;
    public boolean R;
    public boolean S;
    public TLRPC.MessageMedia T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final le.b a;
    public int a0;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public final t1 d;
    public final int d0;
    public String e;
    public int e0;
    public String f;
    public int f0;
    public int g0;
    public String h;
    public t01 n;
    public t01 r;
    public t01 s;
    public t01 v;
    public final RadialProgress2 x;
    public final boolean y;
    public final Paint w = new Paint(1);
    public int Z = 0;
    public int c0 = 255;

    public g(int i10, t1 t1Var, f6 f6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.c = i10;
        this.y = z10;
        this.x = new RadialProgress2(t1Var, f6Var);
        this.d = t1Var;
        ko0 ko0Var = new ko0(t1Var);
        this.K = ko0Var;
        ko0Var.h = this;
        this.a = new le.b(t1Var, ke.a.a, 180L);
        this.d0 = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.b.onAttachedToWindow();
        this.x.e();
    }

    @Override // org.telegram.ui.Components.jo0
    public final void b(float f7) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
            n(true);
        }
    }

    public final void c(boolean z10) {
        t01 t01Var = this.n;
        if (t01Var != null) {
            t01Var.o(j6.w0(null, z10 ? j6.Fb : j6.Dd, false));
        }
        this.w.setColor(1711276032);
        t01 t01Var2 = this.v;
        if (t01Var2 != null) {
            t01Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.N;
        if (svgDrawable != null) {
            svgDrawable.setColorKey(z10 ? j6.Pb : j6.qe);
        }
        boolean z11 = this.X;
        RadialProgress2 radialProgress2 = this.x;
        if (!z11 && !this.W) {
            radialProgress2.g(j6.le, j6.me, j6.ne, j6.oe);
            return;
        }
        ko0 ko0Var = this.K;
        if (z10) {
            int w02 = j6.w0(null, j6.wb, false);
            int w03 = j6.w0(null, j6.xb, false);
            int i10 = j6.zb;
            ko0Var.h(w02, w03, j6.w0(null, i10, false), j6.w0(null, i10, false), j6.w0(null, j6.yb, false));
            radialProgress2.g(j6.Nb, j6.Ob, j6.Pa, j6.Qa);
            return;
        }
        radialProgress2.g(j6.ie, j6.je, j6.uc, j6.vc);
        int w04 = j6.w0(null, j6.ud, false);
        int w05 = j6.w0(null, j6.vd, false);
        int i11 = j6.xd;
        ko0Var.h(w04, w05, j6.w0(null, i11, false), j6.w0(null, i11, false), j6.w0(null, j6.wd, false));
    }

    @Override // org.telegram.ui.Components.jo0
    public final void d(float f7) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f7;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f7);
            n(true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.c0 == 0 || bounds.isEmpty()) {
            return;
        }
        f(false);
        boolean z10 = this.W;
        int i10 = 2;
        RadialProgress2 radialProgress2 = this.x;
        if (z10 || this.X) {
            int i11 = bounds.left;
            boolean z11 = this.y;
            int dp = i11 + (z11 ? 0 : AndroidUtilities.dp(8.0f));
            int dp2 = bounds.top + (z11 ? 0 : AndroidUtilities.dp(3.0f));
            int dp3 = this.X ? 0 : AndroidUtilities.dp(3.0f);
            t01 t01Var = this.n;
            if (t01Var != null) {
                t01Var.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(15.0f) + dp2 + dp3);
            }
            if (this.X) {
                float f7 = this.a.e;
                if (this.r != null && f7 < 1.0f) {
                    canvas.save();
                    float f10 = 1.0f - f7;
                    int i12 = dp2 + dp3;
                    canvas.scale(f10, f10, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(35.0f) + i12);
                    this.r.a.setAlpha((int) (f10 * 255.0f));
                    this.r.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp(35.0f) + i12);
                    canvas.restore();
                }
                if (f7 > 0.0f) {
                    ko0 ko0Var = this.K;
                    ko0Var.t = f7;
                    ko0Var.j(em.v(56.0f, dp, bounds.right), AndroidUtilities.dp(30.0f));
                    canvas.save();
                    float dp4 = AndroidUtilities.dp(45.0f) + dp;
                    this.L = dp4;
                    float dp5 = AndroidUtilities.dp(21.0f) + dp2 + dp3;
                    this.M = dp5;
                    canvas.translate(dp4, dp5);
                    ko0Var.b(canvas);
                    canvas.restore();
                }
            }
            t01 t01Var2 = this.s;
            if (t01Var2 != null) {
                t01Var2.e(canvas, AndroidUtilities.dp(56.0f) + dp, AndroidUtilities.dp((this.X ? 20 : 2) + 34) + dp3 + dp2);
            }
            int dp6 = AndroidUtilities.dp(2.0f) + dp;
            this.a0 = dp6;
            int dp7 = AndroidUtilities.dp(5.0f) + dp2;
            this.b0 = dp7;
            radialProgress2.q(dp6, dp7, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + dp, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + dp2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.c0 / 255.0f);
            imageReceiver.setImageCoords(bounds);
            imageReceiver.draw(canvas);
            if (this.Y && (drawable = this.P) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                int A = (int) e2.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - wr.k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                this.P.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                this.P.draw(canvas);
            }
            radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
            if (this.G && this.v != null) {
                canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.w);
                this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
            }
        }
        if (this.Y) {
            return;
        }
        MessageObject messageObject = this.H;
        if (messageObject == null || !messageObject.isSending()) {
            a aVar = this.Q;
            if (aVar == null || !aVar.g) {
                if (this.X) {
                    if (aVar != null && aVar.f) {
                        i10 = 4;
                    }
                    l(i10, true);
                } else {
                    k(g());
                }
            } else if (this.X) {
                l(3, true);
            } else {
                k(3);
            }
        } else if (ImageLoader.getInstance().getFileProgressSizes(this.F) == null) {
            radialProgress2.o(1.0f, true);
            if (this.X) {
                l(6, true);
            } else {
                k(6);
            }
        }
        if (this.X) {
            k(g());
        }
        radialProgress2.draw(canvas);
    }

    public final void e() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z10) {
        int width = getBounds().width() - AndroidUtilities.dp(this.y ? 64.0f : 72.0f);
        if (this.Z != width || z10) {
            this.Z = width;
            String str = this.e;
            if (str != null) {
                if (this.n == null) {
                    this.n = new t01(str, 15.0f, AndroidUtilities.bold());
                }
                t01 t01Var = this.n;
                t01Var.r(TextUtils.ellipsize(this.e, t01Var.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                if (this.r == null) {
                    this.r = new t01(str2, 14.0f, null);
                }
                t01 t01Var2 = this.r;
                t01Var2.r(TextUtils.ellipsize(this.f, t01Var2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.s == null) {
                    this.s = new t01(str3, 12.0f, null);
                }
                t01 t01Var3 = this.s;
                t01Var3.r(TextUtils.ellipsize(this.h, t01Var3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.G && this.v == null) {
                this.v = new t01(AndroidUtilities.formatLongDuration(this.J), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.X;
        if (z10 && this.a.f) {
            return !MediaController.getInstance().isMessagePaused() ? 1 : 0;
        }
        if (this.G || z10) {
            return 0;
        }
        if (!this.W) {
            return 4;
        }
        a aVar = this.Q;
        return (aVar == null || !aVar.f) ? 2 : 5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c0;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.d0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i10) {
        if (this.X) {
            return AndroidUtilities.dp(63.0f);
        }
        if (this.W) {
            return AndroidUtilities.dp(56.0f);
        }
        int i11 = this.U;
        if (i11 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return Math.min(Math.round((i10 / i11) * this.V), this.y ? (i10 * 4) / 5 : (i10 * 5) / 4);
    }

    public final boolean i() {
        return this.X && MediaController.getInstance().isPlayingMessage(this.H) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.y;
    }

    public final boolean j(float f7, float f10, int i10) {
        if (!this.X || this.f0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            if (f7 >= this.a0 + dp2 && f7 <= r4 + dp) {
                if (f10 >= this.b0 + dp2 && f10 <= r7 + dp) {
                    this.R = true;
                    return true;
                }
            }
        }
        boolean z10 = this.R;
        if (z10) {
            if (i10 == 1) {
                a aVar = this.Q;
                if (aVar != null) {
                    TLRPC.Document document = aVar.b;
                    int i11 = aVar.a;
                    if (aVar.g) {
                        FileLoader.getInstance(i11).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f) {
                        FileLoader.getInstance(i11).loadFile(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.R = false;
                return true;
            }
            if (i10 == 3) {
                this.R = false;
                return true;
            }
        }
        return z10;
    }

    public final void k(int i10) {
        if (this.e0 != i10) {
            this.e0 = i10;
            this.x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z10) {
        if (this.f0 != i10) {
            this.f0 = i10;
            this.x.k(i10, true, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(MessageObject messageObject, TLRPC.MessageMedia messageMedia, MessageObject messageObject2, int i10, String str, boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i11;
        double d;
        String str2 = this.E;
        this.U = 0;
        this.V = 0;
        this.H = messageObject;
        this.T = messageMedia;
        this.W = false;
        this.X = false;
        this.G = false;
        this.Y = false;
        this.I = 0.0d;
        this.J = 0;
        this.F = str;
        this.E = null;
        this.Q = null;
        int i12 = this.c;
        RadialProgress2 radialProgress2 = this.x;
        ImageReceiver imageReceiver = this.b;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true, closestPhotoSizeWithSize, true);
                if (closestPhotoSizeWithSize2 != null) {
                    int i13 = closestPhotoSizeWithSize2.w;
                    this.U = i13;
                    int i14 = closestPhotoSizeWithSize2.h;
                    this.V = i14;
                    Locale locale = Locale.US;
                    float f7 = AndroidUtilities.density;
                    String k10 = a4.a.k((int) (i13 / f7), (int) (i14 / f7), "_");
                    String concat = k10.concat("_b");
                    this.E = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                    imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), k10, ImageLocation.getForObject(closestPhotoSizeWithSize, photo), concat, null, closestPhotoSizeWithSize2.size, null, messageObject2, 1);
                    z11 = true;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                if (messageMedia.geo != null) {
                    if (this.N == null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, j6.Pb, (j6.I.q() ? 3 : 6) * 0.12f);
                        this.N = svgThumb;
                        svgThumb.setAspectCenter(true);
                        this.O = new kq(this.N);
                    }
                    if (this.P == null) {
                        this.P = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.Y = true;
                    this.U = i10;
                    int i15 = (i10 * 9) / 16;
                    this.V = i15;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f10 = AndroidUtilities.density;
                    imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, (int) (i10 / f10), (int) (i15 / f10), 15, Math.min(2, (int) Math.ceil(f10)))), (String) null, (ImageLocation) null, (String) null, this.O, messageObject2, 0);
                    z11 = true;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.Q = new a(i12, messageObject, document, str);
                this.E = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                if (MessageObject.isMusicDocument(document)) {
                    this.X = true;
                    this.e = MessageObject.getMusicTitle(document, true);
                    this.f = MessageObject.getMusicAuthor(document, true);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i16);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i16++;
                    }
                    if (MessageObject.isDocumentHasThumb(document)) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                        radialProgress2.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize3, true), closestPhotoSizeWithSize3, document, this.H);
                    } else {
                        String artworkUrl = MessageObject.getArtworkUrl(document, true);
                        if (TextUtils.isEmpty(artworkUrl)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(artworkUrl);
                        }
                    }
                    this.I = d;
                    this.h = AndroidUtilities.formatShortDuration(i() ? MediaController.getInstance().getPlayingMessageObject().audioProgressSec : 0, (int) this.I);
                    z12 = true;
                } else if (MessageObject.isVideoDocument(document)) {
                    this.J = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(document)));
                    this.G = true;
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                    float f11 = i10;
                    TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, (int) (f11 / AndroidUtilities.density), false, closestPhotoSizeWithSize4, false);
                    ImageLocation forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize4, document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize5, document);
                    int i17 = (int) (f11 / AndroidUtilities.density);
                    if (closestPhotoSizeWithSize4 != null) {
                        int i18 = closestPhotoSizeWithSize4.w;
                        this.U = i18;
                        int i19 = closestPhotoSizeWithSize4.h;
                        this.V = i19;
                        if (i18 != 0) {
                            i11 = (i19 * i17) / i18;
                            String k11 = a4.a.k(i17, i11, "_");
                            z12 = true;
                            imageReceiver.setImage(null, k11, forDocument, k11, forDocument2, k11, null, 0L, null, messageObject2, 0);
                        }
                        i11 = i17;
                        String k112 = a4.a.k(i17, i11, "_");
                        z12 = true;
                        imageReceiver.setImage(null, k112, forDocument, k112, forDocument2, k112, null, 0L, null, messageObject2, 0);
                    } else {
                        if (closestPhotoSizeWithSize5 != null) {
                            int i20 = closestPhotoSizeWithSize5.w;
                            this.U = i20;
                            int i21 = closestPhotoSizeWithSize5.h;
                            this.V = i21;
                            if (i20 != 0) {
                                i11 = (i21 * i17) / i20;
                                String k1122 = a4.a.k(i17, i11, "_");
                                z12 = true;
                                imageReceiver.setImage(null, k1122, forDocument, k1122, forDocument2, k1122, null, 0L, null, messageObject2, 0);
                            }
                        }
                        i11 = i17;
                        String k11222 = a4.a.k(i17, i11, "_");
                        z12 = true;
                        imageReceiver.setImage(null, k11222, forDocument, k11222, forDocument2, k11222, null, 0L, null, messageObject2, 0);
                    }
                } else {
                    z12 = true;
                    this.W = true;
                    this.e = FileLoader.getDocumentFileName(document);
                    String str3 = AndroidUtilities.formatFileSize(document.size) + " " + FileLoader.getDocumentExtension(document);
                    this.h = str3;
                    this.f = str3;
                }
                f(z12);
                z11 = true;
            }
            this.S = z11;
            if (!z11) {
                imageReceiver.clearImage();
            }
            if (!TextUtils.equals(str2, this.E)) {
                if (!TextUtils.isEmpty(str2)) {
                    DownloadController.getInstance(i12).removeLoadingFileObserver(this);
                }
                if (!TextUtils.isEmpty(this.E)) {
                    DownloadController.getInstance(i12).addLoadingFileObserver(this.E, this);
                }
            }
            if (!this.X) {
                radialProgress2.i(null, null, null);
                l(4, false);
            }
            n(z10);
        }
        z11 = false;
        this.S = z11;
        if (!z11) {
        }
        if (!TextUtils.equals(str2, this.E)) {
        }
        if (!this.X) {
        }
        n(z10);
    }

    public final void n(boolean z10) {
        int i10;
        if (!this.X || this.H == null) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        boolean i11 = i();
        this.a.a(i11, z10);
        if (playingMessageObject == null || !i11) {
            i10 = 0;
        } else {
            i10 = playingMessageObject.audioProgressSec;
            ko0 ko0Var = this.K;
            if (!ko0Var.e) {
                ko0Var.i(playingMessageObject.audioProgress);
                ko0Var.q = playingMessageObject.bufferedProgress;
            }
            ko0Var.k(playingMessageObject);
        }
        if (this.g0 != i10) {
            this.g0 = i10;
            this.h = AndroidUtilities.formatShortDuration(i10, (int) this.I);
            f(true);
            this.d.invalidate();
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        e();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.x.o(min, true);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        if (this.X) {
            l(min >= 1.0f ? 4 : 3, true);
        } else {
            k(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.x.o(min, true);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        if (this.X) {
            l(min >= 1.0f ? 4 : 3, true);
        } else {
            k(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.c0 = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
