package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Collection;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wd0 extends org.telegram.ui.Components.vt0 implements AdapterView.OnItemSelectedListener, org.telegram.messenger.cs {
    public final org.telegram.ui.Cells.c2 E;
    public int F;
    public ks G;
    public final ArrayList H;
    public final HashMap I;
    public final HashMap J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public Toast R;
    public String S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final ud0 a;
    public org.telegram.messenger.jk a0;
    public final ud0 b;
    public final /* synthetic */ xd0 b0;
    public final TextView c;
    public final org.telegram.ui.Components.vy0 d;
    public final org.telegram.ui.Components.gb0 e;
    public final org.telegram.ui.Components.gb0 f;
    public final TextView h;
    public final org.telegram.ui.Components.s70 n;
    public final View r;
    public final ImageView s;
    public int w;
    public int x;
    public final org.telegram.ui.Cells.c2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd0(xd0 xd0Var, Context context) {
        super(context);
        int i3;
        this.b0 = xd0Var;
        final int i10 = 0;
        this.F = 0;
        this.H = new ArrayList();
        this.I = new HashMap();
        this.J = new HashMap();
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = 0L;
        this.T = -1;
        this.V = false;
        this.W = false;
        final int i11 = 1;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.c = textView;
        k2.p1.t(textView, 1, 18.0f);
        final int i12 = 2;
        textView.setText(org.telegram.messenger.bd.M0(xd0Var.G == 2 ? 2131752538 : 2131742816, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, b8.mf.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new hb0(3, this, context));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, null);
        this.n = s70Var;
        s70Var.setText(org.telegram.messenger.bd.M0(xd0Var.G == 2 ? 2131752539 : 2131744917, null));
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(17);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(s70Var, b8.mf.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.vy0 vy0Var = new org.telegram.ui.Components.vy0(context);
        this.d = vy0Var;
        vy0Var.setFactory(new td0(context, i10));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ks.e);
        vy0Var.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(vy0Var, b8.mf.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, b8.mf.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, null);
        this.e = gb0Var;
        gb0Var.setText(org.telegram.messenger.bd.M0(2131751754, null));
        gb0Var.addView(linearLayout, b8.mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        gb0Var.setForceUseCenter(true);
        gb0Var.setFocusable(true);
        gb0Var.setContentDescription(org.telegram.messenger.bd.M0(2131751754, null));
        gb0Var.setOnFocusChangeListener(new ed(this, 9));
        addView(gb0Var, b8.mf.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        gb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pd0
            public final /* synthetic */ wd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.Components.fc fcVar;
                String str;
                int i13;
                int i14;
                int i15 = i12;
                wd0 wd0Var = this.b;
                switch (i15) {
                    case 0:
                        xd0 xd0Var2 = wd0Var.b0;
                        if (xd0Var2.getParentActivity() != null) {
                            boolean z10 = !xd0Var2.E;
                            xd0Var2.E = z10;
                            ((org.telegram.ui.Cells.c2) view).c(z10, true);
                            if (xd0Var2.E) {
                                fcVar = new org.telegram.ui.Components.fc(xd0Var2.a0, null);
                                str = "SyncContactsOn";
                                i13 = 2131744300;
                                i14 = R.raw.contacts_sync_on;
                            } else {
                                fcVar = new org.telegram.ui.Components.fc(xd0Var2.a0, null);
                                str = "SyncContactsOff";
                                i13 = 2131744301;
                                i14 = R.raw.contacts_sync_off;
                            }
                            org.telegram.messenger.k5.o(str, i13, fcVar, i14, 36);
                            break;
                        }
                        break;
                    case 1:
                        xd0 xd0Var3 = wd0Var.b0;
                        if (xd0Var3.getParentActivity() != null) {
                            boolean z11 = !xd0Var3.F;
                            xd0Var3.F = z11;
                            ((org.telegram.ui.Cells.c2) view).c(z11, true);
                            if (xd0Var3.getConnectionsManager().isTestBackend() != xd0Var3.F) {
                                xd0Var3.getConnectionsManager().switchBackend(false);
                            }
                            wd0Var.q();
                            break;
                        }
                        break;
                    default:
                        os osVar = new os(wd0Var.H, true);
                        osVar.r = new ur(wd0Var, 22);
                        wd0Var.b0.presentFragment(osVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.gb0 gb0Var2 = new org.telegram.ui.Components.gb0(context, null);
        this.f = gb0Var2;
        gb0Var2.addView(linearLayout2, b8.mf.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        gb0Var2.setText(org.telegram.messenger.bd.M0(2131747298, null));
        addView(gb0Var2, b8.mf.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, b8.mf.o(-2, -2));
        ud0 ud0Var = new ud0(this, context, i10);
        this.a = ud0Var;
        ud0Var.setInputType(3);
        ud0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ud0Var.setCursorWidth(1.5f);
        ud0Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        ud0Var.setTextSize(1, 16.0f);
        ud0Var.setMaxLines(1);
        ud0Var.setGravity(19);
        ud0Var.setImeOptions(268435461);
        ud0Var.setBackground(null);
        ud0Var.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ud0Var.setContentDescription(org.telegram.messenger.bd.M0(2131748748, null));
        linearLayout2.addView(ud0Var, b8.mf.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ud0Var.addTextChangedListener(new n0(this, 12));
        ud0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.od0
            public final /* synthetic */ wd0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        wd0 wd0Var = this.b;
                        if (i13 != 5) {
                            wd0Var.getClass();
                            return false;
                        }
                        md0 md0Var = wd0Var.b0.c0;
                        if (md0Var != null) {
                            md0Var.h.callOnClick();
                            return true;
                        }
                        wd0Var.h(null);
                        return true;
                    default:
                        ud0 ud0Var2 = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        ud0Var2.requestFocus();
                        ud0Var2.setSelection(ud0Var2.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k10 = b8.mf.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(view, k10);
        ud0 ud0Var2 = new ud0(this, context, i11);
        this.b = ud0Var2;
        ud0Var2.setInputType(3);
        ud0Var2.setPadding(0, 0, 0, 0);
        ud0Var2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ud0Var2.setCursorWidth(1.5f);
        ud0Var2.setTextSize(1, 16.0f);
        ud0Var2.setMaxLines(1);
        ud0Var2.setGravity(19);
        ud0Var2.setImeOptions(268435461);
        ud0Var2.setBackground(null);
        ud0Var2.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ud0Var2.setContentDescription(org.telegram.messenger.bd.M0(2131747298, null));
        linearLayout2.addView(ud0Var2, b8.mf.c(36.0f, -1));
        ud0Var2.addTextChangedListener(new wq(this, i11));
        ud0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.od0
            public final /* synthetic */ wd0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        wd0 wd0Var = this.b;
                        if (i13 != 5) {
                            wd0Var.getClass();
                            return false;
                        }
                        md0 md0Var = wd0Var.b0.c0;
                        if (md0Var != null) {
                            md0Var.h.callOnClick();
                            return true;
                        }
                        wd0Var.h(null);
                        return true;
                    default:
                        ud0 ud0Var22 = this.b.b;
                        if (i13 != 5) {
                            return false;
                        }
                        ud0Var22.requestFocus();
                        ud0Var22.setSelection(ud0Var22.length());
                        return true;
                }
            }
        });
        if (xd0Var.y && xd0Var.G == 0) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 2);
            this.y = c2Var;
            c2Var.e(org.telegram.messenger.bd.M0(2131744308, "SyncContacts"), "", xd0Var.E, false, false);
            addView(c2Var, b8.mf.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.bd.a0 && org.telegram.messenger.g0.O1()) ? 56 : 0), 0));
            c2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pd0
                public final /* synthetic */ wd0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.fc fcVar;
                    String str;
                    int i13;
                    int i14;
                    int i15 = i10;
                    wd0 wd0Var = this.b;
                    switch (i15) {
                        case 0:
                            xd0 xd0Var2 = wd0Var.b0;
                            if (xd0Var2.getParentActivity() != null) {
                                boolean z10 = !xd0Var2.E;
                                xd0Var2.E = z10;
                                ((org.telegram.ui.Cells.c2) view2).c(z10, true);
                                if (xd0Var2.E) {
                                    fcVar = new org.telegram.ui.Components.fc(xd0Var2.a0, null);
                                    str = "SyncContactsOn";
                                    i13 = 2131744300;
                                    i14 = R.raw.contacts_sync_on;
                                } else {
                                    fcVar = new org.telegram.ui.Components.fc(xd0Var2.a0, null);
                                    str = "SyncContactsOff";
                                    i13 = 2131744301;
                                    i14 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.k5.o(str, i13, fcVar, i14, 36);
                                break;
                            }
                            break;
                        case 1:
                            xd0 xd0Var3 = wd0Var.b0;
                            if (xd0Var3.getParentActivity() != null) {
                                boolean z11 = !xd0Var3.F;
                                xd0Var3.F = z11;
                                ((org.telegram.ui.Cells.c2) view2).c(z11, true);
                                if (xd0Var3.getConnectionsManager().isTestBackend() != xd0Var3.F) {
                                    xd0Var3.getConnectionsManager().switchBackend(false);
                                }
                                wd0Var.q();
                                break;
                            }
                            break;
                        default:
                            os osVar = new os(wd0Var.H, true);
                            osVar.r = new ur(wd0Var, 22);
                            wd0Var.b0.presentFragment(osVar);
                            break;
                    }
                }
            });
            i3 = 48;
        } else {
            i3 = 72;
        }
        boolean z10 = org.telegram.messenger.r2.a;
        if (xd0Var.G == 0) {
            org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 2);
            this.E = c2Var2;
            String M0 = org.telegram.messenger.bd.M0(2131751607, null);
            boolean isTestBackend = xd0Var.getConnectionsManager().isTestBackend();
            xd0Var.F = isTestBackend;
            c2Var2.e(M0, "", isTestBackend, false, false);
            addView(c2Var2, b8.mf.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.bd.a0 && org.telegram.messenger.g0.O1()) ? 56 : 0), 0));
            i3 -= 24;
            c2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pd0
                public final /* synthetic */ wd0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    org.telegram.ui.Components.fc fcVar;
                    String str;
                    int i13;
                    int i14;
                    int i15 = i11;
                    wd0 wd0Var = this.b;
                    switch (i15) {
                        case 0:
                            xd0 xd0Var2 = wd0Var.b0;
                            if (xd0Var2.getParentActivity() != null) {
                                boolean z102 = !xd0Var2.E;
                                xd0Var2.E = z102;
                                ((org.telegram.ui.Cells.c2) view2).c(z102, true);
                                if (xd0Var2.E) {
                                    fcVar = new org.telegram.ui.Components.fc(xd0Var2.a0, null);
                                    str = "SyncContactsOn";
                                    i13 = 2131744300;
                                    i14 = R.raw.contacts_sync_on;
                                } else {
                                    fcVar = new org.telegram.ui.Components.fc(xd0Var2.a0, null);
                                    str = "SyncContactsOff";
                                    i13 = 2131744301;
                                    i14 = R.raw.contacts_sync_off;
                                }
                                org.telegram.messenger.k5.o(str, i13, fcVar, i14, 36);
                                break;
                            }
                            break;
                        case 1:
                            xd0 xd0Var3 = wd0Var.b0;
                            if (xd0Var3.getParentActivity() != null) {
                                boolean z11 = !xd0Var3.F;
                                xd0Var3.F = z11;
                                ((org.telegram.ui.Cells.c2) view2).c(z11, true);
                                if (xd0Var3.getConnectionsManager().isTestBackend() != xd0Var3.F) {
                                    xd0Var3.getConnectionsManager().switchBackend(false);
                                }
                                wd0Var.q();
                                break;
                            }
                            break;
                        default:
                            os osVar = new os(wd0Var.H, true);
                            osVar.r = new ur(wd0Var, 22);
                            wd0Var.b0.presentFragment(osVar);
                            break;
                    }
                }
            });
        }
        if (i3 > 0 && !org.telegram.messenger.g0.O1()) {
            View space = new Space(context);
            space.setMinimumHeight(org.telegram.messenger.g0.L(i3));
            addView(space, b8.mf.o(-2, -2));
        }
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                ks ksVar = new ks();
                ksVar.a = split[2];
                String str = split[0];
                ksVar.c = str;
                ksVar.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String i02 = org.telegram.messenger.bd.i0(2131750529, ksVar.d);
                    if (!TextUtils.isEmpty(i02) && !TextUtils.equals(ksVar.d, i02)) {
                        ksVar.b = ksVar.a;
                        ksVar.a = i02;
                    }
                }
                this.H.add(0, ksVar);
                List list = (List) this.I.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.I;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(ksVar);
                if (split.length > 3) {
                    this.J.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        int i13 = 13;
        Collections.sort(this.H, Comparator$-CC.comparing(new fa.b(i13)));
        try {
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        ConnectionsManager.getInstance(xd0Var.getAccountInstance().a).sendRequest(new TLRPC.TL_help_getNearestDc(), new xy(i13, this, hashMap), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.F = 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            ud0 ud0Var3 = this.b;
            ud0Var3.setSelection(ud0Var3.length());
        } else {
            this.a.requestFocus();
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryButtonText(CharSequence charSequence) {
        Animation loadAnimation = AnimationUtils.loadAnimation(org.telegram.messenger.t0.b, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ks.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.gb0 gb0Var = this.e;
        float f10 = charSequence != null ? 1.0f : 0.0f;
        gb0Var.b(f10, f10, true);
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void d() {
        this.N = false;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.i4) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void f() {
        org.telegram.messenger.jk jkVar = this.a0;
        if (jkVar != null) {
            jkVar.run();
            this.a0 = null;
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131742806, "YourPhone");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.vt0
    public final void h(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i3;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i10;
        if (this.b0.getParentActivity() == null || this.N || this.b0.q0) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
        boolean z15 = org.telegram.messenger.r2.a;
        org.telegram.messenger.a8.b("sim status = " + telephonyManager.getSimState());
        int i11 = 0;
        if (this.a.length() == 0 || this.b.length() == 0) {
            xd0.b1(this.b0, this.f, false);
            return;
        }
        String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        int i12 = 1;
        if (!this.O) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y && !this.b0.q1() && this.b0.T.Q() > org.telegram.messenger.g0.L(20.0f)) {
                xd0 xd0Var = this.b0;
                xd0Var.U = new nd0(this, i12);
                org.telegram.messenger.g0.v1(xd0Var.fragmentView);
                return;
            }
            xd0 xd0Var2 = this.b0;
            Context context = this.b0.fragmentView.getContext();
            xd0 xd0Var3 = this.b0;
            xd0Var2.c0 = new md0(context, (ViewGroup) xd0Var3.fragmentView, xd0Var3.O, str2, new f(this, 21));
            md0 md0Var = this.b0.c0;
            md0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new ld0(md0Var, i11));
            duration.addUpdateListener(new jd0(md0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.xq.f);
            duration.start();
            return;
        }
        this.O = false;
        md0 md0Var2 = this.b0.c0;
        if (md0Var2 != null) {
            int i13 = md0.G;
            md0Var2.a();
        }
        boolean N1 = org.telegram.messenger.g0.N1();
        int i14 = Build.VERSION.SDK_INT;
        if (N1) {
            z12 = this.b0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z13 = this.b0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            z14 = i14 < 28 || this.b0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z16 = i14 < 26 || this.b0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            xd0 xd0Var4 = this.b0;
            z10 = N1;
            if (xd0Var4.w) {
                xd0Var4.r.clear();
                if (!z12) {
                    this.b0.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z13) {
                    this.b0.r.add("android.permission.CALL_PHONE");
                }
                if (!z14) {
                    this.b0.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z16 && i14 >= 26) {
                    this.b0.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!this.b0.r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.hp.e1();
                    if (!e12.getBoolean("firstlogin", true) && !this.b0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.b0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            this.b0.getParentActivity().requestPermissions((String[]) this.b0.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b0.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, "Continue"), null);
                    int i15 = R.raw.calls_log;
                    if (!z12 && (!z13 || !z14)) {
                        alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131754274, "AllowReadCallAndLog");
                    } else if (z13 && z14) {
                        alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131754275, "AllowReadCall");
                        i15 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131754273, "AllowReadCallLog");
                    }
                    int i16 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i15, 46, org.telegram.ui.ActionBar.k6.x0(null, i16, false), null);
                    alertDialog$Builder.n(i16, null);
                    xd0 xd0Var5 = this.b0;
                    xd0Var5.h = xd0Var5.showDialog(alertDialog$Builder.a);
                    this.O = true;
                    return;
                }
            }
            z11 = true;
        } else {
            z10 = N1;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
        }
        if (this.F == z11) {
            this.b0.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752134, "ChooseCountry"));
            this.b0.t1(false, z11);
            return;
        }
        String str3 = "";
        String d = mf.b.d("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
        xd0 xd0Var6 = this.b0;
        if (xd0Var6.G == 0 && (xd0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i17 = 0; i17 < 4; i17++) {
                org.telegram.messenger.h10 i18 = org.telegram.messenger.h10.i(i17);
                if (i18.p() && PhoneNumberUtils.compare(d, i18.f().phone)) {
                    boolean isTestBackend = ConnectionsManager.getInstance(i17).isTestBackend();
                    xd0 xd0Var7 = this.b0;
                    if (isTestBackend == xd0Var7.F) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xd0Var7.getParentActivity());
                        alertDialog$Builder2.a.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.bd.M0(2131754709, "AccountAlreadyLoggedIn");
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754694, "AccountSwitch"), new k2.q(this, i17, 14));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, "OK"), null);
                        this.b0.showDialog(alertDialog$Builder2.a);
                        this.b0.t1(false, true);
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = null;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        tL_codeSettings.allow_flashcall = z10 && z12 && z13 && z14;
        tL_codeSettings.allow_missed_call = z10 && z12;
        boolean hasServices = org.telegram.messenger.lt.b.hasServices();
        tL_codeSettings.allow_firebase = hasServices;
        tL_codeSettings.allow_app_hash = hasServices;
        if (this.b0.m0 || TextUtils.isEmpty(org.telegram.messenger.r2.f)) {
            tL_codeSettings.allow_firebase = false;
        }
        ArrayList b10 = org.telegram.messenger.v0.b();
        if (b10 != null) {
            for (int i19 = 0; i19 < b10.size(); i19++) {
                if (((TLRPC.TL_auth_authorization) b10.get(i19)).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    boolean z17 = org.telegram.messenger.r2.a;
                    org.telegram.messenger.a8.b("login token to check ".concat(new String(((TLRPC.TL_auth_authorization) b10.get(i19)).future_auth_token, StandardCharsets.UTF_8)));
                    tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_authorization) b10.get(i19)).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
            }
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("saved_tokens", 0);
        int i20 = sharedPreferences.getInt("count", 0);
        if (i20 != 0) {
            arrayList = new ArrayList();
            int i21 = 0;
            while (i21 < i20) {
                SharedPreferences sharedPreferences2 = sharedPreferences;
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_out_token_" + i21, str3)));
                String str4 = str3;
                TLRPC.TL_auth_loggedOut TLdeserialize = TLRPC.TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(TLdeserialize);
                }
                i21++;
                sharedPreferences = sharedPreferences2;
                str3 = str4;
            }
        }
        if (arrayList != null) {
            for (int i22 = 0; i22 < arrayList.size(); i22++) {
                if (tL_codeSettings.logout_tokens == null) {
                    tL_codeSettings.logout_tokens = new ArrayList<>();
                }
                tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_loggedOut) arrayList.get(i22)).future_auth_token);
                if (tL_codeSettings.logout_tokens.size() >= 20) {
                    break;
                }
            }
            SharedPreferences sharedPreferences3 = org.telegram.messenger.t0.b.getSharedPreferences("saved_tokens", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences3.edit().clear().apply();
            System.currentTimeMillis();
            for (int i23 = 0; i23 < Math.min(20, arrayList.size()); i23++) {
                arrayList2.add((TLRPC.TL_auth_loggedOut) arrayList.get(i23));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putInt("count", arrayList2.size());
                for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                    SerializedData serializedData2 = new SerializedData(((TLRPC.TL_auth_loggedOut) arrayList2.get(i24)).getObjectSize());
                    ((TLRPC.TL_auth_loggedOut) arrayList2.get(i24)).serializeToStream(serializedData2);
                    edit.putString("log_out_token_" + i24, Utilities.f(serializedData2.toByteArray()));
                }
                edit.apply();
            }
        }
        if (tL_codeSettings.logout_tokens != null) {
            tL_codeSettings.flags |= 64;
        }
        SharedPreferences sharedPreferences4 = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
        sharedPreferences4.edit().remove("sms_hash_code").apply();
        if (tL_codeSettings.allow_app_hash) {
            SharedPreferences.Editor edit2 = sharedPreferences4.edit();
            org.telegram.messenger.t0.u();
            edit2.putString("sms_hash", "O2P2z+/jBpJ").apply();
        } else {
            sharedPreferences4.edit().remove("sms_hash").apply();
        }
        if (tL_codeSettings.allow_flashcall) {
            try {
                HashSet c12 = xd0.c1(this.b0);
                if (c12.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (org.telegram.messenger.h10.c() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.-EL.stream(c12).anyMatch(new c60(d, 1));
                }
            } catch (Exception e11) {
                tL_codeSettings.unknown_number = true;
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        xd0 xd0Var8 = this.b0;
        if (xd0Var8.G == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = d;
            sendchangephonecode.settings = tL_codeSettings;
            tL_auth_sendCode = sendchangephonecode;
        } else {
            i3 = ((org.telegram.ui.ActionBar.d2) xd0Var8).currentAccount;
            ConnectionsManager.getInstance(i3).cleanup(false);
            TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
            tL_auth_sendCode2.api_hash = org.telegram.messenger.r2.e;
            tL_auth_sendCode2.api_id = org.telegram.messenger.r2.d;
            tL_auth_sendCode2.phone_number = d;
            tL_auth_sendCode2.settings = tL_codeSettings;
            tL_auth_sendCode = tL_auth_sendCode2;
        }
        TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText()));
        try {
            bundle.putString("ephone", "+" + mf.b.d(this.a.getText().toString(), false) + " " + mf.b.d(this.b.getText().toString(), false));
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
            bundle.putString("ephone", "+" + d);
        }
        bundle.putString("phoneFormated", d);
        ks ksVar = this.G;
        if (ksVar != null) {
            bundle.putString("country", ksVar.c);
        }
        this.N = true;
        k4.j jVar = new k4.j();
        jVar.c = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
        jVar.b = this.G;
        jVar.a = (List) this.J.get(this.a.getText().toString());
        i10 = ((org.telegram.ui.ActionBar.d2) this.b0).currentAccount;
        this.b0.w1(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_sendCode3, new ci.s7(this, bundle, d, jVar, tL_auth_sendCode3, 10), 27), true);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void j() {
        o();
        org.telegram.ui.Cells.c2 c2Var = this.y;
        if (c2Var != null) {
            c2Var.c(this.b0.E, false);
        }
        org.telegram.messenger.g0.i3(new nd0(this, 0), xd0.z0);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.b.setText(string2);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void l(Bundle bundle) {
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    public final void o() {
        boolean z10;
        xd0 xd0Var;
        boolean z11;
        ks ksVar;
        if (this.U || this.b0.G != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
            if (org.telegram.messenger.g0.N1()) {
                int i3 = Build.VERSION.SDK_INT;
                boolean z12 = this.b0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                if (i3 >= 26 && this.b0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                    z10 = false;
                    xd0Var = this.b0;
                    if (!xd0Var.x && (!z12 || !z10)) {
                        xd0Var.s.clear();
                        if (!z12) {
                            this.b0.s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z10 && i3 >= 26) {
                            this.b0.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.b0.s.isEmpty()) {
                            return;
                        }
                        new tb0(10, this, new ArrayList(this.b0.s)).run();
                        return;
                    }
                    this.U = true;
                    if (xd0Var.y && z12 && z10) {
                        this.a.setAlpha(0.0f);
                        this.b.setAlpha(0.0f);
                        String d = mf.b.d(telephonyManager.getLine1Number(), false);
                        if (!TextUtils.isEmpty(d)) {
                            int i10 = 4;
                            String str = null;
                            if (d.length() > 4) {
                                while (true) {
                                    if (i10 < 1) {
                                        z11 = false;
                                        break;
                                    }
                                    String substring = d.substring(0, i10);
                                    List list = (List) this.I.get(substring);
                                    if (list == null) {
                                        ksVar = null;
                                    } else if (list.size() > 1) {
                                        String string = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + substring, null);
                                        ksVar = (ks) list.get(list.size() - 1);
                                        if (string != null) {
                                            ArrayList arrayList = this.H;
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 >= size) {
                                                    break;
                                                }
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                ks ksVar2 = (ks) obj;
                                                if (Objects.equals(ksVar2.d, string)) {
                                                    ksVar = ksVar2;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        ksVar = (ks) list.get(0);
                                    }
                                    if (ksVar != null) {
                                        str = d.substring(i10);
                                        this.a.setText(substring);
                                        z11 = true;
                                        break;
                                    }
                                    i10--;
                                }
                                if (!z11) {
                                    str = d.substring(1);
                                    this.a.setText(d.substring(0, 1));
                                }
                            }
                            if (str != null) {
                                this.b.requestFocus();
                                this.b.setText(str);
                                ud0 ud0Var = this.b;
                                ud0Var.setSelection(ud0Var.length());
                            }
                        }
                        if (this.b.length() <= 0) {
                            this.a.setAlpha(1.0f);
                            this.b.setAlpha(1.0f);
                            return;
                        }
                        AnimatorSet duration = new AnimatorSet().setDuration(300L);
                        ud0 ud0Var2 = this.a;
                        Property property = View.ALPHA;
                        duration.playTogether(ObjectAnimator.ofFloat(ud0Var2, (Property<ud0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<ud0, Float>) property, 1.0f));
                        duration.start();
                        this.O = true;
                        return;
                    }
                    return;
                }
                z10 = true;
                xd0Var = this.b0;
                if (!xd0Var.x) {
                }
                this.U = true;
                if (xd0Var.y) {
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j10) {
        if (this.K) {
            this.K = false;
            return;
        }
        this.L = true;
        this.a.setText(((ks) this.H.get(i3)).c);
        this.L = false;
    }

    public final void p() {
        int i3;
        String str = this.S;
        ud0 ud0Var = this.b;
        String replace = ud0Var.getText() != null ? ud0Var.getText().toString().replace(" ", "") : "";
        HashMap hashMap = this.J;
        if (hashMap.get(str) == null || ((List) hashMap.get(str)).isEmpty()) {
            if (this.T != -1) {
                int selectionStart = ud0Var.getSelectionStart();
                int selectionEnd = ud0Var.getSelectionEnd();
                ud0Var.setHintText((String) null);
                ud0Var.setSelection(selectionStart, selectionEnd);
                this.T = -1;
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
            for (int i10 = 0; i10 < list.size(); i10++) {
                String str2 = (String) list.get(i10);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i3 = i10;
                    break;
                }
            }
            if (i3 == -1) {
                i3 = 0;
            }
        }
        if (this.T != i3) {
            String str3 = (String) ((List) hashMap.get(str)).get(i3);
            int selectionStart2 = ud0Var.getSelectionStart();
            int selectionEnd2 = ud0Var.getSelectionEnd();
            ud0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            ud0Var.setSelection(Math.max(0, Math.min(ud0Var.length(), selectionStart2)), Math.max(0, Math.min(ud0Var.length(), selectionEnd2)));
            this.T = i3;
        }
    }

    public final void q() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = org.telegram.messenger.bd.E0().B != null ? org.telegram.messenger.bd.E0().B.c() : Locale.getDefault().getCountry();
        this.b0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new rd0(this, 0), 10);
    }

    public final void r(final boolean z10) {
        boolean z11;
        final int i3;
        org.telegram.messenger.jk jkVar;
        xd0 xd0Var = this.b0;
        if (xd0Var.G == 0 && Build.VERSION.SDK_INT >= 28 && (z11 = org.telegram.messenger.r2.i) && !this.W) {
            if (z10 || !this.V) {
                this.W = true;
                this.V = true;
                final Context context = getContext();
                i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                final qd0 qd0Var = new qd0(this, 0);
                if (z11) {
                    kotlin.jvm.internal.j.e(context, "context");
                    final androidx.biometric.t tVar = new androidx.biometric.t(context, 2);
                    final boolean[] zArr = new boolean[1];
                    final Runnable[] runnableArr = new Runnable[1];
                    TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                    initpasskeylogin.api_id = org.telegram.messenger.r2.d;
                    initpasskeylogin.api_hash = org.telegram.messenger.r2.e;
                    runnableArr[0] = new org.telegram.messenger.rd(i3, ConnectionsManager.getInstance(i3).sendRequestTyped(initpasskeylogin, new c3.b(1), new org.telegram.messenger.n10() { // from class: org.telegram.messenger.bt
                        @Override // org.telegram.messenger.n10
                        public final void a(Object obj, Object obj2) {
                            gt.a(zArr, qd0Var, z10, tVar, context, i3, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                        }
                    }, 8), 1);
                    jkVar = new org.telegram.messenger.jk(zArr, runnableArr, 1);
                } else {
                    jkVar = null;
                }
                this.a0 = jkVar;
            }
        }
    }

    public final void s(String str, ks ksVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.bd.F0(ksVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.fy(4), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ksVar.a);
        setCountryButtonText(org.telegram.messenger.i6.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.S = str;
        this.T = -1;
        p();
    }

    @Override // org.telegram.ui.Components.vt0
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.s70 s70Var = this.n;
        s70Var.setTextColor(x02);
        s70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        int i3 = 0;
        while (true) {
            org.telegram.ui.Components.vy0 vy0Var = this.d;
            if (i3 >= vy0Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) vy0Var.getChildAt(i3);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
            i3++;
        }
        int i10 = org.telegram.ui.ActionBar.k6.H6;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.s;
        xd0.l1(imageView, x03, i11, mode);
        this.w = x03;
        int themedColor = this.b0.getThemedColor(org.telegram.ui.ActionBar.k6.i6);
        xd0.m1(imageView, themedColor, this.x);
        this.x = themedColor;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        ud0 ud0Var = this.a;
        ud0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.k6.l6;
        ud0Var.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k6, false));
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        ud0 ud0Var2 = this.b;
        ud0Var2.setTextColor(x05);
        ud0Var2.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        ud0Var2.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        org.telegram.ui.Cells.c2 c2Var = this.y;
        if (c2Var != null) {
            int i14 = org.telegram.ui.ActionBar.k6.Y6;
            int i15 = org.telegram.ui.ActionBar.k6.W6;
            int i16 = org.telegram.ui.ActionBar.k6.X6;
            CheckBoxSquare checkBoxSquare = c2Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i14;
                checkBoxSquare.w = i15;
                checkBoxSquare.x = i16;
                checkBoxSquare.invalidate();
            }
            c2Var.g();
        }
        org.telegram.ui.Cells.c2 c2Var2 = this.E;
        if (c2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.k6.Y6;
            int i18 = org.telegram.ui.ActionBar.k6.W6;
            int i19 = org.telegram.ui.ActionBar.k6.X6;
            CheckBoxSquare checkBoxSquare2 = c2Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i17;
                checkBoxSquare2.w = i18;
                checkBoxSquare2.x = i19;
                checkBoxSquare2.invalidate();
            }
            c2Var2.g();
        }
        this.f.f();
        this.e.f();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
