package yh;

import ai.k7;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ei.r6;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.ud;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xp;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class j0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final i0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public ai.q4 K;
    public boolean L;
    public final z4 b;
    public final ih.k c;
    public final gh.e d;
    public final bh.b e;
    public final ih.f f;
    public final qh.i h;
    public final g0 n;
    public final FrameLayout r;
    public final xp s;
    public final TextView v;
    public final q6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (d6) null, true, true);
        sn snVar;
        final int i10 = 1;
        this.c = new ih.k();
        qh.i iVar = new qh.i(new ai.f4(this, i10));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j10;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        gh.e eVar = new gh.e();
        this.d = eVar;
        bh.b bVar = new bh.b(eVar);
        this.e = bVar;
        f0 f0Var = new f0(this, context);
        this.containerView = f0Var;
        int i11 = this.backgroundPaddingLeft;
        final int i12 = 0;
        f0Var.setPadding(i11, 0, i11, 0);
        ih.j jVar = new ih.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar.f = jVar;
        bVar.g = viewGroup;
        qh.e eVar2 = new qh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.E = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e = r6.e(null, this.currentAccount, j10, h6.I.q());
        this.y = e;
        f0Var.V(e);
        z4 z4Var = new z4(context, this.currentAccount, d6Var);
        this.b = z4Var;
        z4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        z4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        z4Var.setLayoutBackground(new u5(z4Var, this.containerView, AndroidUtilities.dp(18.0f), q("paintChatActionBackground")));
        f0Var.addView(z4Var, z5.e(-2, -2, 48));
        ih.f fVar = new ih.f(context);
        this.f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(bVar.c(fVar, fh.c.b(d6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(bVar.c(fVar, fh.c.b(d6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        g0 g0Var = new g0(this, AndroidUtilities.getActivity(), f0Var);
        this.n = g0Var;
        g0Var.setInAppInsetsController(iVar);
        g0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        g0Var.y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        g0Var.x4 = false;
        g0Var.i2 = !AndroidUtilities.isInMultiwindow && ((snVar = g0Var.P2) == null || !snVar.isInBubbleMode());
        g0Var.S0(false, false, false);
        g0Var.d1(true, false);
        g0Var.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        g0Var.getSendButton().setAlpha(0.0f);
        g0Var.getEditField().setMaxLines(3);
        g0Var.setCustomWindowView(this.container);
        g0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(g0Var, z5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        this.containerView.addView(fVar.getFadeView(), z5.d(-1.0f, -1));
        this.containerView.addView(fVar, z5.d(-1.0f, -1));
        g0Var.setDelegate(new h0(this, tL_starGiftUnique));
        pf pfVar = g0Var.E0;
        ud udVar = new ud();
        InputFilter[] filters = pfVar.getFilters();
        if (filters == null) {
            pfVar.setFilters(new InputFilter[]{udVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = udVar;
            pfVar.setFilters(inputFilterArr);
        }
        q6 q6Var = new q6(context, false, false, false);
        this.w = q6Var;
        q6Var.setAllowCancel(true);
        q6Var.setScaleProperty(0.6f);
        q6Var.setVisibility(8);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(getThemedColor(h6.y6));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setGravity(17);
        this.containerView.addView(q6Var, z5.a(20.0f, 3.0f, 0.0f, 3.0f, 54.0f, 56, 85));
        i0 i0Var = new i0(R.drawable.send_plane_24, context, d6Var, false);
        this.H = i0Var;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        i0Var.I = dp;
        i0Var.J = dp2;
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = AndroidUtilities.dp(8.0f);
        i0Var.M = dp3;
        i0Var.N = dp4;
        i0Var.h0 = true;
        this.containerView.addView(i0Var, z5.e(110, 50, 85));
        i0Var.setScrimViewBackgroundColor(getThemedColor(h6.d6));
        i0Var.setOnClickListener(new View.OnClickListener(this) { // from class: yh.e0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        j0 j0Var = this.b;
                        if (j0Var.E - j0Var.F >= 0) {
                            ai.q4 q4Var = j0Var.K;
                            if (q4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = j0Var.n.getTextWithEntities();
                                boolean z10 = j0Var.G;
                                k7 k7Var = (k7) q4Var.c;
                                j0 j0Var2 = (j0) q4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) q4Var.e;
                                long j11 = q4Var.b;
                                ag.c cVar = (ag.c) q4Var.f;
                                if (!j0Var2.L) {
                                    k7Var.u2(tL_starGiftUnique2, j11, cVar, textWithEntities, z10, j0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(j0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        j0 j0Var3 = this.b;
                        boolean z11 = j0Var3.G;
                        j0Var3.G = !z11;
                        j0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i13 = h6.ic;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new u5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, q("paintChatActionBackground")));
        this.containerView.addView(textView, z5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, z5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        xp xpVar = new xp(context, 18, d6Var);
        this.s = xpVar;
        xpVar.getCheckBoxBase().j(true);
        xpVar.getCheckBoxBase().e = 0.9f;
        xpVar.b(i13, i13, h6.k7);
        xpVar.setDrawUnchecked(true);
        xpVar.a(!this.G, false);
        z4Var.getLayout().R = new ai.f4(this, i14);
        xpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(xpVar, z5.a(18.0f, 10.0f, 0.0f, 0.0f, 0.0f, 18, 19));
        frameLayout.setBackground(new u5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), q("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: yh.e0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        j0 j0Var = this.b;
                        if (j0Var.E - j0Var.F >= 0) {
                            ai.q4 q4Var = j0Var.K;
                            if (q4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = j0Var.n.getTextWithEntities();
                                boolean z10 = j0Var.G;
                                k7 k7Var = (k7) q4Var.c;
                                j0 j0Var2 = (j0) q4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) q4Var.e;
                                long j11 = q4Var.b;
                                ag.c cVar = (ag.c) q4Var.f;
                                if (!j0Var2.L) {
                                    k7Var.u2(tL_starGiftUnique2, j11, cVar, textWithEntities, z10, j0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(j0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        j0 j0Var3 = this.b;
                        boolean z11 = j0Var3.G;
                        j0Var3.G = !z11;
                        j0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout, z5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        u5 u5Var = new u5(imageView, this.containerView, AndroidUtilities.dp(16.0f), q("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = hh.d.a;
        imageView.setBackground(new hh.c(dp5, dp6, u5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: yh.e0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        j0 j0Var = this.b;
                        if (j0Var.E - j0Var.F >= 0) {
                            ai.q4 q4Var = j0Var.K;
                            if (q4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = j0Var.n.getTextWithEntities();
                                boolean z10 = j0Var.G;
                                k7 k7Var = (k7) q4Var.c;
                                j0 j0Var2 = (j0) q4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) q4Var.e;
                                long j11 = q4Var.b;
                                ag.c cVar = (ag.c) q4Var.f;
                                if (!j0Var2.L) {
                                    k7Var.u2(tL_starGiftUnique2, j11, cVar, textWithEntities, z10, j0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(j0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        j0 j0Var3 = this.b;
                        boolean z11 = j0Var3.G;
                        j0Var3.G = !z11;
                        j0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.containerView.addView(imageView, z5.e(56, 56, 53));
        b6.b(frameLayout, 0.05f, 1.2f);
        b6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        qg.g0 g0Var2 = new qg.g0(this, 29);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, g0Var2);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        g0 g0Var = this.n;
        if (g0Var == null || !g0Var.r0()) {
            super.onBackPressed();
        } else {
            g0Var.k0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        qc.a(this.container, new ah.m0(this, 11));
        s40 s40Var = s40.s;
        if (s40Var.c()) {
            s40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.I.title);
            sb2.append(" #");
            new xc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.q.h(r3.num, ',', sb2))), null).k(true);
        }
    }

    public final void p() {
        qh.i iVar = this.h;
        int i10 = iVar.f(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        z4 z4Var = this.b;
        FrameLayout frameLayout = this.r;
        z4Var.setTranslationY(Math.min(((dp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - z4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - z4Var.getHeight()));
        z4Var.invalidate();
        float y3 = z4Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    public final Paint q(String str) {
        d6 d6Var = this.resourcesProvider;
        Paint n10 = d6Var != null ? d6Var.n("paintChatActionBackground") : null;
        return n10 != null ? n10 : h6.T0("paintChatActionBackground");
    }
}
