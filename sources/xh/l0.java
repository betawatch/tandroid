package xh;

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
import ci.b7;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Components.a50;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.yd;
import org.telegram.ui.xe;
import org.telegram.ui.zn;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class l0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final k0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public xe K;
    public boolean L;
    public final a5 b;
    public final hh.k c;
    public final fh.e d;
    public final ah.c e;
    public final hh.f f;
    public final ph.i h;
    public final i0 n;
    public final FrameLayout r;
    public final dq s;
    public final TextView v;
    public final r6 w;
    public final ImageView x;
    public final Drawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (e6) null, true, true);
        zn znVar;
        final int i10 = 1;
        this.c = new hh.k();
        final int i11 = 0;
        ph.i iVar = new ph.i(new f0(this, i11));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j3;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        fh.e eVar = new fh.e();
        this.d = eVar;
        ah.c cVar = new ah.c(eVar);
        this.e = cVar;
        h0 h0Var = new h0(this, context);
        this.containerView = h0Var;
        int i12 = this.backgroundPaddingLeft;
        h0Var.setPadding(i12, 0, i12, 0);
        hh.j jVar = new hh.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        cVar.f = jVar;
        cVar.g = viewGroup;
        ph.e eVar2 = new ph.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.y = eVar2;
        iVar.E = viewGroup2;
        eVar2.d.add(iVar);
        Drawable e7 = b7.e(null, this.currentAccount, j3, i6.I.q());
        this.y = e7;
        h0Var.V(e7);
        a5 a5Var = new a5(context, this.currentAccount, e6Var);
        this.b = a5Var;
        a5Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        a5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        a5Var.setLayoutBackground(new v5(a5Var, this.containerView, AndroidUtilities.dp(18.0f), r("paintChatActionBackground")));
        h0Var.addView(a5Var, x5.e(-2, -2, 48));
        hh.f fVar = new hh.f(context);
        this.f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, eh.b.b(e6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, eh.b.b(e6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        i0 i0Var = new i0(this, AndroidUtilities.getActivity(), h0Var);
        this.n = i0Var;
        i0Var.setInAppInsetsController(iVar);
        i0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        i0Var.y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        i0Var.x4 = false;
        i0Var.i2 = !AndroidUtilities.isInMultiwindow && ((znVar = i0Var.P2) == null || !znVar.isInBubbleMode());
        i0Var.T0(false, false, false);
        i0Var.e1(true, false);
        i0Var.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        i0Var.getSendButton().setAlpha(0.0f);
        i0Var.getEditField().setMaxLines(3);
        i0Var.setCustomWindowView(this.container);
        i0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(i0Var, x5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        this.containerView.addView(fVar.getFadeView(), x5.d(-1.0f, -1));
        this.containerView.addView(fVar, x5.d(-1.0f, -1));
        i0Var.setDelegate(new j0(this, tL_starGiftUnique));
        sf sfVar = i0Var.E0;
        yd ydVar = new yd();
        InputFilter[] filters = sfVar.getFilters();
        if (filters == null) {
            sfVar.setFilters(new InputFilter[]{ydVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = ydVar;
            sfVar.setFilters(inputFilterArr);
        }
        r6 r6Var = new r6(context, false, false, false);
        this.w = r6Var;
        r6Var.setAllowCancel(true);
        r6Var.setScaleProperty(0.6f);
        r6Var.setVisibility(8);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTextColor(getThemedColor(i6.y6));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setGravity(17);
        this.containerView.addView(r6Var, x5.a(20.0f, 3.0f, 0.0f, 3.0f, 54.0f, 56, 85));
        k0 k0Var = new k0(R.drawable.send_plane_24, context, e6Var, false);
        this.H = k0Var;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        k0Var.I = dp;
        k0Var.J = dp2;
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = AndroidUtilities.dp(8.0f);
        k0Var.M = dp3;
        k0Var.N = dp4;
        k0Var.h0 = true;
        this.containerView.addView(k0Var, x5.e(110, 50, 85));
        k0Var.setScrimViewBackgroundColor(getThemedColor(i6.d6));
        k0Var.setOnClickListener(new View.OnClickListener(this) { // from class: xh.g0
            public final /* synthetic */ l0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        l0 l0Var = this.b;
                        if (l0Var.E - l0Var.F >= 0) {
                            xe xeVar = l0Var.K;
                            if (xeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = l0Var.n.getTextWithEntities();
                                boolean z10 = l0Var.G;
                                yh.s3 s3Var = (yh.s3) xeVar.c;
                                l0 l0Var2 = (l0) xeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                                long j10 = xeVar.b;
                                zf.b bVar = (zf.b) xeVar.f;
                                if (!l0Var2.L) {
                                    s3Var.d2(tL_starGiftUnique2, j10, bVar, textWithEntities, z10, l0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(l0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        l0 l0Var3 = this.b;
                        boolean z11 = l0Var3.G;
                        l0Var3.G = !z11;
                        l0Var3.s.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i13 = i6.ic;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new v5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, r("paintChatActionBackground")));
        this.containerView.addView(textView, x5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, x5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        dq dqVar = new dq(context, 18, e6Var);
        this.s = dqVar;
        dqVar.getCheckBoxBase().j(true);
        dqVar.getCheckBoxBase().e = 0.9f;
        dqVar.b(i13, i13, i6.k7);
        dqVar.setDrawUnchecked(true);
        dqVar.a(!this.G, false);
        a5Var.getLayout().R = new f0(this, i10);
        dqVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(dqVar, x5.a(18.0f, 10.0f, 0.0f, 0.0f, 0.0f, 18, 19));
        frameLayout.setBackground(new v5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: xh.g0
            public final /* synthetic */ l0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        l0 l0Var = this.b;
                        if (l0Var.E - l0Var.F >= 0) {
                            xe xeVar = l0Var.K;
                            if (xeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = l0Var.n.getTextWithEntities();
                                boolean z10 = l0Var.G;
                                yh.s3 s3Var = (yh.s3) xeVar.c;
                                l0 l0Var2 = (l0) xeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                                long j10 = xeVar.b;
                                zf.b bVar = (zf.b) xeVar.f;
                                if (!l0Var2.L) {
                                    s3Var.d2(tL_starGiftUnique2, j10, bVar, textWithEntities, z10, l0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(l0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        l0 l0Var3 = this.b;
                        boolean z11 = l0Var3.G;
                        l0Var3.G = !z11;
                        l0Var3.s.a(z11, true);
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
        v5 v5Var = new v5(imageView, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground"));
        int dp5 = AndroidUtilities.dp(32.0f);
        int dp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = gh.d.a;
        imageView.setBackground(new gh.c(dp5, dp6, v5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: xh.g0
            public final /* synthetic */ l0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        l0 l0Var = this.b;
                        if (l0Var.E - l0Var.F >= 0) {
                            xe xeVar = l0Var.K;
                            if (xeVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = l0Var.n.getTextWithEntities();
                                boolean z10 = l0Var.G;
                                yh.s3 s3Var = (yh.s3) xeVar.c;
                                l0 l0Var2 = (l0) xeVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                                long j10 = xeVar.b;
                                zf.b bVar = (zf.b) xeVar.f;
                                if (!l0Var2.L) {
                                    s3Var.d2(tL_starGiftUnique2, j10, bVar, textWithEntities, z10, l0Var2);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(l0Var.w);
                            break;
                        }
                        break;
                    case 1:
                        l0 l0Var3 = this.b;
                        boolean z11 = l0Var3.G;
                        l0Var3.G = !z11;
                        l0Var3.s.a(z11, true);
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
        r5.d dVar = new r5.d(this, 16);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, dVar);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        i0 i0Var = this.n;
        if (i0Var == null || !i0Var.r0()) {
            super.onBackPressed();
        } else {
            i0Var.k0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        tc.a(this.container, new ai.x4(this, 10));
        a50 a50Var = a50.s;
        if (a50Var.c()) {
            a50Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.I.title);
            sb2.append(" #");
            new ad(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.q.h(r3.num, ',', sb2))), null).k(true);
        }
    }

    public final void q() {
        ph.i iVar = this.h;
        int i10 = iVar.f(647).b;
        float dp = AndroidUtilities.dp(36.0f) + i10;
        float inputBubbleHeight = this.f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        a5 a5Var = this.b;
        FrameLayout frameLayout = this.r;
        a5Var.setTranslationY(Math.min(((dp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - a5Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - a5Var.getHeight()));
        a5Var.invalidate();
        float y3 = a5Var.getY() - AndroidUtilities.dp(33.0f);
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

    public final Paint r(String str) {
        e6 e6Var = this.resourcesProvider;
        Paint F = e6Var != null ? e6Var.F("paintChatActionBackground") : null;
        return F != null ? F : i6.T0("paintChatActionBackground");
    }
}
