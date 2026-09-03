package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.go0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class y extends z implements b6, l9, j0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public int B;
    public final int C;
    public final int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public StaticLayout I;
    public StaticLayout J;
    public String K;
    public l3 L;
    public MessageObject M;
    public TLRPC.Document N;
    public int O;
    public boolean P;
    public boolean Q;
    public final i0 R;
    public final int n;
    public final g6 r;
    public final Paint s;
    public final TextPaint v;
    public final RadialProgress2 w;
    public final go0 x;
    public final int y;

    public y(Context context, int i10, g6 g6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new TextPaint(1);
        this.B = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.C = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.D = dp2;
        this.n = i10;
        this.r = g6Var;
        setWillNotDraw(false);
        this.y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.B;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        go0 go0Var = new go0(this);
        this.x = go0Var;
        go0Var.h = new org.telegram.ui.web.e0(this, 19);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        i0 i0Var = new i0(context, g6Var, new org.telegram.ui.Cells.f1(this, 26));
        this.R = i0Var;
        addView(i0Var.a, c6.e(-2, -2, 51));
        e();
    }

    private TLRPC.Document getDisplayDocument() {
        t tVar;
        a aVar = this.a;
        if (aVar == null || (tVar = aVar.g) == null) {
            return null;
        }
        TLRPC.Document document = tVar.h;
        return document != null ? document : tVar.i;
    }

    private int getIconForCurrentState() {
        if (k()) {
            return 3;
        }
        int i10 = this.O;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    @Override // wh.j0
    public final boolean a(int i10, int i11) {
        return this.R.f(i10, i11);
    }

    @Override // wh.j0
    public final void b() {
        this.R.i();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.M;
        if (messageObject == null || i11 != this.n) {
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            m(true);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            if (messageObject.getId() != ((Integer) objArr[0]).intValue() || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
                return;
            }
            MessageObject messageObject2 = this.M;
            messageObject2.audioProgress = playingMessageObject.audioProgress;
            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
            n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.R.c(canvas);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        this.s.setColor(k6.v0(k6.uf, this.r));
        i0 i0Var = this.R;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override // wh.z
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.E) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.B = i11;
        int i12 = this.D;
        int i13 = this.C;
        this.w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.R.e(arrayList);
    }

    @Override // wh.j0
    public e1 getCaptionEditText() {
        return this.R.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.y;
    }

    @Override // wh.j0
    public a getRow() {
        return this.a;
    }

    public final TLRPC.TL_documentAttributeAudio h() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i10 = 0; i10 < displayDocument.attributes.size(); i10++) {
            if (displayDocument.attributes.get(i10) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i10);
            }
        }
        return null;
    }

    public final void i(a aVar, l3 l3Var) {
        t tVar;
        this.a = aVar;
        this.L = l3Var;
        if (aVar != null && aVar.g == null) {
            aVar.g = new t();
        }
        this.E = LocaleController.isRTL;
        c(aVar);
        this.R.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.N) {
            this.N = displayDocument;
            this.M = null;
            this.K = null;
            this.J = null;
        }
        if (j() && this.M == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Long.valueOf(displayDocument.id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.n;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            peer.user_id = clientUserId;
            tL_peerUser.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.a;
            if (aVar2 != null && (tVar = aVar2.g) != null && !TextUtils.isEmpty(tVar.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.M = new MessageObject(i10, tL_message, false, true);
        }
        l();
        if (this.Q) {
            m(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean j() {
        t tVar;
        a aVar = this.a;
        return (aVar == null || (tVar = aVar.g) == null || !tVar.b()) ? false : true;
    }

    public final boolean k() {
        t tVar;
        a aVar = this.a;
        return (aVar == null || (tVar = aVar.g) == null || !tVar.a()) ? false : true;
    }

    public final void l() {
        int dp = AndroidUtilities.dp(50.0f) + this.B;
        int i10 = this.D;
        this.F = dp + i10;
        this.H = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - this.F) - AndroidUtilities.dp(16.0f)) - (this.E ? this.c : 0));
        MessageObject messageObject = this.M;
        String musicAuthor = messageObject != null ? messageObject.getMusicAuthor(false) : h() != null ? h().performer : null;
        MessageObject messageObject2 = this.M;
        String musicTitle = messageObject2 != null ? messageObject2.getMusicTitle(false) : h() != null ? h().title : null;
        boolean isEmpty = TextUtils.isEmpty(musicTitle);
        int i11 = this.C;
        if (isEmpty && TextUtils.isEmpty(musicAuthor)) {
            this.I = null;
            this.G = ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(android.support.v4.media.a.z(musicAuthor, " - ", musicTitle));
            if (!TextUtils.isEmpty(musicAuthor)) {
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
            }
            float dp2 = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(dp2);
            this.I = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.H, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.H, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.G = AndroidUtilities.dp(11.0f) + ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        }
        this.x.j(this.H, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z4) {
        t tVar;
        int i10 = k6.ie;
        int i11 = k6.je;
        int i12 = k6.uc;
        int i13 = k6.vc;
        RadialProgress2 radialProgress2 = this.w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = k6.v0(k6.Bd, this.r);
        boolean k10 = k();
        int i14 = this.n;
        if (k10) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.a.g.f, z4);
            radialProgress2.setIcon(3, false, z4);
            n();
            return;
        }
        TLRPC.Document document = j() ? this.a.g.h : null;
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.a;
        boolean z10 = (aVar == null || (tVar = aVar.g) == null || TextUtils.isEmpty(tVar.e) || !new File(this.a.g.e).exists()) ? false : true;
        File pathToAttach = document == null ? null : FileLoader.getInstance(i14).getPathToAttach(document, true);
        boolean z11 = z10 || (pathToAttach != null && pathToAttach.exists());
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            this.O = (!MediaController.getInstance().isPlayingMessage(this.M) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z4);
        } else {
            DownloadController.getInstance(i14).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i14).isLoadingFile(attachFileName)) {
                this.O = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z4);
                radialProgress2.setIcon(getIconForCurrentState(), true, z4);
            } else {
                this.O = 2;
                radialProgress2.o(0.0f, z4);
                radialProgress2.setIcon(getIconForCurrentState(), false, z4);
            }
        }
        n();
    }

    public final void n() {
        double d;
        MessageObject messageObject;
        if (!k() && (messageObject = this.M) != null) {
            go0 go0Var = this.x;
            if (!go0Var.e) {
                go0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i10 = (int) d;
            }
        } else if (this.M == null || !MediaController.getInstance().isPlayingMessage(this.M)) {
            TLRPC.TL_documentAttributeAudio h = h();
            if (h != null) {
                d = h.duration;
                i10 = (int) d;
            }
        } else {
            i10 = this.M.audioProgressSec;
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.K;
        if (str == null || !str.equals(formatShortDuration)) {
            this.K = formatShortDuration;
            float dp = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(dp);
            this.J = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
        this.w.m(this);
        this.x.s = this;
        m(false);
        int i10 = this.n;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q = false;
        int i10 = this.n;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.w.draw(canvas);
        int i10 = k6.ud;
        g6 g6Var = this.r;
        int v02 = k6.v0(i10, g6Var);
        int v03 = k6.v0(k6.vd, g6Var);
        int i11 = k6.xd;
        int v04 = k6.v0(i11, g6Var);
        int v05 = k6.v0(i11, g6Var);
        int v06 = k6.v0(k6.wd, g6Var);
        go0 go0Var = this.x;
        go0Var.h(v02, v03, v04, v05, v06);
        if (!k()) {
            canvas.save();
            canvas.translate(this.F, this.G);
            go0Var.b(canvas);
            canvas.restore();
        }
        int v07 = k6.v0(k6.nd, g6Var);
        TextPaint textPaint = this.v;
        textPaint.setColor(v07);
        if (this.J != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.B, AndroidUtilities.dp(6.0f) + this.G);
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            textPaint.setColor(k6.v0(k6.G6, g6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.B, this.G - AndroidUtilities.dp(16.0f));
            this.I.draw(canvas);
            canvas.restore();
        }
        l3 l3Var = this.L;
        if (l3Var != null && (textSelectionHelper = l3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.E ? 0 : this.c), AndroidUtilities.dp(2.0f), (getWidth() - (this.E ? this.c : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.s);
            }
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        m(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10 = this.E;
        this.R.g(z10 ? 0 : this.c, z10 ? this.c : 0, i12 - i10, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z4 = this.E;
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.R.h(z4 ? 0 : this.c, z4 ? this.c : 0, size));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.w.o(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
        if (this.O != 3) {
            m(true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.w.o(1.0f, true);
        m(true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!k()) {
            if (this.x.f(x10 - this.F, y10 - this.G, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x10 >= this.B) {
                int i10 = this.D;
                if (x10 <= r0 + i10) {
                    if (y10 >= this.C && y10 <= r0 + i10) {
                        this.P = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.P) {
                this.P = false;
                playSoundEffect(0);
                if (k()) {
                    l3 l3Var = this.L;
                    if (l3Var != null) {
                        a aVar = this.a;
                        r3 r3Var = l3Var.a;
                        ArrayList arrayList = r3Var.i3;
                        u4 u4Var = (u4) r3Var.W3.remove(aVar.g);
                        if (u4Var != null) {
                            u4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            d2 d2Var = r3Var.G3;
                            if (d2Var != null) {
                                d2Var.d();
                            }
                            arrayList.remove(indexOf);
                            r3Var.V2.N(true);
                            d2 d2Var2 = r3Var.G3;
                            if (d2Var2 != null) {
                                d2Var2.h();
                            }
                        }
                        r3Var.e3.onContentChanged();
                    }
                } else if (this.M != null) {
                    TLRPC.Document document = j() ? this.a.g.h : null;
                    int i11 = this.O;
                    RadialProgress2 radialProgress2 = this.w;
                    if (i11 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.M);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.M, 0L, false, null)) {
                            this.O = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i11 != 1) {
                        int i12 = this.n;
                        if (i11 == 2) {
                            radialProgress2.o(0.0f, false);
                            FileLoader.getInstance(i12).loadFile(document, this.M, 1, 1);
                            this.O = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i11 == 3) {
                            FileLoader.getInstance(i12).cancelLoadFile(document);
                            this.O = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.M)) {
                        this.O = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.P = false;
        }
        return this.P || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
