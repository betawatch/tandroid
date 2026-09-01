package wh;

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
import java.io.File;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class x0 extends z implements b6, l9, j0, DownloadController.FileDownloadProgressListener {
    public final ImageReceiver B;
    public final i0 C;
    public final int D;
    public final int E;
    public final int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public StaticLayout N;
    public StaticLayout O;
    public m3 P;
    public MessageObject Q;
    public TLRPC.Document R;
    public final int n;
    public final g6 r;
    public final Paint s;
    public final Paint v;
    public final TextPaint w;
    public final TextPaint x;
    public final RadialProgress2 y;

    public x0(Context context, int i10, g6 g6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new Paint(1);
        this.w = new TextPaint(1);
        this.x = new TextPaint(1);
        int dp = AndroidUtilities.dp(10.0f);
        this.E = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.F = dp2;
        this.G = AndroidUtilities.dp(16.0f);
        this.H = AndroidUtilities.dp(16.0f);
        this.n = i10;
        this.r = g6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.D = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.G;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.B = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        i0 i0Var = new i0(context, g6Var, new ai(this, 20));
        this.C = i0Var;
        addView(i0Var.a, c6.e(-2, -2, 51));
        e();
    }

    @Override // wh.j0
    public final boolean a(int i10, int i11) {
        return this.C.f(i10, i11);
    }

    @Override // wh.j0
    public final void b() {
        this.C.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.C.c(canvas);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        this.s.setColor(k6.v0(k6.uf, this.r));
        i0 i0Var = this.C;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override // wh.z
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.J) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.H = i11;
        if (this.I) {
            i11 += AndroidUtilities.dp(21.0f);
        }
        this.G = i11;
        int dp2 = this.I ? AndroidUtilities.dp(31.0f) : this.E;
        int i12 = this.G;
        int i13 = this.F;
        this.y.q(i12, dp2, i12 + i13, i13 + dp2);
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.C.e(arrayList);
    }

    @Override // wh.j0
    public e1 getCaptionEditText() {
        return this.C.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.D;
    }

    @Override // wh.j0
    public a getRow() {
        return this.a;
    }

    public final void h(TLRPC.Document document) {
        String str;
        t tVar;
        a aVar = this.a;
        String str2 = (aVar == null || (tVar = aVar.g) == null) ? null : tVar.e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z4 = j() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean isDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
        this.I = z4 || isDocumentHasThumb;
        int dp = AndroidUtilities.dp(16.0f) + (this.J ? 0 : this.c);
        this.H = dp;
        if (this.I) {
            dp += AndroidUtilities.dp(21.0f);
        }
        this.G = dp;
        int dp2 = this.I ? AndroidUtilities.dp(31.0f) : this.E;
        int i10 = this.G;
        int i11 = this.F;
        this.y.q(i10, dp2, i10 + i11, i11 + dp2);
        ImageReceiver imageReceiver = this.B;
        if (z4) {
            imageReceiver.setImageCoords(this.H, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.B.setImage(ImageLocation.getForPath(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!isDocumentHasThumb) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
        m3 m3Var = this.P;
        MessageObject messageObject = m3Var == null ? null : m3Var.a.f3;
        imageReceiver.setImageCoords(this.H, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
        ImageLocation forDocument = closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null;
        Drawable createStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
        if (messageObject == null) {
            messageObject = this.Q;
        }
        this.B.setImage(forDocument, "86_86", createStripedBitmap, null, messageObject, 1);
    }

    public final TLRPC.Document i() {
        t tVar;
        a aVar = this.a;
        if (aVar == null || (tVar = aVar.g) == null) {
            return null;
        }
        return tVar.h;
    }

    public final boolean j() {
        t tVar;
        a aVar = this.a;
        return (aVar == null || (tVar = aVar.g) == null || !tVar.a()) ? false : true;
    }

    public final void k() {
        int i10;
        float f10;
        t tVar;
        TLRPC.Document i11 = i();
        if (i11 == null) {
            return;
        }
        if (this.I) {
            i10 = this.H;
            f10 = 97.0f;
        } else {
            i10 = this.G;
            f10 = 54.0f;
        }
        int max = Math.max(AndroidUtilities.dp(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - (AndroidUtilities.dp(f10) + i10)) - AndroidUtilities.dp(16.0f)) - (this.J ? this.c : 0));
        float dp = AndroidUtilities.dp(15.0f);
        TextPaint textPaint = this.w;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        float dp2 = AndroidUtilities.dp(13.0f);
        TextPaint textPaint2 = this.x;
        textPaint2.setTextSize(dp2);
        String documentFileName = FileLoader.getDocumentFileName(i11);
        if (TextUtils.isEmpty(documentFileName) && (tVar = this.a.g) != null && !TextUtils.isEmpty(tVar.e)) {
            documentFileName = new File(this.a.g.e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(documentFileName, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.N = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j10 = i11.size;
        if (j10 <= 0) {
            t tVar2 = this.a.g;
            j10 = (tVar2 == null || TextUtils.isEmpty(tVar2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.O = new StaticLayout(AndroidUtilities.formatFileSize(j10), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r5.exists() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(boolean z4) {
        File pathToAttach;
        t tVar;
        boolean z10 = this.I;
        g6 g6Var = this.r;
        RadialProgress2 radialProgress2 = this.y;
        if (z10) {
            radialProgress2.g(k6.le, k6.me, k6.ne, k6.oe);
            radialProgress2.d = k6.v0(k6.hd, g6Var);
        } else {
            radialProgress2.g(k6.ie, k6.je, k6.uc, k6.vc);
            radialProgress2.d = k6.v0(k6.Bd, g6Var);
        }
        boolean j10 = j();
        int i10 = this.n;
        if (j10) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            radialProgress2.o(this.a.g.f, z4);
            radialProgress2.setIcon(3, false, z4);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(i());
        a aVar = this.a;
        if (aVar != null && (tVar = aVar.g) != null && !TextUtils.isEmpty(tVar.e)) {
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
            this.M = 0;
            radialProgress2.setIcon(this.I ? 4 : 5, false, z4);
        } else {
            if (TextUtils.isEmpty(attachFileName)) {
                return;
            }
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.M = 1;
                radialProgress2.o(0.0f, z4);
                radialProgress2.setIcon(2, false, z4);
            } else {
                this.M = 2;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z4);
                radialProgress2.setIcon(3, true, z4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        this.y.m(this);
        this.B.onAttachedToWindow();
        l(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        this.B.onDetachedFromWindow();
        DownloadController.getInstance(this.n).removeLoadingFileObserver(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        m9 textSelectionHelper;
        if (i() == null) {
            return;
        }
        boolean z4 = this.I;
        g6 g6Var = this.r;
        if (z4 && !this.B.draw(canvas)) {
            int v02 = k6.v0(k6.Gd, g6Var);
            Paint paint = this.v;
            paint.setColor(v02);
            canvas.drawRoundRect(this.H, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.H, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.y.draw(canvas);
        if (this.I) {
            i10 = this.H;
            f10 = 97.0f;
        } else {
            i10 = this.G;
            f10 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f10) + i10;
        this.w.setColor(k6.v0(k6.Dd, g6Var));
        int dp2 = AndroidUtilities.dp(12.0f);
        if (this.N != null) {
            canvas.save();
            canvas.translate(dp, dp2);
            this.N.draw(canvas);
            canvas.restore();
        }
        this.x.setColor(k6.v0(k6.nd, g6Var));
        StaticLayout staticLayout = this.N;
        int dp3 = AndroidUtilities.dp(2.0f) + dp2 + (staticLayout == null ? 0 : staticLayout.getHeight());
        if (this.O != null) {
            canvas.save();
            canvas.translate(dp, dp3);
            this.O.draw(canvas);
            canvas.restore();
        }
        if (this.P == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = this.P.a.getTextSelectionHelper()) == null || !textSelectionHelper.y()) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R <= textSelectionHelper.u0 || R > textSelectionHelper.x0) {
            return;
        }
        canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.J ? 0 : this.c), AndroidUtilities.dp(2.0f), (getWidth() - (this.J ? this.c : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.I ? 104.0f : 64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.s);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        l(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10 = this.J;
        this.C.g(z10 ? 0 : this.c, z10 ? this.c : 0, i12 - i10, AndroidUtilities.dp(this.I ? 106.0f : 66.0f));
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z4 = this.J;
        setMeasuredDimension(size, AndroidUtilities.dp(this.I ? 106.0f : 66.0f) + this.C.h(z4 ? 0 : this.c, z4 ? this.c : 0, size));
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
        boolean z4;
        MessageObject messageObject;
        if (motionEvent.getX() >= this.H && motionEvent.getX() <= getWidth() - AndroidUtilities.dp(12.0f) && motionEvent.getY() >= AndroidUtilities.dp(10.0f)) {
            if (motionEvent.getY() <= AndroidUtilities.dp(this.I ? 96.0f : 54.0f)) {
                z4 = true;
                if (motionEvent.getActionMasked() != 0 && z4) {
                    this.L = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.L) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.L = false;
                    }
                    if (this.L && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                } else {
                    this.L = false;
                    if (z4) {
                        playSoundEffect(0);
                        if (j()) {
                            m3 m3Var = this.P;
                            if (m3Var != null) {
                                a aVar = this.a;
                                r3 r3Var = m3Var.a;
                                u4 u4Var = (u4) r3Var.W3.remove(aVar.g);
                                if (u4Var != null) {
                                    u4Var.b();
                                }
                                d2 d2Var = r3Var.G3;
                                if (d2Var != null) {
                                    d2Var.d();
                                }
                                r3Var.i3.remove(aVar);
                                r3Var.V2.N(true);
                                d2 d2Var2 = r3Var.G3;
                                if (d2Var2 != null) {
                                    d2Var2.h();
                                }
                                r3Var.e3.onContentChanged();
                            }
                        } else {
                            int i10 = this.M;
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
                                if (activity != null && (messageObject = this.Q) != null) {
                                    AndroidUtilities.openForView(messageObject, activity, this.r, false);
                                }
                            } else {
                                RadialProgress2 radialProgress2 = this.y;
                                int i11 = this.n;
                                if (i10 == 1 && i() != null) {
                                    m3 m3Var2 = this.P;
                                    MessageObject messageObject2 = m3Var2 != null ? m3Var2.a.f3 : null;
                                    FileLoader fileLoader = FileLoader.getInstance(i11);
                                    TLRPC.Document i12 = i();
                                    if (messageObject2 == null) {
                                        messageObject2 = this.Q;
                                    }
                                    fileLoader.loadFile(i12, messageObject2, 1, 1);
                                    this.M = 2;
                                    radialProgress2.setIcon(3, true, true);
                                } else if (this.M == 2 && i() != null) {
                                    FileLoader.getInstance(i11).cancelLoadFile(i());
                                    this.M = 1;
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
        z4 = false;
        if (motionEvent.getActionMasked() != 0) {
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        if (motionEvent.getActionMasked() == 3) {
        }
        if (this.L) {
        }
        return true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
