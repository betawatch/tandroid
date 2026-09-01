package wh;

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
import java.util.ArrayList;
import k7.c6;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.jk;
import org.telegram.ui.ti0;
import org.telegram.ui.xn;
import org.telegram.ui.yx0;
import qh.v9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class q extends ei implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] N = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int B;
    public e1 C;
    public int D;
    public q70 E;
    public int F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public boolean K;
    public ti0 L;
    public final e M;
    public final int n;
    public final r3 r;
    public final v3 s;
    public m.r3 v;
    public mz w;
    public boolean x;
    public boolean y;

    public q(int i10, Context context, g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        l lVar = new l(this);
        this.G = true;
        this.M = new e(this, 3);
        this.n = i10;
        this.h = true;
        this.f = true;
        r3 r3Var = new r3(context, i10, g6Var, new q5.g0(this, g6Var, false, 13));
        this.r = r3Var;
        r3Var.setAdaptiveLinkDialogs(false);
        r3Var.setAllowTapAboveContent(false);
        addView(r3Var, c6.e(-1, -1, 119));
        addView(r3Var.getOverlayView(), c6.e(-1, -1, 119));
        r3Var.z4();
        d2 d2Var = r3Var.G3;
        if (d2Var != null) {
            d2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        v3 v3Var = new v3(context, lVar);
        this.s = v3Var;
        v3Var.setBackVisible(false);
        v3Var.setTopGradientVisible(false);
        Y();
        addView(v3Var, c6.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void J(q qVar) {
        int i10 = 0;
        if (!(qVar.r.k3() || qVar.x)) {
            mi miVar = qVar.b;
            if (!miVar.O && miVar.P0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (qVar.H != i10) {
            qVar.H = i10;
            qVar.S();
        }
    }

    public static void K(q qVar) {
        r3 r3Var = qVar.r;
        if (qVar.x) {
            e1 P2 = r3Var.P2();
            if (P2 != null) {
                P2.r();
                AndroidUtilities.showKeyboard(P2);
            }
            qVar.R(true);
            return;
        }
        mi miVar = qVar.b;
        if (qVar.w == null) {
            mz mzVar = new mz(miVar.c0, true, false, false, qVar.getContext(), true, null, miVar.o1, true, qVar.a, false, false);
            qVar.w = mzVar;
            mzVar.setVisibility(8);
            mz mzVar2 = qVar.w;
            mzVar2.u2 = false;
            mzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = qVar.w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            qVar.w.setDelegate(new o(qVar));
            qVar.addView(qVar.w, c6.e(-1, qVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = qVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        qVar.w.setLayoutParams(layoutParams);
        qVar.w.setTranslationY(0.0f);
        qVar.w.setVisibility(0);
        qVar.x = true;
        qVar.B = emojiPanelHeight;
        e1 P22 = r3Var.P2();
        if (P22 != null) {
            AndroidUtilities.hideKeyboard(P22);
        }
        v3 v3Var = qVar.s;
        if (v3Var != null) {
            v3Var.setEmojiOpened(true);
        }
        qVar.V(false);
        qVar.requestLayout();
    }

    public static e1 M(q qVar) {
        r3 r3Var = qVar.r;
        e1 focusedEditTextOrNull = r3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            e1 e1Var = qVar.C;
            return e1Var != null ? e1Var : r3Var.P2();
        }
        qVar.C = focusedEditTextOrNull;
        qVar.D = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int N(q qVar, e1 e1Var) {
        return (e1Var != qVar.C || qVar.r.getFocusedEditTextOrNull() == e1Var) ? Math.max(0, e1Var.getSelectionEnd()) : Math.min(qVar.D, e1Var.length());
    }

    public static void O(q qVar, int i10, int i11) {
        mi miVar = qVar.b;
        if (miVar.c0 == null) {
            return;
        }
        mi miVar2 = new mi(qVar.getContext(), miVar.c0, false, false, true, qVar.a);
        miVar2.W1 = new m(qVar, miVar2);
        miVar2.g0.f0();
        miVar2.J1(1, true);
        miVar2.h1(i10);
        miVar2.q2 = new f(qVar, miVar2);
        miVar2.V = new f(qVar, miVar2);
        miVar2.U = new n(qVar, miVar2);
        miVar2.r1();
        if (i11 != 0) {
            miVar2.A1(i11);
        }
        miVar2.setFocusable(true);
        miVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, g6 g6Var) {
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, true, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(k6.b0(AndroidUtilities.dp(8.0f), k6.l1(0.05f, k6.v0(k6.G6, g6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, c6.t(-1, -2, 49, 12, 2, 12, 0));
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        hg.k0 k0Var = new hg.k0(strArr, horizontalScrollView, p10, zArr2, new qh.d4(strArr, 27), imageView, g6Var, new int[]{6}, 6);
        final org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, g6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(k6.b0(AndroidUtilities.dp(24.0f), k6.v0(k6.d6, g6Var)));
        i3Var.setText(strArr[0]);
        g3Var.addTextChangedListener(new p(strArr, k0Var));
        f10.addView(i3Var, c6.t(-1, -2, 55, 12, 8, 12, 0));
        p10.setText(LocaleController.getString(R.string.Done));
        f10.addView(p10, c6.t(-1, 48, 55, 12, 12, 12, 12));
        k0Var.run();
        o10.customView = f10;
        o10.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: wh.k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.g3 g3Var2 = org.telegram.ui.Cells.i3.this.b;
                g3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(g3Var2);
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
        o10.show();
        int i10 = k6.a7;
        o10.setBackgroundColor(k6.v0(i10, g6Var));
        o10.fixNavigationBar(k6.v0(i10, g6Var));
        p10.setOnClickListener(new oh.b0(p10, zArr, callback, strArr, o10, 15));
        AndroidUtilities.runOnUIThread(new v9(i3Var, 26), 200L);
    }

    private int getEmojiPanelHeight() {
        int R = this.b.o1.R();
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

    @Override // org.telegram.ui.Components.ei
    public final void D(ei eiVar) {
        this.b.U0.setTitle("");
        this.r.V2.N(false);
        V(false);
        post(new e(this, 4));
    }

    @Override // org.telegram.ui.Components.ei
    public final void F() {
        this.r.x0(0);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean H(int i10, boolean z4, int i11, boolean z10, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        jk jkVar;
        int i12 = this.n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        r3 r3Var = this.r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && w4.f(r3Var.i3, r3Var.j3)) {
            z1.p0(getContext(), new b(r3Var, 0), new e(this, 2), this.a);
            return false;
        }
        if (r3Var.k3() && !r3Var.m3()) {
            if (r3Var.M3()) {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                mi miVar = this.b;
                if (richEditorAllowed2) {
                    ArrayList Z2 = r3Var.Z2();
                    if (!Z2.isEmpty()) {
                        ArrayList B2 = r3Var.B2();
                        ArrayList y22 = r3Var.y2();
                        ArrayList a2 = v4.a(i12, Z2);
                        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
                        if (p2Var instanceof xn) {
                            xn xnVar = (xn) p2Var;
                            MessageObject messageObject3 = xnVar.k5;
                            MessageObject messageObject4 = xnVar.U3;
                            j11 = xnVar.N8();
                            sendMessageChatArguments = xnVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(miVar.G1), Z2, B2, y22, a2, false, miVar.n1(), messageObject, messageObject2, z4, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        miVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.p2 p2Var2 = miVar.c0;
                    if ((p2Var2 instanceof xn) && (jkVar = ((xn) p2Var2).V) != null) {
                        jkVar.R0(w4.k(r3Var.i3), z4, i10, i11);
                        miVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                v3 v3Var = this.s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(r3Var.M3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean I() {
        return !this.r.k3();
    }

    public final void P(q70 q70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, q70 q70Var2) {
        q70Var.j(aVar != null && aVar.b.getClass() == pageBlock.getClass(), i10, null, str, new yx0(this, aVar, pageBlock, q70Var2, 27));
        q70Var.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        q70Var.y().a.setTextSize(1, i11);
    }

    public final boolean Q() {
        r3 r3Var = this.r;
        if (r3Var == null || !r3Var.k3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i10 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: wh.j
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        q qVar = this.b;
                        qVar.T();
                        qVar.b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.c2(this) { // from class: wh.j
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.b.dismiss();
                        break;
                    default:
                        q qVar = this.b;
                        qVar.T();
                        qVar.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void R(boolean z4) {
        if (this.y) {
            this.y = false;
            mz mzVar = this.w;
            if (mzVar != null) {
                mzVar.t(false);
                if (!z4) {
                    this.w.B();
                }
            }
        }
        this.C = null;
        mz mzVar2 = this.w;
        if (mzVar2 != null) {
            mzVar2.setTranslationY(0.0f);
            this.w.setVisibility(8);
        }
        this.x = false;
        this.B = 0;
        v3 v3Var = this.s;
        if (v3Var != null) {
            v3Var.setEmojiOpened(false);
        }
        V(false);
        requestLayout();
    }

    public final void S() {
        float f10;
        float f11;
        int dp = this.y ? AndroidUtilities.dp(245.0f) : this.B;
        mz mzVar = this.w;
        mi miVar = this.b;
        if (mzVar != null) {
            if (this.x) {
                f11 = (this.B - dp) + (this.y ? -miVar.i2 : 0.0f);
            } else {
                f11 = 0.0f;
            }
            mzVar.setTranslationY(f11);
        }
        v3 v3Var = this.s;
        if (v3Var != null) {
            boolean z4 = this.x;
            if (z4) {
                f10 = dp;
            } else {
                f10 = (this.I || this.B > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z4 || this.y) {
                f10 += miVar.i2;
            }
            v3Var.getBottomContainer().animate().cancel();
            v3Var.getBottomContainer().setTranslationY(-f10);
            boolean z10 = this.x;
            float f12 = z10 ? dp : 0.0f;
            if (!z10 || this.y) {
                f12 += miVar.i2;
            }
            v3Var.setBottomGradientTranslationY(-f12);
            if (this.J != this.H) {
                ViewPropertyAnimator animate = v3Var.getBottomInnerContainer().animate();
                this.J = this.H;
                animate.translationY(-r1).setDuration(320L).setInterpolator(pr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.c0;
        if (!(p2Var instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) p2Var;
        r3 r3Var = this.r;
        if (!r3Var.r2()) {
            return false;
        }
        TL_iv.RichMessage j22 = r3Var.j2();
        AccountInstance.getInstance(this.n).getMediaDataController().saveDraft(xnVar.a(), xnVar.B7(xnVar.k5), "", null, null, null, null, 0L, false, false, j22);
        jk jkVar = xnVar.V;
        if (jkVar == null) {
            return true;
        }
        jkVar.setRichDraftPreview(j22);
        return true;
    }

    public final void V(boolean z4) {
        int i10 = 0;
        boolean z10 = this.r.k3() || this.x;
        mi miVar = this.b;
        mh mhVar = miVar.u1;
        if (miVar.r2 != z10) {
            miVar.r2 = z10;
            if (miVar.P0) {
                mhVar.animate().cancel();
                if (!z10) {
                    mhVar.setVisibility(0);
                }
                if (z4) {
                    mhVar.animate().alpha(z10 ? 0.0f : 1.0f).translationY(z10 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new fh(miVar, z10, 3)).start();
                } else {
                    mhVar.setAlpha(z10 ? 0.0f : 1.0f);
                    mhVar.setTranslationY(z10 ? AndroidUtilities.dp(48.0f) : 0.0f);
                    mhVar.setVisibility(z10 ? 4 : 0);
                }
            }
        }
        if (!z10 && !miVar.O && miVar.P0) {
            i10 = AndroidUtilities.dp(62.0f);
        }
        this.H = i10;
        S();
        if (this.G == z10) {
            this.G = !z10;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        int i10;
        boolean z4;
        boolean z10;
        int i11;
        r3 r3Var = this.r;
        m9 textSelectionHelper = r3Var.getTextSelectionHelper();
        v3 v3Var = this.s;
        if (v3Var == null || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        int[] B4 = r3Var.B4();
        v3Var.setQuoteState(B4 != null && r3Var.H3(B4[0], B4[1]));
        boolean L3 = r3Var.L3();
        int[] iArr = N;
        if (L3) {
            m9 textSelectionHelper2 = r3Var.getTextSelectionHelper();
            int i12 = textSelectionHelper2.u0;
            int i13 = textSelectionHelper2.v0;
            int i14 = textSelectionHelper2.y0;
            int i15 = textSelectionHelper2.w0;
            int i16 = textSelectionHelper2.z0;
            int i17 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = iArr[i18];
                if (this.r.K3(i19, i12, i13, i15, i14, i16)) {
                    i17 |= i19;
                }
            }
            boolean z11 = i13 == i14;
            e1 N4 = z11 ? r3Var.N4(i12, i13) : null;
            int max = Math.max(0, Math.min(i15, i16));
            int max2 = N4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), N4.length()));
            this.s.c(i17, N4 != null && max < max2 && x5.h(N4.getText(), max, max2), N4 != null && max < max2 && x5.g(N4.getText(), max, max2), z11, r3Var.l2(), true);
            return;
        }
        if (r3Var.w3()) {
            m9 textSelectionHelper3 = r3Var.getTextSelectionHelper();
            e1 s22 = r3Var.s2(textSelectionHelper3.u0);
            int i20 = textSelectionHelper3.w0;
            int i21 = textSelectionHelper3.z0;
            int max3 = s22 == null ? 0 : Math.max(0, Math.min(Math.min(i20, i21), s22.length()));
            int max4 = s22 == null ? 0 : Math.max(0, Math.min(Math.max(i20, i21), s22.length()));
            if (s22 == null || max3 >= max4) {
                i11 = 0;
            } else {
                int i22 = 0;
                for (int i23 = 0; i23 < 8; i23++) {
                    int i24 = iArr[i23];
                    if ((s22.getCurrentStyle(max3, max4) & i24) != 0) {
                        i22 |= i24;
                    }
                }
                i11 = i22;
            }
            this.s.c(i11, s22 != null && max3 < max4 && x5.h(s22.getText(), max3, max4), s22 != null && max3 < max4 && x5.g(s22.getText(), max3, max4), true, r3Var.l2(), true);
            return;
        }
        int i25 = textSelectionHelper.u0;
        int i26 = textSelectionHelper.x0;
        int i27 = textSelectionHelper.w0;
        int i28 = textSelectionHelper.z0;
        boolean z12 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < r3Var.m4.size();
        if (z12) {
            int i29 = 0;
            int i30 = 0;
            while (i29 < 8) {
                int i31 = iArr[i29];
                int i32 = i28;
                if (this.r.J3(i31, i25, i27, i26, i32)) {
                    i30 |= i31;
                }
                i29++;
                i28 = i32;
            }
            i10 = i30;
        } else {
            i10 = 0;
        }
        int i33 = i28;
        if (z12) {
            Editable H4 = r3Var.H4(i25, i27, i26, i33);
            if (H4 == null ? false : x5.h(H4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z4 = true;
                if (z12) {
                    Editable H42 = r3Var.H4(i25, i27, i26, i33);
                    if (H42 == null ? false : x5.g(H42, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                        z10 = true;
                        this.s.c(i10, z4, z10, !z12 && i25 == i26, r3Var.l2(), !r3Var.I3());
                    }
                }
                z10 = false;
                if (z12) {
                }
                this.s.c(i10, z4, z10, !z12 && i25 == i26, r3Var.l2(), !r3Var.I3());
            }
        }
        z4 = false;
        if (z12) {
        }
        z10 = false;
        if (z12) {
        }
        this.s.c(i10, z4, z10, !z12 && i25 == i26, r3Var.l2(), !r3Var.I3());
    }

    public final void X() {
        v3 v3Var = this.s;
        if (v3Var != null) {
            r3 r3Var = this.r;
            boolean r22 = r3Var.r2();
            d2 d2Var = r3Var.G3;
            boolean z4 = (d2Var == null || d2Var.c.isEmpty()) ? false : true;
            ImageView imageView = v3Var.r;
            ImageView imageView2 = v3Var.n;
            imageView2.setEnabled(r22);
            imageView2.setAlpha(r22 ? 1.0f : 0.35f);
            imageView.setEnabled(z4);
            imageView.setAlpha(z4 ? 1.0f : 0.35f);
        }
    }

    public final void Y() {
        v3 v3Var = this.s;
        if (v3Var != null) {
            int i10 = this.n;
            boolean z4 = false;
            boolean z10 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
            lg sendButton = v3Var.getSendButton();
            if (z10) {
                r3 r3Var = this.r;
                if (w4.f(r3Var.i3, r3Var.j3)) {
                    z4 = true;
                }
            }
            sendButton.setLocked(z4);
            v3Var.setPremiumLocked(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        a Q2;
        v3 v3Var = this.s;
        if (v3Var == null) {
            return;
        }
        r3 r3Var = this.r;
        m9 textSelectionHelper = r3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            Q2 = r3Var.Q2();
        } else {
            int i10 = textSelectionHelper.u0;
            Q2 = i10 == textSelectionHelper.x0 ? r3Var.y4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (r3Var.R2() == null) {
            if (Q2 != null) {
                if (!Q2.a() && !Q2.b() && !Q2.c()) {
                    TL_iv.PageBlock pageBlock = Q2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i11 = 7;
                            } else {
                                if (!r3.C3(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = Q2.b;
                                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
                                        if (!(pageBlock2 instanceof TL_iv.pageBlockPreformatted)) {
                                            if (!(pageBlock2 instanceof TL_iv.pageBlockBlockquote)) {
                                            }
                                        }
                                    }
                                }
                                i11 = 1;
                            }
                        }
                    }
                }
                i11 = 2;
            }
            i11 = 0;
        }
        if (Q2 != null) {
            if (i11 == 1) {
                TL_iv.PageBlock pageBlock3 = Q2.b;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i12 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i12 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i12 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i12 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i12 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i12 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i12 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i12 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i12 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i12 = R.drawable.iv_footer;
                }
            } else if (i11 == 2) {
                if (Q2.a()) {
                    i12 = R.drawable.iv_todo;
                } else if (Q2.c()) {
                    i12 = R.drawable.iv_ordered_list;
                }
            }
        }
        v3Var.d(i11, i12);
    }

    public final void a0() {
        int paddingTop;
        v3 v3Var = this.s;
        if (v3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        r3 r3Var = this.r;
        if (r3Var.getChildCount() <= 0) {
            paddingTop = r3Var.getPaddingTop();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < r3Var.getChildCount(); i11++) {
                View childAt = r3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            paddingTop = i10 == Integer.MAX_VALUE ? r3Var.getPaddingTop() : i10;
        }
        v3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            Y();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        r3 r3Var = this.r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.b.c0 instanceof xn) && r3Var.r2() && T()) {
                l.d.v(R.string.RichEditorDraftSaved, new qc(this.s, this.a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!r3Var.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mz mzVar;
        r3 r3Var = this.r;
        f3 f3Var = r3Var.k3;
        y9 y9Var = r3Var.l3;
        if (f3Var.y() && y9Var.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.y || (mzVar = this.w) == null) ? getHeight() - this.B : (int) mzVar.getY()) - AndroidUtilities.dp(60.0f)) - this.H;
        if (motionEvent.getAction() == 0 && this.x && motionEvent.getY() < height) {
            R(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && y9Var.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !r3Var.i3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ei
    public int getCurrentItemTop() {
        r3 r3Var = this.r;
        if (r3Var.getChildCount() <= 0) {
            int paddingTop = r3Var.getPaddingTop();
            this.F = paddingTop;
            r3Var.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z4 = false;
        for (int i11 = 0; i11 < r3Var.getChildCount(); i11++) {
            View childAt = r3Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z4 = true;
            }
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        r3Var.setTopGlowOffset(Math.max(0, i10));
        int i12 = i10 - AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(7.0f);
        if (i12 < AndroidUtilities.dp(7.0f) || !z4) {
            i12 = dp;
        }
        this.F = i12;
        return i12;
    }

    @Override // org.telegram.ui.Components.ei
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ei
    public int getListTopPadding() {
        return (this.r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public m9 getTextSelectionHelper() {
        return this.r.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.ei
    public final int h() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean i() {
        boolean z4 = this.y;
        if (z4) {
            if (z4) {
                this.y = false;
                mz mzVar = this.w;
                if (mzVar != null) {
                    mzVar.t(false);
                    this.w.B();
                }
                S();
                return false;
            }
        } else {
            if (this.x) {
                R(false);
                return false;
            }
            if (!this.r.F2() && !Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public final void k(float f10) {
        S();
    }

    @Override // org.telegram.ui.Components.ei
    public final void m() {
        ti0 ti0Var = this.L;
        if (ti0Var != null) {
            ti0Var.i();
            this.L = null;
        }
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.c();
        }
        r3 r3Var2 = this.r;
        if (r3Var2 != null) {
            r3Var2.v2();
        }
        mz mzVar = this.w;
        if (mzVar != null) {
            mzVar.D();
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean n() {
        r3 r3Var = this.r;
        if (r3Var == null) {
            return false;
        }
        r3Var.v2();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean p() {
        return Q();
    }

    @Override // org.telegram.ui.Components.ei
    public final void r() {
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.c();
        }
        if (this.x) {
            R(false);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K) {
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

    @Override // org.telegram.ui.Components.ei
    public final void v() {
        this.I = this.b.o1.R() > AndroidUtilities.dp(20.0f);
        S();
        a0();
    }

    @Override // org.telegram.ui.Components.ei
    public final void w(int i10, boolean z4) {
        this.I = z4;
        S();
        if (z4 && this.x && !this.y) {
            R(false);
        }
        a0();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        q70 q70Var;
        boolean z4 = this.I;
        mi miVar = this.b;
        boolean z10 = miVar.o1.R() > AndroidUtilities.dp(20.0f);
        this.I = z10;
        if (!z10 && z4 && (q70Var = this.E) != null) {
            q70Var.u();
            this.E = null;
        }
        if (this.I || this.B > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(52.0f);
            miVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(52.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    miVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(52.0f);
            if (dp < 0) {
            }
            miVar.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + dp;
        r3 r3Var = this.r;
        int C = org.telegram.messenger.y3.C(110.0f, (this.I || this.B > 0) ? 0 : AndroidUtilities.navigationBarHeight, (r3Var.k3() || this.x || !miVar.P0) ? 0 : AndroidUtilities.dp(62.0f)) + this.B;
        if (r3Var.getPaddingTop() != currentActionBarHeight || r3Var.getPaddingBottom() != C) {
            this.K = true;
            r3Var.o1(0, currentActionBarHeight, 0, C);
            this.K = false;
        }
        a0();
    }

    @Override // org.telegram.ui.Components.ei
    public final void q() {
    }
}
