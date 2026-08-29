package th;

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
import i7.f6;
import java.io.File;
import java.util.ArrayList;
import nh.d6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.wn0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class x extends y implements org.telegram.ui.ActionBar.x5, j9, i0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public int A;
    public final int B;
    public final int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public StaticLayout I;
    public String J;
    public j3 K;
    public MessageObject L;
    public TLRPC.Document M;
    public int N;
    public boolean O;
    public boolean P;
    public final h0 Q;
    public final int n;
    public final c6 r;
    public final Paint s;
    public final TextPaint v;
    public final RadialProgress2 w;
    public final wn0 x;
    public final int y;

    public x(Context context, int i10, c6 c6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new TextPaint(1);
        this.A = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.B = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.C = dp2;
        this.n = i10;
        this.r = c6Var;
        setWillNotDraw(false);
        this.y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.A;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        wn0 wn0Var = new wn0(this);
        this.x = wn0Var;
        wn0Var.h = new d6(this, 25);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        h0 h0Var = new h0(context, c6Var, new o1.a(this, 23));
        this.Q = h0Var;
        addView(h0Var.a, f6.e(-2, -2, 51));
        e();
    }

    private TLRPC.Document getDisplayDocument() {
        s sVar;
        a aVar = this.a;
        if (aVar == null || (sVar = aVar.g) == null) {
            return null;
        }
        TLRPC.Document document = sVar.h;
        return document != null ? document : sVar.i;
    }

    private int getIconForCurrentState() {
        if (k()) {
            return 3;
        }
        int i10 = this.N;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    @Override // th.i0
    public final boolean a(int i10, int i11) {
        return this.Q.f(i10, i11);
    }

    @Override // th.i0
    public final void b() {
        this.Q.i();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.L;
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
            MessageObject messageObject2 = this.L;
            messageObject2.audioProgress = playingMessageObject.audioProgress;
            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
            n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.Q.c(canvas);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        this.s.setColor(g6.v0(g6.uf, this.r));
        h0 h0Var = this.Q;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // th.y
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.D) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.A = i11;
        int i12 = this.C;
        int i13 = this.B;
        this.w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.Q.e(arrayList);
    }

    @Override // th.i0
    public d1 getCaptionEditText() {
        return this.Q.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.y;
    }

    @Override // th.i0
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

    public final void i(a aVar, j3 j3Var) {
        s sVar;
        this.a = aVar;
        this.K = j3Var;
        if (aVar != null && aVar.g == null) {
            aVar.g = new s();
        }
        this.D = LocaleController.isRTL;
        c(aVar);
        this.Q.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.M) {
            this.M = displayDocument;
            this.L = null;
            this.J = null;
            this.I = null;
        }
        if (j() && this.L == null && displayDocument != null) {
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
            if (aVar2 != null && (sVar = aVar2.g) != null && !TextUtils.isEmpty(sVar.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.L = new MessageObject(i10, tL_message, false, true);
        }
        l();
        if (this.P) {
            m(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean j() {
        s sVar;
        a aVar = this.a;
        return (aVar == null || (sVar = aVar.g) == null || !sVar.b()) ? false : true;
    }

    public final boolean k() {
        s sVar;
        a aVar = this.a;
        return (aVar == null || (sVar = aVar.g) == null || !sVar.a()) ? false : true;
    }

    public final void l() {
        int dp = AndroidUtilities.dp(50.0f) + this.A;
        int i10 = this.C;
        this.E = dp + i10;
        this.G = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - this.E) - AndroidUtilities.dp(16.0f)) - (this.D ? this.c : 0));
        MessageObject messageObject = this.L;
        String musicAuthor = messageObject != null ? messageObject.getMusicAuthor(false) : h() != null ? h().performer : null;
        MessageObject messageObject2 = this.L;
        String musicTitle = messageObject2 != null ? messageObject2.getMusicTitle(false) : h() != null ? h().title : null;
        boolean isEmpty = TextUtils.isEmpty(musicTitle);
        int i11 = this.B;
        if (isEmpty && TextUtils.isEmpty(musicAuthor)) {
            this.H = null;
            this.F = ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(a4.w.y(musicAuthor, " - ", musicTitle));
            if (!TextUtils.isEmpty(musicAuthor)) {
                spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
            }
            float dp2 = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(dp2);
            this.H = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.G, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.G, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.F = AndroidUtilities.dp(11.0f) + ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        }
        this.x.j(this.G, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z10) {
        s sVar;
        int i10 = g6.ie;
        int i11 = g6.je;
        int i12 = g6.uc;
        int i13 = g6.vc;
        RadialProgress2 radialProgress2 = this.w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = g6.v0(g6.Bd, this.r);
        boolean k9 = k();
        int i14 = this.n;
        if (k9) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.a.g.f, z10);
            radialProgress2.setIcon(3, false, z10);
            n();
            return;
        }
        TLRPC.Document document = j() ? this.a.g.h : null;
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.a;
        boolean z11 = (aVar == null || (sVar = aVar.g) == null || TextUtils.isEmpty(sVar.e) || !new File(this.a.g.e).exists()) ? false : true;
        File pathToAttach = document == null ? null : FileLoader.getInstance(i14).getPathToAttach(document, true);
        boolean z12 = z11 || (pathToAttach != null && pathToAttach.exists());
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            this.N = (!MediaController.getInstance().isPlayingMessage(this.L) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i14).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i14).isLoadingFile(attachFileName)) {
                this.N = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.N = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        n();
    }

    public final void n() {
        double d;
        MessageObject messageObject;
        if (!k() && (messageObject = this.L) != null) {
            wn0 wn0Var = this.x;
            if (!wn0Var.e) {
                wn0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i10 = (int) d;
            }
        } else if (this.L == null || !MediaController.getInstance().isPlayingMessage(this.L)) {
            TLRPC.TL_documentAttributeAudio h = h();
            if (h != null) {
                d = h.duration;
                i10 = (int) d;
            }
        } else {
            i10 = this.L.audioProgressSec;
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.J;
        if (str == null || !str.equals(formatShortDuration)) {
            this.J = formatShortDuration;
            float dp = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(dp);
            this.I = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
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
        this.P = false;
        int i10 = this.n;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.w.draw(canvas);
        int i10 = g6.ud;
        c6 c6Var = this.r;
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.vd, c6Var);
        int i11 = g6.xd;
        int v04 = g6.v0(i11, c6Var);
        int v05 = g6.v0(i11, c6Var);
        int v06 = g6.v0(g6.wd, c6Var);
        wn0 wn0Var = this.x;
        wn0Var.h(v02, v03, v04, v05, v06);
        if (!k()) {
            canvas.save();
            canvas.translate(this.E, this.F);
            wn0Var.b(canvas);
            canvas.restore();
        }
        int v07 = g6.v0(g6.nd, c6Var);
        TextPaint textPaint = this.v;
        textPaint.setColor(v07);
        if (this.I != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.A, AndroidUtilities.dp(6.0f) + this.F);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.H != null) {
            textPaint.setColor(g6.v0(g6.G6, c6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.A, this.F - AndroidUtilities.dp(16.0f));
            this.H.draw(canvas);
            canvas.restore();
        }
        j3 j3Var = this.K;
        if (j3Var != null && (textSelectionHelper = j3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.D ? 0 : this.c), AndroidUtilities.dp(2.0f), (getWidth() - (this.D ? this.c : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.s);
            }
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        m(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = this.D;
        this.Q.g(z11 ? 0 : this.c, z11 ? this.c : 0, i12 - i10, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.D;
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.Q.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.w.o(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
        if (this.N != 3) {
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
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (!k()) {
            if (this.x.f(x4 - this.E, y8 - this.F, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x4 >= this.A) {
                int i10 = this.C;
                if (x4 <= r0 + i10) {
                    if (y8 >= this.B && y8 <= r0 + i10) {
                        this.O = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.O) {
                this.O = false;
                playSoundEffect(0);
                if (k()) {
                    j3 j3Var = this.K;
                    if (j3Var != null) {
                        a aVar = this.a;
                        p3 p3Var = j3Var.a;
                        ArrayList arrayList = p3Var.h3;
                        s4 s4Var = (s4) p3Var.V3.remove(aVar.g);
                        if (s4Var != null) {
                            s4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            b2 b2Var = p3Var.F3;
                            if (b2Var != null) {
                                b2Var.d();
                            }
                            arrayList.remove(indexOf);
                            p3Var.U2.N(true);
                            b2 b2Var2 = p3Var.F3;
                            if (b2Var2 != null) {
                                b2Var2.h();
                            }
                        }
                        p3Var.d3.onContentChanged();
                    }
                } else if (this.L != null) {
                    TLRPC.Document document = j() ? this.a.g.h : null;
                    int i11 = this.N;
                    RadialProgress2 radialProgress2 = this.w;
                    if (i11 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.L);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.L, 0L, false, null)) {
                            this.N = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i11 != 1) {
                        int i12 = this.n;
                        if (i11 == 2) {
                            radialProgress2.o(0.0f, false);
                            FileLoader.getInstance(i12).loadFile(document, this.L, 1, 1);
                            this.N = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i11 == 3) {
                            FileLoader.getInstance(i12).cancelLoadFile(document);
                            this.N = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.L)) {
                        this.N = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.O = false;
        }
        return this.O || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
