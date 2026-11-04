package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vg0 extends org.telegram.ui.ActionBar.t2 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int W1 = 0;
    public boolean A1;
    public String B1;
    public String C1;
    public final org.telegram.ui.ActionBar.d2 D1;
    public final int E1;
    public final ug0 F1;
    public final View G1;
    public final ug0 H1;
    public final ImageView I1;
    public final org.telegram.ui.Components.wo J1;
    public final TextView K1;
    public final LinearLayout L1;
    public int M1;
    public final org.telegram.ui.ActionBar.k2 N1;
    public final TextView O1;
    public final RadialProgressView P1;
    public final FrameLayout Q1;
    public final TextView R1;
    public String S1;
    public int T1;
    public int U1;
    public boolean V1;
    public final LinearLayout j1;
    public final org.telegram.ui.Components.fb0 k1;
    public final org.telegram.ui.Components.fb0 l1;
    public final FrameLayout m1;
    public final View n1;
    public final gi.d o1;
    public final org.telegram.ui.Components.fb0 p1;
    public final org.telegram.ui.Components.gb0 q1;
    public final org.telegram.ui.Components.s70 r1;
    public final ArrayList s1;
    public final HashMap t1;
    public final HashMap u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public String z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0695 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vg0(Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, true);
        String str;
        String str2;
        int i3;
        ks ksVar;
        TelephonyManager telephonyManager;
        final int i10 = 1;
        this.s1 = new ArrayList();
        this.t1 = new HashMap();
        this.u1 = new HashMap();
        this.T1 = -1;
        N();
        this.E = true;
        this.Q0 = true;
        this.E1 = ConnectionsManager.generateClassGuid();
        this.D1 = d2Var;
        Context context2 = getContext();
        final int i11 = 4;
        new org.telegram.ui.Components.aq(context2, 1).setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.j1 = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.j1.setOrientation(1);
        scrollView.addView(this.j1, b8.mf.x(-1, -2, 51));
        this.j1.setOnTouchListener(new fi.a(28));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.j1.addView(frameLayout, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.fb0 fb0Var = new org.telegram.ui.Components.fb0(context2);
        this.k1 = fb0Var;
        fb0Var.getEditText().setInputType(49152);
        this.k1.getEditText().setImeOptions(5);
        this.k1.setHint(org.telegram.messenger.bd.M0(2131750695, null));
        if (this.B1 != null) {
            this.k1.getEditText().setText(this.B1);
            this.B1 = null;
        }
        frameLayout.addView(this.k1, b8.mf.d(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.k1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.qg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i13 == 5) {
                            vg0 vg0Var = this.b;
                            vg0Var.F1.requestFocus();
                            ug0 ug0Var = vg0Var.F1;
                            ug0Var.setSelection(ug0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        vg0 vg0Var2 = this.b;
                        if (i13 != 5) {
                            vg0Var2.getClass();
                            break;
                        } else {
                            vg0Var2.l1.requestFocus();
                            vg0Var2.l1.getEditText().setSelection(vg0Var2.l1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i13 == 5) {
                            vg0 vg0Var3 = this.b;
                            vg0Var3.F1.requestFocus();
                            ug0 ug0Var2 = vg0Var3.F1;
                            ug0Var2.setSelection(ug0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i13 == 5) {
                            vg0 vg0Var4 = this.b;
                            vg0Var4.H1.requestFocus();
                            ug0 ug0Var3 = vg0Var4.H1;
                            ug0Var3.setSelection(ug0Var3.length());
                            break;
                        }
                        break;
                    default:
                        vg0 vg0Var5 = this.b;
                        if (i13 != 5) {
                            vg0Var5.getClass();
                            break;
                        } else {
                            vg0Var5.Q1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        org.telegram.ui.Components.fb0 fb0Var2 = new org.telegram.ui.Components.fb0(context2);
        this.l1 = fb0Var2;
        fb0Var2.setBackground(null);
        this.l1.getEditText().setInputType(49152);
        this.l1.getEditText().setImeOptions(5);
        this.l1.setHint(org.telegram.messenger.bd.M0(2131749040, null));
        if (this.C1 != null) {
            this.l1.getEditText().setText(this.C1);
            this.C1 = null;
        }
        frameLayout.addView(this.l1, b8.mf.d(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final int i13 = 2;
        this.l1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.qg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i132, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i132 == 5) {
                            vg0 vg0Var = this.b;
                            vg0Var.F1.requestFocus();
                            ug0 ug0Var = vg0Var.F1;
                            ug0Var.setSelection(ug0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        vg0 vg0Var2 = this.b;
                        if (i132 != 5) {
                            vg0Var2.getClass();
                            break;
                        } else {
                            vg0Var2.l1.requestFocus();
                            vg0Var2.l1.getEditText().setSelection(vg0Var2.l1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            vg0 vg0Var3 = this.b;
                            vg0Var3.F1.requestFocus();
                            ug0 ug0Var2 = vg0Var3.F1;
                            ug0Var2.setSelection(ug0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            vg0 vg0Var4 = this.b;
                            vg0Var4.H1.requestFocus();
                            ug0 ug0Var3 = vg0Var4.H1;
                            ug0Var3.setSelection(ug0Var3.length());
                            break;
                        }
                        break;
                    default:
                        vg0 vg0Var5 = this.b;
                        if (i132 != 5) {
                            vg0Var5.getClass();
                            break;
                        } else {
                            vg0Var5.Q1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context2, null);
        this.q1 = gb0Var;
        gb0Var.addView(linearLayout2, b8.mf.d(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.q1.setText(org.telegram.messenger.bd.M0(2131747298, null));
        this.j1.addView(this.q1, b8.mf.k(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context2, null);
        this.r1 = s70Var;
        s70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(this.r1, org.telegram.ui.ActionBar.k6.y6, this.J0);
        org.telegram.ui.ActionBar.r6.H(this.r1, org.telegram.ui.ActionBar.k6.Uc, this.J0);
        this.j1.addView(this.r1, b8.mf.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(context2, 5);
        this.N1 = k2Var;
        k2Var.setTextSize(1, 16.0f);
        this.N1.setFocusable(false);
        this.N1.setGravity(17);
        final int i14 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                vg0 vg0Var = this.b;
                switch (i15) {
                    case 0:
                        vg0Var.dismiss();
                        s9.j0(LaunchActivity.K1, 1, new tg0(vg0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.d2 d2Var2 = vg0Var.D1;
                        if (!vg0Var.y1 && d2Var2 != null && d2Var2.getParentActivity() != null) {
                            if (vg0Var.k1.getEditText().length() != 0) {
                                if (vg0Var.F1.length() != 0) {
                                    if (vg0Var.H1.length() != 0) {
                                        if (!vg0Var.J1.a.q) {
                                            vg0Var.J0();
                                            break;
                                        } else {
                                            b8.nf.c(R.raw.permission_request_contacts, 2131747315, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new s3(vg0Var, 14));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) d2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(vg0Var.H1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) d2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(vg0Var.F1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) d2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(vg0Var.k1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        os osVar = new os(null, true);
                        osVar.r = new tg0(vg0Var);
                        vg0Var.D1.showAsSheet(osVar);
                        break;
                    default:
                        vg0Var.J1.a(!r6.a.q, true);
                        vg0Var.P0(true);
                        break;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(6.0f);
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, x02, x02);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
        frameLayout2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, k02, null, N, null);
        frameLayout2.addView(this.N1, b8.mf.e(-1, -2, 16));
        linearLayout2.addView(frameLayout2, b8.mf.o(42, -1));
        TextView textView = new TextView(context2);
        this.R1 = textView;
        textView.setText("+");
        this.R1.setTextSize(1, 16.0f);
        this.R1.setFocusable(false);
        linearLayout2.addView(this.R1, b8.mf.o(-2, -2));
        ug0 ug0Var = new ug0(this, context2, 0);
        this.F1 = ug0Var;
        int i16 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(ug0Var, i16, null);
        this.F1.setInputType(3);
        this.F1.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.F1.setCursorWidth(1.5f);
        this.F1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        this.F1.setTextSize(1, 16.0f);
        this.F1.setMaxLines(1);
        this.F1.setGravity(19);
        this.F1.setImeOptions(268435461);
        this.F1.setBackground(null);
        this.F1.setContentDescription(org.telegram.messenger.bd.M0(2131748748, null));
        linearLayout2.addView(this.F1, b8.mf.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.F1.addTextChangedListener(new n0(this, 13));
        final int i17 = 3;
        this.F1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.qg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i17) {
                    case 0:
                        if (i132 == 5) {
                            vg0 vg0Var = this.b;
                            vg0Var.F1.requestFocus();
                            ug0 ug0Var2 = vg0Var.F1;
                            ug0Var2.setSelection(ug0Var2.length());
                            break;
                        }
                        break;
                    case 1:
                        vg0 vg0Var2 = this.b;
                        if (i132 != 5) {
                            vg0Var2.getClass();
                            break;
                        } else {
                            vg0Var2.l1.requestFocus();
                            vg0Var2.l1.getEditText().setSelection(vg0Var2.l1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            vg0 vg0Var3 = this.b;
                            vg0Var3.F1.requestFocus();
                            ug0 ug0Var22 = vg0Var3.F1;
                            ug0Var22.setSelection(ug0Var22.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            vg0 vg0Var4 = this.b;
                            vg0Var4.H1.requestFocus();
                            ug0 ug0Var3 = vg0Var4.H1;
                            ug0Var3.setSelection(ug0Var3.length());
                            break;
                        }
                        break;
                    default:
                        vg0 vg0Var5 = this.b;
                        if (i132 != 5) {
                            vg0Var5.getClass();
                            break;
                        } else {
                            vg0Var5.Q1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        this.G1 = new View(context2);
        LinearLayout.LayoutParams k10 = b8.mf.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(this.G1, k10);
        ug0 ug0Var2 = new ug0(this, context2, 1);
        this.H1 = ug0Var2;
        org.telegram.ui.ActionBar.r6.V(ug0Var2, i16, null);
        this.H1.setInputType(3);
        this.H1.setPadding(0, 0, 0, 0);
        this.H1.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.H1.setCursorWidth(1.5f);
        this.H1.setTextSize(1, 16.0f);
        this.H1.setMaxLines(1);
        this.H1.setGravity(19);
        this.H1.setImeOptions(268435461);
        this.H1.setBackground(null);
        this.H1.setContentDescription(org.telegram.messenger.bd.M0(2131747298, null));
        linearLayout2.addView(this.H1, b8.mf.o(-1, 36));
        this.H1.addTextChangedListener(new wq(this, 2));
        this.H1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.qg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i132 == 5) {
                            vg0 vg0Var = this.b;
                            vg0Var.F1.requestFocus();
                            ug0 ug0Var22 = vg0Var.F1;
                            ug0Var22.setSelection(ug0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        vg0 vg0Var2 = this.b;
                        if (i132 != 5) {
                            vg0Var2.getClass();
                            break;
                        } else {
                            vg0Var2.l1.requestFocus();
                            vg0Var2.l1.getEditText().setSelection(vg0Var2.l1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            vg0 vg0Var3 = this.b;
                            vg0Var3.F1.requestFocus();
                            ug0 ug0Var222 = vg0Var3.F1;
                            ug0Var222.setSelection(ug0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            vg0 vg0Var4 = this.b;
                            vg0Var4.H1.requestFocus();
                            ug0 ug0Var3 = vg0Var4.H1;
                            ug0Var3.setSelection(ug0Var3.length());
                            break;
                        }
                        break;
                    default:
                        vg0 vg0Var5 = this.b;
                        if (i132 != 5) {
                            vg0Var5.getClass();
                            break;
                        } else {
                            vg0Var5.Q1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        ImageView imageView = new ImageView(context2);
        this.I1 = imageView;
        imageView.setScaleX(0.5f);
        this.I1.setScaleY(0.5f);
        this.I1.setAlpha(0.0f);
        this.q1.addView(this.I1, b8.mf.d(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context2, this.J0);
        this.J1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.k7);
        this.J1.setDrawUnchecked(true);
        this.J1.a(false, false);
        this.J1.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.K1 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i16, this.J0);
        this.K1.setTextSize(1, 14.0f);
        this.K1.setText(org.telegram.messenger.bd.M0(2131754445, null));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.L1 = linearLayout3;
        linearLayout3.setOrientation(0);
        this.L1.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        this.L1.addView(this.J1, b8.mf.t(21, 21, 16, 0, 0, 9, 0));
        this.L1.addView(this.K1, b8.mf.r(-2, -2, 16));
        final int i18 = 3;
        this.L1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i18;
                vg0 vg0Var = this.b;
                switch (i152) {
                    case 0:
                        vg0Var.dismiss();
                        s9.j0(LaunchActivity.K1, 1, new tg0(vg0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.d2 d2Var2 = vg0Var.D1;
                        if (!vg0Var.y1 && d2Var2 != null && d2Var2.getParentActivity() != null) {
                            if (vg0Var.k1.getEditText().length() != 0) {
                                if (vg0Var.F1.length() != 0) {
                                    if (vg0Var.H1.length() != 0) {
                                        if (!vg0Var.J1.a.q) {
                                            vg0Var.J0();
                                            break;
                                        } else {
                                            b8.nf.c(R.raw.permission_request_contacts, 2131747315, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new s3(vg0Var, 14));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) d2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(vg0Var.H1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) d2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(vg0Var.F1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) d2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(vg0Var.k1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        os osVar = new os(null, true);
                        osVar.r = new tg0(vg0Var);
                        vg0Var.D1.showAsSheet(osVar);
                        break;
                    default:
                        vg0Var.J1.a(!r6.a.q, true);
                        vg0Var.P0(true);
                        break;
                }
            }
        });
        this.L1.setTranslationY(org.telegram.messenger.g0.L(-21.33f));
        this.L1.setPivotX(0.0f);
        b8.pf.b(this.L1, 0.0125f, 1.2f);
        org.telegram.ui.ActionBar.r6.R(this.L1, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i15, this.J0), 6, 6), null, org.telegram.ui.ActionBar.r6.N(i15), this.J0);
        this.j1.addView(this.L1, b8.mf.k(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.m1 = frameLayout3;
        frameLayout3.setTranslationY(org.telegram.messenger.g0.L(-10.665f));
        this.j1.addView(this.m1, b8.mf.k(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.n1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.J0);
        this.m1.addView(this.n1, b8.mf.d(-1, 1.0f / org.telegram.messenger.g0.p, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        gi.d dVar = new gi.d(context2, this.J0, false);
        this.o1 = dVar;
        dVar.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131754448, null));
        this.o1.i(spannableStringBuilder, false, true);
        this.o1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i152 = i12;
                vg0 vg0Var = this.b;
                switch (i152) {
                    case 0:
                        vg0Var.dismiss();
                        s9.j0(LaunchActivity.K1, 1, new tg0(vg0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.d2 d2Var2 = vg0Var.D1;
                        if (!vg0Var.y1 && d2Var2 != null && d2Var2.getParentActivity() != null) {
                            if (vg0Var.k1.getEditText().length() != 0) {
                                if (vg0Var.F1.length() != 0) {
                                    if (vg0Var.H1.length() != 0) {
                                        if (!vg0Var.J1.a.q) {
                                            vg0Var.J0();
                                            break;
                                        } else {
                                            b8.nf.c(R.raw.permission_request_contacts, 2131747315, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new s3(vg0Var, 14));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) d2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(vg0Var.H1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) d2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(vg0Var.F1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) d2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(vg0Var.k1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        os osVar = new os(null, true);
                        osVar.r = new tg0(vg0Var);
                        vg0Var.D1.showAsSheet(osVar);
                        break;
                    default:
                        vg0Var.J1.a(!r6.a.q, true);
                        vg0Var.P0(true);
                        break;
                }
            }
        });
        this.m1.addView(this.o1, b8.mf.d(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.fb0 fb0Var3 = new org.telegram.ui.Components.fb0(context2);
        this.p1 = fb0Var3;
        fb0Var3.setBackground(null);
        this.p1.getEditText().setInputType(49152);
        this.p1.getEditText().setImeOptions(5);
        this.p1.setHint(org.telegram.messenger.bd.M0(2131746658, null));
        this.m1.addView(this.p1, b8.mf.d(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.p1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.qg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView22, int i132, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i132 == 5) {
                            vg0 vg0Var = this.b;
                            vg0Var.F1.requestFocus();
                            ug0 ug0Var22 = vg0Var.F1;
                            ug0Var22.setSelection(ug0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        vg0 vg0Var2 = this.b;
                        if (i132 != 5) {
                            vg0Var2.getClass();
                            break;
                        } else {
                            vg0Var2.l1.requestFocus();
                            vg0Var2.l1.getEditText().setSelection(vg0Var2.l1.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i132 == 5) {
                            vg0 vg0Var3 = this.b;
                            vg0Var3.F1.requestFocus();
                            ug0 ug0Var222 = vg0Var3.F1;
                            ug0Var222.setSelection(ug0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i132 == 5) {
                            vg0 vg0Var4 = this.b;
                            vg0Var4.H1.requestFocus();
                            ug0 ug0Var3 = vg0Var4.H1;
                            ug0Var3.setSelection(ug0Var3.length());
                            break;
                        }
                        break;
                    default:
                        vg0 vg0Var5 = this.b;
                        if (i132 != 5) {
                            vg0Var5.getClass();
                            break;
                        } else {
                            vg0Var5.Q1.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        P0(false);
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(org.telegram.messenger.t0.b.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                ks ksVar2 = new ks();
                ksVar2.a = split[2];
                ksVar2.c = split[0];
                ksVar2.d = split[1];
                this.s1.add(0, ksVar2);
                List list = (List) this.t1.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.t1;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(ksVar2);
                if (split.length > 3) {
                    this.u1.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.s1, Comparator$-CC.comparing(new fa.b(14)));
        if (TextUtils.isEmpty(this.z1)) {
            try {
                telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso().toUpperCase();
                if (str != null && (str2 = (String) hashMap.get(str)) != null) {
                    i3 = 0;
                    while (true) {
                        if (i3 < this.s1.size()) {
                            ksVar = null;
                            break;
                        } else {
                            if (Objects.equals(((ks) this.s1.get(i3)).a, str2)) {
                                ksVar = (ks) this.s1.get(i3);
                                break;
                            }
                            i3++;
                        }
                    }
                    if (ksVar != null) {
                        this.F1.setText(ksVar.c);
                    }
                }
                if (this.F1.length() == 0) {
                    this.H1.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i3 = 0;
                while (true) {
                    if (i3 < this.s1.size()) {
                    }
                    i3++;
                }
                if (ksVar != null) {
                }
            }
            if (this.F1.length() == 0) {
            }
        } else {
            TLRPC.User f10 = this.D1.getUserConfig().f();
            if (this.z1.startsWith("+")) {
                this.F1.setText(this.z1.substring(1));
            } else if (this.A1 || f10 == null || TextUtils.isEmpty(f10.phone)) {
                this.F1.setText(this.z1);
            } else {
                String str4 = f10.phone;
                while (true) {
                    if (i11 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i11);
                    if (((List) this.t1.get(substring)) != null) {
                        this.F1.setText(substring);
                        break;
                    }
                    i11--;
                }
                this.H1.setText(this.z1);
            }
            this.z1 = null;
        }
        this.Q1 = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.O1 = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.O1.setGravity(17);
        this.O1.setLines(1);
        this.O1.setSingleLine(true);
        this.O1.setText(org.telegram.messenger.bd.M0(2131751751, null));
        TextView textView4 = this.O1;
        org.telegram.ui.ActionBar.d2 d2Var2 = this.D1;
        int i19 = org.telegram.ui.ActionBar.k6.Gi;
        textView4.setTextColor(d2Var2.getThemedColor(i19));
        this.O1.setTextSize(1, 15.0f);
        this.O1.setTypeface(org.telegram.messenger.g0.o());
        b8.pf.b(this.Q1, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.P1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
        this.P1.setProgressColor(this.D1.getThemedColor(i19));
        this.Q1.addView(this.O1, b8.mf.c(-1.0f, -1));
        this.Q1.addView(this.P1, b8.mf.e(40, 40, 17));
        this.j1.addView(this.Q1, b8.mf.t(-1, 48, 0, 0, 8, 0, 4));
        org.telegram.messenger.g0.Z3(this.O1, true, 1.0f, true, false);
        org.telegram.messenger.g0.Z3(this.P1, false, 1.0f, true, false);
        this.Q1.setBackground(org.telegram.ui.ActionBar.y5.e(this.D1.getThemedColor(org.telegram.ui.ActionBar.k6.Ci), 24.0f));
        this.Q1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i152 = i10;
                vg0 vg0Var = this.b;
                switch (i152) {
                    case 0:
                        vg0Var.dismiss();
                        s9.j0(LaunchActivity.K1, 1, new tg0(vg0Var));
                        break;
                    case 1:
                        org.telegram.ui.ActionBar.d2 d2Var22 = vg0Var.D1;
                        if (!vg0Var.y1 && d2Var22 != null && d2Var22.getParentActivity() != null) {
                            if (vg0Var.k1.getEditText().length() != 0) {
                                if (vg0Var.F1.length() != 0) {
                                    if (vg0Var.H1.length() != 0) {
                                        if (!vg0Var.J1.a.q) {
                                            vg0Var.J0();
                                            break;
                                        } else {
                                            b8.nf.c(R.raw.permission_request_contacts, 2131747315, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new s3(vg0Var, 14));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) d2Var22.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        org.telegram.messenger.g0.F3(vg0Var.H1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) d2Var22.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.F3(vg0Var.F1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) d2Var22.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(vg0Var.k1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        os osVar = new os(null, true);
                        osVar.r = new tg0(vg0Var);
                        vg0Var.D1.showAsSheet(osVar);
                        break;
                    default:
                        vg0Var.J1.a(!r6.a.q, true);
                        vg0Var.P0(true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.V(this.R1, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.k6, this.G1, null);
        this.O = scrollView;
        this.P = org.telegram.messenger.bd.M0(2131748284, null);
        this.Q = true;
    }

    public static void I0(vg0 vg0Var) {
        String replaceAll = (vg0Var.F1.getText().toString() + vg0Var.H1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) vg0Var.t1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) vg0Var.u1.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z10 = true;
                            break;
                        }
                    }
                }
            }
            if (z10) {
                break;
            }
        }
        if (z10) {
            if (TextUtils.equals(vg0Var.S1, replaceAll)) {
                return;
            }
            vg0Var.S1 = replaceAll;
            vg0Var.Q0(replaceAll);
            return;
        }
        if (TextUtils.isEmpty(vg0Var.S1)) {
            return;
        }
        vg0Var.S1 = null;
        vg0Var.Q0(null);
    }

    public static String K0(LaunchActivity launchActivity, TLRPC.User user, String str) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(launchActivity.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!str.startsWith("+")) {
            if (user == null || TextUtils.isEmpty(user.phone)) {
                return "+".concat(str);
            }
            String str2 = user.phone;
            for (int i3 = 4; i3 >= 1; i3--) {
                String substring = str2.substring(0, i3);
                if (((String) hashMap.get(substring)) != null) {
                    return a1.g.q("+", substring, str);
                }
            }
        }
        return str;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
    }

    public final void J0() {
        this.y1 = true;
        org.telegram.messenger.g0.Z3(this.O1, false, 0.5f, true, true);
        org.telegram.messenger.g0.Z3(this.P1, true, 0.5f, true, true);
        String str = "+" + this.F1.getText().toString() + this.H1.getText().toString();
        String obj = this.k1.getEditText().getText().toString();
        String obj2 = this.l1.getEditText().getText().toString();
        String obj3 = this.p1.getVisibility() == 0 ? this.p1.getEditText().getText().toString() : "";
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str;
        if (!TextUtils.isEmpty(obj3)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = obj3;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.a).bindRequestToGuid(ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_importContacts, new y9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.E1);
        if (this.J1.a.q) {
            Context context = getContext();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            newInsert.withValue("account_type", null);
            newInsert.withValue("account_name", null);
            arrayList.add(newInsert.build());
            Uri uri = ContactsContract.Data.CONTENT_URI;
            ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(obj)) {
                withValue = withValue.withValue("data2", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                withValue = withValue.withValue("data2", obj2);
            }
            arrayList.add(withValue.build());
            if (str != null && !str.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void L0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.N1.animate();
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
            animate.setInterpolator(xqVar).translationY(org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.R1.animate().setInterpolator(xqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.F1.animate().setInterpolator(xqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            return;
        }
        this.N1.animate().setInterpolator(org.telegram.messenger.g0.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.R1.animate();
        org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f;
        animate2.setInterpolator(xqVar2).translationX(0.0f).setDuration(150L);
        this.F1.animate().setInterpolator(xqVar2).translationX(0.0f).setDuration(150L);
        this.N1.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r7 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(String str, ks ksVar) {
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.bd.F0(ksVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0);
        }
        int i10 = 0;
        L0(org.telegram.messenger.i6.m(spannableStringBuilder, this.N1.getPaint().getFontMetricsInt(), false, null, 0));
        this.M1 = -1;
        String replace = this.H1.getText() != null ? this.H1.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.u1;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.M1 != -1) {
                int selectionStart = this.H1.getSelectionStart();
                int selectionEnd = this.H1.getSelectionEnd();
                this.H1.setHintText((String) null);
                this.H1.setSelection(selectionStart, selectionEnd);
                this.M1 = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i3 = 0;
            while (i3 < list.size()) {
                if (replace.startsWith(((String) list.get(i3)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        i3 = -1;
        if (i3 == -1) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str2 = (String) list.get(i11);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i3 = i11;
                    break;
                }
            }
        }
        i10 = i3;
        if (this.M1 != i10) {
            String str3 = (String) ((List) hashMap.get(str)).get(i10);
            int selectionStart2 = this.H1.getSelectionStart();
            int selectionEnd2 = this.H1.getSelectionEnd();
            this.H1.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.H1.setSelection(selectionStart2, selectionEnd2);
            this.M1 = i10;
        }
    }

    public final void N0(String str, boolean z10) {
        this.z1 = str;
        this.A1 = z10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User f10 = org.telegram.messenger.h10.i(this.a).f();
        if (this.z1.startsWith("+")) {
            this.F1.setText(this.z1.substring(1));
        } else if (this.A1 || f10 == null || TextUtils.isEmpty(f10.phone)) {
            this.F1.setText(this.z1);
        } else {
            String str2 = f10.phone;
            int i3 = 4;
            while (true) {
                if (i3 >= 1) {
                    List list = (List) this.t1.get(str2.substring(0, i3));
                    if (list == null || list.size() <= 0) {
                        i3--;
                    } else {
                        String str3 = ((ks) list.get(0)).c;
                        this.F1.setText(str3);
                        if (str3.endsWith("0") && this.z1.startsWith("0")) {
                            this.z1 = this.z1.substring(1);
                        }
                    }
                } else {
                    Context context = org.telegram.messenger.t0.b;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.F1.setText(upperCase);
                    if (upperCase.endsWith("0") && this.z1.startsWith("0")) {
                        this.z1 = this.z1.substring(1);
                    }
                }
            }
            this.H1.setText(this.z1);
        }
        this.z1 = null;
    }

    public final void O0(boolean z10) {
        ViewPropertyAnimator translationY = this.L1.animate().translationY(z10 ? -org.telegram.messenger.g0.L(21.33f) : 0.0f);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 420L);
        this.m1.animate().translationY(z10 ? -org.telegram.messenger.g0.L(10.665f) : 0.0f).setInterpolator(xqVar).setDuration(420L).start();
    }

    public final void P0(boolean z10) {
        boolean z11 = this.J1.a.q;
        final boolean z12 = !z11;
        if (!z10) {
            this.o1.animate().cancel();
            this.o1.setVisibility(!z11 ? 0 : 4);
            this.o1.setAlpha(!z11 ? 1.0f : 0.0f);
            this.n1.animate().cancel();
            this.n1.setVisibility(!z11 ? 0 : 8);
            this.n1.setAlpha(!z11 ? 1.0f : 0.0f);
            this.p1.animate().cancel();
            this.p1.setVisibility(z11 ? 0 : 4);
            this.p1.setAlpha(z11 ? 1.0f : 0.0f);
            return;
        }
        this.o1.setVisibility(0);
        ViewPropertyAnimator alpha = this.o1.animate().alpha(!z11 ? 1.0f : 0.0f);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        final int i3 = 0;
        alpha.setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.rg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        boolean z13 = z12;
                        vg0 vg0Var = this.b;
                        if (!z13) {
                            vg0Var.o1.setVisibility(4);
                            break;
                        } else {
                            vg0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        vg0 vg0Var2 = this.b;
                        if (!z14) {
                            vg0Var2.n1.setVisibility(4);
                            break;
                        } else {
                            vg0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        vg0 vg0Var3 = this.b;
                        if (!z15) {
                            vg0Var3.getClass();
                            break;
                        } else {
                            vg0Var3.p1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.n1.setVisibility(0);
        final int i10 = 1;
        this.n1.animate().alpha(!z11 ? 1.0f : 0.0f).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.rg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z13 = z12;
                        vg0 vg0Var = this.b;
                        if (!z13) {
                            vg0Var.o1.setVisibility(4);
                            break;
                        } else {
                            vg0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        vg0 vg0Var2 = this.b;
                        if (!z14) {
                            vg0Var2.n1.setVisibility(4);
                            break;
                        } else {
                            vg0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        vg0 vg0Var3 = this.b;
                        if (!z15) {
                            vg0Var3.getClass();
                            break;
                        } else {
                            vg0Var3.p1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.p1.setVisibility(0);
        final int i11 = 2;
        this.p1.animate().alpha(z11 ? 1.0f : 0.0f).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.rg0
            public final /* synthetic */ vg0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z13 = z12;
                        vg0 vg0Var = this.b;
                        if (!z13) {
                            vg0Var.o1.setVisibility(4);
                            break;
                        } else {
                            vg0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        vg0 vg0Var2 = this.b;
                        if (!z14) {
                            vg0Var2.n1.setVisibility(4);
                            break;
                        } else {
                            vg0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        vg0 vg0Var3 = this.b;
                        if (!z15) {
                            vg0Var3.getClass();
                            break;
                        } else {
                            vg0Var3.p1.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
    }

    public final void Q0(String str) {
        if (this.T1 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.T1, true);
            this.T1 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.camera.q.l(this.I1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.xq.h, 420L);
            this.r1.setText("");
            O0(true);
            return;
        }
        org.telegram.messenger.camera.q.l(this.I1.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.xq.h, 420L);
        this.I1.setImageDrawable(new org.telegram.ui.Components.cp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.m5, this.J0)));
        this.r1.setText("");
        O0(true);
        org.telegram.ui.Components.ei eiVar = new org.telegram.ui.Components.ei(19, this, str);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) org.telegram.messenger.g5.r(this.a).l0.get(mf.b.d(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = mf.b.d(str, false);
            this.T1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolvePhone, new xy(15, this, eiVar));
        } else {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(this.a).a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                eiVar.a(a22);
            } else {
                org.telegram.messenger.qr.a0(this.a).a.c(new hc0(this, tL_contact, eiVar, 9));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.k1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.l1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H1, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.g0.i3(new og0(this, 0), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j10) {
        if (this.x1) {
            this.x1 = false;
            return;
        }
        this.v1 = true;
        this.F1.setText(((ks) this.s1.get(i3)).c);
        this.v1 = false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        int themedColor;
        super.s0();
        try {
            RadialProgressView radialProgressView = this.P1;
            org.telegram.ui.ActionBar.d2 d2Var = this.D1;
            if (radialProgressView != null && d2Var != null) {
                radialProgressView.setProgressColor(d2Var.getThemedColor(org.telegram.ui.ActionBar.k6.Gi));
            }
            if (this.Q1 != null && d2Var != null && ((themedColor = d2Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ci)) != this.U1 || this.V1 != org.telegram.ui.ActionBar.k6.I.q())) {
                this.V1 = org.telegram.ui.ActionBar.k6.I.q();
                this.U1 = themedColor;
                org.telegram.ui.ActionBar.k6.H1(this.Q1.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.k6.H1(this.Q1.getBackground(), org.telegram.ui.ActionBar.y5.b(themedColor), true);
                this.Q1.invalidate();
            }
            ImageView imageView = this.I1;
            if (imageView == null || !(imageView.getDrawable() instanceof org.telegram.ui.Components.cp)) {
                return;
            }
            ((org.telegram.ui.Components.cp) this.I1.getDrawable()).b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.m5, this.J0));
            this.I1.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        this.k1.getEditText().requestFocus();
        this.k1.getEditText().setSelection(this.k1.getEditText().length());
        org.telegram.messenger.g0.i3(new og0(this, 1), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
