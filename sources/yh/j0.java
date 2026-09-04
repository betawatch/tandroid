package yh;

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
import di.d7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import org.telegram.ui.xe;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final i0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public xe K;
    public boolean L;
    public final y4 b;
    public final ih.l c;
    public final gh.e d;
    public final bh.b e;
    public final ih.g f;
    public final qh.i h;
    public final g0 n;
    public final FrameLayout r;
    public final mp s;
    public final TextView v;
    public final q6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (f6) null, true, true);
        co coVar;
        final int i10 = 1;
        this.c = new ih.l();
        final int i11 = 0;
        qh.i iVar = new qh.i(new d0(this, i11));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j3;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        gh.e eVar = new gh.e();
        this.d = eVar;
        bh.b bVar = new bh.b(eVar);
        this.e = bVar;
        f0 f0Var = new f0(this, context);
        this.containerView = f0Var;
        int i12 = this.backgroundPaddingLeft;
        f0Var.setPadding(i12, 0, i12, 0);
        ih.k kVar = new ih.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar.d = kVar;
        bVar.e = viewGroup;
        qh.e eVar2 = new qh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.E = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e7 = d7.e(null, this.currentAccount, j3, j6.I.q());
        this.y = e7;
        f0Var.V(e7);
        y4 y4Var = new y4(context, this.currentAccount, f6Var);
        this.b = y4Var;
        y4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        y4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        y4Var.setLayoutBackground(new v5(y4Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        f0Var.addView(y4Var, x5.e(-2, -2, 48));
        ih.g gVar = new ih.g(context);
        this.f = gVar;
        gVar.setClipChildren(false);
        gVar.setWindowInsetsProvider(iVar);
        gVar.setInputIslandBubbleDrawable(bVar.c(gVar, fh.b.b(f6Var), false));
        gVar.setUnderKeyboardBackgroundDrawable(bVar.c(gVar, fh.b.b(f6Var), false));
        FrameLayout inputIslandBubbleContainer = gVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = gVar.getInAppKeyboardBubbleContainer();
        g0 g0Var = new g0(this, AndroidUtilities.getActivity(), f0Var);
        this.n = g0Var;
        g0Var.setInAppInsetsController(iVar);
        g0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        g0Var.x4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        g0Var.w4 = false;
        g0Var.h2 = !AndroidUtilities.isInMultiwindow && ((coVar = g0Var.O2) == null || !coVar.isInBubbleMode());
        g0Var.V0(false, false, false);
        g0Var.g1(true, false);
        g0Var.y1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        g0Var.getSendButton().setAlpha(0.0f);
        g0Var.getEditField().setMaxLines(3);
        g0Var.setCustomWindowView(this.container);
        g0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(g0Var, x5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(gVar.getFadeView(), x5.c(-1.0f, -1));
        this.containerView.addView(gVar, x5.c(-1.0f, -1));
        g0Var.setDelegate(new h0(this, tL_starGiftUnique));
        qf qfVar = g0Var.E0;
        vd vdVar = new vd();
        InputFilter[] filters = qfVar.getFilters();
        if (filters == null) {
            qfVar.setFilters(new InputFilter[]{vdVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = vdVar;
            qfVar.setFilters(inputFilterArr);
        }
        q6 q6Var = new q6(context, false, false, false);
        this.w = q6Var;
        q6Var.setAllowCancel(true);
        q6Var.setScaleProperty(0.6f);
        q6Var.setVisibility(8);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(getThemedColor(j6.y6));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setGravity(17);
        this.containerView.addView(q6Var, x5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        i0 i0Var = new i0(R.drawable.send_plane_24, context, f6Var, false);
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
        this.containerView.addView(i0Var, x5.e(110, 50, 85));
        i0Var.setScrimViewBackgroundColor(getThemedColor(j6.d6));
        i0Var.setOnClickListener(new View.OnClickListener(this) { // from class: yh.e0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        j0 j0Var = this.b;
                        if (j0Var.E - j0Var.F >= 0) {
                            xe xeVar = j0Var.K;
                            if (xeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = j0Var.n.getTextWithEntities();
                                boolean z10 = j0Var.G;
                                zh.w3 w3Var = (zh.w3) xeVar.c;
                                j0 j0Var2 = (j0) xeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                                long j10 = xeVar.b;
                                zf.b bVar2 = (zf.b) xeVar.f;
                                if (!j0Var2.L) {
                                    w3Var.c2(tL_starGiftUnique2, j10, bVar2, textWithEntities, z10, j0Var2);
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
        int i13 = j6.ic;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new v5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, x5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, x5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        mp mpVar = new mp(context, 18, f6Var);
        this.s = mpVar;
        mpVar.getCheckBoxBase().j(true);
        mpVar.getCheckBoxBase().e = 0.9f;
        mpVar.b(i13, i13, j6.k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(!this.G, false);
        y4Var.getLayout().R = new d0(this, i10);
        mpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(mpVar, x5.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new v5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
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
                            xe xeVar = j0Var.K;
                            if (xeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = j0Var.n.getTextWithEntities();
                                boolean z10 = j0Var.G;
                                zh.w3 w3Var = (zh.w3) xeVar.c;
                                j0 j0Var2 = (j0) xeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                                long j10 = xeVar.b;
                                zf.b bVar2 = (zf.b) xeVar.f;
                                if (!j0Var2.L) {
                                    w3Var.c2(tL_starGiftUnique2, j10, bVar2, textWithEntities, z10, j0Var2);
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
        this.containerView.addView(frameLayout, x5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        v5 v5Var = new v5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = hh.d.a;
        imageView.setBackground(new hh.c(dp5, dp6, v5Var));
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
                            xe xeVar = j0Var.K;
                            if (xeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = j0Var.n.getTextWithEntities();
                                boolean z10 = j0Var.G;
                                zh.w3 w3Var = (zh.w3) xeVar.c;
                                j0 j0Var2 = (j0) xeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                                long j10 = xeVar.b;
                                zf.b bVar2 = (zf.b) xeVar.f;
                                if (!j0Var2.L) {
                                    w3Var.c2(tL_starGiftUnique2, j10, bVar2, textWithEntities, z10, j0Var2);
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
        this.containerView.addView(imageView, x5.e(56, 56, 53));
        z5.b(frameLayout, 0.05f, 1.2f);
        z5.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        rg.p2 p2Var = new rg.p2(this, 16);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(viewGroup3, p2Var);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        qh.i iVar = this.h;
        int i10 = iVar.e(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        g0 g0Var = this.n;
        if (g0Var == null || !g0Var.t0()) {
            super.onBackPressed();
        } else {
            g0Var.m0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        qc.a(this.container, new ah.n0(this, 11));
        j40 j40Var = j40.s;
        if (j40Var.c()) {
            j40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.I.title);
            sb2.append(" #");
            new yc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), i2.g.k(r3.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        f6 f6Var = this.resourcesProvider;
        Paint G = f6Var != null ? f6Var.G("paintChatActionBackground") : null;
        return G != null ? G : j6.S0("paintChatActionBackground");
    }
}
