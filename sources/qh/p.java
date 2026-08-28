package qh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import g7.e6;
import java.util.ArrayList;
import kh.b8;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ak;
import org.telegram.ui.ir0;
import org.telegram.ui.li0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p extends ci implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] M = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int A;
    public d1 B;
    public int C;
    public x60 D;
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public boolean J;
    public li0 K;
    public final d L;
    public final int n;
    public final o3 r;
    public final s3 s;
    public m.t3 v;
    public wy w;
    public boolean x;
    public boolean y;

    public p(int i9, Context context, b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        k kVar = new k(this);
        this.F = true;
        this.L = new d(this, 3);
        this.n = i9;
        this.h = true;
        this.f = true;
        o3 o3Var = new o3(context, i9, b6Var, new org.telegram.ui.Cells.e3(18, this, b6Var));
        this.r = o3Var;
        o3Var.setAdaptiveLinkDialogs(false);
        o3Var.setAllowTapAboveContent(false);
        addView(o3Var, e6.e(-1, -1, 119));
        addView(o3Var.getOverlayView(), e6.e(-1, -1, 119));
        o3Var.z4();
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        s3 s3Var = new s3(context, kVar);
        this.s = s3Var;
        s3Var.setBackVisible(false);
        s3Var.setTopGradientVisible(false);
        X();
        addView(s3Var, e6.e(-1, -1, 119));
        W();
        Y();
        U(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void J(p pVar) {
        int i9 = 0;
        if (!(pVar.r.k3() || pVar.x)) {
            ki kiVar = pVar.b;
            if (!kiVar.N && kiVar.O0) {
                i9 = AndroidUtilities.dp(62.0f);
            }
        }
        if (pVar.G != i9) {
            pVar.G = i9;
            pVar.R();
        }
    }

    public static void K(p pVar) {
        o3 o3Var = pVar.r;
        if (pVar.x) {
            d1 P2 = o3Var.P2();
            if (P2 != null) {
                P2.r();
                AndroidUtilities.showKeyboard(P2);
            }
            pVar.Q(true);
            return;
        }
        ki kiVar = pVar.b;
        if (pVar.w == null) {
            wy wyVar = new wy(kiVar.b0, true, false, false, pVar.getContext(), true, null, kiVar.n1, true, pVar.a, false, false);
            pVar.w = wyVar;
            wyVar.setVisibility(8);
            wy wyVar2 = pVar.w;
            wyVar2.t2 = false;
            wyVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = pVar.w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.w.setDelegate(new n(pVar));
            pVar.addView(pVar.w, e6.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.w.setLayoutParams(layoutParams);
        pVar.w.setTranslationY(0.0f);
        pVar.w.setVisibility(0);
        pVar.x = true;
        pVar.A = emojiPanelHeight;
        d1 P22 = o3Var.P2();
        if (P22 != null) {
            AndroidUtilities.hideKeyboard(P22);
        }
        s3 s3Var = pVar.s;
        if (s3Var != null) {
            s3Var.setEmojiOpened(true);
        }
        pVar.U(false);
        pVar.requestLayout();
    }

    public static d1 L(p pVar) {
        o3 o3Var = pVar.r;
        d1 focusedEditTextOrNull = o3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            d1 d1Var = pVar.B;
            return d1Var != null ? d1Var : o3Var.P2();
        }
        pVar.B = focusedEditTextOrNull;
        pVar.C = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int M(p pVar, d1 d1Var) {
        return (d1Var != pVar.B || pVar.r.getFocusedEditTextOrNull() == d1Var) ? Math.max(0, d1Var.getSelectionEnd()) : Math.min(pVar.C, d1Var.length());
    }

    public static void N(p pVar, int i9, int i10) {
        ki kiVar = pVar.b;
        if (kiVar.b0 == null) {
            return;
        }
        ki kiVar2 = new ki(pVar.getContext(), kiVar.b0, false, false, true, pVar.a);
        kiVar2.V1 = new l(pVar, kiVar2);
        kiVar2.f0.e0();
        kiVar2.J1(1, true);
        kiVar2.h1(i9);
        kiVar2.p2 = new e(pVar, kiVar2);
        kiVar2.U = new e(pVar, kiVar2);
        kiVar2.T = new m(pVar, kiVar2);
        kiVar2.r1();
        if (i10 != 0) {
            kiVar2.A1(i10);
        }
        kiVar2.setFocusable(true);
        kiVar2.show();
    }

    public static void T(Context context, final String str, final Utilities.Callback callback, b6 b6Var) {
        int i9 = 1;
        org.telegram.ui.ActionBar.f3 j10 = ll.j(context, b6Var, true, false);
        LinearLayout f10 = ll.f(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(f6.b0(AndroidUtilities.dp(8.0f), f6.l1(0.05f, f6.v0(f6.G6, b6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, e6.t(-1, -2, 49, 12, 2, 12, 0));
        kh.d i10 = ll.i(24, context, b6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        bg.p0 p0Var = new bg.p0(strArr, horizontalScrollView, i10, zArr2, new b8(strArr, 26), imageView, b6Var, new int[]{6}, 7);
        final org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, b6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(f6.b0(AndroidUtilities.dp(24.0f), f6.v0(f6.d6, b6Var)));
        j3Var.setText(strArr[0]);
        h3Var.addTextChangedListener(new o(strArr, p0Var));
        f10.addView(j3Var, e6.t(-1, -2, 55, 12, 8, 12, 0));
        i10.setText(LocaleController.getString(R.string.Done));
        f10.addView(i10, e6.t(-1, 48, 55, 12, 12, 12, 12));
        p0Var.run();
        j10.customView = f10;
        j10.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: qh.j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.h3 h3Var2 = org.telegram.ui.Cells.j3.this.b;
                h3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(h3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                callback.run(strArr2[0]);
            }
        });
        j10.show();
        int i11 = f6.a7;
        j10.setBackgroundColor(f6.v0(i11, b6Var));
        j10.fixNavigationBar(f6.v0(i11, b6Var));
        i10.setOnClickListener(new ih.d0(i10, zArr, callback, strArr, j10, 15));
        AndroidUtilities.runOnUIThread(new pf.o1(j3Var, i9), 200L);
    }

    private int getEmojiPanelHeight() {
        int R = this.b.n1.R();
        if (R <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            R = globalEmojiSettings.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", AndroidUtilities.dp(200.0f));
        }
        if (R <= 0) {
            R = AndroidUtilities.dp(200.0f);
        }
        return R + AndroidUtilities.navigationBarHeight;
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        this.b.T0.setTitle("");
        this.r.U2.N(false);
        U(false);
        post(new d(this, 4));
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean H(int i9, boolean z10, int i10, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        ak akVar;
        int i11 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i11).richEditorAllowed();
        o3 o3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i11).isPremium() && t4.f(o3Var.h3, o3Var.i3)) {
            x1.o0(getContext(), new b(o3Var, 0), new d(this, 2), this.a);
            return false;
        }
        if (o3Var.k3() && !o3Var.m3()) {
            if (o3Var.M3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i11).richEditorAllowed();
                ki kiVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList Z2 = o3Var.Z2();
                    if (!Z2.isEmpty()) {
                        ArrayList B2 = o3Var.B2();
                        ArrayList y22 = o3Var.y2();
                        ArrayList a2 = s4.a(i11, Z2);
                        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
                        if (o2Var instanceof qn) {
                            qn qnVar = (qn) o2Var;
                            MessageObject messageObject3 = qnVar.j5;
                            MessageObject messageObject4 = qnVar.T3;
                            j11 = qnVar.N8();
                            sendMessageChatArguments = qnVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(kiVar.F1), Z2, B2, y22, a2, false, kiVar.n1(), messageObject, messageObject2, z10, i9, i10, sendMessageChatArguments, j10, j11, 0L);
                        kiVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.b0;
                    if ((o2Var2 instanceof qn) && (akVar = ((qn) o2Var2).U) != null) {
                        akVar.R0(t4.k(o3Var.h3), z10, i9, i10);
                        kiVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                s3 s3Var = this.s;
                if (s3Var != null) {
                    s3Var.setSendEnabled(o3Var.M3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean I() {
        return !this.r.k3();
    }

    public final void O(x60 x60Var, a aVar, TL_iv.PageBlock pageBlock, int i9, String str, int i10, x60 x60Var2) {
        x60Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i9, null, str, new ir0(this, aVar, pageBlock, x60Var2, 24));
        x60Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        x60Var.y().a.setTextSize(1, i10);
    }

    public final boolean P() {
        o3 o3Var = this.r;
        if (o3Var == null || !o3Var.k3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i9 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: qh.i
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                switch (i9) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        p pVar = this.b;
                        pVar.S();
                        pVar.b.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.b2(this) { // from class: qh.i
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i102) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        p pVar = this.b;
                        pVar.S();
                        pVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void Q(boolean z10) {
        if (this.y) {
            this.y = false;
            wy wyVar = this.w;
            if (wyVar != null) {
                wyVar.t(false);
                if (!z10) {
                    this.w.A();
                }
            }
        }
        this.B = null;
        wy wyVar2 = this.w;
        if (wyVar2 != null) {
            wyVar2.setTranslationY(0.0f);
            this.w.setVisibility(8);
        }
        this.x = false;
        this.A = 0;
        s3 s3Var = this.s;
        if (s3Var != null) {
            s3Var.setEmojiOpened(false);
        }
        U(false);
        requestLayout();
    }

    public final void R() {
        float f10;
        float f11;
        int dp = this.y ? AndroidUtilities.dp(245.0f) : this.A;
        wy wyVar = this.w;
        ki kiVar = this.b;
        if (wyVar != null) {
            if (this.x) {
                f11 = (this.A - dp) + (this.y ? -kiVar.h2 : 0.0f);
            } else {
                f11 = 0.0f;
            }
            wyVar.setTranslationY(f11);
        }
        s3 s3Var = this.s;
        if (s3Var != null) {
            boolean z10 = this.x;
            if (z10) {
                f10 = dp;
            } else {
                f10 = (this.H || this.A > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z10 || this.y) {
                f10 += kiVar.h2;
            }
            s3Var.getBottomContainer().animate().cancel();
            s3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.x;
            float f12 = z11 ? dp : 0.0f;
            if (!z11 || this.y) {
                f12 += kiVar.h2;
            }
            s3Var.setBottomGradientTranslationY(-f12);
            if (this.I != this.G) {
                ViewPropertyAnimator animate = s3Var.getBottomInnerContainer().animate();
                this.I = this.G;
                animate.translationY(-r1).setDuration(320L).setInterpolator(gr.h).start();
            }
        }
    }

    public final boolean S() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.b0;
        if (!(o2Var instanceof qn)) {
            return false;
        }
        qn qnVar = (qn) o2Var;
        o3 o3Var = this.r;
        if (!o3Var.r2()) {
            return false;
        }
        TL_iv.RichMessage j22 = o3Var.j2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(qnVar.a(), qnVar.B7(qnVar.j5), "", null, null, null, null, 0L, false, false, j22);
        ak akVar = qnVar.U;
        if (akVar == null) {
            return true;
        }
        akVar.setRichDraftPreview(j22);
        return true;
    }

    public final void U(boolean z10) {
        int i9 = 0;
        boolean z11 = this.r.k3() || this.x;
        ki kiVar = this.b;
        mh mhVar = kiVar.t1;
        if (kiVar.q2 != z11) {
            kiVar.q2 = z11;
            if (kiVar.O0) {
                mhVar.animate().cancel();
                if (!z11) {
                    mhVar.setVisibility(0);
                }
                if (z10) {
                    mhVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new fh(kiVar, z11, 3)).start();
                } else {
                    mhVar.setAlpha(z11 ? 0.0f : 1.0f);
                    mhVar.setTranslationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f);
                    mhVar.setVisibility(z11 ? 4 : 0);
                }
            }
        }
        if (!z11 && !kiVar.N && kiVar.O0) {
            i9 = AndroidUtilities.dp(62.0f);
        }
        this.G = i9;
        R();
        if (this.F == z11) {
            this.F = !z11;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        int i9;
        boolean z10;
        boolean z11;
        int i10;
        o3 o3Var = this.r;
        n9 textSelectionHelper = o3Var.getTextSelectionHelper();
        s3 s3Var = this.s;
        if (s3Var == null || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        int[] B4 = o3Var.B4();
        s3Var.setQuoteState(B4 != null && o3Var.H3(B4[0], B4[1]));
        boolean L3 = o3Var.L3();
        int[] iArr = M;
        if (L3) {
            n9 textSelectionHelper2 = o3Var.getTextSelectionHelper();
            int i11 = textSelectionHelper2.u0;
            int i12 = textSelectionHelper2.v0;
            int i13 = textSelectionHelper2.y0;
            int i14 = textSelectionHelper2.w0;
            int i15 = textSelectionHelper2.z0;
            int i16 = 0;
            for (int i17 = 0; i17 < 8; i17++) {
                int i18 = iArr[i17];
                if (this.r.K3(i18, i11, i12, i14, i13, i15)) {
                    i16 |= i18;
                }
            }
            boolean z12 = i12 == i13;
            d1 N4 = z12 ? o3Var.N4(i11, i12) : null;
            int max = Math.max(0, Math.min(i14, i15));
            int max2 = N4 == null ? 0 : Math.max(0, Math.min(Math.max(i14, i15), N4.length()));
            this.s.c(i16, N4 != null && max < max2 && u5.h(N4.getText(), max, max2), N4 != null && max < max2 && u5.g(N4.getText(), max, max2), z12, o3Var.l2(), true);
            return;
        }
        if (o3Var.w3()) {
            n9 textSelectionHelper3 = o3Var.getTextSelectionHelper();
            d1 s22 = o3Var.s2(textSelectionHelper3.u0);
            int i19 = textSelectionHelper3.w0;
            int i20 = textSelectionHelper3.z0;
            int max3 = s22 == null ? 0 : Math.max(0, Math.min(Math.min(i19, i20), s22.length()));
            int max4 = s22 == null ? 0 : Math.max(0, Math.min(Math.max(i19, i20), s22.length()));
            if (s22 == null || max3 >= max4) {
                i10 = 0;
            } else {
                int i21 = 0;
                for (int i22 = 0; i22 < 8; i22++) {
                    int i23 = iArr[i22];
                    if ((s22.getCurrentStyle(max3, max4) & i23) != 0) {
                        i21 |= i23;
                    }
                }
                i10 = i21;
            }
            this.s.c(i10, s22 != null && max3 < max4 && u5.h(s22.getText(), max3, max4), s22 != null && max3 < max4 && u5.g(s22.getText(), max3, max4), true, o3Var.l2(), true);
            return;
        }
        int i24 = textSelectionHelper.u0;
        int i25 = textSelectionHelper.x0;
        int i26 = textSelectionHelper.w0;
        int i27 = textSelectionHelper.z0;
        boolean z13 = i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < o3Var.l4.size();
        if (z13) {
            int i28 = 0;
            int i29 = 0;
            while (i28 < 8) {
                int i30 = iArr[i28];
                int i31 = i27;
                if (this.r.J3(i30, i24, i26, i25, i31)) {
                    i29 |= i30;
                }
                i28++;
                i27 = i31;
            }
            i9 = i29;
        } else {
            i9 = 0;
        }
        int i32 = i27;
        if (z13) {
            Editable H4 = o3Var.H4(i24, i26, i25, i32);
            if (H4 == null ? false : u5.h(H4, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                z10 = true;
                if (z13) {
                    Editable H42 = o3Var.H4(i24, i26, i25, i32);
                    if (H42 == null ? false : u5.g(H42, Math.max(0, Math.min(i26, i32)), Math.max(i26, i32))) {
                        z11 = true;
                        this.s.c(i9, z10, z11, !z13 && i24 == i25, o3Var.l2(), !o3Var.I3());
                    }
                }
                z11 = false;
                if (z13) {
                }
                this.s.c(i9, z10, z11, !z13 && i24 == i25, o3Var.l2(), !o3Var.I3());
            }
        }
        z10 = false;
        if (z13) {
        }
        z11 = false;
        if (z13) {
        }
        this.s.c(i9, z10, z11, !z13 && i24 == i25, o3Var.l2(), !o3Var.I3());
    }

    public final void W() {
        s3 s3Var = this.s;
        if (s3Var != null) {
            o3 o3Var = this.r;
            boolean r22 = o3Var.r2();
            b2 b2Var = o3Var.F3;
            boolean z10 = (b2Var == null || b2Var.c.isEmpty()) ? false : true;
            ImageView imageView = s3Var.r;
            ImageView imageView2 = s3Var.n;
            imageView2.setEnabled(r22);
            imageView2.setAlpha(r22 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void X() {
        s3 s3Var = this.s;
        if (s3Var != null) {
            int i9 = this.n;
            boolean z10 = false;
            boolean z11 = (MessagesController.getInstance(i9).richEditorAllowed() || UserConfig.getInstance(i9).isPremium()) ? false : true;
            lg sendButton = s3Var.getSendButton();
            if (z11) {
                o3 o3Var = this.r;
                if (t4.f(o3Var.h3, o3Var.i3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            s3Var.setPremiumLocked(z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y() {
        a Q2;
        s3 s3Var = this.s;
        if (s3Var == null) {
            return;
        }
        o3 o3Var = this.r;
        n9 textSelectionHelper = o3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            Q2 = o3Var.Q2();
        } else {
            int i9 = textSelectionHelper.u0;
            Q2 = i9 == textSelectionHelper.x0 ? o3Var.y4(i9) : null;
        }
        int i10 = 4;
        int i11 = 0;
        if (o3Var.R2() == null) {
            if (Q2 != null) {
                if (!Q2.a() && !Q2.b() && !Q2.c()) {
                    TL_iv.PageBlock pageBlock = Q2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i10 = 7;
                            } else {
                                if (!o3.C3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = Q2.b;
                                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
                                        if (!(pageBlock2 instanceof TL_iv.pageBlockPreformatted)) {
                                            if (!(pageBlock2 instanceof TL_iv.pageBlockBlockquote)) {
                                            }
                                        }
                                    }
                                }
                                i10 = 1;
                            }
                        }
                    }
                }
                i10 = 2;
            }
            i10 = 0;
        }
        if (Q2 != null) {
            if (i10 == 1) {
                TL_iv.PageBlock pageBlock3 = Q2.b;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i11 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i11 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i11 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i11 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i11 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i11 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i11 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i11 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i11 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i11 = R.drawable.iv_footer;
                }
            } else if (i10 == 2) {
                if (Q2.a()) {
                    i11 = R.drawable.iv_todo;
                } else if (Q2.c()) {
                    i11 = R.drawable.iv_ordered_list;
                }
            }
        }
        s3Var.d(i10, i11);
    }

    public final void Z() {
        int paddingTop;
        s3 s3Var = this.s;
        if (s3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        o3 o3Var = this.r;
        if (o3Var.getChildCount() <= 0) {
            paddingTop = o3Var.getPaddingTop();
        } else {
            int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i10 = 0; i10 < o3Var.getChildCount(); i10++) {
                View childAt = o3Var.getChildAt(i10);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i9) {
                    i9 = childAt.getTop();
                }
            }
            paddingTop = i9 == Integer.MAX_VALUE ? o3Var.getPaddingTop() : i9;
        }
        s3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
            X();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        o3 o3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.b0 instanceof qn) && o3Var.r2() && S()) {
                org.telegram.messenger.l0.p(R.string.RichEditorDraftSaved, new oc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!o3Var.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wy wyVar;
        o3 o3Var = this.r;
        c3 c3Var = o3Var.j3;
        z9 z9Var = o3Var.k3;
        if (c3Var.y() && z9Var.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (wyVar = this.w) == null) ? getHeight() - this.A : (int) wyVar.getY()) - AndroidUtilities.dp(60.0f)) - this.G;
        if (motionEvent.getAction() == 0 && this.x && motionEvent.getY() < height) {
            Q(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && z9Var.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !o3Var.i3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        o3 o3Var = this.r;
        if (o3Var.getChildCount() <= 0) {
            int paddingTop = o3Var.getPaddingTop();
            this.E = paddingTop;
            o3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        for (int i10 = 0; i10 < o3Var.getChildCount(); i10++) {
            View childAt = o3Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z10 = true;
            }
            if (R >= 0 && childAt.getTop() < i9) {
                i9 = childAt.getTop();
            }
        }
        if (i9 == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        o3Var.setTopGlowOffset(Math.max(0, i9));
        int i11 = i9 - AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(7.0f);
        if (i11 < AndroidUtilities.dp(7.0f) || !z10) {
            i11 = dp;
        }
        this.E = i11;
        return i11;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public n9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.ci
    public final int h() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean i() {
        boolean z10 = this.y;
        if (z10) {
            if (z10) {
                this.y = false;
                wy wyVar = this.w;
                if (wyVar != null) {
                    wyVar.t(false);
                    this.w.A();
                }
                R();
                return false;
            }
        } else {
            if (this.x) {
                Q(false);
                return false;
            }
            if (!this.r.F2() && !P()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ci
    public final void k(float f10) {
        R();
    }

    @Override // org.telegram.ui.Components.ci
    public final void m() {
        li0 li0Var = this.K;
        if (li0Var != null) {
            li0Var.i();
            this.K = null;
        }
        m.t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.c();
        }
        o3 o3Var = this.r;
        if (o3Var != null) {
            o3Var.v2();
        }
        wy wyVar = this.w;
        if (wyVar != null) {
            wyVar.D();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean n() {
        o3 o3Var = this.r;
        if (o3Var == null) {
            return false;
        }
        o3Var.v2();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean p() {
        return P();
    }

    @Override // org.telegram.ui.Components.ci
    public final void r() {
        m.t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.c();
        }
        if (this.x) {
            Q(false);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.J) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.ci
    public final void v() {
        this.H = this.b.n1.R() > AndroidUtilities.dp(20.0f);
        R();
        Z();
    }

    @Override // org.telegram.ui.Components.ci
    public final void w(int i9, boolean z10) {
        this.H = z10;
        R();
        if (z10 && this.x && !this.y) {
            Q(false);
        }
        Z();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int dp;
        int i11;
        x60 x60Var;
        boolean z10 = this.H;
        ki kiVar = this.b;
        boolean z11 = kiVar.n1.R() > AndroidUtilities.dp(20.0f);
        this.H = z11;
        if (!z11 && z10 && (x60Var = this.D) != null) {
            x60Var.u();
            this.D = null;
        }
        if (this.H || this.A > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(52.0f);
            kiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    dp = i11 - AndroidUtilities.dp(52.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    kiVar.setAllowNestedScroll(true);
                }
            }
            i11 = (i10 / 5) * 2;
            dp = i11 - AndroidUtilities.dp(52.0f);
            if (dp < 0) {
            }
            kiVar.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + dp;
        o3 o3Var = this.r;
        int C = org.telegram.messenger.l0.C(110.0f, (this.H || this.A > 0) ? 0 : AndroidUtilities.navigationBarHeight, (o3Var.k3() || this.x || !kiVar.O0) ? 0 : AndroidUtilities.dp(62.0f)) + this.A;
        if (o3Var.getPaddingTop() != currentActionBarHeight || o3Var.getPaddingBottom() != C) {
            this.J = true;
            o3Var.o1(0, currentActionBarHeight, 0, C);
            this.J = false;
        }
        Z();
    }

    @Override // org.telegram.ui.Components.ci
    public final void q() {
    }
}
