// default package

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wc2 {
    public final rc2 a;
    public gd0 b;
    public uib c;
    public int d;
    public Drawable e;

    public wc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public final void a(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        StaticLayout staticLayout;
        rc2 rc2Var = this.a;
        boolean I4 = rc2Var.Q5.I4();
        k47 k47Var = rc2Var.Q5;
        if (k47Var.k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            drawable = k47Var.O3() ? cmb.N4 : cmb.O4;
            if (this.e == null) {
                this.e = rc2Var.getContext().getResources().getDrawable(rc2Var.Q5.I4() ? R.drawable.filled_video_group : R.drawable.filled_calls_users).mutate();
            }
            int v0 = cmb.v0(rc2Var.Q5.O3() ? cmb.Lb : cmb.td, rc2Var.cc);
            if (this.d != v0) {
                Drawable drawable3 = this.e;
                this.d = v0;
                drawable3.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (k47Var.O3()) {
            drawable = cmb.N4;
            if (rc2Var.Q5.I4()) {
                rc2Var.A2();
                drawable2 = rc2Var.b2("drawableMsgOutCallVideo");
            } else {
                drawable2 = rc2Var.b2(rc2Var.A2() ? "drawableMsgOutCallAudioSelected" : "drawableMsgOutCallAudio");
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = rc2Var.Q5.k.action.reason;
            drawable = ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) ? cmb.O4 : cmb.P4;
            drawable2 = rc2Var.A2() ? cmb.G4[I4 ? 1 : 0] : cmb.F4[I4 ? 1 : 0];
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (rc2Var.Q5.O3()) {
            cmb.N2.setColor(cmb.v0(cmb.Vc, rc2Var.cc));
            cmb.R2.setColor(cmb.v0(rc2Var.A2() ? cmb.dc : cmb.ic, rc2Var.cc));
        } else {
            cmb.N2.setColor(cmb.v0(cmb.Uc, rc2Var.cc));
            cmb.R2.setColor(cmb.v0(rc2Var.A2() ? cmb.ee : cmb.de, rc2Var.cc));
        }
        rc2Var.S9 = true;
        int L = rc2Var.Q5.O3() ? gm.L(16.0f) + (rc2Var.d7 - rc2Var.b7) : rc2Var.b3() ? gm.L(74.0f) : gm.L(25.0f);
        rc2Var.S3 = L;
        if (jb6.a0) {
            L = hg9.v(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i = L;
        if (rc2Var.o2 != null) {
            canvas.save();
            canvas.translate(i, gm.L(12.0f) + rc2Var.gb);
            rc2Var.o2.draw(canvas);
            canvas.restore();
        }
        if (rc2Var.e3 != null) {
            canvas.save();
            canvas.translate(gm.L(jb6.a0 ? -19.0f : 19.0f) + i, gm.L(37.0f) + rc2Var.gb);
            rc2Var.e3.draw(canvas);
            canvas.restore();
        }
        if (this.c != null && this.b != null) {
            canvas.save();
            canvas.translate(gm.L(6.0f) + gm.L(jb6.a0 ? -19.0f : 19.0f) + i + rc2Var.f3, gm.L(36.0f) + rc2Var.gb);
            this.b.g(canvas);
            canvas.translate(this.b.A + gm.L(5.0f), gm.L(8.0f));
            this.c.c(0.0f, 0.0f, 1.0f, cmb.R2.getColor(), canvas);
            canvas.restore();
        }
        hg0.s((i + ((!jb6.a0 || (staticLayout = rc2Var.e3) == null) ? 0 : staticLayout.getWidth() - drawable4.getIntrinsicWidth())) - gm.L(1.0f), gm.L(37.0f) + rc2Var.gb, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = rc2Var.J2[0];
        if (drawable6 != null && rc2Var.L2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z = rc2Var.G;
        boolean z2 = rc2Var.F;
        if (z) {
            if (z2) {
                rc2Var.T3 = gm.L(18.0f);
            } else {
                rc2Var.T3 = gm.L(19.0f);
            }
        } else if (z2) {
            rc2Var.T3 = gm.L(17.0f);
        } else {
            rc2Var.T3 = gm.L(18.5f);
        }
        hg0.s(gm.L(!I4 ? 1 : 0) + rc2Var.S3 + (jb6.a0 ? 0 : rc2Var.b7 - gm.L(70.0f)), rc2Var.T3, drawable5);
        drawable5.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(k47 k47Var, boolean z) {
        int min;
        float f;
        float f2;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        ArrayList<TLRPC.Peer> arrayList;
        uib uibVar;
        float f3;
        rc2 rc2Var = this.a;
        int i2 = rc2Var.a6;
        l39 l39Var = rc2Var.O;
        rc2Var.A0(0);
        rc2Var.v9 = false;
        rc2Var.E9 = false;
        rc2Var.O1 = false;
        int i3 = 52;
        if (gm.O1()) {
            int P0 = gm.P0();
            if (rc2Var.X6) {
                i3 = 71;
            } else if (!z) {
                i3 = 0;
            }
            min = Math.min(P0 - gm.L(i3 + 50), gm.L(270.0f));
            rc2Var.b7 = min;
        } else {
            int parentWidth = rc2Var.getParentWidth();
            if (rc2Var.X6) {
                i3 = 71;
            } else if (!z) {
                i3 = 0;
            }
            min = Math.min(parentWidth - gm.L(i3 + 50), gm.L(270.0f));
            rc2Var.b7 = min;
        }
        rc2Var.V6 = min - gm.L(31.0f);
        int maxNameWidth = rc2Var.getMaxNameWidth() - gm.L(50.0f);
        if (maxNameWidth < 0) {
            maxNameWidth = gm.L(10.0f);
        }
        String format = jb6.D0().o0().format(k47Var.k.date * 1000);
        TLRPC.MessageAction messageAction = k47Var.k.action;
        if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
            TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
            z4 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed;
            z3 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy;
            f = 31.0f;
            z2 = tL_messageActionPhoneCall.video;
            i = tL_messageActionPhoneCall.duration;
            f2 = 50.0f;
        } else {
            f = 31.0f;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                z4 = tL_messageActionConferenceCall.missed;
                z3 = !tL_messageActionConferenceCall.active;
                boolean z5 = tL_messageActionConferenceCall.video;
                f2 = 50.0f;
                int i4 = tL_messageActionConferenceCall.duration;
                arrayList = tL_messageActionConferenceCall.other_participants;
                z2 = z5;
                i = i4;
                String M0 = !(messageAction instanceof TLRPC.TL_messageActionConferenceCall) ? k47Var.O3() ? jb6.M0(2131751763, null) : z4 ? jb6.M0(2131751767, null) : jb6.M0(2131751768, null) : k47Var.O3() ? z4 ? z2 ? jb6.M0(2131752561, null) : jb6.M0(2131752568, null) : z2 ? jb6.M0(2131752562, null) : jb6.M0(2131752569, null) : z4 ? z2 ? jb6.M0(2131752563, null) : jb6.M0(2131752570, null) : z3 ? z2 ? jb6.M0(2131752564, null) : jb6.M0(2131752571, null) : z2 ? jb6.M0(2131752566, null) : jb6.M0(2131752573, null);
                if (i > 0) {
                    format = format + ", " + jb6.o(i);
                }
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(M0, cmb.N2, maxNameWidth, truncateAt);
                TextPaint textPaint = cmb.N2;
                int L = gm.L(2.0f) + maxNameWidth;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                rc2Var.o2 = new StaticLayout(ellipsize, textPaint, L, alignment, 1.0f, 0.0f, false);
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(format, cmb.R2, maxNameWidth - gm.L(19.0f), truncateAt), cmb.R2, gm.L(2.0f) + maxNameWidth, alignment, 1.0f, 0.0f, false);
                rc2Var.e3 = staticLayout;
                rc2Var.f3 = (int) staticLayout.getLineWidth(0);
                if (arrayList != null || arrayList.size() <= 0) {
                    this.c = null;
                    uibVar = null;
                } else {
                    if (this.b == null) {
                        gd0 gd0Var = new gd0(rc2Var, false);
                        this.b = gd0Var;
                        gd0Var.s = gm.L(14.0f);
                        this.b.h(gm.L(18.0f));
                        this.b.p = gm.L(f2);
                        this.b.o = gm.L(16.0f);
                        if (rc2Var.O0) {
                            this.b.e();
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.add(Long.valueOf(k47.B0(rc2Var.Q5.k)));
                    if (rc2Var.Q5.O3()) {
                        hashSet.add(Long.valueOf(z8c.h(i2).e()));
                    }
                    for (int i5 = 0; i5 < Math.min(3, arrayList.size()); i5++) {
                        hashSet.add(Long.valueOf(pg3.n(arrayList.get(i5))));
                    }
                    int min2 = Math.min(3, hashSet.size());
                    this.b.i(min2);
                    Iterator it = hashSet.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        this.b.j(i6, i2, oc7.r1(i2).a2(((Long) it.next()).longValue()));
                        i6++;
                        if (i6 >= min2) {
                            break;
                        }
                    }
                    this.b.a(false, true);
                    uib uibVar2 = new uib(jb6.H(',', "ConferenceCallOther", hashSet.size()), 13.0f, null);
                    this.c = uibVar2;
                    uibVar = uibVar2;
                }
                f3 = rc2Var.f3 + (uibVar != null ? 0.0f : uibVar.c);
                if (f3 > maxNameWidth - gm.L(49.0f)) {
                    int L2 = rc2Var.b7 + ((int) (f3 - (maxNameWidth - gm.L(49.0f))));
                    rc2Var.b7 = L2;
                    rc2Var.V6 = L2 - gm.L(f);
                }
                rc2Var.setMessageObjectInternal(k47Var);
                int L3 = gm.L(65.0f);
                int i7 = rc2Var.gb;
                rc2Var.v0 = L3 + i7;
                if (rc2Var.J) {
                    rc2Var.gb = i7 - gm.L(1.0f);
                }
                l39Var.getClass();
                if (l39Var.p) {
                    l39Var.o(rc2Var.b7 - gm.L(32.0f), 3);
                    l39Var.n = l39Var.m;
                    if ((rc2Var.b7 - gm.L(32.0f)) - l39Var.r < f3) {
                        l39Var.n = gm.L(12.0f) + l39Var.n;
                        l39Var.k += -gm.L(12.0f);
                    }
                    rc2Var.v0 = gm.L(6.0f) + l39Var.n + rc2Var.v0;
                    return;
                }
                return;
            }
            f2 = 50.0f;
            z2 = false;
            i = 0;
            z3 = false;
            z4 = false;
        }
        arrayList = null;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
        }
        if (i > 0) {
        }
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        CharSequence ellipsize2 = TextUtils.ellipsize(M0, cmb.N2, maxNameWidth, truncateAt2);
        TextPaint textPaint2 = cmb.N2;
        int L4 = gm.L(2.0f) + maxNameWidth;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        rc2Var.o2 = new StaticLayout(ellipsize2, textPaint2, L4, alignment2, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(format, cmb.R2, maxNameWidth - gm.L(19.0f), truncateAt2), cmb.R2, gm.L(2.0f) + maxNameWidth, alignment2, 1.0f, 0.0f, false);
        rc2Var.e3 = staticLayout2;
        rc2Var.f3 = (int) staticLayout2.getLineWidth(0);
        if (arrayList != null) {
        }
        this.c = null;
        uibVar = null;
        f3 = rc2Var.f3 + (uibVar != null ? 0.0f : uibVar.c);
        if (f3 > maxNameWidth - gm.L(49.0f)) {
        }
        rc2Var.setMessageObjectInternal(k47Var);
        int L32 = gm.L(65.0f);
        int i72 = rc2Var.gb;
        rc2Var.v0 = L32 + i72;
        if (rc2Var.J) {
        }
        l39Var.getClass();
        if (l39Var.p) {
        }
    }
}
