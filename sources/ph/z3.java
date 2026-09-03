package ph;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;
    public final /* synthetic */ dg.j c;

    public /* synthetic */ z3(c5 c5Var, dg.j jVar, int i10) {
        this.a = i10;
        this.b = c5Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C0(this.c);
                break;
            default:
                final c5 c5Var = this.b;
                w4 w4Var = c5Var.O0;
                j4 j4Var = c5Var.L1;
                q4 q4Var = c5Var.D1;
                LinearLayout linearLayout = new LinearLayout(c5Var.getContext());
                linearLayout.setOrientation(0);
                final dg.j jVar = this.c;
                boolean z4 = jVar instanceof dg.a2;
                if (!z4) {
                    TextView textView = new TextView(c5Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, q4Var));
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
                    textView.setOnClickListener(new View.OnClickListener() { // from class: ph.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dg.j jVar2;
                            switch (i10) {
                                case 0:
                                    dg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof dg.b3;
                                    c5 c5Var2 = c5Var;
                                    if (z10) {
                                        t9 t9Var = ((h9) c5Var2).x2.Z0;
                                        if (t9Var != null) {
                                            t9Var.B();
                                        }
                                    } else {
                                        c5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = c5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        c5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    dg.j jVar4 = jVar;
                                    c5 c5Var3 = c5Var;
                                    c5Var3.getClass();
                                    try {
                                        ((dg.b4) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = c5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        c5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    c5 c5Var4 = c5Var;
                                    c5Var4.D0(jVar, true);
                                    c5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = c5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        c5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    c5 c5Var5 = c5Var;
                                    c5Var5.D0(null, true);
                                    dg.j jVar5 = jVar;
                                    c5Var5.L0((dg.m1) jVar5, new dh.v(25, c5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = c5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        c5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    c5 c5Var6 = c5Var;
                                    c5Var6.D0(null, true);
                                    c5Var6.K0((dg.i1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = c5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        c5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    dg.j jVar6 = jVar;
                                    if (jVar6 instanceof dg.r3) {
                                        ((dg.r3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.a3) {
                                        ((dg.a3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.b3) {
                                        dg.b3 b3Var = (dg.b3) jVar6;
                                        b3Var.o0 = !b3Var.o0;
                                        b3Var.invalidate();
                                    } else {
                                        ((dg.v2) jVar6).r(true);
                                    }
                                    c5 c5Var7 = c5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = c5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        c5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    c5 c5Var8 = c5Var;
                                    c5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = c5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        c5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    c5 c5Var9 = c5Var;
                                    w4 w4Var2 = c5Var9.O0;
                                    dg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = c5Var9.Q0(jVar7);
                                        if (jVar7 instanceof dg.r3) {
                                            dg.j r3Var = new dg.r3(c5Var9.getContext(), (dg.r3) jVar7, Q0);
                                            r3Var.setDelegate(c5Var9);
                                            w4Var2.addView(r3Var);
                                            c5Var9.g0();
                                            jVar2 = r3Var;
                                        } else if (jVar7 instanceof dg.b4) {
                                            dg.b4 b4Var = new dg.b4(c5Var9.getContext(), (dg.b4) jVar7, Q0);
                                            b4Var.setDelegate(c5Var9);
                                            b4Var.setMaxWidth(c5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(b4Var, k7.b6.c(-2.0f, -2));
                                            c5Var9.g0();
                                            jVar2 = b4Var;
                                        }
                                        c5Var9.B0(jVar2);
                                        c5Var9.D0(null, true);
                                        c5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = c5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        c5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, k7.b6.n(-2, 44));
                }
                if (jVar instanceof dg.b4) {
                    TextView textView2 = new TextView(c5Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, q4Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!j4Var.c() || j4Var.d) && c5Var.q2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        final int i11 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: ph.c4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                dg.j jVar2;
                                switch (i11) {
                                    case 0:
                                        dg.j jVar3 = jVar;
                                        boolean z10 = jVar3 instanceof dg.b3;
                                        c5 c5Var2 = c5Var;
                                        if (z10) {
                                            t9 t9Var = ((h9) c5Var2).x2.Z0;
                                            if (t9Var != null) {
                                                t9Var.B();
                                            }
                                        } else {
                                            c5Var2.C0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = c5Var2.E1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            c5Var2.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        dg.j jVar4 = jVar;
                                        c5 c5Var3 = c5Var;
                                        c5Var3.getClass();
                                        try {
                                            ((dg.b4) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = c5Var3.E1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            c5Var3.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        c5 c5Var4 = c5Var;
                                        c5Var4.D0(jVar, true);
                                        c5Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = c5Var4.E1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            c5Var4.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        c5 c5Var5 = c5Var;
                                        c5Var5.D0(null, true);
                                        dg.j jVar5 = jVar;
                                        c5Var5.L0((dg.m1) jVar5, new dh.v(25, c5Var5, jVar5));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = c5Var5.E1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            c5Var5.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        c5 c5Var6 = c5Var;
                                        c5Var6.D0(null, true);
                                        c5Var6.K0((dg.i1) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = c5Var6.E1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            c5Var6.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        dg.j jVar6 = jVar;
                                        if (jVar6 instanceof dg.r3) {
                                            ((dg.r3) jVar6).r(true);
                                        } else if (jVar6 instanceof dg.a3) {
                                            ((dg.a3) jVar6).r(true);
                                        } else if (jVar6 instanceof dg.b3) {
                                            dg.b3 b3Var = (dg.b3) jVar6;
                                            b3Var.o0 = !b3Var.o0;
                                            b3Var.invalidate();
                                        } else {
                                            ((dg.v2) jVar6).r(true);
                                        }
                                        c5 c5Var7 = c5Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = c5Var7.E1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            c5Var7.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        c5 c5Var8 = c5Var;
                                        c5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = c5Var8.E1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            c5Var8.E1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        c5 c5Var9 = c5Var;
                                        w4 w4Var2 = c5Var9.O0;
                                        dg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF Q0 = c5Var9.Q0(jVar7);
                                            if (jVar7 instanceof dg.r3) {
                                                dg.j r3Var = new dg.r3(c5Var9.getContext(), (dg.r3) jVar7, Q0);
                                                r3Var.setDelegate(c5Var9);
                                                w4Var2.addView(r3Var);
                                                c5Var9.g0();
                                                jVar2 = r3Var;
                                            } else if (jVar7 instanceof dg.b4) {
                                                dg.b4 b4Var = new dg.b4(c5Var9.getContext(), (dg.b4) jVar7, Q0);
                                                b4Var.setDelegate(c5Var9);
                                                b4Var.setMaxWidth(c5Var9.O1 - AndroidUtilities.dp(32.0f));
                                                w4Var2.addView(b4Var, k7.b6.c(-2.0f, -2));
                                                c5Var9.g0();
                                                jVar2 = b4Var;
                                            }
                                            c5Var9.B0(jVar2);
                                            c5Var9.D0(null, true);
                                            c5Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = c5Var9.E1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            c5Var9.E1.d(true);
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
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: ph.c4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                dg.j jVar2;
                                switch (i12) {
                                    case 0:
                                        dg.j jVar3 = jVar;
                                        boolean z10 = jVar3 instanceof dg.b3;
                                        c5 c5Var2 = c5Var;
                                        if (z10) {
                                            t9 t9Var = ((h9) c5Var2).x2.Z0;
                                            if (t9Var != null) {
                                                t9Var.B();
                                            }
                                        } else {
                                            c5Var2.C0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = c5Var2.E1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            c5Var2.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        dg.j jVar4 = jVar;
                                        c5 c5Var3 = c5Var;
                                        c5Var3.getClass();
                                        try {
                                            ((dg.b4) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = c5Var3.E1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            c5Var3.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        c5 c5Var4 = c5Var;
                                        c5Var4.D0(jVar, true);
                                        c5Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = c5Var4.E1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            c5Var4.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        c5 c5Var5 = c5Var;
                                        c5Var5.D0(null, true);
                                        dg.j jVar5 = jVar;
                                        c5Var5.L0((dg.m1) jVar5, new dh.v(25, c5Var5, jVar5));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = c5Var5.E1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            c5Var5.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        c5 c5Var6 = c5Var;
                                        c5Var6.D0(null, true);
                                        c5Var6.K0((dg.i1) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = c5Var6.E1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            c5Var6.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        dg.j jVar6 = jVar;
                                        if (jVar6 instanceof dg.r3) {
                                            ((dg.r3) jVar6).r(true);
                                        } else if (jVar6 instanceof dg.a3) {
                                            ((dg.a3) jVar6).r(true);
                                        } else if (jVar6 instanceof dg.b3) {
                                            dg.b3 b3Var = (dg.b3) jVar6;
                                            b3Var.o0 = !b3Var.o0;
                                            b3Var.invalidate();
                                        } else {
                                            ((dg.v2) jVar6).r(true);
                                        }
                                        c5 c5Var7 = c5Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = c5Var7.E1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            c5Var7.E1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        c5 c5Var8 = c5Var;
                                        c5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = c5Var8.E1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            c5Var8.E1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        c5 c5Var9 = c5Var;
                                        w4 w4Var2 = c5Var9.O0;
                                        dg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF Q0 = c5Var9.Q0(jVar7);
                                            if (jVar7 instanceof dg.r3) {
                                                dg.j r3Var = new dg.r3(c5Var9.getContext(), (dg.r3) jVar7, Q0);
                                                r3Var.setDelegate(c5Var9);
                                                w4Var2.addView(r3Var);
                                                c5Var9.g0();
                                                jVar2 = r3Var;
                                            } else if (jVar7 instanceof dg.b4) {
                                                dg.b4 b4Var = new dg.b4(c5Var9.getContext(), (dg.b4) jVar7, Q0);
                                                b4Var.setDelegate(c5Var9);
                                                b4Var.setMaxWidth(c5Var9.O1 - AndroidUtilities.dp(32.0f));
                                                w4Var2.addView(b4Var, k7.b6.c(-2.0f, -2));
                                                c5Var9.g0();
                                                jVar2 = b4Var;
                                            }
                                            c5Var9.B0(jVar2);
                                            c5Var9.D0(null, true);
                                            c5Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = c5Var9.E1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            c5Var9.E1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, k7.b6.n(-2, 44));
                } else if (jVar instanceof dg.m1) {
                    TextView h02 = c5Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i13 = 3;
                    h02.setOnClickListener(new View.OnClickListener() { // from class: ph.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dg.j jVar2;
                            switch (i13) {
                                case 0:
                                    dg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof dg.b3;
                                    c5 c5Var2 = c5Var;
                                    if (z10) {
                                        t9 t9Var = ((h9) c5Var2).x2.Z0;
                                        if (t9Var != null) {
                                            t9Var.B();
                                        }
                                    } else {
                                        c5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = c5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        c5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    dg.j jVar4 = jVar;
                                    c5 c5Var3 = c5Var;
                                    c5Var3.getClass();
                                    try {
                                        ((dg.b4) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = c5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        c5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    c5 c5Var4 = c5Var;
                                    c5Var4.D0(jVar, true);
                                    c5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = c5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        c5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    c5 c5Var5 = c5Var;
                                    c5Var5.D0(null, true);
                                    dg.j jVar5 = jVar;
                                    c5Var5.L0((dg.m1) jVar5, new dh.v(25, c5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = c5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        c5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    c5 c5Var6 = c5Var;
                                    c5Var6.D0(null, true);
                                    c5Var6.K0((dg.i1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = c5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        c5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    dg.j jVar6 = jVar;
                                    if (jVar6 instanceof dg.r3) {
                                        ((dg.r3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.a3) {
                                        ((dg.a3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.b3) {
                                        dg.b3 b3Var = (dg.b3) jVar6;
                                        b3Var.o0 = !b3Var.o0;
                                        b3Var.invalidate();
                                    } else {
                                        ((dg.v2) jVar6).r(true);
                                    }
                                    c5 c5Var7 = c5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = c5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        c5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    c5 c5Var8 = c5Var;
                                    c5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = c5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        c5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    c5 c5Var9 = c5Var;
                                    w4 w4Var2 = c5Var9.O0;
                                    dg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = c5Var9.Q0(jVar7);
                                        if (jVar7 instanceof dg.r3) {
                                            dg.j r3Var = new dg.r3(c5Var9.getContext(), (dg.r3) jVar7, Q0);
                                            r3Var.setDelegate(c5Var9);
                                            w4Var2.addView(r3Var);
                                            c5Var9.g0();
                                            jVar2 = r3Var;
                                        } else if (jVar7 instanceof dg.b4) {
                                            dg.b4 b4Var = new dg.b4(c5Var9.getContext(), (dg.b4) jVar7, Q0);
                                            b4Var.setDelegate(c5Var9);
                                            b4Var.setMaxWidth(c5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(b4Var, k7.b6.c(-2.0f, -2));
                                            c5Var9.g0();
                                            jVar2 = b4Var;
                                        }
                                        c5Var9.B0(jVar2);
                                        c5Var9.D0(null, true);
                                        c5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = c5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        c5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h02, k7.b6.n(-2, 44));
                } else if (jVar instanceof dg.i1) {
                    TextView h03 = c5Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i14 = 4;
                    h03.setOnClickListener(new View.OnClickListener() { // from class: ph.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dg.j jVar2;
                            switch (i14) {
                                case 0:
                                    dg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof dg.b3;
                                    c5 c5Var2 = c5Var;
                                    if (z10) {
                                        t9 t9Var = ((h9) c5Var2).x2.Z0;
                                        if (t9Var != null) {
                                            t9Var.B();
                                        }
                                    } else {
                                        c5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = c5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        c5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    dg.j jVar4 = jVar;
                                    c5 c5Var3 = c5Var;
                                    c5Var3.getClass();
                                    try {
                                        ((dg.b4) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = c5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        c5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    c5 c5Var4 = c5Var;
                                    c5Var4.D0(jVar, true);
                                    c5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = c5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        c5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    c5 c5Var5 = c5Var;
                                    c5Var5.D0(null, true);
                                    dg.j jVar5 = jVar;
                                    c5Var5.L0((dg.m1) jVar5, new dh.v(25, c5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = c5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        c5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    c5 c5Var6 = c5Var;
                                    c5Var6.D0(null, true);
                                    c5Var6.K0((dg.i1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = c5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        c5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    dg.j jVar6 = jVar;
                                    if (jVar6 instanceof dg.r3) {
                                        ((dg.r3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.a3) {
                                        ((dg.a3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.b3) {
                                        dg.b3 b3Var = (dg.b3) jVar6;
                                        b3Var.o0 = !b3Var.o0;
                                        b3Var.invalidate();
                                    } else {
                                        ((dg.v2) jVar6).r(true);
                                    }
                                    c5 c5Var7 = c5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = c5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        c5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    c5 c5Var8 = c5Var;
                                    c5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = c5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        c5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    c5 c5Var9 = c5Var;
                                    w4 w4Var2 = c5Var9.O0;
                                    dg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = c5Var9.Q0(jVar7);
                                        if (jVar7 instanceof dg.r3) {
                                            dg.j r3Var = new dg.r3(c5Var9.getContext(), (dg.r3) jVar7, Q0);
                                            r3Var.setDelegate(c5Var9);
                                            w4Var2.addView(r3Var);
                                            c5Var9.g0();
                                            jVar2 = r3Var;
                                        } else if (jVar7 instanceof dg.b4) {
                                            dg.b4 b4Var = new dg.b4(c5Var9.getContext(), (dg.b4) jVar7, Q0);
                                            b4Var.setDelegate(c5Var9);
                                            b4Var.setMaxWidth(c5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(b4Var, k7.b6.c(-2.0f, -2));
                                            c5Var9.g0();
                                            jVar2 = b4Var;
                                        }
                                        c5Var9.B0(jVar2);
                                        c5Var9.D0(null, true);
                                        c5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = c5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        c5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h03, k7.b6.n(-2, 44));
                }
                if ((jVar instanceof dg.r3) || (jVar instanceof dg.b3) || (jVar instanceof dg.v2) || (jVar instanceof dg.a3)) {
                    TextView h04 = c5Var.h0(4, LocaleController.getString(R.string.Flip));
                    final int i15 = 5;
                    h04.setOnClickListener(new View.OnClickListener() { // from class: ph.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dg.j jVar2;
                            switch (i15) {
                                case 0:
                                    dg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof dg.b3;
                                    c5 c5Var2 = c5Var;
                                    if (z10) {
                                        t9 t9Var = ((h9) c5Var2).x2.Z0;
                                        if (t9Var != null) {
                                            t9Var.B();
                                        }
                                    } else {
                                        c5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = c5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        c5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    dg.j jVar4 = jVar;
                                    c5 c5Var3 = c5Var;
                                    c5Var3.getClass();
                                    try {
                                        ((dg.b4) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = c5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        c5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    c5 c5Var4 = c5Var;
                                    c5Var4.D0(jVar, true);
                                    c5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = c5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        c5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    c5 c5Var5 = c5Var;
                                    c5Var5.D0(null, true);
                                    dg.j jVar5 = jVar;
                                    c5Var5.L0((dg.m1) jVar5, new dh.v(25, c5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = c5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        c5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    c5 c5Var6 = c5Var;
                                    c5Var6.D0(null, true);
                                    c5Var6.K0((dg.i1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = c5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        c5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    dg.j jVar6 = jVar;
                                    if (jVar6 instanceof dg.r3) {
                                        ((dg.r3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.a3) {
                                        ((dg.a3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.b3) {
                                        dg.b3 b3Var = (dg.b3) jVar6;
                                        b3Var.o0 = !b3Var.o0;
                                        b3Var.invalidate();
                                    } else {
                                        ((dg.v2) jVar6).r(true);
                                    }
                                    c5 c5Var7 = c5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = c5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        c5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    c5 c5Var8 = c5Var;
                                    c5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = c5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        c5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    c5 c5Var9 = c5Var;
                                    w4 w4Var2 = c5Var9.O0;
                                    dg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = c5Var9.Q0(jVar7);
                                        if (jVar7 instanceof dg.r3) {
                                            dg.j r3Var = new dg.r3(c5Var9.getContext(), (dg.r3) jVar7, Q0);
                                            r3Var.setDelegate(c5Var9);
                                            w4Var2.addView(r3Var);
                                            c5Var9.g0();
                                            jVar2 = r3Var;
                                        } else if (jVar7 instanceof dg.b4) {
                                            dg.b4 b4Var = new dg.b4(c5Var9.getContext(), (dg.b4) jVar7, Q0);
                                            b4Var.setDelegate(c5Var9);
                                            b4Var.setMaxWidth(c5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(b4Var, k7.b6.c(-2.0f, -2));
                                            c5Var9.g0();
                                            jVar2 = b4Var;
                                        }
                                        c5Var9.B0(jVar2);
                                        c5Var9.D0(null, true);
                                        c5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = c5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        c5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h04, k7.b6.n(-2, 44));
                }
                boolean z10 = jVar instanceof dg.v2;
                if (w4Var.indexOfChild(jVar) != w4Var.getChildCount() - 1 && !(jVar instanceof dg.a3)) {
                    TextView textView3 = new TextView(c5Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, q4Var));
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
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: ph.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dg.j jVar2;
                            switch (i16) {
                                case 0:
                                    dg.j jVar3 = jVar;
                                    boolean z102 = jVar3 instanceof dg.b3;
                                    c5 c5Var2 = c5Var;
                                    if (z102) {
                                        t9 t9Var = ((h9) c5Var2).x2.Z0;
                                        if (t9Var != null) {
                                            t9Var.B();
                                        }
                                    } else {
                                        c5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = c5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        c5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    dg.j jVar4 = jVar;
                                    c5 c5Var3 = c5Var;
                                    c5Var3.getClass();
                                    try {
                                        ((dg.b4) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = c5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        c5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    c5 c5Var4 = c5Var;
                                    c5Var4.D0(jVar, true);
                                    c5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = c5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        c5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    c5 c5Var5 = c5Var;
                                    c5Var5.D0(null, true);
                                    dg.j jVar5 = jVar;
                                    c5Var5.L0((dg.m1) jVar5, new dh.v(25, c5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = c5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        c5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    c5 c5Var6 = c5Var;
                                    c5Var6.D0(null, true);
                                    c5Var6.K0((dg.i1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = c5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        c5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    dg.j jVar6 = jVar;
                                    if (jVar6 instanceof dg.r3) {
                                        ((dg.r3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.a3) {
                                        ((dg.a3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.b3) {
                                        dg.b3 b3Var = (dg.b3) jVar6;
                                        b3Var.o0 = !b3Var.o0;
                                        b3Var.invalidate();
                                    } else {
                                        ((dg.v2) jVar6).r(true);
                                    }
                                    c5 c5Var7 = c5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = c5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        c5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    c5 c5Var8 = c5Var;
                                    c5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = c5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        c5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    c5 c5Var9 = c5Var;
                                    w4 w4Var2 = c5Var9.O0;
                                    dg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = c5Var9.Q0(jVar7);
                                        if (jVar7 instanceof dg.r3) {
                                            dg.j r3Var = new dg.r3(c5Var9.getContext(), (dg.r3) jVar7, Q0);
                                            r3Var.setDelegate(c5Var9);
                                            w4Var2.addView(r3Var);
                                            c5Var9.g0();
                                            jVar2 = r3Var;
                                        } else if (jVar7 instanceof dg.b4) {
                                            dg.b4 b4Var = new dg.b4(c5Var9.getContext(), (dg.b4) jVar7, Q0);
                                            b4Var.setDelegate(c5Var9);
                                            b4Var.setMaxWidth(c5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(b4Var, k7.b6.c(-2.0f, -2));
                                            c5Var9.g0();
                                            jVar2 = b4Var;
                                        }
                                        c5Var9.B0(jVar2);
                                        c5Var9.D0(null, true);
                                        c5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = c5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        c5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, k7.b6.n(-2, 44));
                } else if (!z10 && !z4 && !(jVar instanceof dg.b3) && !(jVar instanceof dg.m1) && !(jVar instanceof dg.c4) && !(jVar instanceof dg.i1) && !(jVar instanceof dg.a3)) {
                    TextView textView4 = new TextView(c5Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, q4Var));
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
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: ph.c4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dg.j jVar2;
                            switch (i17) {
                                case 0:
                                    dg.j jVar3 = jVar;
                                    boolean z102 = jVar3 instanceof dg.b3;
                                    c5 c5Var2 = c5Var;
                                    if (z102) {
                                        t9 t9Var = ((h9) c5Var2).x2.Z0;
                                        if (t9Var != null) {
                                            t9Var.B();
                                        }
                                    } else {
                                        c5Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = c5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        c5Var2.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    dg.j jVar4 = jVar;
                                    c5 c5Var3 = c5Var;
                                    c5Var3.getClass();
                                    try {
                                        ((dg.b4) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = c5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        c5Var3.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    c5 c5Var4 = c5Var;
                                    c5Var4.D0(jVar, true);
                                    c5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = c5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        c5Var4.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    c5 c5Var5 = c5Var;
                                    c5Var5.D0(null, true);
                                    dg.j jVar5 = jVar;
                                    c5Var5.L0((dg.m1) jVar5, new dh.v(25, c5Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = c5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        c5Var5.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    c5 c5Var6 = c5Var;
                                    c5Var6.D0(null, true);
                                    c5Var6.K0((dg.i1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = c5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        c5Var6.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    dg.j jVar6 = jVar;
                                    if (jVar6 instanceof dg.r3) {
                                        ((dg.r3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.a3) {
                                        ((dg.a3) jVar6).r(true);
                                    } else if (jVar6 instanceof dg.b3) {
                                        dg.b3 b3Var = (dg.b3) jVar6;
                                        b3Var.o0 = !b3Var.o0;
                                        b3Var.invalidate();
                                    } else {
                                        ((dg.v2) jVar6).r(true);
                                    }
                                    c5 c5Var7 = c5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = c5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        c5Var7.E1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    c5 c5Var8 = c5Var;
                                    c5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = c5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        c5Var8.E1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    c5 c5Var9 = c5Var;
                                    w4 w4Var2 = c5Var9.O0;
                                    dg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = c5Var9.Q0(jVar7);
                                        if (jVar7 instanceof dg.r3) {
                                            dg.j r3Var = new dg.r3(c5Var9.getContext(), (dg.r3) jVar7, Q0);
                                            r3Var.setDelegate(c5Var9);
                                            w4Var2.addView(r3Var);
                                            c5Var9.g0();
                                            jVar2 = r3Var;
                                        } else if (jVar7 instanceof dg.b4) {
                                            dg.b4 b4Var = new dg.b4(c5Var9.getContext(), (dg.b4) jVar7, Q0);
                                            b4Var.setDelegate(c5Var9);
                                            b4Var.setMaxWidth(c5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            w4Var2.addView(b4Var, k7.b6.c(-2.0f, -2));
                                            c5Var9.g0();
                                            jVar2 = b4Var;
                                        }
                                        c5Var9.B0(jVar2);
                                        c5Var9.D0(null, true);
                                        c5Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = c5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        c5Var9.E1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, k7.b6.n(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, q4Var);
                    int i19 = 8;
                    int i20 = i18 == 0 ? 8 : 0;
                    int i21 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    childAt.setBackground(org.telegram.ui.ActionBar.j6.a0(v02, i20, i21, i22, i19));
                    i18++;
                }
                c5Var.F1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
