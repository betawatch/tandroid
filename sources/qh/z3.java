package qh;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;
    public final /* synthetic */ eg.j c;

    public /* synthetic */ z3(b5 b5Var, eg.j jVar, int i10) {
        this.a = i10;
        this.b = b5Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C0(this.c);
                break;
            default:
                final b5 b5Var = this.b;
                w4 w4Var = b5Var.O0;
                j4 j4Var = b5Var.L1;
                q4 q4Var = b5Var.D1;
                LinearLayout linearLayout = new LinearLayout(b5Var.getContext());
                linearLayout.setOrientation(0);
                final eg.j jVar = this.c;
                boolean z4 = jVar instanceof eg.y1;
                if (!z4) {
                    TextView textView = new TextView(b5Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, q4Var));
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(LocaleController.getString("PaintDelete", R.string.PaintDelete));
                    final int i10 = 0;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: qh.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            eg.j jVar2;
                            switch (i10) {
                                case 0:
                                    eg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof eg.z2;
                                    b5 b5Var2 = b5Var;
                                    if (z10) {
                                        r9 r9Var = ((f9) b5Var2).x2.Z0;
                                        if (r9Var != null) {
                                            r9Var.B();
                                        }
                                    } else {
                                        b5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = b5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        b5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    eg.j jVar4 = jVar;
                                    b5 b5Var3 = b5Var;
                                    b5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = b5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        b5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    b5 b5Var4 = b5Var;
                                    b5Var4.D0(jVar, true);
                                    b5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = b5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        b5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    b5 b5Var5 = b5Var;
                                    b5Var5.D0(null, true);
                                    eg.j jVar5 = jVar;
                                    b5Var5.L0((eg.k1) jVar5, new eh.w(26, b5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = b5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        b5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    b5 b5Var6 = b5Var;
                                    b5Var6.D0(null, true);
                                    b5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = b5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        b5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    eg.j jVar6 = jVar;
                                    if (jVar6 instanceof eg.p3) {
                                        ((eg.p3) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.y2) {
                                        ((eg.y2) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar6;
                                        z2Var.o0 = !z2Var.o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar6).r(true);
                                    }
                                    b5 b5Var7 = b5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = b5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        b5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    b5 b5Var8 = b5Var;
                                    b5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = b5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        b5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    b5 b5Var9 = b5Var;
                                    w4 w4Var2 = b5Var9.O0;
                                    eg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = b5Var9.Q0(jVar7);
                                        if (jVar7 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(b5Var9.getContext(), (eg.p3) jVar7, Q0);
                                            p3Var.setDelegate(b5Var9);
                                            w4Var2.addView(p3Var);
                                            b5Var9.g0();
                                            jVar2 = p3Var;
                                        } else if (jVar7 instanceof eg.z3) {
                                            eg.z3 z3Var = new eg.z3(b5Var9.getContext(), (eg.z3) jVar7, Q0);
                                            z3Var.setDelegate(b5Var9);
                                            z3Var.setMaxWidth(b5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(z3Var, k7.c6.c(-2.0f, -2));
                                            b5Var9.g0();
                                            jVar2 = z3Var;
                                        }
                                        b5Var9.B0(jVar2);
                                        b5Var9.D0(null, true);
                                        b5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = b5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        b5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, k7.c6.n(-2, 44));
                }
                if (jVar instanceof eg.z3) {
                    TextView textView2 = new TextView(b5Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, q4Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!j4Var.c() || j4Var.d) && b5Var.q2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        final int i11 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: qh.c4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                eg.j jVar2;
                                switch (i11) {
                                    case 0:
                                        eg.j jVar3 = jVar;
                                        boolean z10 = jVar3 instanceof eg.z2;
                                        b5 b5Var2 = b5Var;
                                        if (z10) {
                                            r9 r9Var = ((f9) b5Var2).x2.Z0;
                                            if (r9Var != null) {
                                                r9Var.B();
                                            }
                                        } else {
                                            b5Var2.C0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = b5Var2.E1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            b5Var2.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        eg.j jVar4 = jVar;
                                        b5 b5Var3 = b5Var;
                                        b5Var3.getClass();
                                        try {
                                            ((eg.z3) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = b5Var3.E1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            b5Var3.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        b5 b5Var4 = b5Var;
                                        b5Var4.D0(jVar, true);
                                        b5Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = b5Var4.E1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            b5Var4.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        b5 b5Var5 = b5Var;
                                        b5Var5.D0(null, true);
                                        eg.j jVar5 = jVar;
                                        b5Var5.L0((eg.k1) jVar5, new eh.w(26, b5Var5, jVar5));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = b5Var5.E1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            b5Var5.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        b5 b5Var6 = b5Var;
                                        b5Var6.D0(null, true);
                                        b5Var6.K0((eg.g1) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = b5Var6.E1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            b5Var6.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        eg.j jVar6 = jVar;
                                        if (jVar6 instanceof eg.p3) {
                                            ((eg.p3) jVar6).r(true);
                                        } else if (jVar6 instanceof eg.y2) {
                                            ((eg.y2) jVar6).r(true);
                                        } else if (jVar6 instanceof eg.z2) {
                                            eg.z2 z2Var = (eg.z2) jVar6;
                                            z2Var.o0 = !z2Var.o0;
                                            z2Var.invalidate();
                                        } else {
                                            ((eg.t2) jVar6).r(true);
                                        }
                                        b5 b5Var7 = b5Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = b5Var7.E1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            b5Var7.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        b5 b5Var8 = b5Var;
                                        b5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = b5Var8.E1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            b5Var8.E1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        b5 b5Var9 = b5Var;
                                        w4 w4Var2 = b5Var9.O0;
                                        eg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF Q0 = b5Var9.Q0(jVar7);
                                            if (jVar7 instanceof eg.p3) {
                                                eg.j p3Var = new eg.p3(b5Var9.getContext(), (eg.p3) jVar7, Q0);
                                                p3Var.setDelegate(b5Var9);
                                                w4Var2.addView(p3Var);
                                                b5Var9.g0();
                                                jVar2 = p3Var;
                                            } else if (jVar7 instanceof eg.z3) {
                                                eg.z3 z3Var = new eg.z3(b5Var9.getContext(), (eg.z3) jVar7, Q0);
                                                z3Var.setDelegate(b5Var9);
                                                z3Var.setMaxWidth(b5Var9.O1 - AndroidUtilities.dp(32.0f));
                                                w4Var2.addView(z3Var, k7.c6.c(-2.0f, -2));
                                                b5Var9.g0();
                                                jVar2 = z3Var;
                                            }
                                            b5Var9.B0(jVar2);
                                            b5Var9.D0(null, true);
                                            b5Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = b5Var9.E1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            b5Var9.E1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        final int i12 = 1;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: qh.c4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                eg.j jVar2;
                                switch (i12) {
                                    case 0:
                                        eg.j jVar3 = jVar;
                                        boolean z10 = jVar3 instanceof eg.z2;
                                        b5 b5Var2 = b5Var;
                                        if (z10) {
                                            r9 r9Var = ((f9) b5Var2).x2.Z0;
                                            if (r9Var != null) {
                                                r9Var.B();
                                            }
                                        } else {
                                            b5Var2.C0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = b5Var2.E1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            b5Var2.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        eg.j jVar4 = jVar;
                                        b5 b5Var3 = b5Var;
                                        b5Var3.getClass();
                                        try {
                                            ((eg.z3) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = b5Var3.E1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            b5Var3.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        b5 b5Var4 = b5Var;
                                        b5Var4.D0(jVar, true);
                                        b5Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = b5Var4.E1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            b5Var4.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        b5 b5Var5 = b5Var;
                                        b5Var5.D0(null, true);
                                        eg.j jVar5 = jVar;
                                        b5Var5.L0((eg.k1) jVar5, new eh.w(26, b5Var5, jVar5));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = b5Var5.E1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            b5Var5.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        b5 b5Var6 = b5Var;
                                        b5Var6.D0(null, true);
                                        b5Var6.K0((eg.g1) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = b5Var6.E1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            b5Var6.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        eg.j jVar6 = jVar;
                                        if (jVar6 instanceof eg.p3) {
                                            ((eg.p3) jVar6).r(true);
                                        } else if (jVar6 instanceof eg.y2) {
                                            ((eg.y2) jVar6).r(true);
                                        } else if (jVar6 instanceof eg.z2) {
                                            eg.z2 z2Var = (eg.z2) jVar6;
                                            z2Var.o0 = !z2Var.o0;
                                            z2Var.invalidate();
                                        } else {
                                            ((eg.t2) jVar6).r(true);
                                        }
                                        b5 b5Var7 = b5Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = b5Var7.E1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            b5Var7.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        b5 b5Var8 = b5Var;
                                        b5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = b5Var8.E1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            b5Var8.E1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        b5 b5Var9 = b5Var;
                                        w4 w4Var2 = b5Var9.O0;
                                        eg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF Q0 = b5Var9.Q0(jVar7);
                                            if (jVar7 instanceof eg.p3) {
                                                eg.j p3Var = new eg.p3(b5Var9.getContext(), (eg.p3) jVar7, Q0);
                                                p3Var.setDelegate(b5Var9);
                                                w4Var2.addView(p3Var);
                                                b5Var9.g0();
                                                jVar2 = p3Var;
                                            } else if (jVar7 instanceof eg.z3) {
                                                eg.z3 z3Var = new eg.z3(b5Var9.getContext(), (eg.z3) jVar7, Q0);
                                                z3Var.setDelegate(b5Var9);
                                                z3Var.setMaxWidth(b5Var9.O1 - AndroidUtilities.dp(32.0f));
                                                w4Var2.addView(z3Var, k7.c6.c(-2.0f, -2));
                                                b5Var9.g0();
                                                jVar2 = z3Var;
                                            }
                                            b5Var9.B0(jVar2);
                                            b5Var9.D0(null, true);
                                            b5Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = b5Var9.E1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            b5Var9.E1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, k7.c6.n(-2, 44));
                } else if (jVar instanceof eg.k1) {
                    TextView h02 = b5Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i13 = 3;
                    h02.setOnClickListener(new View.OnClickListener() { // from class: qh.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            eg.j jVar2;
                            switch (i13) {
                                case 0:
                                    eg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof eg.z2;
                                    b5 b5Var2 = b5Var;
                                    if (z10) {
                                        r9 r9Var = ((f9) b5Var2).x2.Z0;
                                        if (r9Var != null) {
                                            r9Var.B();
                                        }
                                    } else {
                                        b5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = b5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        b5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    eg.j jVar4 = jVar;
                                    b5 b5Var3 = b5Var;
                                    b5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = b5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        b5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    b5 b5Var4 = b5Var;
                                    b5Var4.D0(jVar, true);
                                    b5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = b5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        b5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    b5 b5Var5 = b5Var;
                                    b5Var5.D0(null, true);
                                    eg.j jVar5 = jVar;
                                    b5Var5.L0((eg.k1) jVar5, new eh.w(26, b5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = b5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        b5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    b5 b5Var6 = b5Var;
                                    b5Var6.D0(null, true);
                                    b5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = b5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        b5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    eg.j jVar6 = jVar;
                                    if (jVar6 instanceof eg.p3) {
                                        ((eg.p3) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.y2) {
                                        ((eg.y2) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar6;
                                        z2Var.o0 = !z2Var.o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar6).r(true);
                                    }
                                    b5 b5Var7 = b5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = b5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        b5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    b5 b5Var8 = b5Var;
                                    b5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = b5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        b5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    b5 b5Var9 = b5Var;
                                    w4 w4Var2 = b5Var9.O0;
                                    eg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = b5Var9.Q0(jVar7);
                                        if (jVar7 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(b5Var9.getContext(), (eg.p3) jVar7, Q0);
                                            p3Var.setDelegate(b5Var9);
                                            w4Var2.addView(p3Var);
                                            b5Var9.g0();
                                            jVar2 = p3Var;
                                        } else if (jVar7 instanceof eg.z3) {
                                            eg.z3 z3Var = new eg.z3(b5Var9.getContext(), (eg.z3) jVar7, Q0);
                                            z3Var.setDelegate(b5Var9);
                                            z3Var.setMaxWidth(b5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(z3Var, k7.c6.c(-2.0f, -2));
                                            b5Var9.g0();
                                            jVar2 = z3Var;
                                        }
                                        b5Var9.B0(jVar2);
                                        b5Var9.D0(null, true);
                                        b5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = b5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        b5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h02, k7.c6.n(-2, 44));
                } else if (jVar instanceof eg.g1) {
                    TextView h03 = b5Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i14 = 4;
                    h03.setOnClickListener(new View.OnClickListener() { // from class: qh.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            eg.j jVar2;
                            switch (i14) {
                                case 0:
                                    eg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof eg.z2;
                                    b5 b5Var2 = b5Var;
                                    if (z10) {
                                        r9 r9Var = ((f9) b5Var2).x2.Z0;
                                        if (r9Var != null) {
                                            r9Var.B();
                                        }
                                    } else {
                                        b5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = b5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        b5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    eg.j jVar4 = jVar;
                                    b5 b5Var3 = b5Var;
                                    b5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = b5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        b5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    b5 b5Var4 = b5Var;
                                    b5Var4.D0(jVar, true);
                                    b5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = b5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        b5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    b5 b5Var5 = b5Var;
                                    b5Var5.D0(null, true);
                                    eg.j jVar5 = jVar;
                                    b5Var5.L0((eg.k1) jVar5, new eh.w(26, b5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = b5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        b5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    b5 b5Var6 = b5Var;
                                    b5Var6.D0(null, true);
                                    b5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = b5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        b5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    eg.j jVar6 = jVar;
                                    if (jVar6 instanceof eg.p3) {
                                        ((eg.p3) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.y2) {
                                        ((eg.y2) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar6;
                                        z2Var.o0 = !z2Var.o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar6).r(true);
                                    }
                                    b5 b5Var7 = b5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = b5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        b5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    b5 b5Var8 = b5Var;
                                    b5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = b5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        b5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    b5 b5Var9 = b5Var;
                                    w4 w4Var2 = b5Var9.O0;
                                    eg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = b5Var9.Q0(jVar7);
                                        if (jVar7 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(b5Var9.getContext(), (eg.p3) jVar7, Q0);
                                            p3Var.setDelegate(b5Var9);
                                            w4Var2.addView(p3Var);
                                            b5Var9.g0();
                                            jVar2 = p3Var;
                                        } else if (jVar7 instanceof eg.z3) {
                                            eg.z3 z3Var = new eg.z3(b5Var9.getContext(), (eg.z3) jVar7, Q0);
                                            z3Var.setDelegate(b5Var9);
                                            z3Var.setMaxWidth(b5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(z3Var, k7.c6.c(-2.0f, -2));
                                            b5Var9.g0();
                                            jVar2 = z3Var;
                                        }
                                        b5Var9.B0(jVar2);
                                        b5Var9.D0(null, true);
                                        b5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = b5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        b5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h03, k7.c6.n(-2, 44));
                }
                if ((jVar instanceof eg.p3) || (jVar instanceof eg.z2) || (jVar instanceof eg.t2) || (jVar instanceof eg.y2)) {
                    TextView h04 = b5Var.h0(4, LocaleController.getString(R.string.Flip));
                    final int i15 = 5;
                    h04.setOnClickListener(new View.OnClickListener() { // from class: qh.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            eg.j jVar2;
                            switch (i15) {
                                case 0:
                                    eg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof eg.z2;
                                    b5 b5Var2 = b5Var;
                                    if (z10) {
                                        r9 r9Var = ((f9) b5Var2).x2.Z0;
                                        if (r9Var != null) {
                                            r9Var.B();
                                        }
                                    } else {
                                        b5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = b5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        b5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    eg.j jVar4 = jVar;
                                    b5 b5Var3 = b5Var;
                                    b5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = b5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        b5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    b5 b5Var4 = b5Var;
                                    b5Var4.D0(jVar, true);
                                    b5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = b5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        b5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    b5 b5Var5 = b5Var;
                                    b5Var5.D0(null, true);
                                    eg.j jVar5 = jVar;
                                    b5Var5.L0((eg.k1) jVar5, new eh.w(26, b5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = b5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        b5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    b5 b5Var6 = b5Var;
                                    b5Var6.D0(null, true);
                                    b5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = b5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        b5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    eg.j jVar6 = jVar;
                                    if (jVar6 instanceof eg.p3) {
                                        ((eg.p3) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.y2) {
                                        ((eg.y2) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar6;
                                        z2Var.o0 = !z2Var.o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar6).r(true);
                                    }
                                    b5 b5Var7 = b5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = b5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        b5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    b5 b5Var8 = b5Var;
                                    b5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = b5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        b5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    b5 b5Var9 = b5Var;
                                    w4 w4Var2 = b5Var9.O0;
                                    eg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = b5Var9.Q0(jVar7);
                                        if (jVar7 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(b5Var9.getContext(), (eg.p3) jVar7, Q0);
                                            p3Var.setDelegate(b5Var9);
                                            w4Var2.addView(p3Var);
                                            b5Var9.g0();
                                            jVar2 = p3Var;
                                        } else if (jVar7 instanceof eg.z3) {
                                            eg.z3 z3Var = new eg.z3(b5Var9.getContext(), (eg.z3) jVar7, Q0);
                                            z3Var.setDelegate(b5Var9);
                                            z3Var.setMaxWidth(b5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(z3Var, k7.c6.c(-2.0f, -2));
                                            b5Var9.g0();
                                            jVar2 = z3Var;
                                        }
                                        b5Var9.B0(jVar2);
                                        b5Var9.D0(null, true);
                                        b5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = b5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        b5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h04, k7.c6.n(-2, 44));
                }
                boolean z10 = jVar instanceof eg.t2;
                if (w4Var.indexOfChild(jVar) != w4Var.getChildCount() - 1 && !(jVar instanceof eg.y2)) {
                    TextView textView3 = new TextView(b5Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, q4Var));
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.PaintBringToFront));
                    final int i16 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: qh.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            eg.j jVar2;
                            switch (i16) {
                                case 0:
                                    eg.j jVar3 = jVar;
                                    boolean z102 = jVar3 instanceof eg.z2;
                                    b5 b5Var2 = b5Var;
                                    if (z102) {
                                        r9 r9Var = ((f9) b5Var2).x2.Z0;
                                        if (r9Var != null) {
                                            r9Var.B();
                                        }
                                    } else {
                                        b5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = b5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        b5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    eg.j jVar4 = jVar;
                                    b5 b5Var3 = b5Var;
                                    b5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = b5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        b5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    b5 b5Var4 = b5Var;
                                    b5Var4.D0(jVar, true);
                                    b5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = b5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        b5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    b5 b5Var5 = b5Var;
                                    b5Var5.D0(null, true);
                                    eg.j jVar5 = jVar;
                                    b5Var5.L0((eg.k1) jVar5, new eh.w(26, b5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = b5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        b5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    b5 b5Var6 = b5Var;
                                    b5Var6.D0(null, true);
                                    b5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = b5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        b5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    eg.j jVar6 = jVar;
                                    if (jVar6 instanceof eg.p3) {
                                        ((eg.p3) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.y2) {
                                        ((eg.y2) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar6;
                                        z2Var.o0 = !z2Var.o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar6).r(true);
                                    }
                                    b5 b5Var7 = b5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = b5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        b5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    b5 b5Var8 = b5Var;
                                    b5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = b5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        b5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    b5 b5Var9 = b5Var;
                                    w4 w4Var2 = b5Var9.O0;
                                    eg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = b5Var9.Q0(jVar7);
                                        if (jVar7 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(b5Var9.getContext(), (eg.p3) jVar7, Q0);
                                            p3Var.setDelegate(b5Var9);
                                            w4Var2.addView(p3Var);
                                            b5Var9.g0();
                                            jVar2 = p3Var;
                                        } else if (jVar7 instanceof eg.z3) {
                                            eg.z3 z3Var = new eg.z3(b5Var9.getContext(), (eg.z3) jVar7, Q0);
                                            z3Var.setDelegate(b5Var9);
                                            z3Var.setMaxWidth(b5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(z3Var, k7.c6.c(-2.0f, -2));
                                            b5Var9.g0();
                                            jVar2 = z3Var;
                                        }
                                        b5Var9.B0(jVar2);
                                        b5Var9.D0(null, true);
                                        b5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = b5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        b5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, k7.c6.n(-2, 44));
                } else if (!z10 && !z4 && !(jVar instanceof eg.z2) && !(jVar instanceof eg.k1) && !(jVar instanceof eg.a4) && !(jVar instanceof eg.g1) && !(jVar instanceof eg.y2)) {
                    TextView textView4 = new TextView(b5Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, q4Var));
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString("PaintDuplicate", R.string.PaintDuplicate));
                    final int i17 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: qh.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            eg.j jVar2;
                            switch (i17) {
                                case 0:
                                    eg.j jVar3 = jVar;
                                    boolean z102 = jVar3 instanceof eg.z2;
                                    b5 b5Var2 = b5Var;
                                    if (z102) {
                                        r9 r9Var = ((f9) b5Var2).x2.Z0;
                                        if (r9Var != null) {
                                            r9Var.B();
                                        }
                                    } else {
                                        b5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = b5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        b5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    eg.j jVar4 = jVar;
                                    b5 b5Var3 = b5Var;
                                    b5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = b5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        b5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    b5 b5Var4 = b5Var;
                                    b5Var4.D0(jVar, true);
                                    b5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = b5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        b5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    b5 b5Var5 = b5Var;
                                    b5Var5.D0(null, true);
                                    eg.j jVar5 = jVar;
                                    b5Var5.L0((eg.k1) jVar5, new eh.w(26, b5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = b5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        b5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    b5 b5Var6 = b5Var;
                                    b5Var6.D0(null, true);
                                    b5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = b5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        b5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    eg.j jVar6 = jVar;
                                    if (jVar6 instanceof eg.p3) {
                                        ((eg.p3) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.y2) {
                                        ((eg.y2) jVar6).r(true);
                                    } else if (jVar6 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar6;
                                        z2Var.o0 = !z2Var.o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar6).r(true);
                                    }
                                    b5 b5Var7 = b5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = b5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        b5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    b5 b5Var8 = b5Var;
                                    b5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = b5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        b5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    b5 b5Var9 = b5Var;
                                    w4 w4Var2 = b5Var9.O0;
                                    eg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = b5Var9.Q0(jVar7);
                                        if (jVar7 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(b5Var9.getContext(), (eg.p3) jVar7, Q0);
                                            p3Var.setDelegate(b5Var9);
                                            w4Var2.addView(p3Var);
                                            b5Var9.g0();
                                            jVar2 = p3Var;
                                        } else if (jVar7 instanceof eg.z3) {
                                            eg.z3 z3Var = new eg.z3(b5Var9.getContext(), (eg.z3) jVar7, Q0);
                                            z3Var.setDelegate(b5Var9);
                                            z3Var.setMaxWidth(b5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(z3Var, k7.c6.c(-2.0f, -2));
                                            b5Var9.g0();
                                            jVar2 = z3Var;
                                        }
                                        b5Var9.B0(jVar2);
                                        b5Var9.D0(null, true);
                                        b5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = b5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        b5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, k7.c6.n(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, q4Var);
                    int i19 = 8;
                    int i20 = i18 == 0 ? 8 : 0;
                    int i21 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    childAt.setBackground(org.telegram.ui.ActionBar.k6.a0(v02, i20, i21, i22, i19));
                    i18++;
                }
                b5Var.F1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
