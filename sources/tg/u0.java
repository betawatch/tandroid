package tg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import bi.m5;
import c8.ha;
import fi.e5;
import fi.e7;
import fi.x5;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class u0 extends j {
    public boolean A0;
    public boolean B0;
    public final SparseIntArray C0;
    public final t0 D0;
    public t4 E0;
    public t4 F0;
    public t4 G0;
    public t4 H0;
    public t4 I0;
    public t4 J0;
    public t4 K0;
    public t4 L0;
    public final m5 q0;
    public final p0 r0;
    public final ArrayList s0;
    public final dj t0;
    public boolean u0;
    public boolean v0;
    public TextureView w0;
    public boolean x0;
    public int y0;
    public int z0;

    public u0(Context context, PointF pointF, ArrayList arrayList, y9 y9Var, boolean z9, x5 x5Var) {
        super(context, pointF);
        hi.u1 u1Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.s0 = new ArrayList();
        this.y0 = 1;
        this.z0 = 1;
        this.A0 = true;
        this.B0 = k6.I.q();
        this.C0 = new SparseIntArray();
        e5 e5Var = (e5) this;
        this.D0 = new t0(e5Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ij ijVar = (ij) arrayList.get(i7);
            TLRPC.Message message2 = ijVar.k;
            int i10 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = e7.D(ijVar);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i11 = ijVar.I1;
                ij ijVar2 = new ij(i11, message, ijVar.C, qp.s1(i11).d, qp.s1(ijVar.I1).b, null, null, true, true, 0L, true, z9, false, 0);
                ijVar2.M5();
                this.s0.add(ijVar2);
            }
            tL_messageService.id = message2.id;
            tL_messageService.from_id = message2.from_id;
            tL_messageService.peer_id = message2.peer_id;
            tL_messageService.date = message2.date;
            tL_messageService.expire_date = message2.expire_date;
            tL_messageService.action = message2.action;
            tL_messageService.message = message2.message;
            tL_messageService.media = message2.media;
            tL_messageService.flags = message2.flags;
            tL_messageService.flags2 = message2.flags2;
            tL_messageService.rich_message = message2.rich_message;
            tL_messageService.translatedRichMessage = message2.translatedRichMessage;
            tL_messageService.mentioned = message2.mentioned;
            tL_messageService.media_unread = message2.media_unread;
            tL_messageService.out = message2.out;
            tL_messageService.unread = message2.unread;
            tL_messageService.entities = message2.entities;
            tL_messageService.via_bot_name = message2.via_bot_name;
            tL_messageService.reply_markup = message2.reply_markup;
            tL_messageService.views = message2.views;
            tL_messageService.forwards = message2.forwards;
            tL_messageService.replies = message2.replies;
            tL_messageService.edit_date = message2.edit_date;
            tL_messageService.silent = message2.silent;
            tL_messageService.post = message2.post;
            tL_messageService.from_scheduled = message2.from_scheduled;
            tL_messageService.legacy = message2.legacy;
            tL_messageService.edit_hide = message2.edit_hide;
            tL_messageService.pinned = message2.pinned;
            tL_messageService.fwd_from = message2.fwd_from;
            tL_messageService.via_bot_id = message2.via_bot_id;
            tL_messageService.reply_to = message2.reply_to;
            tL_messageService.post_author = message2.post_author;
            tL_messageService.grouped_id = message2.grouped_id;
            tL_messageService.reactions = message2.reactions;
            tL_messageService.restriction_reason = message2.restriction_reason;
            tL_messageService.ttl_period = message2.ttl_period;
            tL_messageService.noforwards = message2.noforwards;
            tL_messageService.invert_media = message2.invert_media;
            tL_messageService.send_state = message2.send_state;
            tL_messageService.fwd_msg_id = message2.fwd_msg_id;
            tL_messageService.attachPath = message2.attachPath;
            tL_messageService.params = message2.params;
            tL_messageService.random_id = message2.random_id;
            tL_messageService.local_id = message2.local_id;
            tL_messageService.dialog_id = message2.dialog_id;
            tL_messageService.ttl = message2.ttl;
            tL_messageService.destroyTime = message2.destroyTime;
            tL_messageService.destroyTimeMillis = message2.destroyTimeMillis;
            tL_messageService.layer = message2.layer;
            tL_messageService.seq_in = message2.seq_in;
            tL_messageService.seq_out = message2.seq_out;
            tL_messageService.with_my_score = message2.with_my_score;
            tL_messageService.replyMessage = message2.replyMessage;
            tL_messageService.reqId = message2.reqId;
            tL_messageService.realId = message2.realId;
            tL_messageService.stickerVerified = message2.stickerVerified;
            tL_messageService.isThreadMessage = message2.isThreadMessage;
            tL_messageService.voiceTranscription = message2.voiceTranscription;
            tL_messageService.voiceTranscriptionOpen = message2.voiceTranscriptionOpen;
            tL_messageService.voiceTranscriptionRated = message2.voiceTranscriptionRated;
            tL_messageService.voiceTranscriptionFinal = message2.voiceTranscriptionFinal;
            tL_messageService.voiceTranscriptionForce = message2.voiceTranscriptionForce;
            tL_messageService.voiceTranscriptionId = message2.voiceTranscriptionId;
            tL_messageService.premiumEffectWasPlayed = message2.premiumEffectWasPlayed;
            tL_messageService.originalLanguage = message2.originalLanguage;
            tL_messageService.translatedToLanguage = message2.translatedToLanguage;
            tL_messageService.translatedText = message2.translatedText;
            tL_messageService.replyStory = message2.replyStory;
            message = tL_messageService;
            D = e7.D(ijVar);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i112 = ijVar.I1;
            ij ijVar22 = new ij(i112, message, ijVar.C, qp.s1(i112).d, qp.s1(ijVar.I1).b, null, null, true, true, 0L, true, z9, false, 0);
            ijVar22.M5();
            this.s0.add(ijVar22);
        }
        this.t0 = null;
        if (this.s0.size() > 1) {
            dj djVar = new dj();
            this.t0 = djVar;
            djVar.d.addAll(this.s0);
            djVar.a = ((ij) this.s0.get(0)).d1();
            djVar.a();
        }
        m5 m5Var = new m5(e5Var, context);
        this.q0 = m5Var;
        addView(m5Var, ha.c(-1.0f, -1));
        p0 p0Var = new p0(e5Var, context, this.D0);
        this.r0 = p0Var;
        p0Var.setAdapter(new s0(e5Var, context, y9Var, x5Var, z9));
        u90 u90Var = new u90(e5Var, 2);
        u90Var.O = new ai.l(e5Var, 15);
        p0Var.setLayoutManager(u90Var);
        p0Var.i(new di.k(16));
        m5Var.addView(p0Var, ha.c(-1.0f, -1));
        if (x5Var != null && x5Var.g) {
            ii.c cVar = new ii.c(e5Var, 22);
            hi.u1 u1Var2 = new hi.u1(e5Var, 21);
            x5Var.b = cVar;
            x5Var.c = u1Var2;
            TextureView textureView = x5Var.a;
            if (textureView != null) {
                cVar.a(textureView);
            }
            if (x5Var.d && (u1Var = x5Var.c) != null) {
                u1Var.a(Integer.valueOf(x5Var.e), Integer.valueOf(x5Var.f));
            }
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.Cells.q1 getCell() {
        p0 p0Var = this.r0;
        if (p0Var == null) {
            return null;
        }
        for (int i7 = 0; i7 < p0Var.getChildCount(); i7++) {
            if (p0Var.getChildAt(i7) instanceof org.telegram.ui.Cells.q1) {
                return (org.telegram.ui.Cells.q1) p0Var.getChildAt(i7);
            }
        }
        return null;
    }

    @Override // tg.j
    public final i a() {
        return new j0(this, getContext());
    }

    @Override // tg.j
    public float getBounceScale() {
        return 0.02f;
    }

    @Override // tg.j
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ki0();
        }
        float scaleX = viewGroup.getScaleX();
        return new ki0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + org.telegram.messenger.g0.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + org.telegram.messenger.g0.L(71.0f));
    }

    @Override // tg.j
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.v0) {
            s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (((org.telegram.messenger.ij) r0.get(0)).U == 1) goto L12;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        m5 m5Var = this.q0;
        m5Var.measure(i7, i10);
        setMeasuredDimension(m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight());
        k();
        if (this.A0) {
            ArrayList arrayList = this.s0;
            if (arrayList != null) {
                z9 = true;
                if (arrayList.size() == 1) {
                }
            }
            z9 = false;
            float min = Math.min((View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(z9 ? 0.0f : 44.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(z9 ? 0.0f : 192.0f)) / getMeasuredHeight());
            if (min < 1.0f) {
                setScale(min);
            }
            PointF position = getPosition();
            if (!z9) {
                position.x -= Math.min(1.0f, min) * org.telegram.messenger.g0.L(19.0f);
            }
            setPosition(position);
            this.A0 = false;
        }
    }

    public final float r(RectF rectF) {
        float y10;
        float f10;
        float f11;
        float f12;
        float f13 = 2.14748365E9f;
        float f14 = -2.14748365E9f;
        int i7 = 0;
        float f15 = 2.14748365E9f;
        float f16 = -2.14748365E9f;
        while (true) {
            p0 p0Var = this.r0;
            if (i7 >= p0Var.getChildCount()) {
                rectF.set(f13, f15, f16, f14);
                return org.telegram.messenger.g0.L(iz.Y0);
            }
            View childAt = p0Var.getChildAt(i7);
            boolean z9 = childAt instanceof org.telegram.ui.Cells.q1;
            m5 m5Var = this.q0;
            if (z9) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == null || !q1Var.getMessageObject().i4() || q1Var.getPhotoImage() == null) {
                    float x10 = childAt.getX() + m5Var.getX() + q1Var.getBackgroundDrawableLeft() + org.telegram.messenger.g0.L(1.0f);
                    if (this.t0 == null) {
                        x10 += org.telegram.messenger.g0.L(8.0f);
                    }
                    float x11 = ((childAt.getX() + m5Var.getX()) + q1Var.getBackgroundDrawableRight()) - org.telegram.messenger.g0.L(1.66f);
                    float L = org.telegram.messenger.g0.L(2.0f) + childAt.getY() + m5Var.getY() + q1Var.getBackgroundDrawableTop();
                    y10 = ((childAt.getY() + m5Var.getY()) + q1Var.getBackgroundDrawableBottom()) - org.telegram.messenger.g0.L(1.0f);
                    f10 = x10;
                    f11 = x11;
                    f12 = L;
                } else {
                    f10 = q1Var.getX() + m5Var.getX() + q1Var.getPhotoImage().K0;
                    f11 = q1Var.getPhotoImage().y() + q1Var.getX() + m5Var.getX();
                    f12 = q1Var.getY() + m5Var.getY() + q1Var.getPhotoImage().L0;
                    y10 = q1Var.getPhotoImage().A() + q1Var.getY() + m5Var.getY();
                }
                f13 = Math.min(Math.min(f13, f10), f11);
                f16 = Math.max(Math.max(f16, f10), f11);
                f15 = Math.min(Math.min(f15, f12), y10);
                f14 = Math.max(Math.max(f14, f12), y10);
            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                if (t0Var.R()) {
                    float x12 = t0Var.getX() + m5Var.getX() + t0Var.getBoundsLeft();
                    float x13 = t0Var.getX() + m5Var.getX() + t0Var.getBoundsRight();
                    float y11 = t0Var.getY() + m5Var.getY();
                    float y12 = t0Var.getY() + m5Var.getY() + t0Var.getMeasuredHeight();
                    f13 = Math.min(Math.min(f13, x12), x13);
                    f16 = Math.max(Math.max(f16, x12), x13);
                    f15 = Math.min(Math.min(f15, y11), y12);
                    f14 = Math.max(Math.max(f14, y11), y12);
                }
            }
            i7++;
        }
    }

    public final void s() {
        p0 p0Var = this.r0;
        p0Var.invalidate();
        for (int i7 = 0; i7 < p0Var.getChildCount(); i7++) {
            p0Var.getChildAt(i7).invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[LOOP:1: B:36:0x00a5->B:38:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setupTheme(e7 e7Var) {
        SparseIntArray T0;
        int[] iArr;
        int i7;
        h6 k10;
        if (e7Var == null) {
            this.C0.clear();
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (k6.Q0(string) == null || k6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (k6.Q0(string2) == null || !k6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        j6 j6Var = k6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            boolean z9 = e7Var.y0;
            this.B0 = z9;
            j6 Q0 = !z9 ? k6.Q0(str2) : k6.Q0(str);
            String[] strArr = new String[1];
            String str3 = Q0.d;
            T0 = str3 == null ? k6.T0(null, str3, strArr) : k6.T0(new File(Q0.b), null, strArr);
            this.C0.clear();
            iArr = k6.em;
            if (iArr != null) {
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    this.C0.put(i10, iArr[i10]);
                }
            }
            for (i7 = 0; i7 < T0.size(); i7++) {
                this.C0.put(T0.keyAt(i7), T0.valueAt(i7));
            }
            k10 = Q0.k(false);
            if (k10 != null) {
                k10.d(T0, this.C0);
            }
            s();
        }
        str = string;
        boolean z92 = e7Var.y0;
        this.B0 = z92;
        if (!z92) {
        }
        String[] strArr2 = new String[1];
        String str32 = Q0.d;
        if (str32 == null) {
        }
        this.C0.clear();
        iArr = k6.em;
        if (iArr != null) {
        }
        while (i7 < T0.size()) {
        }
        k10 = Q0.k(false);
        if (k10 != null) {
        }
        s();
    }
}
