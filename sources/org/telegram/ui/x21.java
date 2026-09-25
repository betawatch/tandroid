package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class x21 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ y21 d;

    public x21(y21 y21Var, Context context) {
        this.d = y21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 == 0) {
            return true;
        }
        y21 y21Var = this.d;
        return b10 == y21Var.c || b10 == y21Var.d || b10 == y21Var.e;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.h;
    }

    @Override // s4.h0
    public final int j(int i10) {
        y21 y21Var = this.d;
        if (i10 == y21Var.f) {
            return 0;
        }
        if (i10 == 0 || i10 == y21Var.c || i10 == y21Var.d || i10 == y21Var.e) {
            return i10 + 9;
        }
        return 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            e9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
            return;
        }
        if (i11 == 1) {
            return;
        }
        y21 y21Var = this.d;
        if (i11 == 4) {
            ((org.telegram.ui.Cells.w8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), y21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
            return;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 12:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
                if (i10 == 0) {
                    str = LocaleController.getString(R.string.QuickReplyDefault1);
                    str2 = "quick_reply_msg1";
                } else if (i10 == y21Var.c) {
                    str = LocaleController.getString(R.string.QuickReplyDefault2);
                    str2 = "quick_reply_msg2";
                } else if (i10 == y21Var.d) {
                    str = LocaleController.getString(R.string.QuickReplyDefault3);
                    str2 = "quick_reply_msg3";
                } else if (i10 == y21Var.e) {
                    str = LocaleController.getString(R.string.QuickReplyDefault4);
                    str2 = "quick_reply_msg4";
                } else {
                    str = null;
                    str2 = null;
                }
                String string = y21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                boolean z10 = i10 != y21Var.e;
                EditTextBoldCursor editTextBoldCursor = k3Var.a;
                editTextBoldCursor.setText(string);
                editTextBoldCursor.setHint(str);
                k3Var.b = z10;
                k3Var.setWillNotDraw(!z10);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.c;
        if (i10 == 0) {
            e9Var = new org.telegram.ui.Cells.e9(context);
        } else if (i10 != 1) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                case 12:
                    org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                    k3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    this.d.n[i10 - 9] = k3Var;
                    e9Var = k3Var;
                    break;
                default:
                    e9Var = new org.telegram.ui.Cells.w8(context);
                    e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    break;
            }
        } else {
            e9Var = new org.telegram.ui.Cells.ea(context);
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        }
        e9Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.gl0(e9Var);
    }
}
