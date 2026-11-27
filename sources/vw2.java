// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vw2 extends FrameLayout implements jq3 {
    public int E;
    public StaticLayout F;
    public final int G;
    public StaticLayout H;
    public final int I;
    public StaticLayout J;
    public TLRPC.BotInlineResult K;
    public TLRPC.User L;
    public TLRPC.Document M;
    public int N;
    public TLRPC.Photo O;
    public TLRPC.PhotoSize P;
    public byte Q;
    public boolean R;
    public r47 S;
    public AnimatorSet T;
    public final Paint U;
    public final int V;
    public int W;
    public final ImageReceiver a;
    public final RadialProgress2 a0;
    public boolean b;
    public boolean b0;
    public final s26 c;
    public final og2 c0;
    public final int d;
    public uw2 d0;
    public Object e;
    public v41 e0;
    public final vnb f;
    public boolean f0;
    public String g0;
    public f0d h;
    public boolean h0;
    public float i0;
    public final w10 j0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public vw2(vnb vnbVar, Context context, boolean z) {
        super(context);
        int i = yac.t0;
        this.d = i;
        this.G = hl.L(7.0f);
        this.I = hl.L(27.0f);
        this.i0 = 1.0f;
        this.j0 = new w10(this, (byte) 2);
        this.f = vnbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.m0(1);
        imageReceiver.w0 = true;
        this.c = new s26(0, vnbVar);
        this.a0 = new RadialProgress2(this, null);
        this.V = lq3.q(i).k();
        setFocusable(true);
        if (z) {
            Paint paint = new Paint();
            this.U = paint;
            int i2 = aob.Ci;
            paint.setColor(aob.v0(i2, vnbVar));
            og2 og2Var = new og2(21, vnbVar, context);
            this.c0 = og2Var;
            og2Var.setVisibility(4);
            og2Var.b(-1, i2, aob.k7);
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(1);
            addView(og2Var, tre.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    private int getIconForCurrentState() {
        byte b = this.Q;
        RadialProgress2 radialProgress2 = this.a0;
        if (b != 3 && b != 5) {
            radialProgress2.g(aob.cf, aob.df, aob.ef, aob.ff);
            return this.W == 1 ? 10 : 4;
        }
        radialProgress2.g(aob.Ze, aob.af, aob.ld, aob.md);
        int i = this.W;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return i == 4 ? 3 : 0;
    }

    @Override // jq3
    public final void B(boolean z) {
        f(true, z);
    }

    @Override // jq3
    public final void N(String str) {
        this.h0 = true;
        this.a0.o(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i;
        byte b = this.Q;
        if (b == 3 || b == 5) {
            int i2 = this.W;
            RadialProgress2 radialProgress2 = this.a0;
            if (i2 == 0) {
                if (MediaController.z().V(this.S)) {
                    this.W = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i2 == 1) {
                if (MediaController.z().U(this.S, true)) {
                    this.W = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            int i3 = this.d;
            if (i2 != 2) {
                if (i2 == 4) {
                    if (this.M != null) {
                        xb4.G(i3).f(this.M);
                    } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                        xb4.G(i3).e(null, null, jxc.c(this.K.content), null, null, null);
                    }
                    this.W = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            radialProgress2.o(false, 0.0f);
            if (this.M != null) {
                xb4.G(i3).X(this.M, this.K, 1, 0);
            } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                i = 4;
                xb4.G(i3).W(null, null, jxc.c(this.K.content), null, null, null, null, 0L, 3, 1);
                this.W = i;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
            i = 4;
            this.W = i;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b() {
        this.S = null;
        this.Q = (byte) 0;
        TLRPC.Document document = this.M;
        if (document == null) {
            TLRPC.BotInlineResult botInlineResult = this.K;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.Q = (byte) 7;
                } else if (botInlineResult.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    this.Q = (byte) 5;
                } else if (this.K.type.equals("voice")) {
                    this.Q = (byte) 3;
                }
            }
        } else if (r47.s3(document, false)) {
            this.Q = (byte) 2;
        } else if (r47.t4(this.M) || r47.K2(this.M, true)) {
            this.Q = (byte) 6;
        } else if (r47.J3(this.M)) {
            this.Q = (byte) 5;
        } else if (r47.P4(this.M)) {
            this.Q = (byte) 3;
        }
        byte b = this.Q;
        if (b == 3 || b == 5) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Utilities.b.nextInt();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i = this.d;
            long e = yac.h(i).e();
            tL_peerUser.user_id = e;
            peer.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.MessageMedia messageMedia = tL_message.media;
            messageMedia.document.file_reference = new byte[0];
            tL_message.flags |= 768;
            TLRPC.Document document2 = this.M;
            if (document2 != null) {
                messageMedia.document = document2;
                tL_message.attachPath = "";
            } else {
                String x = in5.x(this.K.content.url, this.Q == 5 ? "mp3" : "ogg");
                TLRPC.Document document3 = tL_message.media.document;
                document3.id = 0L;
                document3.access_hash = 0L;
                document3.date = tL_message.date;
                document3.mime_type = c00.i("audio/", x);
                TLRPC.Document document4 = tL_message.media.document;
                document4.size = 0L;
                document4.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = r47.f1(this.K);
                TLRPC.BotInlineResult botInlineResult2 = this.K;
                String str = botInlineResult2.title;
                if (str == null) {
                    str = "";
                }
                tL_documentAttributeAudio.title = str;
                String str2 = botInlineResult2.description;
                tL_documentAttributeAudio.performer = str2 != null ? str2 : "";
                tL_documentAttributeAudio.flags |= 3;
                if (this.Q == 3) {
                    tL_documentAttributeAudio.voice = true;
                }
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                StringBuilder sb = new StringBuilder();
                sb.append(Utilities.a(this.K.content.url));
                sb.append(".");
                sb.append(in5.x(this.K.content.url, this.Q == 5 ? "mp3" : "ogg"));
                tL_documentAttributeFilename.file_name = sb.toString();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                File z = xb4.z(4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.a(this.K.content.url));
                sb2.append(".");
                sb2.append(in5.x(this.K.content.url, this.Q == 5 ? "mp3" : "ogg"));
                tL_message.attachPath = new File(z, sb2.toString()).getAbsolutePath();
            }
            this.S = new r47(i, tL_message, false, true);
        }
    }

    public final void c(boolean z, boolean z2) {
        og2 og2Var = this.c0;
        if (og2Var == null) {
            return;
        }
        if (og2Var.getVisibility() != 0) {
            og2Var.setVisibility(0);
        }
        og2Var.a(z, z2);
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.T = null;
        }
        if (!z2) {
            this.i0 = z ? 0.85f : 1.0f;
            invalidate();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.j0, z ? 0.81f : 1.0f));
        this.T.setDuration(200L);
        this.T.addListener(new z7((byte) 25, (Object) this, z));
        this.T.start();
    }

    public final void d(int i, Object obj, TLRPC.Document document) {
        this.n = false;
        this.s = false;
        this.N = i;
        this.K = null;
        this.e = obj;
        this.M = document;
        this.O = null;
        this.R = true;
        this.y = true;
        b();
        this.Q = (byte) 2;
        requestLayout();
        this.g0 = null;
        this.h0 = false;
        this.f0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z, boolean z2, boolean z3, boolean z4) {
        this.n = z2;
        this.s = z3;
        this.L = user;
        this.K = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.M = botInlineResult.document;
            this.O = botInlineResult.photo;
        } else {
            this.M = null;
            this.O = null;
        }
        this.R = z;
        this.y = z4;
        f0d f0dVar = this.h;
        if (f0dVar != null && f0dVar.r) {
            f0dVar.r = false;
            f0dVar.h.q(false);
            f0dVar.h.r();
            k0d.r(f0dVar.c);
        }
        this.h = (botInlineResult == null || !(botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) ? null : new f0d(this, this.d, botInlineResult, this.f);
        b();
        if (z4) {
            this.Q = (byte) 2;
        }
        requestLayout();
        this.g0 = null;
        this.h0 = false;
        this.f0 = false;
        f(false, false);
    }

    public final void f(boolean z, boolean z2) {
        boolean containsKey;
        String str = this.g0;
        if (str == null && !this.f0) {
            this.f0 = true;
            Utilities.g.c(new tw2(this, z));
            this.a0.setIcon(4, z, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.W = -1;
            this.a0.setIcon(4, z, false);
            return;
        }
        if (this.M != null) {
            containsKey = xb4.G(this.d).S(this.g0);
        } else {
            containsKey = in5.z().C.containsKey(this.g0);
        }
        if (containsKey || !this.h0) {
            lq3.q(this.d).a(this.g0, null, this);
            byte b = this.Q;
            if (b != 5 && b != 3) {
                this.W = 1;
                Float s = in5.z().s(this.g0);
                this.a0.o(false, s != null ? s.floatValue() : 0.0f);
            } else if (containsKey) {
                this.W = 4;
                Float s2 = in5.z().s(this.g0);
                RadialProgress2 radialProgress2 = this.a0;
                if (s2 != null) {
                    radialProgress2.o(z2, s2.floatValue());
                } else {
                    radialProgress2.o(z2, 0.0f);
                }
            } else {
                this.W = 2;
            }
        } else {
            lq3.q(this.d).v(this);
            byte b2 = this.Q;
            if (b2 == 5 || b2 == 3) {
                boolean H = MediaController.z().H(this.S);
                if (!H || (H && MediaController.z().G())) {
                    this.W = 0;
                } else {
                    this.W = 1;
                }
                this.a0.o(z2, 1.0f);
            } else {
                this.W = -1;
            }
        }
        this.a0.setIcon(getIconForCurrentState(), z, z2);
        invalidate();
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.K;
    }

    public int getDate() {
        return this.N;
    }

    public TLRPC.Document getDocument() {
        return this.M;
    }

    public TLRPC.User getInlineBot() {
        return this.L;
    }

    public r47 getMessageObject() {
        return this.S;
    }

    @Override // jq3
    public int getObserverTag() {
        return this.V;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.K;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        this.a0.o(true, Math.min(1.0f, j / j2));
        byte b = this.Q;
        if (b == 3 || b == 5) {
            if (this.W != 4) {
                f(false, true);
            }
        } else if (this.W != 1) {
            f(false, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a.I()) {
            f(false, false);
        }
        this.a0.e();
        if (this.h == null || getMeasuredWidth() <= 0) {
            return;
        }
        this.h.a(getMeasuredWidth() - hl.L(this.R ? 4.0f : 16.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        this.a0.f();
        lq3.q(this.d).v(this);
        f0d f0dVar = this.h;
        if (f0dVar == null || !f0dVar.r) {
            return;
        }
        f0dVar.r = false;
        f0dVar.h.q(false);
        f0dVar.h.r();
        k0d.r(f0dVar.c);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b;
        int i;
        f0d f0dVar = this.h;
        if (f0dVar != null) {
            float L = hl.L(this.R ? 2.0f : 8.0f);
            float L2 = hl.L(this.R ? 2.0f : 6.0f);
            Paint paint = f0dVar.e;
            Path path = f0dVar.f;
            q0d q0dVar = f0dVar.c;
            if (q0dVar != null && (i = f0dVar.n) > 0) {
                int min = Math.min(k0d.c(f0dVar.b, q0dVar, i), hl.L(320.0f));
                float L3 = hl.L(xea.U0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, f0dVar.n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(aob.v0(aob.rb, f0dVar.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                v0d v0dVar = f0dVar.h;
                if (v0dVar != null && v0dVar.c(canvas, f0dVar.n)) {
                    f0dVar.a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (!this.n || this.R) {
                return;
            }
            canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.j0);
            return;
        }
        ImageReceiver imageReceiver = this.a;
        og2 og2Var = this.c0;
        if (og2Var != null && (og2Var.a.q || !imageReceiver.B() || imageReceiver.i1 != 1.0f || PhotoViewer.P0((r47) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U);
        }
        if (this.H != null) {
            canvas.save();
            canvas.translate(hl.L(ob6.a0 ? 8.0f : hl.C), this.G);
            this.H.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.J;
        vnb vnbVar = this.f;
        if (staticLayout != null) {
            aob.g3.setColor(aob.v0(aob.z6, vnbVar));
            canvas.save();
            canvas.translate(hl.L(ob6.a0 ? 8.0f : hl.C), this.I);
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.F != null) {
            aob.g3.setColor(aob.v0(aob.J6, vnbVar));
            canvas.save();
            canvas.translate(hl.L(ob6.a0 ? 8.0f : hl.C), this.E);
            this.F.draw(canvas);
            canvas.restore();
        }
        boolean z = this.R;
        RadialProgress2 radialProgress2 = this.a0;
        if (z) {
            TLRPC.BotInlineResult botInlineResult = this.K;
            if (botInlineResult != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth = aob.o4.getIntrinsicWidth();
                    int intrinsicHeight = aob.o4.getIntrinsicHeight();
                    float f = imageReceiver.L0;
                    float f2 = imageReceiver.N0;
                    int z2 = (int) bp1.z(f2, intrinsicWidth, 2.0f, f);
                    float f3 = imageReceiver.M0;
                    float f4 = imageReceiver.O0;
                    int z3 = (int) bp1.z(f4, intrinsicHeight, 2.0f, f3);
                    canvas.drawRect(f, f3, f2 + f, f3 + f4, s26.k);
                    aob.o4.setBounds(z2, z3, intrinsicWidth + z2, intrinsicHeight + z3);
                    aob.o4.draw(canvas);
                }
            }
        } else {
            boolean z4 = this.b;
            s26 s26Var = this.c;
            if (!z4 || PhotoViewer.R0(this.K)) {
                s26Var.setAlpha(jn7.d4);
            } else {
                s26Var.setAlpha((int) ((1.0f - imageReceiver.i1) * 255.0f));
            }
            byte b2 = this.Q;
            if (b2 == 3 || b2 == 5) {
                radialProgress2.d = aob.v0(this.r ? aob.ae : aob.Zd, vnbVar);
                radialProgress2.draw(canvas);
            } else {
                TLRPC.BotInlineResult botInlineResult2 = this.K;
                if (botInlineResult2 == null || !botInlineResult2.type.equals("file")) {
                    TLRPC.BotInlineResult botInlineResult3 = this.K;
                    if (botInlineResult3 == null || !(botInlineResult3.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND) || this.K.type.equals("voice"))) {
                        TLRPC.BotInlineResult botInlineResult4 = this.K;
                        if (botInlineResult4 == null || !(botInlineResult4.type.equals("venue") || this.K.type.equals("geo"))) {
                            s26Var.draw(canvas);
                        } else {
                            int intrinsicWidth2 = aob.o4.getIntrinsicWidth();
                            int intrinsicHeight2 = aob.o4.getIntrinsicHeight();
                            int L4 = (int) (imageReceiver.L0 + ((hl.L(52.0f) - intrinsicWidth2) / 2));
                            int L5 = (int) (imageReceiver.M0 + ((hl.L(52.0f) - intrinsicHeight2) / 2));
                            float f5 = imageReceiver.L0;
                            canvas.drawRect(f5, imageReceiver.M0, hl.L(52.0f) + f5, imageReceiver.M0 + hl.L(52.0f), s26.k);
                            aob.o4.setBounds(L4, L5, intrinsicWidth2 + L4, intrinsicHeight2 + L5);
                            aob.o4.draw(canvas);
                        }
                    } else {
                        int intrinsicWidth3 = aob.n4.getIntrinsicWidth();
                        int intrinsicHeight3 = aob.n4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.L0 + ((hl.L(52.0f) - intrinsicWidth3) / 2));
                        int L7 = (int) (imageReceiver.M0 + ((hl.L(52.0f) - intrinsicHeight3) / 2));
                        float f6 = imageReceiver.L0;
                        canvas.drawRect(f6, imageReceiver.M0, hl.L(52.0f) + f6, imageReceiver.M0 + hl.L(52.0f), s26.k);
                        aob.n4.setBounds(L6, L7, intrinsicWidth3 + L6, intrinsicHeight3 + L7);
                        aob.n4.draw(canvas);
                    }
                } else {
                    int intrinsicWidth4 = aob.m4.getIntrinsicWidth();
                    int intrinsicHeight4 = aob.m4.getIntrinsicHeight();
                    int L8 = (int) (imageReceiver.L0 + ((hl.L(52.0f) - intrinsicWidth4) / 2));
                    int L9 = (int) (imageReceiver.M0 + ((hl.L(52.0f) - intrinsicHeight4) / 2));
                    float f7 = imageReceiver.L0;
                    canvas.drawRect(f7, imageReceiver.M0, hl.L(52.0f) + f7, imageReceiver.M0 + hl.L(52.0f), s26.k);
                    aob.m4.setBounds(L8, L9, intrinsicWidth4 + L8, intrinsicHeight4 + L9);
                    aob.m4.draw(canvas);
                }
            }
        }
        if (this.b) {
            if (this.K != null) {
                imageReceiver.v0(!PhotoViewer.R0(r14), false);
            }
            canvas.save();
            float f8 = this.i0;
            v41 v41Var = this.e0;
            if (v41Var != null) {
                f8 *= v41Var.a(0.1f);
            }
            canvas.scale(f8, f8, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.R && ((b = this.Q) == 7 || b == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.n && !this.R) {
            if (ob6.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - hl.L(hl.C), getMeasuredHeight() - 1, aob.j0);
            } else {
                canvas.drawLine(hl.L(hl.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.j0);
            }
        }
        if (this.s) {
            aob.p4.setBounds(0, 0, getMeasuredWidth(), hl.L(3.0f));
            aob.p4.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        switch (this.Q) {
            case 1:
                sb.append(ob6.M0(2131753968, null));
                break;
            case 2:
                sb.append(ob6.M0(2131753964, null));
                break;
            case 3:
                sb.append(ob6.M0(2131753975, null));
                break;
            case 4:
                sb.append(ob6.M0(2131753926, null));
                break;
            case 5:
                sb.append(ob6.M0(2131753945, null));
                break;
            case 6:
                sb.append(ob6.M0(2131753929, null));
                break;
            case 7:
                sb.append(ob6.M0(2131753941, null));
                break;
        }
        StaticLayout staticLayout = this.H;
        boolean z = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.J;
        boolean z2 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.Q == 5 && z && z2) {
            sb.append(", ");
            sb.append(ob6.a0("AccDescrMusicInfo", null, 2131754827, this.J.getText(), this.H.getText()));
        } else {
            if (z) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.H.getText());
            }
            if (z2) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.J.getText());
            }
        }
        accessibilityNodeInfo.setText(sb);
        og2 og2Var = this.c0;
        if (og2Var != null && og2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        byte b = this.Q;
        if (b == 3 || b == 5) {
            int iconForCurrentState = getIconForCurrentState();
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? ob6.M0(2131754925, "AccActionPlay") : ob6.M0(2131754937, "AccActionCancelDownload") : ob6.M0(2131754934, "AccActionDownload") : ob6.M0(2131754926, "AccActionPause")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x032e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0351 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0305  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        s26 s26Var;
        float f;
        float f2;
        s26 s26Var2;
        ?? r7;
        float f3;
        float f4;
        TLRPC.Document document;
        TLRPC.PhotoSize w;
        String str;
        TLRPC.BotInlineResult botInlineResult;
        byte b;
        ArrayList arrayList3;
        jxc jxcVar;
        String str2;
        int i3;
        int i4;
        TLRPC.PhotoSize photoSize;
        TLRPC.Document document2;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        TLRPC.TL_photoStrippedSize Q;
        jn5 jn5Var;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        jn5 i5;
        String n;
        String concat;
        boolean z2;
        float f5;
        int L;
        og2 og2Var;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.BotInlineMessage botInlineMessage;
        String str5;
        TLRPC.BotInlineResult botInlineResult2;
        String str6;
        boolean z3;
        char c;
        boolean z4;
        int i6 = 0;
        this.b = false;
        this.J = null;
        this.H = null;
        this.F = null;
        this.P = null;
        this.E = hl.L(27.0f);
        if (this.K == null && this.M == null) {
            setMeasuredDimension(hl.L(100.0f), hl.L(100.0f));
            return;
        }
        if (this.h != null) {
            int size = View.MeasureSpec.getSize(i);
            int L2 = size - hl.L(this.R ? 4.0f : 16.0f);
            f0d f0dVar = this.h;
            setMeasuredDimension(size, hl.L(this.R ? 4.0f : 12.0f) + Math.min(k0d.c(f0dVar.b, f0dVar.c, L2), hl.L(320.0f)) + (this.n ? 1 : 0));
            if (isAttachedToWindow()) {
                this.h.a(L2);
                return;
            }
            return;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int L3 = (size2 - hl.L(hl.C)) - hl.L(8.0f);
        if (this.M != null) {
            arrayList2 = new ArrayList(this.M.thumbs);
        } else {
            TLRPC.BotInlineResult botInlineResult3 = this.K;
            if (botInlineResult3 == null || botInlineResult3.photo == null) {
                arrayList = null;
                z = this.R;
                s26Var = this.c;
                if (!z || (botInlineResult2 = this.K) == null) {
                    f = 100.0f;
                    f2 = 1.0f;
                    s26Var2 = s26Var;
                    r7 = 1;
                    f3 = 12.0f;
                    f4 = 4.0f;
                } else {
                    f = 100.0f;
                    if (botInlineResult2.title != null) {
                        f3 = 12.0f;
                        try {
                            f4 = 4.0f;
                            try {
                                this.H = new StaticLayout(TextUtils.ellipsize(pv3.m(this.K.title.replace('\n', ' '), aob.f3.getFontMetricsInt(), false, null, 0), aob.f3, Math.min((int) Math.ceil(aob.f3.measureText(r0)), L3), TextUtils.TruncateAt.END), aob.f3, L3 + hl.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            } catch (Exception e) {
                                e = e;
                                cc4.g(e, true);
                                s26Var.a(this.K.title);
                                str6 = this.K.description;
                                if (str6 == null) {
                                }
                                r7 = z4;
                                if (this.K.url != null) {
                                }
                                document = this.M;
                                if (document != null) {
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            f4 = 4.0f;
                        }
                        s26Var.a(this.K.title);
                    } else {
                        f3 = 12.0f;
                        f4 = 4.0f;
                    }
                    str6 = this.K.description;
                    if (str6 == null) {
                        try {
                        } catch (Exception e3) {
                            e = e3;
                            f2 = 1.0f;
                            s26Var2 = s26Var;
                        }
                        try {
                            z3 = true;
                            c = ' ';
                            s26Var2 = s26Var;
                            f2 = 1.0f;
                        } catch (Exception e4) {
                            e = e4;
                            s26Var2 = s26Var;
                            f2 = 1.0f;
                            z3 = true;
                            c = ' ';
                            cc4.g(e, z3);
                            z4 = z3;
                            r7 = z4;
                            if (this.K.url != null) {
                            }
                            document = this.M;
                            if (document != null) {
                            }
                        }
                        try {
                            StaticLayout K1 = wb2.K1(pv3.m(str6, aob.g3.getFontMetricsInt(), false, null, 0), aob.g3, L3, L3, 0, 3);
                            this.J = K1;
                            z4 = z3;
                            if (K1.getLineCount() > 0) {
                                int i7 = this.I;
                                StaticLayout staticLayout = this.J;
                                this.E = i7 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + hl.L(1.0f);
                                z4 = z3;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            cc4.g(e, z3);
                            z4 = z3;
                            r7 = z4;
                            if (this.K.url != null) {
                            }
                            document = this.M;
                            if (document != null) {
                            }
                        }
                    } else {
                        f2 = 1.0f;
                        s26Var2 = s26Var;
                        z4 = true;
                        c = ' ';
                    }
                    r7 = z4;
                    if (this.K.url != null) {
                        try {
                            this.F = new StaticLayout(TextUtils.ellipsize(this.K.url.replace('\n', c), aob.g3, Math.min((int) Math.ceil(aob.g3.measureText(r0)), L3), TextUtils.TruncateAt.MIDDLE), aob.g3, L3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            r7 = z4;
                        } catch (Exception e6) {
                            cc4.g(e6, z4);
                            r7 = z4;
                        }
                    }
                }
                document = this.M;
                if (document != null) {
                    if (this.y || r47.s3(document, false)) {
                        this.P = xb4.w(this.M.thumbs, 90, false, null, r7);
                    } else {
                        if (r47.t4(this.M) || r47.K2(this.M, r7)) {
                            this.P = xb4.w(this.M.thumbs, 90, false, null, r7);
                            str = "webp";
                            w = null;
                            botInlineResult = this.K;
                            if (botInlineResult == null) {
                                if ((botInlineResult.content instanceof TLRPC.TL_webDocument) && (str5 = botInlineResult.type) != null) {
                                    boolean startsWith = str5.startsWith("gif");
                                    TLRPC.BotInlineResult botInlineResult4 = this.K;
                                    if (startsWith) {
                                        TLRPC.WebDocument webDocument = botInlineResult4.thumb;
                                        tL_webDocument = ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) ? (TLRPC.TL_webDocument) this.K.thumb : (TLRPC.TL_webDocument) this.K.content;
                                        this.Q = (byte) 2;
                                    } else if (botInlineResult4.type.equals("photo")) {
                                        TLRPC.BotInlineResult botInlineResult5 = this.K;
                                        TLRPC.WebDocument webDocument2 = botInlineResult5.thumb;
                                        tL_webDocument = webDocument2 instanceof TLRPC.TL_webDocument ? (TLRPC.TL_webDocument) webDocument2 : (TLRPC.TL_webDocument) botInlineResult5.content;
                                    }
                                    if (tL_webDocument == null) {
                                        TLRPC.WebDocument webDocument3 = this.K.thumb;
                                        if (webDocument3 instanceof TLRPC.TL_webDocument) {
                                            tL_webDocument = (TLRPC.TL_webDocument) webDocument3;
                                        }
                                    }
                                    if (tL_webDocument == null && this.P == null && w == null) {
                                        botInlineMessage = this.K.send_message;
                                        if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo)) {
                                            TLRPC.GeoPoint geoPoint = botInlineMessage.geo;
                                            double d = geoPoint.lat;
                                            b = 3;
                                            arrayList3 = arrayList;
                                            double d2 = geoPoint._long;
                                            if (uc7.s1(this.d).f3 != 2) {
                                                jxcVar = jxc.b(this.K.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(hl.p)));
                                                str2 = null;
                                            } else {
                                                str2 = hl.e0(this.d, d, d2, 72, 72, true, 15, -1);
                                                jxcVar = null;
                                            }
                                            if (tL_webDocument != null) {
                                                jxcVar = jxc.c(tL_webDocument);
                                            }
                                        }
                                    }
                                    b = 3;
                                    arrayList3 = arrayList;
                                    jxcVar = null;
                                    str2 = null;
                                    if (tL_webDocument != null) {
                                    }
                                }
                                tL_webDocument = null;
                                if (tL_webDocument == null) {
                                }
                                if (tL_webDocument == null) {
                                    botInlineMessage = this.K.send_message;
                                    if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                                    }
                                    TLRPC.GeoPoint geoPoint2 = botInlineMessage.geo;
                                    double d3 = geoPoint2.lat;
                                    b = 3;
                                    arrayList3 = arrayList;
                                    double d22 = geoPoint2._long;
                                    if (uc7.s1(this.d).f3 != 2) {
                                    }
                                    if (tL_webDocument != null) {
                                    }
                                }
                                b = 3;
                                arrayList3 = arrayList;
                                jxcVar = null;
                                str2 = null;
                                if (tL_webDocument != null) {
                                }
                            } else {
                                b = 3;
                                arrayList3 = arrayList;
                                jxcVar = null;
                                str2 = null;
                            }
                            if (this.M != null) {
                                for (int i8 = 0; i8 < this.M.attributes.size(); i8++) {
                                    TLRPC.DocumentAttribute documentAttribute = this.M.attributes.get(i8);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        i3 = documentAttribute.w;
                                        i4 = documentAttribute.h;
                                        break;
                                    }
                                }
                            }
                            i3 = 0;
                            i4 = 0;
                            if (i3 != 0 || i4 == 0) {
                                photoSize = this.P;
                                if (photoSize == null) {
                                    if (w != null) {
                                        w.size = -1;
                                    }
                                    i3 = photoSize.w;
                                    i4 = photoSize.h;
                                } else {
                                    TLRPC.BotInlineResult botInlineResult6 = this.K;
                                    if (botInlineResult6 != null) {
                                        int[] g1 = r47.g1(botInlineResult6);
                                        int i9 = g1[0];
                                        i4 = g1[r7];
                                        i3 = i9;
                                    }
                                }
                            }
                            if (i3 != 0 || i4 == 0) {
                                i3 = hl.L(80.0f);
                                i4 = i3;
                            }
                            document2 = this.M;
                            imageReceiver = this.a;
                            if (document2 != null && this.P == null && jxcVar == null && str2 == null) {
                                imageReceiver3 = imageReceiver;
                            } else {
                                if (this.R) {
                                    str3 = "52_52_b";
                                    str4 = "52_52";
                                } else {
                                    int min = Math.min(i3, i4) / 3;
                                    if (this.Q == 2) {
                                        Locale locale = Locale.US;
                                        String n2 = bp1.n((int) (min / hl.p), "_80_b");
                                        boolean z5 = xea.a;
                                        if (i86.e(2048) || this.x) {
                                            str4 = n2;
                                            str3 = str4;
                                        } else {
                                            concat = n2.concat("_firstframe");
                                            n = n2.concat("_firstframe");
                                        }
                                    } else {
                                        Locale locale2 = Locale.US;
                                        n = bp1.n((int) (min / hl.p), "_80");
                                        concat = n.concat("_b");
                                    }
                                    str4 = n;
                                    str3 = concat;
                                }
                                imageReceiver.S0 = this.Q != 6 ? r7 : false;
                                Q = xb4.Q(arrayList3);
                                if (Q != null) {
                                    TLRPC.Document document3 = this.M;
                                    if (document3 != null) {
                                        i5 = jn5.c(Q, document3);
                                    } else {
                                        TLRPC.Photo photo = this.O;
                                        if (photo != null) {
                                            i5 = jn5.i(Q, photo);
                                        }
                                    }
                                    jn5Var = i5;
                                    if (this.Q == 2) {
                                        TLRPC.Document document4 = this.M;
                                        if (document4 != null) {
                                            TLRPC.VideoSize J0 = r47.J0(document4);
                                            TLRPC.Document document5 = this.M;
                                            if (J0 != null) {
                                                jn5 d4 = jn5.d(J0, document5);
                                                StringBuilder sb = new StringBuilder("100_100");
                                                boolean z6 = xea.a;
                                                sb.append((i86.e(2048) || this.x) ? "" : "_firstframe");
                                                imageReceiver2 = imageReceiver;
                                                imageReceiver2.Y(d4, sb.toString(), jn5.c(this.P, this.M), str4, jn5Var, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2 = imageReceiver;
                                                jn5 b2 = jn5.b(document5);
                                                if (this.y) {
                                                    b2.p = (byte) 2;
                                                }
                                                StringBuilder sb2 = new StringBuilder("100_100");
                                                boolean z7 = xea.a;
                                                sb2.append((i86.e(2048) || this.x) ? "" : "_firstframe");
                                                imageReceiver2.Y(b2, sb2.toString(), jn5.c(this.P, this.M), str4, jn5Var, str3, null, this.M.size, str, this.e, 0);
                                            }
                                        } else {
                                            imageReceiver2 = imageReceiver;
                                            if (jxcVar != null) {
                                                imageReceiver2.Y(jn5.p(jxcVar), "100_100", jn5.i(this.P, this.O), str4, jn5Var, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2.Y(jn5.g(str2), "100_100", jn5.i(this.P, this.O), str4, jn5Var, str3, null, -1L, str, this.e, 1);
                                            }
                                        }
                                    } else {
                                        imageReceiver2 = imageReceiver;
                                        if (this.P != null) {
                                            ggb f6 = lp3.f(this.M, aob.a7, f2, null);
                                            if (r47.p(this.M)) {
                                                TLRPC.Document document6 = this.M;
                                                if (f6 != null) {
                                                    imageReceiver2.Y(jn5.b(document6), "80_80", null, null, jn5Var, str3, f6, this.P.size, str, this.e, 0);
                                                } else {
                                                    imageReceiver2.Y(jn5.b(document6), "80_80", jn5.c(this.P, this.M), str3, jn5Var, str3, null, this.P.size, str, this.e, 0);
                                                }
                                            } else {
                                                TLRPC.Document document7 = this.M;
                                                if (document7 != null) {
                                                    TLRPC.PhotoSize photoSize2 = this.P;
                                                    if (f6 != null) {
                                                        imageReceiver2.Y(jn5.c(photoSize2, document7), str4, null, null, jn5Var, str3, f6, this.P.size, str, this.e, 0);
                                                    } else {
                                                        imageReceiver2.Y(jn5.c(photoSize2, document7), str4, jn5.i(w, this.O), str3, jn5Var, str3, null, this.P.size, str, this.e, 0);
                                                    }
                                                } else {
                                                    imageReceiver2.Y(jn5.i(this.P, this.O), str4, jn5.i(w, this.O), str3, jn5Var, str3, null, this.P.size, str, this.e, 0);
                                                }
                                            }
                                        } else if (jxcVar != null) {
                                            imageReceiver2.Y(jn5.p(jxcVar), str4, jn5.i(w, this.O), str3, jn5Var, str3, null, -1L, str, this.e, 1);
                                        } else {
                                            imageReceiver2.Y(jn5.g(str2), str4, jn5.i(w, this.O), str3, jn5Var, str3, null, -1L, str, this.e, 1);
                                        }
                                    }
                                    imageReceiver3 = imageReceiver2;
                                    boolean z8 = xea.a;
                                    if (!i86.e(2048) || this.x) {
                                        imageReceiver3.u0 = r7;
                                        imageReceiver3.w0(false);
                                    } else {
                                        imageReceiver3.u0 = false;
                                        imageReceiver3.x0();
                                    }
                                    this.b = r7;
                                }
                                jn5Var = null;
                                if (this.Q == 2) {
                                }
                                imageReceiver3 = imageReceiver2;
                                boolean z82 = xea.a;
                                if (i86.e(2048)) {
                                }
                                imageReceiver3.u0 = r7;
                                imageReceiver3.w0(false);
                                this.b = r7;
                            }
                            z2 = this.R;
                            RadialProgress2 radialProgress2 = this.a0;
                            if (z2) {
                                StaticLayout staticLayout2 = this.H;
                                if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                                    StaticLayout staticLayout3 = this.H;
                                    i6 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - r7);
                                }
                                StaticLayout staticLayout4 = this.J;
                                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                                    StaticLayout staticLayout5 = this.J;
                                    i6 += staticLayout5.getLineBottom(staticLayout5.getLineCount() - r7);
                                }
                                StaticLayout staticLayout6 = this.F;
                                if (staticLayout6 != null && staticLayout6.getLineCount() > 0) {
                                    StaticLayout staticLayout7 = this.F;
                                    i6 += staticLayout7.getLineBottom(staticLayout7.getLineCount() - r7);
                                }
                                setMeasuredDimension(View.MeasureSpec.getSize(i), qu6.e(16.0f, Math.max(hl.L(52.0f), i6), hl.L(68.0f)) + (this.n ? 1 : 0));
                                int L4 = hl.L(52.0f);
                                if (ob6.a0) {
                                    f5 = 8.0f;
                                    L = qu6.x(8.0f, View.MeasureSpec.getSize(i), L4);
                                } else {
                                    f5 = 8.0f;
                                    L = hl.L(8.0f);
                                }
                                s26Var2.setBounds(L, hl.L(f5), L + L4, hl.L(60.0f));
                                float f7 = L4;
                                imageReceiver3.i0(L, hl.L(f5), f7, f7);
                                byte b3 = this.Q;
                                if (b3 == b || b3 == 5) {
                                    radialProgress2.setCircleRadius(hl.L(24.0f));
                                    radialProgress2.p(hl.L(f4) + L, hl.L(f3), hl.L(48.0f) + L, hl.L(56.0f));
                                }
                            } else {
                                int size3 = View.MeasureSpec.getSize(i2);
                                if (size3 == 0) {
                                    size3 = hl.L(f);
                                }
                                setMeasuredDimension(size2, size3);
                                int D = ik8.D(24.0f, size2, 2);
                                int D2 = ik8.D(24.0f, size3, 2);
                                radialProgress2.p(D, D2, hl.L(24.0f) + D, hl.L(24.0f) + D2);
                                radialProgress2.setCircleRadius(hl.L(f3));
                                imageReceiver3.i0(0.0f, 0.0f, size2, size3);
                            }
                            og2Var = this.c0;
                            if (og2Var == null) {
                                measureChildWithMargins(og2Var, i, 0, i2, 0);
                                return;
                            }
                            return;
                        }
                        byte b4 = this.Q;
                        if (b4 != 5 && b4 != 3) {
                            this.P = xb4.w(this.M.thumbs, 90, false, null, r7);
                        }
                    }
                    w = null;
                    str = null;
                    botInlineResult = this.K;
                    if (botInlineResult == null) {
                    }
                    if (this.M != null) {
                    }
                    i3 = 0;
                    i4 = 0;
                    if (i3 != 0) {
                    }
                    photoSize = this.P;
                    if (photoSize == null) {
                    }
                    if (i3 != 0) {
                    }
                    i3 = hl.L(80.0f);
                    i4 = i3;
                    document2 = this.M;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.R) {
                    }
                    imageReceiver.S0 = this.Q != 6 ? r7 : false;
                    Q = xb4.Q(arrayList3);
                    if (Q != null) {
                    }
                    jn5Var = null;
                    if (this.Q == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    boolean z822 = xea.a;
                    if (i86.e(2048)) {
                    }
                    imageReceiver3.u0 = r7;
                    imageReceiver3.w0(false);
                    this.b = r7;
                    z2 = this.R;
                    RadialProgress2 radialProgress22 = this.a0;
                    if (z2) {
                    }
                    og2Var = this.c0;
                    if (og2Var == null) {
                    }
                } else {
                    TLRPC.BotInlineResult botInlineResult7 = this.K;
                    if (botInlineResult7 != null && botInlineResult7.photo != null) {
                        this.P = xb4.w(arrayList, hl.Y0(false), r7, null, r7);
                        w = xb4.w(arrayList, 80, false, null, r7);
                        if (w != this.P) {
                            str = null;
                            botInlineResult = this.K;
                            if (botInlineResult == null) {
                            }
                            if (this.M != null) {
                            }
                            i3 = 0;
                            i4 = 0;
                            if (i3 != 0) {
                            }
                            photoSize = this.P;
                            if (photoSize == null) {
                            }
                            if (i3 != 0) {
                            }
                            i3 = hl.L(80.0f);
                            i4 = i3;
                            document2 = this.M;
                            imageReceiver = this.a;
                            if (document2 != null) {
                            }
                            if (this.R) {
                            }
                            imageReceiver.S0 = this.Q != 6 ? r7 : false;
                            Q = xb4.Q(arrayList3);
                            if (Q != null) {
                            }
                            jn5Var = null;
                            if (this.Q == 2) {
                            }
                            imageReceiver3 = imageReceiver2;
                            boolean z8222 = xea.a;
                            if (i86.e(2048)) {
                            }
                            imageReceiver3.u0 = r7;
                            imageReceiver3.w0(false);
                            this.b = r7;
                            z2 = this.R;
                            RadialProgress2 radialProgress222 = this.a0;
                            if (z2) {
                            }
                            og2Var = this.c0;
                            if (og2Var == null) {
                            }
                        }
                    }
                    w = null;
                    str = null;
                    botInlineResult = this.K;
                    if (botInlineResult == null) {
                    }
                    if (this.M != null) {
                    }
                    i3 = 0;
                    i4 = 0;
                    if (i3 != 0) {
                    }
                    photoSize = this.P;
                    if (photoSize == null) {
                    }
                    if (i3 != 0) {
                    }
                    i3 = hl.L(80.0f);
                    i4 = i3;
                    document2 = this.M;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.R) {
                    }
                    imageReceiver.S0 = this.Q != 6 ? r7 : false;
                    Q = xb4.Q(arrayList3);
                    if (Q != null) {
                    }
                    jn5Var = null;
                    if (this.Q == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    boolean z82222 = xea.a;
                    if (i86.e(2048)) {
                    }
                    imageReceiver3.u0 = r7;
                    imageReceiver3.w0(false);
                    this.b = r7;
                    z2 = this.R;
                    RadialProgress2 radialProgress2222 = this.a0;
                    if (z2) {
                    }
                    og2Var = this.c0;
                    if (og2Var == null) {
                    }
                }
            } else {
                arrayList2 = new ArrayList(this.K.photo.sizes);
            }
        }
        arrayList = arrayList2;
        z = this.R;
        s26Var = this.c;
        if (z) {
        }
        f = 100.0f;
        f2 = 1.0f;
        s26Var2 = s26Var;
        r7 = 1;
        f3 = 12.0f;
        f4 = 4.0f;
        document = this.M;
        if (document != null) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (this.R || this.d0 == null || this.K == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Typeface typeface = hl.a;
        byte b = this.Q;
        s26 s26Var = this.c;
        boolean z = true;
        if (b == 3 || b == 5) {
            boolean contains = s26Var.getBounds().contains(x, y);
            int action = motionEvent.getAction();
            RadialProgress2 radialProgress2 = this.a0;
            if (action == 0) {
                if (contains) {
                    this.r = true;
                    radialProgress2.n(true, false);
                    invalidate();
                }
            } else if (this.r) {
                if (motionEvent.getAction() == 1) {
                    this.r = false;
                    playSoundEffect(0);
                    a();
                    invalidate();
                } else if (motionEvent.getAction() == 3) {
                    this.r = false;
                    invalidate();
                } else if (motionEvent.getAction() == 2 && !contains) {
                    this.r = false;
                    invalidate();
                }
                radialProgress2.n(this.r, false);
            }
            z = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.K;
            if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                if (motionEvent.getAction() == 0) {
                    if (s26Var.getBounds().contains(x, y)) {
                        this.r = true;
                    }
                } else if (this.r) {
                    if (motionEvent.getAction() == 1) {
                        this.r = false;
                        playSoundEffect(0);
                        ((g17) this.d0).a.W.b.k(getResult());
                    } else if (motionEvent.getAction() == 3) {
                        this.r = false;
                    } else if (motionEvent.getAction() == 2 && !s26Var.getBounds().contains(x, y)) {
                        this.r = false;
                    }
                }
            }
            z = false;
        }
        return !z ? super.onTouchEvent(motionEvent) : z;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        byte b;
        if (i != 16 || ((b = this.Q) != 3 && b != 5)) {
            return super.performAccessibilityAction(i, bundle);
        }
        a();
        return true;
    }

    public void setCanPreviewGif(boolean z) {
        this.w = z;
    }

    public void setDelegate(uw2 uw2Var) {
        this.d0 = uw2Var;
    }

    public void setIsKeyboard(boolean z) {
        this.x = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        v41 v41Var = this.e0;
        if (v41Var != null) {
            v41Var.c(z || this.b0);
        }
    }

    public void setScaled(boolean z) {
        this.b0 = z;
        v41 v41Var = this.e0;
        if (v41Var != null) {
            v41Var.c(isPressed() || this.b0);
        }
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }

    public vw2(Context context) {
        this(null, context, false);
    }
}
