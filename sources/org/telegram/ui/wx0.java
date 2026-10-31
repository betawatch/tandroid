package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.qq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tc1;
import org.telegram.ui.wx0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wx0 extends org.telegram.ui.Cells.b7 {
    public final /* synthetic */ xx0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx0(xx0 xx0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = xx0Var;
        this.f = org.telegram.messenger.d20.s0;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        sc.e.t(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.L6, p6Var);
        addView(textView, w7.b6.t(-1, -2, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, p6Var);
        this.b = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, p6Var);
        org.telegram.ui.ActionBar.a7.D(p80Var, org.telegram.ui.ActionBar.t6.K6, p6Var);
        final int i11 = 0;
        p80Var.setMovementMethod(new org.telegram.messenger.e0(false));
        p80Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        addView(p80Var, w7.b6.t(-2, -2, org.telegram.messenger.cd.X ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 8.0f));
            w7.e6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.Gi, p6Var, 1, 14.0f);
            linearLayout.addView(textView2, w7.b6.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a7
                    public final /* synthetic */ wx0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                wx0 wx0Var = this.b;
                                org.telegram.messenger.i0.g3(new qq(wx0Var, wx0Var.e, 19));
                                break;
                            default:
                                wx0 wx0Var2 = this.b;
                                int i13 = wx0Var2.e;
                                ProfileActivity profileActivity = wx0Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new tc1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.f(3));
                                    break;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a7
                    public final /* synthetic */ wx0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                wx0 wx0Var = this.b;
                                org.telegram.messenger.i0.g3(new qq(wx0Var, wx0Var.e, 19));
                                break;
                            default:
                                wx0 wx0Var2 = this.b;
                                int i13 = wx0Var2.e;
                                ProfileActivity profileActivity = wx0Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new tc1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.f(3));
                                    break;
                                }
                        }
                    }
                });
            }
            i12++;
        }
    }
}
