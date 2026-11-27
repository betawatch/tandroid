// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rl7 extends nx0 implements AdapterView.OnItemSelectedListener {
    public boolean A1;
    public String B1;
    public boolean C1;
    public String D1;
    public String E1;
    public final e F1;
    public final int G1;
    public final ql7 H1;
    public final View I1;
    public final ql7 J1;
    public final ImageView K1;
    public final og2 L1;
    public final TextView M1;
    public final LinearLayout N1;
    public int O1;
    public final fx0 P1;
    public final TextView Q1;
    public final RadialProgressView R1;
    public final FrameLayout S1;
    public final TextView T1;
    public String U1;
    public int V1;
    public int W1;
    public boolean X1;
    public final LinearLayout l1;
    public final ju7 m1;
    public final ju7 n1;
    public final FrameLayout o1;
    public final View p1;
    public final c51 q1;
    public final ju7 r1;
    public final lu7 s1;
    public final p66 t1;
    public final ArrayList u1;
    public final HashMap v1;
    public final HashMap w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0691 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rl7(e eVar, Context context) {
        super(context, true);
        String str;
        String str2;
        int i;
        gy2 gy2Var;
        TelephonyManager telephonyManager;
        final byte b = 1;
        this.u1 = new ArrayList();
        this.v1 = new HashMap();
        this.w1 = new HashMap();
        this.V1 = -1;
        J();
        this.E = true;
        this.Q0 = true;
        this.G1 = ConnectionsManager.generateClassGuid();
        this.F1 = eVar;
        Context context2 = getContext();
        int i2 = 4;
        final char c = 4;
        new ww2(context2, 1).setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.l1 = linearLayout;
        final byte b2 = 0;
        linearLayout.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        this.l1.setOrientation(1);
        scrollView.addView(this.l1, tre.x(-1, -2, 51));
        this.l1.setOnTouchListener(new b02((byte) 14));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.l1.addView(frameLayout, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        ju7 ju7Var = new ju7(context2);
        this.m1 = ju7Var;
        ju7Var.getEditText().setInputType(49152);
        this.m1.getEditText().setImeOptions(5);
        this.m1.setHint(ob6.M0(2131750654, null));
        if (this.D1 != null) {
            this.m1.getEditText().setText(this.D1);
            this.D1 = null;
        }
        frameLayout.addView(this.m1, tre.d(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ml7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                byte b3 = b;
                rl7 rl7Var = this.b;
                switch (b3) {
                    case 0:
                        if (i3 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var = rl7Var.H1;
                            ql7Var.setSelection(ql7Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i3 == 5) {
                            rl7Var.n1.requestFocus();
                            rl7Var.n1.getEditText().setSelection(rl7Var.n1.getEditText().length());
                            break;
                        }
                        break;
                    case 2:
                        if (i3 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var2 = rl7Var.H1;
                            ql7Var2.setSelection(ql7Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i3 == 5) {
                            rl7Var.J1.requestFocus();
                            ql7 ql7Var3 = rl7Var.J1;
                            ql7Var3.setSelection(ql7Var3.length());
                            break;
                        }
                        break;
                    default:
                        if (i3 == 5) {
                            rl7Var.S1.callOnClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        ju7 ju7Var2 = new ju7(context2);
        this.n1 = ju7Var2;
        ju7Var2.setBackground(null);
        this.n1.getEditText().setInputType(49152);
        this.n1.getEditText().setImeOptions(5);
        this.n1.setHint(ob6.M0(2131748786, null));
        if (this.E1 != null) {
            this.n1.getEditText().setText(this.E1);
            this.E1 = null;
        }
        frameLayout.addView(this.n1, tre.d(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final byte b3 = 2;
        this.n1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ml7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                byte b32 = b3;
                rl7 rl7Var = this.b;
                switch (b32) {
                    case 0:
                        if (i3 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var = rl7Var.H1;
                            ql7Var.setSelection(ql7Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i3 == 5) {
                            rl7Var.n1.requestFocus();
                            rl7Var.n1.getEditText().setSelection(rl7Var.n1.getEditText().length());
                            break;
                        }
                        break;
                    case 2:
                        if (i3 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var2 = rl7Var.H1;
                            ql7Var2.setSelection(ql7Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i3 == 5) {
                            rl7Var.J1.requestFocus();
                            ql7 ql7Var3 = rl7Var.J1;
                            ql7Var3.setSelection(ql7Var3.length());
                            break;
                        }
                        break;
                    default:
                        if (i3 == 5) {
                            rl7Var.S1.callOnClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        lu7 lu7Var = new lu7(context2, null);
        this.s1 = lu7Var;
        lu7Var.addView(linearLayout2, tre.d(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.s1.setText(ob6.M0(2131747017, null));
        this.l1.addView(this.s1, tre.k(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        p66 p66Var = new p66(context2, null);
        this.t1 = p66Var;
        p66Var.setTextSize(1, 12.0f);
        yob.X(this.t1, aob.y6, this.J0);
        yob.G(this.t1, aob.Xc, this.J0);
        this.l1.addView(this.t1, tre.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        fx0 fx0Var = new fx0(context2, (byte) 4);
        this.P1 = fx0Var;
        fx0Var.setTextSize(1, 16.0f);
        this.P1.setFocusable(false);
        this.P1.setGravity(17);
        final byte b4 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ll7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b4;
                rl7 rl7Var = this.b;
                switch (b5) {
                    case 0:
                        rl7Var.dismiss();
                        la1.i0(LaunchActivity.H1, 1, new kj4(rl7Var, (byte) 20));
                        break;
                    case 1:
                        e eVar2 = rl7Var.F1;
                        if (!rl7Var.A1 && eVar2 != null && eVar2.getParentActivity() != null) {
                            if (rl7Var.m1.getEditText().length() != 0) {
                                if (rl7Var.H1.length() != 0) {
                                    if (rl7Var.J1.length() != 0) {
                                        if (!rl7Var.L1.a.q) {
                                            rl7Var.E0();
                                            break;
                                        } else {
                                            jve.c(R.raw.permission_request_contacts, 2131747034, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new ii7(rl7Var, (byte) 3));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) eVar2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        hl.z3(rl7Var.J1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) eVar2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    hl.z3(rl7Var.H1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) eVar2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                hl.z3(rl7Var.m1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        ky2 ky2Var = new ky2(null, true);
                        ky2Var.r = new v34(rl7Var, (byte) 18);
                        rl7Var.F1.showAsSheet(ky2Var);
                        break;
                    default:
                        rl7Var.L1.a(!r5.a.q, true);
                        rl7Var.K0(true);
                        break;
                }
            }
        });
        int L = hl.L(6.0f);
        int i3 = aob.i6;
        int w0 = aob.w0(null, i3, false);
        hf0 i0 = aob.i0(L, L, L, L, 0, w0, w0);
        uob M = yob.M(i3);
        frameLayout2.setBackground(i0);
        yob.j(frameLayout2, i0, null, M, null);
        frameLayout2.addView(this.P1, tre.e(-1, -2, 16));
        linearLayout2.addView(frameLayout2, tre.o(42, -1));
        TextView textView = new TextView(context2);
        this.T1 = textView;
        textView.setText("+");
        this.T1.setTextSize(1, 16.0f);
        this.T1.setFocusable(false);
        linearLayout2.addView(this.T1, tre.o(-2, -2));
        ql7 ql7Var = new ql7(this, context2, b2);
        this.H1 = ql7Var;
        int i4 = aob.G6;
        yob.X(ql7Var, i4, null);
        this.H1.setInputType(3);
        this.H1.setCursorSize(hl.L(20.0f));
        this.H1.setCursorWidth(1.5f);
        this.H1.setPadding(hl.L(10.0f), 0, 0, 0);
        this.H1.setTextSize(1, 16.0f);
        this.H1.setMaxLines(1);
        this.H1.setGravity(19);
        this.H1.setImeOptions(268435461);
        this.H1.setBackground(null);
        this.H1.setContentDescription(ob6.M0(2131748494, null));
        linearLayout2.addView(this.H1, tre.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.H1.addTextChangedListener(new nh6(this, (byte) 2));
        final byte b5 = 3;
        this.H1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ml7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i32, KeyEvent keyEvent) {
                byte b32 = b5;
                rl7 rl7Var = this.b;
                switch (b32) {
                    case 0:
                        if (i32 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var2 = rl7Var.H1;
                            ql7Var2.setSelection(ql7Var2.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i32 == 5) {
                            rl7Var.n1.requestFocus();
                            rl7Var.n1.getEditText().setSelection(rl7Var.n1.getEditText().length());
                            break;
                        }
                        break;
                    case 2:
                        if (i32 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var22 = rl7Var.H1;
                            ql7Var22.setSelection(ql7Var22.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i32 == 5) {
                            rl7Var.J1.requestFocus();
                            ql7 ql7Var3 = rl7Var.J1;
                            ql7Var3.setSelection(ql7Var3.length());
                            break;
                        }
                        break;
                    default:
                        if (i32 == 5) {
                            rl7Var.S1.callOnClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.I1 = new View(context2);
        LinearLayout.LayoutParams k = tre.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k.width = Math.max(2, hl.L(0.5f));
        linearLayout2.addView(this.I1, k);
        ql7 ql7Var2 = new ql7(this, context2, b);
        this.J1 = ql7Var2;
        yob.X(ql7Var2, i4, null);
        this.J1.setInputType(3);
        this.J1.setPadding(0, 0, 0, 0);
        this.J1.setCursorSize(hl.L(20.0f));
        this.J1.setCursorWidth(1.5f);
        this.J1.setTextSize(1, 16.0f);
        this.J1.setMaxLines(1);
        this.J1.setGravity(19);
        this.J1.setImeOptions(268435461);
        this.J1.setBackground(null);
        this.J1.setContentDescription(ob6.M0(2131747017, null));
        linearLayout2.addView(this.J1, tre.o(-1, 36));
        this.J1.addTextChangedListener(new ak2(this, (byte) 2));
        this.J1.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ml7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i32, KeyEvent keyEvent) {
                byte b32 = c;
                rl7 rl7Var = this.b;
                switch (b32) {
                    case 0:
                        if (i32 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var22 = rl7Var.H1;
                            ql7Var22.setSelection(ql7Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i32 == 5) {
                            rl7Var.n1.requestFocus();
                            rl7Var.n1.getEditText().setSelection(rl7Var.n1.getEditText().length());
                            break;
                        }
                        break;
                    case 2:
                        if (i32 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var222 = rl7Var.H1;
                            ql7Var222.setSelection(ql7Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i32 == 5) {
                            rl7Var.J1.requestFocus();
                            ql7 ql7Var3 = rl7Var.J1;
                            ql7Var3.setSelection(ql7Var3.length());
                            break;
                        }
                        break;
                    default:
                        if (i32 == 5) {
                            rl7Var.S1.callOnClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        ImageView imageView = new ImageView(context2);
        this.K1 = imageView;
        imageView.setScaleX(0.5f);
        this.K1.setScaleY(0.5f);
        this.K1.setAlpha(0.0f);
        this.s1.addView(this.K1, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        og2 og2Var = new og2(21, this.J0, context2);
        this.L1 = og2Var;
        og2Var.b(aob.h7, aob.j7, aob.k7);
        this.L1.setDrawUnchecked(true);
        this.L1.a(false, false);
        this.L1.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.M1 = textView2;
        yob.X(textView2, i4, this.J0);
        this.M1.setTextSize(1, 14.0f);
        this.M1.setText(ob6.M0(2131754438, null));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.N1 = linearLayout3;
        linearLayout3.setOrientation(0);
        this.N1.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
        this.N1.addView(this.L1, tre.t(21, 21, 16, 0, 0, 9, 0));
        this.N1.addView(this.M1, tre.r(-2, -2, 16));
        final byte b6 = 3;
        this.N1.setOnClickListener(new View.OnClickListener(this) { // from class: ll7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b52 = b6;
                rl7 rl7Var = this.b;
                switch (b52) {
                    case 0:
                        rl7Var.dismiss();
                        la1.i0(LaunchActivity.H1, 1, new kj4(rl7Var, (byte) 20));
                        break;
                    case 1:
                        e eVar2 = rl7Var.F1;
                        if (!rl7Var.A1 && eVar2 != null && eVar2.getParentActivity() != null) {
                            if (rl7Var.m1.getEditText().length() != 0) {
                                if (rl7Var.H1.length() != 0) {
                                    if (rl7Var.J1.length() != 0) {
                                        if (!rl7Var.L1.a.q) {
                                            rl7Var.E0();
                                            break;
                                        } else {
                                            jve.c(R.raw.permission_request_contacts, 2131747034, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new ii7(rl7Var, (byte) 3));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) eVar2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        hl.z3(rl7Var.J1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) eVar2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    hl.z3(rl7Var.H1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) eVar2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                hl.z3(rl7Var.m1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        ky2 ky2Var = new ky2(null, true);
                        ky2Var.r = new v34(rl7Var, (byte) 18);
                        rl7Var.F1.showAsSheet(ky2Var);
                        break;
                    default:
                        rl7Var.L1.a(!r5.a.q, true);
                        rl7Var.K0(true);
                        break;
                }
            }
        });
        this.N1.setTranslationY(hl.L(-21.33f));
        this.N1.setPivotX(0.0f);
        iye.b(this.N1, 0.0125f, 1.2f);
        yob.R(this.N1, aob.Y(aob.v0(i3, this.J0), 6, 6), null, yob.M(i3), this.J0);
        this.l1.addView(this.N1, tre.k(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.o1 = frameLayout3;
        frameLayout3.setTranslationY(hl.L(-10.665f));
        this.l1.addView(this.o1, tre.k(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.p1 = view;
        yob.h(aob.d7, this.J0, view);
        this.o1.addView(this.p1, tre.d(-1, 1.0f / hl.p, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        c51 c51Var = new c51(this.J0, context2, false);
        this.q1 = c51Var;
        c51Var.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new wm2(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) ob6.M0(2131754441, null));
        this.q1.i(spannableStringBuilder, false, true);
        this.q1.setOnClickListener(new View.OnClickListener(this) { // from class: ll7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b2;
                rl7 rl7Var = this.b;
                switch (b52) {
                    case 0:
                        rl7Var.dismiss();
                        la1.i0(LaunchActivity.H1, 1, new kj4(rl7Var, (byte) 20));
                        break;
                    case 1:
                        e eVar2 = rl7Var.F1;
                        if (!rl7Var.A1 && eVar2 != null && eVar2.getParentActivity() != null) {
                            if (rl7Var.m1.getEditText().length() != 0) {
                                if (rl7Var.H1.length() != 0) {
                                    if (rl7Var.J1.length() != 0) {
                                        if (!rl7Var.L1.a.q) {
                                            rl7Var.E0();
                                            break;
                                        } else {
                                            jve.c(R.raw.permission_request_contacts, 2131747034, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new ii7(rl7Var, (byte) 3));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) eVar2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        hl.z3(rl7Var.J1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) eVar2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    hl.z3(rl7Var.H1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) eVar2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                hl.z3(rl7Var.m1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        ky2 ky2Var = new ky2(null, true);
                        ky2Var.r = new v34(rl7Var, (byte) 18);
                        rl7Var.F1.showAsSheet(ky2Var);
                        break;
                    default:
                        rl7Var.L1.a(!r5.a.q, true);
                        rl7Var.K0(true);
                        break;
                }
            }
        });
        this.o1.addView(this.q1, tre.d(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        ju7 ju7Var3 = new ju7(context2);
        this.r1 = ju7Var3;
        ju7Var3.setBackground(null);
        this.r1.getEditText().setInputType(49152);
        this.r1.getEditText().setImeOptions(5);
        this.r1.setHint(ob6.M0(2131746377, null));
        this.o1.addView(this.r1, tre.d(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.r1.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: ml7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView22, int i32, KeyEvent keyEvent) {
                byte b32 = b2;
                rl7 rl7Var = this.b;
                switch (b32) {
                    case 0:
                        if (i32 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var22 = rl7Var.H1;
                            ql7Var22.setSelection(ql7Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i32 == 5) {
                            rl7Var.n1.requestFocus();
                            rl7Var.n1.getEditText().setSelection(rl7Var.n1.getEditText().length());
                            break;
                        }
                        break;
                    case 2:
                        if (i32 == 5) {
                            rl7Var.H1.requestFocus();
                            ql7 ql7Var222 = rl7Var.H1;
                            ql7Var222.setSelection(ql7Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i32 == 5) {
                            rl7Var.J1.requestFocus();
                            ql7 ql7Var3 = rl7Var.J1;
                            ql7Var3.setSelection(ql7Var3.length());
                            break;
                        }
                        break;
                    default:
                        if (i32 == 5) {
                            rl7Var.S1.callOnClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        K0(false);
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.b.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                gy2 gy2Var2 = new gy2();
                gy2Var2.a = split[2];
                gy2Var2.c = split[0];
                gy2Var2.d = split[1];
                this.u1.add(0, gy2Var2);
                List list = (List) this.v1.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.v1;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(gy2Var2);
                if (split.length > 3) {
                    this.w1.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        Collections.sort(this.u1, Comparator$-CC.comparing(new yz((byte) 15)));
        if (TextUtils.isEmpty(this.B1)) {
            try {
                telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso().toUpperCase();
                if (str != null && (str2 = (String) hashMap.get(str)) != null) {
                    i = 0;
                    while (true) {
                        if (i < this.u1.size()) {
                            gy2Var = null;
                            break;
                        } else {
                            if (Objects.equals(((gy2) this.u1.get(i)).a, str2)) {
                                gy2Var = (gy2) this.u1.get(i);
                                break;
                            }
                            i++;
                        }
                    }
                    if (gy2Var != null) {
                        this.H1.setText(gy2Var.c);
                    }
                }
                if (this.H1.length() == 0) {
                    this.J1.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i = 0;
                while (true) {
                    if (i < this.u1.size()) {
                    }
                    i++;
                }
                if (gy2Var != null) {
                }
            }
            if (this.H1.length() == 0) {
            }
        } else {
            TLRPC.User f = this.F1.getUserConfig().f();
            if (this.B1.startsWith("+")) {
                this.H1.setText(this.B1.substring(1));
            } else if (this.C1 || f == null || TextUtils.isEmpty(f.phone)) {
                this.H1.setText(this.B1);
            } else {
                String str4 = f.phone;
                while (true) {
                    if (i2 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i2);
                    if (((List) this.v1.get(substring)) != null) {
                        this.H1.setText(substring);
                        break;
                    }
                    i2--;
                }
                this.J1.setText(this.B1);
            }
            this.B1 = null;
        }
        this.S1 = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.Q1 = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.Q1.setGravity(17);
        this.Q1.setLines(1);
        this.Q1.setSingleLine(true);
        this.Q1.setText(ob6.M0(2131751716, null));
        TextView textView4 = this.Q1;
        e eVar2 = this.F1;
        int i5 = aob.Ji;
        textView4.setTextColor(eVar2.getThemedColor(i5));
        this.Q1.setTextSize(1, 15.0f);
        this.Q1.setTypeface(hl.o());
        iye.b(this.S1, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.R1 = radialProgressView;
        radialProgressView.setSize(hl.L(20.0f));
        this.R1.setProgressColor(this.F1.getThemedColor(i5));
        this.S1.addView(this.Q1, tre.c(-1.0f, -1));
        this.S1.addView(this.R1, tre.e(40, 40, 17));
        this.l1.addView(this.S1, tre.t(-1, 48, 0, 0, 8, 0, 4));
        hl.T3(this.Q1, true, 1.0f, true, false);
        hl.T3(this.R1, false, 1.0f, true, false);
        this.S1.setBackground(rnb.e(this.F1.getThemedColor(aob.Fi), 24.0f));
        this.S1.setOnClickListener(new View.OnClickListener(this) { // from class: ll7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b52 = b;
                rl7 rl7Var = this.b;
                switch (b52) {
                    case 0:
                        rl7Var.dismiss();
                        la1.i0(LaunchActivity.H1, 1, new kj4(rl7Var, (byte) 20));
                        break;
                    case 1:
                        e eVar22 = rl7Var.F1;
                        if (!rl7Var.A1 && eVar22 != null && eVar22.getParentActivity() != null) {
                            if (rl7Var.m1.getEditText().length() != 0) {
                                if (rl7Var.H1.length() != 0) {
                                    if (rl7Var.J1.length() != 0) {
                                        if (!rl7Var.L1.a.q) {
                                            rl7Var.E0();
                                            break;
                                        } else {
                                            jve.c(R.raw.permission_request_contacts, 2131747034, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new ii7(rl7Var, (byte) 3));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) eVar22.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        hl.z3(rl7Var.J1);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) eVar22.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    hl.z3(rl7Var.H1);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) eVar22.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                hl.z3(rl7Var.m1);
                                break;
                            }
                        }
                        break;
                    case 2:
                        ky2 ky2Var = new ky2(null, true);
                        ky2Var.r = new v34(rl7Var, (byte) 18);
                        rl7Var.F1.showAsSheet(ky2Var);
                        break;
                    default:
                        rl7Var.L1.a(!r5.a.q, true);
                        rl7Var.K0(true);
                        break;
                }
            }
        });
        yob.X(this.T1, aob.G6, null);
        yob.h(aob.k6, null, this.I1);
        this.O = scrollView;
        this.P = ob6.M0(2131748030, null);
        this.Q = true;
    }

    public static String F0(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (!str.startsWith("+")) {
            if (user == null || TextUtils.isEmpty(user.phone)) {
                return "+".concat(str);
            }
            String str2 = user.phone;
            for (int i = 4; i >= 1; i--) {
                String substring = str2.substring(0, i);
                if (((String) hashMap.get(substring)) != null) {
                    return qd4.y("+", substring, str);
                }
            }
        }
        return str;
    }

    @Override // nx0
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.E7));
        hashSet.add(Integer.valueOf(aob.D7));
        hashSet.add(Integer.valueOf(aob.l6));
        hashSet.add(Integer.valueOf(aob.H6));
    }

    public final void E0() {
        this.A1 = true;
        hl.T3(this.Q1, false, 0.5f, true, true);
        hl.T3(this.R1, true, 0.5f, true, true);
        String str = "+" + this.H1.getText().toString() + this.J1.getText().toString();
        String obj = this.m1.getEditText().getText().toString();
        String obj2 = this.n1.getEditText().getText().toString();
        ju7 ju7Var = this.r1;
        String obj3 = ju7Var.getVisibility() == 0 ? ju7Var.getEditText().getText().toString() : "";
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str;
        if (!TextUtils.isEmpty(obj3)) {
            tL_inputPhoneContact.flags |= 1;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = obj3;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.a).bindRequestToGuid(ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_importContacts, new m65(this, tL_inputPhoneContact, tL_contacts_importContacts, (byte) 23), 2), this.G1);
        if (this.L1.a.q) {
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
            if (!str.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public final void G0(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        fx0 fx0Var = this.P1;
        if (isEmpty) {
            ViewPropertyAnimator animate = fx0Var.animate();
            k43 k43Var = k43.f;
            animate.setInterpolator(k43Var).translationY(hl.L(30.0f)).setDuration(150L);
            this.T1.animate().setInterpolator(k43Var).translationX(-hl.L(30.0f)).setDuration(150L);
            this.H1.animate().setInterpolator(k43Var).translationX(-hl.L(30.0f)).setDuration(150L);
            return;
        }
        fx0Var.animate().setInterpolator(hl.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.T1.animate();
        k43 k43Var2 = k43.f;
        animate2.setInterpolator(k43Var2).translationX(0.0f).setDuration(150L);
        this.H1.animate().setInterpolator(k43Var2).translationX(0.0f).setDuration(150L);
        this.P1.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r8 != (-1)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(String str, gy2 gy2Var) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = ob6.E0(gy2Var.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0);
        }
        int i2 = 0;
        G0(pv3.m(spannableStringBuilder, this.P1.getPaint().getFontMetricsInt(), false, null, 0));
        this.O1 = -1;
        ql7 ql7Var = this.J1;
        String replace = ql7Var.getText() != null ? ql7Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.w1;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.O1 != -1) {
                int selectionStart = ql7Var.getSelectionStart();
                int selectionEnd = ql7Var.getSelectionEnd();
                ql7Var.setHintText((String) null);
                ql7Var.setSelection(selectionStart, selectionEnd);
                this.O1 = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i = 0;
            while (i < list.size()) {
                if (replace.startsWith(((String) list.get(i)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = -1;
        if (i == -1) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                String str2 = (String) list.get(i3);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i = i3;
                    break;
                }
            }
        }
        i2 = i;
        if (this.O1 != i2) {
            String str3 = (String) ((List) hashMap.get(str)).get(i2);
            int selectionStart2 = ql7Var.getSelectionStart();
            int selectionEnd2 = ql7Var.getSelectionEnd();
            ql7Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            ql7Var.setSelection(selectionStart2, selectionEnd2);
            this.O1 = i2;
        }
    }

    public final void I0(String str, boolean z) {
        this.B1 = str;
        this.C1 = z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User f = yac.h(this.a).f();
        if (this.B1.startsWith("+")) {
            this.H1.setText(this.B1.substring(1));
        } else if (this.C1 || f == null || TextUtils.isEmpty(f.phone)) {
            this.H1.setText(this.B1);
        } else {
            String str2 = f.phone;
            int i = 4;
            while (true) {
                if (i >= 1) {
                    List list = (List) this.v1.get(str2.substring(0, i));
                    if (list == null || list.size() <= 0) {
                        i--;
                    } else {
                        String str3 = ((gy2) list.get(0)).c;
                        this.H1.setText(str3);
                        if (str3.endsWith("0") && this.B1.startsWith("0")) {
                            this.B1 = this.B1.substring(1);
                        }
                    }
                } else {
                    Context context = a.b;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.H1.setText(upperCase);
                    if (upperCase.endsWith("0") && this.B1.startsWith("0")) {
                        this.B1 = this.B1.substring(1);
                    }
                }
            }
            this.J1.setText(this.B1);
        }
        this.B1 = null;
    }

    public final void J0(boolean z) {
        ViewPropertyAnimator translationY = this.N1.animate().translationY(z ? -hl.L(21.33f) : 0.0f);
        k43 k43Var = k43.h;
        ik8.t(translationY, k43Var, 420L);
        this.o1.animate().translationY(z ? -hl.L(10.665f) : 0.0f).setInterpolator(k43Var).setDuration(420L).start();
    }

    public final void K0(boolean z) {
        boolean z2 = this.L1.a.q;
        final boolean z3 = !z2;
        c51 c51Var = this.q1;
        if (!z) {
            c51Var.animate().cancel();
            this.q1.setVisibility(!z2 ? 0 : 4);
            this.q1.setAlpha(!z2 ? 1.0f : 0.0f);
            this.p1.animate().cancel();
            this.p1.setVisibility(!z2 ? 0 : 8);
            this.p1.setAlpha(!z2 ? 1.0f : 0.0f);
            this.r1.animate().cancel();
            this.r1.setVisibility(z2 ? 0 : 4);
            this.r1.setAlpha(z2 ? 1.0f : 0.0f);
            return;
        }
        c51Var.setVisibility(0);
        ViewPropertyAnimator alpha = this.q1.animate().alpha(!z2 ? 1.0f : 0.0f);
        k43 k43Var = k43.h;
        final byte b = 0;
        alpha.setInterpolator(k43Var).setDuration(420L).withEndAction(new Runnable(this) { // from class: nl7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                boolean z4 = z3;
                rl7 rl7Var = this.b;
                switch (b2) {
                    case 0:
                        if (!z4) {
                            rl7Var.q1.setVisibility(4);
                            break;
                        }
                        break;
                    case 1:
                        if (!z4) {
                            rl7Var.p1.setVisibility(4);
                            break;
                        }
                        break;
                    default:
                        if (z4) {
                            rl7Var.r1.setVisibility(4);
                            break;
                        }
                        break;
                }
            }
        }).start();
        this.p1.setVisibility(0);
        final byte b2 = 1;
        this.p1.animate().alpha(!z2 ? 1.0f : 0.0f).setInterpolator(k43Var).setDuration(420L).withEndAction(new Runnable(this) { // from class: nl7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                boolean z4 = z3;
                rl7 rl7Var = this.b;
                switch (b22) {
                    case 0:
                        if (!z4) {
                            rl7Var.q1.setVisibility(4);
                            break;
                        }
                        break;
                    case 1:
                        if (!z4) {
                            rl7Var.p1.setVisibility(4);
                            break;
                        }
                        break;
                    default:
                        if (z4) {
                            rl7Var.r1.setVisibility(4);
                            break;
                        }
                        break;
                }
            }
        }).start();
        this.r1.setVisibility(0);
        final byte b3 = 2;
        this.r1.animate().alpha(z2 ? 1.0f : 0.0f).setInterpolator(k43Var).setDuration(420L).withEndAction(new Runnable(this) { // from class: nl7
            public final /* synthetic */ rl7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                boolean z4 = z3;
                rl7 rl7Var = this.b;
                switch (b22) {
                    case 0:
                        if (!z4) {
                            rl7Var.q1.setVisibility(4);
                            break;
                        }
                        break;
                    case 1:
                        if (!z4) {
                            rl7Var.p1.setVisibility(4);
                            break;
                        }
                        break;
                    default:
                        if (z4) {
                            rl7Var.r1.setVisibility(4);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    public final void L0(String str) {
        if (this.V1 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.V1, true);
            this.V1 = -1;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        p66 p66Var = this.t1;
        ImageView imageView = this.K1;
        if (isEmpty) {
            ik8.t(imageView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), k43.h, 420L);
            p66Var.setText("");
            J0(true);
            return;
        }
        ik8.t(imageView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), k43.h, 420L);
        imageView.setImageDrawable(new di2(hl.L(30.0f), hl.L(3.0f), aob.v0(aob.m5, this.J0)));
        p66Var.setText("");
        J0(true);
        v35 v35Var = new v35(this, str, (byte) 10);
        byte b = 0;
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) lv2.r(this.a).l0.get(f78.h(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = f78.h(str, false);
            this.V1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolvePhone, new ol7(this, v35Var, b));
        } else {
            TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(tL_contact.user_id));
            if (X1 != null) {
                v35Var.a(X1);
            } else {
                jf7.Y(this.a).a.c(new fd7((Object) this, (Object) tL_contact, (Object) v35Var, (byte) 8));
            }
        }
    }

    public final void M0() {
        String replaceAll = (this.H1.getText().toString() + this.J1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) this.v1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) this.w1.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            if (z) {
                break;
            }
        }
        String str = this.U1;
        if (z) {
            if (TextUtils.equals(str, replaceAll)) {
                return;
            }
            this.U1 = replaceAll;
            L0(replaceAll);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.U1 = null;
        L0(null);
    }

    @Override // nx0
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        int i = aob.G6;
        arrayList.add(new apb(this.m1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        int i2 = aob.k6;
        arrayList.add(new apb(this.H1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        int i3 = aob.l6;
        arrayList.add(new apb(this.H1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.J1, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H6));
        arrayList.add(new apb(this.J1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.J1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        return arrayList;
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        hl.d3(new kl7(this, (byte) 0), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.z1) {
            this.z1 = false;
            return;
        }
        this.x1 = true;
        this.H1.setText(((gy2) this.u1.get(i)).c);
        this.x1 = false;
    }

    @Override // nx0
    public final void p0() {
        int themedColor;
        super.p0();
        try {
            RadialProgressView radialProgressView = this.R1;
            e eVar = this.F1;
            if (radialProgressView != null && eVar != null) {
                radialProgressView.setProgressColor(eVar.getThemedColor(aob.Ji));
            }
            FrameLayout frameLayout = this.S1;
            if (frameLayout != null && eVar != null && ((themedColor = eVar.getThemedColor(aob.Fi)) != this.W1 || this.X1 != aob.I.o())) {
                this.X1 = aob.I.o();
                this.W1 = themedColor;
                aob.F1(frameLayout.getBackground(), themedColor, false);
                aob.F1(frameLayout.getBackground(), rnb.b(themedColor), true);
                frameLayout.invalidate();
            }
            ImageView imageView = this.K1;
            if (imageView == null || !(imageView.getDrawable() instanceof di2)) {
                return;
            }
            ((di2) imageView.getDrawable()).b(aob.v0(aob.m5, this.J0));
            imageView.invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        this.m1.getEditText().requestFocus();
        this.m1.getEditText().setSelection(this.m1.getEditText().length());
        hl.d3(new kl7(this, (byte) 1), 50L);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
