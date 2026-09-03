package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qg0 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ rg0 d;

    public qg0(rg0 rg0Var, Context context) {
        this.d = rg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        rg0 rg0Var = this.d;
        return b10 == rg0Var.c || b10 == rg0Var.d || b10 == rg0Var.e || b10 == rg0Var.f || b10 == rg0Var.h || b10 == rg0Var.r;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.v;
    }

    @Override // f2.o0
    public final int j(int i10) {
        rg0 rg0Var = this.d;
        rg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == rg0Var.c || i10 == rg0Var.d || i10 == rg0Var.e || i10 == rg0Var.f || i10 == rg0Var.h) {
            return 1;
        }
        if (i10 == rg0Var.n) {
            return 2;
        }
        return i10 == rg0Var.r ? 3 : 4;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        rg0 rg0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
                if (i10 == rg0Var.r) {
                    z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                    z9Var.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i10 == rg0Var.s) {
                z8Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        if (i10 == rg0Var.c) {
            y8Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == rg0Var.d) {
            y8Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == rg0Var.e) {
            y8Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == rg0Var.f) {
            y8Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == rg0Var.h) {
            y8Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
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
                    view = new org.telegram.ui.Cells.y6(context, (b) null);
                } else if (i10 != 3) {
                    view = new org.telegram.ui.Cells.z8(context);
                    view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                } else {
                    FrameLayout z9Var = new org.telegram.ui.Cells.z9(context);
                    z9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    frameLayout = z9Var;
                }
                return ai.n(view, view, -1, -2);
            }
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setMultilineDetail(true);
            y8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = y8Var;
        }
        view = frameLayout;
        return ai.n(view, view, -1, -2);
    }
}
