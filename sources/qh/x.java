package qh;

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
import g7.e6;
import java.io.File;
import java.util.ArrayList;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ln0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x extends y implements org.telegram.ui.ActionBar.w5, m9, i0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
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
    public i3 K;
    public MessageObject L;
    public TLRPC.Document M;
    public int N;
    public boolean O;
    public boolean P;
    public final h0 Q;
    public final int n;
    public final b6 r;
    public final Paint s;
    public final TextPaint v;
    public final RadialProgress2 w;
    public final ln0 x;
    public final int y;

    public x(Context context, int i9, b6 b6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new TextPaint(1);
        this.A = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.B = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.C = dp2;
        this.n = i9;
        this.r = b6Var;
        setWillNotDraw(false);
        this.y = DownloadController.getInstance(i9).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, b6Var);
        this.w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i10 = this.A;
        radialProgress2.q(i10, dp, i10 + dp2, dp2 + dp);
        ln0 ln0Var = new ln0(this);
        this.x = ln0Var;
        ln0Var.h = new m5.c0(this, 20);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        h0 h0Var = new h0(context, b6Var, new n5.e0(this, 17));
        this.Q = h0Var;
        addView(h0Var.a, e6.e(-2, -2, 51));
        d();
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
        int i9 = this.N;
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 2) {
            return 2;
        }
        return i9 == 3 ? 3 : 0;
    }

    @Override // qh.i0
    public final boolean a(int i9, int i10) {
        return this.Q.f(i9, i10);
    }

    @Override // qh.i0
    public final void b() {
        this.Q.i();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        this.s.setColor(f6.v0(f6.uf, this.r));
        h0 h0Var = this.Q;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.L;
        if (messageObject == null || i10 != this.n) {
            return;
        }
        if (i9 == NotificationCenter.messagePlayingDidStart || i9 == NotificationCenter.messagePlayingDidReset || i9 == NotificationCenter.messagePlayingPlayStateChanged) {
            m(true);
            return;
        }
        if (i9 == NotificationCenter.messagePlayingProgressDidChanged) {
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

    @Override // qh.y
    public final void f(int i9) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.D) {
            i9 = 0;
        }
        int i10 = dp + i9;
        this.A = i10;
        int i11 = this.C;
        int i12 = this.B;
        this.w.q(i10, i12, i10 + i11, i11 + i12);
        requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.Q.e(arrayList);
    }

    @Override // qh.i0
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

    @Override // qh.i0
    public a getRow() {
        return this.a;
    }

    public final TLRPC.TL_documentAttributeAudio h() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i9 = 0; i9 < displayDocument.attributes.size(); i9++) {
            if (displayDocument.attributes.get(i9) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i9);
            }
        }
        return null;
    }

    public final void i(a aVar, i3 i3Var) {
        s sVar;
        this.a = aVar;
        this.K = i3Var;
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
            int i9 = this.n;
            long clientUserId = UserConfig.getInstance(i9).getClientUserId();
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
            this.L = new MessageObject(i9, tL_message, false, true);
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
        int i9 = this.C;
        this.E = dp + i9;
        this.G = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - this.E) - AndroidUtilities.dp(16.0f)) - (this.D ? this.c : 0));
        MessageObject messageObject = this.L;
        String musicAuthor = messageObject != null ? messageObject.getMusicAuthor(false) : h() != null ? h().performer : null;
        MessageObject messageObject2 = this.L;
        String musicTitle = messageObject2 != null ? messageObject2.getMusicTitle(false) : h() != null ? h().title : null;
        boolean isEmpty = TextUtils.isEmpty(musicTitle);
        int i10 = this.B;
        if (isEmpty && TextUtils.isEmpty(musicAuthor)) {
            this.H = null;
            this.F = ((i9 - AndroidUtilities.dp(30.0f)) / 2) + i10;
        } else {
            SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(aa.d.z(musicAuthor, " - ", musicTitle));
            if (!TextUtils.isEmpty(musicAuthor)) {
                spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
            }
            float dp2 = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(dp2);
            this.H = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.G, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.G, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.F = AndroidUtilities.dp(11.0f) + ((i9 - AndroidUtilities.dp(30.0f)) / 2) + i10;
        }
        this.x.j(this.G, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z10) {
        s sVar;
        int i9 = f6.ie;
        int i10 = f6.je;
        int i11 = f6.uc;
        int i12 = f6.vc;
        RadialProgress2 radialProgress2 = this.w;
        radialProgress2.g(i9, i10, i11, i12);
        radialProgress2.d = f6.v0(f6.Bd, this.r);
        boolean k10 = k();
        int i13 = this.n;
        if (k10) {
            DownloadController.getInstance(i13).removeLoadingFileObserver(this);
            radialProgress2.o(this.a.g.f, z10);
            radialProgress2.setIcon(3, false, z10);
            n();
            return;
        }
        TLRPC.Document document = j() ? this.a.g.h : null;
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.a;
        boolean z11 = (aVar == null || (sVar = aVar.g) == null || TextUtils.isEmpty(sVar.e) || !new File(this.a.g.e).exists()) ? false : true;
        File pathToAttach = document == null ? null : FileLoader.getInstance(i13).getPathToAttach(document, true);
        boolean z12 = z11 || (pathToAttach != null && pathToAttach.exists());
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i13).removeLoadingFileObserver(this);
            this.N = (!MediaController.getInstance().isPlayingMessage(this.L) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i13).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i13).isLoadingFile(attachFileName)) {
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
            ln0 ln0Var = this.x;
            if (!ln0Var.e) {
                ln0Var.i(messageObject.audioProgress);
            }
        }
        int i9 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i9 = (int) d;
            }
        } else if (this.L == null || !MediaController.getInstance().isPlayingMessage(this.L)) {
            TLRPC.TL_documentAttributeAudio h = h();
            if (h != null) {
                d = h.duration;
                i9 = (int) d;
            }
        } else {
            i9 = this.L.audioProgressSec;
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i9);
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
        int i9 = this.n;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P = false;
        int i9 = this.n;
        DownloadController.getInstance(i9).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        n9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.w.draw(canvas);
        int i9 = f6.ud;
        b6 b6Var = this.r;
        int v02 = f6.v0(i9, b6Var);
        int v03 = f6.v0(f6.vd, b6Var);
        int i10 = f6.xd;
        int v04 = f6.v0(i10, b6Var);
        int v05 = f6.v0(i10, b6Var);
        int v06 = f6.v0(f6.wd, b6Var);
        ln0 ln0Var = this.x;
        ln0Var.h(v02, v03, v04, v05, v06);
        if (!k()) {
            canvas.save();
            canvas.translate(this.E, this.F);
            ln0Var.b(canvas);
            canvas.restore();
        }
        int v07 = f6.v0(f6.nd, b6Var);
        TextPaint textPaint = this.v;
        textPaint.setColor(v07);
        if (this.I != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.A, AndroidUtilities.dp(6.0f) + this.F);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.H != null) {
            textPaint.setColor(f6.v0(f6.G6, b6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.A, this.F - AndroidUtilities.dp(16.0f));
            this.H.draw(canvas);
            canvas.restore();
        }
        i3 i3Var = this.K;
        if (i3Var != null && (textSelectionHelper = i3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11 = this.D;
        this.Q.g(z11 ? 0 : this.c, z11 ? this.c : 0, i11 - i9, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
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
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!k()) {
            if (this.x.f(x10 - this.E, y10 - this.F, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            if (x10 >= this.A) {
                int i9 = this.C;
                if (x10 <= r0 + i9) {
                    if (y10 >= this.B && y10 <= r0 + i9) {
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
                    i3 i3Var = this.K;
                    if (i3Var != null) {
                        a aVar = this.a;
                        o3 o3Var = i3Var.a;
                        ArrayList arrayList = o3Var.h3;
                        r4 r4Var = (r4) o3Var.V3.remove(aVar.g);
                        if (r4Var != null) {
                            r4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            b2 b2Var = o3Var.F3;
                            if (b2Var != null) {
                                b2Var.d();
                            }
                            arrayList.remove(indexOf);
                            o3Var.U2.N(true);
                            b2 b2Var2 = o3Var.F3;
                            if (b2Var2 != null) {
                                b2Var2.h();
                            }
                        }
                        o3Var.d3.onContentChanged();
                    }
                } else if (this.L != null) {
                    TLRPC.Document document = j() ? this.a.g.h : null;
                    int i10 = this.N;
                    RadialProgress2 radialProgress2 = this.w;
                    if (i10 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.L);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.L, 0L, false, null)) {
                            this.N = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i10 != 1) {
                        int i11 = this.n;
                        if (i10 == 2) {
                            radialProgress2.o(0.0f, false);
                            FileLoader.getInstance(i11).loadFile(document, this.L, 1, 1);
                            this.N = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i10 == 3) {
                            FileLoader.getInstance(i11).cancelLoadFile(document);
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
