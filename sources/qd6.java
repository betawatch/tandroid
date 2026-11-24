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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qd6 extends jja {
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
    public final od6 V;
    public final od6 W;
    public final byte a;
    public float a0;
    public final er7 b;
    public final /* synthetic */ mf6 b0;
    public final l7 c;
    public final qc6 d;
    public final TextView e;
    public final TextView f;
    public final ry8 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final oe6 w;
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
    public qd6(mf6 mf6Var, Context context, int i) {
        super(context);
        boolean z;
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        this.b0 = mf6Var;
        final byte b = 1;
        this.x = true;
        final byte b2 = 0;
        this.y = false;
        this.E = false;
        this.P = new Object();
        this.Q = 60000;
        this.V = new od6(this, (byte) 1);
        this.W = new od6(this, (byte) 2);
        this.a0 = -3.0f;
        this.a = i;
        boolean z2 = i != 16;
        setOrientation(1);
        ry8 ry8Var = new ry8(context);
        this.h = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        ry8Var.f(R.raw.bubble, 95, 95, null);
        if (!gl.M1()) {
            Point point = gl.q;
            if (point.x <= point.y || gl.O1()) {
                z = false;
                ry8Var.setVisibility(!z ? 8 : 0);
                addView(ry8Var, nme.t(95, 95, 1, 0, 10, 0, 5));
                TextView textView = new TextView(context);
                this.n = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(gl.o());
                textView.setLineSpacing(gl.L(2.0f), 1.0f);
                textView.setGravity(49);
                textView.setText(k96.M0(z2 ? 2131745758 : 2131745766, null));
                addView(textView, nme.t(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
                TextView textView2 = new TextView(context);
                this.r = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(gl.L(2.0f), 1.0f);
                addView(textView2, nme.t(-2, -2, 1, 8, 5, 8, 16));
                er7 er7Var = new er7(context, null);
                this.b = er7Var;
                er7Var.setText(k96.M0(z2 ? 2131745765 : 2131745773, null));
                l7 l7Var = new l7((byte) 4, context, this);
                this.c = l7Var;
                l7Var.setSingleLine();
                l7Var.setLines(1);
                l7Var.setCursorSize(gl.L(20.0f));
                l7Var.setCursorWidth(1.5f);
                l7Var.setImeOptions(268435461);
                l7Var.setTextSize(1, 18.0f);
                l7Var.setMaxLines(1);
                l7Var.setBackground(null);
                l7Var.setHint(k96.M0(z2 ? 2131745761 : 2131745769, null));
                l7Var.addTextChangedListener(new fi(this));
                l7Var.setEllipsizeByGradient(true);
                l7Var.setInputType(1);
                l7Var.setTypeface(Typeface.DEFAULT);
                l7Var.setGravity(!k96.a0 ? 5 : 3);
                l7Var.setOnFocusChangeListener(new ls0(this, (byte) 9));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 12.0f);
                textView3.setTypeface(gl.o());
                textView3.setText(k96.M0(2131747242, null));
                textView3.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
                textView3.setGravity(17);
                int i2 = bkb.n6;
                wjbVar = ((d) mf6Var).resourceProvider;
                int v0 = bkb.v0(i2, wjbVar);
                wjbVar2 = ((d) mf6Var).resourceProvider;
                zkb.X(textView3, i2, wjbVar2);
                int L = gl.L(6.0f);
                int p1 = bkb.p1(0.12f, v0);
                int p12 = bkb.p1(0.15f, v0);
                ff0 i0 = bkb.i0(L, L, L, L, p1, p12, p12);
                vkb K = zkb.K(0.12f, i2);
                vkb K2 = zkb.K(0.15f, i2);
                wjbVar3 = ((d) mf6Var).resourceProvider;
                textView3.setBackground(i0);
                zkb.j(textView3, i0, K, K2, wjbVar3);
                ote.b(textView3, 0.1f, 1.5f);
                l7Var.setPadding(gl.L(16.0f), gl.L(13.34f), gl.L(16.0f), gl.L(13.34f));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: pd6
                    public final /* synthetic */ qd6 b;

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
                        final qd6 qd6Var = this.b;
                        final byte b5 = 1;
                        switch (b3) {
                            case 0:
                                l7 l7Var2 = qd6Var.c;
                                try {
                                    charSequence = ((ClipboardManager) qd6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qd6Var.getContext());
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = l7Var2.getText();
                                    qd6Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, l7Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, l7Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                qd6Var.p(true);
                                break;
                            case 1:
                                qd6Var.d(true);
                                break;
                            default:
                                mf6 mf6Var2 = qd6Var.b0;
                                oe6 oe6Var = qd6Var.w;
                                if (qd6Var.Q <= 0 || qd6Var.O == null) {
                                    Bundle bundle = qd6Var.T;
                                    if (bundle != null && (tL_auth_sentCode = qd6Var.U) != null) {
                                        mf6Var2.p1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i5 = qd6Var.F;
                                        if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                            if (i5 == 3) {
                                                gl.y3(false);
                                                if (!qd6Var.S && !qd6Var.N && !mf6Var2.r0) {
                                                    qd6Var.N = true;
                                                    oe6Var.invalidate();
                                                    zkb.X(oe6Var, bkb.H6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", qd6Var.K);
                                                    bundle2.putString("ephone", qd6Var.J);
                                                    bundle2.putString("phoneFormated", qd6Var.H);
                                                    qd6Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = qd6Var.H;
                                                    tL_auth_resendCode.phone_code_hash = qd6Var.I;
                                                    i4 = ((d) mf6Var2).currentAccount;
                                                    mf6Var2.A1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: ld6
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b6 = b5;
                                                            Bundle bundle3 = bundle2;
                                                            qd6 qd6Var2 = qd6Var;
                                                            switch (b6) {
                                                                case 0:
                                                                    gl.c3(new nd6(qd6Var2, tLObject, bundle3, tL_error));
                                                                    break;
                                                                default:
                                                                    gl.c3(new nd6(qd6Var2, tL_error, bundle3, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qd6Var.N = true;
                                            oe6Var.invalidate();
                                            zkb.X(oe6Var, bkb.H6, null);
                                            oe6Var.setTextSize(1, 15.0f);
                                            int i6 = qd6Var.F;
                                            if (i6 == 4 || i6 == 11) {
                                                oe6Var.setText(k96.M0(2131752585, null));
                                            } else {
                                                oe6Var.setText(k96.M0(2131745385, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", qd6Var.K);
                                            bundle3.putString("ephone", qd6Var.J);
                                            bundle3.putString("phoneFormated", qd6Var.H);
                                            bundle3.putInt("prevType", qd6Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = qd6Var.H;
                                            tL_auth_resendCode2.phone_code_hash = qd6Var.I;
                                            i3 = ((d) mf6Var2).currentAccount;
                                            ConnectionsManager.getInstance(i3).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: ld6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b4;
                                                    Bundle bundle32 = bundle3;
                                                    qd6 qd6Var2 = qd6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
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
                er7Var.addView(l7Var, nme.d(-1, -2.0f, kk7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
                er7Var.e(l7Var);
                er7Var.addView(textView3, nme.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(er7Var, nme.r(-1, -2, 1));
                addView(linearLayout, nme.t(-1, -2, 1, 16, 3, 16, 0));
                l7Var.setOnEditorActionListener(new j(this, (byte) 14));
                FrameLayout frameLayout = new FrameLayout(context);
                linearLayout.addView(frameLayout, nme.o(-1, -2));
                qc6 qc6Var = new qc6(mf6Var, context);
                this.d = qc6Var;
                int i3 = bkb.H6;
                zkb.G(qc6Var, i3, null);
                zkb.X(qc6Var, i3, mf6Var.getResourceProvider());
                qc6Var.setTextSize(1, 14.0f);
                qc6Var.setLineSpacing(gl.L(2.0f), 1.0f);
                qc6Var.setPadding(gl.L(14.0f), gl.L(8.0f), gl.L(14.0f), gl.L(16.0f));
                qc6Var.setOnClickListener(new View.OnClickListener(this) { // from class: pd6
                    public final /* synthetic */ qd6 b;

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
                        final qd6 qd6Var = this.b;
                        final byte b5 = 1;
                        switch (b3) {
                            case 0:
                                l7 l7Var2 = qd6Var.c;
                                try {
                                    charSequence = ((ClipboardManager) qd6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qd6Var.getContext());
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = l7Var2.getText();
                                    qd6Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, l7Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, l7Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                qd6Var.p(true);
                                break;
                            case 1:
                                qd6Var.d(true);
                                break;
                            default:
                                mf6 mf6Var2 = qd6Var.b0;
                                oe6 oe6Var = qd6Var.w;
                                if (qd6Var.Q <= 0 || qd6Var.O == null) {
                                    Bundle bundle = qd6Var.T;
                                    if (bundle != null && (tL_auth_sentCode = qd6Var.U) != null) {
                                        mf6Var2.p1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i5 = qd6Var.F;
                                        if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                            if (i5 == 3) {
                                                gl.y3(false);
                                                if (!qd6Var.S && !qd6Var.N && !mf6Var2.r0) {
                                                    qd6Var.N = true;
                                                    oe6Var.invalidate();
                                                    zkb.X(oe6Var, bkb.H6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", qd6Var.K);
                                                    bundle2.putString("ephone", qd6Var.J);
                                                    bundle2.putString("phoneFormated", qd6Var.H);
                                                    qd6Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = qd6Var.H;
                                                    tL_auth_resendCode.phone_code_hash = qd6Var.I;
                                                    i4 = ((d) mf6Var2).currentAccount;
                                                    mf6Var2.A1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: ld6
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b6 = b5;
                                                            Bundle bundle32 = bundle2;
                                                            qd6 qd6Var2 = qd6Var;
                                                            switch (b6) {
                                                                case 0:
                                                                    gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                                    break;
                                                                default:
                                                                    gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qd6Var.N = true;
                                            oe6Var.invalidate();
                                            zkb.X(oe6Var, bkb.H6, null);
                                            oe6Var.setTextSize(1, 15.0f);
                                            int i6 = qd6Var.F;
                                            if (i6 == 4 || i6 == 11) {
                                                oe6Var.setText(k96.M0(2131752585, null));
                                            } else {
                                                oe6Var.setText(k96.M0(2131745385, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", qd6Var.K);
                                            bundle3.putString("ephone", qd6Var.J);
                                            bundle3.putString("phoneFormated", qd6Var.H);
                                            bundle3.putInt("prevType", qd6Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = qd6Var.H;
                                            tL_auth_resendCode2.phone_code_hash = qd6Var.I;
                                            i32 = ((d) mf6Var2).currentAccount;
                                            ConnectionsManager.getInstance(i32).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: ld6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b4;
                                                    Bundle bundle32 = bundle3;
                                                    qd6 qd6Var2 = qd6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
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
                addView(qc6Var, nme.t(-2, -2, 1, 0, 18, 0, 0));
                qc6Var.setVisibility(8);
                TextView textView4 = new TextView(context);
                this.e = textView4;
                textView4.setPivotX(0.0f);
                textView4.setPivotY(0.0f);
                textView4.setText(k96.M0(z2 ? 2131745762 : 2131745770, null));
                zkb.X(textView4, bkb.o7, mf6Var.getResourceProvider());
                textView4.setTextSize(1, 13.0f);
                frameLayout.addView(textView4, nme.d(-1, -2.0f, kk7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
                textView4.setAlpha(0.0f);
                textView4.setScaleX(0.8f);
                textView4.setScaleY(0.8f);
                textView4.setTranslationY(-gl.L(4.0f));
                TextView textView5 = new TextView(context);
                this.f = textView5;
                textView5.setPivotX(0.0f);
                textView5.setPivotY(0.0f);
                textView5.setText(k96.M0(z2 ? 2131745760 : 2131745768, null));
                zkb.X(textView5, bkb.x6, mf6Var.getResourceProvider());
                textView5.setTextSize(1, 13.0f);
                frameLayout.addView(textView5, nme.d(-1, -2.0f, kk7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
                oe6 oe6Var = new oe6(this, context);
                this.w = oe6Var;
                zkb.G(oe6Var, i3, null);
                oe6Var.setLineSpacing(gl.L(2.0f), 1.0f);
                oe6Var.setPadding(gl.L(14.0f), gl.L(8.0f), gl.L(14.0f), gl.L(16.0f));
                oe6Var.setTextSize(1, 15.0f);
                oe6Var.setGravity(19);
                final byte b3 = 2;
                oe6Var.setOnClickListener(new View.OnClickListener(this) { // from class: pd6
                    public final /* synthetic */ qd6 b;

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
                        final qd6 qd6Var = this.b;
                        final byte b5 = 1;
                        switch (b32) {
                            case 0:
                                l7 l7Var2 = qd6Var.c;
                                try {
                                    charSequence = ((ClipboardManager) qd6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qd6Var.getContext());
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                                if (charSequence != null) {
                                    Editable text = l7Var2.getText();
                                    qd6Var.E = true;
                                    if (text != null) {
                                        int max = Math.max(0, l7Var2.getSelectionStart());
                                        text.replace(max, Math.max(max, l7Var2.getSelectionEnd()), charSequence);
                                    }
                                }
                                qd6Var.p(true);
                                break;
                            case 1:
                                qd6Var.d(true);
                                break;
                            default:
                                mf6 mf6Var2 = qd6Var.b0;
                                oe6 oe6Var2 = qd6Var.w;
                                if (qd6Var.Q <= 0 || qd6Var.O == null) {
                                    Bundle bundle = qd6Var.T;
                                    if (bundle != null && (tL_auth_sentCode = qd6Var.U) != null) {
                                        mf6Var2.p1(bundle, tL_auth_sentCode, true);
                                        break;
                                    } else {
                                        int i5 = qd6Var.F;
                                        if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                            if (i5 == 3) {
                                                gl.y3(false);
                                                if (!qd6Var.S && !qd6Var.N && !mf6Var2.r0) {
                                                    qd6Var.N = true;
                                                    oe6Var2.invalidate();
                                                    zkb.X(oe6Var2, bkb.H6, null);
                                                    final Bundle bundle2 = new Bundle();
                                                    bundle2.putString("phone", qd6Var.K);
                                                    bundle2.putString("ephone", qd6Var.J);
                                                    bundle2.putString("phoneFormated", qd6Var.H);
                                                    qd6Var.S = true;
                                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                                    tL_auth_resendCode.phone_number = qd6Var.H;
                                                    tL_auth_resendCode.phone_code_hash = qd6Var.I;
                                                    i4 = ((d) mf6Var2).currentAccount;
                                                    mf6Var2.A1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: ld6
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b6 = b5;
                                                            Bundle bundle32 = bundle2;
                                                            qd6 qd6Var2 = qd6Var;
                                                            switch (b6) {
                                                                case 0:
                                                                    gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                                    break;
                                                                default:
                                                                    gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
                                                                    break;
                                                            }
                                                        }
                                                    }, 10), true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qd6Var.N = true;
                                            oe6Var2.invalidate();
                                            zkb.X(oe6Var2, bkb.H6, null);
                                            oe6Var2.setTextSize(1, 15.0f);
                                            int i6 = qd6Var.F;
                                            if (i6 == 4 || i6 == 11) {
                                                oe6Var2.setText(k96.M0(2131752585, null));
                                            } else {
                                                oe6Var2.setText(k96.M0(2131745385, null));
                                            }
                                            final Bundle bundle3 = new Bundle();
                                            bundle3.putString("phone", qd6Var.K);
                                            bundle3.putString("ephone", qd6Var.J);
                                            bundle3.putString("phoneFormated", qd6Var.H);
                                            bundle3.putInt("prevType", qd6Var.a);
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode2.phone_number = qd6Var.H;
                                            tL_auth_resendCode2.phone_code_hash = qd6Var.I;
                                            i32 = ((d) mf6Var2).currentAccount;
                                            ConnectionsManager.getInstance(i32).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: ld6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b4;
                                                    Bundle bundle32 = bundle3;
                                                    qd6 qd6Var2 = qd6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
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
                frameLayout2.addView(oe6Var, nme.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
                addView(frameLayout2, nme.r(-1, -1, 80));
                vk9.c(oe6Var);
            }
        }
        z = true;
        ry8Var.setVisibility(!z ? 8 : 0);
        addView(ry8Var, nme.t(95, 95, 1, 0, 10, 0, 5));
        TextView textView6 = new TextView(context);
        this.n = textView6;
        textView6.setTextSize(1, 18.0f);
        textView6.setTypeface(gl.o());
        textView6.setLineSpacing(gl.L(2.0f), 1.0f);
        textView6.setGravity(49);
        textView6.setText(k96.M0(z2 ? 2131745758 : 2131745766, null));
        addView(textView6, nme.t(-2, -2, 1, 8, !z ? 25 : 0, 8, 0));
        TextView textView22 = new TextView(context);
        this.r = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView22, nme.t(-2, -2, 1, 8, 5, 8, 16));
        er7 er7Var2 = new er7(context, null);
        this.b = er7Var2;
        er7Var2.setText(k96.M0(z2 ? 2131745765 : 2131745773, null));
        l7 l7Var2 = new l7((byte) 4, context, this);
        this.c = l7Var2;
        l7Var2.setSingleLine();
        l7Var2.setLines(1);
        l7Var2.setCursorSize(gl.L(20.0f));
        l7Var2.setCursorWidth(1.5f);
        l7Var2.setImeOptions(268435461);
        l7Var2.setTextSize(1, 18.0f);
        l7Var2.setMaxLines(1);
        l7Var2.setBackground(null);
        l7Var2.setHint(k96.M0(z2 ? 2131745761 : 2131745769, null));
        l7Var2.addTextChangedListener(new fi(this));
        l7Var2.setEllipsizeByGradient(true);
        l7Var2.setInputType(1);
        l7Var2.setTypeface(Typeface.DEFAULT);
        l7Var2.setGravity(!k96.a0 ? 5 : 3);
        l7Var2.setOnFocusChangeListener(new ls0(this, (byte) 9));
        TextView textView32 = new TextView(context);
        this.s = textView32;
        textView32.setTextSize(1, 12.0f);
        textView32.setTypeface(gl.o());
        textView32.setText(k96.M0(2131747242, null));
        textView32.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        textView32.setGravity(17);
        int i22 = bkb.n6;
        wjbVar = ((d) mf6Var).resourceProvider;
        int v02 = bkb.v0(i22, wjbVar);
        wjbVar2 = ((d) mf6Var).resourceProvider;
        zkb.X(textView32, i22, wjbVar2);
        int L2 = gl.L(6.0f);
        int p13 = bkb.p1(0.12f, v02);
        int p122 = bkb.p1(0.15f, v02);
        ff0 i02 = bkb.i0(L2, L2, L2, L2, p13, p122, p122);
        vkb K3 = zkb.K(0.12f, i22);
        vkb K22 = zkb.K(0.15f, i22);
        wjbVar3 = ((d) mf6Var).resourceProvider;
        textView32.setBackground(i02);
        zkb.j(textView32, i02, K3, K22, wjbVar3);
        ote.b(textView32, 0.1f, 1.5f);
        l7Var2.setPadding(gl.L(16.0f), gl.L(13.34f), gl.L(16.0f), gl.L(13.34f));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: pd6
            public final /* synthetic */ qd6 b;

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
                final qd6 qd6Var = this.b;
                final byte b5 = 1;
                switch (b32) {
                    case 0:
                        l7 l7Var22 = qd6Var.c;
                        try {
                            charSequence = ((ClipboardManager) qd6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qd6Var.getContext());
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = l7Var22.getText();
                            qd6Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, l7Var22.getSelectionStart());
                                text.replace(max, Math.max(max, l7Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        qd6Var.p(true);
                        break;
                    case 1:
                        qd6Var.d(true);
                        break;
                    default:
                        mf6 mf6Var2 = qd6Var.b0;
                        oe6 oe6Var2 = qd6Var.w;
                        if (qd6Var.Q <= 0 || qd6Var.O == null) {
                            Bundle bundle = qd6Var.T;
                            if (bundle != null && (tL_auth_sentCode = qd6Var.U) != null) {
                                mf6Var2.p1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i5 = qd6Var.F;
                                if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                    if (i5 == 3) {
                                        gl.y3(false);
                                        if (!qd6Var.S && !qd6Var.N && !mf6Var2.r0) {
                                            qd6Var.N = true;
                                            oe6Var2.invalidate();
                                            zkb.X(oe6Var2, bkb.H6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", qd6Var.K);
                                            bundle2.putString("ephone", qd6Var.J);
                                            bundle2.putString("phoneFormated", qd6Var.H);
                                            qd6Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = qd6Var.H;
                                            tL_auth_resendCode.phone_code_hash = qd6Var.I;
                                            i4 = ((d) mf6Var2).currentAccount;
                                            mf6Var2.A1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: ld6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b5;
                                                    Bundle bundle32 = bundle2;
                                                    qd6 qd6Var2 = qd6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    qd6Var.N = true;
                                    oe6Var2.invalidate();
                                    zkb.X(oe6Var2, bkb.H6, null);
                                    oe6Var2.setTextSize(1, 15.0f);
                                    int i6 = qd6Var.F;
                                    if (i6 == 4 || i6 == 11) {
                                        oe6Var2.setText(k96.M0(2131752585, null));
                                    } else {
                                        oe6Var2.setText(k96.M0(2131745385, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", qd6Var.K);
                                    bundle3.putString("ephone", qd6Var.J);
                                    bundle3.putString("phoneFormated", qd6Var.H);
                                    bundle3.putInt("prevType", qd6Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = qd6Var.H;
                                    tL_auth_resendCode2.phone_code_hash = qd6Var.I;
                                    i32 = ((d) mf6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i32).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: ld6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            Bundle bundle32 = bundle3;
                                            qd6 qd6Var2 = qd6Var;
                                            switch (b6) {
                                                case 0:
                                                    gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                    break;
                                                default:
                                                    gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
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
        er7Var2.addView(l7Var2, nme.d(-1, -2.0f, kk7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        er7Var2.e(l7Var2);
        er7Var2.addView(textView32, nme.d(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(er7Var2, nme.r(-1, -2, 1));
        addView(linearLayout2, nme.t(-1, -2, 1, 16, 3, 16, 0));
        l7Var2.setOnEditorActionListener(new j(this, (byte) 14));
        FrameLayout frameLayout3 = new FrameLayout(context);
        linearLayout2.addView(frameLayout3, nme.o(-1, -2));
        qc6 qc6Var2 = new qc6(mf6Var, context);
        this.d = qc6Var2;
        int i32 = bkb.H6;
        zkb.G(qc6Var2, i32, null);
        zkb.X(qc6Var2, i32, mf6Var.getResourceProvider());
        qc6Var2.setTextSize(1, 14.0f);
        qc6Var2.setLineSpacing(gl.L(2.0f), 1.0f);
        qc6Var2.setPadding(gl.L(14.0f), gl.L(8.0f), gl.L(14.0f), gl.L(16.0f));
        qc6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: pd6
            public final /* synthetic */ qd6 b;

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
                final qd6 qd6Var = this.b;
                final byte b5 = 1;
                switch (b32) {
                    case 0:
                        l7 l7Var22 = qd6Var.c;
                        try {
                            charSequence = ((ClipboardManager) qd6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qd6Var.getContext());
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = l7Var22.getText();
                            qd6Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, l7Var22.getSelectionStart());
                                text.replace(max, Math.max(max, l7Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        qd6Var.p(true);
                        break;
                    case 1:
                        qd6Var.d(true);
                        break;
                    default:
                        mf6 mf6Var2 = qd6Var.b0;
                        oe6 oe6Var2 = qd6Var.w;
                        if (qd6Var.Q <= 0 || qd6Var.O == null) {
                            Bundle bundle = qd6Var.T;
                            if (bundle != null && (tL_auth_sentCode = qd6Var.U) != null) {
                                mf6Var2.p1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i5 = qd6Var.F;
                                if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                    if (i5 == 3) {
                                        gl.y3(false);
                                        if (!qd6Var.S && !qd6Var.N && !mf6Var2.r0) {
                                            qd6Var.N = true;
                                            oe6Var2.invalidate();
                                            zkb.X(oe6Var2, bkb.H6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", qd6Var.K);
                                            bundle2.putString("ephone", qd6Var.J);
                                            bundle2.putString("phoneFormated", qd6Var.H);
                                            qd6Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = qd6Var.H;
                                            tL_auth_resendCode.phone_code_hash = qd6Var.I;
                                            i4 = ((d) mf6Var2).currentAccount;
                                            mf6Var2.A1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: ld6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b5;
                                                    Bundle bundle32 = bundle2;
                                                    qd6 qd6Var2 = qd6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    qd6Var.N = true;
                                    oe6Var2.invalidate();
                                    zkb.X(oe6Var2, bkb.H6, null);
                                    oe6Var2.setTextSize(1, 15.0f);
                                    int i6 = qd6Var.F;
                                    if (i6 == 4 || i6 == 11) {
                                        oe6Var2.setText(k96.M0(2131752585, null));
                                    } else {
                                        oe6Var2.setText(k96.M0(2131745385, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", qd6Var.K);
                                    bundle3.putString("ephone", qd6Var.J);
                                    bundle3.putString("phoneFormated", qd6Var.H);
                                    bundle3.putInt("prevType", qd6Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = qd6Var.H;
                                    tL_auth_resendCode2.phone_code_hash = qd6Var.I;
                                    i322 = ((d) mf6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: ld6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            Bundle bundle32 = bundle3;
                                            qd6 qd6Var2 = qd6Var;
                                            switch (b6) {
                                                case 0:
                                                    gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                    break;
                                                default:
                                                    gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
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
        addView(qc6Var2, nme.t(-2, -2, 1, 0, 18, 0, 0));
        qc6Var2.setVisibility(8);
        TextView textView42 = new TextView(context);
        this.e = textView42;
        textView42.setPivotX(0.0f);
        textView42.setPivotY(0.0f);
        textView42.setText(k96.M0(z2 ? 2131745762 : 2131745770, null));
        zkb.X(textView42, bkb.o7, mf6Var.getResourceProvider());
        textView42.setTextSize(1, 13.0f);
        frameLayout3.addView(textView42, nme.d(-1, -2.0f, kk7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
        textView42.setAlpha(0.0f);
        textView42.setScaleX(0.8f);
        textView42.setScaleY(0.8f);
        textView42.setTranslationY(-gl.L(4.0f));
        TextView textView52 = new TextView(context);
        this.f = textView52;
        textView52.setPivotX(0.0f);
        textView52.setPivotY(0.0f);
        textView52.setText(k96.M0(z2 ? 2131745760 : 2131745768, null));
        zkb.X(textView52, bkb.x6, mf6Var.getResourceProvider());
        textView52.setTextSize(1, 13.0f);
        frameLayout3.addView(textView52, nme.d(-1, -2.0f, kk7.D1, 16.0f, 8.0f, 16.0f, 8.0f));
        oe6 oe6Var2 = new oe6(this, context);
        this.w = oe6Var2;
        zkb.G(oe6Var2, i32, null);
        oe6Var2.setLineSpacing(gl.L(2.0f), 1.0f);
        oe6Var2.setPadding(gl.L(14.0f), gl.L(8.0f), gl.L(14.0f), gl.L(16.0f));
        oe6Var2.setTextSize(1, 15.0f);
        oe6Var2.setGravity(19);
        final byte b32 = 2;
        oe6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: pd6
            public final /* synthetic */ qd6 b;

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
                final qd6 qd6Var = this.b;
                final byte b5 = 1;
                switch (b322) {
                    case 0:
                        l7 l7Var22 = qd6Var.c;
                        try {
                            charSequence = ((ClipboardManager) qd6Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qd6Var.getContext());
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        if (charSequence != null) {
                            Editable text = l7Var22.getText();
                            qd6Var.E = true;
                            if (text != null) {
                                int max = Math.max(0, l7Var22.getSelectionStart());
                                text.replace(max, Math.max(max, l7Var22.getSelectionEnd()), charSequence);
                            }
                        }
                        qd6Var.p(true);
                        break;
                    case 1:
                        qd6Var.d(true);
                        break;
                    default:
                        mf6 mf6Var2 = qd6Var.b0;
                        oe6 oe6Var22 = qd6Var.w;
                        if (qd6Var.Q <= 0 || qd6Var.O == null) {
                            Bundle bundle = qd6Var.T;
                            if (bundle != null && (tL_auth_sentCode = qd6Var.U) != null) {
                                mf6Var2.p1(bundle, tL_auth_sentCode, true);
                                break;
                            } else {
                                int i5 = qd6Var.F;
                                if (i5 != 4 && i5 != 2 && i5 != 11 && i5 != 15) {
                                    if (i5 == 3) {
                                        gl.y3(false);
                                        if (!qd6Var.S && !qd6Var.N && !mf6Var2.r0) {
                                            qd6Var.N = true;
                                            oe6Var22.invalidate();
                                            zkb.X(oe6Var22, bkb.H6, null);
                                            final Bundle bundle2 = new Bundle();
                                            bundle2.putString("phone", qd6Var.K);
                                            bundle2.putString("ephone", qd6Var.J);
                                            bundle2.putString("phoneFormated", qd6Var.H);
                                            qd6Var.S = true;
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = qd6Var.H;
                                            tL_auth_resendCode.phone_code_hash = qd6Var.I;
                                            i4 = ((d) mf6Var2).currentAccount;
                                            mf6Var2.A1(ConnectionsManager.getInstance(i4).sendRequest(tL_auth_resendCode, new RequestDelegate() { // from class: ld6
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    byte b6 = b5;
                                                    Bundle bundle32 = bundle2;
                                                    qd6 qd6Var2 = qd6Var;
                                                    switch (b6) {
                                                        case 0:
                                                            gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                            break;
                                                        default:
                                                            gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
                                                            break;
                                                    }
                                                }
                                            }, 10), true);
                                            break;
                                        }
                                    }
                                } else {
                                    qd6Var.N = true;
                                    oe6Var22.invalidate();
                                    zkb.X(oe6Var22, bkb.H6, null);
                                    oe6Var22.setTextSize(1, 15.0f);
                                    int i6 = qd6Var.F;
                                    if (i6 == 4 || i6 == 11) {
                                        oe6Var22.setText(k96.M0(2131752585, null));
                                    } else {
                                        oe6Var22.setText(k96.M0(2131745385, null));
                                    }
                                    final Bundle bundle3 = new Bundle();
                                    bundle3.putString("phone", qd6Var.K);
                                    bundle3.putString("ephone", qd6Var.J);
                                    bundle3.putString("phoneFormated", qd6Var.H);
                                    bundle3.putInt("prevType", qd6Var.a);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode2 = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode2.phone_number = qd6Var.H;
                                    tL_auth_resendCode2.phone_code_hash = qd6Var.I;
                                    i322 = ((d) mf6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i322).sendRequest(tL_auth_resendCode2, new RequestDelegate() { // from class: ld6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            byte b6 = b4;
                                            Bundle bundle32 = bundle3;
                                            qd6 qd6Var2 = qd6Var;
                                            switch (b6) {
                                                case 0:
                                                    gl.c3(new nd6(qd6Var2, tLObject, bundle32, tL_error));
                                                    break;
                                                default:
                                                    gl.c3(new nd6(qd6Var2, tL_error, bundle32, tLObject));
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
        frameLayout22.addView(oe6Var2, nme.d(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
        addView(frameLayout22, nme.r(-1, -1, 80));
        vk9.c(oe6Var2);
    }

    public static String s(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) <= ' ') {
            i++;
        }
        return (i > 0 || length < str.length()) ? str.substring(i, length) : str;
    }

    @Override // jja
    public final boolean b() {
        return true;
    }

    @Override // jja
    public final boolean d(boolean z) {
        mf6 mf6Var = this.b0;
        mf6Var.x1(true, true);
        int i = this.G;
        if (i != 0) {
            mf6Var.I1(i, true, null, true);
            return false;
        }
        this.M = null;
        this.S = false;
        return true;
    }

    @Override // jja
    public final void e() {
        this.S = false;
    }

    @Override // jja
    public final void g() {
        gl.r(this.V);
    }

    @Override // jja
    public String getHeaderName() {
        return k96.M0(2131748074, "NewPassword");
    }

    @Override // jja
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
        mf6 mf6Var = this.b0;
        mf6Var.A1(mf6Var.getConnectionsManager().sendRequest(tL_auth_signIn, new kd6(this, tL_auth_signIn, (byte) 0), 10), true);
        mf6Var.J1(true, true);
    }

    @Override // jja
    public final void i() {
        p(true);
    }

    @Override // jja
    public final void j() {
        gl.d3(new od6(this, (byte) 3), mf6.A0);
    }

    @Override // jja
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + ((int) this.a));
        this.M = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // jja
    public final void l(Bundle bundle) {
        if (this.M != null) {
            bundle.putBundle("recoveryview_word" + ((int) this.a), this.M);
        }
    }

    @Override // jja
    public final void m(Bundle bundle, boolean z) {
        oe6 oe6Var = this.w;
        if (bundle == null) {
            if (this.T == null || this.U == null) {
                return;
            }
            zkb.X(oe6Var, bkb.H6, null);
            int i = this.F;
            oe6Var.setText(gl.E2(k96.M0(i == 17 ? 2131745857 : i == 16 ? 2131745855 : i == 3 ? 2131745854 : 2131745856, null), true, gl.L(1.0f), gl.L(1.0f)));
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
        qc6 qc6Var = this.d;
        if (i2 == 17) {
            qc6Var.setVisibility(0);
            qc6Var.setText(gl.E2(k96.M0(2131753751, null), true, gl.L(-1.0f), gl.L(1.0f)));
        } else if (i2 == 16) {
            qc6Var.setVisibility(0);
            qc6Var.setText(gl.E2(k96.M0(2131753750, null), true, gl.L(-1.0f), gl.L(1.0f)));
        } else if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 3 || i2 == 15) {
            qc6Var.setVisibility(0);
            qc6Var.setText(gl.E2(k96.M0(2131753752, null), true, gl.L(-1.0f), gl.L(1.0f)));
        } else {
            qc6Var.setVisibility(8);
        }
        this.T = null;
        this.U = null;
        this.S = false;
        this.N = false;
        mf6 mf6Var = this.b0;
        mf6Var.r0 = false;
        oe6Var.invalidate();
        boolean z2 = this.a != 16;
        String str = "+" + p38.f().e(p38.h(this.K, false));
        String str2 = this.L;
        TextView textView = this.r;
        if (str2 == null) {
            de9.r(null, null, !z2 ? 2131745759 : 2131745767, new Object[]{str}, textView);
        } else {
            de9.r(null, null, !z2 ? 2131745763 : 2131745771, new Object[]{str, str2}, textView);
        }
        mf6Var.L1(l7Var);
        l7Var.requestFocus();
        ry8 ry8Var = this.h;
        if (ry8Var.getAnimatedDrawable() != null) {
            ry8Var.getAnimatedDrawable().I(0, false, false);
        }
        gl.d3(new tp5(ry8Var, (byte) 21), 500L);
        p(false);
        n(false);
        this.R = System.currentTimeMillis();
        int i3 = bkb.x6;
        zkb.X(oe6Var, i3, null);
        int i4 = this.F;
        if (i4 != 2 && i4 != 4 && i4 != 3) {
            oe6Var.setVisibility(8);
            return;
        }
        if (this.O != null) {
            return;
        }
        zkb.X(oe6Var, i3, null);
        oe6Var.setTag(R.id.color_key_tag, Integer.valueOf(i3));
        Timer timer = new Timer();
        this.O = timer;
        timer.schedule(new aw3(this, (byte) 1), 0L, 1000L);
    }

    public final void n(boolean z) {
        this.y = z;
        float f = 0.0f;
        float f2 = z ? 1.0f : 0.0f;
        this.b.a(f2);
        float f3 = (f2 * 0.1f) + 0.9f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f3).scaleY(f3).alpha(f2).translationY((1.0f - f2) * gl.L(-5.0f));
        s33 s33Var = s33.h;
        ug8.t(translationY, s33Var, 290L);
        if (this.x && !this.y) {
            f = 1.0f;
        }
        float f4 = (0.1f * f) + 0.9f;
        this.f.animate().scaleX(f4).scaleY(f4).alpha(f).translationY((1.0f - f) * gl.L(this.y ? 5.0f : -5.0f)).setInterpolator(s33Var).setDuration(290L).start();
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
        od6 od6Var = this.V;
        gl.r(od6Var);
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
                s33 s33Var = s33.h;
                scaleY.setInterpolator(s33Var).setDuration(300L).start();
                ViewPropertyAnimator scaleX = textView2.animate().scaleX((!this.x || this.y) ? 0.9f : 1.0f);
                if (this.x && !this.y) {
                    f = 1.0f;
                }
                ViewPropertyAnimator alpha = scaleX.scaleY(f).alpha((!this.x || this.y) ? 0.0f : 1.0f);
                if (!this.x || this.y) {
                    f2 = gl.L(this.y ? 5.0f : -5.0f);
                }
                alpha.translationY(f2).setInterpolator(s33Var).setDuration(300L).start();
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
                    f2 = gl.L(this.y ? 5.0f : -5.0f);
                }
                textView2.setTranslationY(f2);
            }
        }
        gl.d3(od6Var, 5000L);
    }

    public final void q() {
        oe6 oe6Var = this.w;
        int i = bkb.x6;
        zkb.X(oe6Var, i, null);
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
            fa4.g(e, true);
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
            textView.setText(k96.M0(!z2 ? 2131745764 : 2131745772, null));
        } else if (TextUtils.isEmpty(l7Var.getText())) {
            textView.setText("");
        } else {
            textView.setText(k96.M0(!z2 ? 2131745762 : 2131745770, null));
        }
        if (!this.y && !this.E) {
            gl.A3(this.a0, l7Var, null);
            gl.A3(this.a0, textView, null);
        }
        od6 od6Var = this.W;
        gl.r(od6Var);
        n(true);
        gl.d3(od6Var, 10000L);
        this.a0 = -this.a0;
    }

    @Override // jja
    public final void updateColors() {
        int i = bkb.F6;
        mf6 mf6Var = this.b0;
        this.n.setTextColor(mf6Var.getThemedColor(i));
        this.r.setTextColor(mf6Var.getThemedColor(bkb.C6));
        int themedColor = mf6Var.getThemedColor(i);
        l7 l7Var = this.c;
        l7Var.setTextColor(themedColor);
        l7Var.setCursorColor(mf6Var.getThemedColor(bkb.k6));
        l7Var.setHintTextColor(mf6Var.getThemedColor(bkb.G6));
        this.b.f();
    }
}
