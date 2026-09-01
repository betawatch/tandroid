package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.l9 {
    public static final /* synthetic */ int S = 0;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public final int H;
    public TL_iv.pageBlockVideo I;
    public a3 J;
    public TL_iv.PageBlock K;
    public TLRPC.Document L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public MessageObject.GroupedMessagePosition Q;
    public boolean R;
    public final o70 a;
    public final j4 b;
    public d3 c;
    public d3 d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final o4 h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final e1 s;
    public final int v;
    public boolean w;
    public int x;
    public int y;

    public z2(Context context, o70 o70Var, j4 j4Var, int i10) {
        super(context);
        this.a = o70Var;
        this.b = j4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.H = DownloadController.getInstance(((l4) o70Var).U).generateObserverTag();
        e1 e1Var = new e1(context, o70Var, j4Var, 1);
        this.s = e1Var;
        o4 o4Var = new o4(context);
        this.h = o4Var;
        o4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        o4Var.addView(textureView, k7.c6.e(-1, -2, 1));
        frameLayout.addView(o4Var, k7.c6.e(-1, -1, 17));
        addView(frameLayout, k7.c6.c(-2.0f, -1));
        addView(e1Var, k7.c6.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 8;
        }
        return i10 == 3 ? 0 : 4;
    }

    public final void a() {
        int i10 = ((l4) this.a).U;
        int i11 = this.F;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i11 == 0) {
            this.P = false;
            radialProgress2.o(0.0f, false);
            boolean z4 = this.M;
            j4 j4Var = this.b;
            if (z4) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.L), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.L.thumbs, 40), this.L), "80_80_b", this.L.size, null, j4Var.B, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.L, j4Var.B, 1, 1);
            }
            this.F = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                imageReceiver.setAllowStartAnimation(true);
                imageReceiver.startAnimation();
                this.F = -1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                return;
            }
            return;
        }
        this.P = true;
        if (this.M) {
            imageReceiver.cancelLoadImage();
        } else {
            FileLoader.getInstance(i10).cancelLoadFile(this.L);
        }
        this.F = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, a3 a3Var, boolean z4, boolean z10) {
        o70 o70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.I;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (o70Var = this.a).w) != null && o70Var.x == this) {
            a0.h hVar = o70Var.y;
            long j10 = pageblockvideo2.video_id;
            a3 a2 = a3.a(videoPlayerHolderBase, this);
            this.J = a2;
            hVar.k(a2, j10);
        }
        this.I = pageblockvideo;
        this.J = a3Var;
        this.K = null;
        this.N = z4;
        j4 j4Var = this.b;
        if (j4Var != null) {
            this.L = i4.a(j4Var.B, pageblockvideo.video_id);
        } else {
            this.L = null;
        }
        this.M = MessageObject.isVideoDocument(this.L) || MessageObject.isGifDocument(this.L);
        this.w = z10;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(a3 a3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        a3 a3Var2 = this.J;
        if (a3Var2 != null && (bitmap2 = a3Var.b) != null && (bitmap3 = a3Var2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.J.b = null;
        }
        a3 a3Var3 = this.J;
        if (a3Var3 != null && a3Var.b == null && (bitmap = a3Var3.b) != null) {
            a3Var.a = a3Var3.a;
            a3Var.b = bitmap;
        }
        this.J = a3Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (this.R) {
                return;
            }
            this.R = true;
            imageReceiver.onAttachedToWindow();
            e(false);
            return;
        }
        if (this.R) {
            this.R = false;
            TL_iv.pageBlockVideo pageblockvideo = this.I;
            o70 o70Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = o70Var.w) != null && o70Var.x == this) {
                a0.h hVar = o70Var.y;
                long j10 = pageblockvideo.video_id;
                a3 a2 = a3.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((l4) o70Var).U).removeLoadingFileObserver(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z4) {
        int i10 = ((l4) this.a).U;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        boolean z10 = true;
        boolean z11 = FileLoader.getInstance(i10).getPathToAttach(this.L).exists() || FileLoader.getInstance(i10).getPathToAttach(this.L, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            if (this.M) {
                this.F = -1;
            } else {
                this.F = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z4);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            a3 a3Var = this.J;
            float f10 = 0.0f;
            if (a3Var == null || a3Var.b == null) {
                if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                    this.F = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                } else if (!this.P && this.O && this.M) {
                    this.F = 1;
                } else {
                    this.F = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z10, z4);
                radialProgress2.o(f10, false);
            } else {
                this.F = -1;
            }
            z10 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z10, z4);
            radialProgress2.o(f10, false);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    public View getChannelCell() {
        return this.s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.I;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.H;
    }

    public TextureView getTextureView() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.I == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
            canvas.drawRect(imageReceiver.getDrawRegion(), l4.l1);
        }
        imageReceiver.draw(canvas);
        d3 d3Var = this.c;
        o70 o70Var = this.a;
        int i10 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.x, this.y);
            l4.v(o70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.x, this.y + this.B);
            l4.v(o70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, o70Var, this.I, getMeasuredHeight());
        super.onDraw(canvas);
        if (imageReceiver.getVisible()) {
            this.r.draw(canvas);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        e(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AttachVideo));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        TL_iv.pageBlockVideo pageblockvideo;
        int i14;
        int dp;
        int i15;
        int i16;
        int i17;
        j4 j4Var;
        boolean z4;
        int i18;
        int i19;
        int i20;
        boolean z10;
        float f10;
        int i21;
        int size = View.MeasureSpec.getSize(i10);
        int i22 = this.v;
        if (i22 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i13 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i22 != 2) {
                i12 = size;
                i13 = 0;
                int i23 = ((l4) this.a).U;
                pageblockvideo = this.I;
                ImageReceiver imageReceiver = this.e;
                if (pageblockvideo == null) {
                    if (i22 != 0 || (i21 = pageblockvideo.level) <= 0) {
                        this.x = AndroidUtilities.dp(18.0f);
                        dp = i12 - AndroidUtilities.dp(36.0f);
                        i15 = i12;
                        i16 = 0;
                    } else {
                        i16 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i21 * 14);
                        this.x = i16;
                        i15 = b.t(18.0f, i16, i12);
                        dp = i15;
                    }
                    TLRPC.Document document = this.L;
                    j4 j4Var2 = this.b;
                    if (document != null) {
                        int dp2 = AndroidUtilities.dp(48.0f);
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.L.thumbs, 48);
                        if (i22 == 0) {
                            int size2 = this.L.attributes.size();
                            int i24 = 0;
                            while (true) {
                                if (i24 >= size2) {
                                    z10 = false;
                                    break;
                                }
                                if (this.L.attributes.get(i24) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i13 = (int) ((i15 / r13.w) * r13.h);
                                    z10 = true;
                                    break;
                                }
                                i24++;
                            }
                            float f11 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.w : 100.0f;
                            float f12 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100.0f;
                            if (!z10) {
                                i13 = (int) ((i15 / f11) * f12);
                            }
                            if (this.K instanceof TL_iv.pageBlockCover) {
                                i13 = Math.min(i13, i15);
                                f10 = 100.0f;
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                f10 = 100.0f;
                                int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i13 > max) {
                                    i15 = (int) ((max / f12) * f11);
                                    i16 += ((i12 - i16) - i15) / 2;
                                    i13 = max;
                                }
                            }
                            if (i13 == 0) {
                                i13 = AndroidUtilities.dp(f10);
                            } else if (i13 < dp2) {
                                i13 = dp2;
                            }
                        } else if (i22 == 2) {
                            if ((this.Q.flags & 2) == 0) {
                                i15 -= AndroidUtilities.dp(2.0f);
                            }
                            if ((this.Q.flags & 8) == 0) {
                                int i25 = i15;
                                i18 = i13;
                                i13 -= AndroidUtilities.dp(2.0f);
                                i19 = i16;
                                i20 = i25;
                                imageReceiver.setQualityThumbDocument(this.L);
                                imageReceiver.setImageCoords(i19, (!this.w || i22 == 1 || i22 == 2 || this.I.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i20, i13);
                                if (!this.N) {
                                    if (this.M) {
                                        a3 a3Var = this.J;
                                        if (a3Var == null || a3Var.b == null) {
                                            this.O = DownloadController.getInstance(i23).canDownloadMedia(4, this.L.size);
                                            File pathToAttach = FileLoader.getInstance(i23).getPathToAttach(this.L);
                                            File pathToAttach2 = FileLoader.getInstance(i23).getPathToAttach(this.L, true);
                                            if (this.O || pathToAttach.exists() || pathToAttach2.exists()) {
                                                imageReceiver.setStrippedLocation(null);
                                                imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.L), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.L), "80_80_b", null, this.L.size, null, j4Var2.B, 1);
                                            } else {
                                                imageReceiver.setStrippedLocation(ImageLocation.getForDocument(this.L));
                                                imageReceiver.setImage(null, null, null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.L), "80_80_b", null, this.L.size, null, j4Var2.B, 1);
                                            }
                                        } else {
                                            imageReceiver.setStrippedLocation(null);
                                            imageReceiver.setImageBitmap(this.J.b);
                                        }
                                    } else {
                                        imageReceiver.setStrippedLocation(null);
                                        imageReceiver.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.L), "80_80_b", 0L, null, j4Var2 != null ? j4Var2.B : null, 1);
                                    }
                                }
                                imageReceiver.setAspectFit(true);
                                float f13 = dp2;
                                this.C = (int) e2.c.x(imageReceiver.getImageWidth(), f13, 2.0f, imageReceiver.getImageX());
                                int imageHeight = (int) (((imageReceiver.getImageHeight() - f13) / 2.0f) + imageReceiver.getImageY());
                                this.D = imageHeight;
                                int i26 = this.C;
                                this.r.q(i26, imageHeight, i26 + dp2, dp2 + imageHeight);
                                i17 = i18;
                            }
                        }
                        i19 = i16;
                        i20 = i15;
                        i18 = i13;
                        imageReceiver.setQualityThumbDocument(this.L);
                        imageReceiver.setImageCoords(i19, (!this.w || i22 == 1 || i22 == 2 || this.I.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i20, i13);
                        if (!this.N) {
                        }
                        imageReceiver.setAspectFit(true);
                        float f132 = dp2;
                        this.C = (int) e2.c.x(imageReceiver.getImageWidth(), f132, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f132) / 2.0f) + imageReceiver.getImageY());
                        this.D = imageHeight2;
                        int i262 = this.C;
                        this.r.q(i262, imageHeight2, i262 + dp2, dp2 + imageHeight2);
                        i17 = i18;
                    } else {
                        i17 = i13;
                    }
                    int imageHeight3 = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                    this.y = imageHeight3;
                    if (i22 == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.I;
                        d3 q10 = l4.q(this.a, this, null, pageblockvideo2.caption.text, dp, imageHeight3, pageblockvideo2, this.b);
                        this.c = q10;
                        if (q10 != null) {
                            int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                            this.B = height;
                            i17 = org.telegram.messenger.y3.C(4.0f, height, i17);
                            d3 d3Var = this.c;
                            d3Var.s = this.x;
                            d3Var.v = this.y;
                        }
                        int i27 = i17;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.I;
                        j4Var = j4Var2;
                        d3 p10 = l4.p(this.a, this, null, pageblockvideo3.caption.credit, dp, 0, pageblockvideo3, (j4Var2 == null || !j4Var2.D) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lw0.a(), 0, this.b);
                        this.d = p10;
                        if (p10 != null) {
                            i17 = this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i27;
                            d3 d3Var2 = this.d;
                            d3Var2.s = this.x;
                            d3Var2.v = this.y + this.B;
                        } else {
                            i17 = i27;
                        }
                    } else {
                        j4Var = j4Var2;
                    }
                    if (!this.w && i22 == 0 && this.I.level <= 0) {
                        i17 += AndroidUtilities.dp(8.0f);
                    }
                    if ((this.K instanceof TL_iv.pageBlockCover) && j4Var != null) {
                        ArrayList arrayList = j4Var.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z4 = true;
                            i14 = (i22 != 2 || z4) ? i17 : AndroidUtilities.dp(8.0f) + i17;
                        }
                    }
                    z4 = false;
                    if (i22 != 2) {
                    }
                } else {
                    i14 = 1;
                }
                e1 e1Var = this.s;
                e1Var.measure(i10, i11);
                e1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.getImageX();
                layoutParams.topMargin = (int) imageReceiver.getImageY();
                layoutParams.width = (int) imageReceiver.getImageWidth();
                layoutParams.height = (int) imageReceiver.getImageHeight();
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
            }
            float f14 = this.Q.ph;
            Point point2 = AndroidUtilities.displaySize;
            i13 = (int) Math.ceil(f14 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i12 = size;
        int i232 = ((l4) this.a).U;
        pageblockvideo = this.I;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo == null) {
        }
        e1 e1Var2 = this.s;
        e1Var2.measure(i10, i11);
        e1Var2.setTranslationY(imageReceiver2.getImageHeight() - AndroidUtilities.dp(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.getImageX();
        layoutParams2.topMargin = (int) imageReceiver2.getImageY();
        layoutParams2.width = (int) imageReceiver2.getImageWidth();
        layoutParams2.height = (int) imageReceiver2.getImageHeight();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.r.o(Math.min(1.0f, j10 / j11), true);
        if (this.F != 1) {
            e(true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.r.o(1.0f, true);
        if (!this.M) {
            e(true);
        } else {
            this.F = 2;
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 <= (org.telegram.messenger.AndroidUtilities.dp(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        e1 e1Var = this.s;
        int visibility = e1Var.getVisibility();
        j4 j4Var = this.b;
        if (visibility != 0 || y10 <= e1Var.getTranslationY() || y10 >= e1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            if (motionEvent.getAction() == 0 && this.e.isInsideImage(x10, y10)) {
                if (this.F != -1) {
                    if (x10 >= this.C && x10 <= AndroidUtilities.dp(48.0f) + r2) {
                        if (y10 >= this.D) {
                        }
                    }
                }
                if (this.F != 0) {
                    this.E = true;
                }
                this.G = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.E) {
                    this.E = false;
                    this.a.d(this.I, j4Var);
                } else if (this.G == 1) {
                    this.G = 0;
                    playSoundEffect(0);
                    a();
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.E = false;
            }
            if (!this.E && this.G == 0) {
                if (!l4.l(this.a, this.b, motionEvent, this, this.c, this.x, this.y)) {
                    if (!l4.l(this.a, this.b, motionEvent, this, this.d, this.x, this.y + this.B) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (j4Var != null && j4Var.C != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
