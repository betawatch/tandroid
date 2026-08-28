package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.qd;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.uz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uz0 extends org.telegram.ui.Cells.y6 {
    public final /* synthetic */ vz0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz0(vz0 vz0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = vz0Var;
        this.f = UserConfig.selectedAccount;
        final int i9 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        j3.r0.u(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, b6Var));
        addView(textView, g7.e6.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context, b6Var);
        this.b = l80Var;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var));
        l80Var.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.K6, b6Var));
        l80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        l80Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(l80Var, g7.e6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i10 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, g7.e6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i11 = 0;
        while (i11 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.f6.Oh));
            g7.g6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.Sh, b6Var, textView2, 1, 14.0f);
            linearLayout.addView(textView2, g7.e6.m(0.5f, 0, 44, i11 == 0 ? 0 : 4, i11 == 0 ? 4 : 0, 0));
            if (i11 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.x6
                    public final /* synthetic */ uz0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                uz0 uz0Var = this.b;
                                AndroidUtilities.runOnUIThread(new qd(uz0Var, uz0Var.e, 23));
                                break;
                            default:
                                uz0 uz0Var2 = this.b;
                                int i12 = uz0Var2.e;
                                ProfileActivity profileActivity = uz0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new ag1(8, null));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.x6
                    public final /* synthetic */ uz0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                uz0 uz0Var = this.b;
                                AndroidUtilities.runOnUIThread(new qd(uz0Var, uz0Var.e, 23));
                                break;
                            default:
                                uz0 uz0Var2 = this.b;
                                int i12 = uz0Var2.e;
                                ProfileActivity profileActivity = uz0Var2.h.e;
                                if (i12 != 0) {
                                    profileActivity.presentFragment(new ag1(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    break;
                                }
                        }
                    }
                });
            }
            i11++;
        }
    }
}
