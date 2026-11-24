// default package

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pf6 extends kla {
    public boolean E;
    public int F;
    public int G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public Bundle M;
    public boolean N;
    public Timer O;
    public final Object P;
    public int Q;
    public double R;
    public boolean S;
    public Bundle T;
    public TLRPC.TL_auth_sentCode U;
    public final nf6 V;
    public final nf6 W;
    public final byte a;
    public float a0;
    public final gt7 b;
    public final /* synthetic */ mh6 b0;
    public final l7 c;
    public final pe6 d;
    public final TextView e;
    public final TextView f;
    public final s09 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final ng6 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pf6(mh6 mh6Var, Context context, int i) {
        super(context);
        boolean z;
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        this.b0 = mh6Var;
        final byte b = 1;
        this.x = true;
        final byte b2 = 0;
        this.y = false;
        this.E = false;
        this.P = new Object();
        this.Q = 60000;
        this.V = new nf6(this, (byte) 1);
        this.W = new nf6(this, (byte) 2);
        this.a0 = -3.0f;
        this.a = i;
        boolean z2 = i != 16;
        setOrientation(1);
        s09 s09Var = new s09(context);
        this.h = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        s09Var.f(R.raw.bubble, 95, 95, null);
        if (!gm.M1()) {
            Point point = gm.q;
            if (point.x <= point.y || gm.O1()) {
                z = false;
                s09Var.setVisibility(!z ? 8 : 0);
                addView(s09Var, qoe.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(gm.o());
                textView.setLineSpacing(gm.L(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(jb6.M0(z2 ? 2131745684 : 2131745692, null));
                addView(textView, qoe.t(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(gm.L(2.0f), 1.0f);
                addView(textView2, qoe.t(-2, -2, 1, 8, 5, 8, 16));
                gt7 gt7Var = new gt7(context, null);
                this.b = gt7Var;
                gt7Var.setText(jb6.M0(z2 ? 2131745691 : 2131745699, null));
                l7 l7Var = new l7((byte) 4, context, this);
                this.c = l7Var;
                l7Var.setSingleLine();
                l7Var.setLines(1);
                l7Var.setCursorSize(gm.L(20.0f));
                l7Var.setCursorWidth(1.5f);
                l7Var.setImeOptions(268435461);
                l7Var.setTextSize(1, 18.0f);
                l7Var.setMaxLines(1);
                l7Var.setBackground(null);
                l7Var.setHint(jb6.M0(z2 ? 2131745687 : 2131745695, null));
                l7Var.addTextChangedListener(new fj(this));
                l7Var.setEllipsizeByGradient(true);
                l7Var.setInputType(1);
                l7Var.setTypeface(Typeface.DEFAULT);
                l7Var.setGravity(!jb6.a0 ? 5 : 3);
                l7Var.setOnFocusChangeListener(new tt0(this, (byte) 9));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 12.0f);
                textView3.setTypeface(gm.o());
                textView3.setText(jb6.M0(2131747168, null));
                textView3.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
                textView3.setGravity(17);
                int i2 = cmb.n6;
                ylbVar = ((d) mh6Var).resourceProvider;
                int v0 = cmb.v0(i2, ylbVar);
                ylbVar2 = ((d) mh6Var).resourceProvider;
                anb.X(textView3, i2, ylbVar2);
                int L = gm.L(6.0f);
                int p1 = cmb.p1(0.12f, v0);
                int p12 = cmb.p1(0.15f, v0);
                fg0 i0 = cmb.i0(L, L, L, L, p1, p12, p12);
                wmb K = anb.K(0.12f, i2);
                wmb K2 = anb.K(0.15f, i2);
                ylbVar3 = ((d) mh6Var).resourceProvider;
                textView3.setBackground(i0);
                anb.j(textView3, i0, K, K2, ylbVar3);
                rve.b(textView3, 0.1f, 1.5f);
                l7Var.setPadding(gm.L(16.0f), gm.L(13.34f), gm.L(16.0f), gm.L(13.34f));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: of6
                    public final /* synthetic */ pf6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3;
                        int i4;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        byte b3 = b2;
                        CharSequence charSequence = null;
                        final byte b4 = 0;
                        final pf6 pf6Var = this.b;
                        final byte b5 = 1;
                        switch (b3) {
                            case 0:
                                l7 l7Var2 = pf6Var.c;
                                try {
                                    charSequence = ((ClipboardManager) pf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(pf6Var.getContext());
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = l7Var2.getText();
                                    pf6Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, l7Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, l7Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                pf6Var.p(true);
                                break;
                            case 1:
                                pf6Var.d(true);
                                break;
                            default:
                                mh6 mh6Var2 = pf6Var.b0;
                                ng6 ng6Var = pf6Var.w;
                                if (pf6Var.Q <= 0 || pf6Var.O == null) {
                                    Bundle bundle = pf6Var.T;
                                    if (bundle != null && (tL_auth_sentCode = pf6Var.U) != null) {
                                        mh6Var2.q1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i5 = pf6Var.F;
                                        if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                            if (i5 == 3) {
                                                gm.y3(false);
                                                if (!pf6Var.S && !pf6Var.N && !mh6Var2.r0) {
                                                    pf6Var.N = true;
                                                    ng6Var.invalidate();
                                                    anb.X(ng6Var, cmb.H6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", pf6Var.K);
                                                    bundle2.putString("ephone", pf6Var.J);
                                                    bundle2.putString("phoneFormated", pf6Var.H);
                                                    pf6Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = pf6Var.H;
                                                    tL_auth_resendCode.phone_code_hash = pf6Var.I;
                                                    i4 = ((d) mh6Var2).currentAccount;
                                                    mh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: kf6
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b6 = b5;
                                                            Bundle bundle3 = bundle2;
                                                            pf6 pf6Var2 = pf6Var;
                                                            switch (b6) {
                                                                case 0:
                                                                    gm.c3(new mf6(pf6Var2, tLObject, bundle3, tL_error));
                                                                    break;
                                                                default:
                                                                    gm.c3(new mf6(pf6Var2, tL_error, bundle3, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            pf6Var.N = true;
                                            ng6Var.invalidate();
                                            anb.X(ng6Var, cmb.H6, null);
                                            ng6Var.setTextSize(1, 15.0f);
                                            int i6 = pf6Var.F;
                                            if (i6 == 4 || i6 == 11) {
                                                ng6Var.setText(jb6.M0(2131752550, null));
                                            } else {
                                                ng6Var.setText(jb6.M0(2131745311, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", pf6Var.K);
                                            bundle3.putString("ephone", pf6Var.J);
                                            bundle3.putString("phoneFormated", pf6Var.H);
                                            bundle3.putInt("prevType", pf6Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = pf6Var.H;
                                            tL_auth_resendCode2.phone_code_hash = pf6Var.I;
                                            i3 = ((d) mh6Var2).currentAccount;
                                            ConnectionsManager.getInstance(i3).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: kf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b4;
                                                    Bundle bundle32 = bundle3;
                                                    pf6 pf6Var2 = pf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                gt7Var.addView(l7Var, qoe.d(-1, -2.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
                gt7Var.e(l7Var);
                gt7Var.addView(textView3, qoe.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(gt7Var, qoe.r(-1, -2, 1));
                addView(linearLayout, qoe.t(-1, -2, 1, 16, 3, 16, 0));
                l7Var.setOnEditorActionListener(new j(this, (byte) 15));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, qoe.o(-1, -2));
                pe6 pe6Var = new pe6(mh6Var, context);
                this.d = pe6Var;
                int i3 = cmb.H6;
                anb.G(pe6Var, i3, null);
                anb.X(pe6Var, i3, mh6Var.getResourceProvider());
                pe6Var.setTextSize(1, 14.0f);
                pe6Var.setLineSpacing(gm.L(2.0f), 1.0f);
                pe6Var.setPadding(gm.L(14.0f), gm.L(8.0f), gm.L(14.0f), gm.L(16.0f));
                pe6Var.setOnClickListener(new View.OnClickListener(this) { // from class: of6
                    public final /* synthetic */ pf6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i32;
                        int i4;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        byte b3 = b;
                        CharSequence charSequence = null;
                        final byte b4 = 0;
                        final pf6 pf6Var = this.b;
                        final byte b5 = 1;
                        switch (b3) {
                            case 0:
                                l7 l7Var2 = pf6Var.c;
                                try {
                                    charSequence = ((ClipboardManager) pf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(pf6Var.getContext());
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = l7Var2.getText();
                                    pf6Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, l7Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, l7Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                pf6Var.p(true);
                                break;
                            case 1:
                                pf6Var.d(true);
                                break;
                            default:
                                mh6 mh6Var2 = pf6Var.b0;
                                ng6 ng6Var = pf6Var.w;
                                if (pf6Var.Q <= 0 || pf6Var.O == null) {
                                    Bundle bundle = pf6Var.T;
                                    if (bundle != null && (tL_auth_sentCode = pf6Var.U) != null) {
                                        mh6Var2.q1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i5 = pf6Var.F;
                                        if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                            if (i5 == 3) {
                                                gm.y3(false);
                                                if (!pf6Var.S && !pf6Var.N && !mh6Var2.r0) {
                                                    pf6Var.N = true;
                                                    ng6Var.invalidate();
                                                    anb.X(ng6Var, cmb.H6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", pf6Var.K);
                                                    bundle2.putString("ephone", pf6Var.J);
                                                    bundle2.putString("phoneFormated", pf6Var.H);
                                                    pf6Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = pf6Var.H;
                                                    tL_auth_resendCode.phone_code_hash = pf6Var.I;
                                                    i4 = ((d) mh6Var2).currentAccount;
                                                    mh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: kf6
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b6 = b5;
                                                            Bundle bundle32 = bundle2;
                                                            pf6 pf6Var2 = pf6Var;
                                                            switch (b6) {
                                                                case 0:
                                                                    gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                                    break;
                                                                default:
                                                                    gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            pf6Var.N = true;
                                            ng6Var.invalidate();
                                            anb.X(ng6Var, cmb.H6, null);
                                            ng6Var.setTextSize(1, 15.0f);
                                            int i6 = pf6Var.F;
                                            if (i6 == 4 || i6 == 11) {
                                                ng6Var.setText(jb6.M0(2131752550, null));
                                            } else {
                                                ng6Var.setText(jb6.M0(2131745311, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", pf6Var.K);
                                            bundle3.putString("ephone", pf6Var.J);
                                            bundle3.putString("phoneFormated", pf6Var.H);
                                            bundle3.putInt("prevType", pf6Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = pf6Var.H;
                                            tL_auth_resendCode2.phone_code_hash = pf6Var.I;
                                            i32 = ((d) mh6Var2).currentAccount;
                                            ConnectionsManager.getInstance(i32).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: kf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b4;
                                                    Bundle bundle32 = bundle3;
                                                    pf6 pf6Var2 = pf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                addView(pe6Var, qoe.t(-2, -2, 1, 0, 18, 0, 0));
                pe6Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(jb6.M0(z2 ? 2131745688 : 2131745696, null));
                anb.X(textView4, cmb.o7, mh6Var.getResourceProvider());
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, qoe.d(-1, -2.0f, nm7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-gm.L(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(jb6.M0(z2 ? 2131745686 : 2131745694, null));
                anb.X(textView5, cmb.x6, mh6Var.getResourceProvider());
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, qoe.d(-1, -2.0f, nm7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
                ng6 ng6Var = new ng6(this, context);
                this.w = ng6Var;
                anb.G(ng6Var, i3, null);
                ng6Var.setLineSpacing(gm.L(2.0f), 1.0f);
                ng6Var.setPadding(gm.L(14.0f), gm.L(8.0f), gm.L(14.0f), gm.L(16.0f));
                ng6Var.setTextSize(1, 15.0f);
                ng6Var.setGravity(19);
                final byte b3 = 2;
                ng6Var.setOnClickListener(new View.OnClickListener(this) { // from class: of6
                    public final /* synthetic */ pf6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i32;
                        int i4;
                        TLRPC.TL_auth_sentCode tL_auth_sentCode;
                        byte b32 = b3;
                        CharSequence charSequence = null;
                        final byte b4 = 0;
                        final pf6 pf6Var = this.b;
                        final byte b5 = 1;
                        switch (b32) {
                            case 0:
                                l7 l7Var2 = pf6Var.c;
                                try {
                                    charSequence = ((ClipboardManager) pf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(pf6Var.getContext());
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = l7Var2.getText();
                                    pf6Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, l7Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, l7Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                pf6Var.p(true);
                                break;
                            case 1:
                                pf6Var.d(true);
                                break;
                            default:
                                mh6 mh6Var2 = pf6Var.b0;
                                ng6 ng6Var2 = pf6Var.w;
                                if (pf6Var.Q <= 0 || pf6Var.O == null) {
                                    Bundle bundle = pf6Var.T;
                                    if (bundle != null && (tL_auth_sentCode = pf6Var.U) != null) {
                                        mh6Var2.q1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i5 = pf6Var.F;
                                        if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                            if (i5 == 3) {
                                                gm.y3(false);
                                                if (!pf6Var.S && !pf6Var.N && !mh6Var2.r0) {
                                                    pf6Var.N = true;
                                                    ng6Var2.invalidate();
                                                    anb.X(ng6Var2, cmb.H6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", pf6Var.K);
                                                    bundle2.putString("ephone", pf6Var.J);
                                                    bundle2.putString("phoneFormated", pf6Var.H);
                                                    pf6Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = pf6Var.H;
                                                    tL_auth_resendCode.phone_code_hash = pf6Var.I;
                                                    i4 = ((d) mh6Var2).currentAccount;
                                                    mh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: kf6
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b6 = b5;
                                                            Bundle bundle32 = bundle2;
                                                            pf6 pf6Var2 = pf6Var;
                                                            switch (b6) {
                                                                case 0:
                                                                    gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                                    break;
                                                                default:
                                                                    gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            pf6Var.N = true;
                                            ng6Var2.invalidate();
                                            anb.X(ng6Var2, cmb.H6, null);
                                            ng6Var2.setTextSize(1, 15.0f);
                                            int i6 = pf6Var.F;
                                            if (i6 == 4 || i6 == 11) {
                                                ng6Var2.setText(jb6.M0(2131752550, null));
                                            } else {
                                                ng6Var2.setText(jb6.M0(2131745311, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", pf6Var.K);
                                            bundle3.putString("ephone", pf6Var.J);
                                            bundle3.putString("phoneFormated", pf6Var.H);
                                            bundle3.putInt("prevType", pf6Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = pf6Var.H;
                                            tL_auth_resendCode2.phone_code_hash = pf6Var.I;
                                            i32 = ((d) mh6Var2).currentAccount;
                                            ConnectionsManager.getInstance(i32).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: kf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b4;
                                                    Bundle bundle32 = bundle3;
                                                    pf6 pf6Var2 = pf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(ng6Var, qoe.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, qoe.r(-1, -1, 80));
                wm9.c(ng6Var);
            }
        }
        z = true;
        s09Var.setVisibility(!z ? 8 : 0);
        addView(s09Var, qoe.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(gm.o());
        textView6.setLineSpacing(gm.L(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(jb6.M0(z2 ? 2131745684 : 2131745692, null));
        addView(textView6, qoe.t(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView22, qoe.t(-2, -2, 1, 8, 5, 8, 16));
        gt7 gt7Var2 = new gt7(context, null);
        this.b = gt7Var2;
        gt7Var2.setText(jb6.M0(z2 ? 2131745691 : 2131745699, null));
        l7 l7Var2 = new l7((byte) 4, context, this);
        this.c = l7Var2;
        l7Var2.setSingleLine();
        l7Var2.setLines(1);
        l7Var2.setCursorSize(gm.L(20.0f));
        l7Var2.setCursorWidth(1.5f);
        l7Var2.setImeOptions(268435461);
        l7Var2.setTextSize(1, 18.0f);
        l7Var2.setMaxLines(1);
        l7Var2.setBackground(null);
        l7Var2.setHint(jb6.M0(z2 ? 2131745687 : 2131745695, null));
        l7Var2.addTextChangedListener(new fj(this));
        l7Var2.setEllipsizeByGradient(true);
        l7Var2.setInputType(1);
        l7Var2.setTypeface(Typeface.DEFAULT);
        l7Var2.setGravity(!jb6.a0 ? 5 : 3);
        l7Var2.setOnFocusChangeListener(new tt0(this, (byte) 9));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        textView32.setTextSize(1, 12.0f);
        textView32.setTypeface(gm.o());
        textView32.setText(jb6.M0(2131747168, null));
        textView32.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        textView32.setGravity(17);
        int i22 = cmb.n6;
        ylbVar = ((d) mh6Var).resourceProvider;
        int v02 = cmb.v0(i22, ylbVar);
        ylbVar2 = ((d) mh6Var).resourceProvider;
        anb.X(textView32, i22, ylbVar2);
        int L2 = gm.L(6.0f);
        int p13 = cmb.p1(0.12f, v02);
        int p122 = cmb.p1(0.15f, v02);
        fg0 i02 = cmb.i0(L2, L2, L2, L2, p13, p122, p122);
        wmb K3 = anb.K(0.12f, i22);
        wmb K22 = anb.K(0.15f, i22);
        ylbVar3 = ((d) mh6Var).resourceProvider;
        textView32.setBackground(i02);
        anb.j(textView32, i02, K3, K22, ylbVar3);
        rve.b(textView32, 0.1f, 1.5f);
        l7Var2.setPadding(gm.L(16.0f), gm.L(13.34f), gm.L(16.0f), gm.L(13.34f));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: of6
            public final /* synthetic */ pf6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32;
                int i4;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                byte b32 = b2;
                CharSequence charSequence = null;
                final byte b4 = 0;
                final pf6 pf6Var = this.b;
                final byte b5 = 1;
                switch (b32) {
                    case 0:
                        l7 l7Var22 = pf6Var.c;
                        try {
                            charSequence = ((ClipboardManager) pf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(pf6Var.getContext());
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = l7Var22.getText();
                            pf6Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, l7Var22.getSelectionStart());
                                text.replace(max, Math.max(max, l7Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        pf6Var.p(true);
                        break;
                    case 1:
                        pf6Var.d(true);
                        break;
                    default:
                        mh6 mh6Var2 = pf6Var.b0;
                        ng6 ng6Var2 = pf6Var.w;
                        if (pf6Var.Q <= 0 || pf6Var.O == null) {
                            Bundle bundle = pf6Var.T;
                            if (bundle != null && (tL_auth_sentCode = pf6Var.U) != null) {
                                mh6Var2.q1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i5 = pf6Var.F;
                                if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                    if (i5 == 3) {
                                        gm.y3(false);
                                        if (!pf6Var.S && !pf6Var.N && !mh6Var2.r0) {
                                            pf6Var.N = true;
                                            ng6Var2.invalidate();
                                            anb.X(ng6Var2, cmb.H6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", pf6Var.K);
                                            bundle2.putString("ephone", pf6Var.J);
                                            bundle2.putString("phoneFormated", pf6Var.H);
                                            pf6Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = pf6Var.H;
                                            tL_auth_resendCode.phone_code_hash = pf6Var.I;
                                            i4 = ((d) mh6Var2).currentAccount;
                                            mh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: kf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b5;
                                                    Bundle bundle32 = bundle2;
                                                    pf6 pf6Var2 = pf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    pf6Var.N = true;
                                    ng6Var2.invalidate();
                                    anb.X(ng6Var2, cmb.H6, null);
                                    ng6Var2.setTextSize(1, 15.0f);
                                    int i6 = pf6Var.F;
                                    if (i6 == 4 || i6 == 11) {
                                        ng6Var2.setText(jb6.M0(2131752550, null));
                                    } else {
                                        ng6Var2.setText(jb6.M0(2131745311, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", pf6Var.K);
                                    bundle3.putString("ephone", pf6Var.J);
                                    bundle3.putString("phoneFormated", pf6Var.H);
                                    bundle3.putInt("prevType", pf6Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = pf6Var.H;
                                    tL_auth_resendCode2.phone_code_hash = pf6Var.I;
                                    i32 = ((d) mh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i32).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: kf6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            Bundle bundle32 = bundle3;
                                            pf6 pf6Var2 = pf6Var;
                                            switch (b6) {
                                                case 0:
                                                    gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                    break;
                                                default:
                                                    gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        gt7Var2.addView(l7Var2, qoe.d(-1, -2.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        gt7Var2.e(l7Var2);
        gt7Var2.addView(textView32, qoe.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(gt7Var2, qoe.r(-1, -2, 1));
        addView(linearLayout2, qoe.t(-1, -2, 1, 16, 3, 16, 0));
        l7Var2.setOnEditorActionListener(new j(this, (byte) 15));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, qoe.o(-1, -2));
        pe6 pe6Var2 = new pe6(mh6Var, context);
        this.d = pe6Var2;
        int i32 = cmb.H6;
        anb.G(pe6Var2, i32, null);
        anb.X(pe6Var2, i32, mh6Var.getResourceProvider());
        pe6Var2.setTextSize(1, 14.0f);
        pe6Var2.setLineSpacing(gm.L(2.0f), 1.0f);
        pe6Var2.setPadding(gm.L(14.0f), gm.L(8.0f), gm.L(14.0f), gm.L(16.0f));
        pe6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: of6
            public final /* synthetic */ pf6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i322;
                int i4;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                byte b32 = b;
                CharSequence charSequence = null;
                final byte b4 = 0;
                final pf6 pf6Var = this.b;
                final byte b5 = 1;
                switch (b32) {
                    case 0:
                        l7 l7Var22 = pf6Var.c;
                        try {
                            charSequence = ((ClipboardManager) pf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(pf6Var.getContext());
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = l7Var22.getText();
                            pf6Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, l7Var22.getSelectionStart());
                                text.replace(max, Math.max(max, l7Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        pf6Var.p(true);
                        break;
                    case 1:
                        pf6Var.d(true);
                        break;
                    default:
                        mh6 mh6Var2 = pf6Var.b0;
                        ng6 ng6Var2 = pf6Var.w;
                        if (pf6Var.Q <= 0 || pf6Var.O == null) {
                            Bundle bundle = pf6Var.T;
                            if (bundle != null && (tL_auth_sentCode = pf6Var.U) != null) {
                                mh6Var2.q1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i5 = pf6Var.F;
                                if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                    if (i5 == 3) {
                                        gm.y3(false);
                                        if (!pf6Var.S && !pf6Var.N && !mh6Var2.r0) {
                                            pf6Var.N = true;
                                            ng6Var2.invalidate();
                                            anb.X(ng6Var2, cmb.H6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", pf6Var.K);
                                            bundle2.putString("ephone", pf6Var.J);
                                            bundle2.putString("phoneFormated", pf6Var.H);
                                            pf6Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = pf6Var.H;
                                            tL_auth_resendCode.phone_code_hash = pf6Var.I;
                                            i4 = ((d) mh6Var2).currentAccount;
                                            mh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: kf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b5;
                                                    Bundle bundle32 = bundle2;
                                                    pf6 pf6Var2 = pf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    pf6Var.N = true;
                                    ng6Var2.invalidate();
                                    anb.X(ng6Var2, cmb.H6, null);
                                    ng6Var2.setTextSize(1, 15.0f);
                                    int i6 = pf6Var.F;
                                    if (i6 == 4 || i6 == 11) {
                                        ng6Var2.setText(jb6.M0(2131752550, null));
                                    } else {
                                        ng6Var2.setText(jb6.M0(2131745311, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", pf6Var.K);
                                    bundle3.putString("ephone", pf6Var.J);
                                    bundle3.putString("phoneFormated", pf6Var.H);
                                    bundle3.putInt("prevType", pf6Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = pf6Var.H;
                                    tL_auth_resendCode2.phone_code_hash = pf6Var.I;
                                    i322 = ((d) mh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: kf6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            Bundle bundle32 = bundle3;
                                            pf6 pf6Var2 = pf6Var;
                                            switch (b6) {
                                                case 0:
                                                    gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                    break;
                                                default:
                                                    gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        addView(pe6Var2, qoe.t(-2, -2, 1, 0, 18, 0, 0));
        pe6Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(jb6.M0(z2 ? 2131745688 : 2131745696, null));
        anb.X(textView42, cmb.o7, mh6Var.getResourceProvider());
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, qoe.d(-1, -2.0f, nm7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-gm.L(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(jb6.M0(z2 ? 2131745686 : 2131745694, null));
        anb.X(textView52, cmb.x6, mh6Var.getResourceProvider());
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, qoe.d(-1, -2.0f, nm7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
        ng6 ng6Var2 = new ng6(this, context);
        this.w = ng6Var2;
        anb.G(ng6Var2, i32, null);
        ng6Var2.setLineSpacing(gm.L(2.0f), 1.0f);
        ng6Var2.setPadding(gm.L(14.0f), gm.L(8.0f), gm.L(14.0f), gm.L(16.0f));
        ng6Var2.setTextSize(1, 15.0f);
        ng6Var2.setGravity(19);
        final byte b32 = 2;
        ng6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: of6
            public final /* synthetic */ pf6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i322;
                int i4;
                TLRPC.TL_auth_sentCode tL_auth_sentCode;
                byte b322 = b32;
                CharSequence charSequence = null;
                final byte b4 = 0;
                final pf6 pf6Var = this.b;
                final byte b5 = 1;
                switch (b322) {
                    case 0:
                        l7 l7Var22 = pf6Var.c;
                        try {
                            charSequence = ((ClipboardManager) pf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(pf6Var.getContext());
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = l7Var22.getText();
                            pf6Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, l7Var22.getSelectionStart());
                                text.replace(max, Math.max(max, l7Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        pf6Var.p(true);
                        break;
                    case 1:
                        pf6Var.d(true);
                        break;
                    default:
                        mh6 mh6Var2 = pf6Var.b0;
                        ng6 ng6Var22 = pf6Var.w;
                        if (pf6Var.Q <= 0 || pf6Var.O == null) {
                            Bundle bundle = pf6Var.T;
                            if (bundle != null && (tL_auth_sentCode = pf6Var.U) != null) {
                                mh6Var2.q1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i5 = pf6Var.F;
                                if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                    if (i5 == 3) {
                                        gm.y3(false);
                                        if (!pf6Var.S && !pf6Var.N && !mh6Var2.r0) {
                                            pf6Var.N = true;
                                            ng6Var22.invalidate();
                                            anb.X(ng6Var22, cmb.H6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", pf6Var.K);
                                            bundle2.putString("ephone", pf6Var.J);
                                            bundle2.putString("phoneFormated", pf6Var.H);
                                            pf6Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = pf6Var.H;
                                            tL_auth_resendCode.phone_code_hash = pf6Var.I;
                                            i4 = ((d) mh6Var2).currentAccount;
                                            mh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: kf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b5;
                                                    Bundle bundle32 = bundle2;
                                                    pf6 pf6Var2 = pf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    pf6Var.N = true;
                                    ng6Var22.invalidate();
                                    anb.X(ng6Var22, cmb.H6, null);
                                    ng6Var22.setTextSize(1, 15.0f);
                                    int i6 = pf6Var.F;
                                    if (i6 == 4 || i6 == 11) {
                                        ng6Var22.setText(jb6.M0(2131752550, null));
                                    } else {
                                        ng6Var22.setText(jb6.M0(2131745311, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", pf6Var.K);
                                    bundle3.putString("ephone", pf6Var.J);
                                    bundle3.putString("phoneFormated", pf6Var.H);
                                    bundle3.putInt("prevType", pf6Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = pf6Var.H;
                                    tL_auth_resendCode2.phone_code_hash = pf6Var.I;
                                    i322 = ((d) mh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: kf6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            Bundle bundle32 = bundle3;
                                            pf6 pf6Var2 = pf6Var;
                                            switch (b6) {
                                                case 0:
                                                    gm.c3(new mf6(pf6Var2, tLObject, bundle32, tL_error));
                                                    break;
                                                default:
                                                    gm.c3(new mf6(pf6Var2, tL_error, bundle32, tLObject));
                                                    break;
                                            }
                                        }
                                    }, 10);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(ng6Var2, qoe.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, qoe.r(-1, -1, 80));
        wm9.c(ng6Var2);
    }

    public static String s(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) <= ' ') {
            i++;
        }
        return (i > 0 || length < str.length()) ? str.substring(i, length) : str;
    }

    @Override // kla
    public final boolean b() {
        return true;
    }

    @Override // kla
    public final boolean d(boolean z) {
        mh6 mh6Var = this.b0;
        mh6Var.y1(true, true);
        int i = this.G;
        if (i != 0) {
            mh6Var.J1(i, true, null, true);
            return false;
        }
        this.M = null;
        this.S = false;
        return true;
    }

    @Override // kla
    public final void e() {
        this.S = false;
    }

    @Override // kla
    public final void g() {
        gm.r(this.V);
    }

    @Override // kla
    public String getHeaderName() {
        return jb6.M0(2131748023, "NewPassword");
    }

    @Override // kla
    public final void h(String str) {
        if (this.S) {
            return;
        }
        String obj = this.c.getText().toString();
        if (obj.length() == 0) {
            r(false);
            return;
        }
        if (!o(obj)) {
            r(true);
            return;
        }
        this.S = true;
        TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
        tL_auth_signIn.phone_number = this.H;
        tL_auth_signIn.phone_code = obj;
        tL_auth_signIn.phone_code_hash = this.I;
        tL_auth_signIn.flags |= 1;
        mh6 mh6Var = this.b0;
        mh6Var.B1(mh6Var.getConnectionsManager().sendRequest(tL_auth_signIn, new jf6(this, tL_auth_signIn, (byte) 0), 10), true);
        mh6Var.K1(true, true);
    }

    @Override // kla
    public final void i() {
        p(true);
    }

    @Override // kla
    public final void j() {
        gm.d3(new nf6(this, (byte) 3), mh6.A0);
    }

    @Override // kla
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + ((int) this.a));
        this.M = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // kla
    public final void l(Bundle bundle) {
        if (this.M != null) {
            bundle.putBundle("recoveryview_word" + ((int) this.a), this.M);
        }
    }

    @Override // kla
    public final void m(Bundle bundle, boolean z) {
        ng6 ng6Var = this.w;
        if (bundle == null) {
            if (this.T == null || this.U == null) {
                return;
            }
            anb.X(ng6Var, cmb.H6, null);
            int i = this.F;
            ng6Var.setText(gm.E2(jb6.M0(i == 17 ? 2131745783 : i == 16 ? 2131745781 : i == 3 ? 2131745780 : 2131745782, null), true, gm.L(1.0f), gm.L(1.0f)));
            return;
        }
        l7 l7Var = this.c;
        l7Var.setText("");
        this.M = bundle;
        this.L = null;
        this.F = bundle.getInt("nextType");
        this.G = bundle.getInt("prevType", 0);
        this.J = bundle.getString("ephone");
        if (this.M.containsKey("beginning")) {
            this.L = this.M.getString("beginning");
        }
        this.H = bundle.getString("phoneFormated");
        this.I = bundle.getString("phoneHash");
        this.K = this.M.getString("phone");
        this.Q = bundle.getInt("timeout");
        int i2 = this.G;
        pe6 pe6Var = this.d;
        if (i2 == 17) {
            pe6Var.setVisibility(0);
            pe6Var.setText(gm.E2(jb6.M0(2131753719, null), true, gm.L(-1.0f), gm.L(1.0f)));
        } else if (i2 == 16) {
            pe6Var.setVisibility(0);
            pe6Var.setText(gm.E2(jb6.M0(2131753718, null), true, gm.L(-1.0f), gm.L(1.0f)));
        } else if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 3 || i2 == 15) {
            pe6Var.setVisibility(0);
            pe6Var.setText(gm.E2(jb6.M0(2131753720, null), true, gm.L(-1.0f), gm.L(1.0f)));
        } else {
            pe6Var.setVisibility(8);
        }
        this.T = null;
        this.U = null;
        this.S = false;
        this.N = false;
        mh6 mh6Var = this.b0;
        mh6Var.r0 = false;
        ng6Var.invalidate();
        boolean z2 = this.a != 16;
        String str = "+" + r58.f().e(r58.h(this.K, false));
        String str2 = this.L;
        TextView textView = this.r;
        if (str2 == null) {
            hg9.q(null, null, !z2 ? 2131745685 : 2131745693, new Object[]{str}, textView);
        } else {
            hg9.q(null, null, !z2 ? 2131745689 : 2131745697, new Object[]{str, str2}, textView);
        }
        mh6Var.M1(l7Var);
        l7Var.requestFocus();
        s09 s09Var = this.h;
        if (s09Var.getAnimatedDrawable() != null) {
            s09Var.getAnimatedDrawable().I(0, false, false);
        }
        gm.d3(new kg5(s09Var, (byte) 28), 500L);
        p(false);
        n(false);
        this.R = System.currentTimeMillis();
        int i3 = cmb.x6;
        anb.X(ng6Var, i3, null);
        int i4 = this.F;
        if (i4 != 2 && i4 != 4 && i4 != 3) {
            ng6Var.setVisibility(8);
            return;
        }
        if (this.O != null) {
            return;
        }
        anb.X(ng6Var, i3, null);
        ng6Var.setTag(R.id.color_key_tag, Integer.valueOf(i3));
        Timer timer = new Timer();
        this.O = timer;
        timer.schedule(new lx3(this, (byte) 1), 0L, 1000L);
    }

    public final void n(boolean z) {
        this.y = z;
        float f = 0.0f;
        float f2 = z ? 1.0f : 0.0f;
        this.b.a(f2);
        float f3 = (f2 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f3).scaleY(f3).alpha(f2).translationY((1.0f - f2) * gm.L(-5.0f));
        d53 d53Var = d53.h;
        wi8.t(translationY, d53Var, 290L);
        if (this.x && !this.y) {
            f = 1.0f;
        }
        float f4 = (0.1f * f) + 0.9f;
        this.f.animate().scaleX(f4).scaleY(f4).alpha(f).translationY((1.0f - f) * gm.L(this.y ? 5.0f : -5.0f)).setInterpolator(d53Var).setDuration(290L).start();
    }

    public final boolean o(String str) {
        if (this.L == null) {
            return true;
        }
        String lowerCase = s(str).toLowerCase();
        String lowerCase2 = this.L.toLowerCase();
        int min = Math.min(lowerCase.length(), lowerCase2.length());
        if (min <= 0) {
            return true;
        }
        return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
    }

    public final void p(boolean z) {
        nf6 nf6Var = this.V;
        gm.r(nf6Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z2 = TextUtils.isEmpty(this.c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        if (this.x != z2) {
            this.x = z2;
            TextView textView = this.s;
            float f = 0.9f;
            TextView textView2 = this.f;
            float f2 = 0.0f;
            if (z) {
                ViewPropertyAnimator scaleY = textView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.7f).scaleY(z2 ? 1.0f : 0.7f);
                d53 d53Var = d53.h;
                scaleY.setInterpolator(d53Var).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.x || this.y) ? 0.9f : 1.0f);
                if (this.x && !this.y) {
                    f = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f).alpha((!this.x || this.y) ? 0.0f : 1.0f);
                if (!this.x || this.y) {
                    f2 = gm.L(this.y ? 5.0f : -5.0f);
                }
                alpha.translationY(f2).setInterpolator(d53Var).setDuration(300L).start();
            } else {
                textView.setAlpha(z2 ? 1.0f : 0.0f);
                textView.setScaleX(z2 ? 1.0f : 0.7f);
                textView.setScaleY(z2 ? 1.0f : 0.7f);
                textView2.setScaleX((!this.x || this.y) ? 0.9f : 1.0f);
                if (this.x && !this.y) {
                    f = 1.0f;
                }
                textView2.setScaleY(f);
                textView2.setAlpha((!this.x || this.y) ? 0.0f : 1.0f);
                if (!this.x || this.y) {
                    f2 = gm.L(this.y ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(f2);
            }
        }
        gm.d3(nf6Var, 5000L);
    }

    public final void q() {
        ng6 ng6Var = this.w;
        int i = cmb.x6;
        anb.X(ng6Var, i, null);
        this.w.setTag(R.id.color_key_tag, Integer.valueOf(i));
        try {
            synchronized (this.P) {
                Timer timer = this.O;
                if (timer != null) {
                    timer.cancel();
                    this.O = null;
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void r(boolean z) {
        l7 l7Var = this.c;
        if (this.b0.getParentActivity() == null) {
            return;
        }
        try {
            l7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z2 = this.a != 16;
        TextView textView = this.e;
        if (z) {
            textView.setText(jb6.M0(!z2 ? 2131745690 : 2131745698, null));
        } else if (TextUtils.isEmpty(l7Var.getText())) {
            textView.setText("");
        } else {
            textView.setText(jb6.M0(!z2 ? 2131745688 : 2131745696, null));
        }
        if (!this.y && !this.E) {
            gm.A3(this.a0, l7Var, null);
            gm.A3(this.a0, textView, null);
        }
        nf6 nf6Var = this.W;
        gm.r(nf6Var);
        n(true);
        gm.d3(nf6Var, 10000L);
        this.a0 = -this.a0;
    }

    @Override // kla
    public final void updateColors() {
        int i = cmb.F6;
        mh6 mh6Var = this.b0;
        this.n.setTextColor(mh6Var.getThemedColor(i));
        this.r.setTextColor(mh6Var.getThemedColor(cmb.C6));
        int themedColor = mh6Var.getThemedColor(i);
        l7 l7Var = this.c;
        l7Var.setTextColor(themedColor);
        l7Var.setCursorColor(mh6Var.getThemedColor(cmb.k6));
        l7Var.setHintTextColor(mh6Var.getThemedColor(cmb.G6));
        this.b.f();
    }
}
