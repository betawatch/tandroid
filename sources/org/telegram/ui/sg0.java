package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sg0 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ tg0 d;

    public sg0(tg0 tg0Var, Context context) {
        this.d = tg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        tg0 tg0Var = this.d;
        return b10 == tg0Var.c || b10 == tg0Var.d || b10 == tg0Var.e || b10 == tg0Var.f || b10 == tg0Var.h || b10 == tg0Var.r;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.v;
    }

    @Override // s4.h0
    public final int j(int i10) {
        tg0 tg0Var = this.d;
        tg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == tg0Var.c || i10 == tg0Var.d || i10 == tg0Var.e || i10 == tg0Var.f || i10 == tg0Var.h) {
            return 1;
        }
        if (i10 == tg0Var.n) {
            return 2;
        }
        return i10 == tg0Var.r ? 3 : 4;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        tg0 tg0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                if (i10 == tg0Var.r) {
                    faVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false));
                    faVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == tg0Var.s) {
                f9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        if (i10 == tg0Var.c) {
            e9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == tg0Var.d) {
            e9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == tg0Var.e) {
            e9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == tg0Var.f) {
            e9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == tg0Var.h) {
            e9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        View view;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = m4Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                } else if (i10 != 3) {
                    view = new org.telegram.ui.Cells.f9(context);
                    view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
                } else {
                    FrameLayout faVar = new org.telegram.ui.Cells.fa(context);
                    faVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    frameLayout = faVar;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            }
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setMultilineDetail(true);
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = e9Var;
        }
        view = frameLayout;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
