package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.kd;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r01;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class r01 extends org.telegram.ui.Cells.z6 {
    public final /* synthetic */ s01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r01(s01 s01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = s01Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        addView(textView, w7.x5.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, d6Var);
        this.b = d90Var;
        d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        d90Var.setHighlightColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.K6, d6Var));
        d90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        d90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(d90Var, w7.x5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
            w7.z5.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.q3.p(org.telegram.ui.ActionBar.h6.Sh, d6Var, textView2, 1, 14.0f);
            linearLayout.addView(textView2, w7.x5.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y6
                    public final /* synthetic */ r01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                r01 r01Var = this.b;
                                AndroidUtilities.runOnUIThread(new kd(r01Var, r01Var.e, 24));
                                break;
                            default:
                                r01 r01Var2 = this.b;
                                int i13 = r01Var2.e;
                                ProfileActivity profileActivity = r01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new zg1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    break;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y6
                    public final /* synthetic */ r01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                r01 r01Var = this.b;
                                AndroidUtilities.runOnUIThread(new kd(r01Var, r01Var.e, 24));
                                break;
                            default:
                                r01 r01Var2 = this.b;
                                int i13 = r01Var2.e;
                                ProfileActivity profileActivity = r01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new zg1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
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
