package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zg0 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ ah0 d;

    public zg0(ah0 ah0Var, Context context) {
        this.d = ah0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ah0 ah0Var = this.d;
        return b10 == ah0Var.c || b10 == ah0Var.d || b10 == ah0Var.e || b10 == ah0Var.f || b10 == ah0Var.h || b10 == ah0Var.r;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.v;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ah0 ah0Var = this.d;
        ah0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == ah0Var.c || i10 == ah0Var.d || i10 == ah0Var.e || i10 == ah0Var.f || i10 == ah0Var.h) {
            return 1;
        }
        if (i10 == ah0Var.n) {
            return 2;
        }
        return i10 == ah0Var.r ? 3 : 4;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        ah0 ah0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                if (i10 == ah0Var.r) {
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    eaVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == ah0Var.s) {
                e9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        if (i10 == ah0Var.c) {
            d9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == ah0Var.d) {
            d9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == ah0Var.e) {
            d9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == ah0Var.f) {
            d9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == ah0Var.h) {
            d9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        View view;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = l4Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                } else if (i10 != 3) {
                    view = new org.telegram.ui.Cells.e9(context);
                    view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                } else {
                    FrameLayout eaVar = new org.telegram.ui.Cells.ea(context);
                    eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    frameLayout = eaVar;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            }
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setMultilineDetail(true);
            d9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = d9Var;
        }
        view = frameLayout;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
