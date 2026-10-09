package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.nd;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ih1;
import org.telegram.ui.x01;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x01 extends org.telegram.ui.Cells.a7 {
    public final /* synthetic */ y01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x01(y01 y01Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = y01Var;
        this.f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.L6, e6Var));
        addView(textView, w7.x5.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(context, e6Var);
        this.b = ea0Var;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.J6, e6Var));
        ea0Var.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.K6, e6Var));
        ea0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        ea0Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(ea0Var, w7.x5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.Oh));
            w7.z5.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.Sh, e6Var, textView2, 1, 14.0f);
            linearLayout.addView(textView2, w7.x5.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z6
                    public final /* synthetic */ x01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                x01 x01Var = this.b;
                                AndroidUtilities.runOnUIThread(new nd(x01Var, x01Var.e, 24));
                                break;
                            default:
                                x01 x01Var2 = this.b;
                                int i13 = x01Var2.e;
                                ProfileActivity profileActivity = x01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new ih1(8, null));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z6
                    public final /* synthetic */ x01 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                x01 x01Var = this.b;
                                AndroidUtilities.runOnUIThread(new nd(x01Var, x01Var.e, 24));
                                break;
                            default:
                                x01 x01Var2 = this.b;
                                int i13 = x01Var2.e;
                                ProfileActivity profileActivity = x01Var2.h.e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new ih1(8, null));
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
