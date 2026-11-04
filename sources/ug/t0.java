package ug;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import b8.mf;
import gi.c5;
import gi.f7;
import gi.j8;
import gi.x5;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.hp;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class t0 extends j {
    public int A0;
    public boolean B0;
    public boolean C0;
    public final SparseIntArray D0;
    public final s0 E0;
    public t4 F0;
    public t4 G0;
    public t4 H0;
    public t4 I0;
    public t4 J0;
    public t4 K0;
    public t4 L0;
    public t4 M0;
    public final ci.t4 r0;
    public final o0 s0;
    public final ArrayList t0;
    public final ui u0;
    public boolean v0;
    public boolean w0;
    public TextureView x0;
    public boolean y0;
    public int z0;

    public t0(Context context, PointF pointF, ArrayList arrayList, x9 x9Var, boolean z10, x5 x5Var) {
        super(context, pointF);
        org.telegram.ui.web.b bVar;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.t0 = new ArrayList();
        this.z0 = 1;
        this.A0 = 1;
        this.B0 = true;
        this.C0 = k6.I.q();
        this.D0 = new SparseIntArray();
        c5 c5Var = (c5) this;
        this.E0 = new s0(c5Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            zi ziVar = (zi) arrayList.get(i3);
            TLRPC.Message message2 = ziVar.k;
            int i10 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = f7.D(ziVar);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i11 = ziVar.I1;
                zi ziVar2 = new zi(i11, message, ziVar.C, hp.s1(i11).d, hp.s1(ziVar.I1).b, null, null, true, true, 0L, true, z10, false, 0);
                ziVar2.M5();
                this.t0.add(ziVar2);
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
            D = f7.D(ziVar);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i112 = ziVar.I1;
            zi ziVar22 = new zi(i112, message, ziVar.C, hp.s1(i112).d, hp.s1(ziVar.I1).b, null, null, true, true, 0L, true, z10, false, 0);
            ziVar22.M5();
            this.t0.add(ziVar22);
        }
        this.u0 = null;
        if (this.t0.size() > 1) {
            ui uiVar = new ui();
            this.u0 = uiVar;
            uiVar.d.addAll(this.t0);
            uiVar.a = ((zi) this.t0.get(0)).d1();
            uiVar.a();
        }
        ci.t4 t4Var = new ci.t4(c5Var, context);
        this.r0 = t4Var;
        addView(t4Var, mf.c(-1.0f, -1));
        o0 o0Var = new o0(c5Var, context, this.E0);
        this.s0 = o0Var;
        o0Var.setAdapter(new r0(c5Var, context, x9Var, x5Var, z10));
        p90 p90Var = new p90(c5Var, 2);
        p90Var.O = new ai.g2(c5Var, 18);
        o0Var.setLayoutManager(p90Var);
        o0Var.i(new ei.l(16));
        t4Var.addView(o0Var, mf.c(-1.0f, -1));
        if (x5Var != null && x5Var.g) {
            j8 j8Var = new j8(c5Var, 25);
            org.telegram.ui.web.b bVar2 = new org.telegram.ui.web.b(c5Var, 1);
            x5Var.b = j8Var;
            x5Var.c = bVar2;
            TextureView textureView = x5Var.a;
            if (textureView != null) {
                j8Var.a(textureView);
            }
            if (x5Var.d && (bVar = x5Var.c) != null) {
                bVar.a(Integer.valueOf(x5Var.e), Integer.valueOf(x5Var.f));
            }
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.Cells.q1 getCell() {
        o0 o0Var = this.s0;
        if (o0Var == null) {
            return null;
        }
        for (int i3 = 0; i3 < o0Var.getChildCount(); i3++) {
            if (o0Var.getChildAt(i3) instanceof org.telegram.ui.Cells.q1) {
                return (org.telegram.ui.Cells.q1) o0Var.getChildAt(i3);
            }
        }
        return null;
    }

    @Override // ug.j
    public final i a() {
        return new i0(this, getContext());
    }

    @Override // ug.j
    public float getBounceScale() {
        return 0.02f;
    }

    @Override // ug.j
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ni0();
        }
        float scaleX = viewGroup.getScaleX();
        return new ni0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + org.telegram.messenger.g0.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + org.telegram.messenger.g0.L(71.0f));
    }

    @Override // ug.j
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.w0) {
            s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (((org.telegram.messenger.zi) r0.get(0)).U == 1) goto L12;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        ci.t4 t4Var = this.r0;
        t4Var.measure(i3, i10);
        setMeasuredDimension(t4Var.getMeasuredWidth(), t4Var.getMeasuredHeight());
        k();
        if (this.B0) {
            ArrayList arrayList = this.t0;
            if (arrayList != null) {
                z10 = true;
                if (arrayList.size() == 1) {
                }
            }
            z10 = false;
            float min = Math.min((View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(z10 ? 0.0f : 44.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(z10 ? 0.0f : 192.0f)) / getMeasuredHeight());
            if (min < 1.0f) {
                setScale(min);
            }
            PointF position = getPosition();
            if (!z10) {
                position.x -= Math.min(1.0f, min) * org.telegram.messenger.g0.L(19.0f);
            }
            setPosition(position);
            this.B0 = false;
        }
    }

    public final float r(RectF rectF) {
        float y9;
        float f10;
        float f11;
        float f12;
        float f13 = 2.14748365E9f;
        float f14 = -2.14748365E9f;
        int i3 = 0;
        float f15 = 2.14748365E9f;
        float f16 = -2.14748365E9f;
        while (true) {
            o0 o0Var = this.s0;
            if (i3 >= o0Var.getChildCount()) {
                rectF.set(f13, f15, f16, f14);
                return org.telegram.messenger.g0.L(az.Y0);
            }
            View childAt = o0Var.getChildAt(i3);
            boolean z10 = childAt instanceof org.telegram.ui.Cells.q1;
            ci.t4 t4Var = this.r0;
            if (z10) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == null || !q1Var.getMessageObject().i4() || q1Var.getPhotoImage() == null) {
                    float x10 = childAt.getX() + t4Var.getX() + q1Var.getBackgroundDrawableLeft() + org.telegram.messenger.g0.L(1.0f);
                    if (this.u0 == null) {
                        x10 += org.telegram.messenger.g0.L(8.0f);
                    }
                    float x11 = ((childAt.getX() + t4Var.getX()) + q1Var.getBackgroundDrawableRight()) - org.telegram.messenger.g0.L(1.66f);
                    float L = org.telegram.messenger.g0.L(2.0f) + childAt.getY() + t4Var.getY() + q1Var.getBackgroundDrawableTop();
                    y9 = ((childAt.getY() + t4Var.getY()) + q1Var.getBackgroundDrawableBottom()) - org.telegram.messenger.g0.L(1.0f);
                    f10 = x10;
                    f11 = x11;
                    f12 = L;
                } else {
                    f10 = q1Var.getX() + t4Var.getX() + q1Var.getPhotoImage().L0;
                    f11 = q1Var.getPhotoImage().y() + q1Var.getX() + t4Var.getX();
                    f12 = q1Var.getY() + t4Var.getY() + q1Var.getPhotoImage().M0;
                    y9 = q1Var.getPhotoImage().A() + q1Var.getY() + t4Var.getY();
                }
                f13 = Math.min(Math.min(f13, f10), f11);
                f16 = Math.max(Math.max(f16, f10), f11);
                f15 = Math.min(Math.min(f15, f12), y9);
                f14 = Math.max(Math.max(f14, f12), y9);
            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                if (t0Var.R()) {
                    float x12 = t0Var.getX() + t4Var.getX() + t0Var.getBoundsLeft();
                    float x13 = t0Var.getX() + t4Var.getX() + t0Var.getBoundsRight();
                    float y10 = t0Var.getY() + t4Var.getY();
                    float y11 = t0Var.getY() + t4Var.getY() + t0Var.getMeasuredHeight();
                    f13 = Math.min(Math.min(f13, x12), x13);
                    f16 = Math.max(Math.max(f16, x12), x13);
                    f15 = Math.min(Math.min(f15, y10), y11);
                    f14 = Math.max(Math.max(f14, y10), y11);
                }
            }
            i3++;
        }
    }

    public final void s() {
        o0 o0Var = this.s0;
        o0Var.invalidate();
        for (int i3 = 0; i3 < o0Var.getChildCount(); i3++) {
            o0Var.getChildAt(i3).invalidate();
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
    public void setupTheme(f7 f7Var) {
        SparseIntArray T0;
        int[] iArr;
        int i3;
        g6 k10;
        if (f7Var == null) {
            this.D0.clear();
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
            boolean z10 = f7Var.y0;
            this.C0 = z10;
            j6 Q0 = !z10 ? k6.Q0(str2) : k6.Q0(str);
            String[] strArr = new String[1];
            String str3 = Q0.d;
            T0 = str3 == null ? k6.T0(null, str3, strArr) : k6.T0(new File(Q0.b), null, strArr);
            this.D0.clear();
            iArr = k6.em;
            if (iArr != null) {
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    this.D0.put(i10, iArr[i10]);
                }
            }
            for (i3 = 0; i3 < T0.size(); i3++) {
                this.D0.put(T0.keyAt(i3), T0.valueAt(i3));
            }
            k10 = Q0.k(false);
            if (k10 != null) {
                k10.d(T0, this.D0);
            }
            s();
        }
        str = string;
        boolean z102 = f7Var.y0;
        this.C0 = z102;
        if (!z102) {
        }
        String[] strArr2 = new String[1];
        String str32 = Q0.d;
        if (str32 == null) {
        }
        this.D0.clear();
        iArr = k6.em;
        if (iArr != null) {
        }
        while (i3 < T0.size()) {
        }
        k10 = Q0.k(false);
        if (k10 != null) {
        }
        s();
    }
}
