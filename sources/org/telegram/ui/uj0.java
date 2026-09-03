package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.Build;
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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uj0 extends org.telegram.ui.ActionBar.g3 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int a0 = 0;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public String F;
    public boolean G;
    public String H;
    public String I;
    public final org.telegram.ui.ActionBar.p2 J;
    public final int K;
    public final sj0 L;
    public final View M;
    public final sj0 N;
    public final ImageView O;
    public final org.telegram.ui.Components.kp P;
    public final TextView Q;
    public final LinearLayout R;
    public int S;
    public final rj0 T;
    public final TextView U;
    public final RadialProgressView V;
    public final FrameLayout W;
    public final TextView X;
    public String Y;
    public int Z;
    public final LinearLayout b;
    public final org.telegram.ui.Components.qq c;
    public final org.telegram.ui.Components.ad0 d;
    public final org.telegram.ui.Components.ad0 e;
    public final FrameLayout f;
    public final View h;
    public final ph.d n;
    public final org.telegram.ui.Components.ad0 r;
    public final org.telegram.ui.Components.bd0 s;
    public final org.telegram.ui.Components.f90 v;
    public final ArrayList w;
    public final HashMap x;
    public final HashMap y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0691 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uj0(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, true);
        String str;
        String str2;
        int i10;
        ut utVar;
        TelephonyManager telephonyManager;
        final int i11 = 1;
        this.w = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.Z = -1;
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.K = ConnectionsManager.generateClassGuid();
        this.J = p2Var;
        Context context2 = getContext();
        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(context2, 1);
        this.c = qqVar;
        final int i12 = 4;
        qqVar.setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.b = linearLayout;
        final int i13 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.b.setOrientation(1);
        scrollView.addView(this.b, k7.b6.x(-1, -2, 51));
        this.b.setOnTouchListener(new oh.d(27));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.b.addView(frameLayout, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.ad0 ad0Var = new org.telegram.ui.Components.ad0(context2);
        this.d = ad0Var;
        ad0Var.getEditText().setInputType(49152);
        this.d.getEditText().setImeOptions(5);
        this.d.setHint(LocaleController.getString(R.string.FirstName));
        if (this.H != null) {
            this.d.getEditText().setText(this.H);
            this.H = null;
        }
        frameLayout.addView(this.d, k7.b6.d(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.pj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i14 == 5) {
                            uj0 uj0Var = this.b;
                            uj0Var.L.requestFocus();
                            sj0 sj0Var = uj0Var.L;
                            sj0Var.setSelection(sj0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        uj0 uj0Var2 = this.b;
                        if (i14 != 5) {
                            uj0Var2.getClass();
                            break;
                        } else {
                            uj0Var2.e.requestFocus();
                            uj0Var2.e.getEditText().setSelection(uj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i14 == 5) {
                            uj0 uj0Var3 = this.b;
                            uj0Var3.L.requestFocus();
                            sj0 sj0Var2 = uj0Var3.L;
                            sj0Var2.setSelection(sj0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i14 == 5) {
                            uj0 uj0Var4 = this.b;
                            uj0Var4.N.requestFocus();
                            sj0 sj0Var3 = uj0Var4.N;
                            sj0Var3.setSelection(sj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        uj0 uj0Var5 = this.b;
                        if (i14 != 5) {
                            uj0Var5.getClass();
                            break;
                        } else {
                            uj0Var5.W.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        org.telegram.ui.Components.ad0 ad0Var2 = new org.telegram.ui.Components.ad0(context2);
        this.e = ad0Var2;
        ad0Var2.setBackground(null);
        this.e.getEditText().setInputType(49152);
        this.e.getEditText().setImeOptions(5);
        this.e.setHint(LocaleController.getString(R.string.LastName));
        if (this.I != null) {
            this.e.getEditText().setText(this.I);
            this.I = null;
        }
        frameLayout.addView(this.e, k7.b6.d(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final int i14 = 2;
        this.e.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.pj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i142, KeyEvent keyEvent) {
                switch (i14) {
                    case 0:
                        if (i142 == 5) {
                            uj0 uj0Var = this.b;
                            uj0Var.L.requestFocus();
                            sj0 sj0Var = uj0Var.L;
                            sj0Var.setSelection(sj0Var.length());
                            break;
                        }
                        break;
                    case 1:
                        uj0 uj0Var2 = this.b;
                        if (i142 != 5) {
                            uj0Var2.getClass();
                            break;
                        } else {
                            uj0Var2.e.requestFocus();
                            uj0Var2.e.getEditText().setSelection(uj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            uj0 uj0Var3 = this.b;
                            uj0Var3.L.requestFocus();
                            sj0 sj0Var2 = uj0Var3.L;
                            sj0Var2.setSelection(sj0Var2.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            uj0 uj0Var4 = this.b;
                            uj0Var4.N.requestFocus();
                            sj0 sj0Var3 = uj0Var4.N;
                            sj0Var3.setSelection(sj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        uj0 uj0Var5 = this.b;
                        if (i142 != 5) {
                            uj0Var5.getClass();
                            break;
                        } else {
                            uj0Var5.W.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0(context2, null);
        this.s = bd0Var;
        bd0Var.addView(linearLayout2, k7.b6.d(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.s.setText(LocaleController.getString(R.string.PhoneNumber));
        this.b.addView(this.s, k7.b6.k(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(context2, null);
        this.v = f90Var;
        f90Var.setTextSize(1, 12.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        this.v.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.gc));
        this.b.addView(this.v, k7.b6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        rj0 rj0Var = new rj0(context2);
        this.T = rj0Var;
        rj0Var.setTextSize(1, 16.0f);
        this.T.setFocusable(false);
        this.T.setGravity(17);
        final int i15 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        uj0 uj0Var = this.b;
                        uj0Var.dismiss();
                        x9.e0(LaunchActivity.D1, 1, new tj0(uj0Var));
                        break;
                    case 1:
                        uj0 uj0Var2 = this.b;
                        org.telegram.ui.ActionBar.p2 p2Var2 = uj0Var2.J;
                        if (!uj0Var2.E && p2Var2 != null && p2Var2.getParentActivity() != null) {
                            if (uj0Var2.d.getEditText().length() != 0) {
                                if (uj0Var2.L.length() != 0) {
                                    if (uj0Var2.N.length() != 0) {
                                        if (!uj0Var2.P.a.q) {
                                            uj0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.he0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new y3(uj0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) p2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(uj0Var2.N);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) p2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(uj0Var2.L);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) p2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(uj0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        au auVar = new au(null, true);
                        uj0 uj0Var3 = this.b;
                        auVar.r = new h(uj0Var3, 27);
                        uj0Var3.J.showAsSheet(auVar);
                        break;
                    default:
                        uj0 uj0Var4 = this.b;
                        uj0Var4.P.a(!r0.a.q, true);
                        uj0Var4.x(true);
                        break;
                }
            }
        });
        int dp = AndroidUtilities.dp(6.0f);
        int i16 = org.telegram.ui.ActionBar.j6.i6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, w02, w02));
        frameLayout2.addView(this.T, k7.b6.e(-1, -2, 16));
        linearLayout2.addView(frameLayout2, k7.b6.n(42, -1));
        TextView textView = new TextView(context2);
        this.X = textView;
        textView.setText("+");
        this.X.setTextSize(1, 16.0f);
        this.X.setFocusable(false);
        linearLayout2.addView(this.X, k7.b6.n(-2, -2));
        sj0 sj0Var = new sj0(this, context2, 0);
        this.L = sj0Var;
        int i17 = org.telegram.ui.ActionBar.j6.G6;
        sj0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.L.setInputType(3);
        this.L.setCursorSize(AndroidUtilities.dp(20.0f));
        this.L.setCursorWidth(1.5f);
        this.L.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        this.L.setTextSize(1, 16.0f);
        this.L.setMaxLines(1);
        this.L.setGravity(19);
        this.L.setImeOptions(268435461);
        this.L.setBackground(null);
        this.L.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(this.L, k7.b6.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.L.addTextChangedListener(new p0(this, 11));
        final int i18 = 3;
        this.L.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.pj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i142, KeyEvent keyEvent) {
                switch (i18) {
                    case 0:
                        if (i142 == 5) {
                            uj0 uj0Var = this.b;
                            uj0Var.L.requestFocus();
                            sj0 sj0Var2 = uj0Var.L;
                            sj0Var2.setSelection(sj0Var2.length());
                            break;
                        }
                        break;
                    case 1:
                        uj0 uj0Var2 = this.b;
                        if (i142 != 5) {
                            uj0Var2.getClass();
                            break;
                        } else {
                            uj0Var2.e.requestFocus();
                            uj0Var2.e.getEditText().setSelection(uj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            uj0 uj0Var3 = this.b;
                            uj0Var3.L.requestFocus();
                            sj0 sj0Var22 = uj0Var3.L;
                            sj0Var22.setSelection(sj0Var22.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            uj0 uj0Var4 = this.b;
                            uj0Var4.N.requestFocus();
                            sj0 sj0Var3 = uj0Var4.N;
                            sj0Var3.setSelection(sj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        uj0 uj0Var5 = this.b;
                        if (i142 != 5) {
                            uj0Var5.getClass();
                            break;
                        } else {
                            uj0Var5.W.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        this.M = new View(context2);
        LinearLayout.LayoutParams k10 = k7.b6.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(this.M, k10);
        sj0 sj0Var2 = new sj0(this, context2, 1);
        this.N = sj0Var2;
        sj0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.N.setInputType(3);
        this.N.setPadding(0, 0, 0, 0);
        this.N.setCursorSize(AndroidUtilities.dp(20.0f));
        this.N.setCursorWidth(1.5f);
        this.N.setTextSize(1, 16.0f);
        this.N.setMaxLines(1);
        this.N.setGravity(19);
        this.N.setImeOptions(268435461);
        this.N.setBackground(null);
        this.N.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(this.N, k7.b6.n(-1, 36));
        this.N.addTextChangedListener(new zr(this, 2));
        this.N.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.pj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i142, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i142 == 5) {
                            uj0 uj0Var = this.b;
                            uj0Var.L.requestFocus();
                            sj0 sj0Var22 = uj0Var.L;
                            sj0Var22.setSelection(sj0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        uj0 uj0Var2 = this.b;
                        if (i142 != 5) {
                            uj0Var2.getClass();
                            break;
                        } else {
                            uj0Var2.e.requestFocus();
                            uj0Var2.e.getEditText().setSelection(uj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            uj0 uj0Var3 = this.b;
                            uj0Var3.L.requestFocus();
                            sj0 sj0Var222 = uj0Var3.L;
                            sj0Var222.setSelection(sj0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            uj0 uj0Var4 = this.b;
                            uj0Var4.N.requestFocus();
                            sj0 sj0Var3 = uj0Var4.N;
                            sj0Var3.setSelection(sj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        uj0 uj0Var5 = this.b;
                        if (i142 != 5) {
                            uj0Var5.getClass();
                            break;
                        } else {
                            uj0Var5.W.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        ImageView imageView = new ImageView(context2);
        this.O = imageView;
        imageView.setScaleX(0.5f);
        this.O.setScaleY(0.5f);
        this.O.setAlpha(0.0f);
        this.s.addView(this.O, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(context2, 21, this.resourcesProvider);
        this.P = kpVar;
        kpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        this.P.setDrawUnchecked(true);
        this.P.a(false, false);
        this.P.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.Q = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, this.resourcesProvider));
        this.Q.setTextSize(1, 14.0f);
        this.Q.setText(LocaleController.getString(R.string.AddContactSync));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.R = linearLayout3;
        linearLayout3.setOrientation(0);
        this.R.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        this.R.addView(this.P, k7.b6.t(21, 21, 16, 0, 0, 9, 0));
        this.R.addView(this.Q, k7.b6.q(-2, -2, 16));
        final int i19 = 3;
        this.R.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        uj0 uj0Var = this.b;
                        uj0Var.dismiss();
                        x9.e0(LaunchActivity.D1, 1, new tj0(uj0Var));
                        break;
                    case 1:
                        uj0 uj0Var2 = this.b;
                        org.telegram.ui.ActionBar.p2 p2Var2 = uj0Var2.J;
                        if (!uj0Var2.E && p2Var2 != null && p2Var2.getParentActivity() != null) {
                            if (uj0Var2.d.getEditText().length() != 0) {
                                if (uj0Var2.L.length() != 0) {
                                    if (uj0Var2.N.length() != 0) {
                                        if (!uj0Var2.P.a.q) {
                                            uj0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.he0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new y3(uj0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) p2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(uj0Var2.N);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) p2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(uj0Var2.L);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) p2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(uj0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        au auVar = new au(null, true);
                        uj0 uj0Var3 = this.b;
                        auVar.r = new h(uj0Var3, 27);
                        uj0Var3.J.showAsSheet(auVar);
                        break;
                    default:
                        uj0 uj0Var4 = this.b;
                        uj0Var4.P.a(!r0.a.q, true);
                        uj0Var4.x(true);
                        break;
                }
            }
        });
        this.R.setTranslationY(AndroidUtilities.dp(-21.33f));
        this.R.setPivotX(0.0f);
        k7.d6.b(this.R, 0.0125f, 1.2f);
        this.R.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i16, this.resourcesProvider), 6, 6));
        this.b.addView(this.R, k7.b6.k(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f = frameLayout3;
        frameLayout3.setTranslationY(AndroidUtilities.dp(-10.665f));
        this.b.addView(this.f, k7.b6.k(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.h = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourcesProvider));
        this.f.addView(this.h, k7.b6.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        ph.d dVar = new ph.d(context2, this.resourcesProvider, false);
        this.n = dVar;
        dVar.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AddContactQr));
        this.n.g(spannableStringBuilder, false, true);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        uj0 uj0Var = this.b;
                        uj0Var.dismiss();
                        x9.e0(LaunchActivity.D1, 1, new tj0(uj0Var));
                        break;
                    case 1:
                        uj0 uj0Var2 = this.b;
                        org.telegram.ui.ActionBar.p2 p2Var2 = uj0Var2.J;
                        if (!uj0Var2.E && p2Var2 != null && p2Var2.getParentActivity() != null) {
                            if (uj0Var2.d.getEditText().length() != 0) {
                                if (uj0Var2.L.length() != 0) {
                                    if (uj0Var2.N.length() != 0) {
                                        if (!uj0Var2.P.a.q) {
                                            uj0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.he0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new y3(uj0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) p2Var2.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(uj0Var2.N);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) p2Var2.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(uj0Var2.L);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) p2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(uj0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        au auVar = new au(null, true);
                        uj0 uj0Var3 = this.b;
                        auVar.r = new h(uj0Var3, 27);
                        uj0Var3.J.showAsSheet(auVar);
                        break;
                    default:
                        uj0 uj0Var4 = this.b;
                        uj0Var4.P.a(!r0.a.q, true);
                        uj0Var4.x(true);
                        break;
                }
            }
        });
        this.f.addView(this.n, k7.b6.d(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ad0 ad0Var3 = new org.telegram.ui.Components.ad0(context2);
        this.r = ad0Var3;
        ad0Var3.setBackground(null);
        this.r.getEditText().setInputType(49152);
        this.r.getEditText().setImeOptions(5);
        this.r.setHint("Notes");
        this.f.addView(this.r, k7.b6.d(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.r.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.pj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView22, int i142, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i142 == 5) {
                            uj0 uj0Var = this.b;
                            uj0Var.L.requestFocus();
                            sj0 sj0Var22 = uj0Var.L;
                            sj0Var22.setSelection(sj0Var22.length());
                            break;
                        }
                        break;
                    case 1:
                        uj0 uj0Var2 = this.b;
                        if (i142 != 5) {
                            uj0Var2.getClass();
                            break;
                        } else {
                            uj0Var2.e.requestFocus();
                            uj0Var2.e.getEditText().setSelection(uj0Var2.e.getEditText().length());
                            break;
                        }
                    case 2:
                        if (i142 == 5) {
                            uj0 uj0Var3 = this.b;
                            uj0Var3.L.requestFocus();
                            sj0 sj0Var222 = uj0Var3.L;
                            sj0Var222.setSelection(sj0Var222.length());
                            break;
                        }
                        break;
                    case 3:
                        if (i142 == 5) {
                            uj0 uj0Var4 = this.b;
                            uj0Var4.N.requestFocus();
                            sj0 sj0Var3 = uj0Var4.N;
                            sj0Var3.setSelection(sj0Var3.length());
                            break;
                        }
                        break;
                    default:
                        uj0 uj0Var5 = this.b;
                        if (i142 != 5) {
                            uj0Var5.getClass();
                            break;
                        } else {
                            uj0Var5.W.callOnClick();
                            break;
                        }
                }
                return false;
            }
        });
        x(false);
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                ut utVar2 = new ut();
                utVar2.a = split[2];
                utVar2.c = split[0];
                utVar2.d = split[1];
                this.w.add(0, utVar2);
                List list = (List) this.x.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.x;
                    String str3 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str3, arrayList);
                    list = arrayList;
                }
                list.add(utVar2);
                if (split.length > 3) {
                    this.y.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.w, Comparator$-CC.comparing(new p8(7)));
        if (TextUtils.isEmpty(this.F)) {
            try {
                telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso().toUpperCase();
                if (str != null && (str2 = (String) hashMap.get(str)) != null) {
                    i10 = 0;
                    while (true) {
                        if (i10 < this.w.size()) {
                            utVar = null;
                            break;
                        } else {
                            if (Objects.equals(((ut) this.w.get(i10)).a, str2)) {
                                utVar = (ut) this.w.get(i10);
                                break;
                            }
                            i10++;
                        }
                    }
                    if (utVar != null) {
                        this.L.setText(utVar.c);
                    }
                }
                if (this.L.length() == 0) {
                    this.N.setHintText((String) null);
                }
            }
            str = null;
            if (str != null) {
                i10 = 0;
                while (true) {
                    if (i10 < this.w.size()) {
                    }
                    i10++;
                }
                if (utVar != null) {
                }
            }
            if (this.L.length() == 0) {
            }
        } else {
            TLRPC.User currentUser = this.J.getUserConfig().getCurrentUser();
            if (this.F.startsWith("+")) {
                this.L.setText(this.F.substring(1));
            } else if (this.G || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.L.setText(this.F);
            } else {
                String str4 = currentUser.phone;
                while (true) {
                    if (i12 < 1) {
                        break;
                    }
                    String substring = str4.substring(0, i12);
                    if (((List) this.x.get(substring)) != null) {
                        this.L.setText(substring);
                        break;
                    }
                    i12--;
                }
                this.N.setText(this.F);
            }
            this.F = null;
        }
        this.W = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.U = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.U.setGravity(17);
        this.U.setLines(1);
        this.U.setSingleLine(true);
        this.U.setText(LocaleController.getString(R.string.CreateContact));
        TextView textView4 = this.U;
        org.telegram.ui.ActionBar.p2 p2Var2 = this.J;
        int i20 = org.telegram.ui.ActionBar.j6.Sh;
        textView4.setTextColor(p2Var2.getThemedColor(i20));
        this.U.setTextSize(1, 15.0f);
        this.U.setTypeface(AndroidUtilities.bold());
        k7.d6.b(this.W, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.V = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.V.setProgressColor(this.J.getThemedColor(i20));
        this.W.addView(this.U, k7.b6.c(-1.0f, -1));
        this.W.addView(this.V, k7.b6.e(40, 40, 17));
        this.b.addView(this.W, k7.b6.t(-1, 48, 0, 0, 8, 0, 4));
        AndroidUtilities.updateViewVisibilityAnimated(this.U, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.V, false, 1.0f, false);
        this.W.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, this.J.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
        this.W.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        uj0 uj0Var = this.b;
                        uj0Var.dismiss();
                        x9.e0(LaunchActivity.D1, 1, new tj0(uj0Var));
                        break;
                    case 1:
                        uj0 uj0Var2 = this.b;
                        org.telegram.ui.ActionBar.p2 p2Var22 = uj0Var2.J;
                        if (!uj0Var2.E && p2Var22 != null && p2Var22.getParentActivity() != null) {
                            if (uj0Var2.d.getEditText().length() != 0) {
                                if (uj0Var2.L.length() != 0) {
                                    if (uj0Var2.N.length() != 0) {
                                        if (!uj0Var2.P.a.q) {
                                            uj0Var2.r();
                                            break;
                                        } else {
                                            org.telegram.ui.Components.he0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new y3(uj0Var2, 11));
                                            break;
                                        }
                                    } else {
                                        Vibrator vibrator = (Vibrator) p2Var22.getParentActivity().getSystemService("vibrator");
                                        if (vibrator != null) {
                                            vibrator.vibrate(200L);
                                        }
                                        AndroidUtilities.shakeView(uj0Var2.N);
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) p2Var22.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(uj0Var2.L);
                                    break;
                                }
                            } else {
                                Vibrator vibrator3 = (Vibrator) p2Var22.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(uj0Var2.d);
                                break;
                            }
                        }
                        break;
                    case 2:
                        au auVar = new au(null, true);
                        uj0 uj0Var3 = this.b;
                        auVar.r = new h(uj0Var3, 27);
                        uj0Var3.J.showAsSheet(auVar);
                        break;
                    default:
                        uj0 uj0Var4 = this.b;
                        uj0Var4.P.a(!r0.a.q, true);
                        uj0Var4.x(true);
                        break;
                }
            }
        });
        this.X.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.M.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k6, false));
        setCustomView(scrollView);
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
    }

    public static /* synthetic */ void m(uj0 uj0Var, TLObject tLObject, org.telegram.ui.Components.vk vkVar) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(uj0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(uj0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(uj0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                vkVar.run(user);
            }
        }
        user = null;
        vkVar.run(user);
    }

    public static void n(uj0 uj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.p2 p2Var = uj0Var.J;
        uj0Var.E = false;
        if (tL_contacts_importedContacts == null) {
            AndroidUtilities.updateViewVisibilityAnimated(uj0Var.U, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(uj0Var.V, false, 0.5f, true);
            org.telegram.ui.Components.z4.f0(uj0Var.currentAccount, tL_error, p2Var, tL_contacts_importContacts, new Object[0]);
        } else if (!tL_contacts_importedContacts.users.isEmpty()) {
            MessagesController.getInstance(uj0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
            MessagesController.getInstance(uj0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, uj0Var.J, 1, false);
            uj0Var.dismiss();
        } else {
            if (p2Var.getParentActivity() == null) {
                return;
            }
            AndroidUtilities.updateViewVisibilityAnimated(uj0Var.U, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(uj0Var.V, false, 0.5f, true);
            org.telegram.ui.Components.z4.v(p2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
        }
    }

    public static void q(uj0 uj0Var) {
        String replaceAll = (uj0Var.L.getText().toString() + uj0Var.N.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z4 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) uj0Var.x.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) uj0Var.y.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z4 = true;
                            break;
                        }
                    }
                }
            }
            if (z4) {
                break;
            }
        }
        if (z4) {
            if (TextUtils.equals(uj0Var.Y, replaceAll)) {
                return;
            }
            uj0Var.Y = replaceAll;
            uj0Var.y(replaceAll);
            return;
        }
        if (TextUtils.isEmpty(uj0Var.Y)) {
            return;
        }
        uj0Var.Y = null;
        uj0Var.y(null);
    }

    public static String s(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
                    return android.support.v4.media.a.o("+", substring, str);
                }
            }
        }
        return str;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new nj0(this, 0), 50L);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, TLObject.FLAG_23, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, TLObject.FLAG_23, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, TLObject.FLAG_23, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.E7));
        return arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.D) {
            this.D = false;
            return;
        }
        this.B = true;
        this.L.setText(((ut) this.w.get(i10)).c);
        this.B = false;
    }

    public final void r() {
        this.E = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.U, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.V, true, 0.5f, true);
        String str = "+" + this.L.getText().toString() + this.N.getText().toString();
        String obj = this.d.getEditText().getText().toString();
        String obj2 = this.e.getEditText().getText().toString();
        String obj3 = this.r.getVisibility() == 0 ? this.r.getEditText().getText().toString() : "";
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new da(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.K);
        if (this.P.a.q) {
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

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        this.d.getEditText().requestFocus();
        this.d.getEditText().setSelection(this.d.getEditText().length());
        AndroidUtilities.runOnUIThread(new nj0(this, 1), 50L);
    }

    public final void t(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.T.animate();
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f;
            animate.setInterpolator(mrVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.X.animate().setInterpolator(mrVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.L.animate().setInterpolator(mrVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.T.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.X.animate();
        org.telegram.ui.Components.mr mrVar2 = org.telegram.ui.Components.mr.f;
        animate2.setInterpolator(mrVar2).translationX(0.0f).setDuration(150L);
        this.L.animate().setInterpolator(mrVar2).translationX(0.0f).setDuration(150L);
        this.T.setText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r7 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(String str, ut utVar) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(utVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag);
        }
        int i11 = 0;
        t(Emoji.replaceEmoji(spannableStringBuilder, this.T.getPaint().getFontMetricsInt(), false));
        this.S = -1;
        String replace = this.N.getText() != null ? this.N.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.y;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.S != -1) {
                int selectionStart = this.N.getSelectionStart();
                int selectionEnd = this.N.getSelectionEnd();
                this.N.setHintText((String) null);
                this.N.setSelection(selectionStart, selectionEnd);
                this.S = -1;
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
        if (this.S != i11) {
            String str3 = (String) ((List) hashMap.get(str)).get(i11);
            int selectionStart2 = this.N.getSelectionStart();
            int selectionEnd2 = this.N.getSelectionEnd();
            this.N.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.N.setSelection(selectionStart2, selectionEnd2);
            this.S = i11;
        }
    }

    public final void v(String str, boolean z4) {
        this.F = str;
        this.G = z4;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (this.F.startsWith("+")) {
            this.L.setText(this.F.substring(1));
        } else if (this.G || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
            this.L.setText(this.F);
        } else {
            String str2 = currentUser.phone;
            int i10 = 4;
            while (true) {
                if (i10 >= 1) {
                    List list = (List) this.x.get(str2.substring(0, i10));
                    if (list == null || list.size() <= 0) {
                        i10--;
                    } else {
                        String str3 = ((ut) list.get(0)).c;
                        this.L.setText(str3);
                        if (str3.endsWith("0") && this.F.startsWith("0")) {
                            this.F = this.F.substring(1);
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 23) {
                    Context context = ApplicationLoader.applicationContext;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.L.setText(upperCase);
                    if (upperCase.endsWith("0") && this.F.startsWith("0")) {
                        this.F = this.F.substring(1);
                    }
                }
            }
            this.N.setText(this.F);
        }
        this.F = null;
    }

    public final void w(boolean z4) {
        ViewPropertyAnimator translationY = this.R.animate().translationY(z4 ? -AndroidUtilities.dp(21.33f) : 0.0f);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        b.p(translationY, mrVar, 420L);
        this.f.animate().translationY(z4 ? -AndroidUtilities.dp(10.665f) : 0.0f).setInterpolator(mrVar).setDuration(420L).start();
    }

    public final void x(boolean z4) {
        boolean z10 = this.P.a.q;
        final boolean z11 = !z10;
        if (!z4) {
            this.n.animate().cancel();
            this.n.setVisibility(!z10 ? 0 : 4);
            this.n.setAlpha(!z10 ? 1.0f : 0.0f);
            this.h.animate().cancel();
            this.h.setVisibility(!z10 ? 0 : 8);
            this.h.setAlpha(!z10 ? 1.0f : 0.0f);
            this.r.animate().cancel();
            this.r.setVisibility(z10 ? 0 : 4);
            this.r.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        this.n.setVisibility(0);
        ViewPropertyAnimator alpha = this.n.animate().alpha(!z10 ? 1.0f : 0.0f);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        final int i10 = 0;
        alpha.setInterpolator(mrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.qj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z12 = z11;
                        uj0 uj0Var = this.b;
                        if (!z12) {
                            uj0Var.n.setVisibility(4);
                            break;
                        } else {
                            uj0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z11;
                        uj0 uj0Var2 = this.b;
                        if (!z13) {
                            uj0Var2.h.setVisibility(4);
                            break;
                        } else {
                            uj0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z11;
                        uj0 uj0Var3 = this.b;
                        if (!z14) {
                            uj0Var3.getClass();
                            break;
                        } else {
                            uj0Var3.r.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.h.setVisibility(0);
        final int i11 = 1;
        this.h.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(mrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.qj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z12 = z11;
                        uj0 uj0Var = this.b;
                        if (!z12) {
                            uj0Var.n.setVisibility(4);
                            break;
                        } else {
                            uj0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z11;
                        uj0 uj0Var2 = this.b;
                        if (!z13) {
                            uj0Var2.h.setVisibility(4);
                            break;
                        } else {
                            uj0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z11;
                        uj0 uj0Var3 = this.b;
                        if (!z14) {
                            uj0Var3.getClass();
                            break;
                        } else {
                            uj0Var3.r.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
        this.r.setVisibility(0);
        final int i12 = 2;
        this.r.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(mrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: org.telegram.ui.qj0
            public final /* synthetic */ uj0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        boolean z12 = z11;
                        uj0 uj0Var = this.b;
                        if (!z12) {
                            uj0Var.n.setVisibility(4);
                            break;
                        } else {
                            uj0Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z11;
                        uj0 uj0Var2 = this.b;
                        if (!z13) {
                            uj0Var2.h.setVisibility(4);
                            break;
                        } else {
                            uj0Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z11;
                        uj0 uj0Var3 = this.b;
                        if (!z14) {
                            uj0Var3.getClass();
                            break;
                        } else {
                            uj0Var3.r.setVisibility(4);
                            break;
                        }
                }
            }
        }).start();
    }

    public final void y(String str) {
        if (this.Z >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Z, true);
            this.Z = -1;
        }
        if (TextUtils.isEmpty(str)) {
            b.p(this.O.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.mr.h, 420L);
            this.v.setText("");
            w(true);
            return;
        }
        b.p(this.O.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.mr.h, 420L);
        this.O.setImageDrawable(new org.telegram.ui.Components.qp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.j6.m5)));
        this.v.setText("");
        w(true);
        org.telegram.ui.Components.vk vkVar = new org.telegram.ui.Components.vk(18, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(se.b.d(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = se.b.d(str, false);
            this.Z = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new ub0(6, this, vkVar));
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                vkVar.run(user);
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new jf0((Object) this, (Object) tL_contact, (Object) vkVar, 6));
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
