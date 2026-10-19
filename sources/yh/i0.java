package yh;

import ai.l7;
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
import org.telegram.ui.qn;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class i0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final h0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public ai.r4 K;
    public boolean L;
    public final y4 b;
    public final ih.k c;
    public final gh.e d;
    public final bh.b e;
    public final ih.f f;
    public final qh.i h;
    public final f0 n;
    public final FrameLayout r;
    public final xp s;
    public final TextView v;
    public final q6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (d6) null, true, true);
        qn qnVar;
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
        e0 e0Var = new e0(this, context);
        this.containerView = e0Var;
        int i11 = this.backgroundPaddingLeft;
        final int i12 = 0;
        e0Var.setPadding(i11, 0, i11, 0);
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
        e0Var.V(e);
        y4 y4Var = new y4(context, this.currentAccount, d6Var);
        this.b = y4Var;
        y4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        y4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        y4Var.setLayoutBackground(new u5(y4Var, this.containerView, AndroidUtilities.dp(18.0f), q("paintChatActionBackground")));
        e0Var.addView(y4Var, z5.e(-2, -2, 48));
        ih.f fVar = new ih.f(context);
        this.f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(bVar.c(fVar, fh.c.b(d6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(bVar.c(fVar, fh.c.b(d6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        f0 f0Var = new f0(this, AndroidUtilities.getActivity(), e0Var);
        this.n = f0Var;
        f0Var.setInAppInsetsController(iVar);
        f0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        f0Var.y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        f0Var.x4 = false;
        f0Var.i2 = !AndroidUtilities.isInMultiwindow && ((qnVar = f0Var.P2) == null || !qnVar.isInBubbleMode());
        f0Var.S0(false, false, false);
        f0Var.d1(true, false);
        f0Var.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        f0Var.getSendButton().setAlpha(0.0f);
        f0Var.getEditField().setMaxLines(3);
        f0Var.setCustomWindowView(this.container);
        f0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(f0Var, z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(fVar.getFadeView(), z5.c(-1.0f, -1));
        this.containerView.addView(fVar, z5.c(-1.0f, -1));
        f0Var.setDelegate(new g0(this, tL_starGiftUnique));
        pf pfVar = f0Var.E0;
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
        this.containerView.addView(q6Var, z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        h0 h0Var = new h0(R.drawable.send_plane_24, context, d6Var, false);
        this.H = h0Var;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        h0Var.I = dp;
        h0Var.J = dp2;
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = AndroidUtilities.dp(8.0f);
        h0Var.M = dp3;
        h0Var.N = dp4;
        h0Var.h0 = true;
        this.containerView.addView(h0Var, z5.e(110, 50, 85));
        h0Var.setScrimViewBackgroundColor(getThemedColor(h6.d6));
        h0Var.setOnClickListener(new View.OnClickListener(this) { // from class: yh.d0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        i0 i0Var = this.b;
                        if (i0Var.E - i0Var.F >= 0) {
                            ai.r4 r4Var = i0Var.K;
                            if (r4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = i0Var.n.getTextWithEntities();
                                boolean z10 = i0Var.G;
                                l7 l7Var = (l7) r4Var.c;
                                i0 i0Var2 = (i0) r4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) r4Var.e;
                                long j11 = r4Var.b;
                                ag.b bVar2 = (ag.b) r4Var.f;
                                if (!i0Var2.L) {
                                    l7Var.D2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z10, i0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(i0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        i0 i0Var3 = this.b;
                        boolean z11 = i0Var3.G;
                        i0Var3.G = !z11;
                        i0Var3.s.a(z11, true);
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
        frameLayout.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        xp xpVar = new xp(context, 18, d6Var);
        this.s = xpVar;
        xpVar.getCheckBoxBase().j(true);
        xpVar.getCheckBoxBase().e = 0.9f;
        xpVar.b(i13, i13, h6.k7);
        xpVar.setDrawUnchecked(true);
        xpVar.a(!this.G, false);
        y4Var.getLayout().U = new ai.f4(this, i14);
        y4Var.getLayout().T = new ai.f4(this, 3);
        xpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(xpVar, z5.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new u5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), q("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: yh.d0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i0 i0Var = this.b;
                        if (i0Var.E - i0Var.F >= 0) {
                            ai.r4 r4Var = i0Var.K;
                            if (r4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = i0Var.n.getTextWithEntities();
                                boolean z10 = i0Var.G;
                                l7 l7Var = (l7) r4Var.c;
                                i0 i0Var2 = (i0) r4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) r4Var.e;
                                long j11 = r4Var.b;
                                ag.b bVar2 = (ag.b) r4Var.f;
                                if (!i0Var2.L) {
                                    l7Var.D2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z10, i0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(i0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        i0 i0Var3 = this.b;
                        boolean z11 = i0Var3.G;
                        i0Var3.G = !z11;
                        i0Var3.s.a(z11, true);
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
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: yh.d0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        i0 i0Var = this.b;
                        if (i0Var.E - i0Var.F >= 0) {
                            ai.r4 r4Var = i0Var.K;
                            if (r4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = i0Var.n.getTextWithEntities();
                                boolean z10 = i0Var.G;
                                l7 l7Var = (l7) r4Var.c;
                                i0 i0Var2 = (i0) r4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) r4Var.e;
                                long j11 = r4Var.b;
                                ag.b bVar2 = (ag.b) r4Var.f;
                                if (!i0Var2.L) {
                                    l7Var.D2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z10, i0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(i0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        i0 i0Var3 = this.b;
                        boolean z11 = i0Var3.G;
                        i0Var3.G = !z11;
                        i0Var3.s.a(z11, true);
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
        qg.h0 h0Var2 = new qg.h0(this, 29);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, h0Var2);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        f0 f0Var = this.n;
        if (f0Var == null || !f0Var.r0()) {
            super.onBackPressed();
        } else {
            f0Var.k0(true);
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
            new xc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.g0.h(r3.num, ',', sb2))), null).k(true);
        }
    }

    public final void p() {
        qh.i iVar = this.h;
        int i10 = iVar.f(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        y4 y4Var = this.b;
        FrameLayout frameLayout = this.r;
        y4Var.setTranslationY(Math.min(((dp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - y4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - y4Var.getHeight()));
        y4Var.invalidate();
        float y3 = y4Var.getY() - AndroidUtilities.dp(33.0f);
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
