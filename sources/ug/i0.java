package ug;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e3;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.an;
import org.telegram.ui.j40;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i0 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final wg.b c;
    public LinearLayout d;
    public final /* synthetic */ j0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0539, code lost:
    
        if (r10.isEmpty() != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0555, code lost:
    
        r0 = r44.z2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x055d, code lost:
    
        if (r0.isEmpty() == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x055f, code lost:
    
        r0 = r44.y2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0568, code lost:
    
        r3 = new org.telegram.ui.Components.w8(r45, false);
        r3.a.q = org.telegram.messenger.g0.L(3.33f);
        r3.setSize(org.telegram.messenger.g0.L(72.0f));
        r3.setStepFactor(0.4f);
        r4 = java.lang.Math.min(r0.size(), 3);
        r3.setCount(r4);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0595, code lost:
    
        if (r5 >= r4) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0597, code lost:
    
        r6 = (java.lang.Long) r0.get(r5);
        r6.getClass();
        r3.b(r5, r44.a, org.telegram.messenger.np.s1(r44.a).a2(r6));
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05b2, code lost:
    
        r3.a(false);
        addView(r3, c8.ja.t(((r4 - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
        r4 = new android.widget.TextView(r45);
        r4.setGravity(17);
        org.telegram.messenger.i20.o(r4, r26, 20.0f);
        r5 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(r4, r5, r44.J0);
        r4.setText(org.telegram.messenger.hd.L0(2131749128));
        addView(r4, c8.ja.t(-1, -2, 1, 32, 0, 32, 9));
        r4 = new android.widget.TextView(r45);
        r4.setGravity(17);
        r4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(r4, r5, r44.J0);
        addView(r4, c8.ja.t(-1, -2, 1, 32, 0, 32, 19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0624, code lost:
    
        if (r13 != 34) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0626, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0629, code lost:
    
        r9 = r44.y2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x062d, code lost:
    
        if (r9 == null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x062f, code lost:
    
        r9 = r44.y2;
        r9 = r9.size();
        r10 = r44.z2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x063f, code lost:
    
        if (r9 < r10.size()) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0641, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0649, code lost:
    
        if (r0.size() != 1) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x064b, code lost:
    
        if (r6 == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x064d, code lost:
    
        r3 = 2131749167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x065a, code lost:
    
        r0 = org.telegram.messenger.hd.Z(r3, org.telegram.messenger.q10.k(org.telegram.messenger.np.s1(r44.a).a2((java.lang.Long) r0.get(0))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x07b4, code lost:
    
        r4.setText(org.telegram.messenger.g0.X2(r0));
        r0 = r44.z2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x07bf, code lost:
    
        if (r0 != null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x07c1, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x07cb, code lost:
    
        r3 = r44.y2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x07cf, code lost:
    
        if (r3 != null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x07d1, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x07dd, code lost:
    
        if ((r0 - r3) <= 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x07e0, code lost:
    
        if (r0 != 1) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x07e2, code lost:
    
        if (r3 == 1) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x07e6, code lost:
    
        if (r44.U1 == false) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x07e8, code lost:
    
        r9 = 0;
        r0 = new ug.q0(r45, r44.J0, false);
        c8.na.b(r0, 0.02f, 1.2f);
        r0.b(org.telegram.messenger.hd.L0(2131749130), new ug.g0(r43, r9), false);
        addView(r0, c8.ja.k((r44.u0 / org.telegram.messenger.g0.p) + 4.0f, 0.0f, (r44.u0 / org.telegram.messenger.g0.p) + 4.0f, 18.0f, -1, 48));
        r0 = new gi.j(r43, r45);
        r0.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(r0, org.telegram.ui.ActionBar.j6.z6, r44.J0);
        r0.setText(" " + org.telegram.messenger.hd.L0(2131749131) + " ");
        r0.setTextSize(14.0f);
        addView(r0, c8.ja.t(org.telegram.messenger.ns.U2, -2, 1, 12, 0, 12, 20));
        r0 = new android.widget.TextView(r45);
        r0.setGravity(17);
        r0.setTypeface(org.telegram.messenger.g0.o());
        r0.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.q6.U(r0, r5, r44.J0);
        r0.setText(org.telegram.messenger.hd.L0(2131749171));
        addView(r0, c8.ja.t(-1, -2, 1, 32, 0, 32, 9));
        r0 = new android.widget.TextView(r45);
        r0.setGravity(17);
        r0.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(r0, r5, r44.J0);
        r2 = r44.z2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x08ba, code lost:
    
        if (r2.size() > 1) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x08bc, code lost:
    
        r0.setText(org.telegram.messenger.hd.L0(2131749172));
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x08d1, code lost:
    
        addView(r0, c8.ja.t(-1, -2, 1, 32, 0, 32, 19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x08f4, code lost:
    
        r44.F1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x08f7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x08c7, code lost:
    
        r0.setText(org.telegram.messenger.hd.L0(2131749173));
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x08e3, code lost:
    
        ((android.view.ViewGroup.MarginLayoutParams) r4.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
        r44.f2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x07d3, code lost:
    
        r3 = r44.y2;
        r3 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x07c3, code lost:
    
        r0 = r44.z2;
        r0 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0651, code lost:
    
        if (r9 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0653, code lost:
    
        r3 = 2131749137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0657, code lost:
    
        r3 = 2131749132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x067f, code lost:
    
        if (r0.size() != 2) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0681, code lost:
    
        if (r6 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0683, code lost:
    
        r3 = 2131749165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0690, code lost:
    
        r0 = org.telegram.messenger.hd.Z(r3, org.telegram.messenger.q10.k(org.telegram.messenger.np.s1(r44.a).a2((java.lang.Long) r0.get(0))), org.telegram.messenger.q10.k(org.telegram.messenger.np.s1(r44.a).a2((java.lang.Long) r0.get(1))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0687, code lost:
    
        if (r9 == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0689, code lost:
    
        r3 = 2131749135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x068d, code lost:
    
        r3 = 2131749127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06cc, code lost:
    
        if (r0.size() != 3) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06ce, code lost:
    
        if (r6 == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06d0, code lost:
    
        r3 = 2131749166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06dd, code lost:
    
        r0 = org.telegram.messenger.hd.Z(r3, org.telegram.messenger.q10.k(org.telegram.messenger.np.s1(r44.a).a2((java.lang.Long) r0.get(0))), org.telegram.messenger.q10.k(org.telegram.messenger.np.s1(r44.a).a2((java.lang.Long) r0.get(1))), org.telegram.messenger.q10.k(org.telegram.messenger.np.s1(r44.a).a2((java.lang.Long) r0.get(2))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06d4, code lost:
    
        if (r9 == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06d6, code lost:
    
        r3 = 2131749136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06da, code lost:
    
        r3 = 2131749129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x072f, code lost:
    
        if (r6 == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0731, code lost:
    
        r6 = "InviteCallMessagePremiumBlockedMany";
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x073b, code lost:
    
        r6 = org.telegram.messenger.hd.G(r0.size() - 2, r6, org.telegram.messenger.q10.k(org.telegram.messenger.np.s1(r44.a).a2((java.lang.Long) r0.get(0))), org.telegram.messenger.q10.k(org.telegram.messenger.np.s1(r44.a).a2((java.lang.Long) r0.get(1))));
        r0 = r0.size() - 2;
        r9 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, r44.J0);
        r3.b = new ug.z0(org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, -1, -1, null);
        r3.c = new org.telegram.ui.Components.oy0(i5.c.i(r0, "+"), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        r0 = new android.graphics.Paint(1);
        r3.d = r0;
        r0.setColor(r9);
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0734, code lost:
    
        if (r9 == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0736, code lost:
    
        r6 = "InviteMessagePremiumBlockedMany";
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0739, code lost:
    
        r6 = "InvitePremiumBlockedMany";
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0643, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0628, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0564, code lost:
    
        r0 = r44.z2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0553, code lost:
    
        if (r10 >= r32.size()) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0dae  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0e06  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0dec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a3e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0456  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(j0 j0Var, Context context) {
        super(context);
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String G;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        String str2;
        boolean z10;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        ArrayList arrayList18;
        ArrayList arrayList19;
        ArrayList arrayList20;
        int i7;
        int i10;
        float f10;
        ArrayList arrayList21;
        ArrayList arrayList22;
        ArrayList arrayList23;
        ArrayList arrayList24;
        int i11;
        ArrayList arrayList25;
        int i12;
        int i13;
        int i14;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        final int i15;
        boolean z11;
        int i16;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3;
        float f11;
        float f12;
        float f13;
        e2 e2Var = j0Var.s1;
        this.e = j0Var;
        setOrientation(1);
        int i17 = j0.S2;
        setPadding(org.telegram.messenger.g0.L(6.0f) + j0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + j0Var.u0, 0);
        int i18 = j0Var.d2;
        androidx.emoji2.text.q o12 = j0.o1(i18, j0Var.a);
        j0Var.I2 = o12;
        int i19 = o12.a;
        np s12 = np.s1(j0Var.a);
        boolean D3 = s12.D3();
        boolean r12 = j0Var.r1();
        if (i18 == 31) {
            str = hd.M0(r12 ? 2131753602 : 2131753601, null);
        } else if (i18 == 32) {
            str = j0Var.l1(true);
        } else if (i18 == 19) {
            org.telegram.ui.Cells.q1 q1Var = j0Var.c2;
            if (q1Var != null) {
                int i20 = q1Var.getMessageObject().k.from_boosts_applied;
                TLRPC.Chat n1 = j0Var.n1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hd.G(i20, "GroupBoostedByUserWithTimes", q10.j(j0Var.c2.getCurrentUser(), true)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) hd.a0(null, null, 2131749497, n1 == null ? "" : n1.title));
                str = spannableStringBuilder.toString();
            } else if (e2Var instanceof j40) {
                str = hd.G(wg.q.g(), "BoostingGroupBoostWhatAreBoostsDescription", new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(j0Var.l1(true));
                if (t3.N(j0Var.n1()) && r12) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) hd.M0(2131753329, null));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i18 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = j0Var.X1;
            if (tL_premium_boostsStatus4.level == 0) {
                int i21 = r12 ? 2131749421 : 2131752353;
                int i22 = tL_premium_boostsStatus4.next_level_boosts;
                str = hd.a0(null, null, i21, hd.G(i22, "MoreBoosts", Integer.valueOf(i22)));
            } else {
                int i23 = r12 ? 2131749419 : 2131752351;
                int i24 = tL_premium_boostsStatus4.next_level_boosts;
                int i25 = tL_premium_boostsStatus4.boosts;
                str = hd.a0(null, null, i23, hd.G(i24 - i25, "MoreBoosts", Integer.valueOf(i24 - i25)), hd.G(j0Var.X1.level + 1, "BoostStories", new Object[0]));
            }
        } else if (i18 == 20) {
            str = hd.a0(null, null, r12 ? 2131749418 : 2131752349, Integer.valueOf(j0Var.j1()));
        } else if (i18 == 24) {
            str = hd.a0(null, null, r12 ? 2131749414 : 2131752346, Integer.valueOf(j0Var.j1()));
        } else if (i18 == 29) {
            str = hd.a0(null, null, 2131749417, Integer.valueOf(s12.y5));
        } else if (i18 == 30) {
            str = hd.a0(null, null, 2131752343, Integer.valueOf(s12.A4));
        } else if (i18 == 35) {
            str = hd.a0(null, null, 2131752350, Integer.valueOf(s12.B4));
        } else if (i18 == 25) {
            str = hd.a0(null, null, r12 ? 2131749415 : 2131752347, Integer.valueOf(r12 ? s12.x5 : s12.t5));
        } else if (i18 == 26) {
            str = hd.a0(null, null, r12 ? 2131749410 : 2131752341, Integer.valueOf(r12 ? s12.x5 : s12.t5));
        } else if (i18 == 27) {
            str = hd.a0(null, null, r12 ? 2131749412 : 2131752344, Integer.valueOf(s12.r5));
        } else if (i18 == 28) {
            str = hd.a0(null, null, r12 ? 2131749413 : 2131752345, Integer.valueOf(r12 ? s12.w5 : s12.s5));
        } else if (i18 == 22) {
            str = hd.a0(null, null, r12 ? 2131749411 : 2131752342, Integer.valueOf(r12 ? s12.z5 : s12.u5));
        } else if (i18 == 23) {
            str = hd.a0(null, null, r12 ? 2131749416 : 2131752348, Integer.valueOf(r12 ? s12.A5 : s12.v5));
        } else if (i18 == 21) {
            int i26 = j0Var.N2;
            str = hd.G(i26, "ReactionReachLvlForReaction", Integer.valueOf(i26));
        } else if (i18 == 11) {
            if (j0Var.U1) {
                if (t3.V(j0Var.K2)) {
                    arrayList9 = j0Var.x2;
                    if (arrayList9.size() == 1) {
                        arrayList12 = j0Var.x2;
                        G = hd.Z(2131749155, g5.p((TLRPC.User) arrayList12.get(0)));
                    } else {
                        arrayList10 = j0Var.x2;
                        int size = arrayList10.size();
                        arrayList11 = j0Var.x2;
                        G = hd.G(size, "InviteChannelRestrictedUsers", Integer.valueOf(arrayList11.size()));
                    }
                } else {
                    arrayList5 = j0Var.x2;
                    if (arrayList5.size() == 1) {
                        arrayList8 = j0Var.x2;
                        G = hd.Z(2131749120, g5.p((TLRPC.User) arrayList8.get(0)));
                    } else {
                        arrayList6 = j0Var.x2;
                        int size2 = arrayList6.size();
                        arrayList7 = j0Var.x2;
                        G = hd.G(size2, "InviteRestrictedUsers", Integer.valueOf(arrayList7.size()));
                    }
                }
            } else if (t3.V(j0Var.K2)) {
                arrayList17 = j0Var.x2;
                if (arrayList17.size() == 1) {
                    arrayList20 = j0Var.x2;
                    G = hd.Z(2131749158, g5.p((TLRPC.User) arrayList20.get(0)));
                } else {
                    arrayList18 = j0Var.x2;
                    int size3 = arrayList18.size();
                    arrayList19 = j0Var.x2;
                    G = hd.G(size3, "InviteChannelRestrictedUsers2", Integer.valueOf(arrayList19.size()));
                }
            } else {
                arrayList13 = j0Var.x2;
                if (arrayList13.size() == 1) {
                    arrayList16 = j0Var.x2;
                    G = hd.Z(2131749123, g5.p((TLRPC.User) arrayList16.get(0)));
                } else {
                    arrayList14 = j0Var.x2;
                    int size4 = arrayList14.size();
                    arrayList15 = j0Var.x2;
                    G = hd.G(size4, "InviteRestrictedUsers2", Integer.valueOf(arrayList15.size()));
                }
            }
            str2 = G;
            z10 = true;
            androidx.emoji2.text.q qVar = j0Var.I2;
            int i27 = qVar.b;
            int i28 = qVar.c;
            i7 = j0Var.s2;
            if (i18 != 3) {
                i7 = np.s1(j0Var.a).Q0.size() - 1;
            } else if (i18 == 7) {
                i7 = m10.c();
            } else if (i18 == 0) {
                ArrayList W0 = np.s1(j0Var.a).W0(0);
                i10 = 1;
                int size5 = W0.size();
                int i29 = 0;
                for (int i30 = 0; i30 < size5; i30++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i30);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                        i29++;
                    }
                }
                i7 = i29;
                if (!m10.i(j0Var.a).q() || j0Var.J2) {
                    i7 = i28;
                    f10 = 1.0f;
                } else {
                    i7 = i7 < 0 ? i27 : i7;
                    if (i18 != 7) {
                        f11 = i7;
                        f12 = i28;
                    } else if (i7 > i27) {
                        f11 = i7 - i27;
                        f12 = i28 - i27;
                    } else {
                        f13 = 0.5f;
                        f10 = f13;
                    }
                    f13 = f11 / f12;
                    f10 = f13;
                }
                float f14 = i27 / i28;
                int i31 = (i18 != 18 || i18 == 20 || i18 == 24 || i18 == 25 || i18 == 26 || i18 == 29 || i18 == 22 || i18 == 23 || i18 == 19 || i18 == 30 || i18 == 35 || i18 == 21 || i18 == 27 || i18 == 28 || i18 == 32) ? i10 : 0;
                i7 = i31 != 0 ? 0 : i7;
                if ((i18 != 11 || i18 == 34) && !np.s1(j0Var.a).D3()) {
                    arrayList21 = j0Var.z2;
                    if (arrayList21 != null) {
                        arrayList25 = j0Var.z2;
                    }
                    arrayList22 = j0Var.y2;
                    if (arrayList22 != null) {
                        arrayList23 = j0Var.y2;
                        int size6 = arrayList23.size();
                        arrayList24 = j0Var.x2;
                        i11 = i7;
                    }
                }
                i11 = i7;
                if (i18 != 31 || i18 == 34) {
                    i12 = 8;
                } else {
                    i12 = 8;
                    h0 h0Var = new h0(this, context, i19, i11, i28, f14, j0Var.J0);
                    j0Var.t2 = h0Var;
                    if (i31 != 0) {
                        tL_premium_boostsStatus2 = j0Var.X1;
                        if (tL_premium_boostsStatus2 != null) {
                            h0 h0Var2 = j0Var.t2;
                            tL_premium_boostsStatus3 = j0Var.X1;
                            e3 e3Var = j0Var.Y1;
                            h0Var2.g(tL_premium_boostsStatus3, e3Var != null && e3Var.l);
                        }
                    } else {
                        h0Var.setBagePosition(f10);
                        j0Var.t2.setType(i18);
                        j0Var.t2.x.setVisibility(8);
                        if (z10) {
                            h0 h0Var3 = j0Var.t2;
                            h0Var3.J.setVisibility(8);
                            r rVar = h0Var3.e;
                            if (rVar != null) {
                                rVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(3.0f));
                            }
                            h0Var3.K = true;
                        } else if (m10.i(j0Var.a).q() || j0Var.J2) {
                            j0Var.t2.w.setVisibility(8);
                            if (i18 == 6) {
                                j0Var.t2.x.setText("2 GB");
                            } else {
                                j0Var.t2.x.setText(Integer.toString(i27));
                            }
                            z11 = false;
                            j0Var.t2.x.setVisibility(0);
                            i16 = 2;
                            if (i18 != i16 || i18 == 5) {
                                j0Var.t2.I = z11;
                            }
                            addView(j0Var.t2, ja.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                    }
                    i16 = 2;
                    z11 = false;
                    if (i18 != i16) {
                    }
                    j0Var.t2.I = z11;
                    addView(j0Var.t2, ja.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
                if (i18 == 31) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f0.d.d(getContext(), R.drawable.large_boosts));
                    frameLayout.addView(imageView, ja.e(-2, -2, 17));
                    int L = org.telegram.messenger.g0.L(79.0f);
                    int i32 = j6.Fi;
                    ShapeDrawable L2 = j6.L(L, j6.v0(i32));
                    m6 M = q6.M(i32);
                    frameLayout.setBackground(L2);
                    q6.j(frameLayout, L2, M, null, null);
                    addView(frameLayout, ja.t(79, 79, 1, 0, 23, 0, 0));
                }
                TextView textView = new TextView(context);
                this.a = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                if (i18 == 31) {
                    this.a.setText(hd.L0(2131753600));
                } else if (i18 == 32) {
                    this.a.setText(j0Var.m1());
                } else if (i18 == 19) {
                    if (e2Var instanceof j40) {
                        this.a.setText(hd.L0(2131753353));
                    } else {
                        this.a.setText(j0Var.m1());
                    }
                } else if (i18 == 30) {
                    this.a.setText(j0Var.m1());
                } else if (i18 == 35) {
                    this.a.setText(hd.L0(2131743875));
                } else {
                    i13 = 18;
                    if (i18 == 18) {
                        tL_premium_boostsStatus = j0Var.X1;
                        if (tL_premium_boostsStatus.level == 0) {
                            this.a.setText(hd.L0(2131753529));
                        } else {
                            this.a.setText(hd.L0(2131753344));
                        }
                    } else if (i18 == 21) {
                        this.a.setText(hd.L0(2131746405));
                    } else if (i18 == 20) {
                        this.a.setText(hd.L0(2131753535));
                    } else if (i18 == 24) {
                        this.a.setText(hd.L0(2131753531));
                    } else if (i18 == 27) {
                        this.a.setText(hd.L0(2131753532));
                    } else {
                        if (i18 == 28) {
                            this.a.setText(hd.L0(2131753530));
                        } else if (i18 == 25) {
                            this.a.setText(hd.L0(2131753534));
                        } else if (i18 == 26) {
                            this.a.setText(hd.L0(2131753525));
                        } else {
                            if (i18 != 29) {
                                i14 = 22;
                                if (i18 == 22 || i18 == 23) {
                                    this.a.setText(hd.L0(2131753526));
                                } else if (i18 == 11) {
                                    if (j0Var.U1) {
                                        this.a.setText(hd.L0(2131752402));
                                    } else {
                                        this.a.setText(hd.L0(2131752400));
                                    }
                                } else if (i18 == 34) {
                                    this.a.setText(hd.L0(2131752621));
                                } else if (i18 == 6) {
                                    this.a.setText(hd.L0(2131750827));
                                } else if (i18 != 14 || j0Var.T1 <= 1) {
                                    this.a.setText(hd.L0(2131748978));
                                } else {
                                    this.a.setText(hd.L0(2131751718));
                                }
                                this.a.setTextSize(1, 20.0f);
                                TextView textView2 = this.a;
                                int i33 = j6.G6;
                                q6.U(textView2, i33, j0Var.J0);
                                this.a.setGravity(17);
                                if (i18 != 19 || i18 == 32 || j0Var.s1()) {
                                    wg.b bVar = new wg.b(context);
                                    this.c = bVar;
                                    bVar.a(j0Var.Y1.i, false);
                                    if (i18 == 32) {
                                        bVar.setVisibility(i12);
                                    }
                                    if (j0Var.a2) {
                                        addView(this.a, ja.t(-2, -2, 1, 0, z10 ? i12 : 22, 0, 0));
                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                        linearLayout.setOrientation(0);
                                        linearLayout.setClipChildren(false);
                                        FrameLayout frameLayout2 = new FrameLayout(getContext());
                                        int L3 = org.telegram.messenger.g0.L(14.0f);
                                        int i34 = j6.a7;
                                        q6.B(frameLayout2, j6.d0(L3, j6.w0(i34, j0Var.J0)), q6.M(i34), j0Var.J0);
                                        i9 i9Var = new i9(getContext());
                                        i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                                        TLRPC.Chat M0 = np.s1(j0Var.a).M0(Long.valueOf(-j0Var.W1));
                                        t8 t8Var = new t8();
                                        t8Var.q(M0);
                                        i9Var.f(M0, t8Var);
                                        frameLayout2.addView(i9Var, ja.c(28.0f, 28));
                                        TextView textView3 = new TextView(getContext());
                                        if (M0 != null) {
                                            textView3.setText(M0.title);
                                        }
                                        textView3.setSingleLine(true);
                                        textView3.setMaxLines(1);
                                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                                        textView3.setTextSize(1, 13.0f);
                                        q6.U(textView3, i33, j0Var.J0);
                                        frameLayout2.addView(textView3, ja.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                        linearLayout.addView(frameLayout2, ja.t(-2, 28, 80, 18, 0, 18, 0));
                                        LayoutTransition layoutTransition = new LayoutTransition();
                                        layoutTransition.setDuration(100L);
                                        layoutTransition.enableTransitionType(4);
                                        linearLayout.setLayoutTransition(layoutTransition);
                                        linearLayout.addView(bVar, ja.t(-2, -2, 48, -30, 2, 18, 0));
                                        addView(linearLayout, ja.t(-2, 38, 17, 0, -4, 0, 12));
                                        na.a(linearLayout);
                                        i15 = 1;
                                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ug.g0
                                            public final /* synthetic */ i0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i15) {
                                                    case 0:
                                                        e2 e2Var2 = this.b.e.G2;
                                                        if (e2Var2 != null) {
                                                            c2 c2Var = new c2();
                                                            c2Var.a = true;
                                                            e2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), c2Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        j0 j0Var2 = this.b.e;
                                                        j0Var2.s1.presentFragment(an.ua(j0Var2.W1));
                                                        j0Var2.dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                        TextView textView4 = new TextView(context);
                                        this.b = textView4;
                                        textView4.setText(org.telegram.messenger.g0.X2(str2));
                                        this.b.setTextSize(i15, 14.0f);
                                        this.b.setGravity(i15);
                                        TextView textView5 = this.b;
                                        textView5.setLineSpacing(textView5.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                        if (i18 == i13) {
                                            q6.U(this.b, i33, j0Var.J0);
                                        } else if (j0Var.J0 instanceof fi.b) {
                                            q6.U(this.b, j6.y6, j0Var.J0);
                                        } else {
                                            q6.U(this.b, i33, j0Var.J0);
                                        }
                                        if (i18 != 19) {
                                            addView(this.b, ja.t(-2, -2, 1, 24, -2, 24, 17));
                                        } else {
                                            addView(this.b, ja.t(-2, -2, 1, 24, 0, 24, 24));
                                        }
                                        if (i18 == 31) {
                                            ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(15.0f);
                                            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(6.0f);
                                            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                                        }
                                        j0Var.F1();
                                        return;
                                    }
                                    LinearLayout linearLayout2 = new LinearLayout(context);
                                    this.d = linearLayout2;
                                    linearLayout2.setOrientation(0);
                                    this.d.setWeightSum(1.0f);
                                    this.d.addView(this.a, ja.p(-2, -2, 1.0f, 0));
                                    this.d.addView(bVar, ja.t(-2, -2, 48, 0, 2, 0, 0));
                                    addView(this.d, ja.t(-2, -2, 1, 12, z10 ? i12 : 22, 12, 9));
                                } else {
                                    addView(this.a, ja.t(-2, -2, 1, 0, z10 ? i12 : i14, 0, 10));
                                }
                                i15 = 1;
                                TextView textView42 = new TextView(context);
                                this.b = textView42;
                                textView42.setText(org.telegram.messenger.g0.X2(str2));
                                this.b.setTextSize(i15, 14.0f);
                                this.b.setGravity(i15);
                                TextView textView52 = this.b;
                                textView52.setLineSpacing(textView52.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                if (i18 == i13) {
                                }
                                if (i18 != 19) {
                                }
                                if (i18 == 31) {
                                }
                                j0Var.F1();
                                return;
                            }
                            this.a.setText(hd.L0(2131753533));
                        }
                        i14 = 22;
                        this.a.setTextSize(1, 20.0f);
                        TextView textView22 = this.a;
                        int i332 = j6.G6;
                        q6.U(textView22, i332, j0Var.J0);
                        this.a.setGravity(17);
                        if (i18 != 19) {
                        }
                        wg.b bVar2 = new wg.b(context);
                        this.c = bVar2;
                        bVar2.a(j0Var.Y1.i, false);
                        if (i18 == 32) {
                        }
                        if (j0Var.a2) {
                        }
                    }
                    i14 = 22;
                    this.a.setTextSize(1, 20.0f);
                    TextView textView222 = this.a;
                    int i3322 = j6.G6;
                    q6.U(textView222, i3322, j0Var.J0);
                    this.a.setGravity(17);
                    if (i18 != 19) {
                    }
                    wg.b bVar22 = new wg.b(context);
                    this.c = bVar22;
                    bVar22.a(j0Var.Y1.i, false);
                    if (i18 == 32) {
                    }
                    if (j0Var.a2) {
                    }
                }
                i14 = 22;
                i13 = 18;
                this.a.setTextSize(1, 20.0f);
                TextView textView2222 = this.a;
                int i33222 = j6.G6;
                q6.U(textView2222, i33222, j0Var.J0);
                this.a.setGravity(17);
                if (i18 != 19) {
                }
                wg.b bVar222 = new wg.b(context);
                this.c = bVar222;
                bVar222.a(j0Var.Y1.i, false);
                if (i18 == 32) {
                }
                if (j0Var.a2) {
                }
            }
            i10 = 1;
            if (m10.i(j0Var.a).q()) {
            }
            i7 = i28;
            f10 = 1.0f;
            float f142 = i27 / i28;
            if (i18 != 18) {
            }
            if (i31 != 0) {
            }
            if (i18 != 11) {
            }
            arrayList21 = j0Var.z2;
            if (arrayList21 != null) {
            }
            arrayList22 = j0Var.y2;
            if (arrayList22 != null) {
            }
            i11 = i7;
            if (i18 != 31) {
            }
            i12 = 8;
            if (i18 == 31) {
            }
            TextView textView6 = new TextView(context);
            this.a = textView6;
            textView6.setTypeface(org.telegram.messenger.g0.o());
            if (i18 == 31) {
            }
            i14 = 22;
            i13 = 18;
            this.a.setTextSize(1, 20.0f);
            TextView textView22222 = this.a;
            int i332222 = j6.G6;
            q6.U(textView22222, i332222, j0Var.J0);
            this.a.setGravity(17);
            if (i18 != 19) {
            }
            wg.b bVar2222 = new wg.b(context);
            this.c = bVar2222;
            bVar2222.a(j0Var.Y1.i, false);
            if (i18 == 32) {
            }
            if (j0Var.a2) {
            }
        } else if (i18 == 34) {
            arrayList = j0Var.x2;
            if (arrayList.size() == 1) {
                arrayList4 = j0Var.x2;
                str = hd.Z(2131749163, g5.p((TLRPC.User) arrayList4.get(0)));
            } else {
                arrayList2 = j0Var.x2;
                int size7 = arrayList2.size();
                arrayList3 = j0Var.x2;
                str = hd.G(size7, "InviteCallRestrictedUsers", Integer.valueOf(arrayList3.size()));
            }
        } else if (D3) {
            str = (String) j0Var.I2.f;
        } else {
            str = (String) ((m10.i(j0Var.a).q() || j0Var.J2) ? j0Var.I2.e : j0Var.I2.d);
        }
        str2 = str;
        z10 = D3;
        androidx.emoji2.text.q qVar2 = j0Var.I2;
        int i272 = qVar2.b;
        int i282 = qVar2.c;
        i7 = j0Var.s2;
        if (i18 != 3) {
        }
        i10 = 1;
        if (m10.i(j0Var.a).q()) {
        }
        i7 = i282;
        f10 = 1.0f;
        float f1422 = i272 / i282;
        if (i18 != 18) {
        }
        if (i31 != 0) {
        }
        if (i18 != 11) {
        }
        arrayList21 = j0Var.z2;
        if (arrayList21 != null) {
        }
        arrayList22 = j0Var.y2;
        if (arrayList22 != null) {
        }
        i11 = i7;
        if (i18 != 31) {
        }
        i12 = 8;
        if (i18 == 31) {
        }
        TextView textView62 = new TextView(context);
        this.a = textView62;
        textView62.setTypeface(org.telegram.messenger.g0.o());
        if (i18 == 31) {
        }
        i14 = 22;
        i13 = 18;
        this.a.setTextSize(1, 20.0f);
        TextView textView222222 = this.a;
        int i3322222 = j6.G6;
        q6.U(textView222222, i3322222, j0Var.J0);
        this.a.setGravity(17);
        if (i18 != 19) {
        }
        wg.b bVar22222 = new wg.b(context);
        this.c = bVar22222;
        bVar22222.a(j0Var.Y1.i, false);
        if (i18 == 32) {
        }
        if (j0Var.a2) {
        }
    }
}
