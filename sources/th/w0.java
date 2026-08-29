package th;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i7.f6;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w0 extends y implements org.telegram.ui.ActionBar.x5, j9, i0, DownloadController.FileDownloadProgressListener {
    public final ImageReceiver A;
    public final h0 B;
    public final int C;
    public final int D;
    public final int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public StaticLayout M;
    public StaticLayout N;
    public k3 O;
    public MessageObject P;
    public TLRPC.Document Q;
    public final int n;
    public final c6 r;
    public final Paint s;
    public final Paint v;
    public final TextPaint w;
    public final TextPaint x;
    public final RadialProgress2 y;

    public w0(Context context, int i10, c6 c6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new Paint(1);
        this.w = new TextPaint(1);
        this.x = new TextPaint(1);
        int dp = AndroidUtilities.dp(10.0f);
        this.D = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.E = dp2;
        this.F = AndroidUtilities.dp(16.0f);
        this.G = AndroidUtilities.dp(16.0f);
        this.n = i10;
        this.r = c6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.C = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.F;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.A = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        h0 h0Var = new h0(context, c6Var, new o4.g(this, 16));
        this.B = h0Var;
        addView(h0Var.a, f6.e(-2, -2, 51));
        e();
    }

    @Override // th.i0
    public final boolean a(int i10, int i11) {
        return this.B.f(i10, i11);
    }

    @Override // th.i0
    public final void b() {
        this.B.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.B.c(canvas);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        this.s.setColor(g6.v0(g6.uf, this.r));
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // th.y
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.I) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.G = i11;
        if (this.H) {
            i11 += AndroidUtilities.dp(21.0f);
        }
        this.F = i11;
        int dp2 = this.H ? AndroidUtilities.dp(31.0f) : this.D;
        int i12 = this.F;
        int i13 = this.E;
        this.y.q(i12, dp2, i12 + i13, i13 + dp2);
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.B.e(arrayList);
    }

    @Override // th.i0
    public d1 getCaptionEditText() {
        return this.B.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.C;
    }

    @Override // th.i0
    public a getRow() {
        return this.a;
    }

    public final void h(TLRPC.Document document) {
        String str;
        s sVar;
        a aVar = this.a;
        String str2 = (aVar == null || (sVar = aVar.g) == null) ? null : sVar.e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z10 = j() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean isDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
        this.H = z10 || isDocumentHasThumb;
        int dp = AndroidUtilities.dp(16.0f) + (this.I ? 0 : this.c);
        this.G = dp;
        if (this.H) {
            dp += AndroidUtilities.dp(21.0f);
        }
        this.F = dp;
        int dp2 = this.H ? AndroidUtilities.dp(31.0f) : this.D;
        int i10 = this.F;
        int i11 = this.E;
        this.y.q(i10, dp2, i10 + i11, i11 + dp2);
        ImageReceiver imageReceiver = this.A;
        if (z10) {
            imageReceiver.setImageCoords(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.A.setImage(ImageLocation.getForPath(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!isDocumentHasThumb) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
        k3 k3Var = this.O;
        MessageObject messageObject = k3Var == null ? null : k3Var.a.e3;
        imageReceiver.setImageCoords(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
        ImageLocation forDocument = closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null;
        Drawable createStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
        if (messageObject == null) {
            messageObject = this.P;
        }
        this.A.setImage(forDocument, "86_86", createStripedBitmap, null, messageObject, 1);
    }

    public final TLRPC.Document i() {
        s sVar;
        a aVar = this.a;
        if (aVar == null || (sVar = aVar.g) == null) {
            return null;
        }
        return sVar.h;
    }

    public final boolean j() {
        s sVar;
        a aVar = this.a;
        return (aVar == null || (sVar = aVar.g) == null || !sVar.a()) ? false : true;
    }

    public final void k() {
        int i10;
        float f9;
        s sVar;
        TLRPC.Document i11 = i();
        if (i11 == null) {
            return;
        }
        if (this.H) {
            i10 = this.G;
            f9 = 97.0f;
        } else {
            i10 = this.F;
            f9 = 54.0f;
        }
        int max = Math.max(AndroidUtilities.dp(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - (AndroidUtilities.dp(f9) + i10)) - AndroidUtilities.dp(16.0f)) - (this.I ? this.c : 0));
        float dp = AndroidUtilities.dp(15.0f);
        TextPaint textPaint = this.w;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        float dp2 = AndroidUtilities.dp(13.0f);
        TextPaint textPaint2 = this.x;
        textPaint2.setTextSize(dp2);
        String documentFileName = FileLoader.getDocumentFileName(i11);
        if (TextUtils.isEmpty(documentFileName) && (sVar = this.a.g) != null && !TextUtils.isEmpty(sVar.e)) {
            documentFileName = new File(this.a.g.e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(documentFileName, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.M = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j10 = i11.size;
        if (j10 <= 0) {
            s sVar2 = this.a.g;
            j10 = (sVar2 == null || TextUtils.isEmpty(sVar2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.N = new StaticLayout(AndroidUtilities.formatFileSize(j10), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r5.exists() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(boolean z10) {
        File pathToAttach;
        s sVar;
        boolean z11 = this.H;
        c6 c6Var = this.r;
        RadialProgress2 radialProgress2 = this.y;
        if (z11) {
            radialProgress2.g(g6.le, g6.me, g6.ne, g6.oe);
            radialProgress2.d = g6.v0(g6.hd, c6Var);
        } else {
            radialProgress2.g(g6.ie, g6.je, g6.uc, g6.vc);
            radialProgress2.d = g6.v0(g6.Bd, c6Var);
        }
        boolean j10 = j();
        int i10 = this.n;
        if (j10) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            radialProgress2.o(this.a.g.f, z10);
            radialProgress2.setIcon(3, false, z10);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(i());
        a aVar = this.a;
        if (aVar != null && (sVar = aVar.g) != null && !TextUtils.isEmpty(sVar.e)) {
            pathToAttach = new File(this.a.g.e);
        }
        if (i() == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i10).getPathToAttach(i(), false);
            if (pathToAttach == null || !pathToAttach.exists()) {
                pathToAttach = FileLoader.getInstance(i10).getPathToAttach(i(), true);
            }
        }
        if (pathToAttach != null && pathToAttach.exists()) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.L = 0;
            radialProgress2.setIcon(this.H ? 4 : 5, false, z10);
        } else {
            if (TextUtils.isEmpty(attachFileName)) {
                return;
            }
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.L = 1;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(2, false, z10);
            } else {
                this.L = 2;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z10);
                radialProgress2.setIcon(3, true, z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        this.y.m(this);
        this.A.onAttachedToWindow();
        l(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        this.A.onDetachedFromWindow();
        DownloadController.getInstance(this.n).removeLoadingFileObserver(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f9;
        k9 textSelectionHelper;
        if (i() == null) {
            return;
        }
        boolean z10 = this.H;
        c6 c6Var = this.r;
        if (z10 && !this.A.draw(canvas)) {
            int v02 = g6.v0(g6.Gd, c6Var);
            Paint paint = this.v;
            paint.setColor(v02);
            canvas.drawRoundRect(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.G, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.y.draw(canvas);
        if (this.H) {
            i10 = this.G;
            f9 = 97.0f;
        } else {
            i10 = this.F;
            f9 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f9) + i10;
        this.w.setColor(g6.v0(g6.Dd, c6Var));
        int dp2 = AndroidUtilities.dp(12.0f);
        if (this.M != null) {
            canvas.save();
            canvas.translate(dp, dp2);
            this.M.draw(canvas);
            canvas.restore();
        }
        this.x.setColor(g6.v0(g6.nd, c6Var));
        StaticLayout staticLayout = this.M;
        int dp3 = AndroidUtilities.dp(2.0f) + dp2 + (staticLayout == null ? 0 : staticLayout.getHeight());
        if (this.N != null) {
            canvas.save();
            canvas.translate(dp, dp3);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.O == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = this.O.a.getTextSelectionHelper()) == null || !textSelectionHelper.y()) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R <= textSelectionHelper.u0 || R > textSelectionHelper.x0) {
            return;
        }
        canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.I ? 0 : this.c), AndroidUtilities.dp(2.0f), (getWidth() - (this.I ? this.c : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.H ? 104.0f : 64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.s);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        l(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = this.I;
        this.B.g(z11 ? 0 : this.c, z11 ? this.c : 0, i12 - i10, AndroidUtilities.dp(this.H ? 106.0f : 66.0f));
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.I;
        setMeasuredDimension(size, AndroidUtilities.dp(this.H ? 106.0f : 66.0f) + this.B.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.y.o(j11 <= 0 ? 0.0f : Math.min(1.0f, j10 / j11), true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.y.o(1.0f, true);
        l(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        MessageObject messageObject;
        if (motionEvent.getX() >= this.G && motionEvent.getX() <= getWidth() - AndroidUtilities.dp(12.0f) && motionEvent.getY() >= AndroidUtilities.dp(10.0f)) {
            if (motionEvent.getY() <= AndroidUtilities.dp(this.H ? 96.0f : 54.0f)) {
                z10 = true;
                if (motionEvent.getActionMasked() != 0 && z10) {
                    this.K = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.K) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.K = false;
                    }
                    if (this.K && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                } else {
                    this.K = false;
                    if (z10) {
                        playSoundEffect(0);
                        if (j()) {
                            k3 k3Var = this.O;
                            if (k3Var != null) {
                                a aVar = this.a;
                                p3 p3Var = k3Var.a;
                                s4 s4Var = (s4) p3Var.V3.remove(aVar.g);
                                if (s4Var != null) {
                                    s4Var.b();
                                }
                                b2 b2Var = p3Var.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                p3Var.h3.remove(aVar);
                                p3Var.U2.N(true);
                                b2 b2Var2 = p3Var.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                                p3Var.d3.onContentChanged();
                            }
                        } else {
                            int i10 = this.L;
                            Activity activity = null;
                            if (i10 == 0) {
                                Context context = getContext();
                                while (true) {
                                    if (context instanceof ContextWrapper) {
                                        if (context instanceof Activity) {
                                            activity = (Activity) context;
                                            break;
                                        }
                                        context = ((ContextWrapper) context).getBaseContext();
                                    } else if (context instanceof Activity) {
                                        activity = (Activity) context;
                                    }
                                }
                                if (activity != null && (messageObject = this.P) != null) {
                                    AndroidUtilities.openForView(messageObject, activity, this.r, false);
                                }
                            } else {
                                RadialProgress2 radialProgress2 = this.y;
                                int i11 = this.n;
                                if (i10 == 1 && i() != null) {
                                    k3 k3Var2 = this.O;
                                    MessageObject messageObject2 = k3Var2 != null ? k3Var2.a.e3 : null;
                                    FileLoader fileLoader = FileLoader.getInstance(i11);
                                    TLRPC.Document i12 = i();
                                    if (messageObject2 == null) {
                                        messageObject2 = this.P;
                                    }
                                    fileLoader.loadFile(i12, messageObject2, 1, 1);
                                    this.L = 2;
                                    radialProgress2.setIcon(3, true, true);
                                } else if (this.L == 2 && i() != null) {
                                    FileLoader.getInstance(i11).cancelLoadFile(i());
                                    this.L = 1;
                                    radialProgress2.setIcon(2, false, true);
                                }
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
                return true;
            }
        }
        z10 = false;
        if (motionEvent.getActionMasked() != 0) {
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        if (motionEvent.getActionMasked() == 3) {
        }
        if (this.K) {
        }
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
