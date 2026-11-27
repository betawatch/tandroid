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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sf6 extends cna {
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
    public final qf6 V;
    public final qf6 W;
    public final byte a;
    public float a0;
    public final lu7 b;
    public final /* synthetic */ qh6 b0;
    public final m7 c;
    public final te6 d;
    public final TextView e;
    public final TextView f;
    public final e29 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final rg6 w;
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
    public sf6(qh6 qh6Var, Context context, int i) {
        super(context);
        boolean z;
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        this.b0 = qh6Var;
        final byte b = 1;
        this.x = true;
        final byte b2 = 0;
        this.y = false;
        this.E = false;
        this.P = new Object();
        this.Q = 60000;
        this.V = new qf6(this, (byte) 1);
        this.W = new qf6(this, (byte) 2);
        this.a0 = -3.0f;
        this.a = i;
        boolean z2 = i != 16;
        setOrientation(1);
        e29 e29Var = new e29(context);
        this.h = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        e29Var.f(R.raw.bubble, 95, 95, null);
        if (!hl.M1()) {
            Point point = hl.q;
            if (point.x <= point.y || hl.O1()) {
                z = false;
                e29Var.setVisibility(!z ? 8 : 0);
                addView(e29Var, tre.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(hl.o());
                textView.setLineSpacing(hl.L(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(ob6.M0(z2 ? 2131745678 : 2131745686, null));
                addView(textView, tre.t(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(hl.L(2.0f), 1.0f);
                addView(textView2, tre.t(-2, -2, 1, 8, 5, 8, 16));
                lu7 lu7Var = new lu7(context, null);
                this.b = lu7Var;
                lu7Var.setText(ob6.M0(z2 ? 2131745685 : 2131745693, null));
                m7 m7Var = new m7((byte) 4, context, this);
                this.c = m7Var;
                m7Var.setSingleLine();
                m7Var.setLines(1);
                m7Var.setCursorSize(hl.L(20.0f));
                m7Var.setCursorWidth(1.5f);
                m7Var.setImeOptions(268435461);
                m7Var.setTextSize(1, 18.0f);
                m7Var.setMaxLines(1);
                m7Var.setBackground(null);
                m7Var.setHint(ob6.M0(z2 ? 2131745681 : 2131745689, null));
                m7Var.addTextChangedListener(new gi(this));
                m7Var.setEllipsizeByGradient(true);
                m7Var.setInputType(1);
                m7Var.setTypeface(Typeface.DEFAULT);
                m7Var.setGravity(!ob6.a0 ? 5 : 3);
                m7Var.setOnFocusChangeListener(new ts0(this, (byte) 9));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 12.0f);
                textView3.setTypeface(hl.o());
                textView3.setText(ob6.M0(2131747162, null));
                textView3.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
                textView3.setGravity(17);
                int i2 = aob.o6;
                vnbVar = ((e) qh6Var).resourceProvider;
                int v0 = aob.v0(i2, vnbVar);
                vnbVar2 = ((e) qh6Var).resourceProvider;
                yob.X(textView3, i2, vnbVar2);
                int L = hl.L(6.0f);
                int p1 = aob.p1(0.12f, v0);
                int p12 = aob.p1(0.15f, v0);
                hf0 i0 = aob.i0(L, L, L, L, p1, p12, p12);
                uob K = yob.K(0.12f, i2);
                uob K2 = yob.K(0.15f, i2);
                vnbVar3 = ((e) qh6Var).resourceProvider;
                textView3.setBackground(i0);
                yob.j(textView3, i0, K, K2, vnbVar3);
                iye.b(textView3, 0.1f, 1.5f);
                m7Var.setPadding(hl.L(16.0f), hl.L(13.34f), hl.L(16.0f), hl.L(13.34f));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: rf6
                    public final /* synthetic */ sf6 b;

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
                        final sf6 sf6Var = this.b;
                        final byte b5 = 1;
                        switch (b3) {
                            case 0:
                                m7 m7Var2 = sf6Var.c;
                                try {
                                    charSequence = ((ClipboardManager) sf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(sf6Var.getContext());
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = m7Var2.getText();
                                    sf6Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, m7Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, m7Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                sf6Var.p(true);
                                break;
                            case 1:
                                sf6Var.c(true);
                                break;
                            default:
                                qh6 qh6Var2 = sf6Var.b0;
                                rg6 rg6Var = sf6Var.w;
                                if (sf6Var.Q <= 0 || sf6Var.O == null) {
                                    Bundle bundle = sf6Var.T;
                                    if (bundle != null && (tL_auth_sentCode = sf6Var.U) != null) {
                                        qh6Var2.q1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i5 = sf6Var.F;
                                        if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                            if (i5 == 3) {
                                                hl.y3(false);
                                                if (!sf6Var.S && !sf6Var.N && !qh6Var2.r0) {
                                                    sf6Var.N = true;
                                                    rg6Var.invalidate();
                                                    yob.X(rg6Var, aob.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", sf6Var.K);
                                                    bundle2.putString("ephone", sf6Var.J);
                                                    bundle2.putString("phoneFormated", sf6Var.H);
                                                    sf6Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = sf6Var.H;
                                                    tL_auth_resendCode.phone_code_hash = sf6Var.I;
                                                    i4 = ((e) qh6Var2).currentAccount;
                                                    qh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: nf6
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b6 = b5;
                                                            Bundle bundle3 = bundle2;
                                                            sf6 sf6Var2 = sf6Var;
                                                            switch (b6) {
                                                                case 0:
                                                                    hl.c3(new pf6(sf6Var2, tLObject, bundle3, tL_error));
                                                                    break;
                                                                default:
                                                                    hl.c3(new pf6(sf6Var2, tL_error, bundle3, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            sf6Var.N = true;
                                            rg6Var.invalidate();
                                            yob.X(rg6Var, aob.I6, null);
                                            rg6Var.setTextSize(1, 15.0f);
                                            int i6 = sf6Var.F;
                                            if (i6 == 4 || i6 == 11) {
                                                rg6Var.setText(ob6.M0(2131752578, null));
                                            } else {
                                                rg6Var.setText(ob6.M0(2131745305, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", sf6Var.K);
                                            bundle3.putString("ephone", sf6Var.J);
                                            bundle3.putString("phoneFormated", sf6Var.H);
                                            bundle3.putInt("prevType", sf6Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = sf6Var.H;
                                            tL_auth_resendCode2.phone_code_hash = sf6Var.I;
                                            i3 = ((e) qh6Var2).currentAccount;
                                            ConnectionsManager.getInstance(i3).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: nf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b4;
                                                    Bundle bundle32 = bundle3;
                                                    sf6 sf6Var2 = sf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
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
                lu7Var.addView(m7Var, tre.d(-1, -2.0f, jn7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
                lu7Var.e(m7Var);
                lu7Var.addView(textView3, tre.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(lu7Var, tre.r(-1, -2, 1));
                addView(linearLayout, tre.t(-1, -2, 1, 16, 3, 16, 0));
                m7Var.setOnEditorActionListener(new j(this, (byte) 14));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, tre.o(-1, -2));
                te6 te6Var = new te6(qh6Var, context);
                this.d = te6Var;
                int i3 = aob.I6;
                yob.G(te6Var, i3, null);
                yob.X(te6Var, i3, qh6Var.getResourceProvider());
                te6Var.setTextSize(1, 14.0f);
                te6Var.setLineSpacing(hl.L(2.0f), 1.0f);
                te6Var.setPadding(hl.L(14.0f), hl.L(8.0f), hl.L(14.0f), hl.L(16.0f));
                te6Var.setOnClickListener(new View.OnClickListener(this) { // from class: rf6
                    public final /* synthetic */ sf6 b;

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
                        final sf6 sf6Var = this.b;
                        final byte b5 = 1;
                        switch (b3) {
                            case 0:
                                m7 m7Var2 = sf6Var.c;
                                try {
                                    charSequence = ((ClipboardManager) sf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(sf6Var.getContext());
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = m7Var2.getText();
                                    sf6Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, m7Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, m7Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                sf6Var.p(true);
                                break;
                            case 1:
                                sf6Var.c(true);
                                break;
                            default:
                                qh6 qh6Var2 = sf6Var.b0;
                                rg6 rg6Var = sf6Var.w;
                                if (sf6Var.Q <= 0 || sf6Var.O == null) {
                                    Bundle bundle = sf6Var.T;
                                    if (bundle != null && (tL_auth_sentCode = sf6Var.U) != null) {
                                        qh6Var2.q1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i5 = sf6Var.F;
                                        if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                            if (i5 == 3) {
                                                hl.y3(false);
                                                if (!sf6Var.S && !sf6Var.N && !qh6Var2.r0) {
                                                    sf6Var.N = true;
                                                    rg6Var.invalidate();
                                                    yob.X(rg6Var, aob.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", sf6Var.K);
                                                    bundle2.putString("ephone", sf6Var.J);
                                                    bundle2.putString("phoneFormated", sf6Var.H);
                                                    sf6Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = sf6Var.H;
                                                    tL_auth_resendCode.phone_code_hash = sf6Var.I;
                                                    i4 = ((e) qh6Var2).currentAccount;
                                                    qh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: nf6
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b6 = b5;
                                                            Bundle bundle32 = bundle2;
                                                            sf6 sf6Var2 = sf6Var;
                                                            switch (b6) {
                                                                case 0:
                                                                    hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                                    break;
                                                                default:
                                                                    hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            sf6Var.N = true;
                                            rg6Var.invalidate();
                                            yob.X(rg6Var, aob.I6, null);
                                            rg6Var.setTextSize(1, 15.0f);
                                            int i6 = sf6Var.F;
                                            if (i6 == 4 || i6 == 11) {
                                                rg6Var.setText(ob6.M0(2131752578, null));
                                            } else {
                                                rg6Var.setText(ob6.M0(2131745305, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", sf6Var.K);
                                            bundle3.putString("ephone", sf6Var.J);
                                            bundle3.putString("phoneFormated", sf6Var.H);
                                            bundle3.putInt("prevType", sf6Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = sf6Var.H;
                                            tL_auth_resendCode2.phone_code_hash = sf6Var.I;
                                            i32 = ((e) qh6Var2).currentAccount;
                                            ConnectionsManager.getInstance(i32).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: nf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b4;
                                                    Bundle bundle32 = bundle3;
                                                    sf6 sf6Var2 = sf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
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
                addView(te6Var, tre.t(-2, -2, 1, 0, 18, 0, 0));
                te6Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(ob6.M0(z2 ? 2131745682 : 2131745690, null));
                yob.X(textView4, aob.p7, qh6Var.getResourceProvider());
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, tre.d(-1, -2.0f, jn7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-hl.L(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(ob6.M0(z2 ? 2131745680 : 2131745688, null));
                yob.X(textView5, aob.y6, qh6Var.getResourceProvider());
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, tre.d(-1, -2.0f, jn7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
                rg6 rg6Var = new rg6(this, context);
                this.w = rg6Var;
                yob.G(rg6Var, i3, null);
                rg6Var.setLineSpacing(hl.L(2.0f), 1.0f);
                rg6Var.setPadding(hl.L(14.0f), hl.L(8.0f), hl.L(14.0f), hl.L(16.0f));
                rg6Var.setTextSize(1, 15.0f);
                rg6Var.setGravity(19);
                final byte b3 = 2;
                rg6Var.setOnClickListener(new View.OnClickListener(this) { // from class: rf6
                    public final /* synthetic */ sf6 b;

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
                        final sf6 sf6Var = this.b;
                        final byte b5 = 1;
                        switch (b32) {
                            case 0:
                                m7 m7Var2 = sf6Var.c;
                                try {
                                    charSequence = ((ClipboardManager) sf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(sf6Var.getContext());
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = m7Var2.getText();
                                    sf6Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, m7Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, m7Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                sf6Var.p(true);
                                break;
                            case 1:
                                sf6Var.c(true);
                                break;
                            default:
                                qh6 qh6Var2 = sf6Var.b0;
                                rg6 rg6Var2 = sf6Var.w;
                                if (sf6Var.Q <= 0 || sf6Var.O == null) {
                                    Bundle bundle = sf6Var.T;
                                    if (bundle != null && (tL_auth_sentCode = sf6Var.U) != null) {
                                        qh6Var2.q1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i5 = sf6Var.F;
                                        if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                            if (i5 == 3) {
                                                hl.y3(false);
                                                if (!sf6Var.S && !sf6Var.N && !qh6Var2.r0) {
                                                    sf6Var.N = true;
                                                    rg6Var2.invalidate();
                                                    yob.X(rg6Var2, aob.I6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", sf6Var.K);
                                                    bundle2.putString("ephone", sf6Var.J);
                                                    bundle2.putString("phoneFormated", sf6Var.H);
                                                    sf6Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = sf6Var.H;
                                                    tL_auth_resendCode.phone_code_hash = sf6Var.I;
                                                    i4 = ((e) qh6Var2).currentAccount;
                                                    qh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: nf6
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b6 = b5;
                                                            Bundle bundle32 = bundle2;
                                                            sf6 sf6Var2 = sf6Var;
                                                            switch (b6) {
                                                                case 0:
                                                                    hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                                    break;
                                                                default:
                                                                    hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            sf6Var.N = true;
                                            rg6Var2.invalidate();
                                            yob.X(rg6Var2, aob.I6, null);
                                            rg6Var2.setTextSize(1, 15.0f);
                                            int i6 = sf6Var.F;
                                            if (i6 == 4 || i6 == 11) {
                                                rg6Var2.setText(ob6.M0(2131752578, null));
                                            } else {
                                                rg6Var2.setText(ob6.M0(2131745305, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", sf6Var.K);
                                            bundle3.putString("ephone", sf6Var.J);
                                            bundle3.putString("phoneFormated", sf6Var.H);
                                            bundle3.putInt("prevType", sf6Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = sf6Var.H;
                                            tL_auth_resendCode2.phone_code_hash = sf6Var.I;
                                            i32 = ((e) qh6Var2).currentAccount;
                                            ConnectionsManager.getInstance(i32).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: nf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b4;
                                                    Bundle bundle32 = bundle3;
                                                    sf6 sf6Var2 = sf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
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
                frameLayout2.addView(rg6Var, tre.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, tre.r(-1, -1, 80));
                ko9.e(rg6Var);
            }
        }
        z = true;
        e29Var.setVisibility(!z ? 8 : 0);
        addView(e29Var, tre.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(hl.o());
        textView6.setLineSpacing(hl.L(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(ob6.M0(z2 ? 2131745678 : 2131745686, null));
        addView(textView6, tre.t(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView22, tre.t(-2, -2, 1, 8, 5, 8, 16));
        lu7 lu7Var2 = new lu7(context, null);
        this.b = lu7Var2;
        lu7Var2.setText(ob6.M0(z2 ? 2131745685 : 2131745693, null));
        m7 m7Var2 = new m7((byte) 4, context, this);
        this.c = m7Var2;
        m7Var2.setSingleLine();
        m7Var2.setLines(1);
        m7Var2.setCursorSize(hl.L(20.0f));
        m7Var2.setCursorWidth(1.5f);
        m7Var2.setImeOptions(268435461);
        m7Var2.setTextSize(1, 18.0f);
        m7Var2.setMaxLines(1);
        m7Var2.setBackground(null);
        m7Var2.setHint(ob6.M0(z2 ? 2131745681 : 2131745689, null));
        m7Var2.addTextChangedListener(new gi(this));
        m7Var2.setEllipsizeByGradient(true);
        m7Var2.setInputType(1);
        m7Var2.setTypeface(Typeface.DEFAULT);
        m7Var2.setGravity(!ob6.a0 ? 5 : 3);
        m7Var2.setOnFocusChangeListener(new ts0(this, (byte) 9));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        textView32.setTextSize(1, 12.0f);
        textView32.setTypeface(hl.o());
        textView32.setText(ob6.M0(2131747162, null));
        textView32.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        textView32.setGravity(17);
        int i22 = aob.o6;
        vnbVar = ((e) qh6Var).resourceProvider;
        int v02 = aob.v0(i22, vnbVar);
        vnbVar2 = ((e) qh6Var).resourceProvider;
        yob.X(textView32, i22, vnbVar2);
        int L2 = hl.L(6.0f);
        int p13 = aob.p1(0.12f, v02);
        int p122 = aob.p1(0.15f, v02);
        hf0 i02 = aob.i0(L2, L2, L2, L2, p13, p122, p122);
        uob K3 = yob.K(0.12f, i22);
        uob K22 = yob.K(0.15f, i22);
        vnbVar3 = ((e) qh6Var).resourceProvider;
        textView32.setBackground(i02);
        yob.j(textView32, i02, K3, K22, vnbVar3);
        iye.b(textView32, 0.1f, 1.5f);
        m7Var2.setPadding(hl.L(16.0f), hl.L(13.34f), hl.L(16.0f), hl.L(13.34f));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: rf6
            public final /* synthetic */ sf6 b;

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
                final sf6 sf6Var = this.b;
                final byte b5 = 1;
                switch (b32) {
                    case 0:
                        m7 m7Var22 = sf6Var.c;
                        try {
                            charSequence = ((ClipboardManager) sf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(sf6Var.getContext());
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = m7Var22.getText();
                            sf6Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, m7Var22.getSelectionStart());
                                text.replace(max, Math.max(max, m7Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        sf6Var.p(true);
                        break;
                    case 1:
                        sf6Var.c(true);
                        break;
                    default:
                        qh6 qh6Var2 = sf6Var.b0;
                        rg6 rg6Var2 = sf6Var.w;
                        if (sf6Var.Q <= 0 || sf6Var.O == null) {
                            Bundle bundle = sf6Var.T;
                            if (bundle != null && (tL_auth_sentCode = sf6Var.U) != null) {
                                qh6Var2.q1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i5 = sf6Var.F;
                                if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                    if (i5 == 3) {
                                        hl.y3(false);
                                        if (!sf6Var.S && !sf6Var.N && !qh6Var2.r0) {
                                            sf6Var.N = true;
                                            rg6Var2.invalidate();
                                            yob.X(rg6Var2, aob.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", sf6Var.K);
                                            bundle2.putString("ephone", sf6Var.J);
                                            bundle2.putString("phoneFormated", sf6Var.H);
                                            sf6Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = sf6Var.H;
                                            tL_auth_resendCode.phone_code_hash = sf6Var.I;
                                            i4 = ((e) qh6Var2).currentAccount;
                                            qh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: nf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b5;
                                                    Bundle bundle32 = bundle2;
                                                    sf6 sf6Var2 = sf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    sf6Var.N = true;
                                    rg6Var2.invalidate();
                                    yob.X(rg6Var2, aob.I6, null);
                                    rg6Var2.setTextSize(1, 15.0f);
                                    int i6 = sf6Var.F;
                                    if (i6 == 4 || i6 == 11) {
                                        rg6Var2.setText(ob6.M0(2131752578, null));
                                    } else {
                                        rg6Var2.setText(ob6.M0(2131745305, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", sf6Var.K);
                                    bundle3.putString("ephone", sf6Var.J);
                                    bundle3.putString("phoneFormated", sf6Var.H);
                                    bundle3.putInt("prevType", sf6Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = sf6Var.H;
                                    tL_auth_resendCode2.phone_code_hash = sf6Var.I;
                                    i32 = ((e) qh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i32).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: nf6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            Bundle bundle32 = bundle3;
                                            sf6 sf6Var2 = sf6Var;
                                            switch (b6) {
                                                case 0:
                                                    hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                    break;
                                                default:
                                                    hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
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
        lu7Var2.addView(m7Var2, tre.d(-1, -2.0f, jn7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        lu7Var2.e(m7Var2);
        lu7Var2.addView(textView32, tre.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(lu7Var2, tre.r(-1, -2, 1));
        addView(linearLayout2, tre.t(-1, -2, 1, 16, 3, 16, 0));
        m7Var2.setOnEditorActionListener(new j(this, (byte) 14));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, tre.o(-1, -2));
        te6 te6Var2 = new te6(qh6Var, context);
        this.d = te6Var2;
        int i32 = aob.I6;
        yob.G(te6Var2, i32, null);
        yob.X(te6Var2, i32, qh6Var.getResourceProvider());
        te6Var2.setTextSize(1, 14.0f);
        te6Var2.setLineSpacing(hl.L(2.0f), 1.0f);
        te6Var2.setPadding(hl.L(14.0f), hl.L(8.0f), hl.L(14.0f), hl.L(16.0f));
        te6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: rf6
            public final /* synthetic */ sf6 b;

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
                final sf6 sf6Var = this.b;
                final byte b5 = 1;
                switch (b32) {
                    case 0:
                        m7 m7Var22 = sf6Var.c;
                        try {
                            charSequence = ((ClipboardManager) sf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(sf6Var.getContext());
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = m7Var22.getText();
                            sf6Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, m7Var22.getSelectionStart());
                                text.replace(max, Math.max(max, m7Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        sf6Var.p(true);
                        break;
                    case 1:
                        sf6Var.c(true);
                        break;
                    default:
                        qh6 qh6Var2 = sf6Var.b0;
                        rg6 rg6Var2 = sf6Var.w;
                        if (sf6Var.Q <= 0 || sf6Var.O == null) {
                            Bundle bundle = sf6Var.T;
                            if (bundle != null && (tL_auth_sentCode = sf6Var.U) != null) {
                                qh6Var2.q1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i5 = sf6Var.F;
                                if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                    if (i5 == 3) {
                                        hl.y3(false);
                                        if (!sf6Var.S && !sf6Var.N && !qh6Var2.r0) {
                                            sf6Var.N = true;
                                            rg6Var2.invalidate();
                                            yob.X(rg6Var2, aob.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", sf6Var.K);
                                            bundle2.putString("ephone", sf6Var.J);
                                            bundle2.putString("phoneFormated", sf6Var.H);
                                            sf6Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = sf6Var.H;
                                            tL_auth_resendCode.phone_code_hash = sf6Var.I;
                                            i4 = ((e) qh6Var2).currentAccount;
                                            qh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: nf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b5;
                                                    Bundle bundle32 = bundle2;
                                                    sf6 sf6Var2 = sf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    sf6Var.N = true;
                                    rg6Var2.invalidate();
                                    yob.X(rg6Var2, aob.I6, null);
                                    rg6Var2.setTextSize(1, 15.0f);
                                    int i6 = sf6Var.F;
                                    if (i6 == 4 || i6 == 11) {
                                        rg6Var2.setText(ob6.M0(2131752578, null));
                                    } else {
                                        rg6Var2.setText(ob6.M0(2131745305, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", sf6Var.K);
                                    bundle3.putString("ephone", sf6Var.J);
                                    bundle3.putString("phoneFormated", sf6Var.H);
                                    bundle3.putInt("prevType", sf6Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = sf6Var.H;
                                    tL_auth_resendCode2.phone_code_hash = sf6Var.I;
                                    i322 = ((e) qh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: nf6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            Bundle bundle32 = bundle3;
                                            sf6 sf6Var2 = sf6Var;
                                            switch (b6) {
                                                case 0:
                                                    hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                    break;
                                                default:
                                                    hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
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
        addView(te6Var2, tre.t(-2, -2, 1, 0, 18, 0, 0));
        te6Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(ob6.M0(z2 ? 2131745682 : 2131745690, null));
        yob.X(textView42, aob.p7, qh6Var.getResourceProvider());
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, tre.d(-1, -2.0f, jn7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-hl.L(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(ob6.M0(z2 ? 2131745680 : 2131745688, null));
        yob.X(textView52, aob.y6, qh6Var.getResourceProvider());
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, tre.d(-1, -2.0f, jn7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
        rg6 rg6Var2 = new rg6(this, context);
        this.w = rg6Var2;
        yob.G(rg6Var2, i32, null);
        rg6Var2.setLineSpacing(hl.L(2.0f), 1.0f);
        rg6Var2.setPadding(hl.L(14.0f), hl.L(8.0f), hl.L(14.0f), hl.L(16.0f));
        rg6Var2.setTextSize(1, 15.0f);
        rg6Var2.setGravity(19);
        final byte b32 = 2;
        rg6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: rf6
            public final /* synthetic */ sf6 b;

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
                final sf6 sf6Var = this.b;
                final byte b5 = 1;
                switch (b322) {
                    case 0:
                        m7 m7Var22 = sf6Var.c;
                        try {
                            charSequence = ((ClipboardManager) sf6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(sf6Var.getContext());
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = m7Var22.getText();
                            sf6Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, m7Var22.getSelectionStart());
                                text.replace(max, Math.max(max, m7Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        sf6Var.p(true);
                        break;
                    case 1:
                        sf6Var.c(true);
                        break;
                    default:
                        qh6 qh6Var2 = sf6Var.b0;
                        rg6 rg6Var22 = sf6Var.w;
                        if (sf6Var.Q <= 0 || sf6Var.O == null) {
                            Bundle bundle = sf6Var.T;
                            if (bundle != null && (tL_auth_sentCode = sf6Var.U) != null) {
                                qh6Var2.q1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i5 = sf6Var.F;
                                if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                    if (i5 == 3) {
                                        hl.y3(false);
                                        if (!sf6Var.S && !sf6Var.N && !qh6Var2.r0) {
                                            sf6Var.N = true;
                                            rg6Var22.invalidate();
                                            yob.X(rg6Var22, aob.I6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", sf6Var.K);
                                            bundle2.putString("ephone", sf6Var.J);
                                            bundle2.putString("phoneFormated", sf6Var.H);
                                            sf6Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = sf6Var.H;
                                            tL_auth_resendCode.phone_code_hash = sf6Var.I;
                                            i4 = ((e) qh6Var2).currentAccount;
                                            qh6Var2.B1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: nf6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b5;
                                                    Bundle bundle32 = bundle2;
                                                    sf6 sf6Var2 = sf6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    sf6Var.N = true;
                                    rg6Var22.invalidate();
                                    yob.X(rg6Var22, aob.I6, null);
                                    rg6Var22.setTextSize(1, 15.0f);
                                    int i6 = sf6Var.F;
                                    if (i6 == 4 || i6 == 11) {
                                        rg6Var22.setText(ob6.M0(2131752578, null));
                                    } else {
                                        rg6Var22.setText(ob6.M0(2131745305, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", sf6Var.K);
                                    bundle3.putString("ephone", sf6Var.J);
                                    bundle3.putString("phoneFormated", sf6Var.H);
                                    bundle3.putInt("prevType", sf6Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = sf6Var.H;
                                    tL_auth_resendCode2.phone_code_hash = sf6Var.I;
                                    i322 = ((e) qh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: nf6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            Bundle bundle32 = bundle3;
                                            sf6 sf6Var2 = sf6Var;
                                            switch (b6) {
                                                case 0:
                                                    hl.c3(new pf6(sf6Var2, tLObject, bundle32, tL_error));
                                                    break;
                                                default:
                                                    hl.c3(new pf6(sf6Var2, tL_error, bundle32, tLObject));
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
        frameLayout22.addView(rg6Var2, tre.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, tre.r(-1, -1, 80));
        ko9.e(rg6Var2);
    }

    public static String s(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) <= ' ') {
            i++;
        }
        return (i > 0 || length < str.length()) ? str.substring(i, length) : str;
    }

    @Override // cna
    public final boolean b() {
        return true;
    }

    @Override // cna
    public final boolean c(boolean z) {
        qh6 qh6Var = this.b0;
        qh6Var.y1(true, true);
        int i = this.G;
        if (i != 0) {
            qh6Var.J1(i, true, null, true);
            return false;
        }
        this.M = null;
        this.S = false;
        return true;
    }

    @Override // cna
    public final void d() {
        this.S = false;
    }

    @Override // cna
    public final void g() {
        hl.r(this.V);
    }

    @Override // cna
    public String getHeaderName() {
        return ob6.M0(2131748020, "NewPassword");
    }

    @Override // cna
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
        qh6 qh6Var = this.b0;
        qh6Var.B1(qh6Var.getConnectionsManager().sendRequest(tL_auth_signIn, new mf6(this, tL_auth_signIn, (byte) 0), 10), true);
        qh6Var.K1(true, true);
    }

    @Override // cna
    public final void i() {
        p(true);
    }

    @Override // cna
    public final void j() {
        hl.d3(new qf6(this, (byte) 3), qh6.A0);
    }

    @Override // cna
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + ((int) this.a));
        this.M = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // cna
    public final void l(Bundle bundle) {
        if (this.M != null) {
            bundle.putBundle("recoveryview_word" + ((int) this.a), this.M);
        }
    }

    @Override // cna
    public final void m(Bundle bundle, boolean z) {
        rg6 rg6Var = this.w;
        if (bundle == null) {
            if (this.T == null || this.U == null) {
                return;
            }
            yob.X(rg6Var, aob.I6, null);
            int i = this.F;
            rg6Var.setText(hl.E2(ob6.M0(i == 17 ? 2131745777 : i == 16 ? 2131745775 : i == 3 ? 2131745774 : 2131745776, null), true, hl.L(1.0f), hl.L(1.0f)));
            return;
        }
        m7 m7Var = this.c;
        m7Var.setText("");
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
        te6 te6Var = this.d;
        if (i2 == 17) {
            te6Var.setVisibility(0);
            te6Var.setText(hl.E2(ob6.M0(2131753747, null), true, hl.L(-1.0f), hl.L(1.0f)));
        } else if (i2 == 16) {
            te6Var.setVisibility(0);
            te6Var.setText(hl.E2(ob6.M0(2131753746, null), true, hl.L(-1.0f), hl.L(1.0f)));
        } else if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 3 || i2 == 15) {
            te6Var.setVisibility(0);
            te6Var.setText(hl.E2(ob6.M0(2131753748, null), true, hl.L(-1.0f), hl.L(1.0f)));
        } else {
            te6Var.setVisibility(8);
        }
        this.T = null;
        this.U = null;
        this.S = false;
        this.N = false;
        qh6 qh6Var = this.b0;
        qh6Var.r0 = false;
        rg6Var.invalidate();
        boolean z2 = this.a != 16;
        String str = "+" + f78.f().e(f78.h(this.K, false));
        String str2 = this.L;
        TextView textView = this.r;
        if (str2 == null) {
            uh9.r(null, null, !z2 ? 2131745679 : 2131745687, new Object[]{str}, textView);
        } else {
            uh9.r(null, null, !z2 ? 2131745683 : 2131745691, new Object[]{str, str2}, textView);
        }
        qh6Var.M1(m7Var);
        m7Var.requestFocus();
        e29 e29Var = this.h;
        if (e29Var.getAnimatedDrawable() != null) {
            e29Var.getAnimatedDrawable().I(0, false, false);
        }
        hl.d3(new z96(e29Var, (byte) 6), 500L);
        p(false);
        n(false);
        this.R = System.currentTimeMillis();
        int i3 = aob.y6;
        yob.X(rg6Var, i3, null);
        int i4 = this.F;
        if (i4 != 2 && i4 != 4 && i4 != 3) {
            rg6Var.setVisibility(8);
            return;
        }
        if (this.O != null) {
            return;
        }
        yob.X(rg6Var, i3, null);
        rg6Var.setTag(R.id.color_key_tag, Integer.valueOf(i3));
        Timer timer = new Timer();
        this.O = timer;
        timer.schedule(new vw3(this, (byte) 1), 0L, 1000L);
    }

    public final void n(boolean z) {
        this.y = z;
        float f = 0.0f;
        float f2 = z ? 1.0f : 0.0f;
        this.b.a(f2);
        float f3 = (f2 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f3).scaleY(f3).alpha(f2).translationY((1.0f - f2) * hl.L(-5.0f));
        k43 k43Var = k43.h;
        ik8.t(translationY, k43Var, 290L);
        if (this.x && !this.y) {
            f = 1.0f;
        }
        float f4 = (0.1f * f) + 0.9f;
        this.f.animate().scaleX(f4).scaleY(f4).alpha(f).translationY((1.0f - f) * hl.L(this.y ? 5.0f : -5.0f)).setInterpolator(k43Var).setDuration(290L).start();
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
        qf6 qf6Var = this.V;
        hl.r(qf6Var);
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
                k43 k43Var = k43.h;
                scaleY.setInterpolator(k43Var).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.x || this.y) ? 0.9f : 1.0f);
                if (this.x && !this.y) {
                    f = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f).alpha((!this.x || this.y) ? 0.0f : 1.0f);
                if (!this.x || this.y) {
                    f2 = hl.L(this.y ? 5.0f : -5.0f);
                }
                alpha.translationY(f2).setInterpolator(k43Var).setDuration(300L).start();
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
                    f2 = hl.L(this.y ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(f2);
            }
        }
        hl.d3(qf6Var, 5000L);
    }

    public final void q() {
        rg6 rg6Var = this.w;
        int i = aob.y6;
        yob.X(rg6Var, i, null);
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
            cc4.g(e, true);
        }
    }

    public final void r(boolean z) {
        m7 m7Var = this.c;
        if (this.b0.getParentActivity() == null) {
            return;
        }
        try {
            m7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        boolean z2 = this.a != 16;
        TextView textView = this.e;
        if (z) {
            textView.setText(ob6.M0(!z2 ? 2131745684 : 2131745692, null));
        } else if (TextUtils.isEmpty(m7Var.getText())) {
            textView.setText("");
        } else {
            textView.setText(ob6.M0(!z2 ? 2131745682 : 2131745690, null));
        }
        if (!this.y && !this.E) {
            hl.A3(this.a0, m7Var, null);
            hl.A3(this.a0, textView, null);
        }
        qf6 qf6Var = this.W;
        hl.r(qf6Var);
        n(true);
        hl.d3(qf6Var, 10000L);
        this.a0 = -this.a0;
    }

    @Override // cna
    public final void updateColors() {
        int i = aob.G6;
        qh6 qh6Var = this.b0;
        this.n.setTextColor(qh6Var.getThemedColor(i));
        this.r.setTextColor(qh6Var.getThemedColor(aob.D6));
        int themedColor = qh6Var.getThemedColor(i);
        m7 m7Var = this.c;
        m7Var.setTextColor(themedColor);
        m7Var.setCursorColor(qh6Var.getThemedColor(aob.l6));
        m7Var.setHintTextColor(qh6Var.getThemedColor(aob.H6));
        this.b.f();
    }
}
