package vg;

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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e3;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.e40;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h0 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final xg.b c;
    public LinearLayout d;
    public final /* synthetic */ i0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0539, code lost:
    
        if (r10.isEmpty() != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0555, code lost:
    
        r0 = r44.w2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x055d, code lost:
    
        if (r0.isEmpty() == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x055f, code lost:
    
        r0 = r44.v2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0568, code lost:
    
        r3 = new org.telegram.ui.Components.x8(r45, false);
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
        r3.b(r5, r44.a, org.telegram.messenger.hp.s1(r44.a).a2(r6));
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05b2, code lost:
    
        r3.a(false);
        addView(r3, b8.mf.t(((r4 - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
        r4 = new android.widget.TextView(r45);
        r4.setGravity(17);
        org.telegram.messenger.camera.q.m(r4, r26, 20.0f);
        r5 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(r4, r5, r44.J0);
        r4.setText(org.telegram.messenger.bd.L0(2131749136));
        addView(r4, b8.mf.t(-1, -2, 1, 32, 0, 32, 9));
        r4 = new android.widget.TextView(r45);
        r4.setGravity(17);
        r4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(r4, r5, r44.J0);
        addView(r4, b8.mf.t(-1, -2, 1, 32, 0, 32, 19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0624, code lost:
    
        if (r13 != 34) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0626, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0629, code lost:
    
        r9 = r44.v2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x062d, code lost:
    
        if (r9 == null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x062f, code lost:
    
        r9 = r44.v2;
        r9 = r9.size();
        r10 = r44.w2;
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
    
        r3 = 2131749175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x065a, code lost:
    
        r0 = org.telegram.messenger.bd.Z(r3, org.telegram.messenger.l10.k(org.telegram.messenger.hp.s1(r44.a).a2((java.lang.Long) r0.get(0))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x07b4, code lost:
    
        r4.setText(org.telegram.messenger.g0.X2(r0));
        r0 = r44.w2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x07bf, code lost:
    
        if (r0 != null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x07c1, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x07cb, code lost:
    
        r3 = r44.v2;
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
    
        if (r44.R1 == false) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x07e8, code lost:
    
        r9 = 0;
        r0 = new vg.o0(r45, r44.J0, false);
        b8.pf.b(r0, 0.02f, 1.2f);
        r0.b(org.telegram.messenger.bd.L0(2131749138), new vg.f0(r43, r9), false);
        addView(r0, b8.mf.k((r44.u0 / org.telegram.messenger.g0.p) + 4.0f, 0.0f, (r44.u0 / org.telegram.messenger.g0.p) + 4.0f, 18.0f, -1, 48));
        r0 = new fi.j(r43, r45);
        r0.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(r0, org.telegram.ui.ActionBar.k6.z6, r44.J0);
        r0.setText(" " + org.telegram.messenger.bd.L0(2131749139) + " ");
        r0.setTextSize(14.0f);
        addView(r0, b8.mf.t(org.telegram.messenger.hs.U2, -2, 1, 12, 0, 12, 20));
        r0 = new android.widget.TextView(r45);
        r0.setGravity(17);
        r0.setTypeface(org.telegram.messenger.g0.o());
        r0.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.V(r0, r5, r44.J0);
        r0.setText(org.telegram.messenger.bd.L0(2131749179));
        addView(r0, b8.mf.t(-1, -2, 1, 32, 0, 32, 9));
        r0 = new android.widget.TextView(r45);
        r0.setGravity(17);
        r0.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(r0, r5, r44.J0);
        r2 = r44.w2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x08ba, code lost:
    
        if (r2.size() > 1) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x08bc, code lost:
    
        r0.setText(org.telegram.messenger.bd.L0(2131749180));
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x08d1, code lost:
    
        addView(r0, b8.mf.t(-1, -2, 1, 32, 0, 32, 19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x08f4, code lost:
    
        r44.F1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x08f7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x08c7, code lost:
    
        r0.setText(org.telegram.messenger.bd.L0(2131749181));
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x08e3, code lost:
    
        ((android.view.ViewGroup.MarginLayoutParams) r4.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
        r44.c2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x07d3, code lost:
    
        r3 = r44.v2;
        r3 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x07c3, code lost:
    
        r0 = r44.w2;
        r0 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0651, code lost:
    
        if (r9 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0653, code lost:
    
        r3 = 2131749145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0657, code lost:
    
        r3 = 2131749140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x067f, code lost:
    
        if (r0.size() != 2) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0681, code lost:
    
        if (r6 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0683, code lost:
    
        r3 = 2131749173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0690, code lost:
    
        r0 = org.telegram.messenger.bd.Z(r3, org.telegram.messenger.l10.k(org.telegram.messenger.hp.s1(r44.a).a2((java.lang.Long) r0.get(0))), org.telegram.messenger.l10.k(org.telegram.messenger.hp.s1(r44.a).a2((java.lang.Long) r0.get(1))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0687, code lost:
    
        if (r9 == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0689, code lost:
    
        r3 = 2131749143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x068d, code lost:
    
        r3 = 2131749135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06cc, code lost:
    
        if (r0.size() != 3) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06ce, code lost:
    
        if (r6 == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06d0, code lost:
    
        r3 = 2131749174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06dd, code lost:
    
        r0 = org.telegram.messenger.bd.Z(r3, org.telegram.messenger.l10.k(org.telegram.messenger.hp.s1(r44.a).a2((java.lang.Long) r0.get(0))), org.telegram.messenger.l10.k(org.telegram.messenger.hp.s1(r44.a).a2((java.lang.Long) r0.get(1))), org.telegram.messenger.l10.k(org.telegram.messenger.hp.s1(r44.a).a2((java.lang.Long) r0.get(2))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06d4, code lost:
    
        if (r9 == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06d6, code lost:
    
        r3 = 2131749144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06da, code lost:
    
        r3 = 2131749137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x072f, code lost:
    
        if (r6 == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0731, code lost:
    
        r6 = "InviteCallMessagePremiumBlockedMany";
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x073b, code lost:
    
        r6 = org.telegram.messenger.bd.G(r0.size() - 2, r6, org.telegram.messenger.l10.k(org.telegram.messenger.hp.s1(r44.a).a2((java.lang.Long) r0.get(0))), org.telegram.messenger.l10.k(org.telegram.messenger.hp.s1(r44.a).a2((java.lang.Long) r0.get(1))));
        r0 = r0.size() - 2;
        r9 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, r44.J0);
        r3.b = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, null);
        r3.c = new org.telegram.ui.Components.ly0(k2.p1.i(r0, "+"), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
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
    
        r0 = r44.w2;
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
    public h0(i0 i0Var, Context context) {
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
        int i3;
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
        d2 d2Var = i0Var.p1;
        this.e = i0Var;
        setOrientation(1);
        int i17 = i0.P2;
        setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.u0, 0);
        int i18 = i0Var.a2;
        androidx.emoji2.text.q o12 = i0.o1(i18, i0Var.a);
        i0Var.F2 = o12;
        int i19 = o12.a;
        hp s12 = hp.s1(i0Var.a);
        boolean D3 = s12.D3();
        boolean r12 = i0Var.r1();
        if (i18 == 31) {
            str = bd.M0(r12 ? 2131753602 : 2131753601, null);
        } else if (i18 == 32) {
            str = i0Var.l1(true);
        } else if (i18 == 19) {
            org.telegram.ui.Cells.q1 q1Var = i0Var.Z1;
            if (q1Var != null) {
                int i20 = q1Var.getMessageObject().k.from_boosts_applied;
                TLRPC.Chat n12 = i0Var.n1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) bd.G(i20, "GroupBoostedByUserWithTimes", l10.j(i0Var.Z1.getCurrentUser(), true)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) bd.a0(null, null, 2131749505, n12 == null ? "" : n12.title));
                str = spannableStringBuilder.toString();
            } else if (d2Var instanceof e40) {
                str = bd.G(xg.s.g(), "BoostingGroupBoostWhatAreBoostsDescription", new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(i0Var.l1(true));
                if (t3.N(i0Var.n1()) && r12) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) bd.M0(2131753329, null));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i18 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = i0Var.U1;
            if (tL_premium_boostsStatus4.level == 0) {
                int i21 = r12 ? 2131749429 : 2131752353;
                int i22 = tL_premium_boostsStatus4.next_level_boosts;
                str = bd.a0(null, null, i21, bd.G(i22, "MoreBoosts", Integer.valueOf(i22)));
            } else {
                int i23 = r12 ? 2131749427 : 2131752351;
                int i24 = tL_premium_boostsStatus4.next_level_boosts;
                int i25 = tL_premium_boostsStatus4.boosts;
                str = bd.a0(null, null, i23, bd.G(i24 - i25, "MoreBoosts", Integer.valueOf(i24 - i25)), bd.G(i0Var.U1.level + 1, "BoostStories", new Object[0]));
            }
        } else if (i18 == 20) {
            str = bd.a0(null, null, r12 ? 2131749426 : 2131752349, Integer.valueOf(i0Var.j1()));
        } else if (i18 == 24) {
            str = bd.a0(null, null, r12 ? 2131749422 : 2131752346, Integer.valueOf(i0Var.j1()));
        } else if (i18 == 29) {
            str = bd.a0(null, null, 2131749425, Integer.valueOf(s12.x5));
        } else if (i18 == 30) {
            str = bd.a0(null, null, 2131752343, Integer.valueOf(s12.z4));
        } else if (i18 == 35) {
            str = bd.a0(null, null, 2131752350, Integer.valueOf(s12.A4));
        } else if (i18 == 25) {
            str = bd.a0(null, null, r12 ? 2131749423 : 2131752347, Integer.valueOf(r12 ? s12.w5 : s12.s5));
        } else if (i18 == 26) {
            str = bd.a0(null, null, r12 ? 2131749418 : 2131752341, Integer.valueOf(r12 ? s12.w5 : s12.s5));
        } else if (i18 == 27) {
            str = bd.a0(null, null, r12 ? 2131749420 : 2131752344, Integer.valueOf(s12.q5));
        } else if (i18 == 28) {
            str = bd.a0(null, null, r12 ? 2131749421 : 2131752345, Integer.valueOf(r12 ? s12.v5 : s12.r5));
        } else if (i18 == 22) {
            str = bd.a0(null, null, r12 ? 2131749419 : 2131752342, Integer.valueOf(r12 ? s12.y5 : s12.t5));
        } else if (i18 == 23) {
            str = bd.a0(null, null, r12 ? 2131749424 : 2131752348, Integer.valueOf(r12 ? s12.z5 : s12.u5));
        } else if (i18 == 21) {
            int i26 = i0Var.K2;
            str = bd.G(i26, "ReactionReachLvlForReaction", Integer.valueOf(i26));
        } else if (i18 == 11) {
            if (i0Var.R1) {
                if (t3.V(i0Var.H2)) {
                    arrayList9 = i0Var.u2;
                    if (arrayList9.size() == 1) {
                        arrayList12 = i0Var.u2;
                        G = bd.Z(2131749163, g5.p((TLRPC.User) arrayList12.get(0)));
                    } else {
                        arrayList10 = i0Var.u2;
                        int size = arrayList10.size();
                        arrayList11 = i0Var.u2;
                        G = bd.G(size, "InviteChannelRestrictedUsers", Integer.valueOf(arrayList11.size()));
                    }
                } else {
                    arrayList5 = i0Var.u2;
                    if (arrayList5.size() == 1) {
                        arrayList8 = i0Var.u2;
                        G = bd.Z(2131749128, g5.p((TLRPC.User) arrayList8.get(0)));
                    } else {
                        arrayList6 = i0Var.u2;
                        int size2 = arrayList6.size();
                        arrayList7 = i0Var.u2;
                        G = bd.G(size2, "InviteRestrictedUsers", Integer.valueOf(arrayList7.size()));
                    }
                }
            } else if (t3.V(i0Var.H2)) {
                arrayList17 = i0Var.u2;
                if (arrayList17.size() == 1) {
                    arrayList20 = i0Var.u2;
                    G = bd.Z(2131749166, g5.p((TLRPC.User) arrayList20.get(0)));
                } else {
                    arrayList18 = i0Var.u2;
                    int size3 = arrayList18.size();
                    arrayList19 = i0Var.u2;
                    G = bd.G(size3, "InviteChannelRestrictedUsers2", Integer.valueOf(arrayList19.size()));
                }
            } else {
                arrayList13 = i0Var.u2;
                if (arrayList13.size() == 1) {
                    arrayList16 = i0Var.u2;
                    G = bd.Z(2131749131, g5.p((TLRPC.User) arrayList16.get(0)));
                } else {
                    arrayList14 = i0Var.u2;
                    int size4 = arrayList14.size();
                    arrayList15 = i0Var.u2;
                    G = bd.G(size4, "InviteRestrictedUsers2", Integer.valueOf(arrayList15.size()));
                }
            }
            str2 = G;
            z10 = true;
            androidx.emoji2.text.q qVar = i0Var.F2;
            int i27 = qVar.b;
            int i28 = qVar.c;
            i3 = i0Var.p2;
            if (i18 != 3) {
                i3 = hp.s1(i0Var.a).Q0.size() - 1;
            } else if (i18 == 7) {
                i3 = h10.c();
            } else if (i18 == 0) {
                ArrayList W0 = hp.s1(i0Var.a).W0(0);
                i10 = 1;
                int size5 = W0.size();
                int i29 = 0;
                for (int i30 = 0; i30 < size5; i30++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i30);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                        i29++;
                    }
                }
                i3 = i29;
                if (!h10.i(i0Var.a).q() || i0Var.G2) {
                    i3 = i28;
                    f10 = 1.0f;
                } else {
                    i3 = i3 < 0 ? i27 : i3;
                    if (i18 != 7) {
                        f11 = i3;
                        f12 = i28;
                    } else if (i3 > i27) {
                        f11 = i3 - i27;
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
                i3 = i31 != 0 ? 0 : i3;
                if ((i18 != 11 || i18 == 34) && !hp.s1(i0Var.a).D3()) {
                    arrayList21 = i0Var.w2;
                    if (arrayList21 != null) {
                        arrayList25 = i0Var.w2;
                    }
                    arrayList22 = i0Var.v2;
                    if (arrayList22 != null) {
                        arrayList23 = i0Var.v2;
                        int size6 = arrayList23.size();
                        arrayList24 = i0Var.u2;
                        i11 = i3;
                    }
                }
                i11 = i3;
                if (i18 != 31 || i18 == 34) {
                    i12 = 8;
                } else {
                    i12 = 8;
                    g0 g0Var = new g0(this, context, i19, i11, i28, f14, i0Var.J0);
                    i0Var.q2 = g0Var;
                    if (i31 != 0) {
                        tL_premium_boostsStatus2 = i0Var.U1;
                        if (tL_premium_boostsStatus2 != null) {
                            g0 g0Var2 = i0Var.q2;
                            tL_premium_boostsStatus3 = i0Var.U1;
                            e3 e3Var = i0Var.V1;
                            g0Var2.g(tL_premium_boostsStatus3, e3Var != null && e3Var.l);
                        }
                    } else {
                        g0Var.setBagePosition(f10);
                        i0Var.q2.setType(i18);
                        i0Var.q2.x.setVisibility(8);
                        if (z10) {
                            g0 g0Var3 = i0Var.q2;
                            g0Var3.J.setVisibility(8);
                            r rVar = g0Var3.e;
                            if (rVar != null) {
                                rVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(3.0f));
                            }
                            g0Var3.K = true;
                        } else if (h10.i(i0Var.a).q() || i0Var.G2) {
                            i0Var.q2.w.setVisibility(8);
                            if (i18 == 6) {
                                i0Var.q2.x.setText("2 GB");
                            } else {
                                i0Var.q2.x.setText(Integer.toString(i27));
                            }
                            z11 = false;
                            i0Var.q2.x.setVisibility(0);
                            i16 = 2;
                            if (i18 != i16 || i18 == 5) {
                                i0Var.q2.I = z11;
                            }
                            addView(i0Var.q2, mf.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                    }
                    i16 = 2;
                    z11 = false;
                    if (i18 != i16) {
                    }
                    i0Var.q2.I = z11;
                    addView(i0Var.q2, mf.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
                if (i18 == 31) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f0.d.d(getContext(), R.drawable.large_boosts));
                    frameLayout.addView(imageView, mf.e(-2, -2, 17));
                    int L = org.telegram.messenger.g0.L(79.0f);
                    int i32 = k6.Ci;
                    ShapeDrawable L2 = k6.L(L, k6.v0(i32));
                    n6 N = r6.N(i32);
                    frameLayout.setBackground(L2);
                    r6.k(frameLayout, L2, N, null, null);
                    addView(frameLayout, mf.t(79, 79, 1, 0, 23, 0, 0));
                }
                TextView textView = new TextView(context);
                this.a = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                if (i18 == 31) {
                    this.a.setText(bd.L0(2131753600));
                } else if (i18 == 32) {
                    this.a.setText(i0Var.m1());
                } else if (i18 == 19) {
                    if (d2Var instanceof e40) {
                        this.a.setText(bd.L0(2131753353));
                    } else {
                        this.a.setText(i0Var.m1());
                    }
                } else if (i18 == 30) {
                    this.a.setText(i0Var.m1());
                } else if (i18 == 35) {
                    this.a.setText(bd.L0(2131743885));
                } else {
                    i13 = 18;
                    if (i18 == 18) {
                        tL_premium_boostsStatus = i0Var.U1;
                        if (tL_premium_boostsStatus.level == 0) {
                            this.a.setText(bd.L0(2131753529));
                        } else {
                            this.a.setText(bd.L0(2131753344));
                        }
                    } else if (i18 == 21) {
                        this.a.setText(bd.L0(2131746413));
                    } else if (i18 == 20) {
                        this.a.setText(bd.L0(2131753535));
                    } else if (i18 == 24) {
                        this.a.setText(bd.L0(2131753531));
                    } else if (i18 == 27) {
                        this.a.setText(bd.L0(2131753532));
                    } else {
                        if (i18 == 28) {
                            this.a.setText(bd.L0(2131753530));
                        } else if (i18 == 25) {
                            this.a.setText(bd.L0(2131753534));
                        } else if (i18 == 26) {
                            this.a.setText(bd.L0(2131753525));
                        } else {
                            if (i18 != 29) {
                                i14 = 22;
                                if (i18 == 22 || i18 == 23) {
                                    this.a.setText(bd.L0(2131753526));
                                } else if (i18 == 11) {
                                    if (i0Var.R1) {
                                        this.a.setText(bd.L0(2131752402));
                                    } else {
                                        this.a.setText(bd.L0(2131752400));
                                    }
                                } else if (i18 == 34) {
                                    this.a.setText(bd.L0(2131752621));
                                } else if (i18 == 6) {
                                    this.a.setText(bd.L0(2131750828));
                                } else if (i18 != 14 || i0Var.Q1 <= 1) {
                                    this.a.setText(bd.L0(2131748986));
                                } else {
                                    this.a.setText(bd.L0(2131751719));
                                }
                                this.a.setTextSize(1, 20.0f);
                                TextView textView2 = this.a;
                                int i33 = k6.G6;
                                r6.V(textView2, i33, i0Var.J0);
                                this.a.setGravity(17);
                                if (i18 != 19 || i18 == 32 || i0Var.s1()) {
                                    xg.b bVar = new xg.b(context);
                                    this.c = bVar;
                                    bVar.a(i0Var.V1.i, false);
                                    if (i18 == 32) {
                                        bVar.setVisibility(i12);
                                    }
                                    if (i0Var.X1) {
                                        addView(this.a, mf.t(-2, -2, 1, 0, z10 ? i12 : 22, 0, 0));
                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                        linearLayout.setOrientation(0);
                                        linearLayout.setClipChildren(false);
                                        FrameLayout frameLayout2 = new FrameLayout(getContext());
                                        int L3 = org.telegram.messenger.g0.L(14.0f);
                                        int i34 = k6.a7;
                                        r6.C(frameLayout2, k6.d0(L3, k6.w0(i34, i0Var.J0)), r6.N(i34), i0Var.J0);
                                        k9 k9Var = new k9(getContext());
                                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
                                        TLRPC.Chat M0 = hp.s1(i0Var.a).M0(Long.valueOf(-i0Var.T1));
                                        u8 u8Var = new u8();
                                        u8Var.q(M0);
                                        k9Var.e(M0, u8Var);
                                        frameLayout2.addView(k9Var, mf.c(28.0f, 28));
                                        TextView textView3 = new TextView(getContext());
                                        if (M0 != null) {
                                            textView3.setText(M0.title);
                                        }
                                        textView3.setSingleLine(true);
                                        textView3.setMaxLines(1);
                                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                                        textView3.setTextSize(1, 13.0f);
                                        r6.V(textView3, i33, i0Var.J0);
                                        frameLayout2.addView(textView3, mf.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                        linearLayout.addView(frameLayout2, mf.t(-2, 28, 80, 18, 0, 18, 0));
                                        LayoutTransition layoutTransition = new LayoutTransition();
                                        layoutTransition.setDuration(100L);
                                        layoutTransition.enableTransitionType(4);
                                        linearLayout.setLayoutTransition(layoutTransition);
                                        linearLayout.addView(bVar, mf.t(-2, -2, 48, -30, 2, 18, 0));
                                        addView(linearLayout, mf.t(-2, 38, 17, 0, -4, 0, 12));
                                        pf.a(linearLayout);
                                        i15 = 1;
                                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: vg.f0
                                            public final /* synthetic */ h0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i15) {
                                                    case 0:
                                                        d2 d2Var2 = this.b.e.D2;
                                                        if (d2Var2 != null) {
                                                            b2 b2Var = new b2();
                                                            b2Var.a = true;
                                                            d2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), b2Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        i0 i0Var2 = this.b.e;
                                                        i0Var2.p1.presentFragment(wm.ra(i0Var2.T1));
                                                        i0Var2.dismiss();
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
                                            r6.V(this.b, i33, i0Var.J0);
                                        } else if (i0Var.J0 instanceof ei.b) {
                                            r6.V(this.b, k6.y6, i0Var.J0);
                                        } else {
                                            r6.V(this.b, i33, i0Var.J0);
                                        }
                                        if (i18 != 19) {
                                            addView(this.b, mf.t(-2, -2, 1, 24, -2, 24, 17));
                                        } else {
                                            addView(this.b, mf.t(-2, -2, 1, 24, 0, 24, 24));
                                        }
                                        if (i18 == 31) {
                                            ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(15.0f);
                                            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(6.0f);
                                            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                                        }
                                        i0Var.F1();
                                        return;
                                    }
                                    LinearLayout linearLayout2 = new LinearLayout(context);
                                    this.d = linearLayout2;
                                    linearLayout2.setOrientation(0);
                                    this.d.setWeightSum(1.0f);
                                    this.d.addView(this.a, mf.p(-2, -2, 1.0f, 0));
                                    this.d.addView(bVar, mf.t(-2, -2, 48, 0, 2, 0, 0));
                                    addView(this.d, mf.t(-2, -2, 1, 12, z10 ? i12 : 22, 12, 9));
                                } else {
                                    addView(this.a, mf.t(-2, -2, 1, 0, z10 ? i12 : i14, 0, 10));
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
                                i0Var.F1();
                                return;
                            }
                            this.a.setText(bd.L0(2131753533));
                        }
                        i14 = 22;
                        this.a.setTextSize(1, 20.0f);
                        TextView textView22 = this.a;
                        int i332 = k6.G6;
                        r6.V(textView22, i332, i0Var.J0);
                        this.a.setGravity(17);
                        if (i18 != 19) {
                        }
                        xg.b bVar2 = new xg.b(context);
                        this.c = bVar2;
                        bVar2.a(i0Var.V1.i, false);
                        if (i18 == 32) {
                        }
                        if (i0Var.X1) {
                        }
                    }
                    i14 = 22;
                    this.a.setTextSize(1, 20.0f);
                    TextView textView222 = this.a;
                    int i3322 = k6.G6;
                    r6.V(textView222, i3322, i0Var.J0);
                    this.a.setGravity(17);
                    if (i18 != 19) {
                    }
                    xg.b bVar22 = new xg.b(context);
                    this.c = bVar22;
                    bVar22.a(i0Var.V1.i, false);
                    if (i18 == 32) {
                    }
                    if (i0Var.X1) {
                    }
                }
                i14 = 22;
                i13 = 18;
                this.a.setTextSize(1, 20.0f);
                TextView textView2222 = this.a;
                int i33222 = k6.G6;
                r6.V(textView2222, i33222, i0Var.J0);
                this.a.setGravity(17);
                if (i18 != 19) {
                }
                xg.b bVar222 = new xg.b(context);
                this.c = bVar222;
                bVar222.a(i0Var.V1.i, false);
                if (i18 == 32) {
                }
                if (i0Var.X1) {
                }
            }
            i10 = 1;
            if (h10.i(i0Var.a).q()) {
            }
            i3 = i28;
            f10 = 1.0f;
            float f142 = i27 / i28;
            if (i18 != 18) {
            }
            if (i31 != 0) {
            }
            if (i18 != 11) {
            }
            arrayList21 = i0Var.w2;
            if (arrayList21 != null) {
            }
            arrayList22 = i0Var.v2;
            if (arrayList22 != null) {
            }
            i11 = i3;
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
            int i332222 = k6.G6;
            r6.V(textView22222, i332222, i0Var.J0);
            this.a.setGravity(17);
            if (i18 != 19) {
            }
            xg.b bVar2222 = new xg.b(context);
            this.c = bVar2222;
            bVar2222.a(i0Var.V1.i, false);
            if (i18 == 32) {
            }
            if (i0Var.X1) {
            }
        } else if (i18 == 34) {
            arrayList = i0Var.u2;
            if (arrayList.size() == 1) {
                arrayList4 = i0Var.u2;
                str = bd.Z(2131749171, g5.p((TLRPC.User) arrayList4.get(0)));
            } else {
                arrayList2 = i0Var.u2;
                int size7 = arrayList2.size();
                arrayList3 = i0Var.u2;
                str = bd.G(size7, "InviteCallRestrictedUsers", Integer.valueOf(arrayList3.size()));
            }
        } else if (D3) {
            str = (String) i0Var.F2.f;
        } else {
            str = (String) ((h10.i(i0Var.a).q() || i0Var.G2) ? i0Var.F2.e : i0Var.F2.d);
        }
        str2 = str;
        z10 = D3;
        androidx.emoji2.text.q qVar2 = i0Var.F2;
        int i272 = qVar2.b;
        int i282 = qVar2.c;
        i3 = i0Var.p2;
        if (i18 != 3) {
        }
        i10 = 1;
        if (h10.i(i0Var.a).q()) {
        }
        i3 = i282;
        f10 = 1.0f;
        float f1422 = i272 / i282;
        if (i18 != 18) {
        }
        if (i31 != 0) {
        }
        if (i18 != 11) {
        }
        arrayList21 = i0Var.w2;
        if (arrayList21 != null) {
        }
        arrayList22 = i0Var.v2;
        if (arrayList22 != null) {
        }
        i11 = i3;
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
        int i3322222 = k6.G6;
        r6.V(textView222222, i3322222, i0Var.J0);
        this.a.setGravity(17);
        if (i18 != 19) {
        }
        xg.b bVar22222 = new xg.b(context);
        this.c = bVar22222;
        bVar22222.a(i0Var.V1.i, false);
        if (i18 == 32) {
        }
        if (i0Var.X1) {
        }
    }
}
