package tg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import bi.w2;
import c8.ma;
import di.n4;
import hi.a5;
import hi.c7;
import hi.s6;
import hi.u5;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.ia0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class v0 extends j {
    public int A0;
    public boolean B0;
    public boolean C0;
    public final SparseIntArray D0;
    public final u0 E0;
    public u4 F0;
    public u4 G0;
    public u4 H0;
    public u4 I0;
    public u4 J0;
    public u4 K0;
    public u4 L0;
    public u4 M0;
    public final n4 r0;
    public final q0 s0;
    public final ArrayList t0;
    public final aj u0;
    public boolean v0;
    public boolean w0;
    public TextureView x0;
    public boolean y0;
    public int z0;

    public v0(Context context, PointF pointF, ArrayList arrayList, ca caVar, boolean z10, u5 u5Var) {
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
        this.C0 = m6.I.q();
        this.D0 = new SparseIntArray();
        a5 a5Var = (a5) this;
        this.E0 = new u0(a5Var);
        setRotation(0.0f);
        setScale(1.0f);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            fj fjVar = (fj) arrayList.get(i7);
            TLRPC.Message message2 = fjVar.k;
            int i10 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = c7.D(fjVar);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i11 = fjVar.K1;
                fj fjVar2 = new fj(i11, message, fjVar.C, mp.u1(i11).d, mp.u1(fjVar.K1).b, null, null, true, true, 0L, true, z10, false, 0);
                fjVar2.L5();
                this.t0.add(fjVar2);
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
            D = c7.D(fjVar);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i112 = fjVar.K1;
            fj fjVar22 = new fj(i112, message, fjVar.C, mp.u1(i112).d, mp.u1(fjVar.K1).b, null, null, true, true, 0L, true, z10, false, 0);
            fjVar22.L5();
            this.t0.add(fjVar22);
        }
        this.u0 = null;
        if (this.t0.size() > 1) {
            aj ajVar = new aj();
            this.u0 = ajVar;
            ajVar.d.addAll(this.t0);
            ajVar.a = ((fj) this.t0.get(0)).c1();
            ajVar.a();
        }
        n4 n4Var = new n4(a5Var, context);
        this.r0 = n4Var;
        addView(n4Var, ma.c(-1.0f, -1));
        q0 q0Var = new q0(a5Var, context, this.E0);
        this.s0 = q0Var;
        q0Var.setAdapter(new t0(a5Var, context, caVar, u5Var, z10));
        ia0 ia0Var = new ia0(a5Var, 2);
        ia0Var.O = new w2(a5Var, 18);
        q0Var.setLayoutManager(ia0Var);
        q0Var.i(new fi.k(16));
        n4Var.addView(q0Var, ma.c(-1.0f, -1));
        if (u5Var != null && u5Var.g) {
            s6 s6Var = new s6(a5Var, 28);
            org.telegram.ui.web.b bVar2 = new org.telegram.ui.web.b(a5Var, 1);
            u5Var.b = s6Var;
            u5Var.c = bVar2;
            TextureView textureView = u5Var.a;
            if (textureView != null) {
                s6Var.a(textureView);
            }
            if (u5Var.d && (bVar = u5Var.c) != null) {
                bVar.a(Integer.valueOf(u5Var.e), Integer.valueOf(u5Var.f));
            }
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.Cells.r1 getCell() {
        q0 q0Var = this.s0;
        if (q0Var == null) {
            return null;
        }
        for (int i7 = 0; i7 < q0Var.getChildCount(); i7++) {
            if (q0Var.getChildAt(i7) instanceof org.telegram.ui.Cells.r1) {
                return (org.telegram.ui.Cells.r1) q0Var.getChildAt(i7);
            }
        }
        return null;
    }

    @Override // tg.j
    public final i a() {
        return new k0(this, getContext());
    }

    @Override // tg.j
    public float getBounceScale() {
        return 0.02f;
    }

    @Override // tg.j
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new aj0();
        }
        float scaleX = viewGroup.getScaleX();
        return new aj0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - org.telegram.messenger.g0.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + org.telegram.messenger.g0.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + org.telegram.messenger.g0.L(71.0f));
    }

    @Override // tg.j
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.w0) {
            s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (((org.telegram.messenger.fj) r0.get(0)).U == 1) goto L12;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        n4 n4Var = this.r0;
        n4Var.measure(i7, i10);
        setMeasuredDimension(n4Var.getMeasuredWidth(), n4Var.getMeasuredHeight());
        k();
        if (this.B0) {
            ArrayList arrayList = this.t0;
            if (arrayList != null) {
                z10 = true;
                if (arrayList.size() == 1) {
                }
            }
            z10 = false;
            float min = Math.min((View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(z10 ? 0.0f : 44.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(z10 ? 0.0f : 192.0f)) / getMeasuredHeight());
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
        float y10;
        float f10;
        float f11;
        float f12;
        float f13 = 2.1474836E9f;
        float f14 = -2.1474836E9f;
        int i7 = 0;
        float f15 = 2.1474836E9f;
        float f16 = -2.1474836E9f;
        while (true) {
            q0 q0Var = this.s0;
            if (i7 >= q0Var.getChildCount()) {
                rectF.set(f13, f15, f16, f14);
                return org.telegram.messenger.g0.L(bz.Y0);
            }
            View childAt = q0Var.getChildAt(i7);
            boolean z10 = childAt instanceof org.telegram.ui.Cells.r1;
            n4 n4Var = this.r0;
            if (z10) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                if (r1Var.getMessageObject() == null || !r1Var.getMessageObject().h4() || r1Var.getPhotoImage() == null) {
                    float x10 = childAt.getX() + n4Var.getX() + r1Var.getBackgroundDrawableLeft() + org.telegram.messenger.g0.L(1.0f);
                    if (this.u0 == null) {
                        x10 += org.telegram.messenger.g0.L(8.0f);
                    }
                    float x11 = ((childAt.getX() + n4Var.getX()) + r1Var.getBackgroundDrawableRight()) - org.telegram.messenger.g0.L(1.66f);
                    float L = org.telegram.messenger.g0.L(2.0f) + childAt.getY() + n4Var.getY() + r1Var.getBackgroundDrawableTop();
                    y10 = ((childAt.getY() + n4Var.getY()) + r1Var.getBackgroundDrawableBottom()) - org.telegram.messenger.g0.L(1.0f);
                    f10 = x10;
                    f11 = x11;
                    f12 = L;
                } else {
                    f10 = r1Var.getX() + n4Var.getX() + r1Var.getPhotoImage().L0;
                    f11 = r1Var.getPhotoImage().y() + r1Var.getX() + n4Var.getX();
                    f12 = r1Var.getY() + n4Var.getY() + r1Var.getPhotoImage().M0;
                    y10 = r1Var.getPhotoImage().A() + r1Var.getY() + n4Var.getY();
                }
                f13 = Math.min(Math.min(f13, f10), f11);
                f16 = Math.max(Math.max(f16, f10), f11);
                f15 = Math.min(Math.min(f15, f12), y10);
                f14 = Math.max(Math.max(f14, f12), y10);
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                if (v0Var.S()) {
                    float x12 = v0Var.getX() + n4Var.getX() + v0Var.getBoundsLeft();
                    float x13 = v0Var.getX() + n4Var.getX() + v0Var.getBoundsRight();
                    float y11 = v0Var.getY() + n4Var.getY();
                    float y12 = v0Var.getY() + n4Var.getY() + v0Var.getMeasuredHeight();
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
        q0 q0Var = this.s0;
        q0Var.invalidate();
        for (int i7 = 0; i7 < q0Var.getChildCount(); i7++) {
            q0Var.getChildAt(i7).invalidate();
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
    public void setupTheme(c7 c7Var) {
        SparseIntArray T0;
        int[] iArr;
        int i7;
        j6 k10;
        if (c7Var == null) {
            this.D0.clear();
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (m6.Q0(string) == null || m6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (m6.Q0(string2) == null || !m6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        l6 l6Var = m6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (l6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            boolean z10 = c7Var.y0;
            this.C0 = z10;
            l6 Q0 = !z10 ? m6.Q0(str2) : m6.Q0(str);
            String[] strArr = new String[1];
            String str3 = Q0.d;
            T0 = str3 == null ? m6.T0(null, str3, strArr) : m6.T0(new File(Q0.b), null, strArr);
            this.D0.clear();
            iArr = m6.hm;
            if (iArr != null) {
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    this.D0.put(i10, iArr[i10]);
                }
            }
            for (i7 = 0; i7 < T0.size(); i7++) {
                this.D0.put(T0.keyAt(i7), T0.valueAt(i7));
            }
            k10 = Q0.k(false);
            if (k10 != null) {
                k10.d(T0, this.D0);
            }
            s();
        }
        str = string;
        boolean z102 = c7Var.y0;
        this.C0 = z102;
        if (!z102) {
        }
        String[] strArr2 = new String[1];
        String str32 = Q0.d;
        if (str32 == null) {
        }
        this.D0.clear();
        iArr = m6.hm;
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
