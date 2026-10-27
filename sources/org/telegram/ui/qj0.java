package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qj0 extends org.telegram.ui.ActionBar.k3 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int e0 = 0;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public boolean I;
    public String J;
    public String K;
    public final org.telegram.ui.ActionBar.r2 L;
    public final int M;
    public final oj0 N;
    public final View O;
    public final oj0 P;
    public final ImageView Q;
    public final org.telegram.ui.Components.aq R;
    public final TextView S;
    public final LinearLayout T;
    public int U;
    public final mj0 V;
    public final TextView W;
    public final RadialProgressView X;
    public final FrameLayout Y;
    public final TextView Z;
    public String a0;
    public final LinearLayout b;
    public int b0;
    public final org.telegram.ui.Components.qd0 c;
    public int c0;
    public final org.telegram.ui.Components.qd0 d;
    public boolean d0;
    public final FrameLayout e;
    public final View f;
    public final fi.d h;
    public final org.telegram.ui.Components.qd0 n;
    public final org.telegram.ui.Components.sd0 r;
    public final org.telegram.ui.Components.aa0 s;
    public final ArrayList v;
    public final HashMap w;
    public final HashMap x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0689 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x069b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qj0(Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, true);
        String str;
        String str2;
        int i10;
        lt ltVar;
        TelephonyManager telephonyManager;
        final int i11 = 1;
        this.v = new ArrayList();
        this.w = new HashMap();
        this.x = new HashMap();
        this.b0 = -1;
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.M = ConnectionsManager.generateClassGuid();
        this.L = r2Var;
        Context context2 = getContext();
        final int i12 = 4;
        new org.telegram.ui.Components.er(context2, 1).setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.b = linearLayout;
        final int i13 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.b.setOrientation(1);
        scrollView.addView(this.b, org.telegram.ui.Components.kb1.B(-1, -2, 51));
        this.b.setOnTouchListener(new ei.d(27));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.b.addView(frameLayout, org.telegram.ui.Components.kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(context2);
        this.c = qd0Var;
        qd0Var.getEditText().setInputType(49152);
        this.c.getEditText().setImeOptions(5);
        this.c.setHint(LocaleController.getString(R.string.FirstName));
        if (this.J != null) {
            this.c.getEditText().setText(this.J);
            this.J = null;
        }
        frameLayout.addView(this.c, org.telegram.ui.Components.kb1.h(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i14 == 5) {
                            qj0 qj0Var = this.b;
                            qj0Var.N.requestFocus();
                            oj0 oj0Var = qj0Var.N;
                            oj0Var.setSelection(oj0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        qj0 qj0Var2 = this.b;
                        if (i14 != 5) {
                            qj0Var2.getClass();
                            break;
                        } else {
                            qj0Var2.d.requestFocus();
                            qj0Var2.d.getEditText().setSelection(qj0Var2.d.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i14 == 5) {
                            qj0 qj0Var3 = this.b;
                            qj0Var3.N.requestFocus();
                            oj0 oj0Var2 = qj0Var3.N;
                            oj0Var2.setSelection(oj0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i14 == 5) {
                            qj0 qj0Var4 = this.b;
                            qj0Var4.P.requestFocus();
                            oj0 oj0Var3 = qj0Var4.P;
                            oj0Var3.setSelection(oj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        qj0 qj0Var5 = this.b;
                        if (i14 != 5) {
                            qj0Var5.getClass();
                            break;
                        } else {
                            qj0Var5.Y.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        org.telegram.ui.Components.qd0 qd0Var2 = new org.telegram.ui.Components.qd0(context2);
        this.d = qd0Var2;
        qd0Var2.setBackground(null);
        this.d.getEditText().setInputType(49152);
        this.d.getEditText().setImeOptions(5);
        this.d.setHint(LocaleController.getString(R.string.LastName));
        if (this.K != null) {
            this.d.getEditText().setText(this.K);
            this.K = null;
        }
        frameLayout.addView(this.d, org.telegram.ui.Components.kb1.h(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final int i14 = 2;
        this.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i142, KeyEvent keyEvent) {
                switch (i14) {
                    case 0:
                        if (i142 == 5) {
                            qj0 qj0Var = this.b;
                            qj0Var.N.requestFocus();
                            oj0 oj0Var = qj0Var.N;
                            oj0Var.setSelection(oj0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        qj0 qj0Var2 = this.b;
                        if (i142 != 5) {
                            qj0Var2.getClass();
                            break;
                        } else {
                            qj0Var2.d.requestFocus();
                            qj0Var2.d.getEditText().setSelection(qj0Var2.d.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            qj0 qj0Var3 = this.b;
                            qj0Var3.N.requestFocus();
                            oj0 oj0Var2 = qj0Var3.N;
                            oj0Var2.setSelection(oj0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            qj0 qj0Var4 = this.b;
                            qj0Var4.P.requestFocus();
                            oj0 oj0Var3 = qj0Var4.P;
                            oj0Var3.setSelection(oj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        qj0 qj0Var5 = this.b;
                        if (i142 != 5) {
                            qj0Var5.getClass();
                            break;
                        } else {
                            qj0Var5.Y.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context2, null);
        this.r = sd0Var;
        sd0Var.addView(linearLayout2, org.telegram.ui.Components.kb1.h(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.r.setText(LocaleController.getString(R.string.PhoneNumber));
        this.b.addView(this.r, org.telegram.ui.Components.kb1.o(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(context2, null);
        this.s = aa0Var;
        aa0Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(this.s, org.telegram.ui.ActionBar.y6.y6, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.H(this.s, org.telegram.ui.ActionBar.y6.gc, this.resourcesProvider);
        this.b.addView(this.s, org.telegram.ui.Components.kb1.o(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        mj0 mj0Var = new mj0(context2);
        this.V = mj0Var;
        mj0Var.setTextSize(1, 16.0f);
        this.V.setFocusable(false);
        this.V.setGravity(17);
        final int i15 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        qj0 qj0Var = this.b;
                        qj0Var.dismiss();
                        y9.f0(LaunchActivity.I1, 1, new pj0(qj0Var));
                        break;
                    case 1:
                        qj0 qj0Var2 = this.b;
                        org.telegram.ui.ActionBar.r2 r2Var2 = qj0Var2.L;
                        if (!qj0Var2.G && r2Var2 != null && r2Var2.getParentActivity() != null) {
                            if (qj0Var2.c.getEditText().length() != 0) {
                                if (qj0Var2.N.length() != 0) {
                                    if (qj0Var2.P.length() != 0) {
                                        if (!qj0Var2.R.a.q) {
                                            qj0Var2.s();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.ye0.c(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new t3(qj0Var2, 13));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) r2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(qj0Var2.P);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) r2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(qj0Var2.N);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) r2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(qj0Var2.c);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qt qtVar = new qt(null, true);
                        qj0 qj0Var3 = this.b;
                        qtVar.r = new f(qj0Var3, 27);
                        qj0Var3.L.showAsSheet(qtVar);
                        break;
                    default:
                        qj0 qj0Var4 = this.b;
                        qj0Var4.R.a(!r0.a.q, true);
                        qj0Var4.y(true);
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(6.0f);
        int i16 = org.telegram.ui.ActionBar.y6.i6;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i16, false);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, x02, x02);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
        frameLayout2.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, j02, null, N, null);
        frameLayout2.addView(this.V, org.telegram.ui.Components.kb1.i(-1, -2, 16));
        linearLayout2.addView(frameLayout2, org.telegram.ui.Components.kb1.r(42, -1));
        TextView textView = new TextView(context2);
        this.Z = textView;
        textView.setText("+");
        this.Z.setTextSize(1, 16.0f);
        this.Z.setFocusable(false);
        linearLayout2.addView(this.Z, org.telegram.ui.Components.kb1.r(-2, -2));
        oj0 oj0Var = new oj0(this, context2, i13);
        this.N = oj0Var;
        int i17 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(oj0Var, i17, null);
        this.N.setInputType(3);
        this.N.setCursorSize(AndroidUtilities.dp(20.0f));
        this.N.setCursorWidth(1.5f);
        this.N.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        this.N.setTextSize(1, 16.0f);
        this.N.setMaxLines(1);
        this.N.setGravity(19);
        this.N.setImeOptions(268435461);
        this.N.setBackground(null);
        this.N.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(this.N, org.telegram.ui.Components.kb1.o(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.N.addTextChangedListener(new m0(this, 11));
        final int i18 = 3;
        this.N.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i142, KeyEvent keyEvent) {
                switch (i18) {
                    case 0:
                        if (i142 == 5) {
                            qj0 qj0Var = this.b;
                            qj0Var.N.requestFocus();
                            oj0 oj0Var2 = qj0Var.N;
                            oj0Var2.setSelection(oj0Var2.length());
                            break;
                        }
                        break;
                    case 1:
                        qj0 qj0Var2 = this.b;
                        if (i142 != 5) {
                            qj0Var2.getClass();
                            break;
                        } else {
                            qj0Var2.d.requestFocus();
                            qj0Var2.d.getEditText().setSelection(qj0Var2.d.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            qj0 qj0Var3 = this.b;
                            qj0Var3.N.requestFocus();
                            oj0 oj0Var22 = qj0Var3.N;
                            oj0Var22.setSelection(oj0Var22.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            qj0 qj0Var4 = this.b;
                            qj0Var4.P.requestFocus();
                            oj0 oj0Var3 = qj0Var4.P;
                            oj0Var3.setSelection(oj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        qj0 qj0Var5 = this.b;
                        if (i142 != 5) {
                            qj0Var5.getClass();
                            break;
                        } else {
                            qj0Var5.Y.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        this.O = new View(context2);
        LinearLayout.LayoutParams o10 = org.telegram.ui.Components.kb1.o(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        o10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(this.O, o10);
        oj0 oj0Var2 = new oj0(this, context2, i11);
        this.P = oj0Var2;
        org.telegram.ui.ActionBar.f7.V(oj0Var2, i17, null);
        this.P.setInputType(3);
        this.P.setPadding(0, 0, 0, 0);
        this.P.setCursorSize(AndroidUtilities.dp(20.0f));
        this.P.setCursorWidth(1.5f);
        this.P.setTextSize(1, 16.0f);
        this.P.setMaxLines(1);
        this.P.setGravity(19);
        this.P.setImeOptions(268435461);
        this.P.setBackground(null);
        this.P.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(this.P, org.telegram.ui.Components.kb1.r(-1, 36));
        this.P.addTextChangedListener(new wr(this, 2));
        this.P.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i142, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i142 == 5) {
                            qj0 qj0Var = this.b;
                            qj0Var.N.requestFocus();
                            oj0 oj0Var22 = qj0Var.N;
                            oj0Var22.setSelection(oj0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        qj0 qj0Var2 = this.b;
                        if (i142 != 5) {
                            qj0Var2.getClass();
                            break;
                        } else {
                            qj0Var2.d.requestFocus();
                            qj0Var2.d.getEditText().setSelection(qj0Var2.d.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            qj0 qj0Var3 = this.b;
                            qj0Var3.N.requestFocus();
                            oj0 oj0Var222 = qj0Var3.N;
                            oj0Var222.setSelection(oj0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            qj0 qj0Var4 = this.b;
                            qj0Var4.P.requestFocus();
                            oj0 oj0Var3 = qj0Var4.P;
                            oj0Var3.setSelection(oj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        qj0 qj0Var5 = this.b;
                        if (i142 != 5) {
                            qj0Var5.getClass();
                            break;
                        } else {
                            qj0Var5.Y.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        ImageView imageView = new ImageView(context2);
        this.Q = imageView;
        imageView.setScaleX(0.5f);
        this.Q.setScaleY(0.5f);
        this.Q.setAlpha(0.0f);
        this.r.addView(this.Q, org.telegram.ui.Components.kb1.h(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context2, 21, this.resourcesProvider);
        this.R = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.y6.h7, org.telegram.ui.ActionBar.y6.j7, org.telegram.ui.ActionBar.y6.k7);
        this.R.setDrawUnchecked(true);
        this.R.a(false, false);
        this.R.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.S = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i17, this.resourcesProvider);
        this.S.setTextSize(1, 14.0f);
        this.S.setText(LocaleController.getString(R.string.AddContactSync));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.T = linearLayout3;
        linearLayout3.setOrientation(0);
        this.T.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        this.T.addView(this.R, org.telegram.ui.Components.kb1.x(21, 21, 16, 0, 0, 9, 0));
        this.T.addView(this.S, org.telegram.ui.Components.kb1.u(-2, -2, 16));
        final int i19 = 3;
        this.T.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        qj0 qj0Var = this.b;
                        qj0Var.dismiss();
                        y9.f0(LaunchActivity.I1, 1, new pj0(qj0Var));
                        break;
                    case 1:
                        qj0 qj0Var2 = this.b;
                        org.telegram.ui.ActionBar.r2 r2Var2 = qj0Var2.L;
                        if (!qj0Var2.G && r2Var2 != null && r2Var2.getParentActivity() != null) {
                            if (qj0Var2.c.getEditText().length() != 0) {
                                if (qj0Var2.N.length() != 0) {
                                    if (qj0Var2.P.length() != 0) {
                                        if (!qj0Var2.R.a.q) {
                                            qj0Var2.s();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.ye0.c(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new t3(qj0Var2, 13));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) r2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(qj0Var2.P);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) r2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(qj0Var2.N);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) r2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(qj0Var2.c);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qt qtVar = new qt(null, true);
                        qj0 qj0Var3 = this.b;
                        qtVar.r = new f(qj0Var3, 27);
                        qj0Var3.L.showAsSheet(qtVar);
                        break;
                    default:
                        qj0 qj0Var4 = this.b;
                        qj0Var4.R.a(!r0.a.q, true);
                        qj0Var4.y(true);
                        break;
                }
            }
        });
        this.T.setTranslationY(AndroidUtilities.dp(-21.33f));
        this.T.setPivotX(0.0f);
        org.telegram.ui.Components.kb1.c(this.T, 0.0125f, 1.2f);
        org.telegram.ui.ActionBar.f7.R(this.T, org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i16, this.resourcesProvider), 6, 6), null, org.telegram.ui.ActionBar.f7.N(i16), this.resourcesProvider);
        this.b.addView(this.T, org.telegram.ui.Components.kb1.o(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.e = frameLayout3;
        frameLayout3.setTranslationY(AndroidUtilities.dp(-10.665f));
        this.b.addView(this.e, org.telegram.ui.Components.kb1.o(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.f = view;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, this.resourcesProvider);
        this.e.addView(this.f, org.telegram.ui.Components.kb1.h(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        fi.d dVar = new fi.d(context2, this.resourcesProvider, false);
        this.h = dVar;
        dVar.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AddContactQr));
        this.h.i(spannableStringBuilder, false, true);
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        qj0 qj0Var = this.b;
                        qj0Var.dismiss();
                        y9.f0(LaunchActivity.I1, 1, new pj0(qj0Var));
                        break;
                    case 1:
                        qj0 qj0Var2 = this.b;
                        org.telegram.ui.ActionBar.r2 r2Var2 = qj0Var2.L;
                        if (!qj0Var2.G && r2Var2 != null && r2Var2.getParentActivity() != null) {
                            if (qj0Var2.c.getEditText().length() != 0) {
                                if (qj0Var2.N.length() != 0) {
                                    if (qj0Var2.P.length() != 0) {
                                        if (!qj0Var2.R.a.q) {
                                            qj0Var2.s();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.ye0.c(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new t3(qj0Var2, 13));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) r2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(qj0Var2.P);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) r2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(qj0Var2.N);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) r2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(qj0Var2.c);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qt qtVar = new qt(null, true);
                        qj0 qj0Var3 = this.b;
                        qtVar.r = new f(qj0Var3, 27);
                        qj0Var3.L.showAsSheet(qtVar);
                        break;
                    default:
                        qj0 qj0Var4 = this.b;
                        qj0Var4.R.a(!r0.a.q, true);
                        qj0Var4.y(true);
                        break;
                }
            }
        });
        this.e.addView(this.h, org.telegram.ui.Components.kb1.h(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.qd0 qd0Var3 = new org.telegram.ui.Components.qd0(context2);
        this.n = qd0Var3;
        qd0Var3.setBackground(null);
        this.n.getEditText().setInputType(49152);
        this.n.getEditText().setImeOptions(5);
        this.n.setHint("Notes");
        this.e.addView(this.n, org.telegram.ui.Components.kb1.h(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.n.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView22, int i142, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i142 == 5) {
                            qj0 qj0Var = this.b;
                            qj0Var.N.requestFocus();
                            oj0 oj0Var22 = qj0Var.N;
                            oj0Var22.setSelection(oj0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        qj0 qj0Var2 = this.b;
                        if (i142 != 5) {
                            qj0Var2.getClass();
                            break;
                        } else {
                            qj0Var2.d.requestFocus();
                            qj0Var2.d.getEditText().setSelection(qj0Var2.d.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            qj0 qj0Var3 = this.b;
                            qj0Var3.N.requestFocus();
                            oj0 oj0Var222 = qj0Var3.N;
                            oj0Var222.setSelection(oj0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            qj0 qj0Var4 = this.b;
                            qj0Var4.P.requestFocus();
                            oj0 oj0Var3 = qj0Var4.P;
                            oj0Var3.setSelection(oj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        qj0 qj0Var5 = this.b;
                        if (i142 != 5) {
                            qj0Var5.getClass();
                            break;
                        } else {
                            qj0Var5.Y.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        y(false);
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                lt ltVar2 = new lt();
                ltVar2.a = split[2];
                ltVar2.c = split[0];
                ltVar2.d = split[1];
                this.v.add(0, ltVar2);
                List list = (List) this.w.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.w;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(ltVar2);
                if (split.length > 3) {
                    this.x.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.v, Comparator$-CC.comparing(new k2.g(8)));
        if (TextUtils.isEmpty(this.H)) {
            try {
                telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso().toUpperCase();
                if (str != null && (str2 = (String) hashMap.get(str)) != null) {
                    i10 = 0;
                    while (true) {
                        if (i10 < this.v.size()) {
                            ltVar = null;
                            break;
                        } else {
                            if (Objects.equals(((lt) this.v.get(i10)).a, str2)) {
                                ltVar = (lt) this.v.get(i10);
                                break;
                            }
                            i10++;
                        }
                    }
                    if (ltVar != null) {
                        this.N.setText(ltVar.c);
                    }
                }
                if (this.N.length() == 0) {
                    this.P.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i10 = 0;
                while (true) {
                    if (i10 < this.v.size()) {
                    }
                    i10++;
                }
                if (ltVar != null) {
                }
            }
            if (this.N.length() == 0) {
            }
        } else {
            TLRPC.User currentUser = this.L.getUserConfig().getCurrentUser();
            if (this.H.startsWith("+")) {
                this.N.setText(this.H.substring(1));
            } else if (this.I || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.N.setText(this.H);
            } else {
                String str4 = currentUser.phone;
                while (true) {
                    if (i12 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i12);
                    if (((List) this.w.get(substring)) != null) {
                        this.N.setText(substring);
                        break;
                    }
                    i12--;
                }
                this.P.setText(this.H);
            }
            this.H = null;
        }
        this.Y = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.W = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.W.setGravity(17);
        this.W.setLines(1);
        this.W.setSingleLine(true);
        this.W.setText(LocaleController.getString(R.string.CreateContact));
        TextView textView4 = this.W;
        org.telegram.ui.ActionBar.r2 r2Var2 = this.L;
        int i20 = org.telegram.ui.ActionBar.y6.Sh;
        textView4.setTextColor(r2Var2.getThemedColor(i20));
        this.W.setTextSize(1, 15.0f);
        this.W.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.kb1.c(this.Y, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.X = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.X.setProgressColor(this.L.getThemedColor(i20));
        this.Y.addView(this.W, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.Y.addView(this.X, org.telegram.ui.Components.kb1.i(40, 40, 17));
        this.b.addView(this.Y, org.telegram.ui.Components.kb1.x(-1, 48, 0, 0, 8, 0, 4));
        AndroidUtilities.updateViewVisibilityAnimated(this.W, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.X, false, 1.0f, false);
        this.Y.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{24.0f}, this.L.getThemedColor(org.telegram.ui.ActionBar.y6.Oh)));
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        qj0 qj0Var = this.b;
                        qj0Var.dismiss();
                        y9.f0(LaunchActivity.I1, 1, new pj0(qj0Var));
                        break;
                    case 1:
                        qj0 qj0Var2 = this.b;
                        org.telegram.ui.ActionBar.r2 r2Var22 = qj0Var2.L;
                        if (!qj0Var2.G && r2Var22 != null && r2Var22.getParentActivity() != null) {
                            if (qj0Var2.c.getEditText().length() != 0) {
                                if (qj0Var2.N.length() != 0) {
                                    if (qj0Var2.P.length() != 0) {
                                        if (!qj0Var2.R.a.q) {
                                            qj0Var2.s();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.ye0.c(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new t3(qj0Var2, 13));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) r2Var22.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(qj0Var2.P);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) r2Var22.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(qj0Var2.N);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) r2Var22.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(qj0Var2.c);
                                break;
                            }
                        }
                        break;
                    case 2:
                        qt qtVar = new qt(null, true);
                        qj0 qj0Var3 = this.b;
                        qtVar.r = new f(qj0Var3, 27);
                        qj0Var3.L.showAsSheet(qtVar);
                        break;
                    default:
                        qj0 qj0Var4 = this.b;
                        qj0Var4.R.a(!r0.a.q, true);
                        qj0Var4.y(true);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f7.V(this.Z, org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.k6, this.O, null);
        setCustomView(scrollView);
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
    }

    public static /* synthetic */ void m(qj0 qj0Var, TLObject tLObject, org.telegram.ui.Components.oy oyVar) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(qj0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(qj0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(qj0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                oyVar.run(user);
            }
        }
        user = null;
        oyVar.run(user);
    }

    public static void n(qj0 qj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.r2 r2Var = qj0Var.L;
        qj0Var.G = false;
        if (tL_contacts_importedContacts == null) {
            AndroidUtilities.updateViewVisibilityAnimated(qj0Var.W, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(qj0Var.X, false, 0.5f, true);
            org.telegram.ui.Components.g5.e0(qj0Var.currentAccount, tL_error, r2Var, tL_contacts_importContacts, new Object[0]);
        } else if (!tL_contacts_importedContacts.users.isEmpty()) {
            MessagesController.getInstance(qj0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
            MessagesController.getInstance(qj0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, qj0Var.L, 1, false);
            qj0Var.dismiss();
        } else {
            if (r2Var.getParentActivity() == null) {
                return;
            }
            AndroidUtilities.updateViewVisibilityAnimated(qj0Var.W, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(qj0Var.X, false, 0.5f, true);
            org.telegram.ui.Components.g5.u(r2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
        }
    }

    public static /* synthetic */ void o(qj0 qj0Var, String str, TLRPC.User user) {
        if (user == null) {
            qj0Var.Q.setImageDrawable(null);
            qj0Var.s.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new kb0(20, qj0Var, str)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else {
            Drawable mutate = qj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
            org.telegram.ui.ActionBar.f7.y(qj0Var.Q, mutate, org.telegram.ui.ActionBar.y6.v6, qj0Var.resourcesProvider, PorterDuff.Mode.SRC_IN);
            qj0Var.Q.setImageDrawable(mutate);
            if (user.contact) {
                qj0Var.s.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new kb0(21, qj0Var, user)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            } else {
                qj0Var.s.setText("This phone number is on Telegram.");
            }
        }
        qj0Var.x(false);
    }

    public static void r(qj0 qj0Var) {
        String replaceAll = (qj0Var.N.getText().toString() + qj0Var.P.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) qj0Var.w.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) qj0Var.x.get(substring);
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
            if (TextUtils.equals(qj0Var.a0, replaceAll)) {
                return;
            }
            qj0Var.a0 = replaceAll;
            qj0Var.A(replaceAll);
            return;
        }
        if (TextUtils.isEmpty(qj0Var.a0)) {
            return;
        }
        qj0Var.a0 = null;
        qj0Var.A(null);
    }

    public static String t(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
            FileLog.e(e);
        }
        if (!str.startsWith("+")) {
            if (user == null || TextUtils.isEmpty(user.phone)) {
                return "+".concat(str);
            }
            String str2 = user.phone;
            for (int i10 = 4; i10 >= 1; i10--) {
                String substring = str2.substring(0, i10);
                if (((String) hashMap.get(substring)) != null) {
                    return a1.g.p("+", substring, str);
                }
            }
        }
        return str;
    }

    public final void A(String str) {
        if (this.b0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.b0, true);
            this.b0 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.wh.q(this.Q.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.ds.h, 420L);
            this.s.setText("");
            x(true);
            return;
        }
        org.telegram.messenger.wh.q(this.Q.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.ds.h, 420L);
        this.Q.setImageDrawable(new org.telegram.ui.Components.gq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.y6.m5)));
        this.s.setText("");
        x(true);
        org.telegram.ui.Components.oy oyVar = new org.telegram.ui.Components.oy(16, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(kf.b.d(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = kf.b.d(str, false);
            this.b0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new l10(14, this, oyVar));
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                oyVar.run(user);
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new ne0(this, tL_contact, oyVar, 9));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new ij0(this, 0), 50L);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.N, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.N, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.P, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.P, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.P, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        return arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.F) {
            this.F = false;
            return;
        }
        this.y = true;
        this.N.setText(((lt) this.v.get(i10)).c);
        this.y = false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            RadialProgressView radialProgressView = this.X;
            org.telegram.ui.ActionBar.r2 r2Var = this.L;
            if (radialProgressView != null && r2Var != null) {
                radialProgressView.setProgressColor(r2Var.getThemedColor(org.telegram.ui.ActionBar.y6.Sh));
            }
            if (this.Y != null && r2Var != null && ((themedColor = r2Var.getThemedColor(org.telegram.ui.ActionBar.y6.Oh)) != this.c0 || this.d0 != org.telegram.ui.ActionBar.y6.I.q())) {
                this.d0 = org.telegram.ui.ActionBar.y6.I.q();
                this.c0 = themedColor;
                org.telegram.ui.ActionBar.y6.E1(this.Y.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.y6.E1(this.Y.getBackground(), org.telegram.ui.ActionBar.o6.b(themedColor), true);
                this.Y.invalidate();
            }
            ImageView imageView = this.Q;
            if (imageView == null || !(imageView.getDrawable() instanceof org.telegram.ui.Components.gq)) {
                return;
            }
            ((org.telegram.ui.Components.gq) this.Q.getDrawable()).b(getThemedColor(org.telegram.ui.ActionBar.y6.m5));
            this.Q.invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void s() {
        this.G = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.W, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.X, true, 0.5f, true);
        String str = "+" + this.N.getText().toString() + this.P.getText().toString();
        String obj = this.c.getEditText().getText().toString();
        String obj2 = this.d.getEditText().getText().toString();
        String obj3 = this.n.getVisibility() == 0 ? this.n.getEditText().getText().toString() : "";
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new ea(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.M);
        if (this.R.a.q) {
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
            } catch (OperationApplicationException | RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        this.c.getEditText().requestFocus();
        this.c.getEditText().setSelection(this.c.getEditText().length());
        AndroidUtilities.runOnUIThread(new ij0(this, 1), 50L);
    }

    public final void u(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.V.animate();
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
            animate.setInterpolator(dsVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.Z.animate().setInterpolator(dsVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.N.animate().setInterpolator(dsVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.V.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.Z.animate();
        org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.f;
        animate2.setInterpolator(dsVar2).translationX(0.0f).setDuration(150L);
        this.N.animate().setInterpolator(dsVar2).translationX(0.0f).setDuration(150L);
        this.V.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r7 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(String str, lt ltVar) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag);
        }
        int i11 = 0;
        u(Emoji.replaceEmoji(spannableStringBuilder, this.V.getPaint().getFontMetricsInt(), false));
        this.U = -1;
        String replace = this.P.getText() != null ? this.P.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.x;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.U != -1) {
                int selectionStart = this.P.getSelectionStart();
                int selectionEnd = this.P.getSelectionEnd();
                this.P.setHintText((String) null);
                this.P.setSelection(selectionStart, selectionEnd);
                this.U = -1;
                return;
            }
            return;
        }
        List list = (List) hashMap.get(str);
        if (!replace.isEmpty()) {
            i10 = 0;
            while (i10 < list.size()) {
                if (replace.startsWith(((String) list.get(i10)).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -1;
        if (i10 == -1) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                String str2 = (String) list.get(i12);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i10 = i12;
                    break;
                }
            }
        }
        i11 = i10;
        if (this.U != i11) {
            String str3 = (String) ((List) hashMap.get(str)).get(i11);
            int selectionStart2 = this.P.getSelectionStart();
            int selectionEnd2 = this.P.getSelectionEnd();
            this.P.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.P.setSelection(selectionStart2, selectionEnd2);
            this.U = i11;
        }
    }

    public final void w(String str, boolean z10) {
        this.H = str;
        this.I = z10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (this.H.startsWith("+")) {
            this.N.setText(this.H.substring(1));
        } else if (this.I || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
            this.N.setText(this.H);
        } else {
            String str2 = currentUser.phone;
            int i10 = 4;
            while (true) {
                if (i10 >= 1) {
                    List list = (List) this.w.get(str2.substring(0, i10));
                    if (list == null || list.size() <= 0) {
                        i10--;
                    } else {
                        String str3 = ((lt) list.get(0)).c;
                        this.N.setText(str3);
                        if (str3.endsWith("0") && this.H.startsWith("0")) {
                            this.H = this.H.substring(1);
                        }
                    }
                } else {
                    Context context = ApplicationLoader.applicationContext;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.N.setText(upperCase);
                    if (upperCase.endsWith("0") && this.H.startsWith("0")) {
                        this.H = this.H.substring(1);
                    }
                }
            }
            this.P.setText(this.H);
        }
        this.H = null;
    }

    public final void x(boolean z10) {
        ViewPropertyAnimator translationY = this.T.animate().translationY(z10 ? -AndroidUtilities.dp(21.33f) : 0.0f);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        org.telegram.messenger.wh.q(translationY, dsVar, 420L);
        this.e.animate().translationY(z10 ? -AndroidUtilities.dp(10.665f) : 0.0f).setInterpolator(dsVar).setDuration(420L).start();
    }

    public final void y(boolean z10) {
        boolean z11 = this.R.a.q;
        final boolean z12 = !z11;
        if (!z10) {
            this.h.animate().cancel();
            this.h.setVisibility(!z11 ? 0 : 4);
            this.h.setAlpha(!z11 ? 1.0f : 0.0f);
            this.f.animate().cancel();
            this.f.setVisibility(!z11 ? 0 : 8);
            this.f.setAlpha(!z11 ? 1.0f : 0.0f);
            this.n.animate().cancel();
            this.n.setVisibility(z11 ? 0 : 4);
            this.n.setAlpha(z11 ? 1.0f : 0.0f);
            return;
        }
        this.h.setVisibility(0);
        ViewPropertyAnimator alpha = this.h.animate().alpha(!z11 ? 1.0f : 0.0f);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        final int i10 = 0;
        alpha.setInterpolator(dsVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.lj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z13 = z12;
                        qj0 qj0Var = this.b;
                        if (!z13) {
                            qj0Var.h.setVisibility(4);
                            break;
                        } else {
                            qj0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        qj0 qj0Var2 = this.b;
                        if (!z14) {
                            qj0Var2.f.setVisibility(4);
                            break;
                        } else {
                            qj0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        qj0 qj0Var3 = this.b;
                        if (!z15) {
                            qj0Var3.getClass();
                            break;
                        } else {
                            qj0Var3.n.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.f.setVisibility(0);
        final int i11 = 1;
        this.f.animate().alpha(!z11 ? 1.0f : 0.0f).setInterpolator(dsVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.lj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z13 = z12;
                        qj0 qj0Var = this.b;
                        if (!z13) {
                            qj0Var.h.setVisibility(4);
                            break;
                        } else {
                            qj0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        qj0 qj0Var2 = this.b;
                        if (!z14) {
                            qj0Var2.f.setVisibility(4);
                            break;
                        } else {
                            qj0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        qj0 qj0Var3 = this.b;
                        if (!z15) {
                            qj0Var3.getClass();
                            break;
                        } else {
                            qj0Var3.n.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.n.setVisibility(0);
        final int i12 = 2;
        this.n.animate().alpha(z11 ? 1.0f : 0.0f).setInterpolator(dsVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.lj0
            public final /* synthetic */ qj0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        boolean z13 = z12;
                        qj0 qj0Var = this.b;
                        if (!z13) {
                            qj0Var.h.setVisibility(4);
                            break;
                        } else {
                            qj0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z14 = z12;
                        qj0 qj0Var2 = this.b;
                        if (!z14) {
                            qj0Var2.f.setVisibility(4);
                            break;
                        } else {
                            qj0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z15 = z12;
                        qj0 qj0Var3 = this.b;
                        if (!z15) {
                            qj0Var3.getClass();
                            break;
                        } else {
                            qj0Var3.n.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
